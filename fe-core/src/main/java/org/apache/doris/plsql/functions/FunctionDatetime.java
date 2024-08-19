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
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.util.DateUtils;
import org.apache.doris.plsql.Exec;
import org.apache.doris.plsql.Var;
import org.apache.doris.plsql.Var.Type;
import org.apache.doris.plsql.executor.QueryExecutor;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
        f.map.put("DATE_FORMAT", this::dateFormat);
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
     * Format the string string as a date of type format
     * to_date("2024-06-18","format")
     * format Support { YYYY/YY、MM、DD、DDD、HH、HH12、HH24、AM、PM、MI、SS}
     * delimiter{ - ，. : / 空格 }
     * case:
     * to_date('2024/15 11/15/10','yyyy/DD HH/MI/ss');      2024-08-15 11:15:10
     * to_date('2024/15 11/15/10','yyyy/DDD HH/MI/ss');     2024-01-15 11:15:10
     * to_date('20-04-15','YYYY-MM-DD');     0020-04-15
     */
    private void toDate(Expr_func_paramsContext ctx) {
        String dateStr = evalPop(ctx.func_param(0).expr()).toString().trim();
        String formatStr = evalPop(ctx.func_param(1).expr()).toString().trim();

        dateStr = dateStr.replace("/", "-");
        dateStr = dateStr.replace(",", "-");
        dateStr = dateStr.replace(".", "-");
        dateStr = dateStr.replace(":", "-");
        dateStr = dateStr.replaceAll("\\s+", "-");

        formatStr = formatStr.replace("/", "-");
        formatStr = formatStr.replace(",", "-");
        formatStr = formatStr.replace(".", "-");
        formatStr = formatStr.replace(":", "-");
        formatStr = formatStr.replaceAll("\\s+", "-");

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
        formatStr = formatStr.replaceAll("Mi", "mm");
        formatStr = formatStr.replaceAll("mI", "mm");
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
            String pattern = "yyyy-MM-dd";
            if (formatStr.length() > 10) {
                pattern = "yyyy-MM-dd HH:mm:ss";
            }
            SimpleDateFormat baseFormat = new SimpleDateFormat(pattern);
            evalString(baseFormat.format(date));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * Returns the value of the last day corresponding to the current month in date.
     * Where, date is the date or date-time type. Returns NULL if the parameter date is invalid
     * last_day(date/datetime)  return date
     * <p>
     * case:
     * last_day('2020-1-15/12/00/00')     2020-01-31
     * last_day('2020-2-15  ')     2020-02-29
     */
    private void lastDay(Expr_func_paramsContext ctx) {
        String dateStr = evalPop(ctx.func_param(0).expr()).toString().trim();
        dateStr = dateStr.replace("/", "-");
        dateStr = dateStr.replace(",", "-");
        dateStr = dateStr.replace(".", "-");
        dateStr = dateStr.replace(":", "-");
        dateStr = dateStr.replace(":", "-");
        dateStr = dateStr.replaceAll("\\s+", "-");

        String pattern = "yyyy-MM-dd";
        if (dateStr.length() > 10) {
            pattern = "yyyy-MM-dd-HH-mm-ss";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(dateStr));
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 0);
            pattern = "yyyy-MM-dd";
            if (dateStr.length() > 10) {
                pattern = "yyyy-MM-dd HH-mm-ss";
            }
            evalString(new SimpleDateFormat(pattern).format(calendar.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * date addition operation, Positive numbers are plus, negative numbers are minus
     * date_add(date/datetime,INTERVAL expr type) return datetime
     * type Support {millisecond,second,minute,hour,day,week,month,quarter,year}
     * <p>
     * case:
     * date_add('2024-08-14 ',interval 1 hour);     2024-08-14 01:00:00.000
     * date_add('2024-08-14',interval 1 day);       2024-08-15 00:00:00.000
     * date_add('2024-08-15 00:00:00.000',interval 1 day);     2024-08-16 00:00:00.000
     * date_add('2024-08-15 00:00:00.000',interval -1 day);    2024-08-14 00:00:00.000
     */
    private void dateAdd(Expr_func_paramsContext ctx) {
        String dateParam = evalPop(ctx.func_param(0)).toString().trim();
        String pattern = "yyyy-MM-dd";
        if (dateParam.indexOf(' ') != -1) {
            pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        String interval = evalPop(ctx.func_param(1).expr()).toString().toLowerCase(Locale.ROOT).trim();
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
                //TODO  The following parameters are currently not supported
                case "microsecond":
                case "second_microsecond":
                case "minute_microsecond":
                case "minute_second":
                case "hour_microsecond":
                case "hour_second":
                case "hour_minute":
                case "day_microsecond":
                case "day_second":
                case "day_minute":
                case "day_hour":
                case "year_month":
                    throw new AnalysisException(String.format("%%%s not supported in date format string",
                                                              intervalParts[2]));
                default:
                    break;
            }
            evalString(dateFormat.format(finalTime.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * date_sub(date/datetime,INTERVAL expr type)
     * type{millisecond,second,minute,hour,day,week,month,quarter,year}
     * <p>
     * date_sub('2024-08-14',interval 1 hour);                     2024-08-13 23:00:00.000
     * date_sub('2024-08-14 01:00:00.000',interval 1 hour)        2024-08-14 00:00:00.000
     */
    @SuppressWarnings("checkstyle:LineLength")
    private void dateSub(Expr_func_paramsContext ctx) {
        String dateParam = evalPop(ctx.func_param(0)).toString().trim();
        String pattern = "yyyy-MM-dd";
        if (dateParam.indexOf(' ') != -1) {
            pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        String interval = evalPop(ctx.func_param(1).expr()).toString().toLowerCase(Locale.ROOT).trim();
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
                //TODO  The following parameters are currently not supported
                case "microsecond":
                case "second_microsecond":
                case "minute_microsecond":
                case "minute_second":
                case "hour_microsecond":
                case "hour_second":
                case "hour_minute":
                case "day_microsecond":
                case "day_second":
                case "day_minute":
                case "day_hour":
                case "year_month":
                    throw new AnalysisException(String.format("%%%s not supported in date format string",
                                                              intervalParts[2]));
                default:
                    break;
            }
            evalString(dateFormat.format(finalTime.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * dateFormat   date_format(date/dateime,"format")
     * format Support {%a、%b、%c、%d、%e、%H、%h、%I、%i、%j、%k、%l、%M、%m、%p、%r、%S、%s、%T、%V、%v、%W、%X、%x、%Y、%y}
     * date_format('2020-10-04 22:23:00','%W %M %Y');  Sunday October 2020
     * date_format('2020-01-01','%X %V');  2019 52
     */
    private void dateFormat(Expr_func_paramsContext ctx) {
        String dateString = evalPop(ctx.func_param(0).expr()).toString().trim();
        String formatString = evalPop(ctx.func_param(1).expr()).toString().trim();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (dateString.indexOf(' ') != -1) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        try {
            long timeInMs = dateFormat.parse(dateString).getTime();
            LocalDateTime dateTime = new Date(timeInMs).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
            DateTimeFormatterBuilder dateTimeFormatterBuilder = DateUtils.formatBuilder(formatString);
            DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter().withLocale(Locale.ENGLISH);
            String format = dateTime.format(formatter);
            evalString(format);
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * strToDate   str_to_date("2024-06-18","format")
     * format Support {%a、%b、%c、%d、%e、%H、%h、%I、%i、%j、%k、%l、%M、%m、%p、%r、%S、%s、%T、%V、%v、%W、%X、%x、%Y、%y}
     * str_to_date('08/30/2020','%m/%d/%Y');       2020-08-30
     * str_to_date('2020-11-08 00:00:00','%Y-%m-%d %H:%i:%s')   2020-11-08 00:00:00
     */
    private void strToDate(Expr_func_paramsContext ctx) {
        // todo  str_to_date('202035 Monday', '%X%V %W'), To be processed
        String dateString = evalPop(ctx.func_param(0).expr()).toString().trim();
        String formatString = evalPop(ctx.func_param(1).expr()).toString().trim();
        char[] formatChars = {'f', 'H', 'h', 'I', 'i', 'k', 'l', 'p', 'r', 's', 'p', 'r', 'S', 's', 'T'};
        String date;
        try {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = DateUtils.formatBuilder(formatString);
            DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter();
            LocalDate localDate = LocalDate.parse(dateString, formatter);
            date = localDate.toString();
            for (int i = 0; i < formatChars.length; i++) {
                if (formatString.contains(String.valueOf(formatChars[i]))) {
                    LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter);
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    date = localDateTime.format(formatter);
                    break;
                }
            }
            evalString(date);
        } catch (RuntimeException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * addMonths   add_months(date/datetime,number)
     * delimiter{ - ，. : / 空格 }
     * add_months('2020,1-30 12:00:00', 1);    2020-02-29 12:00:00
     * add_months('2020-1-30 ', 1);            2020-02-29
     * add_months('2020,1,30,12,00,00', 1);    2020-02-29 12:00:00
     * add_months('2020-1:30 ', 1);            2020-02-29
     * add_months('2020-1-30 12:00:00', -1);    2019-12-30 12:00:00
     * add_months('2020-1-30 ', -1);            2019-12-30
     */
    void addMonths(Expr_func_paramsContext ctx) {
        if (ctx.func_param().size() != 2) {
            evalNull();
            return;
        }
        String dateStr = evalPop(ctx.func_param(0).expr()).toString().trim();
        String number = evalPop(ctx.func_param(1).expr()).toString().trim();

        dateStr = dateStr.replace("/", "-");
        dateStr = dateStr.replace(",", "-");
        dateStr = dateStr.replace(".", "-");
        dateStr = dateStr.replace(":", "-");
        dateStr = dateStr.replace(":", "-");
        dateStr = dateStr.replaceAll("\\s+", "-");
        String pattern = "yyyy-MM-dd";
        if (dateStr.length() > 10) {
            pattern = "yyyy-MM-dd-HH-mm-ss";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(dateStr));
            calendar.add(Calendar.MONTH, Integer.parseInt(number));
            pattern = "yyyy-MM-dd";
            if (dateStr.length() > 10) {
                pattern = "yyyy-MM-dd HH:mm:ss";
            }
            evalString(new SimpleDateFormat(pattern).format(calendar.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }

    /**
     * trunc(date/datetime ,[type])
     * type {yyyy/year ,mm/month ,dd ,hh ,mi }
     * delimiter{ - ，. : / 空格 }
     * trunc('2020-1-30/12/11/11','mi') ;    2020-01-30 12:11:00
     * trunc('2020-1-30/12/11/11','month')   2020-01-01 00:00:00
     * trunc('2020-1-30/12/11/11','year')    2020-01-01 00:00:00
     * trunc('2020-1-30','year')             2020-01-01
     */
    private void trunc(Expr_func_paramsContext ctx) {
        String dateStr = evalPop(ctx.func_param(0).expr()).toString().trim();
        String truncType = evalPop(ctx.func_param(1).expr()).toString().trim();

        dateStr = dateStr.replace("/", "-");
        dateStr = dateStr.replace(",", "-");
        dateStr = dateStr.replace(".", "-");
        dateStr = dateStr.replace(":", "-");
        dateStr = dateStr.replace(":", "-");
        dateStr = dateStr.replaceAll("\\s+", "-");

        String pattern = "yyyy-MM-dd";
        if (dateStr.length() > 10) {
            pattern = "yyyy-MM-dd-HH-mm-ss";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(dateStr));
            System.out.println(truncType.toLowerCase(Locale.ROOT));
            switch (truncType.toLowerCase(Locale.ROOT)) {
                case "year":
                case "yyyy":
                    calendar.set(Calendar.MONTH, 0);
                    calendar.set(Calendar.DATE, 1);
                    calendar.set(Calendar.HOUR_OF_DAY, 0);
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.SECOND, 0);
                    break;
                case "month":
                case "mm":
                    calendar.set(Calendar.DATE, 1);
                    calendar.set(Calendar.HOUR_OF_DAY, 0);
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.SECOND, 0);
                    break;
                case "dd":
                    calendar.set(Calendar.HOUR_OF_DAY, 0);
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.SECOND, 0);
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
            pattern = "yyyy-MM-dd";
            if (dateStr.length() > 10) {
                pattern = "yyyy-MM-dd HH:mm:ss";
            }
            evalString(new SimpleDateFormat(pattern).format(calendar.getTime()));
        } catch (ParseException e) {
            exec.signal(e);
            evalNull();
        }
    }
}

