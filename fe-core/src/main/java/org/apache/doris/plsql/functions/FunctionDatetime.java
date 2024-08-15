// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
// This file is copied from
// https://github.com/apache/hive/blob/master/hplsql/src/main/java/org/apache/hive/hplsql/functions/FunctionDatetime.java
// and modified by Doris

package org.apache.doris.plsql.functions;

import org.apache.doris.nereids.PLParser.Expr_func_paramsContext;
import org.apache.doris.nereids.PLParser.Expr_spec_funcContext;
import org.apache.doris.nereids.util.DateUtils;
import org.apache.doris.plsql.Exec;
import org.apache.doris.plsql.Var;
import org.apache.doris.plsql.Var.Type;
import org.apache.doris.plsql.executor.QueryExecutor;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FunctionDatetime extends BuiltinFunctions {
    public FunctionDatetime(Exec e, QueryExecutor queryExecutor) {
        super(e, queryExecutor);
    }

    /**
     * Register functions
     */
    @Override
    public void register(BuiltinFunctions f) {
        f.map.put("DATE", this::date);
        f.map.put("FROM_UNIXTIME", this::fromUnixtime);
        f.map.put("NOW", ctx -> now(ctx));
        f.map.put("TIMESTAMP_ISO", this::timestampIso);
        f.map.put("TO_TIMESTAMP", this::toTimestamp);
        f.map.put("UNIX_TIMESTAMP", this::unixTimestamp);
        f.map.put("CURRENT_TIME_MILLIS", this::currentTimeMillis);
        f.map.put("TO_DATE", this::toDate);
        f.map.put("LAST_DAY", this::lastDay);
        f.map.put("STR_TO_DATE", this::strToDate);
        f.map.put("DATE_ADD", this::dateAdd);
        f.map.put("ADD_MONTHS", this::addMonths);
        f.map.put("TRUNC", this::trunc);
        f.map.put("date_sub", this::dateSub);

        f.specMap.put("CURRENT_DATE", this::currentDate);
        f.specMap.put("CURRENT_TIMESTAMP", this::currentTimestamp);
        f.specMap.put("SYSDATE", this::currentTimestamp);
        f.specMap.put("CURDATE", this::currentDate);

        f.specSqlMap.put("CURRENT_DATE", (org.apache.doris.plsql.functions.FuncSpecCommand) this::currentDateSql);
        f.specSqlMap.put("CURRENT_TIMESTAMP",
                         (org.apache.doris.plsql.functions.FuncSpecCommand) this::currentTimestampSql);
    }

    /**
     * CURRENT_DATE
     */
    public void currentDate(Expr_spec_funcContext ctx) {
        evalVar(currentDate());
    }

    public static Var currentDate() {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String s = f.format(Calendar.getInstance().getTime());
        return new Var(Type.DATE, org.apache.doris.plsql.Utils.toDate(s));
    }

    /**
     * CURRENT_DATE in executable SQL statement
     */
    public void currentDateSql(Expr_spec_funcContext ctx) {
        if (exec.getConnectionType() == org.apache.doris.plsql.Conn.Type.HIVE) {
            evalString("TO_DATE(FROM_UNIXTIME(UNIX_TIMESTAMP()))");
        } else {
            evalString(exec.getFormattedText(ctx));
        }
    }

    /**
     * CURRENT_TIMESTAMP
     */
    public void currentTimestamp(Expr_spec_funcContext ctx) {
        int precision = evalPop(ctx.expr(0), 3).intValue();
        evalVar(currentTimestamp(precision));
    }

    public static Var currentTimestamp(int precision) {
        String format = "yyyy-MM-dd HH:mm:ss";
        if (precision > 0 && precision <= 3) {
            format += '.';
            for (int i = 0; i < precision; i++) {
                format += 'S';
            }
        }
        SimpleDateFormat f = new SimpleDateFormat(format);
        String s = f.format(Calendar.getInstance(TimeZone.getDefault()).getTime());
        return new Var(org.apache.doris.plsql.Utils.toTimestamp(s), precision);
    }

    /**
     * CURRENT_TIMESTAMP in executable SQL statement
     */
    public void currentTimestampSql(Expr_spec_funcContext ctx) {
        if (exec.getConnectionType() == org.apache.doris.plsql.Conn.Type.HIVE) {
            evalString("FROM_UNIXTIME(UNIX_TIMESTAMP())");
        } else {
            evalString(org.apache.doris.plsql.Exec.getFormattedText(ctx));
        }
    }

    /**
     * DATE function
     */
    void date(Expr_func_paramsContext ctx) {
        if (ctx.func_param().size() != 1) {
            evalNull();
            return;
        }
        Var var = new Var(Type.DATE);
        var.cast(evalPop(ctx.func_param(0).expr()));
        evalVar(var);
    }

    /**
     * NOW() function (current date and time)
     */
    void now(Expr_func_paramsContext ctx) {
        if (ctx != null) {
            evalNull();
            return;
        }
        evalVar(currentTimestamp(3));
    }

    /**
     * TIMESTAMP_ISO function
     */
    void timestampIso(Expr_func_paramsContext ctx) {
        if (ctx.func_param().size() != 1) {
            evalNull();
            return;
        }
        Var var = new Var(Type.TIMESTAMP);
        var.cast(evalPop(ctx.func_param(0).expr()));
        evalVar(var);
    }

    /**
     * TO_TIMESTAMP function
     */
    void toTimestamp(Expr_func_paramsContext ctx) {
        if (ctx.func_param().size() != 2) {
            evalNull();
            return;
        }
        String value = evalPop(ctx.func_param(0).expr()).toString();
        String sqlFormat = evalPop(ctx.func_param(1).expr()).toString();
        String format = org.apache.doris.plsql.Utils.convertSqlDatetimeFormat(sqlFormat);
        try {
            long timeInMs = new SimpleDateFormat(format).parse(value).getTime();
            evalVar(new Var(Type.TIMESTAMP, new Timestamp(timeInMs)));
        } catch (Exception e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * FROM_UNIXTIME() function (convert seconds since 1970-01-01 00:00:00 to timestamp)
     */
    void fromUnixtime(Expr_func_paramsContext ctx) {
        int cnt = getParamCount(ctx);
        if (cnt == 0) {
            evalNull();
            return;
        }
        long epoch = evalPop(ctx.func_param(0).expr()).longValue();
        String format = "yyyy-MM-dd HH:mm:ss";
        if (cnt > 1) {
            format = evalPop(ctx.func_param(1).expr()).toString();
        }
        evalString(new SimpleDateFormat(format).format(new Date(epoch * 1000)));
    }

    /**
     * UNIX_TIMESTAMP() function (current date and time in seconds since 1970-01-01 00:00:00)
     */
    void unixTimestamp(Expr_func_paramsContext ctx) {
        evalVar(new Var(System.currentTimeMillis() / 1000));
    }

    public void currentTimeMillis(Expr_func_paramsContext ctx) {
        evalVar(new Var(System.currentTimeMillis()));
    }

    /**
     * toDate to_date("2024-06-18","format")
     * format Support { YYYY/YY、MM、DD、DDD、HH、HH12、HH24、AM、PM、MI、SS}
     * delimiter{ - ，. : / 空格 }
     *  to_date('2024/15 11/15/10','yyyy/DDD HH/MI/ss');     2024-08-15 11:15:10
     *  to_date('2024/15 11/15/10','yyyy/DDD HH/MI/ss');     2024-01-15 11:15:10
     */
    private void toDate(Expr_func_paramsContext ctx) {
        String dateStr = evalPop(ctx.func_param(0).expr()).toString();
        String formatStr = evalPop(ctx.func_param(1).expr()).toString();

        dateStr = dateStr.trim();
        formatStr = formatStr.trim();

        dateStr = dateStr.replace("-", "/");
        dateStr = dateStr.replace(",", "/");
        dateStr = dateStr.replace(".", "/");
        dateStr = dateStr.replace(":", "/");
        dateStr = dateStr.replaceAll("\\s+", "/");

        formatStr = formatStr.replace("-", "/");
        formatStr = formatStr.replace(",", "/");
        formatStr = formatStr.replace(".", "/");
        formatStr = formatStr.replace(":", "/");
        formatStr = formatStr.replaceAll("\\s+", "/");

        formatStr = formatStr.replaceAll("Y", "y");

        formatStr = formatStr.replaceAll("ddd", "D");
        formatStr = formatStr.replaceAll("DDD", "D");
        formatStr = formatStr.replaceAll("DD", "dd");

        formatStr = formatStr.replaceAll("HH12", "hh");
        formatStr = formatStr.replaceAll("HH24", "HH");

        if (dateStr.toLowerCase().contains("pm")) {
            formatStr = formatStr.replace("HH", "hh");
        }

        formatStr = formatStr.replaceAll("MI", "mm");
        formatStr = formatStr.replaceAll("mi", "mm");

        try {
            SimpleDateFormat format = new SimpleDateFormat(formatStr);
            Date date = format.parse(dateStr);
            if (!formatStr.contains("MM") && !formatStr.contains("D")) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
                calendar.set(Calendar.MONTH, currentMonth);
                date = calendar.getTime();
            }
            SimpleDateFormat baseFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            evalString(baseFormat.format(date));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * last_day function
     */
    private void lastDay(Expr_func_paramsContext ctx) {
        String dateStr = evalPop(ctx.func_param(0).expr()).toString();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MMM-dd");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(format.parse(dateStr));
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 0);
            evalString(format.format(calendar.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     *  date_add function
     *  date_sub(date/datetime,INTERVAL expr type) return datetime
     *      type{millisecond,second,minute,hour,day,week,month,quarter,year}
     *
     *  date_add('2024-08-14 ',interval 1 hour);     2024-08-14 01:00:00.000
     *  date_add('2024-08-14',interval 1 day);       2024-08-15 00:00:00.000
     *  date_add('2024-08-15 00:00:00.000',interval 1 day);     2024-08-16 00:00:00.000
     *  date_add('2024-08-15 00:00:00.000',interval -1 day);    2024-08-14 00:00:00.000
     */
    private void dateAdd(Expr_func_paramsContext ctx) {
        String dateParam = evalPop(ctx.func_param(0)).toString();
        String pattern = "yyyy-MM-dd";
        if (dateParam.indexOf(' ') != -1) {
            pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        String interval = evalPop(ctx.func_param(1).expr()).toString().toLowerCase(Locale.ROOT);
        String[] intervalParts = interval.split("\\s+");
        if (intervalParts.length != 3 || !intervalParts[0].equals("interval")) {
            evalNull();
            return;
        }

        try {
            Calendar finalTime = Calendar.getInstance();
            finalTime.setTime(dateFormat.parse(dateParam));
            switch (intervalParts[2]) {
                case "millisecond":
                    finalTime.add(Calendar.MILLISECOND, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "second":
                    finalTime.add(Calendar.SECOND, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "minute":
                    finalTime.add(Calendar.MINUTE, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "hour":
                    finalTime.add(Calendar.HOUR, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "day":
                    finalTime.add(Calendar.DATE, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "week":
                    finalTime.add(Calendar.WEEK_OF_YEAR, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "month":
                    finalTime.add(Calendar.MONTH, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "quarter":
                    finalTime.add(Calendar.MONTH, -3 * Integer.valueOf(intervalParts[1]));
                    break;
                case "year":
                    finalTime.add(Calendar.YEAR, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                default:
                    break;
            }
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            evalString(dateFormat.format(finalTime.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * If the date parameter is a DATE value and the calculated interval has only YEAR, MONTH,
     * and DAY parts (no time part), then the return value is also a DATE value. Otherwise the
     * return value is a DATETIME value.
     *
     *  date_sub(date/datetime,INTERVAL expr type)
     *  type{millisecond,second,minute,hour,day,week,month,quarter,year}
     *
     *  date_sub('2024-08-14',interval 1 hour);                     2024-08-13 23:00:00.000
     *  date_sub('2024-08-14 01:00:00.000',interval 1 hour)        2024-08-14 00:00:00.000
     */
    @SuppressWarnings("checkstyle:LineLength")
    private void dateSub(Expr_func_paramsContext ctx) {
        String dateParam = evalPop(ctx.func_param(0)).toString();
        String pattern = "yyyy-MM-dd";
        if (dateParam.indexOf(' ') != -1) {
            pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        String interval = evalPop(ctx.func_param(1).expr()).toString().toLowerCase(Locale.ROOT);
        String[] intervalParts = interval.split("\\s+");
        if (intervalParts.length != 3 || !intervalParts[0].equals("interval")) {
            evalNull();
        }

        try {
            Calendar finalTime = Calendar.getInstance();
            finalTime.setTime(dateFormat.parse(dateParam));
            switch (intervalParts[2]) {
                case "millisecond":
                    finalTime.add(Calendar.MILLISECOND, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "second":
                    finalTime.add(Calendar.SECOND, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "minute":
                    finalTime.add(Calendar.MINUTE, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "hour":
                    finalTime.add(Calendar.HOUR, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "day":
                    finalTime.add(Calendar.DATE, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "week":
                    finalTime.add(Calendar.WEEK_OF_YEAR, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "month":
                    finalTime.add(Calendar.MONTH, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                case "quarter":
                    finalTime.add(Calendar.MONTH, -3 * Integer.valueOf(intervalParts[1]));
                    break;
                case "year":
                    finalTime.add(Calendar.YEAR, -1 * Integer.valueOf(intervalParts[1]));
                    break;
                default:
                    break;
            }
            if ("yyyy-MM-dd".equals(pattern) && "day".equals(intervalParts[2]) || "week".equals(intervalParts[2]) ||
                "month".equals(intervalParts[2]) || "quarter".equals(intervalParts[2]) || "year".equals(intervalParts[2])) {
                dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            } else {
                dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            }
            evalString(dateFormat.format(finalTime.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * strToDate   str_to_date("2024-06-18","format")
     * format Support {%a、%b、%c、%d、%e、%H、%h、%I、%i、%j、%k、%l、%M、%m、%p、%r、%S、%s、%T、%V、%v、%W、%X、%x、%Y、%y}
     */
    private void strToDate(Expr_func_paramsContext ctx) {
        String dateString = evalPop(ctx.func_param(0).expr()).toString();
        String formatString = evalPop(ctx.func_param(1).expr()).toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            long timeInMs = dateFormat.parse(dateString).getTime();
            LocalDateTime dateTime = new Date(timeInMs).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
            DateTimeFormatterBuilder dateTimeFormatterBuilder = DateUtils.formatBuilder(formatString);
            DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter();
            String format = dateTime.format(formatter);
            evalString(format);
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * addMonths   add_months(date,number)
     */
    void addMonths(Expr_func_paramsContext ctx) {
        if (ctx.func_param().size() != 2) {
            evalNull();
            return;
        }
        String dateStart = evalPop(ctx.func_param(0).expr()).toString();
        String number = evalPop(ctx.func_param(1).expr()).toString();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (dateStart.indexOf(' ') != -1) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.00000");
        }

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(dateStart));
            calendar.add(Calendar.MONTH, Integer.parseInt(number));

            evalString(dateFormat.format(calendar.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * trunc(date/datetime ,[type])
     * type {yyyy/year ,mm/month ,dd ,hh ,mi }
     */
    private void trunc(Expr_func_paramsContext ctx) {
        String dateStart = evalPop(ctx.func_param(0).expr()).toString();
        String truncType = evalPop(ctx.func_param(1).expr()).toString();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (dateStart.indexOf(' ') != -1) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(dateStart));
            switch (truncType.toLowerCase(Locale.ROOT)) {
                case "year":
                case "yyyy":
                    calendar.set(Calendar.MONTH, 1);
                    calendar.set(Calendar.DATE, 1);
                    calendar.set(Calendar.HOUR, 0);
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.SECOND, 0);
                    break;
                case "month":
                case "mm":
                    calendar.set(Calendar.DATE, 1);
                    calendar.set(Calendar.HOUR, 0);
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.SECOND, 0);
                    break;
                case "dd":
                    calendar.set(Calendar.HOUR, 0);
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.SECOND, 0);
                    break;
                case "day":
                    //TODO
                    break;
                case "hh":
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.SECOND, 0);
                    break;
                case "mi":
                    calendar.set(Calendar.SECOND, 0);
                    break;
                default:
                    break;
            }

            evalString(dateFormat.format(calendar.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }
}

