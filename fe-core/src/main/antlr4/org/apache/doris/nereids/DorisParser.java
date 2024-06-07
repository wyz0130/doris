// Generated from org/apache/doris/nereids/DorisParser.g4 by ANTLR 4.9.3
package org.apache.doris.nereids;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DorisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LEFT_PAREN=2, RIGHT_PAREN=3, COMMA=4, DOT=5, LEFT_BRACKET=6, 
		RIGHT_BRACKET=7, LEFT_BRACE=8, RIGHT_BRACE=9, ACCOUNT_LOCK=10, ACCOUNT_UNLOCK=11, 
		ADD=12, ADDDATE=13, ADMIN=14, AFTER=15, AGG_STATE=16, AGGREGATE=17, ALIAS=18, 
		ALL=19, ALTER=20, ANALYZE=21, ANALYZED=22, AND=23, ANTI=24, APPEND=25, 
		ARRAY=26, ARRAY_RANGE=27, AS=28, ASC=29, AT=30, AUTHORS=31, AUTO=32, AUTO_INCREMENT=33, 
		BACKEND=34, BACKENDS=35, BACKUP=36, BEGIN=37, BELONG=38, BETWEEN=39, BIGINT=40, 
		BIN=41, BINARY=42, BINLOG=43, BITAND=44, BITMAP=45, BITMAP_UNION=46, BITOR=47, 
		BITXOR=48, BLOB=49, BOOLEAN=50, BRIEF=51, BROKER=52, BUCKETS=53, BUILD=54, 
		BUILTIN=55, BULK=56, BY=57, CACHED=58, CALL=59, CANCEL=60, CASE=61, CAST=62, 
		CATALOG=63, CATALOGS=64, CHAIN=65, CHAR=66, CHARSET=67, CHECK=68, CLEAN=69, 
		CLUSTER=70, CLUSTERS=71, COLLATE=72, COLLATION=73, COLLECT=74, COLUMN=75, 
		COLUMNS=76, COMMENT=77, COMMIT=78, COMMITTED=79, COMPACT=80, COMPLETE=81, 
		CONFIG=82, CONNECTION=83, CONNECTION_ID=84, CONSISTENT=85, CONSTRAINT=86, 
		CONSTRAINTS=87, CONVERT=88, COPY=89, COUNT=90, CREATE=91, CREATION=92, 
		CRON=93, CROSS=94, CUBE=95, CURRENT=96, CURRENT_CATALOG=97, CURRENT_DATE=98, 
		CURRENT_TIME=99, CURRENT_TIMESTAMP=100, CURRENT_USER=101, DATA=102, DATABASE=103, 
		DATABASES=104, DATE=105, DATE_ADD=106, DATE_CEIL=107, DATE_DIFF=108, DATE_FLOOR=109, 
		DATE_SUB=110, DATEADD=111, DATEDIFF=112, DATETIME=113, DATETIMEV2=114, 
		DATEV2=115, DATETIMEV1=116, DATEV1=117, DAY=118, DAYS_ADD=119, DAYS_SUB=120, 
		DECIMAL=121, DECIMALV2=122, DECIMALV3=123, DECOMMISSION=124, DEFAULT=125, 
		DEFERRED=126, DELETE=127, DEMAND=128, DESC=129, DESCRIBE=130, DIAGNOSE=131, 
		DISK=132, DISTINCT=133, DISTINCTPC=134, DISTINCTPCSA=135, DISTRIBUTED=136, 
		DISTRIBUTION=137, DIV=138, DO=139, DORIS_INTERNAL_TABLE_ID=140, DOUBLE=141, 
		DROP=142, DROPP=143, DUAL=144, DUPLICATE=145, DYNAMIC=146, ELSE=147, ENABLE=148, 
		ENCRYPTKEY=149, ENCRYPTKEYS=150, END=151, ENDS=152, ENGINE=153, ENGINES=154, 
		ENTER=155, ERRORS=156, EVENTS=157, EVERY=158, EXCEPT=159, EXCLUDE=160, 
		EXECUTE=161, EXISTS=162, EXPIRED=163, EXPLAIN=164, EXPORT=165, EXTENDED=166, 
		EXTERNAL=167, EXTRACT=168, FAILED_LOGIN_ATTEMPTS=169, FALSE=170, FAST=171, 
		FEATURE=172, FIELDS=173, FILE=174, FILTER=175, FIRST=176, FLOAT=177, FOLLOWER=178, 
		FOLLOWING=179, FOR=180, FOREIGN=181, FORCE=182, FORMAT=183, FREE=184, 
		FROM=185, FRONTEND=186, FRONTENDS=187, FULL=188, FUNCTION=189, FUNCTIONS=190, 
		GENERIC=191, GLOBAL=192, GRANT=193, GRANTS=194, GRAPH=195, GROUP=196, 
		GROUPING=197, GROUPS=198, HASH=199, HAVING=200, HDFS=201, HELP=202, HISTOGRAM=203, 
		HLL=204, HLL_UNION=205, HOSTNAME=206, HOUR=207, HUB=208, IDENTIFIED=209, 
		IF=210, IGNORE=211, IMMEDIATE=212, IN=213, INCREMENTAL=214, INDEX=215, 
		INDEXES=216, INFILE=217, INNER=218, INSERT=219, INSTALL=220, INT=221, 
		INTEGER=222, INTERMEDIATE=223, INTERSECT=224, INTERVAL=225, INTO=226, 
		INVERTED=227, IPV4=228, IPV6=229, IS=230, IS_NOT_NULL_PRED=231, IS_NULL_PRED=232, 
		ISNULL=233, ISOLATION=234, JOB=235, JOBS=236, JOIN=237, JSON=238, JSONB=239, 
		KEY=240, KEYS=241, KILL=242, LABEL=243, LARGEINT=244, LAST=245, LATERAL=246, 
		LDAP=247, LDAP_ADMIN_PASSWORD=248, LEFT=249, LESS=250, LEVEL=251, LIKE=252, 
		LIMIT=253, LINES=254, LINK=255, LIST=256, LOAD=257, LOCAL=258, LOCALTIME=259, 
		LOCALTIMESTAMP=260, LOCATION=261, LOCK=262, LOGICAL=263, LOW_PRIORITY=264, 
		MANUAL=265, MAP=266, MATCH=267, MATCH_ALL=268, MATCH_ANY=269, MATCH_ELEMENT_EQ=270, 
		MATCH_ELEMENT_GE=271, MATCH_ELEMENT_GT=272, MATCH_ELEMENT_LE=273, MATCH_ELEMENT_LT=274, 
		MATCH_PHRASE=275, MATCH_PHRASE_EDGE=276, MATCH_PHRASE_PREFIX=277, MATCH_REGEXP=278, 
		MATERIALIZED=279, MAX=280, MAXVALUE=281, MEMO=282, MERGE=283, MIGRATE=284, 
		MIGRATIONS=285, MIN=286, MINUS=287, MINUTE=288, MODIFY=289, MONTH=290, 
		MTMV=291, NAME=292, NAMES=293, NATURAL=294, NEGATIVE=295, NEVER=296, NEXT=297, 
		NGRAM_BF=298, NO=299, NON_NULLABLE=300, NOT=301, NULL=302, NULLS=303, 
		OBSERVER=304, OF=305, OFFSET=306, ON=307, ONLY=308, OPEN=309, OPTIMIZED=310, 
		OR=311, ORDER=312, OUTER=313, OUTFILE=314, OVER=315, OVERWRITE=316, PARAMETER=317, 
		PARSED=318, PARTITION=319, PARTITIONS=320, PASSWORD=321, PASSWORD_EXPIRE=322, 
		PASSWORD_HISTORY=323, PASSWORD_LOCK_TIME=324, PASSWORD_REUSE=325, PATH=326, 
		PAUSE=327, PERCENT=328, PERIOD=329, PERMISSIVE=330, PHYSICAL=331, PLAN=332, 
		PROCESS=333, PLUGIN=334, PLUGINS=335, POLICY=336, PRECEDING=337, PREPARE=338, 
		PRIMARY=339, PROC=340, PROCEDURE=341, PROCESSLIST=342, PROFILE=343, PROPERTIES=344, 
		PROPERTY=345, QUANTILE_STATE=346, QUANTILE_UNION=347, QUERY=348, QUOTA=349, 
		RANDOM=350, RANGE=351, READ=352, REAL=353, REBALANCE=354, RECOVER=355, 
		RECYCLE=356, REFRESH=357, REFERENCES=358, REGEXP=359, RELEASE=360, RENAME=361, 
		REPAIR=362, REPEATABLE=363, REPLACE=364, REPLACE_IF_NOT_NULL=365, REPLICA=366, 
		REPOSITORIES=367, REPOSITORY=368, RESOURCE=369, RESOURCES=370, RESTORE=371, 
		RESTRICTIVE=372, RESUME=373, RETURNS=374, REVOKE=375, REWRITTEN=376, RIGHT=377, 
		RLIKE=378, ROLE=379, ROLES=380, ROLLBACK=381, ROLLUP=382, ROUTINE=383, 
		ROW=384, ROWS=385, S3=386, SAMPLE=387, SCHEDULE=388, SCHEDULER=389, SCHEMA=390, 
		SCHEMAS=391, SECOND=392, SELECT=393, SEMI=394, SEQUENCE=395, SERIALIZABLE=396, 
		SESSION=397, SET=398, SETS=399, SHAPE=400, SHOW=401, SIGNED=402, SKEW=403, 
		SMALLINT=404, SNAPSHOT=405, SONAME=406, SPLIT=407, SQL_BLOCK_RULE=408, 
		START=409, STARTS=410, STATS=411, STATUS=412, STOP=413, STORAGE=414, STREAM=415, 
		STREAMING=416, STRING=417, STRUCT=418, SUBDATE=419, SUM=420, SUPERUSER=421, 
		SWITCH=422, SYNC=423, SYSTEM=424, TABLE=425, TABLES=426, TABLESAMPLE=427, 
		TABLET=428, TABLETS=429, TASK=430, TASKS=431, TEMPORARY=432, TERMINATED=433, 
		TEXT=434, THAN=435, THEN=436, TIME=437, TIMESTAMP=438, TIMESTAMPADD=439, 
		TIMESTAMPDIFF=440, TINYINT=441, TO=442, TRANSACTION=443, TRASH=444, TREE=445, 
		TRIGGERS=446, TRIM=447, TRUE=448, TRUNCATE=449, TYPE=450, TYPECAST=451, 
		TYPES=452, UNBOUNDED=453, UNCOMMITTED=454, UNINSTALL=455, UNION=456, UNIQUE=457, 
		UNLOCK=458, UNSIGNED=459, UPDATE=460, USE=461, USER=462, USING=463, VALUE=464, 
		VALUES=465, VARCHAR=466, VARIABLES=467, VARIANT=468, VERBOSE=469, VERSION=470, 
		VIEW=471, WARNINGS=472, WEEK=473, WHEN=474, WHERE=475, WHITELIST=476, 
		WITH=477, WORK=478, WORKLOAD=479, WRITE=480, YEAR=481, EQ=482, NSEQ=483, 
		NEQ=484, LT=485, LTE=486, GT=487, GTE=488, PLUS=489, SUBTRACT=490, ASTERISK=491, 
		SLASH=492, MOD=493, TILDE=494, AMPERSAND=495, LOGICALAND=496, LOGICALNOT=497, 
		PIPE=498, DOUBLEPIPES=499, HAT=500, COLON=501, ARROW=502, HINT_START=503, 
		HINT_END=504, ATSIGN=505, DOUBLEATSIGN=506, STRING_LITERAL=507, LEADING_STRING=508, 
		BIGINT_LITERAL=509, SMALLINT_LITERAL=510, TINYINT_LITERAL=511, INTEGER_VALUE=512, 
		EXPONENT_VALUE=513, DECIMAL_VALUE=514, BIGDECIMAL_LITERAL=515, IDENTIFIER=516, 
		BACKQUOTED_IDENTIFIER=517, SIMPLE_COMMENT=518, BRACKETED_COMMENT=519, 
		FROM_DUAL=520, WS=521, UNRECOGNIZED=522, VAULT=523;
	public static final int
		RULE_multiStatements = 0, RULE_singleStatement = 1, RULE_statement = 2, 
		RULE_statementBase = 3, RULE_unsupportedStatement = 4, RULE_variable = 5, 
		RULE_transactionAccessMode = 6, RULE_isolationLevel = 7, RULE_constraint = 8, 
		RULE_partitionSpec = 9, RULE_partitionTable = 10, RULE_identityOrFunctionList = 11, 
		RULE_identityOrFunction = 12, RULE_dataDesc = 13, RULE_buildMode = 14, 
		RULE_refreshTrigger = 15, RULE_refreshSchedule = 16, RULE_refreshMethod = 17, 
		RULE_identifierOrStringLiteral = 18, RULE_identifierOrText = 19, RULE_userIdentify = 20, 
		RULE_explain = 21, RULE_planType = 22, RULE_mergeType = 23, RULE_preFilterClause = 24, 
		RULE_deleteOnClause = 25, RULE_sequenceColClause = 26, RULE_colFromPath = 27, 
		RULE_colMappingList = 28, RULE_mappingExpr = 29, RULE_withRemoteStorageSystem = 30, 
		RULE_resourceDesc = 31, RULE_mysqlDataDesc = 32, RULE_skipLines = 33, 
		RULE_outFileClause = 34, RULE_query = 35, RULE_queryTerm = 36, RULE_setQuantifier = 37, 
		RULE_queryPrimary = 38, RULE_querySpecification = 39, RULE_cte = 40, RULE_aliasQuery = 41, 
		RULE_columnAliases = 42, RULE_selectClause = 43, RULE_selectColumnClause = 44, 
		RULE_whereClause = 45, RULE_fromClause = 46, RULE_intoClause = 47, RULE_bulkCollectClause = 48, 
		RULE_tableRow = 49, RULE_relations = 50, RULE_relation = 51, RULE_joinRelation = 52, 
		RULE_distributeType = 53, RULE_relationHint = 54, RULE_aggClause = 55, 
		RULE_groupingElement = 56, RULE_groupingSet = 57, RULE_havingClause = 58, 
		RULE_selectHint = 59, RULE_hintStatement = 60, RULE_hintAssignment = 61, 
		RULE_updateAssignment = 62, RULE_updateAssignmentSeq = 63, RULE_lateralView = 64, 
		RULE_queryOrganization = 65, RULE_sortClause = 66, RULE_sortItem = 67, 
		RULE_limitClause = 68, RULE_partitionClause = 69, RULE_joinType = 70, 
		RULE_joinCriteria = 71, RULE_identifierList = 72, RULE_identifierSeq = 73, 
		RULE_optScanParams = 74, RULE_relationPrimary = 75, RULE_materializedViewName = 76, 
		RULE_propertyClause = 77, RULE_propertyItemList = 78, RULE_propertyItem = 79, 
		RULE_propertyKey = 80, RULE_propertyValue = 81, RULE_tableAlias = 82, 
		RULE_multipartIdentifier = 83, RULE_simpleColumnDefs = 84, RULE_simpleColumnDef = 85, 
		RULE_columnDefs = 86, RULE_columnDef = 87, RULE_indexDefs = 88, RULE_indexDef = 89, 
		RULE_partitionsDef = 90, RULE_partitionDef = 91, RULE_lessThanPartitionDef = 92, 
		RULE_fixedPartitionDef = 93, RULE_stepPartitionDef = 94, RULE_inPartitionDef = 95, 
		RULE_constantSeq = 96, RULE_partitionValueDef = 97, RULE_rollupDefs = 98, 
		RULE_rollupDef = 99, RULE_aggTypeDef = 100, RULE_tabletList = 101, RULE_inlineTable = 102, 
		RULE_namedExpression = 103, RULE_namedExpressionSeq = 104, RULE_expression = 105, 
		RULE_lambdaExpression = 106, RULE_booleanExpression = 107, RULE_rowConstructor = 108, 
		RULE_rowConstructorItem = 109, RULE_predicate = 110, RULE_valueExpression = 111, 
		RULE_datetimeUnit = 112, RULE_primaryExpression = 113, RULE_functionCallExpression = 114, 
		RULE_functionIdentifier = 115, RULE_functionNameIdentifier = 116, RULE_windowSpec = 117, 
		RULE_windowFrame = 118, RULE_frameUnits = 119, RULE_frameBoundary = 120, 
		RULE_qualifiedName = 121, RULE_specifiedPartition = 122, RULE_constant = 123, 
		RULE_comparisonOperator = 124, RULE_booleanValue = 125, RULE_whenClause = 126, 
		RULE_interval = 127, RULE_unitIdentifier = 128, RULE_dataTypeWithNullable = 129, 
		RULE_dataType = 130, RULE_primitiveColType = 131, RULE_complexColTypeList = 132, 
		RULE_complexColType = 133, RULE_commentSpec = 134, RULE_sample = 135, 
		RULE_sampleMethod = 136, RULE_errorCapturingIdentifier = 137, RULE_errorCapturingIdentifierExtra = 138, 
		RULE_identifier = 139, RULE_strictIdentifier = 140, RULE_quotedIdentifier = 141, 
		RULE_number = 142, RULE_nonReserved = 143;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiStatements", "singleStatement", "statement", "statementBase", "unsupportedStatement", 
			"variable", "transactionAccessMode", "isolationLevel", "constraint", 
			"partitionSpec", "partitionTable", "identityOrFunctionList", "identityOrFunction", 
			"dataDesc", "buildMode", "refreshTrigger", "refreshSchedule", "refreshMethod", 
			"identifierOrStringLiteral", "identifierOrText", "userIdentify", "explain", 
			"planType", "mergeType", "preFilterClause", "deleteOnClause", "sequenceColClause", 
			"colFromPath", "colMappingList", "mappingExpr", "withRemoteStorageSystem", 
			"resourceDesc", "mysqlDataDesc", "skipLines", "outFileClause", "query", 
			"queryTerm", "setQuantifier", "queryPrimary", "querySpecification", "cte", 
			"aliasQuery", "columnAliases", "selectClause", "selectColumnClause", 
			"whereClause", "fromClause", "intoClause", "bulkCollectClause", "tableRow", 
			"relations", "relation", "joinRelation", "distributeType", "relationHint", 
			"aggClause", "groupingElement", "groupingSet", "havingClause", "selectHint", 
			"hintStatement", "hintAssignment", "updateAssignment", "updateAssignmentSeq", 
			"lateralView", "queryOrganization", "sortClause", "sortItem", "limitClause", 
			"partitionClause", "joinType", "joinCriteria", "identifierList", "identifierSeq", 
			"optScanParams", "relationPrimary", "materializedViewName", "propertyClause", 
			"propertyItemList", "propertyItem", "propertyKey", "propertyValue", "tableAlias", 
			"multipartIdentifier", "simpleColumnDefs", "simpleColumnDef", "columnDefs", 
			"columnDef", "indexDefs", "indexDef", "partitionsDef", "partitionDef", 
			"lessThanPartitionDef", "fixedPartitionDef", "stepPartitionDef", "inPartitionDef", 
			"constantSeq", "partitionValueDef", "rollupDefs", "rollupDef", "aggTypeDef", 
			"tabletList", "inlineTable", "namedExpression", "namedExpressionSeq", 
			"expression", "lambdaExpression", "booleanExpression", "rowConstructor", 
			"rowConstructorItem", "predicate", "valueExpression", "datetimeUnit", 
			"primaryExpression", "functionCallExpression", "functionIdentifier", 
			"functionNameIdentifier", "windowSpec", "windowFrame", "frameUnits", 
			"frameBoundary", "qualifiedName", "specifiedPartition", "constant", "comparisonOperator", 
			"booleanValue", "whenClause", "interval", "unitIdentifier", "dataTypeWithNullable", 
			"dataType", "primitiveColType", "complexColTypeList", "complexColType", 
			"commentSpec", "sample", "sampleMethod", "errorCapturingIdentifier", 
			"errorCapturingIdentifierExtra", "identifier", "strictIdentifier", "quotedIdentifier", 
			"number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'['", "']'", "'{'", "'}'", 
			"'ACCOUNT_LOCK'", "'ACCOUNT_UNLOCK'", "'ADD'", "'ADDDATE'", "'ADMIN'", 
			"'AFTER'", "'AGG_STATE'", "'AGGREGATE'", "'ALIAS'", "'ALL'", "'ALTER'", 
			"'ANALYZE'", "'ANALYZED'", "'AND'", "'ANTI'", "'APPEND'", "'ARRAY'", 
			"'ARRAY_RANGE'", "'AS'", "'ASC'", "'AT'", "'AUTHORS'", "'AUTO'", "'AUTO_INCREMENT'", 
			"'BACKEND'", "'BACKENDS'", "'BACKUP'", "'BEGIN'", "'BELONG'", "'BETWEEN'", 
			"'BIGINT'", "'BIN'", "'BINARY'", "'BINLOG'", "'BITAND'", "'BITMAP'", 
			"'BITMAP_UNION'", "'BITOR'", "'BITXOR'", "'BLOB'", "'BOOLEAN'", "'BRIEF'", 
			"'BROKER'", "'BUCKETS'", "'BUILD'", "'BUILTIN'", "'BULK'", "'BY'", "'CACHED'", 
			"'CALL'", "'CANCEL'", "'CASE'", "'CAST'", "'CATALOG'", "'CATALOGS'", 
			"'CHAIN'", null, "'CHARSET'", "'CHECK'", "'CLEAN'", "'CLUSTER'", "'CLUSTERS'", 
			"'COLLATE'", "'COLLATION'", "'COLLECT'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMMITTED'", "'COMPACT'", "'COMPLETE'", "'CONFIG'", "'CONNECTION'", 
			"'CONNECTION_ID'", "'CONSISTENT'", "'CONSTRAINT'", "'CONSTRAINTS'", "'CONVERT'", 
			"'COPY'", "'COUNT'", "'CREATE'", "'CREATION'", "'CRON'", "'CROSS'", "'CUBE'", 
			"'CURRENT'", "'CURRENT_CATALOG'", "'CURRENT_DATE'", "'CURRENT_TIME'", 
			"'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", "'DATABASE'", "'DATABASES'", 
			"'DATE'", "'DATE_ADD'", "'DATE_CEIL'", "'DATE_DIFF'", "'DATE_FLOOR'", 
			"'DATE_SUB'", "'DATEADD'", "'DATEDIFF'", "'DATETIME'", "'DATETIMEV2'", 
			"'DATEV2'", "'DATETIMEV1'", "'DATEV1'", "'DAY'", "'DAYS_ADD'", "'DAYS_SUB'", 
			"'DECIMAL'", "'DECIMALV2'", "'DECIMALV3'", "'DECOMMISSION'", "'DEFAULT'", 
			"'DEFERRED'", "'DELETE'", "'DEMAND'", "'DESC'", "'DESCRIBE'", "'DIAGNOSE'", 
			"'DISK'", "'DISTINCT'", "'DISTINCTPC'", "'DISTINCTPCSA'", "'DISTRIBUTED'", 
			"'DISTRIBUTION'", "'DIV'", "'DO'", "'DORIS_INTERNAL_TABLE_ID'", "'DOUBLE'", 
			"'DROP'", "'DROPP'", "'DUAL'", "'DUPLICATE'", "'DYNAMIC'", "'ELSE'", 
			"'ENABLE'", "'ENCRYPTKEY'", "'ENCRYPTKEYS'", "'END'", "'ENDS'", "'ENGINE'", 
			"'ENGINES'", "'ENTER'", "'ERRORS'", "'EVENTS'", "'EVERY'", "'EXCEPT'", 
			"'EXCLUDE'", "'EXECUTE'", "'EXISTS'", "'EXPIRED'", "'EXPLAIN'", "'EXPORT'", 
			"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FAILED_LOGIN_ATTEMPTS'", "'FALSE'", 
			"'FAST'", "'FEATURE'", "'FIELDS'", "'FILE'", "'FILTER'", "'FIRST'", "'FLOAT'", 
			"'FOLLOWER'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORCE'", "'FORMAT'", 
			"'FREE'", "'FROM'", "'FRONTEND'", "'FRONTENDS'", "'FULL'", "'FUNCTION'", 
			"'FUNCTIONS'", "'GENERIC'", "'GLOBAL'", "'GRANT'", "'GRANTS'", "'GRAPH'", 
			"'GROUP'", "'GROUPING'", "'GROUPS'", "'HASH'", "'HAVING'", "'HDFS'", 
			"'HELP'", "'HISTOGRAM'", "'HLL'", "'HLL_UNION'", "'HOSTNAME'", "'HOUR'", 
			"'HUB'", "'IDENTIFIED'", "'IF'", "'IGNORE'", "'IMMEDIATE'", "'IN'", "'INCREMENTAL'", 
			"'INDEX'", "'INDEXES'", "'INFILE'", "'INNER'", "'INSERT'", "'INSTALL'", 
			"'INT'", "'INTEGER'", "'INTERMEDIATE'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'INVERTED'", "'IPV4'", "'IPV6'", "'IS'", "'IS_NOT_NULL_PRED'", 
			"'IS_NULL_PRED'", "'ISNULL'", "'ISOLATION'", "'JOB'", "'JOBS'", "'JOIN'", 
			"'JSON'", "'JSONB'", "'KEY'", "'KEYS'", "'KILL'", "'LABEL'", "'LARGEINT'", 
			"'LAST'", "'LATERAL'", "'LDAP'", "'LDAP_ADMIN_PASSWORD'", "'LEFT'", "'LESS'", 
			"'LEVEL'", "'LIKE'", "'LIMIT'", "'LINES'", "'LINK'", "'LIST'", "'LOAD'", 
			"'LOCAL'", "'LOCALTIME'", "'LOCALTIMESTAMP'", "'LOCATION'", "'LOCK'", 
			"'LOGICAL'", "'LOW_PRIORITY'", "'MANUAL'", "'MAP'", "'MATCH'", "'MATCH_ALL'", 
			"'MATCH_ANY'", "'ELEMENT_EQ'", "'ELEMENT_GE'", "'ELEMENT_GT'", "'ELEMENT_LE'", 
			"'ELEMENT_LT'", "'MATCH_PHRASE'", "'MATCH_PHRASE_EDGE'", "'MATCH_PHRASE_PREFIX'", 
			"'MATCH_REGEXP'", "'MATERIALIZED'", "'MAX'", "'MAXVALUE'", "'MEMO'", 
			"'MERGE'", "'MIGRATE'", "'MIGRATIONS'", "'MIN'", "'MINUS'", "'MINUTE'", 
			"'MODIFY'", "'MONTH'", "'MTMV'", "'NAME'", "'NAMES'", "'NATURAL'", "'NEGATIVE'", 
			"'NEVER'", "'NEXT'", "'NGRAM_BF'", "'NO'", "'NON_NULLABLE'", "'NOT'", 
			"'NULL'", "'NULLS'", "'OBSERVER'", "'OF'", "'OFFSET'", "'ON'", "'ONLY'", 
			"'OPEN'", "'OPTIMIZED'", "'OR'", "'ORDER'", "'OUTER'", "'OUTFILE'", "'OVER'", 
			"'OVERWRITE'", "'PARAMETER'", "'PARSED'", "'PARTITION'", "'PARTITIONS'", 
			"'PASSWORD'", "'PASSWORD_EXPIRE'", "'PASSWORD_HISTORY'", "'PASSWORD_LOCK_TIME'", 
			"'PASSWORD_REUSE'", "'PATH'", "'PAUSE'", "'PERCENT'", "'PERIOD'", "'PERMISSIVE'", 
			"'PHYSICAL'", "'PLAN'", "'PROCESS'", "'PLUGIN'", "'PLUGINS'", "'POLICY'", 
			"'PRECEDING'", "'PREPARE'", "'PRIMARY'", "'PROC'", "'PROCEDURE'", "'PROCESSLIST'", 
			"'PROFILE'", "'PROPERTIES'", "'PROPERTY'", "'QUANTILE_STATE'", "'QUANTILE_UNION'", 
			"'QUERY'", "'QUOTA'", "'RANDOM'", "'RANGE'", "'READ'", "'REAL'", "'REBALANCE'", 
			"'RECOVER'", "'RECYCLE'", "'REFRESH'", "'REFERENCES'", "'REGEXP'", "'RELEASE'", 
			"'RENAME'", "'REPAIR'", "'REPEATABLE'", "'REPLACE'", "'REPLACE_IF_NOT_NULL'", 
			"'REPLICA'", "'REPOSITORIES'", "'REPOSITORY'", "'RESOURCE'", "'RESOURCES'", 
			"'RESTORE'", "'RESTRICTIVE'", "'RESUME'", "'RETURNS'", "'REVOKE'", "'REWRITTEN'", 
			"'RIGHT'", "'RLIKE'", "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", 
			"'ROUTINE'", "'ROW'", "'ROWS'", "'S3'", "'SAMPLE'", "'SCHEDULE'", "'SCHEDULER'", 
			"'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SELECT'", "'SEMI'", "'SEQUENCE'", 
			"'SERIALIZABLE'", "'SESSION'", "'SET'", "'SETS'", "'SHAPE'", "'SHOW'", 
			"'SIGNED'", "'SKEW'", "'SMALLINT'", "'SNAPSHOT'", "'SONAME'", "'SPLIT'", 
			"'SQL_BLOCK_RULE'", "'START'", "'STARTS'", "'STATS'", "'STATUS'", "'STOP'", 
			"'STORAGE'", "'STREAM'", "'STREAMING'", "'STRING'", "'STRUCT'", "'SUBDATE'", 
			"'SUM'", "'SUPERUSER'", "'SWITCH'", "'SYNC'", "'SYSTEM'", "'TABLE'", 
			"'TABLES'", "'TABLESAMPLE'", "'TABLET'", "'TABLETS'", "'TASK'", "'TASKS'", 
			"'TEMPORARY'", "'TERMINATED'", "'TEXT'", "'THAN'", "'THEN'", "'TIME'", 
			"'TIMESTAMP'", "'TIMESTAMPADD'", "'TIMESTAMPDIFF'", "'TINYINT'", "'TO'", 
			"'TRANSACTION'", "'TRASH'", "'TREE'", "'TRIGGERS'", "'TRIM'", "'TRUE'", 
			"'TRUNCATE'", "'TYPE'", "'TYPE_CAST'", "'TYPES'", "'UNBOUNDED'", "'UNCOMMITTED'", 
			"'UNINSTALL'", "'UNION'", "'UNIQUE'", "'UNLOCK'", "'UNSIGNED'", "'UPDATE'", 
			"'USE'", "'USER'", "'USING'", "'VALUE'", "'VALUES'", "'VARCHAR'", "'VARIABLES'", 
			"'VARIANT'", "'VERBOSE'", "'VERSION'", "'VIEW'", "'WARNINGS'", "'WEEK'", 
			"'WHEN'", "'WHERE'", "'WHITELIST'", "'WITH'", "'WORK'", "'WORKLOAD'", 
			"'WRITE'", "'YEAR'", null, "'<=>'", null, "'<'", null, "'>'", null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'&&'", "'!'", "'|'", "'||'", 
			"'^'", "':'", "'->'", "'/*+'", "'*/'", "'@'", "'@@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "ACCOUNT_LOCK", "ACCOUNT_UNLOCK", 
			"ADD", "ADDDATE", "ADMIN", "AFTER", "AGG_STATE", "AGGREGATE", "ALIAS", 
			"ALL", "ALTER", "ANALYZE", "ANALYZED", "AND", "ANTI", "APPEND", "ARRAY", 
			"ARRAY_RANGE", "AS", "ASC", "AT", "AUTHORS", "AUTO", "AUTO_INCREMENT", 
			"BACKEND", "BACKENDS", "BACKUP", "BEGIN", "BELONG", "BETWEEN", "BIGINT", 
			"BIN", "BINARY", "BINLOG", "BITAND", "BITMAP", "BITMAP_UNION", "BITOR", 
			"BITXOR", "BLOB", "BOOLEAN", "BRIEF", "BROKER", "BUCKETS", "BUILD", "BUILTIN", 
			"BULK", "BY", "CACHED", "CALL", "CANCEL", "CASE", "CAST", "CATALOG", 
			"CATALOGS", "CHAIN", "CHAR", "CHARSET", "CHECK", "CLEAN", "CLUSTER", 
			"CLUSTERS", "COLLATE", "COLLATION", "COLLECT", "COLUMN", "COLUMNS", "COMMENT", 
			"COMMIT", "COMMITTED", "COMPACT", "COMPLETE", "CONFIG", "CONNECTION", 
			"CONNECTION_ID", "CONSISTENT", "CONSTRAINT", "CONSTRAINTS", "CONVERT", 
			"COPY", "COUNT", "CREATE", "CREATION", "CRON", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_CATALOG", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURRENT_USER", "DATA", "DATABASE", "DATABASES", "DATE", "DATE_ADD", 
			"DATE_CEIL", "DATE_DIFF", "DATE_FLOOR", "DATE_SUB", "DATEADD", "DATEDIFF", 
			"DATETIME", "DATETIMEV2", "DATEV2", "DATETIMEV1", "DATEV1", "DAY", "DAYS_ADD", 
			"DAYS_SUB", "DECIMAL", "DECIMALV2", "DECIMALV3", "DECOMMISSION", "DEFAULT", 
			"DEFERRED", "DELETE", "DEMAND", "DESC", "DESCRIBE", "DIAGNOSE", "DISK", 
			"DISTINCT", "DISTINCTPC", "DISTINCTPCSA", "DISTRIBUTED", "DISTRIBUTION", 
			"DIV", "DO", "DORIS_INTERNAL_TABLE_ID", "DOUBLE", "DROP", "DROPP", "DUAL", 
			"DUPLICATE", "DYNAMIC", "ELSE", "ENABLE", "ENCRYPTKEY", "ENCRYPTKEYS", 
			"END", "ENDS", "ENGINE", "ENGINES", "ENTER", "ERRORS", "EVENTS", "EVERY", 
			"EXCEPT", "EXCLUDE", "EXECUTE", "EXISTS", "EXPIRED", "EXPLAIN", "EXPORT", 
			"EXTENDED", "EXTERNAL", "EXTRACT", "FAILED_LOGIN_ATTEMPTS", "FALSE", 
			"FAST", "FEATURE", "FIELDS", "FILE", "FILTER", "FIRST", "FLOAT", "FOLLOWER", 
			"FOLLOWING", "FOR", "FOREIGN", "FORCE", "FORMAT", "FREE", "FROM", "FRONTEND", 
			"FRONTENDS", "FULL", "FUNCTION", "FUNCTIONS", "GENERIC", "GLOBAL", "GRANT", 
			"GRANTS", "GRAPH", "GROUP", "GROUPING", "GROUPS", "HASH", "HAVING", "HDFS", 
			"HELP", "HISTOGRAM", "HLL", "HLL_UNION", "HOSTNAME", "HOUR", "HUB", "IDENTIFIED", 
			"IF", "IGNORE", "IMMEDIATE", "IN", "INCREMENTAL", "INDEX", "INDEXES", 
			"INFILE", "INNER", "INSERT", "INSTALL", "INT", "INTEGER", "INTERMEDIATE", 
			"INTERSECT", "INTERVAL", "INTO", "INVERTED", "IPV4", "IPV6", "IS", "IS_NOT_NULL_PRED", 
			"IS_NULL_PRED", "ISNULL", "ISOLATION", "JOB", "JOBS", "JOIN", "JSON", 
			"JSONB", "KEY", "KEYS", "KILL", "LABEL", "LARGEINT", "LAST", "LATERAL", 
			"LDAP", "LDAP_ADMIN_PASSWORD", "LEFT", "LESS", "LEVEL", "LIKE", "LIMIT", 
			"LINES", "LINK", "LIST", "LOAD", "LOCAL", "LOCALTIME", "LOCALTIMESTAMP", 
			"LOCATION", "LOCK", "LOGICAL", "LOW_PRIORITY", "MANUAL", "MAP", "MATCH", 
			"MATCH_ALL", "MATCH_ANY", "MATCH_ELEMENT_EQ", "MATCH_ELEMENT_GE", "MATCH_ELEMENT_GT", 
			"MATCH_ELEMENT_LE", "MATCH_ELEMENT_LT", "MATCH_PHRASE", "MATCH_PHRASE_EDGE", 
			"MATCH_PHRASE_PREFIX", "MATCH_REGEXP", "MATERIALIZED", "MAX", "MAXVALUE", 
			"MEMO", "MERGE", "MIGRATE", "MIGRATIONS", "MIN", "MINUS", "MINUTE", "MODIFY", 
			"MONTH", "MTMV", "NAME", "NAMES", "NATURAL", "NEGATIVE", "NEVER", "NEXT", 
			"NGRAM_BF", "NO", "NON_NULLABLE", "NOT", "NULL", "NULLS", "OBSERVER", 
			"OF", "OFFSET", "ON", "ONLY", "OPEN", "OPTIMIZED", "OR", "ORDER", "OUTER", 
			"OUTFILE", "OVER", "OVERWRITE", "PARAMETER", "PARSED", "PARTITION", "PARTITIONS", 
			"PASSWORD", "PASSWORD_EXPIRE", "PASSWORD_HISTORY", "PASSWORD_LOCK_TIME", 
			"PASSWORD_REUSE", "PATH", "PAUSE", "PERCENT", "PERIOD", "PERMISSIVE", 
			"PHYSICAL", "PLAN", "PROCESS", "PLUGIN", "PLUGINS", "POLICY", "PRECEDING", 
			"PREPARE", "PRIMARY", "PROC", "PROCEDURE", "PROCESSLIST", "PROFILE", 
			"PROPERTIES", "PROPERTY", "QUANTILE_STATE", "QUANTILE_UNION", "QUERY", 
			"QUOTA", "RANDOM", "RANGE", "READ", "REAL", "REBALANCE", "RECOVER", "RECYCLE", 
			"REFRESH", "REFERENCES", "REGEXP", "RELEASE", "RENAME", "REPAIR", "REPEATABLE", 
			"REPLACE", "REPLACE_IF_NOT_NULL", "REPLICA", "REPOSITORIES", "REPOSITORY", 
			"RESOURCE", "RESOURCES", "RESTORE", "RESTRICTIVE", "RESUME", "RETURNS", 
			"REVOKE", "REWRITTEN", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", 
			"ROLLUP", "ROUTINE", "ROW", "ROWS", "S3", "SAMPLE", "SCHEDULE", "SCHEDULER", 
			"SCHEMA", "SCHEMAS", "SECOND", "SELECT", "SEMI", "SEQUENCE", "SERIALIZABLE", 
			"SESSION", "SET", "SETS", "SHAPE", "SHOW", "SIGNED", "SKEW", "SMALLINT", 
			"SNAPSHOT", "SONAME", "SPLIT", "SQL_BLOCK_RULE", "START", "STARTS", "STATS", 
			"STATUS", "STOP", "STORAGE", "STREAM", "STREAMING", "STRING", "STRUCT", 
			"SUBDATE", "SUM", "SUPERUSER", "SWITCH", "SYNC", "SYSTEM", "TABLE", "TABLES", 
			"TABLESAMPLE", "TABLET", "TABLETS", "TASK", "TASKS", "TEMPORARY", "TERMINATED", 
			"TEXT", "THAN", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPADD", "TIMESTAMPDIFF", 
			"TINYINT", "TO", "TRANSACTION", "TRASH", "TREE", "TRIGGERS", "TRIM", 
			"TRUE", "TRUNCATE", "TYPE", "TYPECAST", "TYPES", "UNBOUNDED", "UNCOMMITTED", 
			"UNINSTALL", "UNION", "UNIQUE", "UNLOCK", "UNSIGNED", "UPDATE", "USE", 
			"USER", "USING", "VALUE", "VALUES", "VARCHAR", "VARIABLES", "VARIANT", 
			"VERBOSE", "VERSION", "VIEW", "WARNINGS", "WEEK", "WHEN", "WHERE", "WHITELIST", 
			"WITH", "WORK", "WORKLOAD", "WRITE", "YEAR", "EQ", "NSEQ", "NEQ", "LT", 
			"LTE", "GT", "GTE", "PLUS", "SUBTRACT", "ASTERISK", "SLASH", "MOD", "TILDE", 
			"AMPERSAND", "LOGICALAND", "LOGICALNOT", "PIPE", "DOUBLEPIPES", "HAT", 
			"COLON", "ARROW", "HINT_START", "HINT_END", "ATSIGN", "DOUBLEATSIGN", 
			"STRING_LITERAL", "LEADING_STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_COMMENT", "FROM_DUAL", "WS", "UNRECOGNIZED", "VAULT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DorisParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public boolean doris_legacy_SQL_syntax = true;

	public DorisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MultiStatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DorisParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DorisParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DorisParser.SEMICOLON, i);
		}
		public MultiStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMultiStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMultiStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMultiStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiStatementsContext multiStatements() throws RecognitionException {
		MultiStatementsContext _localctx = new MultiStatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multiStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				statement();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(289);
					match(SEMICOLON);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << ALTER) | (1L << CALL) | (1L << CANCEL))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (CREATE - 91)) | (1L << (DELETE - 91)) | (1L << (DESC - 91)) | (1L << (DESCRIBE - 91)) | (1L << (DROP - 91)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (EXPLAIN - 164)) | (1L << (EXPORT - 164)) | (1L << (INSERT - 164)))) != 0) || _la==LOAD || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (PAUSE - 327)) | (1L << (REFRESH - 327)) | (1L << (REPLACE - 327)) | (1L << (RESUME - 327)))) != 0) || ((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (SELECT - 393)) | (1L << (SET - 393)) | (1L << (SHOW - 393)))) != 0) || ((((_la - 460)) & ~0x3f) == 0 && ((1L << (_la - 460)) & ((1L << (UPDATE - 460)) | (1L << (USE - 460)) | (1L << (VALUES - 460)) | (1L << (WITH - 460)))) != 0) );
			setState(299);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DorisParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(DorisParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DorisParser.SEMICOLON, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			statement();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(302);
				match(SEMICOLON);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowCreateProcedureContext extends StatementContext {
		public MultipartIdentifierContext name;
		public TerminalNode SHOW() { return getToken(DorisParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(DorisParser.PROCEDURE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowCreateProcedureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterShowCreateProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitShowCreateProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitShowCreateProcedure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBaseAliasContext extends StatementContext {
		public StatementBaseContext statementBase() {
			return getRuleContext(StatementBaseContext.class,0);
		}
		public StatementBaseAliasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStatementBaseAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStatementBaseAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStatementBaseAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowProcedureStatusContext extends StatementContext {
		public ValueExpressionContext pattern;
		public TerminalNode SHOW() { return getToken(DorisParser.SHOW, 0); }
		public TerminalNode PROCEDURE() { return getToken(DorisParser.PROCEDURE, 0); }
		public TerminalNode STATUS() { return getToken(DorisParser.STATUS, 0); }
		public TerminalNode LIKE() { return getToken(DorisParser.LIKE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ShowProcedureStatusContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterShowProcedureStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitShowProcedureStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitShowProcedureStatus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateProcedureContext extends StatementContext {
		public MultipartIdentifierContext name;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode PROCEDURE() { return getToken(DorisParser.PROCEDURE, 0); }
		public TerminalNode PROC() { return getToken(DorisParser.PROC, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(DorisParser.ALTER, 0); }
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(DorisParser.REPLACE, 0); }
		public TerminalNode OR() { return getToken(DorisParser.OR, 0); }
		public CreateProcedureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateProcedure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallProcedureContext extends StatementContext {
		public MultipartIdentifierContext name;
		public TerminalNode CALL() { return getToken(DorisParser.CALL, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public CallProcedureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCallProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCallProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCallProcedure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropProcedureContext extends StatementContext {
		public MultipartIdentifierContext name;
		public TerminalNode DROP() { return getToken(DorisParser.DROP, 0); }
		public TerminalNode PROCEDURE() { return getToken(DorisParser.PROCEDURE, 0); }
		public TerminalNode PROC() { return getToken(DorisParser.PROC, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public DropProcedureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDropProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDropProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDropProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new StatementBaseAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				statementBase();
				}
				break;
			case 2:
				_localctx = new CallProcedureContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(CALL);
				setState(312);
				((CallProcedureContext)_localctx).name = multipartIdentifier();
				setState(313);
				match(LEFT_PAREN);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXISTS - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NOT - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (LOGICALNOT - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
					{
					setState(314);
					expression();
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(315);
						match(COMMA);
						setState(316);
						expression();
						}
						}
						setState(321);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(324);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new CreateProcedureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALTER:
					{
					setState(326);
					match(ALTER);
					}
					break;
				case CREATE:
					{
					setState(327);
					match(CREATE);
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OR) {
						{
						setState(328);
						match(OR);
						setState(329);
						match(REPLACE);
						}
					}

					}
					break;
				case REPLACE:
					{
					setState(332);
					match(REPLACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==PROC || _la==PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				((CreateProcedureContext)_localctx).name = multipartIdentifier();
				setState(337);
				match(LEFT_PAREN);
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(338);
						matchWildcard();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(344);
				match(RIGHT_PAREN);
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(345);
						matchWildcard();
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new DropProcedureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(DROP);
				setState(352);
				_la = _input.LA(1);
				if ( !(_la==PROC || _la==PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(353);
					match(IF);
					setState(354);
					match(EXISTS);
					}
				}

				setState(357);
				((DropProcedureContext)_localctx).name = multipartIdentifier();
				}
				break;
			case 5:
				_localctx = new ShowProcedureStatusContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(SHOW);
				setState(359);
				match(PROCEDURE);
				setState(360);
				match(STATUS);
				setState(364);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIKE:
					{
					setState(361);
					match(LIKE);
					setState(362);
					((ShowProcedureStatusContext)_localctx).pattern = valueExpression(0);
					}
					break;
				case WHERE:
					{
					setState(363);
					whereClause();
					}
					break;
				case EOF:
				case SEMICOLON:
				case LEFT_PAREN:
				case ALTER:
				case CALL:
				case CANCEL:
				case CREATE:
				case DELETE:
				case DESC:
				case DESCRIBE:
				case DROP:
				case EXPLAIN:
				case EXPORT:
				case INSERT:
				case LOAD:
				case PAUSE:
				case REFRESH:
				case REPLACE:
				case RESUME:
				case SELECT:
				case SET:
				case SHOW:
				case UPDATE:
				case USE:
				case VALUES:
				case WITH:
					break;
				default:
					break;
				}
				}
				break;
			case 6:
				_localctx = new ShowCreateProcedureContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
				match(SHOW);
				setState(367);
				match(CREATE);
				setState(368);
				match(PROCEDURE);
				setState(369);
				((ShowCreateProcedureContext)_localctx).name = multipartIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBaseContext extends ParserRuleContext {
		public StatementBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBase; }
	 
		public StatementBaseContext() { }
		public void copyFrom(StatementBaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RefreshMTMVContext extends StatementBaseContext {
		public MultipartIdentifierContext mvName;
		public TerminalNode REFRESH() { return getToken(DorisParser.REFRESH, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COMPLETE() { return getToken(DorisParser.COMPLETE, 0); }
		public TerminalNode AUTO() { return getToken(DorisParser.AUTO, 0); }
		public RefreshMTMVContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRefreshMTMV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRefreshMTMV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRefreshMTMV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementBaseContext {
		public MultipartIdentifierContext name;
		public IdentifierListContext ctasCols;
		public IdentifierContext engine;
		public IdentifierListContext keys;
		public IdentifierListContext clusterKeys;
		public PartitionTableContext partition;
		public IdentifierListContext hashKeys;
		public Token autoBucket;
		public PropertyClauseContext properties;
		public PropertyClauseContext extProperties;
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(DorisParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public TerminalNode ENGINE() { return getToken(DorisParser.ENGINE, 0); }
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(DorisParser.DISTRIBUTED, 0); }
		public List<TerminalNode> BY() { return getTokens(DorisParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DorisParser.BY, i);
		}
		public TerminalNode ROLLUP() { return getToken(DorisParser.ROLLUP, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DorisParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DorisParser.LEFT_PAREN, i);
		}
		public RollupDefsContext rollupDefs() {
			return getRuleContext(RollupDefsContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DorisParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DorisParser.RIGHT_PAREN, i);
		}
		public TerminalNode BROKER() { return getToken(DorisParser.BROKER, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnDefsContext columnDefs() {
			return getRuleContext(ColumnDefsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AGGREGATE() { return getToken(DorisParser.AGGREGATE, 0); }
		public TerminalNode UNIQUE() { return getToken(DorisParser.UNIQUE, 0); }
		public TerminalNode DUPLICATE() { return getToken(DorisParser.DUPLICATE, 0); }
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public PartitionTableContext partitionTable() {
			return getRuleContext(PartitionTableContext.class,0);
		}
		public List<PropertyClauseContext> propertyClause() {
			return getRuleContexts(PropertyClauseContext.class);
		}
		public PropertyClauseContext propertyClause(int i) {
			return getRuleContext(PropertyClauseContext.class,i);
		}
		public TerminalNode HASH() { return getToken(DorisParser.HASH, 0); }
		public TerminalNode RANDOM() { return getToken(DorisParser.RANDOM, 0); }
		public TerminalNode CLUSTER() { return getToken(DorisParser.CLUSTER, 0); }
		public TerminalNode BUCKETS() { return getToken(DorisParser.BUCKETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public IndexDefsContext indexDefs() {
			return getRuleContext(IndexDefsContext.class,0);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode AUTO() { return getToken(DorisParser.AUTO, 0); }
		public CreateTableContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterMTMVContext extends StatementBaseContext {
		public MultipartIdentifierContext mvName;
		public IdentifierContext newName;
		public PropertyItemListContext fileProperties;
		public TerminalNode ALTER() { return getToken(DorisParser.ALTER, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(DorisParser.RENAME, 0); }
		public TerminalNode REFRESH() { return getToken(DorisParser.REFRESH, 0); }
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public RefreshMethodContext refreshMethod() {
			return getRuleContext(RefreshMethodContext.class,0);
		}
		public RefreshTriggerContext refreshTrigger() {
			return getRuleContext(RefreshTriggerContext.class,0);
		}
		public AlterMTMVContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAlterMTMV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAlterMTMV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAlterMTMV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertTableContext extends StatementBaseContext {
		public MultipartIdentifierContext tableName;
		public Token tableId;
		public IdentifierContext labelName;
		public IdentifierListContext cols;
		public IdentifierSeqContext hints;
		public TerminalNode INSERT() { return getToken(DorisParser.INSERT, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public TerminalNode OVERWRITE() { return getToken(DorisParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public TerminalNode DORIS_INTERNAL_TABLE_ID() { return getToken(DorisParser.DORIS_INTERNAL_TABLE_ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode LABEL() { return getToken(DorisParser.LABEL, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public InsertTableContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInsertTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInsertTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInsertTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropConstraintContext extends StatementBaseContext {
		public MultipartIdentifierContext table;
		public ErrorCapturingIdentifierContext constraintName;
		public TerminalNode ALTER() { return getToken(DorisParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(DorisParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DorisParser.CONSTRAINT, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public DropConstraintContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDropConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDropConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddConstraintContext extends StatementBaseContext {
		public MultipartIdentifierContext table;
		public ErrorCapturingIdentifierContext constraintName;
		public TerminalNode ALTER() { return getToken(DorisParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(DorisParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DorisParser.CONSTRAINT, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public AddConstraintContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAddConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAddConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAddConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementBaseContext {
		public MultipartIdentifierContext name;
		public MultipartIdentifierContext existedTable;
		public IdentifierListContext rollupNames;
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(DorisParser.LIKE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode EXTERNAL() { return getToken(DorisParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(DorisParser.ROLLUP, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public CreateTableLikeContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateContext extends StatementBaseContext {
		public MultipartIdentifierContext tableName;
		public TerminalNode UPDATE() { return getToken(DorisParser.UPDATE, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public UpdateAssignmentSeqContext updateAssignmentSeq() {
			return getRuleContext(UpdateAssignmentSeqContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PauseMTMVContext extends StatementBaseContext {
		public MultipartIdentifierContext mvName;
		public TerminalNode PAUSE() { return getToken(DorisParser.PAUSE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode JOB() { return getToken(DorisParser.JOB, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PauseMTMVContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPauseMTMV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPauseMTMV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPauseMTMV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropMTMVContext extends StatementBaseContext {
		public MultipartIdentifierContext mvName;
		public TerminalNode DROP() { return getToken(DorisParser.DROP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public DropMTMVContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDropMTMV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDropMTMV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDropMTMV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementBaseContext {
		public MultipartIdentifierContext tableName;
		public TerminalNode DELETE() { return getToken(DorisParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRowPolicyContext extends StatementBaseContext {
		public IdentifierContext name;
		public MultipartIdentifierContext table;
		public Token type;
		public UserIdentifyContext user;
		public IdentifierContext roleName;
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode ROW() { return getToken(DorisParser.ROW, 0); }
		public TerminalNode POLICY() { return getToken(DorisParser.POLICY, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public TerminalNode TO() { return getToken(DorisParser.TO, 0); }
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RESTRICTIVE() { return getToken(DorisParser.RESTRICTIVE, 0); }
		public TerminalNode PERMISSIVE() { return getToken(DorisParser.PERMISSIVE, 0); }
		public TerminalNode ROLE() { return getToken(DorisParser.ROLE, 0); }
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public UserIdentifyContext userIdentify() {
			return getRuleContext(UserIdentifyContext.class,0);
		}
		public CreateRowPolicyContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateRowPolicy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateRowPolicy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateRowPolicy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MysqlLoadContext extends StatementBaseContext {
		public PropertyItemListContext properties;
		public TerminalNode LOAD() { return getToken(DorisParser.LOAD, 0); }
		public MysqlDataDescContext mysqlDataDesc() {
			return getRuleContext(MysqlDataDescContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public MysqlLoadContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMysqlLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMysqlLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMysqlLoad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowConstraintContext extends StatementBaseContext {
		public MultipartIdentifierContext table;
		public TerminalNode SHOW() { return getToken(DorisParser.SHOW, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(DorisParser.CONSTRAINTS, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowConstraintContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterShowConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitShowConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitShowConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewContext extends StatementBaseContext {
		public MultipartIdentifierContext name;
		public SimpleColumnDefsContext cols;
		public TerminalNode ALTER() { return getToken(DorisParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SimpleColumnDefsContext simpleColumnDefs() {
			return getRuleContext(SimpleColumnDefsContext.class,0);
		}
		public AlterViewContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAlterView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAlterView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAlterView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsupportedContext extends StatementBaseContext {
		public UnsupportedStatementContext unsupportedStatement() {
			return getRuleContext(UnsupportedStatementContext.class,0);
		}
		public UnsupportedContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUnsupported(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUnsupported(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUnsupported(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadContext extends StatementBaseContext {
		public IdentifierContext lableName;
		public DataDescContext dataDesc;
		public List<DataDescContext> dataDescs = new ArrayList<DataDescContext>();
		public PropertyItemListContext properties;
		public TerminalNode LOAD() { return getToken(DorisParser.LOAD, 0); }
		public TerminalNode LABEL() { return getToken(DorisParser.LABEL, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DorisParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DorisParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DorisParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DorisParser.RIGHT_PAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<DataDescContext> dataDesc() {
			return getRuleContexts(DataDescContext.class);
		}
		public DataDescContext dataDesc(int i) {
			return getRuleContext(DataDescContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public WithRemoteStorageSystemContext withRemoteStorageSystem() {
			return getRuleContext(WithRemoteStorageSystemContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public LoadContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementBaseContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public OutFileClauseContext outFileClause() {
			return getRuleContext(OutFileClauseContext.class,0);
		}
		public StatementDefaultContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMTMVContext extends StatementBaseContext {
		public MultipartIdentifierContext mvName;
		public SimpleColumnDefsContext cols;
		public IdentifierListContext keys;
		public IdentifierContext partitionKey;
		public IdentifierListContext hashKeys;
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DorisParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DorisParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DorisParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DorisParser.RIGHT_PAREN, i);
		}
		public BuildModeContext buildMode() {
			return getRuleContext(BuildModeContext.class,0);
		}
		public TerminalNode REFRESH() { return getToken(DorisParser.REFRESH, 0); }
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(DorisParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DorisParser.BY, i);
		}
		public TerminalNode DISTRIBUTED() { return getToken(DorisParser.DISTRIBUTED, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public SimpleColumnDefsContext simpleColumnDefs() {
			return getRuleContext(SimpleColumnDefsContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode HASH() { return getToken(DorisParser.HASH, 0); }
		public TerminalNode RANDOM() { return getToken(DorisParser.RANDOM, 0); }
		public RefreshMethodContext refreshMethod() {
			return getRuleContext(RefreshMethodContext.class,0);
		}
		public RefreshTriggerContext refreshTrigger() {
			return getRuleContext(RefreshTriggerContext.class,0);
		}
		public TerminalNode DUPLICATE() { return getToken(DorisParser.DUPLICATE, 0); }
		public TerminalNode BUCKETS() { return getToken(DorisParser.BUCKETS, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode AUTO() { return getToken(DorisParser.AUTO, 0); }
		public CreateMTMVContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateMTMV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateMTMV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateMTMV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResumeMTMVContext extends StatementBaseContext {
		public MultipartIdentifierContext mvName;
		public TerminalNode RESUME() { return getToken(DorisParser.RESUME, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode JOB() { return getToken(DorisParser.JOB, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ResumeMTMVContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterResumeMTMV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitResumeMTMV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitResumeMTMV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CancelMTMVTaskContext extends StatementBaseContext {
		public Token taskId;
		public MultipartIdentifierContext mvName;
		public TerminalNode CANCEL() { return getToken(DorisParser.CANCEL, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode TASK() { return getToken(DorisParser.TASK, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public CancelMTMVTaskContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCancelMTMVTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCancelMTMVTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCancelMTMVTask(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementBaseContext {
		public MultipartIdentifierContext name;
		public SimpleColumnDefsContext cols;
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public SimpleColumnDefsContext simpleColumnDefs() {
			return getRuleContext(SimpleColumnDefsContext.class,0);
		}
		public CreateViewContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportContext extends StatementBaseContext {
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public Token filePath;
		public TerminalNode EXPORT() { return getToken(DorisParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public TerminalNode TO() { return getToken(DorisParser.TO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public WithRemoteStorageSystemContext withRemoteStorageSystem() {
			return getRuleContext(WithRemoteStorageSystemContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExportContext(StatementBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBaseContext statementBase() throws RecognitionException {
		StatementBaseContext _localctx = new StatementBaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementBase);
		int _la;
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DESC - 129)) | (1L << (DESCRIBE - 129)) | (1L << (EXPLAIN - 129)))) != 0)) {
					{
					setState(372);
					explain();
					}
				}

				setState(375);
				query();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(376);
					outFileClause();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateRowPolicyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(CREATE);
				setState(380);
				match(ROW);
				setState(381);
				match(POLICY);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(382);
					match(IF);
					setState(383);
					match(NOT);
					setState(384);
					match(EXISTS);
					}
				}

				setState(387);
				((CreateRowPolicyContext)_localctx).name = identifier();
				setState(388);
				match(ON);
				setState(389);
				((CreateRowPolicyContext)_localctx).table = multipartIdentifier();
				setState(390);
				match(AS);
				setState(391);
				((CreateRowPolicyContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PERMISSIVE || _la==RESTRICTIVE) ) {
					((CreateRowPolicyContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(392);
				match(TO);
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case ARRAY_RANGE:
				case AT:
				case AUTHORS:
				case AUTO_INCREMENT:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BELONG:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case BULK:
				case CACHED:
				case CALL:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLLECT:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONSTRAINTS:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DUAL:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GENERIC:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IPV4:
				case IPV6:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MANUAL:
				case MAP:
				case MATCH_ALL:
				case MATCH_ANY:
				case MATCH_ELEMENT_EQ:
				case MATCH_ELEMENT_GE:
				case MATCH_ELEMENT_GT:
				case MATCH_ELEMENT_LE:
				case MATCH_ELEMENT_LT:
				case MATCH_PHRASE:
				case MATCH_PHRASE_EDGE:
				case MATCH_PHRASE_PREFIX:
				case MATCH_REGEXP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PARTITIONS:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PROCESS:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VARIANT:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case STRING_LITERAL:
				case LEADING_STRING:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(393);
					((CreateRowPolicyContext)_localctx).user = userIdentify();
					}
					break;
				case ROLE:
					{
					setState(394);
					match(ROLE);
					setState(395);
					((CreateRowPolicyContext)_localctx).roleName = identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398);
				match(USING);
				setState(399);
				match(LEFT_PAREN);
				setState(400);
				booleanExpression(0);
				setState(401);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(CREATE);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTERNAL) {
					{
					setState(404);
					match(EXTERNAL);
					}
				}

				setState(407);
				match(TABLE);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(408);
					match(IF);
					setState(409);
					match(NOT);
					setState(410);
					match(EXISTS);
					}
				}

				setState(413);
				((CreateTableContext)_localctx).name = multipartIdentifier();
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(414);
						((CreateTableContext)_localctx).ctasCols = identifierList();
						}
						break;
					}
					}
					break;
				case 2:
					{
					{
					setState(417);
					match(LEFT_PAREN);
					setState(418);
					columnDefs();
					setState(421);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(419);
						match(COMMA);
						setState(420);
						indexDefs();
						}
						break;
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(423);
						match(COMMA);
						}
					}

					setState(426);
					match(RIGHT_PAREN);
					}
					}
					break;
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(430);
					match(ENGINE);
					setState(431);
					match(EQ);
					setState(432);
					((CreateTableContext)_localctx).engine = identifier();
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AGGREGATE || _la==DUPLICATE || _la==UNIQUE) {
					{
					setState(435);
					_la = _input.LA(1);
					if ( !(_la==AGGREGATE || _la==DUPLICATE || _la==UNIQUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(436);
					match(KEY);
					setState(437);
					((CreateTableContext)_localctx).keys = identifierList();
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLUSTER) {
						{
						setState(438);
						match(CLUSTER);
						setState(439);
						match(BY);
						setState(440);
						((CreateTableContext)_localctx).clusterKeys = identifierList();
						}
					}

					}
				}

				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(445);
					match(COMMENT);
					setState(446);
					match(STRING_LITERAL);
					}
				}

				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTO || _la==PARTITION) {
					{
					setState(449);
					((CreateTableContext)_localctx).partition = partitionTable();
					}
				}

				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTRIBUTED) {
					{
					setState(452);
					match(DISTRIBUTED);
					setState(453);
					match(BY);
					setState(457);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(454);
						match(HASH);
						setState(455);
						((CreateTableContext)_localctx).hashKeys = identifierList();
						}
						break;
					case RANDOM:
						{
						setState(456);
						match(RANDOM);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BUCKETS) {
						{
						setState(459);
						match(BUCKETS);
						setState(462);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INTEGER_VALUE:
							{
							setState(460);
							match(INTEGER_VALUE);
							}
							break;
						case AUTO:
							{
							setState(461);
							((CreateTableContext)_localctx).autoBucket = match(AUTO);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
					}

					}
				}

				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROLLUP) {
					{
					setState(468);
					match(ROLLUP);
					setState(469);
					match(LEFT_PAREN);
					setState(470);
					rollupDefs();
					setState(471);
					match(RIGHT_PAREN);
					}
				}

				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(475);
					((CreateTableContext)_localctx).properties = propertyClause();
					}
				}

				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BROKER) {
					{
					setState(478);
					match(BROKER);
					setState(479);
					((CreateTableContext)_localctx).extProperties = propertyClause();
					}
				}

				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(482);
					match(AS);
					setState(483);
					query();
					}
				}

				}
				break;
			case 4:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				match(CREATE);
				setState(487);
				match(VIEW);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(488);
					match(IF);
					setState(489);
					match(NOT);
					setState(490);
					match(EXISTS);
					}
				}

				setState(493);
				((CreateViewContext)_localctx).name = multipartIdentifier();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(494);
					match(LEFT_PAREN);
					setState(495);
					((CreateViewContext)_localctx).cols = simpleColumnDefs();
					setState(496);
					match(RIGHT_PAREN);
					}
				}

				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(500);
					match(COMMENT);
					setState(501);
					match(STRING_LITERAL);
					}
				}

				setState(504);
				match(AS);
				setState(505);
				query();
				}
				break;
			case 5:
				_localctx = new AlterViewContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
				match(ALTER);
				setState(508);
				match(VIEW);
				setState(509);
				((AlterViewContext)_localctx).name = multipartIdentifier();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(510);
					match(LEFT_PAREN);
					setState(511);
					((AlterViewContext)_localctx).cols = simpleColumnDefs();
					setState(512);
					match(RIGHT_PAREN);
					}
				}

				setState(516);
				match(AS);
				setState(517);
				query();
				}
				break;
			case 6:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				match(CREATE);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTERNAL) {
					{
					setState(520);
					match(EXTERNAL);
					}
				}

				setState(523);
				match(TABLE);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(524);
					match(IF);
					setState(525);
					match(NOT);
					setState(526);
					match(EXISTS);
					}
				}

				setState(529);
				((CreateTableLikeContext)_localctx).name = multipartIdentifier();
				setState(530);
				match(LIKE);
				setState(531);
				((CreateTableLikeContext)_localctx).existedTable = multipartIdentifier();
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(532);
					match(WITH);
					setState(533);
					match(ROLLUP);
					setState(535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(534);
						((CreateTableLikeContext)_localctx).rollupNames = identifierList();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new InsertTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DESC - 129)) | (1L << (DESCRIBE - 129)) | (1L << (EXPLAIN - 129)))) != 0)) {
					{
					setState(539);
					explain();
					}
				}

				setState(542);
				match(INSERT);
				setState(546);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTO:
					{
					setState(543);
					match(INTO);
					}
					break;
				case OVERWRITE:
					{
					setState(544);
					match(OVERWRITE);
					setState(545);
					match(TABLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(548);
					((InsertTableContext)_localctx).tableName = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(549);
					match(DORIS_INTERNAL_TABLE_ID);
					setState(550);
					match(LEFT_PAREN);
					setState(551);
					((InsertTableContext)_localctx).tableId = match(INTEGER_VALUE);
					setState(552);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION || _la==PARTITIONS || _la==TEMPORARY) {
					{
					setState(555);
					partitionSpec();
					}
				}

				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(558);
					match(WITH);
					setState(559);
					match(LABEL);
					setState(560);
					((InsertTableContext)_localctx).labelName = identifier();
					}
					break;
				}
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(563);
					((InsertTableContext)_localctx).cols = identifierList();
					}
					break;
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_BRACKET) {
					{
					setState(566);
					match(LEFT_BRACKET);
					setState(567);
					((InsertTableContext)_localctx).hints = identifierSeq();
					setState(568);
					match(RIGHT_BRACKET);
					}
				}

				setState(572);
				query();
				}
				break;
			case 8:
				_localctx = new UpdateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DESC - 129)) | (1L << (DESCRIBE - 129)) | (1L << (EXPLAIN - 129)))) != 0)) {
					{
					setState(573);
					explain();
					}
				}

				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(576);
					cte();
					}
				}

				setState(579);
				match(UPDATE);
				setState(580);
				((UpdateContext)_localctx).tableName = multipartIdentifier();
				setState(581);
				tableAlias();
				setState(582);
				match(SET);
				setState(583);
				updateAssignmentSeq();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(584);
					fromClause();
					}
				}

				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(587);
					whereClause();
					}
				}

				}
				break;
			case 9:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DESC - 129)) | (1L << (DESCRIBE - 129)) | (1L << (EXPLAIN - 129)))) != 0)) {
					{
					setState(590);
					explain();
					}
				}

				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(593);
					cte();
					}
				}

				setState(596);
				match(DELETE);
				setState(597);
				match(FROM);
				setState(598);
				((DeleteContext)_localctx).tableName = multipartIdentifier();
				setState(600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(599);
					partitionSpec();
					}
					break;
				}
				setState(602);
				tableAlias();
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(603);
					match(USING);
					setState(604);
					relations();
					}
				}

				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(607);
					whereClause();
					}
				}

				}
				break;
			case 10:
				_localctx = new LoadContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(610);
				match(LOAD);
				setState(611);
				match(LABEL);
				setState(612);
				((LoadContext)_localctx).lableName = identifier();
				setState(613);
				match(LEFT_PAREN);
				setState(614);
				((LoadContext)_localctx).dataDesc = dataDesc();
				((LoadContext)_localctx).dataDescs.add(((LoadContext)_localctx).dataDesc);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(615);
					match(COMMA);
					setState(616);
					((LoadContext)_localctx).dataDesc = dataDesc();
					((LoadContext)_localctx).dataDescs.add(((LoadContext)_localctx).dataDesc);
					}
					}
					setState(621);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(622);
				match(RIGHT_PAREN);
				setState(624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(623);
					withRemoteStorageSystem();
					}
					break;
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(626);
					match(PROPERTIES);
					setState(627);
					match(LEFT_PAREN);
					setState(628);
					((LoadContext)_localctx).properties = propertyItemList();
					setState(629);
					match(RIGHT_PAREN);
					}
				}

				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(633);
					commentSpec();
					}
				}

				}
				break;
			case 11:
				_localctx = new MysqlLoadContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(636);
				match(LOAD);
				setState(637);
				mysqlDataDesc();
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(638);
					match(PROPERTIES);
					setState(639);
					match(LEFT_PAREN);
					setState(640);
					((MysqlLoadContext)_localctx).properties = propertyItemList();
					setState(641);
					match(RIGHT_PAREN);
					}
				}

				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(645);
					commentSpec();
					}
				}

				}
				break;
			case 12:
				_localctx = new ExportContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(648);
				match(EXPORT);
				setState(649);
				match(TABLE);
				setState(650);
				((ExportContext)_localctx).tableName = multipartIdentifier();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(651);
					match(PARTITION);
					setState(652);
					((ExportContext)_localctx).partition = identifierList();
					}
				}

				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(655);
					whereClause();
					}
				}

				setState(658);
				match(TO);
				setState(659);
				((ExportContext)_localctx).filePath = match(STRING_LITERAL);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(660);
					propertyClause();
					}
				}

				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(663);
					withRemoteStorageSystem();
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new CreateMTMVContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(666);
				match(CREATE);
				setState(667);
				match(MATERIALIZED);
				setState(668);
				match(VIEW);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(669);
					match(IF);
					setState(670);
					match(NOT);
					setState(671);
					match(EXISTS);
					}
				}

				setState(674);
				((CreateMTMVContext)_localctx).mvName = multipartIdentifier();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(675);
					match(LEFT_PAREN);
					setState(676);
					((CreateMTMVContext)_localctx).cols = simpleColumnDefs();
					setState(677);
					match(RIGHT_PAREN);
					}
				}

				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BUILD) {
					{
					setState(681);
					buildMode();
					}
				}

				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REFRESH) {
					{
					setState(684);
					match(REFRESH);
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AUTO || _la==COMPLETE) {
						{
						setState(685);
						refreshMethod();
						}
					}

					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(688);
						refreshTrigger();
						}
					}

					}
				}

				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DUPLICATE || _la==KEY) {
					{
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DUPLICATE) {
						{
						setState(693);
						match(DUPLICATE);
						}
					}

					setState(696);
					match(KEY);
					setState(697);
					((CreateMTMVContext)_localctx).keys = identifierList();
					}
				}

				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(700);
					match(COMMENT);
					setState(701);
					match(STRING_LITERAL);
					}
				}

				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(704);
					match(PARTITION);
					setState(705);
					match(BY);
					setState(706);
					match(LEFT_PAREN);
					setState(707);
					((CreateMTMVContext)_localctx).partitionKey = identifier();
					setState(708);
					match(RIGHT_PAREN);
					}
				}

				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTRIBUTED) {
					{
					setState(712);
					match(DISTRIBUTED);
					setState(713);
					match(BY);
					setState(717);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(714);
						match(HASH);
						setState(715);
						((CreateMTMVContext)_localctx).hashKeys = identifierList();
						}
						break;
					case RANDOM:
						{
						setState(716);
						match(RANDOM);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BUCKETS) {
						{
						setState(719);
						match(BUCKETS);
						setState(720);
						_la = _input.LA(1);
						if ( !(_la==AUTO || _la==INTEGER_VALUE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
				}

				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(725);
					propertyClause();
					}
				}

				setState(728);
				match(AS);
				setState(729);
				query();
				}
				break;
			case 14:
				_localctx = new RefreshMTMVContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(731);
				match(REFRESH);
				setState(732);
				match(MATERIALIZED);
				setState(733);
				match(VIEW);
				setState(734);
				((RefreshMTMVContext)_localctx).mvName = multipartIdentifier();
				setState(738);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PARTITION:
				case PARTITIONS:
				case TEMPORARY:
					{
					setState(735);
					partitionSpec();
					}
					break;
				case COMPLETE:
					{
					setState(736);
					match(COMPLETE);
					}
					break;
				case AUTO:
					{
					setState(737);
					match(AUTO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new AlterMTMVContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(740);
				match(ALTER);
				setState(741);
				match(MATERIALIZED);
				setState(742);
				match(VIEW);
				setState(743);
				((AlterMTMVContext)_localctx).mvName = multipartIdentifier();
				setState(759);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RENAME:
					{
					{
					setState(744);
					match(RENAME);
					setState(745);
					((AlterMTMVContext)_localctx).newName = identifier();
					}
					}
					break;
				case REFRESH:
					{
					{
					setState(746);
					match(REFRESH);
					setState(752);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(747);
						refreshMethod();
						}
						break;
					case 2:
						{
						setState(748);
						refreshTrigger();
						}
						break;
					case 3:
						{
						setState(749);
						refreshMethod();
						setState(750);
						refreshTrigger();
						}
						break;
					}
					}
					}
					break;
				case SET:
					{
					{
					setState(754);
					match(SET);
					setState(755);
					match(LEFT_PAREN);
					setState(756);
					((AlterMTMVContext)_localctx).fileProperties = propertyItemList();
					setState(757);
					match(RIGHT_PAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 16:
				_localctx = new DropMTMVContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(761);
				match(DROP);
				setState(762);
				match(MATERIALIZED);
				setState(763);
				match(VIEW);
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(764);
					match(IF);
					setState(765);
					match(EXISTS);
					}
				}

				setState(768);
				((DropMTMVContext)_localctx).mvName = multipartIdentifier();
				}
				break;
			case 17:
				_localctx = new PauseMTMVContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(769);
				match(PAUSE);
				setState(770);
				match(MATERIALIZED);
				setState(771);
				match(VIEW);
				setState(772);
				match(JOB);
				setState(773);
				match(ON);
				setState(774);
				((PauseMTMVContext)_localctx).mvName = multipartIdentifier();
				}
				break;
			case 18:
				_localctx = new ResumeMTMVContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(775);
				match(RESUME);
				setState(776);
				match(MATERIALIZED);
				setState(777);
				match(VIEW);
				setState(778);
				match(JOB);
				setState(779);
				match(ON);
				setState(780);
				((ResumeMTMVContext)_localctx).mvName = multipartIdentifier();
				}
				break;
			case 19:
				_localctx = new CancelMTMVTaskContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(781);
				match(CANCEL);
				setState(782);
				match(MATERIALIZED);
				setState(783);
				match(VIEW);
				setState(784);
				match(TASK);
				setState(785);
				((CancelMTMVTaskContext)_localctx).taskId = match(INTEGER_VALUE);
				setState(786);
				match(ON);
				setState(787);
				((CancelMTMVTaskContext)_localctx).mvName = multipartIdentifier();
				}
				break;
			case 20:
				_localctx = new AddConstraintContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(788);
				match(ALTER);
				setState(789);
				match(TABLE);
				setState(790);
				((AddConstraintContext)_localctx).table = multipartIdentifier();
				setState(791);
				match(ADD);
				setState(792);
				match(CONSTRAINT);
				setState(793);
				((AddConstraintContext)_localctx).constraintName = errorCapturingIdentifier();
				setState(794);
				constraint();
				}
				break;
			case 21:
				_localctx = new DropConstraintContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(796);
				match(ALTER);
				setState(797);
				match(TABLE);
				setState(798);
				((DropConstraintContext)_localctx).table = multipartIdentifier();
				setState(799);
				match(DROP);
				setState(800);
				match(CONSTRAINT);
				setState(801);
				((DropConstraintContext)_localctx).constraintName = errorCapturingIdentifier();
				}
				break;
			case 22:
				_localctx = new ShowConstraintContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(803);
				match(SHOW);
				setState(804);
				match(CONSTRAINTS);
				setState(805);
				match(FROM);
				setState(806);
				((ShowConstraintContext)_localctx).table = multipartIdentifier();
				}
				break;
			case 23:
				_localctx = new UnsupportedContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(807);
				unsupportedStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedStatementContext extends ParserRuleContext {
		public UnsupportedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedStatement; }
	 
		public UnsupportedStatementContext() { }
		public void copyFrom(UnsupportedStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetTransactionContext extends UnsupportedStatementContext {
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(DorisParser.TRANSACTION, 0); }
		public TransactionAccessModeContext transactionAccessMode() {
			return getRuleContext(TransactionAccessModeContext.class,0);
		}
		public IsolationLevelContext isolationLevel() {
			return getRuleContext(IsolationLevelContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode GLOBAL() { return getToken(DorisParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public TerminalNode SESSION() { return getToken(DorisParser.SESSION, 0); }
		public SetTransactionContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseCloudClusterContext extends UnsupportedStatementContext {
		public IdentifierContext catalog;
		public IdentifierContext database;
		public IdentifierContext cluster;
		public TerminalNode USE() { return getToken(DorisParser.USE, 0); }
		public TerminalNode ATSIGN() { return getToken(DorisParser.ATSIGN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public UseCloudClusterContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUseCloudCluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUseCloudCluster(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUseCloudCluster(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCharsetContext extends UnsupportedStatementContext {
		public IdentifierOrTextContext charsetName;
		public List<TerminalNode> SET() { return getTokens(DorisParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(DorisParser.SET, i);
		}
		public TerminalNode CHAR() { return getToken(DorisParser.CHAR, 0); }
		public TerminalNode CHARSET() { return getToken(DorisParser.CHARSET, 0); }
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public SetCharsetContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetCharset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamesContext extends UnsupportedStatementContext {
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode NAMES() { return getToken(DorisParser.NAMES, 0); }
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetNamesContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetNames(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCollateContext extends UnsupportedStatementContext {
		public IdentifierOrTextContext charsetName;
		public IdentifierOrTextContext collateName;
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode NAMES() { return getToken(DorisParser.NAMES, 0); }
		public List<TerminalNode> DEFAULT() { return getTokens(DorisParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(DorisParser.DEFAULT, i);
		}
		public List<IdentifierOrTextContext> identifierOrText() {
			return getRuleContexts(IdentifierOrTextContext.class);
		}
		public IdentifierOrTextContext identifierOrText(int i) {
			return getRuleContext(IdentifierOrTextContext.class,i);
		}
		public TerminalNode COLLATE() { return getToken(DorisParser.COLLATE, 0); }
		public SetCollateContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetCollate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetCollate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetCollate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPasswordContext extends UnsupportedStatementContext {
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public List<TerminalNode> PASSWORD() { return getTokens(DorisParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(DorisParser.PASSWORD, i);
		}
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode FOR() { return getToken(DorisParser.FOR, 0); }
		public UserIdentifyContext userIdentify() {
			return getRuleContext(UserIdentifyContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SetPasswordContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetPassword(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSystemVariableWithTypeContext extends UnsupportedStatementContext {
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public TerminalNode GLOBAL() { return getToken(DorisParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public TerminalNode SESSION() { return getToken(DorisParser.SESSION, 0); }
		public SetSystemVariableWithTypeContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetSystemVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetSystemVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetSystemVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetUserPropertiesContext extends UnsupportedStatementContext {
		public IdentifierOrTextContext user;
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode PROPERTY() { return getToken(DorisParser.PROPERTY, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DorisParser.FOR, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public SetUserPropertiesContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetUserProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetUserProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetUserProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseDatabaseContext extends UnsupportedStatementContext {
		public IdentifierContext catalog;
		public IdentifierContext database;
		public TerminalNode USE() { return getToken(DorisParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public UseDatabaseContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUseDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUseDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUseDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSystemVariableWithoutTypeContext extends UnsupportedStatementContext {
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SetSystemVariableWithoutTypeContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetSystemVariableWithoutType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetSystemVariableWithoutType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetSystemVariableWithoutType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDefaultStorageVaultContext extends UnsupportedStatementContext {
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public TerminalNode STORAGE() { return getToken(DorisParser.STORAGE, 0); }
		public TerminalNode VAULT() { return getToken(DorisParser.VAULT, 0); }
		public SetDefaultStorageVaultContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetDefaultStorageVault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetDefaultStorageVault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetDefaultStorageVault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetLdapAdminPasswordContext extends UnsupportedStatementContext {
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode LDAP_ADMIN_PASSWORD() { return getToken(DorisParser.LDAP_ADMIN_PASSWORD, 0); }
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode PASSWORD() { return getToken(DorisParser.PASSWORD, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SetLdapAdminPasswordContext(UnsupportedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetLdapAdminPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetLdapAdminPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetLdapAdminPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedStatementContext unsupportedStatement() throws RecognitionException {
		UnsupportedStatementContext _localctx = new UnsupportedStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unsupportedStatement);
		int _la;
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new SetDefaultStorageVaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				match(SET);
				setState(811);
				identifier();
				setState(812);
				match(AS);
				setState(813);
				match(DEFAULT);
				setState(814);
				match(STORAGE);
				setState(815);
				match(VAULT);
				}
				break;
			case 2:
				_localctx = new SetUserPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(SET);
				setState(818);
				match(PROPERTY);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(819);
					match(FOR);
					setState(820);
					((SetUserPropertiesContext)_localctx).user = identifierOrText();
					}
				}

				setState(823);
				propertyItemList();
				}
				break;
			case 3:
				_localctx = new SetSystemVariableWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				match(SET);
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(825);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL || _la==SESSION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(828);
				identifier();
				setState(829);
				match(EQ);
				setState(832);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
				case LEFT_BRACKET:
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADD:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case ARRAY_RANGE:
				case AT:
				case AUTHORS:
				case AUTO_INCREMENT:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BELONG:
				case BIN:
				case BINARY:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case BULK:
				case CACHED:
				case CALL:
				case CASE:
				case CAST:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLLECT:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONSTRAINTS:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATA:
				case DATABASE:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DUAL:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXISTS:
				case EXPIRED:
				case EXTERNAL:
				case EXTRACT:
				case FAILED_LOGIN_ATTEMPTS:
				case FALSE:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GENERIC:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IF:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INTERVAL:
				case INVERTED:
				case IPV4:
				case IPV6:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case KEY:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LEFT:
				case LESS:
				case LEVEL:
				case LIKE:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MANUAL:
				case MAP:
				case MATCH_ALL:
				case MATCH_ANY:
				case MATCH_ELEMENT_EQ:
				case MATCH_ELEMENT_GE:
				case MATCH_ELEMENT_GT:
				case MATCH_ELEMENT_LE:
				case MATCH_ELEMENT_LT:
				case MATCH_PHRASE:
				case MATCH_PHRASE_EDGE:
				case MATCH_PHRASE_PREFIX:
				case MATCH_REGEXP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NOT:
				case NULL:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PARTITIONS:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PROCESS:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REGEXP:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RIGHT:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRIM:
				case TRUE:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VARIANT:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case PLUS:
				case SUBTRACT:
				case ASTERISK:
				case TILDE:
				case LOGICALNOT:
				case ATSIGN:
				case DOUBLEATSIGN:
				case STRING_LITERAL:
				case INTEGER_VALUE:
				case EXPONENT_VALUE:
				case DECIMAL_VALUE:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(830);
					expression();
					}
					break;
				case DEFAULT:
					{
					setState(831);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new SetSystemVariableWithoutTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(834);
				match(SET);
				setState(835);
				variable();
				}
				break;
			case 5:
				_localctx = new SetCharsetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				match(SET);
				setState(840);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
					{
					setState(837);
					match(CHAR);
					setState(838);
					match(SET);
					}
					break;
				case CHARSET:
					{
					setState(839);
					match(CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(844);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case ARRAY_RANGE:
				case AT:
				case AUTHORS:
				case AUTO_INCREMENT:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BELONG:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case BULK:
				case CACHED:
				case CALL:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLLECT:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONSTRAINTS:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DUAL:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GENERIC:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IPV4:
				case IPV6:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MANUAL:
				case MAP:
				case MATCH_ALL:
				case MATCH_ANY:
				case MATCH_ELEMENT_EQ:
				case MATCH_ELEMENT_GE:
				case MATCH_ELEMENT_GT:
				case MATCH_ELEMENT_LE:
				case MATCH_ELEMENT_LT:
				case MATCH_PHRASE:
				case MATCH_PHRASE_EDGE:
				case MATCH_PHRASE_PREFIX:
				case MATCH_REGEXP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PARTITIONS:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PROCESS:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VARIANT:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case STRING_LITERAL:
				case LEADING_STRING:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(842);
					((SetCharsetContext)_localctx).charsetName = identifierOrText();
					}
					break;
				case DEFAULT:
					{
					setState(843);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				_localctx = new SetNamesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(846);
				match(SET);
				setState(847);
				match(NAMES);
				setState(848);
				match(EQ);
				setState(849);
				expression();
				}
				break;
			case 7:
				_localctx = new SetTransactionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(850);
				match(SET);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL || _la==SESSION) {
					{
					setState(851);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL || _la==SESSION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(854);
				match(TRANSACTION);
				setState(865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(855);
					transactionAccessMode();
					}
					break;
				case 2:
					{
					setState(856);
					isolationLevel();
					}
					break;
				case 3:
					{
					setState(857);
					transactionAccessMode();
					setState(858);
					match(COMMA);
					setState(859);
					isolationLevel();
					}
					break;
				case 4:
					{
					setState(861);
					isolationLevel();
					setState(862);
					match(COMMA);
					setState(863);
					transactionAccessMode();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new SetCollateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(867);
				match(SET);
				setState(868);
				match(NAMES);
				setState(871);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case ARRAY_RANGE:
				case AT:
				case AUTHORS:
				case AUTO_INCREMENT:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BELONG:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case BULK:
				case CACHED:
				case CALL:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLLECT:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONSTRAINTS:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DUAL:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GENERIC:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IPV4:
				case IPV6:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MANUAL:
				case MAP:
				case MATCH_ALL:
				case MATCH_ANY:
				case MATCH_ELEMENT_EQ:
				case MATCH_ELEMENT_GE:
				case MATCH_ELEMENT_GT:
				case MATCH_ELEMENT_LE:
				case MATCH_ELEMENT_LT:
				case MATCH_PHRASE:
				case MATCH_PHRASE_EDGE:
				case MATCH_PHRASE_PREFIX:
				case MATCH_REGEXP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PARTITIONS:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PROCESS:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VARIANT:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case STRING_LITERAL:
				case LEADING_STRING:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(869);
					((SetCollateContext)_localctx).charsetName = identifierOrText();
					}
					break;
				case DEFAULT:
					{
					setState(870);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(876);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLLATE:
					{
					setState(873);
					match(COLLATE);
					setState(874);
					((SetCollateContext)_localctx).collateName = identifierOrText();
					}
					break;
				case DEFAULT:
					{
					setState(875);
					match(DEFAULT);
					}
					break;
				case EOF:
				case SEMICOLON:
				case LEFT_PAREN:
				case ALTER:
				case CALL:
				case CANCEL:
				case CREATE:
				case DELETE:
				case DESC:
				case DESCRIBE:
				case DROP:
				case EXPLAIN:
				case EXPORT:
				case INSERT:
				case LOAD:
				case PAUSE:
				case REFRESH:
				case REPLACE:
				case RESUME:
				case SELECT:
				case SET:
				case SHOW:
				case UPDATE:
				case USE:
				case VALUES:
				case WITH:
					break;
				default:
					break;
				}
				}
				break;
			case 9:
				_localctx = new SetPasswordContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(878);
				match(SET);
				setState(879);
				match(PASSWORD);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(880);
					match(FOR);
					setState(881);
					userIdentify();
					}
				}

				setState(884);
				match(EQ);
				setState(890);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(885);
					match(STRING_LITERAL);
					}
					break;
				case PASSWORD:
					{
					{
					setState(886);
					match(PASSWORD);
					setState(887);
					match(LEFT_PAREN);
					setState(888);
					match(STRING_LITERAL);
					setState(889);
					match(RIGHT_PAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				_localctx = new SetLdapAdminPasswordContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(892);
				match(SET);
				setState(893);
				match(LDAP_ADMIN_PASSWORD);
				setState(894);
				match(EQ);
				setState(900);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(895);
					match(STRING_LITERAL);
					}
					break;
				case PASSWORD:
					{
					{
					setState(896);
					match(PASSWORD);
					setState(897);
					match(LEFT_PAREN);
					setState(898);
					match(STRING_LITERAL);
					setState(899);
					match(RIGHT_PAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 11:
				_localctx = new UseDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(902);
				match(USE);
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(903);
					((UseDatabaseContext)_localctx).catalog = identifier();
					setState(904);
					match(DOT);
					}
					break;
				}
				setState(908);
				((UseDatabaseContext)_localctx).database = identifier();
				}
				break;
			case 12:
				_localctx = new UseCloudClusterContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(909);
				match(USE);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (LEFT_BRACE - 8)) | (1L << (RIGHT_BRACE - 8)) | (1L << (ADDDATE - 8)) | (1L << (AFTER - 8)) | (1L << (AGG_STATE - 8)) | (1L << (AGGREGATE - 8)) | (1L << (ALIAS - 8)) | (1L << (ANALYZED - 8)) | (1L << (ARRAY - 8)) | (1L << (ARRAY_RANGE - 8)) | (1L << (AT - 8)) | (1L << (AUTHORS - 8)) | (1L << (AUTO_INCREMENT - 8)) | (1L << (BACKENDS - 8)) | (1L << (BACKUP - 8)) | (1L << (BEGIN - 8)) | (1L << (BELONG - 8)) | (1L << (BIN - 8)) | (1L << (BITAND - 8)) | (1L << (BITMAP - 8)) | (1L << (BITMAP_UNION - 8)) | (1L << (BITOR - 8)) | (1L << (BITXOR - 8)) | (1L << (BLOB - 8)) | (1L << (BOOLEAN - 8)) | (1L << (BRIEF - 8)) | (1L << (BROKER - 8)) | (1L << (BUCKETS - 8)) | (1L << (BUILD - 8)) | (1L << (BUILTIN - 8)) | (1L << (BULK - 8)) | (1L << (CACHED - 8)) | (1L << (CALL - 8)) | (1L << (CATALOG - 8)) | (1L << (CATALOGS - 8)) | (1L << (CHAIN - 8)) | (1L << (CHAR - 8)) | (1L << (CHARSET - 8)) | (1L << (CHECK - 8)) | (1L << (CLUSTER - 8)) | (1L << (CLUSTERS - 8)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (COLLATION - 73)) | (1L << (COLLECT - 73)) | (1L << (COLUMNS - 73)) | (1L << (COMMENT - 73)) | (1L << (COMMIT - 73)) | (1L << (COMMITTED - 73)) | (1L << (COMPACT - 73)) | (1L << (COMPLETE - 73)) | (1L << (CONFIG - 73)) | (1L << (CONNECTION - 73)) | (1L << (CONNECTION_ID - 73)) | (1L << (CONSISTENT - 73)) | (1L << (CONSTRAINTS - 73)) | (1L << (CONVERT - 73)) | (1L << (COPY - 73)) | (1L << (COUNT - 73)) | (1L << (CREATION - 73)) | (1L << (CRON - 73)) | (1L << (CURRENT_CATALOG - 73)) | (1L << (CURRENT_DATE - 73)) | (1L << (CURRENT_TIME - 73)) | (1L << (CURRENT_TIMESTAMP - 73)) | (1L << (CURRENT_USER - 73)) | (1L << (DATA - 73)) | (1L << (DATE - 73)) | (1L << (DATE_ADD - 73)) | (1L << (DATE_CEIL - 73)) | (1L << (DATE_DIFF - 73)) | (1L << (DATE_FLOOR - 73)) | (1L << (DATE_SUB - 73)) | (1L << (DATEADD - 73)) | (1L << (DATEDIFF - 73)) | (1L << (DATETIME - 73)) | (1L << (DATETIMEV2 - 73)) | (1L << (DATEV2 - 73)) | (1L << (DATETIMEV1 - 73)) | (1L << (DATEV1 - 73)) | (1L << (DAY - 73)) | (1L << (DAYS_ADD - 73)) | (1L << (DAYS_SUB - 73)) | (1L << (DECIMAL - 73)) | (1L << (DECIMALV2 - 73)) | (1L << (DECIMALV3 - 73)) | (1L << (DEFERRED - 73)) | (1L << (DEMAND - 73)) | (1L << (DIAGNOSE - 73)) | (1L << (DISTINCTPC - 73)) | (1L << (DISTINCTPCSA - 73)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DO - 139)) | (1L << (DORIS_INTERNAL_TABLE_ID - 139)) | (1L << (DUAL - 139)) | (1L << (DYNAMIC - 139)) | (1L << (ENABLE - 139)) | (1L << (ENCRYPTKEY - 139)) | (1L << (ENCRYPTKEYS - 139)) | (1L << (END - 139)) | (1L << (ENDS - 139)) | (1L << (ENGINE - 139)) | (1L << (ENGINES - 139)) | (1L << (ERRORS - 139)) | (1L << (EVENTS - 139)) | (1L << (EVERY - 139)) | (1L << (EXCLUDE - 139)) | (1L << (EXPIRED - 139)) | (1L << (EXTERNAL - 139)) | (1L << (FAILED_LOGIN_ATTEMPTS - 139)) | (1L << (FAST - 139)) | (1L << (FEATURE - 139)) | (1L << (FIELDS - 139)) | (1L << (FILE - 139)) | (1L << (FILTER - 139)) | (1L << (FIRST - 139)) | (1L << (FORMAT - 139)) | (1L << (FREE - 139)) | (1L << (FRONTENDS - 139)) | (1L << (FUNCTION - 139)) | (1L << (GENERIC - 139)) | (1L << (GLOBAL - 139)) | (1L << (GRAPH - 139)) | (1L << (GROUPING - 139)) | (1L << (GROUPS - 139)) | (1L << (HASH - 139)) | (1L << (HDFS - 139)) | (1L << (HELP - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (HISTOGRAM - 203)) | (1L << (HLL_UNION - 203)) | (1L << (HOSTNAME - 203)) | (1L << (HOUR - 203)) | (1L << (HUB - 203)) | (1L << (IDENTIFIED - 203)) | (1L << (IGNORE - 203)) | (1L << (IMMEDIATE - 203)) | (1L << (INCREMENTAL - 203)) | (1L << (INDEXES - 203)) | (1L << (INVERTED - 203)) | (1L << (IPV4 - 203)) | (1L << (IPV6 - 203)) | (1L << (IS_NOT_NULL_PRED - 203)) | (1L << (IS_NULL_PRED - 203)) | (1L << (ISNULL - 203)) | (1L << (ISOLATION - 203)) | (1L << (JOB - 203)) | (1L << (JOBS - 203)) | (1L << (JSON - 203)) | (1L << (JSONB - 203)) | (1L << (LABEL - 203)) | (1L << (LAST - 203)) | (1L << (LDAP - 203)) | (1L << (LDAP_ADMIN_PASSWORD - 203)) | (1L << (LESS - 203)) | (1L << (LEVEL - 203)) | (1L << (LINES - 203)) | (1L << (LINK - 203)) | (1L << (LOCAL - 203)) | (1L << (LOCALTIME - 203)) | (1L << (LOCALTIMESTAMP - 203)) | (1L << (LOCATION - 203)) | (1L << (LOCK - 203)) | (1L << (LOGICAL - 203)) | (1L << (MANUAL - 203)) | (1L << (MAP - 203)))) != 0) || ((((_la - 268)) & ~0x3f) == 0 && ((1L << (_la - 268)) & ((1L << (MATCH_ALL - 268)) | (1L << (MATCH_ANY - 268)) | (1L << (MATCH_ELEMENT_EQ - 268)) | (1L << (MATCH_ELEMENT_GE - 268)) | (1L << (MATCH_ELEMENT_GT - 268)) | (1L << (MATCH_ELEMENT_LE - 268)) | (1L << (MATCH_ELEMENT_LT - 268)) | (1L << (MATCH_PHRASE - 268)) | (1L << (MATCH_PHRASE_EDGE - 268)) | (1L << (MATCH_PHRASE_PREFIX - 268)) | (1L << (MATCH_REGEXP - 268)) | (1L << (MATERIALIZED - 268)) | (1L << (MAX - 268)) | (1L << (MEMO - 268)) | (1L << (MERGE - 268)) | (1L << (MIGRATE - 268)) | (1L << (MIGRATIONS - 268)) | (1L << (MIN - 268)) | (1L << (MINUTE - 268)) | (1L << (MODIFY - 268)) | (1L << (MONTH - 268)) | (1L << (MTMV - 268)) | (1L << (NAME - 268)) | (1L << (NAMES - 268)) | (1L << (NEGATIVE - 268)) | (1L << (NEVER - 268)) | (1L << (NEXT - 268)) | (1L << (NGRAM_BF - 268)) | (1L << (NO - 268)) | (1L << (NON_NULLABLE - 268)) | (1L << (NULLS - 268)) | (1L << (OF - 268)) | (1L << (OFFSET - 268)) | (1L << (ONLY - 268)) | (1L << (OPEN - 268)) | (1L << (OPTIMIZED - 268)) | (1L << (PARAMETER - 268)) | (1L << (PARSED - 268)) | (1L << (PARTITIONS - 268)) | (1L << (PASSWORD - 268)) | (1L << (PASSWORD_EXPIRE - 268)) | (1L << (PASSWORD_HISTORY - 268)) | (1L << (PASSWORD_LOCK_TIME - 268)) | (1L << (PASSWORD_REUSE - 268)) | (1L << (PATH - 268)) | (1L << (PAUSE - 268)) | (1L << (PERCENT - 268)) | (1L << (PERIOD - 268)) | (1L << (PERMISSIVE - 268)) | (1L << (PHYSICAL - 268)))) != 0) || ((((_la - 332)) & ~0x3f) == 0 && ((1L << (_la - 332)) & ((1L << (PLAN - 332)) | (1L << (PROCESS - 332)) | (1L << (PLUGIN - 332)) | (1L << (PLUGINS - 332)) | (1L << (POLICY - 332)) | (1L << (PROC - 332)) | (1L << (PROCESSLIST - 332)) | (1L << (PROFILE - 332)) | (1L << (PROPERTIES - 332)) | (1L << (PROPERTY - 332)) | (1L << (QUANTILE_STATE - 332)) | (1L << (QUANTILE_UNION - 332)) | (1L << (QUERY - 332)) | (1L << (QUOTA - 332)) | (1L << (RANDOM - 332)) | (1L << (RECOVER - 332)) | (1L << (RECYCLE - 332)) | (1L << (REFRESH - 332)) | (1L << (REPEATABLE - 332)) | (1L << (REPLACE - 332)) | (1L << (REPLACE_IF_NOT_NULL - 332)) | (1L << (REPOSITORIES - 332)) | (1L << (REPOSITORY - 332)) | (1L << (RESOURCE - 332)) | (1L << (RESOURCES - 332)) | (1L << (RESTORE - 332)) | (1L << (RESTRICTIVE - 332)) | (1L << (RESUME - 332)) | (1L << (RETURNS - 332)) | (1L << (REWRITTEN - 332)) | (1L << (RLIKE - 332)) | (1L << (ROLLBACK - 332)) | (1L << (ROLLUP - 332)) | (1L << (ROUTINE - 332)) | (1L << (S3 - 332)) | (1L << (SAMPLE - 332)) | (1L << (SCHEDULE - 332)) | (1L << (SCHEDULER - 332)) | (1L << (SCHEMA - 332)) | (1L << (SECOND - 332)) | (1L << (SEQUENCE - 332)))) != 0) || ((((_la - 396)) & ~0x3f) == 0 && ((1L << (_la - 396)) & ((1L << (SERIALIZABLE - 396)) | (1L << (SESSION - 396)) | (1L << (SHAPE - 396)) | (1L << (SKEW - 396)) | (1L << (SNAPSHOT - 396)) | (1L << (SONAME - 396)) | (1L << (SPLIT - 396)) | (1L << (START - 396)) | (1L << (STARTS - 396)) | (1L << (STATS - 396)) | (1L << (STATUS - 396)) | (1L << (STOP - 396)) | (1L << (STORAGE - 396)) | (1L << (STREAM - 396)) | (1L << (STREAMING - 396)) | (1L << (STRING - 396)) | (1L << (STRUCT - 396)) | (1L << (SUBDATE - 396)) | (1L << (SUM - 396)) | (1L << (TABLES - 396)) | (1L << (TASK - 396)) | (1L << (TASKS - 396)) | (1L << (TEMPORARY - 396)) | (1L << (TEXT - 396)) | (1L << (THAN - 396)) | (1L << (TIME - 396)) | (1L << (TIMESTAMP - 396)) | (1L << (TIMESTAMPADD - 396)) | (1L << (TIMESTAMPDIFF - 396)) | (1L << (TRANSACTION - 396)) | (1L << (TREE - 396)) | (1L << (TRIGGERS - 396)) | (1L << (TRUNCATE - 396)) | (1L << (TYPE - 396)) | (1L << (TYPES - 396)) | (1L << (UNCOMMITTED - 396)) | (1L << (UNLOCK - 396)))) != 0) || ((((_la - 462)) & ~0x3f) == 0 && ((1L << (_la - 462)) & ((1L << (USER - 462)) | (1L << (VALUE - 462)) | (1L << (VARCHAR - 462)) | (1L << (VARIABLES - 462)) | (1L << (VARIANT - 462)) | (1L << (VERBOSE - 462)) | (1L << (VERSION - 462)) | (1L << (VIEW - 462)) | (1L << (WARNINGS - 462)) | (1L << (WEEK - 462)) | (1L << (WORK - 462)) | (1L << (YEAR - 462)) | (1L << (IDENTIFIER - 462)) | (1L << (BACKQUOTED_IDENTIFIER - 462)))) != 0)) {
					{
					setState(913);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(910);
						((UseCloudClusterContext)_localctx).catalog = identifier();
						setState(911);
						match(DOT);
						}
						break;
					}
					setState(915);
					((UseCloudClusterContext)_localctx).database = identifier();
					}
				}

				setState(918);
				match(ATSIGN);
				setState(919);
				((UseCloudClusterContext)_localctx).cluster = identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetUserVariableContext extends VariableContext {
		public TerminalNode ATSIGN() { return getToken(DorisParser.ATSIGN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetUserVariableContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetUserVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetUserVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetUserVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSystemVariableContext extends VariableContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public List<TerminalNode> ATSIGN() { return getTokens(DorisParser.ATSIGN); }
		public TerminalNode ATSIGN(int i) {
			return getToken(DorisParser.ATSIGN, i);
		}
		public TerminalNode GLOBAL() { return getToken(DorisParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public TerminalNode SESSION() { return getToken(DorisParser.SESSION, 0); }
		public SetSystemVariableContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetSystemVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetSystemVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetSystemVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new SetSystemVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATSIGN) {
					{
					setState(922);
					match(ATSIGN);
					setState(923);
					match(ATSIGN);
					setState(925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						setState(924);
						_la = _input.LA(1);
						if ( !(_la==GLOBAL || _la==LOCAL || _la==SESSION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
				}

				setState(929);
				identifier();
				setState(930);
				match(EQ);
				setState(933);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
				case LEFT_BRACKET:
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADD:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case ARRAY_RANGE:
				case AT:
				case AUTHORS:
				case AUTO_INCREMENT:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BELONG:
				case BIN:
				case BINARY:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case BULK:
				case CACHED:
				case CALL:
				case CASE:
				case CAST:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLLECT:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONSTRAINTS:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATA:
				case DATABASE:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DUAL:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXISTS:
				case EXPIRED:
				case EXTERNAL:
				case EXTRACT:
				case FAILED_LOGIN_ATTEMPTS:
				case FALSE:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GENERIC:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IF:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INTERVAL:
				case INVERTED:
				case IPV4:
				case IPV6:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case KEY:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LEFT:
				case LESS:
				case LEVEL:
				case LIKE:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MANUAL:
				case MAP:
				case MATCH_ALL:
				case MATCH_ANY:
				case MATCH_ELEMENT_EQ:
				case MATCH_ELEMENT_GE:
				case MATCH_ELEMENT_GT:
				case MATCH_ELEMENT_LE:
				case MATCH_ELEMENT_LT:
				case MATCH_PHRASE:
				case MATCH_PHRASE_EDGE:
				case MATCH_PHRASE_PREFIX:
				case MATCH_REGEXP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NOT:
				case NULL:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PARTITIONS:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PROCESS:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REGEXP:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RIGHT:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRIM:
				case TRUE:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VARIANT:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case PLUS:
				case SUBTRACT:
				case ASTERISK:
				case TILDE:
				case LOGICALNOT:
				case ATSIGN:
				case DOUBLEATSIGN:
				case STRING_LITERAL:
				case INTEGER_VALUE:
				case EXPONENT_VALUE:
				case DECIMAL_VALUE:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(931);
					expression();
					}
					break;
				case DEFAULT:
					{
					setState(932);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new SetUserVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(ATSIGN);
				setState(936);
				identifier();
				setState(937);
				match(EQ);
				setState(938);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionAccessModeContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(DorisParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(DorisParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(DorisParser.WRITE, 0); }
		public TransactionAccessModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionAccessMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionAccessModeContext transactionAccessMode() throws RecognitionException {
		TransactionAccessModeContext _localctx = new TransactionAccessModeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transactionAccessMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(READ);
			setState(943);
			_la = _input.LA(1);
			if ( !(_la==ONLY || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsolationLevelContext extends ParserRuleContext {
		public TerminalNode ISOLATION() { return getToken(DorisParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(DorisParser.LEVEL, 0); }
		public TerminalNode READ() { return getToken(DorisParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(DorisParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(DorisParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(DorisParser.REPEATABLE, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(DorisParser.SERIALIZABLE, 0); }
		public IsolationLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isolationLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsolationLevelContext isolationLevel() throws RecognitionException {
		IsolationLevelContext _localctx = new IsolationLevelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_isolationLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(ISOLATION);
			setState(946);
			match(LEVEL);
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				{
				setState(947);
				match(READ);
				setState(948);
				match(UNCOMMITTED);
				}
				}
				break;
			case 2:
				{
				{
				setState(949);
				match(READ);
				setState(950);
				match(COMMITTED);
				}
				}
				break;
			case 3:
				{
				{
				setState(951);
				match(REPEATABLE);
				setState(952);
				match(READ);
				}
				}
				break;
			case 4:
				{
				{
				setState(953);
				match(SERIALIZABLE);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public IdentifierListContext slots;
		public MultipartIdentifierContext referenceTable;
		public IdentifierListContext referencedSlots;
		public TerminalNode PRIMARY() { return getToken(DorisParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public TerminalNode UNIQUE() { return getToken(DorisParser.UNIQUE, 0); }
		public TerminalNode FOREIGN() { return getToken(DorisParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(DorisParser.REFERENCES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constraint);
		try {
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(PRIMARY);
				setState(957);
				match(KEY);
				setState(958);
				((ConstraintContext)_localctx).slots = identifierList();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				match(UNIQUE);
				setState(960);
				((ConstraintContext)_localctx).slots = identifierList();
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(961);
				match(FOREIGN);
				setState(962);
				match(KEY);
				setState(963);
				((ConstraintContext)_localctx).slots = identifierList();
				setState(964);
				match(REFERENCES);
				setState(965);
				((ConstraintContext)_localctx).referenceTable = multipartIdentifier();
				setState(966);
				((ConstraintContext)_localctx).referencedSlots = identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public IdentifierListContext partitions;
		public ErrorCapturingIdentifierContext partition;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(DorisParser.PARTITIONS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(DorisParser.TEMPORARY, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_partitionSpec);
		int _la;
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(970);
					match(TEMPORARY);
					}
				}

				setState(973);
				_la = _input.LA(1);
				if ( !(_la==PARTITION || _la==PARTITIONS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(974);
				((PartitionSpecContext)_localctx).partitions = identifierList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(975);
					match(TEMPORARY);
					}
				}

				setState(978);
				match(PARTITION);
				setState(979);
				((PartitionSpecContext)_localctx).partition = errorCapturingIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				_la = _input.LA(1);
				if ( !(_la==PARTITION || _la==PARTITIONS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(981);
				match(LEFT_PAREN);
				setState(982);
				match(ASTERISK);
				setState(983);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionTableContext extends ParserRuleContext {
		public Token autoPartition;
		public IdentityOrFunctionListContext partitionList;
		public PartitionsDefContext partitions;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public IdentityOrFunctionListContext identityOrFunctionList() {
			return getRuleContext(IdentityOrFunctionListContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode AUTO() { return getToken(DorisParser.AUTO, 0); }
		public TerminalNode RANGE() { return getToken(DorisParser.RANGE, 0); }
		public TerminalNode LIST() { return getToken(DorisParser.LIST, 0); }
		public PartitionsDefContext partitionsDef() {
			return getRuleContext(PartitionsDefContext.class,0);
		}
		public PartitionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionTableContext partitionTable() throws RecognitionException {
		PartitionTableContext _localctx = new PartitionTableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_partitionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO) {
				{
				setState(986);
				((PartitionTableContext)_localctx).autoPartition = match(AUTO);
				}
			}

			setState(989);
			match(PARTITION);
			setState(990);
			match(BY);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST || _la==RANGE) {
				{
				setState(991);
				_la = _input.LA(1);
				if ( !(_la==LIST || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(994);
			((PartitionTableContext)_localctx).partitionList = identityOrFunctionList();
			{
			setState(995);
			match(LEFT_PAREN);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM || _la==PARTITION) {
				{
				setState(996);
				((PartitionTableContext)_localctx).partitions = partitionsDef();
				}
			}

			setState(999);
			match(RIGHT_PAREN);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentityOrFunctionListContext extends ParserRuleContext {
		public IdentityOrFunctionContext identityOrFunction;
		public List<IdentityOrFunctionContext> partitions = new ArrayList<IdentityOrFunctionContext>();
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<IdentityOrFunctionContext> identityOrFunction() {
			return getRuleContexts(IdentityOrFunctionContext.class);
		}
		public IdentityOrFunctionContext identityOrFunction(int i) {
			return getRuleContext(IdentityOrFunctionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public IdentityOrFunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOrFunctionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentityOrFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentityOrFunctionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentityOrFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityOrFunctionListContext identityOrFunctionList() throws RecognitionException {
		IdentityOrFunctionListContext _localctx = new IdentityOrFunctionListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identityOrFunctionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(LEFT_PAREN);
			setState(1002);
			identityOrFunction();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1003);
				match(COMMA);
				setState(1004);
				((IdentityOrFunctionListContext)_localctx).identityOrFunction = identityOrFunction();
				((IdentityOrFunctionListContext)_localctx).partitions.add(((IdentityOrFunctionListContext)_localctx).identityOrFunction);
				}
				}
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1010);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentityOrFunctionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public IdentityOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentityOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentityOrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentityOrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityOrFunctionContext identityOrFunction() throws RecognitionException {
		IdentityOrFunctionContext _localctx = new IdentityOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identityOrFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1012);
				identifier();
				}
				break;
			case 2:
				{
				setState(1013);
				functionCallExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDescContext extends ParserRuleContext {
		public Token STRING_LITERAL;
		public List<Token> filePaths = new ArrayList<Token>();
		public List<Token> filePath = new ArrayList<Token>();
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public Token comma;
		public Token separator;
		public IdentifierOrStringLiteralContext format;
		public IdentifierListContext columns;
		public ColFromPathContext columnsFromPath;
		public ColMappingListContext columnMapping;
		public PreFilterClauseContext preFilter;
		public WhereClauseContext where;
		public DeleteOnClauseContext deleteOn;
		public SequenceColClauseContext sequenceColumn;
		public TerminalNode DATA() { return getToken(DorisParser.DATA, 0); }
		public TerminalNode INFILE() { return getToken(DorisParser.INFILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public List<TerminalNode> TABLE() { return getTokens(DorisParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(DorisParser.TABLE, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(DorisParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(DorisParser.STRING_LITERAL, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MergeTypeContext mergeType() {
			return getRuleContext(MergeTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(DorisParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(DorisParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(DorisParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DorisParser.BY, i);
		}
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public TerminalNode FORMAT() { return getToken(DorisParser.FORMAT, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public IdentifierOrStringLiteralContext identifierOrStringLiteral() {
			return getRuleContext(IdentifierOrStringLiteralContext.class,0);
		}
		public ColFromPathContext colFromPath() {
			return getRuleContext(ColFromPathContext.class,0);
		}
		public ColMappingListContext colMappingList() {
			return getRuleContext(ColMappingListContext.class,0);
		}
		public PreFilterClauseContext preFilterClause() {
			return getRuleContext(PreFilterClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteOnClauseContext deleteOnClause() {
			return getRuleContext(DeleteOnClauseContext.class,0);
		}
		public SequenceColClauseContext sequenceColClause() {
			return getRuleContext(SequenceColClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public DataDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDataDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDataDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDataDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDescContext dataDesc() throws RecognitionException {
		DataDescContext _localctx = new DataDescContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataDesc);
		int _la;
		try {
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==APPEND || _la==DELETE || _la==MERGE || _la==WITH) {
					{
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1016);
						match(WITH);
						}
					}

					setState(1019);
					mergeType();
					}
				}

				setState(1022);
				match(DATA);
				setState(1023);
				match(INFILE);
				setState(1024);
				match(LEFT_PAREN);
				setState(1025);
				((DataDescContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((DataDescContext)_localctx).filePaths.add(((DataDescContext)_localctx).STRING_LITERAL);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1026);
					match(COMMA);
					setState(1027);
					((DataDescContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
					((DataDescContext)_localctx).filePath.add(((DataDescContext)_localctx).STRING_LITERAL);
					}
					}
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1033);
				match(RIGHT_PAREN);
				setState(1034);
				match(INTO);
				setState(1035);
				match(TABLE);
				setState(1036);
				((DataDescContext)_localctx).tableName = multipartIdentifier();
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1037);
					match(PARTITION);
					setState(1038);
					((DataDescContext)_localctx).partition = identifierList();
					}
				}

				setState(1045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1041);
					match(COLUMNS);
					setState(1042);
					match(TERMINATED);
					setState(1043);
					match(BY);
					setState(1044);
					((DataDescContext)_localctx).comma = match(STRING_LITERAL);
					}
					break;
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1047);
					match(LINES);
					setState(1048);
					match(TERMINATED);
					setState(1049);
					match(BY);
					setState(1050);
					((DataDescContext)_localctx).separator = match(STRING_LITERAL);
					}
				}

				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORMAT) {
					{
					setState(1053);
					match(FORMAT);
					setState(1054);
					match(AS);
					setState(1055);
					((DataDescContext)_localctx).format = identifierOrStringLiteral();
					}
				}

				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1058);
					((DataDescContext)_localctx).columns = identifierList();
					}
				}

				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMNS) {
					{
					setState(1061);
					((DataDescContext)_localctx).columnsFromPath = colFromPath();
					}
				}

				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1064);
					((DataDescContext)_localctx).columnMapping = colMappingList();
					}
				}

				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRECEDING) {
					{
					setState(1067);
					((DataDescContext)_localctx).preFilter = preFilterClause();
					}
				}

				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1070);
					((DataDescContext)_localctx).where = whereClause();
					}
				}

				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(1073);
					((DataDescContext)_localctx).deleteOn = deleteOnClause();
					}
				}

				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1076);
					((DataDescContext)_localctx).sequenceColumn = sequenceColClause();
					}
				}

				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(1079);
					propertyClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==APPEND || _la==DELETE || _la==MERGE || _la==WITH) {
					{
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1082);
						match(WITH);
						}
					}

					setState(1085);
					mergeType();
					}
				}

				setState(1088);
				match(DATA);
				setState(1089);
				match(FROM);
				setState(1090);
				match(TABLE);
				setState(1091);
				((DataDescContext)_localctx).tableName = multipartIdentifier();
				setState(1092);
				match(INTO);
				setState(1093);
				match(TABLE);
				setState(1094);
				((DataDescContext)_localctx).tableName = multipartIdentifier();
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1095);
					match(PARTITION);
					setState(1096);
					((DataDescContext)_localctx).partition = identifierList();
					}
				}

				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1099);
					((DataDescContext)_localctx).columnMapping = colMappingList();
					}
				}

				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1102);
					((DataDescContext)_localctx).where = whereClause();
					}
				}

				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(1105);
					((DataDescContext)_localctx).deleteOn = deleteOnClause();
					}
				}

				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(1108);
					propertyClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildModeContext extends ParserRuleContext {
		public TerminalNode BUILD() { return getToken(DorisParser.BUILD, 0); }
		public TerminalNode IMMEDIATE() { return getToken(DorisParser.IMMEDIATE, 0); }
		public TerminalNode DEFERRED() { return getToken(DorisParser.DEFERRED, 0); }
		public BuildModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBuildMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBuildMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBuildMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildModeContext buildMode() throws RecognitionException {
		BuildModeContext _localctx = new BuildModeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_buildMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(BUILD);
			setState(1114);
			_la = _input.LA(1);
			if ( !(_la==DEFERRED || _la==IMMEDIATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefreshTriggerContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public TerminalNode MANUAL() { return getToken(DorisParser.MANUAL, 0); }
		public TerminalNode SCHEDULE() { return getToken(DorisParser.SCHEDULE, 0); }
		public RefreshScheduleContext refreshSchedule() {
			return getRuleContext(RefreshScheduleContext.class,0);
		}
		public RefreshTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshTrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRefreshTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRefreshTrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRefreshTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshTriggerContext refreshTrigger() throws RecognitionException {
		RefreshTriggerContext _localctx = new RefreshTriggerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_refreshTrigger);
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				match(ON);
				setState(1117);
				match(MANUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				match(ON);
				setState(1119);
				match(SCHEDULE);
				setState(1120);
				refreshSchedule();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefreshScheduleContext extends ParserRuleContext {
		public IdentifierContext refreshUnit;
		public TerminalNode EVERY() { return getToken(DorisParser.EVERY, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STARTS() { return getToken(DorisParser.STARTS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public RefreshScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshSchedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRefreshSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRefreshSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRefreshSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshScheduleContext refreshSchedule() throws RecognitionException {
		RefreshScheduleContext _localctx = new RefreshScheduleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_refreshSchedule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(EVERY);
			setState(1124);
			match(INTEGER_VALUE);
			setState(1125);
			((RefreshScheduleContext)_localctx).refreshUnit = identifier();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STARTS) {
				{
				setState(1126);
				match(STARTS);
				setState(1127);
				match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefreshMethodContext extends ParserRuleContext {
		public TerminalNode COMPLETE() { return getToken(DorisParser.COMPLETE, 0); }
		public TerminalNode AUTO() { return getToken(DorisParser.AUTO, 0); }
		public RefreshMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRefreshMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRefreshMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRefreshMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshMethodContext refreshMethod() throws RecognitionException {
		RefreshMethodContext _localctx = new RefreshMethodContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_refreshMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_la = _input.LA(1);
			if ( !(_la==AUTO || _la==COMPLETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrStringLiteralContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public IdentifierOrStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifierOrStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifierOrStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifierOrStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrStringLiteralContext identifierOrStringLiteral() throws RecognitionException {
		IdentifierOrStringLiteralContext _localctx = new IdentifierOrStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifierOrStringLiteral);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case ARRAY_RANGE:
			case AT:
			case AUTHORS:
			case AUTO_INCREMENT:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BELONG:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case BULK:
			case CACHED:
			case CALL:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLLECT:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONSTRAINTS:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DUAL:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXPIRED:
			case EXTERNAL:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GENERIC:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INVERTED:
			case IPV4:
			case IPV6:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LESS:
			case LEVEL:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MANUAL:
			case MAP:
			case MATCH_ALL:
			case MATCH_ANY:
			case MATCH_ELEMENT_EQ:
			case MATCH_ELEMENT_GE:
			case MATCH_ELEMENT_GT:
			case MATCH_ELEMENT_LE:
			case MATCH_ELEMENT_LT:
			case MATCH_PHRASE:
			case MATCH_PHRASE_EDGE:
			case MATCH_PHRASE_PREFIX:
			case MATCH_REGEXP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PROCESS:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VARIANT:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				identifier();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrTextContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode LEADING_STRING() { return getToken(DorisParser.LEADING_STRING, 0); }
		public IdentifierOrTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifierOrText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifierOrText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifierOrText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrTextContext identifierOrText() throws RecognitionException {
		IdentifierOrTextContext _localctx = new IdentifierOrTextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifierOrText);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case ARRAY_RANGE:
			case AT:
			case AUTHORS:
			case AUTO_INCREMENT:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BELONG:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case BULK:
			case CACHED:
			case CALL:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLLECT:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONSTRAINTS:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DUAL:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXPIRED:
			case EXTERNAL:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GENERIC:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INVERTED:
			case IPV4:
			case IPV6:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LESS:
			case LEVEL:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MANUAL:
			case MAP:
			case MATCH_ALL:
			case MATCH_ANY:
			case MATCH_ELEMENT_EQ:
			case MATCH_ELEMENT_GE:
			case MATCH_ELEMENT_GT:
			case MATCH_ELEMENT_LE:
			case MATCH_ELEMENT_LT:
			case MATCH_PHRASE:
			case MATCH_PHRASE_EDGE:
			case MATCH_PHRASE_PREFIX:
			case MATCH_REGEXP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PROCESS:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VARIANT:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				errorCapturingIdentifier();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				match(STRING_LITERAL);
				}
				break;
			case LEADING_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				match(LEADING_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserIdentifyContext extends ParserRuleContext {
		public IdentifierOrTextContext user;
		public IdentifierOrTextContext host;
		public List<IdentifierOrTextContext> identifierOrText() {
			return getRuleContexts(IdentifierOrTextContext.class);
		}
		public IdentifierOrTextContext identifierOrText(int i) {
			return getRuleContext(IdentifierOrTextContext.class,i);
		}
		public TerminalNode ATSIGN() { return getToken(DorisParser.ATSIGN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public UserIdentifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userIdentify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUserIdentify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUserIdentify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUserIdentify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserIdentifyContext userIdentify() throws RecognitionException {
		UserIdentifyContext _localctx = new UserIdentifyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_userIdentify);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			((UserIdentifyContext)_localctx).user = identifierOrText();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATSIGN) {
				{
				setState(1142);
				match(ATSIGN);
				setState(1148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case ARRAY_RANGE:
				case AT:
				case AUTHORS:
				case AUTO_INCREMENT:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BELONG:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case BULK:
				case CACHED:
				case CALL:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLLECT:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONSTRAINTS:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DUAL:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GENERIC:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IPV4:
				case IPV6:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MANUAL:
				case MAP:
				case MATCH_ALL:
				case MATCH_ANY:
				case MATCH_ELEMENT_EQ:
				case MATCH_ELEMENT_GE:
				case MATCH_ELEMENT_GT:
				case MATCH_ELEMENT_LE:
				case MATCH_ELEMENT_LT:
				case MATCH_PHRASE:
				case MATCH_PHRASE_EDGE:
				case MATCH_PHRASE_PREFIX:
				case MATCH_REGEXP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PARTITIONS:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PROCESS:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VARIANT:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case STRING_LITERAL:
				case LEADING_STRING:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1143);
					((UserIdentifyContext)_localctx).host = identifierOrText();
					}
					break;
				case LEFT_PAREN:
					{
					setState(1144);
					match(LEFT_PAREN);
					setState(1145);
					((UserIdentifyContext)_localctx).host = identifierOrText();
					setState(1146);
					match(RIGHT_PAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainContext extends ParserRuleContext {
		public Token level;
		public TerminalNode EXPLAIN() { return getToken(DorisParser.EXPLAIN, 0); }
		public TerminalNode DESC() { return getToken(DorisParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(DorisParser.DESCRIBE, 0); }
		public TerminalNode PROCESS() { return getToken(DorisParser.PROCESS, 0); }
		public PlanTypeContext planType() {
			return getRuleContext(PlanTypeContext.class,0);
		}
		public TerminalNode VERBOSE() { return getToken(DorisParser.VERBOSE, 0); }
		public TerminalNode TREE() { return getToken(DorisParser.TREE, 0); }
		public TerminalNode GRAPH() { return getToken(DorisParser.GRAPH, 0); }
		public TerminalNode PLAN() { return getToken(DorisParser.PLAN, 0); }
		public ExplainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainContext explain() throws RecognitionException {
		ExplainContext _localctx = new ExplainContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_explain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPLAIN:
				{
				setState(1152);
				match(EXPLAIN);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANALYZED || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (LOGICAL - 263)) | (1L << (MEMO - 263)) | (1L << (OPTIMIZED - 263)) | (1L << (PARSED - 263)))) != 0) || _la==PHYSICAL || _la==REWRITTEN || _la==SHAPE) {
					{
					setState(1153);
					planType();
					}
				}

				}
				break;
			case DESC:
				{
				setState(1156);
				match(DESC);
				}
				break;
			case DESCRIBE:
				{
				setState(1157);
				match(DESCRIBE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRAPH || _la==PLAN || _la==TREE || _la==VERBOSE) {
				{
				setState(1160);
				((ExplainContext)_localctx).level = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPH || _la==PLAN || _la==TREE || _la==VERBOSE) ) {
					((ExplainContext)_localctx).level = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCESS) {
				{
				setState(1163);
				match(PROCESS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlanTypeContext extends ParserRuleContext {
		public TerminalNode PARSED() { return getToken(DorisParser.PARSED, 0); }
		public TerminalNode ANALYZED() { return getToken(DorisParser.ANALYZED, 0); }
		public TerminalNode REWRITTEN() { return getToken(DorisParser.REWRITTEN, 0); }
		public TerminalNode LOGICAL() { return getToken(DorisParser.LOGICAL, 0); }
		public TerminalNode OPTIMIZED() { return getToken(DorisParser.OPTIMIZED, 0); }
		public TerminalNode PHYSICAL() { return getToken(DorisParser.PHYSICAL, 0); }
		public TerminalNode SHAPE() { return getToken(DorisParser.SHAPE, 0); }
		public TerminalNode MEMO() { return getToken(DorisParser.MEMO, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public PlanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPlanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPlanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPlanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanTypeContext planType() throws RecognitionException {
		PlanTypeContext _localctx = new PlanTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_planType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANALYZED || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (LOGICAL - 263)) | (1L << (MEMO - 263)) | (1L << (OPTIMIZED - 263)) | (1L << (PARSED - 263)))) != 0) || _la==PHYSICAL || _la==REWRITTEN || _la==SHAPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeTypeContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(DorisParser.APPEND, 0); }
		public TerminalNode DELETE() { return getToken(DorisParser.DELETE, 0); }
		public TerminalNode MERGE() { return getToken(DorisParser.MERGE, 0); }
		public MergeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMergeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMergeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMergeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeTypeContext mergeType() throws RecognitionException {
		MergeTypeContext _localctx = new MergeTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mergeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==DELETE || _la==MERGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreFilterClauseContext extends ParserRuleContext {
		public TerminalNode PRECEDING() { return getToken(DorisParser.PRECEDING, 0); }
		public TerminalNode FILTER() { return getToken(DorisParser.FILTER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreFilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preFilterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPreFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPreFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPreFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreFilterClauseContext preFilterClause() throws RecognitionException {
		PreFilterClauseContext _localctx = new PreFilterClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_preFilterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(PRECEDING);
			setState(1171);
			match(FILTER);
			setState(1172);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteOnClauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DorisParser.DELETE, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeleteOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteOnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDeleteOnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDeleteOnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDeleteOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteOnClauseContext deleteOnClause() throws RecognitionException {
		DeleteOnClauseContext _localctx = new DeleteOnClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_deleteOnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(DELETE);
			setState(1175);
			match(ON);
			setState(1176);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceColClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DorisParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SequenceColClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceColClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSequenceColClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSequenceColClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSequenceColClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceColClauseContext sequenceColClause() throws RecognitionException {
		SequenceColClauseContext _localctx = new SequenceColClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sequenceColClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			match(ORDER);
			setState(1179);
			match(BY);
			setState(1180);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColFromPathContext extends ParserRuleContext {
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TerminalNode PATH() { return getToken(DorisParser.PATH, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ColFromPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colFromPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColFromPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColFromPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColFromPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColFromPathContext colFromPath() throws RecognitionException {
		ColFromPathContext _localctx = new ColFromPathContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_colFromPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(COLUMNS);
			setState(1183);
			match(FROM);
			setState(1184);
			match(PATH);
			setState(1185);
			match(AS);
			setState(1186);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColMappingListContext extends ParserRuleContext {
		public MappingExprContext mappingExpr;
		public List<MappingExprContext> mappingSet = new ArrayList<MappingExprContext>();
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<MappingExprContext> mappingExpr() {
			return getRuleContexts(MappingExprContext.class);
		}
		public MappingExprContext mappingExpr(int i) {
			return getRuleContext(MappingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ColMappingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colMappingList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColMappingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColMappingList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColMappingList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColMappingListContext colMappingList() throws RecognitionException {
		ColMappingListContext _localctx = new ColMappingListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_colMappingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(SET);
			setState(1189);
			match(LEFT_PAREN);
			setState(1190);
			((ColMappingListContext)_localctx).mappingExpr = mappingExpr();
			((ColMappingListContext)_localctx).mappingSet.add(((ColMappingListContext)_localctx).mappingExpr);
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1191);
				match(COMMA);
				setState(1192);
				((ColMappingListContext)_localctx).mappingExpr = mappingExpr();
				((ColMappingListContext)_localctx).mappingSet.add(((ColMappingListContext)_localctx).mappingExpr);
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1198);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingExprContext extends ParserRuleContext {
		public IdentifierContext mappingCol;
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MappingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMappingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMappingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMappingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingExprContext mappingExpr() throws RecognitionException {
		MappingExprContext _localctx = new MappingExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mappingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1200);
			((MappingExprContext)_localctx).mappingCol = identifier();
			setState(1201);
			match(EQ);
			setState(1202);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithRemoteStorageSystemContext extends ParserRuleContext {
		public PropertyItemListContext brokerProperties;
		public IdentifierOrTextContext brokerName;
		public ResourceDescContext resourceDesc() {
			return getRuleContext(ResourceDescContext.class,0);
		}
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode S3() { return getToken(DorisParser.S3, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TerminalNode HDFS() { return getToken(DorisParser.HDFS, 0); }
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public TerminalNode BROKER() { return getToken(DorisParser.BROKER, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public WithRemoteStorageSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withRemoteStorageSystem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWithRemoteStorageSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWithRemoteStorageSystem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWithRemoteStorageSystem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithRemoteStorageSystemContext withRemoteStorageSystem() throws RecognitionException {
		WithRemoteStorageSystemContext _localctx = new WithRemoteStorageSystemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_withRemoteStorageSystem);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				resourceDesc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				match(WITH);
				setState(1206);
				match(S3);
				setState(1207);
				match(LEFT_PAREN);
				setState(1208);
				((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
				setState(1209);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1211);
				match(WITH);
				setState(1212);
				match(HDFS);
				setState(1213);
				match(LEFT_PAREN);
				setState(1214);
				((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
				setState(1215);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1217);
				match(WITH);
				setState(1218);
				match(LOCAL);
				setState(1219);
				match(LEFT_PAREN);
				setState(1220);
				((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
				setState(1221);
				match(RIGHT_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1223);
				match(WITH);
				setState(1224);
				match(BROKER);
				setState(1225);
				((WithRemoteStorageSystemContext)_localctx).brokerName = identifierOrText();
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1226);
					match(LEFT_PAREN);
					setState(1227);
					((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
					setState(1228);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceDescContext extends ParserRuleContext {
		public IdentifierOrTextContext resourceName;
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode RESOURCE() { return getToken(DorisParser.RESOURCE, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ResourceDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterResourceDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitResourceDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitResourceDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceDescContext resourceDesc() throws RecognitionException {
		ResourceDescContext _localctx = new ResourceDescContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resourceDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(WITH);
			setState(1235);
			match(RESOURCE);
			setState(1236);
			((ResourceDescContext)_localctx).resourceName = identifierOrText();
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1237);
				match(LEFT_PAREN);
				setState(1238);
				propertyItemList();
				setState(1239);
				match(RIGHT_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MysqlDataDescContext extends ParserRuleContext {
		public Token filePath;
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public Token comma;
		public Token separator;
		public IdentifierListContext columns;
		public TerminalNode DATA() { return getToken(DorisParser.DATA, 0); }
		public TerminalNode INFILE() { return getToken(DorisParser.INFILE, 0); }
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(DorisParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(DorisParser.STRING_LITERAL, i);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(DorisParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(DorisParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(DorisParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DorisParser.BY, i);
		}
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public SkipLinesContext skipLines() {
			return getRuleContext(SkipLinesContext.class,0);
		}
		public ColMappingListContext colMappingList() {
			return getRuleContext(ColMappingListContext.class,0);
		}
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public MysqlDataDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysqlDataDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMysqlDataDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMysqlDataDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMysqlDataDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MysqlDataDescContext mysqlDataDesc() throws RecognitionException {
		MysqlDataDescContext _localctx = new MysqlDataDescContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mysqlDataDesc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(DATA);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(1244);
				match(LOCAL);
				setState(1245);
				booleanValue();
				}
			}

			setState(1248);
			match(INFILE);
			setState(1249);
			((MysqlDataDescContext)_localctx).filePath = match(STRING_LITERAL);
			setState(1250);
			match(INTO);
			setState(1251);
			match(TABLE);
			setState(1252);
			((MysqlDataDescContext)_localctx).tableName = multipartIdentifier();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1253);
				match(PARTITION);
				setState(1254);
				((MysqlDataDescContext)_localctx).partition = identifierList();
				}
			}

			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMNS) {
				{
				setState(1257);
				match(COLUMNS);
				setState(1258);
				match(TERMINATED);
				setState(1259);
				match(BY);
				setState(1260);
				((MysqlDataDescContext)_localctx).comma = match(STRING_LITERAL);
				}
			}

			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINES) {
				{
				setState(1263);
				match(LINES);
				setState(1264);
				match(TERMINATED);
				setState(1265);
				match(BY);
				setState(1266);
				((MysqlDataDescContext)_localctx).separator = match(STRING_LITERAL);
				}
			}

			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(1269);
				skipLines();
				}
			}

			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1272);
				((MysqlDataDescContext)_localctx).columns = identifierList();
				}
				break;
			}
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1275);
				colMappingList();
				}
				break;
			}
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1278);
				propertyClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipLinesContext extends ParserRuleContext {
		public Token lines;
		public TerminalNode IGNORE() { return getToken(DorisParser.IGNORE, 0); }
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode ROWS() { return getToken(DorisParser.ROWS, 0); }
		public SkipLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSkipLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSkipLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSkipLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipLinesContext skipLines() throws RecognitionException {
		SkipLinesContext _localctx = new SkipLinesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_skipLines);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				match(IGNORE);
				setState(1282);
				((SkipLinesContext)_localctx).lines = match(INTEGER_VALUE);
				setState(1283);
				match(LINES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				match(IGNORE);
				setState(1285);
				((SkipLinesContext)_localctx).lines = match(INTEGER_VALUE);
				setState(1286);
				match(ROWS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutFileClauseContext extends ParserRuleContext {
		public ConstantContext filePath;
		public IdentifierContext format;
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(DorisParser.OUTFILE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode FORMAT() { return getToken(DorisParser.FORMAT, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OutFileClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outFileClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterOutFileClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitOutFileClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitOutFileClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutFileClauseContext outFileClause() throws RecognitionException {
		OutFileClauseContext _localctx = new OutFileClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_outFileClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(INTO);
			setState(1290);
			match(OUTFILE);
			setState(1291);
			((OutFileClauseContext)_localctx).filePath = constant();
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(1292);
				match(FORMAT);
				setState(1293);
				match(AS);
				setState(1294);
				((OutFileClauseContext)_localctx).format = identifier();
				}
			}

			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPERTIES) {
				{
				setState(1297);
				propertyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1300);
				cte();
				}
			}

			setState(1303);
			queryTerm(0);
			setState(1304);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode UNION() { return getToken(DorisParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(DorisParser.EXCEPT, 0); }
		public TerminalNode MINUS() { return getToken(DorisParser.MINUS, 0); }
		public TerminalNode INTERSECT() { return getToken(DorisParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1307);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1309);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1310);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXCEPT || _la==INTERSECT || _la==MINUS || _la==UNION) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1311);
						setQuantifier();
						}
					}

					setState(1314);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(DorisParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValuesTableContext extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public ValuesTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterValuesTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitValuesTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitValuesTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_queryPrimary);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				querySpecification();
				}
				break;
			case LEFT_PAREN:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				match(LEFT_PAREN);
				setState(1324);
				query();
				setState(1325);
				match(RIGHT_PAREN);
				}
				break;
			case VALUES:
				_localctx = new ValuesTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1327);
				inlineTable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggClauseContext aggClause() {
			return getRuleContext(AggClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_querySpecification);
		try {
			_localctx = new RegularQuerySpecificationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			selectClause();
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1331);
				intoClause();
				}
				break;
			}
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1334);
				fromClause();
				}
				break;
			}
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1337);
				whereClause();
				}
				break;
			}
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1340);
				aggClause();
				}
				break;
			}
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1343);
				havingClause();
				}
				break;
			}
			setState(1346);
			if (!(doris_legacy_SQL_syntax)) throw new FailedPredicateException(this, "doris_legacy_SQL_syntax");
			setState(1347);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public List<AliasQueryContext> aliasQuery() {
			return getRuleContexts(AliasQueryContext.class);
		}
		public AliasQueryContext aliasQuery(int i) {
			return getRuleContext(AliasQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(WITH);
			setState(1350);
			aliasQuery();
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1351);
				match(COMMA);
				setState(1352);
				aliasQuery();
				}
				}
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasQueryContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAliasQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAliasQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAliasQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasQueryContext aliasQuery() throws RecognitionException {
		AliasQueryContext _localctx = new AliasQueryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_aliasQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			identifier();
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1359);
				columnAliases();
				}
			}

			setState(1362);
			match(AS);
			setState(1363);
			match(LEFT_PAREN);
			setState(1364);
			query();
			setState(1365);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(LEFT_PAREN);
			setState(1368);
			identifier();
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1369);
				match(COMMA);
				setState(1370);
				identifier();
				}
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1376);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(DorisParser.SELECT, 0); }
		public SelectColumnClauseContext selectColumnClause() {
			return getRuleContext(SelectColumnClauseContext.class,0);
		}
		public SelectHintContext selectHint() {
			return getRuleContext(SelectHintContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(DorisParser.DISTINCT, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(SELECT);
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HINT_START) {
				{
				setState(1379);
				selectHint();
				}
			}

			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1382);
				match(DISTINCT);
				}
			}

			setState(1385);
			selectColumnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectColumnClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public TerminalNode EXCEPT() { return getToken(DorisParser.EXCEPT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SelectColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSelectColumnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSelectColumnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSelectColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnClauseContext selectColumnClause() throws RecognitionException {
		SelectColumnClauseContext _localctx = new SelectColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_selectColumnClause);
		try {
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				namedExpressionSeq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				match(ASTERISK);
				setState(1389);
				match(EXCEPT);
				setState(1390);
				match(LEFT_PAREN);
				setState(1391);
				namedExpressionSeq();
				setState(1392);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(DorisParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			match(WHERE);
			setState(1397);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(FROM);
			setState(1400);
			relations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntoClauseContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public List<TableRowContext> tableRow() {
			return getRuleContexts(TableRowContext.class);
		}
		public TableRowContext tableRow(int i) {
			return getRuleContext(TableRowContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BulkCollectClauseContext bulkCollectClause() {
			return getRuleContext(BulkCollectClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_intoClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULK) {
				{
				setState(1402);
				bulkCollectClause();
				}
			}

			setState(1405);
			match(INTO);
			setState(1408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1406);
				tableRow();
				}
				break;
			case 2:
				{
				setState(1407);
				identifier();
				}
				break;
			}
			setState(1417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1410);
					match(COMMA);
					setState(1413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(1411);
						tableRow();
						}
						break;
					case 2:
						{
						setState(1412);
						identifier();
						}
						break;
					}
					}
					} 
				}
				setState(1419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BulkCollectClauseContext extends ParserRuleContext {
		public TerminalNode BULK() { return getToken(DorisParser.BULK, 0); }
		public TerminalNode COLLECT() { return getToken(DorisParser.COLLECT, 0); }
		public BulkCollectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulkCollectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBulkCollectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBulkCollectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBulkCollectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulkCollectClauseContext bulkCollectClause() throws RecognitionException {
		BulkCollectClauseContext _localctx = new BulkCollectClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bulkCollectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(BULK);
			setState(1421);
			match(COLLECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TableRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTableRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTableRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTableRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRowContext tableRow() throws RecognitionException {
		TableRowContext _localctx = new TableRowContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tableRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			identifier();
			setState(1424);
			match(LEFT_PAREN);
			setState(1425);
			match(INTEGER_VALUE);
			setState(1426);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationsContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public RelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRelations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRelations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRelations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationsContext relations() throws RecognitionException {
		RelationsContext _localctx = new RelationsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_relations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			relation();
			setState(1433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1429);
					match(COMMA);
					setState(1430);
					relation();
					}
					} 
				}
				setState(1435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			relationPrimary();
			setState(1440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1437);
					joinRelation();
					}
					} 
				}
				setState(1442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(DorisParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public DistributeTypeContext distributeType() {
			return getRuleContext(DistributeTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1443);
			joinType();
			}
			setState(1444);
			match(JOIN);
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET || _la==HINT_START) {
				{
				setState(1445);
				distributeType();
				}
			}

			setState(1448);
			((JoinRelationContext)_localctx).right = relationPrimary();
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1449);
				joinCriteria();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistributeTypeContext extends ParserRuleContext {
		public DistributeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributeType; }
	 
		public DistributeTypeContext() { }
		public void copyFrom(DistributeTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommentDistributeTypeContext extends DistributeTypeContext {
		public TerminalNode HINT_START() { return getToken(DorisParser.HINT_START, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode HINT_END() { return getToken(DorisParser.HINT_END, 0); }
		public CommentDistributeTypeContext(DistributeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCommentDistributeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCommentDistributeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCommentDistributeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketDistributeTypeContext extends DistributeTypeContext {
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public BracketDistributeTypeContext(DistributeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBracketDistributeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBracketDistributeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBracketDistributeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributeTypeContext distributeType() throws RecognitionException {
		DistributeTypeContext _localctx = new DistributeTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_distributeType);
		try {
			setState(1460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				_localctx = new BracketDistributeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				match(LEFT_BRACKET);
				setState(1453);
				identifier();
				setState(1454);
				match(RIGHT_BRACKET);
				}
				break;
			case HINT_START:
				_localctx = new CommentDistributeTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(HINT_START);
				setState(1457);
				identifier();
				setState(1458);
				match(HINT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationHintContext extends ParserRuleContext {
		public RelationHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationHint; }
	 
		public RelationHintContext() { }
		public void copyFrom(RelationHintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketRelationHintContext extends RelationHintContext {
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public BracketRelationHintContext(RelationHintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBracketRelationHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBracketRelationHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBracketRelationHint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentRelationHintContext extends RelationHintContext {
		public TerminalNode HINT_START() { return getToken(DorisParser.HINT_START, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode HINT_END() { return getToken(DorisParser.HINT_END, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public CommentRelationHintContext(RelationHintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCommentRelationHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCommentRelationHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCommentRelationHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationHintContext relationHint() throws RecognitionException {
		RelationHintContext _localctx = new RelationHintContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_relationHint);
		int _la;
		try {
			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				_localctx = new BracketRelationHintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				match(LEFT_BRACKET);
				setState(1463);
				identifier();
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1464);
					match(COMMA);
					setState(1465);
					identifier();
					}
					}
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1471);
				match(RIGHT_BRACKET);
				}
				break;
			case HINT_START:
				_localctx = new CommentRelationHintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				match(HINT_START);
				setState(1474);
				identifier();
				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1475);
					match(COMMA);
					setState(1476);
					identifier();
					}
					}
					setState(1481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1482);
				match(HINT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(DorisParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public GroupingElementContext groupingElement() {
			return getRuleContext(GroupingElementContext.class,0);
		}
		public AggClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAggClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAggClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAggClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggClauseContext aggClause() throws RecognitionException {
		AggClauseContext _localctx = new AggClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_aggClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(GROUP);
			setState(1487);
			match(BY);
			setState(1488);
			groupingElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public TerminalNode ROLLUP() { return getToken(DorisParser.ROLLUP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode CUBE() { return getToken(DorisParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(DorisParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(DorisParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_groupingElement);
		int _la;
		try {
			int _alt;
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				match(ROLLUP);
				setState(1491);
				match(LEFT_PAREN);
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXISTS - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NOT - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (LOGICALNOT - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
					{
					setState(1492);
					expression();
					setState(1497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1493);
						match(COMMA);
						setState(1494);
						expression();
						}
						}
						setState(1499);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1502);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				match(CUBE);
				setState(1504);
				match(LEFT_PAREN);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXISTS - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NOT - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (LOGICALNOT - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
					{
					setState(1505);
					expression();
					setState(1510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1506);
						match(COMMA);
						setState(1507);
						expression();
						}
						}
						setState(1512);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1515);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1516);
				match(GROUPING);
				setState(1517);
				match(SETS);
				setState(1518);
				match(LEFT_PAREN);
				setState(1519);
				groupingSet();
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1520);
					match(COMMA);
					setState(1521);
					groupingSet();
					}
					}
					setState(1526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1527);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1529);
				expression();
				setState(1534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1530);
						match(COMMA);
						setState(1531);
						expression();
						}
						} 
					}
					setState(1536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_groupingSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(LEFT_PAREN);
			setState(1548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXISTS - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NOT - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (LOGICALNOT - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
				{
				setState(1540);
				expression();
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1541);
					match(COMMA);
					setState(1542);
					expression();
					}
					}
					setState(1547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1550);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(DorisParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(HAVING);
			setState(1553);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectHintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public TerminalNode HINT_START() { return getToken(DorisParser.HINT_START, 0); }
		public TerminalNode HINT_END() { return getToken(DorisParser.HINT_END, 0); }
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public SelectHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSelectHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSelectHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSelectHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectHintContext selectHint() throws RecognitionException {
		SelectHintContext _localctx = new SelectHintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_selectHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(HINT_START);
			setState(1556);
			((SelectHintContext)_localctx).hintStatement = hintStatement();
			((SelectHintContext)_localctx).hintStatements.add(((SelectHintContext)_localctx).hintStatement);
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (COMMA - 4)) | (1L << (LEFT_BRACE - 4)) | (1L << (RIGHT_BRACE - 4)) | (1L << (ADDDATE - 4)) | (1L << (AFTER - 4)) | (1L << (AGG_STATE - 4)) | (1L << (AGGREGATE - 4)) | (1L << (ALIAS - 4)) | (1L << (ANALYZED - 4)) | (1L << (ARRAY - 4)) | (1L << (ARRAY_RANGE - 4)) | (1L << (AT - 4)) | (1L << (AUTHORS - 4)) | (1L << (AUTO_INCREMENT - 4)) | (1L << (BACKENDS - 4)) | (1L << (BACKUP - 4)) | (1L << (BEGIN - 4)) | (1L << (BELONG - 4)) | (1L << (BIN - 4)) | (1L << (BITAND - 4)) | (1L << (BITMAP - 4)) | (1L << (BITMAP_UNION - 4)) | (1L << (BITOR - 4)) | (1L << (BITXOR - 4)) | (1L << (BLOB - 4)) | (1L << (BOOLEAN - 4)) | (1L << (BRIEF - 4)) | (1L << (BROKER - 4)) | (1L << (BUCKETS - 4)) | (1L << (BUILD - 4)) | (1L << (BUILTIN - 4)) | (1L << (BULK - 4)) | (1L << (CACHED - 4)) | (1L << (CALL - 4)) | (1L << (CATALOG - 4)) | (1L << (CATALOGS - 4)) | (1L << (CHAIN - 4)) | (1L << (CHAR - 4)) | (1L << (CHARSET - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CHECK - 68)) | (1L << (CLUSTER - 68)) | (1L << (CLUSTERS - 68)) | (1L << (COLLATION - 68)) | (1L << (COLLECT - 68)) | (1L << (COLUMNS - 68)) | (1L << (COMMENT - 68)) | (1L << (COMMIT - 68)) | (1L << (COMMITTED - 68)) | (1L << (COMPACT - 68)) | (1L << (COMPLETE - 68)) | (1L << (CONFIG - 68)) | (1L << (CONNECTION - 68)) | (1L << (CONNECTION_ID - 68)) | (1L << (CONSISTENT - 68)) | (1L << (CONSTRAINTS - 68)) | (1L << (CONVERT - 68)) | (1L << (COPY - 68)) | (1L << (COUNT - 68)) | (1L << (CREATION - 68)) | (1L << (CRON - 68)) | (1L << (CURRENT_CATALOG - 68)) | (1L << (CURRENT_DATE - 68)) | (1L << (CURRENT_TIME - 68)) | (1L << (CURRENT_TIMESTAMP - 68)) | (1L << (CURRENT_USER - 68)) | (1L << (DATA - 68)) | (1L << (DATE - 68)) | (1L << (DATE_ADD - 68)) | (1L << (DATE_CEIL - 68)) | (1L << (DATE_DIFF - 68)) | (1L << (DATE_FLOOR - 68)) | (1L << (DATE_SUB - 68)) | (1L << (DATEADD - 68)) | (1L << (DATEDIFF - 68)) | (1L << (DATETIME - 68)) | (1L << (DATETIMEV2 - 68)) | (1L << (DATEV2 - 68)) | (1L << (DATETIMEV1 - 68)) | (1L << (DATEV1 - 68)) | (1L << (DAY - 68)) | (1L << (DAYS_ADD - 68)) | (1L << (DAYS_SUB - 68)) | (1L << (DECIMAL - 68)) | (1L << (DECIMALV2 - 68)) | (1L << (DECIMALV3 - 68)) | (1L << (DEFERRED - 68)) | (1L << (DEMAND - 68)) | (1L << (DIAGNOSE - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DISTINCTPC - 134)) | (1L << (DISTINCTPCSA - 134)) | (1L << (DO - 134)) | (1L << (DORIS_INTERNAL_TABLE_ID - 134)) | (1L << (DUAL - 134)) | (1L << (DYNAMIC - 134)) | (1L << (ENABLE - 134)) | (1L << (ENCRYPTKEY - 134)) | (1L << (ENCRYPTKEYS - 134)) | (1L << (END - 134)) | (1L << (ENDS - 134)) | (1L << (ENGINE - 134)) | (1L << (ENGINES - 134)) | (1L << (ERRORS - 134)) | (1L << (EVENTS - 134)) | (1L << (EVERY - 134)) | (1L << (EXCLUDE - 134)) | (1L << (EXPIRED - 134)) | (1L << (EXTERNAL - 134)) | (1L << (FAILED_LOGIN_ATTEMPTS - 134)) | (1L << (FAST - 134)) | (1L << (FEATURE - 134)) | (1L << (FIELDS - 134)) | (1L << (FILE - 134)) | (1L << (FILTER - 134)) | (1L << (FIRST - 134)) | (1L << (FORMAT - 134)) | (1L << (FREE - 134)) | (1L << (FRONTENDS - 134)) | (1L << (FUNCTION - 134)) | (1L << (GENERIC - 134)) | (1L << (GLOBAL - 134)) | (1L << (GRAPH - 134)) | (1L << (GROUPING - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (GROUPS - 198)) | (1L << (HASH - 198)) | (1L << (HDFS - 198)) | (1L << (HELP - 198)) | (1L << (HISTOGRAM - 198)) | (1L << (HLL_UNION - 198)) | (1L << (HOSTNAME - 198)) | (1L << (HOUR - 198)) | (1L << (HUB - 198)) | (1L << (IDENTIFIED - 198)) | (1L << (IGNORE - 198)) | (1L << (IMMEDIATE - 198)) | (1L << (INCREMENTAL - 198)) | (1L << (INDEXES - 198)) | (1L << (INVERTED - 198)) | (1L << (IPV4 - 198)) | (1L << (IPV6 - 198)) | (1L << (IS_NOT_NULL_PRED - 198)) | (1L << (IS_NULL_PRED - 198)) | (1L << (ISNULL - 198)) | (1L << (ISOLATION - 198)) | (1L << (JOB - 198)) | (1L << (JOBS - 198)) | (1L << (JSON - 198)) | (1L << (JSONB - 198)) | (1L << (LABEL - 198)) | (1L << (LAST - 198)) | (1L << (LDAP - 198)) | (1L << (LDAP_ADMIN_PASSWORD - 198)) | (1L << (LESS - 198)) | (1L << (LEVEL - 198)) | (1L << (LINES - 198)) | (1L << (LINK - 198)) | (1L << (LOCAL - 198)) | (1L << (LOCALTIME - 198)) | (1L << (LOCALTIMESTAMP - 198)) | (1L << (LOCATION - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (LOCK - 262)) | (1L << (LOGICAL - 262)) | (1L << (MANUAL - 262)) | (1L << (MAP - 262)) | (1L << (MATCH_ALL - 262)) | (1L << (MATCH_ANY - 262)) | (1L << (MATCH_ELEMENT_EQ - 262)) | (1L << (MATCH_ELEMENT_GE - 262)) | (1L << (MATCH_ELEMENT_GT - 262)) | (1L << (MATCH_ELEMENT_LE - 262)) | (1L << (MATCH_ELEMENT_LT - 262)) | (1L << (MATCH_PHRASE - 262)) | (1L << (MATCH_PHRASE_EDGE - 262)) | (1L << (MATCH_PHRASE_PREFIX - 262)) | (1L << (MATCH_REGEXP - 262)) | (1L << (MATERIALIZED - 262)) | (1L << (MAX - 262)) | (1L << (MEMO - 262)) | (1L << (MERGE - 262)) | (1L << (MIGRATE - 262)) | (1L << (MIGRATIONS - 262)) | (1L << (MIN - 262)) | (1L << (MINUTE - 262)) | (1L << (MODIFY - 262)) | (1L << (MONTH - 262)) | (1L << (MTMV - 262)) | (1L << (NAME - 262)) | (1L << (NAMES - 262)) | (1L << (NEGATIVE - 262)) | (1L << (NEVER - 262)) | (1L << (NEXT - 262)) | (1L << (NGRAM_BF - 262)) | (1L << (NO - 262)) | (1L << (NON_NULLABLE - 262)) | (1L << (NULLS - 262)) | (1L << (OF - 262)) | (1L << (OFFSET - 262)) | (1L << (ONLY - 262)) | (1L << (OPEN - 262)) | (1L << (OPTIMIZED - 262)) | (1L << (PARAMETER - 262)) | (1L << (PARSED - 262)) | (1L << (PARTITIONS - 262)) | (1L << (PASSWORD - 262)) | (1L << (PASSWORD_EXPIRE - 262)) | (1L << (PASSWORD_HISTORY - 262)) | (1L << (PASSWORD_LOCK_TIME - 262)) | (1L << (PASSWORD_REUSE - 262)))) != 0) || ((((_la - 326)) & ~0x3f) == 0 && ((1L << (_la - 326)) & ((1L << (PATH - 326)) | (1L << (PAUSE - 326)) | (1L << (PERCENT - 326)) | (1L << (PERIOD - 326)) | (1L << (PERMISSIVE - 326)) | (1L << (PHYSICAL - 326)) | (1L << (PLAN - 326)) | (1L << (PROCESS - 326)) | (1L << (PLUGIN - 326)) | (1L << (PLUGINS - 326)) | (1L << (POLICY - 326)) | (1L << (PROC - 326)) | (1L << (PROCESSLIST - 326)) | (1L << (PROFILE - 326)) | (1L << (PROPERTIES - 326)) | (1L << (PROPERTY - 326)) | (1L << (QUANTILE_STATE - 326)) | (1L << (QUANTILE_UNION - 326)) | (1L << (QUERY - 326)) | (1L << (QUOTA - 326)) | (1L << (RANDOM - 326)) | (1L << (RECOVER - 326)) | (1L << (RECYCLE - 326)) | (1L << (REFRESH - 326)) | (1L << (REPEATABLE - 326)) | (1L << (REPLACE - 326)) | (1L << (REPLACE_IF_NOT_NULL - 326)) | (1L << (REPOSITORIES - 326)) | (1L << (REPOSITORY - 326)) | (1L << (RESOURCE - 326)) | (1L << (RESOURCES - 326)) | (1L << (RESTORE - 326)) | (1L << (RESTRICTIVE - 326)) | (1L << (RESUME - 326)) | (1L << (RETURNS - 326)) | (1L << (REWRITTEN - 326)) | (1L << (RLIKE - 326)) | (1L << (ROLLBACK - 326)) | (1L << (ROLLUP - 326)) | (1L << (ROUTINE - 326)) | (1L << (S3 - 326)) | (1L << (SAMPLE - 326)) | (1L << (SCHEDULE - 326)) | (1L << (SCHEDULER - 326)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (SCHEMA - 390)) | (1L << (SECOND - 390)) | (1L << (SEQUENCE - 390)) | (1L << (SERIALIZABLE - 390)) | (1L << (SESSION - 390)) | (1L << (SHAPE - 390)) | (1L << (SKEW - 390)) | (1L << (SNAPSHOT - 390)) | (1L << (SONAME - 390)) | (1L << (SPLIT - 390)) | (1L << (START - 390)) | (1L << (STARTS - 390)) | (1L << (STATS - 390)) | (1L << (STATUS - 390)) | (1L << (STOP - 390)) | (1L << (STORAGE - 390)) | (1L << (STREAM - 390)) | (1L << (STREAMING - 390)) | (1L << (STRING - 390)) | (1L << (STRUCT - 390)) | (1L << (SUBDATE - 390)) | (1L << (SUM - 390)) | (1L << (TABLES - 390)) | (1L << (TASK - 390)) | (1L << (TASKS - 390)) | (1L << (TEMPORARY - 390)) | (1L << (TEXT - 390)) | (1L << (THAN - 390)) | (1L << (TIME - 390)) | (1L << (TIMESTAMP - 390)) | (1L << (TIMESTAMPADD - 390)) | (1L << (TIMESTAMPDIFF - 390)) | (1L << (TRANSACTION - 390)) | (1L << (TREE - 390)) | (1L << (TRIGGERS - 390)) | (1L << (TRUNCATE - 390)) | (1L << (TYPE - 390)) | (1L << (TYPES - 390)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (UNCOMMITTED - 454)) | (1L << (UNLOCK - 454)) | (1L << (USER - 454)) | (1L << (VALUE - 454)) | (1L << (VARCHAR - 454)) | (1L << (VARIABLES - 454)) | (1L << (VARIANT - 454)) | (1L << (VERBOSE - 454)) | (1L << (VERSION - 454)) | (1L << (VIEW - 454)) | (1L << (WARNINGS - 454)) | (1L << (WEEK - 454)) | (1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
				{
				{
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1557);
					match(COMMA);
					}
				}

				setState(1560);
				((SelectHintContext)_localctx).hintStatement = hintStatement();
				((SelectHintContext)_localctx).hintStatements.add(((SelectHintContext)_localctx).hintStatement);
				}
				}
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1566);
			match(HINT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public HintAssignmentContext hintAssignment;
		public List<HintAssignmentContext> parameters = new ArrayList<HintAssignmentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<HintAssignmentContext> hintAssignment() {
			return getRuleContexts(HintAssignmentContext.class);
		}
		public HintAssignmentContext hintAssignment(int i) {
			return getRuleContext(HintAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_hintStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			((HintStatementContext)_localctx).hintName = identifier();
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1569);
				match(LEFT_PAREN);
				setState(1570);
				((HintStatementContext)_localctx).hintAssignment = hintAssignment();
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).hintAssignment);
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (COMMA - 4)) | (1L << (LEFT_BRACE - 4)) | (1L << (RIGHT_BRACE - 4)) | (1L << (ADDDATE - 4)) | (1L << (AFTER - 4)) | (1L << (AGG_STATE - 4)) | (1L << (AGGREGATE - 4)) | (1L << (ALIAS - 4)) | (1L << (ANALYZED - 4)) | (1L << (ARRAY - 4)) | (1L << (ARRAY_RANGE - 4)) | (1L << (AT - 4)) | (1L << (AUTHORS - 4)) | (1L << (AUTO_INCREMENT - 4)) | (1L << (BACKENDS - 4)) | (1L << (BACKUP - 4)) | (1L << (BEGIN - 4)) | (1L << (BELONG - 4)) | (1L << (BIN - 4)) | (1L << (BITAND - 4)) | (1L << (BITMAP - 4)) | (1L << (BITMAP_UNION - 4)) | (1L << (BITOR - 4)) | (1L << (BITXOR - 4)) | (1L << (BLOB - 4)) | (1L << (BOOLEAN - 4)) | (1L << (BRIEF - 4)) | (1L << (BROKER - 4)) | (1L << (BUCKETS - 4)) | (1L << (BUILD - 4)) | (1L << (BUILTIN - 4)) | (1L << (BULK - 4)) | (1L << (CACHED - 4)) | (1L << (CALL - 4)) | (1L << (CATALOG - 4)) | (1L << (CATALOGS - 4)) | (1L << (CHAIN - 4)) | (1L << (CHAR - 4)) | (1L << (CHARSET - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CHECK - 68)) | (1L << (CLUSTER - 68)) | (1L << (CLUSTERS - 68)) | (1L << (COLLATION - 68)) | (1L << (COLLECT - 68)) | (1L << (COLUMNS - 68)) | (1L << (COMMENT - 68)) | (1L << (COMMIT - 68)) | (1L << (COMMITTED - 68)) | (1L << (COMPACT - 68)) | (1L << (COMPLETE - 68)) | (1L << (CONFIG - 68)) | (1L << (CONNECTION - 68)) | (1L << (CONNECTION_ID - 68)) | (1L << (CONSISTENT - 68)) | (1L << (CONSTRAINTS - 68)) | (1L << (CONVERT - 68)) | (1L << (COPY - 68)) | (1L << (COUNT - 68)) | (1L << (CREATION - 68)) | (1L << (CRON - 68)) | (1L << (CURRENT_CATALOG - 68)) | (1L << (CURRENT_DATE - 68)) | (1L << (CURRENT_TIME - 68)) | (1L << (CURRENT_TIMESTAMP - 68)) | (1L << (CURRENT_USER - 68)) | (1L << (DATA - 68)) | (1L << (DATE - 68)) | (1L << (DATE_ADD - 68)) | (1L << (DATE_CEIL - 68)) | (1L << (DATE_DIFF - 68)) | (1L << (DATE_FLOOR - 68)) | (1L << (DATE_SUB - 68)) | (1L << (DATEADD - 68)) | (1L << (DATEDIFF - 68)) | (1L << (DATETIME - 68)) | (1L << (DATETIMEV2 - 68)) | (1L << (DATEV2 - 68)) | (1L << (DATETIMEV1 - 68)) | (1L << (DATEV1 - 68)) | (1L << (DAY - 68)) | (1L << (DAYS_ADD - 68)) | (1L << (DAYS_SUB - 68)) | (1L << (DECIMAL - 68)) | (1L << (DECIMALV2 - 68)) | (1L << (DECIMALV3 - 68)) | (1L << (DEFERRED - 68)) | (1L << (DEMAND - 68)) | (1L << (DIAGNOSE - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DISTINCTPC - 134)) | (1L << (DISTINCTPCSA - 134)) | (1L << (DO - 134)) | (1L << (DORIS_INTERNAL_TABLE_ID - 134)) | (1L << (DUAL - 134)) | (1L << (DYNAMIC - 134)) | (1L << (ENABLE - 134)) | (1L << (ENCRYPTKEY - 134)) | (1L << (ENCRYPTKEYS - 134)) | (1L << (END - 134)) | (1L << (ENDS - 134)) | (1L << (ENGINE - 134)) | (1L << (ENGINES - 134)) | (1L << (ERRORS - 134)) | (1L << (EVENTS - 134)) | (1L << (EVERY - 134)) | (1L << (EXCLUDE - 134)) | (1L << (EXPIRED - 134)) | (1L << (EXTERNAL - 134)) | (1L << (FAILED_LOGIN_ATTEMPTS - 134)) | (1L << (FAST - 134)) | (1L << (FEATURE - 134)) | (1L << (FIELDS - 134)) | (1L << (FILE - 134)) | (1L << (FILTER - 134)) | (1L << (FIRST - 134)) | (1L << (FORMAT - 134)) | (1L << (FREE - 134)) | (1L << (FRONTENDS - 134)) | (1L << (FUNCTION - 134)) | (1L << (GENERIC - 134)) | (1L << (GLOBAL - 134)) | (1L << (GRAPH - 134)) | (1L << (GROUPING - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (GROUPS - 198)) | (1L << (HASH - 198)) | (1L << (HDFS - 198)) | (1L << (HELP - 198)) | (1L << (HISTOGRAM - 198)) | (1L << (HLL_UNION - 198)) | (1L << (HOSTNAME - 198)) | (1L << (HOUR - 198)) | (1L << (HUB - 198)) | (1L << (IDENTIFIED - 198)) | (1L << (IGNORE - 198)) | (1L << (IMMEDIATE - 198)) | (1L << (INCREMENTAL - 198)) | (1L << (INDEXES - 198)) | (1L << (INVERTED - 198)) | (1L << (IPV4 - 198)) | (1L << (IPV6 - 198)) | (1L << (IS_NOT_NULL_PRED - 198)) | (1L << (IS_NULL_PRED - 198)) | (1L << (ISNULL - 198)) | (1L << (ISOLATION - 198)) | (1L << (JOB - 198)) | (1L << (JOBS - 198)) | (1L << (JSON - 198)) | (1L << (JSONB - 198)) | (1L << (LABEL - 198)) | (1L << (LAST - 198)) | (1L << (LDAP - 198)) | (1L << (LDAP_ADMIN_PASSWORD - 198)) | (1L << (LESS - 198)) | (1L << (LEVEL - 198)) | (1L << (LINES - 198)) | (1L << (LINK - 198)) | (1L << (LOCAL - 198)) | (1L << (LOCALTIME - 198)) | (1L << (LOCALTIMESTAMP - 198)) | (1L << (LOCATION - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (LOCK - 262)) | (1L << (LOGICAL - 262)) | (1L << (MANUAL - 262)) | (1L << (MAP - 262)) | (1L << (MATCH_ALL - 262)) | (1L << (MATCH_ANY - 262)) | (1L << (MATCH_ELEMENT_EQ - 262)) | (1L << (MATCH_ELEMENT_GE - 262)) | (1L << (MATCH_ELEMENT_GT - 262)) | (1L << (MATCH_ELEMENT_LE - 262)) | (1L << (MATCH_ELEMENT_LT - 262)) | (1L << (MATCH_PHRASE - 262)) | (1L << (MATCH_PHRASE_EDGE - 262)) | (1L << (MATCH_PHRASE_PREFIX - 262)) | (1L << (MATCH_REGEXP - 262)) | (1L << (MATERIALIZED - 262)) | (1L << (MAX - 262)) | (1L << (MEMO - 262)) | (1L << (MERGE - 262)) | (1L << (MIGRATE - 262)) | (1L << (MIGRATIONS - 262)) | (1L << (MIN - 262)) | (1L << (MINUTE - 262)) | (1L << (MODIFY - 262)) | (1L << (MONTH - 262)) | (1L << (MTMV - 262)) | (1L << (NAME - 262)) | (1L << (NAMES - 262)) | (1L << (NEGATIVE - 262)) | (1L << (NEVER - 262)) | (1L << (NEXT - 262)) | (1L << (NGRAM_BF - 262)) | (1L << (NO - 262)) | (1L << (NON_NULLABLE - 262)) | (1L << (NULLS - 262)) | (1L << (OF - 262)) | (1L << (OFFSET - 262)) | (1L << (ONLY - 262)) | (1L << (OPEN - 262)) | (1L << (OPTIMIZED - 262)) | (1L << (PARAMETER - 262)) | (1L << (PARSED - 262)) | (1L << (PARTITIONS - 262)) | (1L << (PASSWORD - 262)) | (1L << (PASSWORD_EXPIRE - 262)) | (1L << (PASSWORD_HISTORY - 262)) | (1L << (PASSWORD_LOCK_TIME - 262)) | (1L << (PASSWORD_REUSE - 262)))) != 0) || ((((_la - 326)) & ~0x3f) == 0 && ((1L << (_la - 326)) & ((1L << (PATH - 326)) | (1L << (PAUSE - 326)) | (1L << (PERCENT - 326)) | (1L << (PERIOD - 326)) | (1L << (PERMISSIVE - 326)) | (1L << (PHYSICAL - 326)) | (1L << (PLAN - 326)) | (1L << (PROCESS - 326)) | (1L << (PLUGIN - 326)) | (1L << (PLUGINS - 326)) | (1L << (POLICY - 326)) | (1L << (PROC - 326)) | (1L << (PROCESSLIST - 326)) | (1L << (PROFILE - 326)) | (1L << (PROPERTIES - 326)) | (1L << (PROPERTY - 326)) | (1L << (QUANTILE_STATE - 326)) | (1L << (QUANTILE_UNION - 326)) | (1L << (QUERY - 326)) | (1L << (QUOTA - 326)) | (1L << (RANDOM - 326)) | (1L << (RECOVER - 326)) | (1L << (RECYCLE - 326)) | (1L << (REFRESH - 326)) | (1L << (REPEATABLE - 326)) | (1L << (REPLACE - 326)) | (1L << (REPLACE_IF_NOT_NULL - 326)) | (1L << (REPOSITORIES - 326)) | (1L << (REPOSITORY - 326)) | (1L << (RESOURCE - 326)) | (1L << (RESOURCES - 326)) | (1L << (RESTORE - 326)) | (1L << (RESTRICTIVE - 326)) | (1L << (RESUME - 326)) | (1L << (RETURNS - 326)) | (1L << (REWRITTEN - 326)) | (1L << (RLIKE - 326)) | (1L << (ROLLBACK - 326)) | (1L << (ROLLUP - 326)) | (1L << (ROUTINE - 326)) | (1L << (S3 - 326)) | (1L << (SAMPLE - 326)) | (1L << (SCHEDULE - 326)) | (1L << (SCHEDULER - 326)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (SCHEMA - 390)) | (1L << (SECOND - 390)) | (1L << (SEQUENCE - 390)) | (1L << (SERIALIZABLE - 390)) | (1L << (SESSION - 390)) | (1L << (SHAPE - 390)) | (1L << (SKEW - 390)) | (1L << (SNAPSHOT - 390)) | (1L << (SONAME - 390)) | (1L << (SPLIT - 390)) | (1L << (START - 390)) | (1L << (STARTS - 390)) | (1L << (STATS - 390)) | (1L << (STATUS - 390)) | (1L << (STOP - 390)) | (1L << (STORAGE - 390)) | (1L << (STREAM - 390)) | (1L << (STREAMING - 390)) | (1L << (STRING - 390)) | (1L << (STRUCT - 390)) | (1L << (SUBDATE - 390)) | (1L << (SUM - 390)) | (1L << (TABLES - 390)) | (1L << (TASK - 390)) | (1L << (TASKS - 390)) | (1L << (TEMPORARY - 390)) | (1L << (TEXT - 390)) | (1L << (THAN - 390)) | (1L << (TIME - 390)) | (1L << (TIMESTAMP - 390)) | (1L << (TIMESTAMPADD - 390)) | (1L << (TIMESTAMPDIFF - 390)) | (1L << (TRANSACTION - 390)) | (1L << (TREE - 390)) | (1L << (TRIGGERS - 390)) | (1L << (TRUNCATE - 390)) | (1L << (TYPE - 390)) | (1L << (TYPES - 390)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (UNCOMMITTED - 454)) | (1L << (UNLOCK - 454)) | (1L << (USER - 454)) | (1L << (VALUE - 454)) | (1L << (VARCHAR - 454)) | (1L << (VARIABLES - 454)) | (1L << (VARIANT - 454)) | (1L << (VERBOSE - 454)) | (1L << (VERSION - 454)) | (1L << (VIEW - 454)) | (1L << (WARNINGS - 454)) | (1L << (WEEK - 454)) | (1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (LEADING_STRING - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
					{
					{
					setState(1572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1571);
						match(COMMA);
						}
					}

					setState(1574);
					((HintStatementContext)_localctx).hintAssignment = hintAssignment();
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).hintAssignment);
					}
					}
					setState(1579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1580);
				match(RIGHT_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintAssignmentContext extends ParserRuleContext {
		public IdentifierOrTextContext key;
		public ConstantContext constantValue;
		public IdentifierContext identifierValue;
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HintAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterHintAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitHintAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitHintAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintAssignmentContext hintAssignment() throws RecognitionException {
		HintAssignmentContext _localctx = new HintAssignmentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_hintAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			((HintAssignmentContext)_localctx).key = identifierOrText();
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1585);
				match(EQ);
				setState(1588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1586);
					((HintAssignmentContext)_localctx).constantValue = constant();
					}
					break;
				case 2:
					{
					setState(1587);
					((HintAssignmentContext)_localctx).identifierValue = identifier();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateAssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext col;
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public UpdateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUpdateAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUpdateAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUpdateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentContext updateAssignment() throws RecognitionException {
		UpdateAssignmentContext _localctx = new UpdateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_updateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			((UpdateAssignmentContext)_localctx).col = multipartIdentifier();
			setState(1593);
			match(EQ);
			setState(1596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case LEFT_BRACKET:
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADD:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case ARRAY_RANGE:
			case AT:
			case AUTHORS:
			case AUTO_INCREMENT:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BELONG:
			case BIN:
			case BINARY:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case BULK:
			case CACHED:
			case CALL:
			case CASE:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLLECT:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONSTRAINTS:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATABASE:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DUAL:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPIRED:
			case EXTERNAL:
			case EXTRACT:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GENERIC:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IF:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INTERVAL:
			case INVERTED:
			case IPV4:
			case IPV6:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case KEY:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LEFT:
			case LESS:
			case LEVEL:
			case LIKE:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MANUAL:
			case MAP:
			case MATCH_ALL:
			case MATCH_ANY:
			case MATCH_ELEMENT_EQ:
			case MATCH_ELEMENT_GE:
			case MATCH_ELEMENT_GT:
			case MATCH_ELEMENT_LE:
			case MATCH_ELEMENT_LT:
			case MATCH_PHRASE:
			case MATCH_PHRASE_EDGE:
			case MATCH_PHRASE_PREFIX:
			case MATCH_REGEXP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PROCESS:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REGEXP:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RIGHT:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VARIANT:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case PLUS:
			case SUBTRACT:
			case ASTERISK:
			case TILDE:
			case LOGICALNOT:
			case ATSIGN:
			case DOUBLEATSIGN:
			case STRING_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(1594);
				expression();
				}
				break;
			case DEFAULT:
				{
				setState(1595);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateAssignmentSeqContext extends ParserRuleContext {
		public UpdateAssignmentContext updateAssignment;
		public List<UpdateAssignmentContext> assignments = new ArrayList<UpdateAssignmentContext>();
		public List<UpdateAssignmentContext> updateAssignment() {
			return getRuleContexts(UpdateAssignmentContext.class);
		}
		public UpdateAssignmentContext updateAssignment(int i) {
			return getRuleContext(UpdateAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public UpdateAssignmentSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignmentSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUpdateAssignmentSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUpdateAssignmentSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUpdateAssignmentSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentSeqContext updateAssignmentSeq() throws RecognitionException {
		UpdateAssignmentSeqContext _localctx = new UpdateAssignmentSeqContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_updateAssignmentSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			((UpdateAssignmentSeqContext)_localctx).updateAssignment = updateAssignment();
			((UpdateAssignmentSeqContext)_localctx).assignments.add(((UpdateAssignmentSeqContext)_localctx).updateAssignment);
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1599);
				match(COMMA);
				setState(1600);
				((UpdateAssignmentSeqContext)_localctx).updateAssignment = updateAssignment();
				((UpdateAssignmentSeqContext)_localctx).assignments.add(((UpdateAssignmentSeqContext)_localctx).updateAssignment);
				}
				}
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext functionName;
		public IdentifierContext tableName;
		public IdentifierContext identifier;
		public List<IdentifierContext> columnNames = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(DorisParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(LATERAL);
			setState(1607);
			match(VIEW);
			setState(1608);
			((LateralViewContext)_localctx).functionName = identifier();
			setState(1609);
			match(LEFT_PAREN);
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXISTS - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NOT - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (LOGICALNOT - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
				{
				setState(1610);
				expression();
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1611);
					match(COMMA);
					setState(1612);
					expression();
					}
					}
					setState(1617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1620);
			match(RIGHT_PAREN);
			setState(1621);
			((LateralViewContext)_localctx).tableName = identifier();
			setState(1622);
			match(AS);
			setState(1623);
			((LateralViewContext)_localctx).identifier = identifier();
			((LateralViewContext)_localctx).columnNames.add(((LateralViewContext)_localctx).identifier);
			setState(1628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1624);
					match(COMMA);
					setState(1625);
					((LateralViewContext)_localctx).identifier = identifier();
					((LateralViewContext)_localctx).columnNames.add(((LateralViewContext)_localctx).identifier);
					}
					} 
				}
				setState(1630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortClauseContext sortClause() {
			return getRuleContext(SortClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_queryOrganization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1631);
				sortClause();
				}
				break;
			}
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1634);
				limitClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DorisParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public SortClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSortClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSortClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSortClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortClauseContext sortClause() throws RecognitionException {
		SortClauseContext _localctx = new SortClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sortClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(ORDER);
			setState(1638);
			match(BY);
			setState(1639);
			sortItem();
			setState(1644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1640);
					match(COMMA);
					setState(1641);
					sortItem();
					}
					} 
				}
				setState(1646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(DorisParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(DorisParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(DorisParser.LAST, 0); }
		public TerminalNode ASC() { return getToken(DorisParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DorisParser.DESC, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			expression();
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1648);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1651);
				match(NULLS);
				setState(1652);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public Token limit;
		public Token offset;
		public TerminalNode LIMIT() { return getToken(DorisParser.LIMIT, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DorisParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DorisParser.INTEGER_VALUE, i);
		}
		public TerminalNode OFFSET() { return getToken(DorisParser.OFFSET, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_limitClause);
		try {
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1655);
				match(LIMIT);
				setState(1656);
				((LimitClauseContext)_localctx).limit = match(INTEGER_VALUE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1657);
				match(LIMIT);
				setState(1658);
				((LimitClauseContext)_localctx).limit = match(INTEGER_VALUE);
				setState(1659);
				match(OFFSET);
				setState(1660);
				((LimitClauseContext)_localctx).offset = match(INTEGER_VALUE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1661);
				match(LIMIT);
				setState(1662);
				((LimitClauseContext)_localctx).offset = match(INTEGER_VALUE);
				setState(1663);
				match(COMMA);
				setState(1664);
				((LimitClauseContext)_localctx).limit = match(INTEGER_VALUE);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_partitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(PARTITION);
			setState(1668);
			match(BY);
			setState(1669);
			expression();
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1670);
				match(COMMA);
				setState(1671);
				expression();
				}
				}
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(DorisParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(DorisParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(DorisParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(DorisParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(DorisParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(DorisParser.FULL, 0); }
		public TerminalNode SEMI() { return getToken(DorisParser.SEMI, 0); }
		public TerminalNode ANTI() { return getToken(DorisParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_joinType);
		int _la;
		try {
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1677);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1680);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1681);
				match(LEFT);
				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1682);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1685);
				match(RIGHT);
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1686);
					match(OUTER);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1689);
				match(FULL);
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1690);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1693);
				match(LEFT);
				setState(1694);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1695);
				match(RIGHT);
				setState(1696);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1697);
				match(LEFT);
				setState(1698);
				match(ANTI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1699);
				match(RIGHT);
				setState(1700);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_joinCriteria);
		try {
			setState(1707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1703);
				match(ON);
				setState(1704);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1705);
				match(USING);
				setState(1706);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(LEFT_PAREN);
			setState(1710);
			identifierSeq();
			setState(1711);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1714);
				match(COMMA);
				setState(1715);
				((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
				((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
				}
				}
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptScanParamsContext extends ParserRuleContext {
		public IdentifierContext funcName;
		public PropertyItemListContext properties;
		public TerminalNode ATSIGN() { return getToken(DorisParser.ATSIGN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public OptScanParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optScanParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterOptScanParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitOptScanParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitOptScanParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptScanParamsContext optScanParams() throws RecognitionException {
		OptScanParamsContext _localctx = new OptScanParamsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_optScanParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			match(ATSIGN);
			setState(1722);
			((OptScanParamsContext)_localctx).funcName = identifier();
			setState(1723);
			match(LEFT_PAREN);
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (LEFT_BRACKET - 6)) | (1L << (LEFT_BRACE - 6)) | (1L << (RIGHT_BRACE - 6)) | (1L << (ADDDATE - 6)) | (1L << (AFTER - 6)) | (1L << (AGG_STATE - 6)) | (1L << (AGGREGATE - 6)) | (1L << (ALIAS - 6)) | (1L << (ANALYZED - 6)) | (1L << (ARRAY - 6)) | (1L << (ARRAY_RANGE - 6)) | (1L << (AT - 6)) | (1L << (AUTHORS - 6)) | (1L << (AUTO_INCREMENT - 6)) | (1L << (BACKENDS - 6)) | (1L << (BACKUP - 6)) | (1L << (BEGIN - 6)) | (1L << (BELONG - 6)) | (1L << (BIN - 6)) | (1L << (BINARY - 6)) | (1L << (BITAND - 6)) | (1L << (BITMAP - 6)) | (1L << (BITMAP_UNION - 6)) | (1L << (BITOR - 6)) | (1L << (BITXOR - 6)) | (1L << (BLOB - 6)) | (1L << (BOOLEAN - 6)) | (1L << (BRIEF - 6)) | (1L << (BROKER - 6)) | (1L << (BUCKETS - 6)) | (1L << (BUILD - 6)) | (1L << (BUILTIN - 6)) | (1L << (BULK - 6)) | (1L << (CACHED - 6)) | (1L << (CALL - 6)) | (1L << (CATALOG - 6)) | (1L << (CATALOGS - 6)) | (1L << (CHAIN - 6)) | (1L << (CHAR - 6)) | (1L << (CHARSET - 6)) | (1L << (CHECK - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (CLUSTER - 70)) | (1L << (CLUSTERS - 70)) | (1L << (COLLATION - 70)) | (1L << (COLLECT - 70)) | (1L << (COLUMNS - 70)) | (1L << (COMMENT - 70)) | (1L << (COMMIT - 70)) | (1L << (COMMITTED - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPLETE - 70)) | (1L << (CONFIG - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONNECTION_ID - 70)) | (1L << (CONSISTENT - 70)) | (1L << (CONSTRAINTS - 70)) | (1L << (CONVERT - 70)) | (1L << (COPY - 70)) | (1L << (COUNT - 70)) | (1L << (CREATION - 70)) | (1L << (CRON - 70)) | (1L << (CURRENT_CATALOG - 70)) | (1L << (CURRENT_DATE - 70)) | (1L << (CURRENT_TIME - 70)) | (1L << (CURRENT_TIMESTAMP - 70)) | (1L << (CURRENT_USER - 70)) | (1L << (DATA - 70)) | (1L << (DATE - 70)) | (1L << (DATE_ADD - 70)) | (1L << (DATE_CEIL - 70)) | (1L << (DATE_DIFF - 70)) | (1L << (DATE_FLOOR - 70)) | (1L << (DATE_SUB - 70)) | (1L << (DATEADD - 70)) | (1L << (DATEDIFF - 70)) | (1L << (DATETIME - 70)) | (1L << (DATETIMEV2 - 70)) | (1L << (DATEV2 - 70)) | (1L << (DATETIMEV1 - 70)) | (1L << (DATEV1 - 70)) | (1L << (DAY - 70)) | (1L << (DAYS_ADD - 70)) | (1L << (DAYS_SUB - 70)) | (1L << (DECIMAL - 70)) | (1L << (DECIMALV2 - 70)) | (1L << (DECIMALV3 - 70)) | (1L << (DEFERRED - 70)) | (1L << (DEMAND - 70)) | (1L << (DIAGNOSE - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DISTINCTPC - 134)) | (1L << (DISTINCTPCSA - 134)) | (1L << (DO - 134)) | (1L << (DORIS_INTERNAL_TABLE_ID - 134)) | (1L << (DUAL - 134)) | (1L << (DYNAMIC - 134)) | (1L << (ENABLE - 134)) | (1L << (ENCRYPTKEY - 134)) | (1L << (ENCRYPTKEYS - 134)) | (1L << (END - 134)) | (1L << (ENDS - 134)) | (1L << (ENGINE - 134)) | (1L << (ENGINES - 134)) | (1L << (ERRORS - 134)) | (1L << (EVENTS - 134)) | (1L << (EVERY - 134)) | (1L << (EXCLUDE - 134)) | (1L << (EXPIRED - 134)) | (1L << (EXTERNAL - 134)) | (1L << (FAILED_LOGIN_ATTEMPTS - 134)) | (1L << (FALSE - 134)) | (1L << (FAST - 134)) | (1L << (FEATURE - 134)) | (1L << (FIELDS - 134)) | (1L << (FILE - 134)) | (1L << (FILTER - 134)) | (1L << (FIRST - 134)) | (1L << (FORMAT - 134)) | (1L << (FREE - 134)) | (1L << (FRONTENDS - 134)) | (1L << (FUNCTION - 134)) | (1L << (GENERIC - 134)) | (1L << (GLOBAL - 134)) | (1L << (GRAPH - 134)) | (1L << (GROUPING - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (GROUPS - 198)) | (1L << (HASH - 198)) | (1L << (HDFS - 198)) | (1L << (HELP - 198)) | (1L << (HISTOGRAM - 198)) | (1L << (HLL_UNION - 198)) | (1L << (HOSTNAME - 198)) | (1L << (HOUR - 198)) | (1L << (HUB - 198)) | (1L << (IDENTIFIED - 198)) | (1L << (IGNORE - 198)) | (1L << (IMMEDIATE - 198)) | (1L << (INCREMENTAL - 198)) | (1L << (INDEXES - 198)) | (1L << (INVERTED - 198)) | (1L << (IPV4 - 198)) | (1L << (IPV6 - 198)) | (1L << (IS_NOT_NULL_PRED - 198)) | (1L << (IS_NULL_PRED - 198)) | (1L << (ISNULL - 198)) | (1L << (ISOLATION - 198)) | (1L << (JOB - 198)) | (1L << (JOBS - 198)) | (1L << (JSON - 198)) | (1L << (JSONB - 198)) | (1L << (LABEL - 198)) | (1L << (LAST - 198)) | (1L << (LDAP - 198)) | (1L << (LDAP_ADMIN_PASSWORD - 198)) | (1L << (LESS - 198)) | (1L << (LEVEL - 198)) | (1L << (LINES - 198)) | (1L << (LINK - 198)) | (1L << (LOCAL - 198)) | (1L << (LOCALTIME - 198)) | (1L << (LOCALTIMESTAMP - 198)) | (1L << (LOCATION - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (LOCK - 262)) | (1L << (LOGICAL - 262)) | (1L << (MANUAL - 262)) | (1L << (MAP - 262)) | (1L << (MATCH_ALL - 262)) | (1L << (MATCH_ANY - 262)) | (1L << (MATCH_ELEMENT_EQ - 262)) | (1L << (MATCH_ELEMENT_GE - 262)) | (1L << (MATCH_ELEMENT_GT - 262)) | (1L << (MATCH_ELEMENT_LE - 262)) | (1L << (MATCH_ELEMENT_LT - 262)) | (1L << (MATCH_PHRASE - 262)) | (1L << (MATCH_PHRASE_EDGE - 262)) | (1L << (MATCH_PHRASE_PREFIX - 262)) | (1L << (MATCH_REGEXP - 262)) | (1L << (MATERIALIZED - 262)) | (1L << (MAX - 262)) | (1L << (MEMO - 262)) | (1L << (MERGE - 262)) | (1L << (MIGRATE - 262)) | (1L << (MIGRATIONS - 262)) | (1L << (MIN - 262)) | (1L << (MINUTE - 262)) | (1L << (MODIFY - 262)) | (1L << (MONTH - 262)) | (1L << (MTMV - 262)) | (1L << (NAME - 262)) | (1L << (NAMES - 262)) | (1L << (NEGATIVE - 262)) | (1L << (NEVER - 262)) | (1L << (NEXT - 262)) | (1L << (NGRAM_BF - 262)) | (1L << (NO - 262)) | (1L << (NON_NULLABLE - 262)) | (1L << (NULL - 262)) | (1L << (NULLS - 262)) | (1L << (OF - 262)) | (1L << (OFFSET - 262)) | (1L << (ONLY - 262)) | (1L << (OPEN - 262)) | (1L << (OPTIMIZED - 262)) | (1L << (PARAMETER - 262)) | (1L << (PARSED - 262)) | (1L << (PARTITIONS - 262)) | (1L << (PASSWORD - 262)) | (1L << (PASSWORD_EXPIRE - 262)) | (1L << (PASSWORD_HISTORY - 262)) | (1L << (PASSWORD_LOCK_TIME - 262)) | (1L << (PASSWORD_REUSE - 262)))) != 0) || ((((_la - 326)) & ~0x3f) == 0 && ((1L << (_la - 326)) & ((1L << (PATH - 326)) | (1L << (PAUSE - 326)) | (1L << (PERCENT - 326)) | (1L << (PERIOD - 326)) | (1L << (PERMISSIVE - 326)) | (1L << (PHYSICAL - 326)) | (1L << (PLAN - 326)) | (1L << (PROCESS - 326)) | (1L << (PLUGIN - 326)) | (1L << (PLUGINS - 326)) | (1L << (POLICY - 326)) | (1L << (PROC - 326)) | (1L << (PROCESSLIST - 326)) | (1L << (PROFILE - 326)) | (1L << (PROPERTIES - 326)) | (1L << (PROPERTY - 326)) | (1L << (QUANTILE_STATE - 326)) | (1L << (QUANTILE_UNION - 326)) | (1L << (QUERY - 326)) | (1L << (QUOTA - 326)) | (1L << (RANDOM - 326)) | (1L << (RECOVER - 326)) | (1L << (RECYCLE - 326)) | (1L << (REFRESH - 326)) | (1L << (REPEATABLE - 326)) | (1L << (REPLACE - 326)) | (1L << (REPLACE_IF_NOT_NULL - 326)) | (1L << (REPOSITORIES - 326)) | (1L << (REPOSITORY - 326)) | (1L << (RESOURCE - 326)) | (1L << (RESOURCES - 326)) | (1L << (RESTORE - 326)) | (1L << (RESTRICTIVE - 326)) | (1L << (RESUME - 326)) | (1L << (RETURNS - 326)) | (1L << (REWRITTEN - 326)) | (1L << (RLIKE - 326)) | (1L << (ROLLBACK - 326)) | (1L << (ROLLUP - 326)) | (1L << (ROUTINE - 326)) | (1L << (S3 - 326)) | (1L << (SAMPLE - 326)) | (1L << (SCHEDULE - 326)) | (1L << (SCHEDULER - 326)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (SCHEMA - 390)) | (1L << (SECOND - 390)) | (1L << (SEQUENCE - 390)) | (1L << (SERIALIZABLE - 390)) | (1L << (SESSION - 390)) | (1L << (SHAPE - 390)) | (1L << (SKEW - 390)) | (1L << (SNAPSHOT - 390)) | (1L << (SONAME - 390)) | (1L << (SPLIT - 390)) | (1L << (START - 390)) | (1L << (STARTS - 390)) | (1L << (STATS - 390)) | (1L << (STATUS - 390)) | (1L << (STOP - 390)) | (1L << (STORAGE - 390)) | (1L << (STREAM - 390)) | (1L << (STREAMING - 390)) | (1L << (STRING - 390)) | (1L << (STRUCT - 390)) | (1L << (SUBDATE - 390)) | (1L << (SUM - 390)) | (1L << (TABLES - 390)) | (1L << (TASK - 390)) | (1L << (TASKS - 390)) | (1L << (TEMPORARY - 390)) | (1L << (TEXT - 390)) | (1L << (THAN - 390)) | (1L << (TIME - 390)) | (1L << (TIMESTAMP - 390)) | (1L << (TIMESTAMPADD - 390)) | (1L << (TIMESTAMPDIFF - 390)) | (1L << (TRANSACTION - 390)) | (1L << (TREE - 390)) | (1L << (TRIGGERS - 390)) | (1L << (TRUE - 390)) | (1L << (TRUNCATE - 390)) | (1L << (TYPE - 390)) | (1L << (TYPES - 390)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (UNCOMMITTED - 454)) | (1L << (UNLOCK - 454)) | (1L << (USER - 454)) | (1L << (VALUE - 454)) | (1L << (VARCHAR - 454)) | (1L << (VARIABLES - 454)) | (1L << (VARIANT - 454)) | (1L << (VERBOSE - 454)) | (1L << (VERSION - 454)) | (1L << (VIEW - 454)) | (1L << (WARNINGS - 454)) | (1L << (WEEK - 454)) | (1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (SUBTRACT - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
				{
				setState(1724);
				((OptScanParamsContext)_localctx).properties = propertyItemList();
				}
			}

			setState(1727);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public IdentifierContext tvfName;
		public PropertyItemListContext properties;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationListContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public RelationListContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRelationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRelationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRelationList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public OptScanParamsContext optScanParams() {
			return getRuleContext(OptScanParamsContext.class,0);
		}
		public MaterializedViewNameContext materializedViewName() {
			return getRuleContext(MaterializedViewNameContext.class,0);
		}
		public SpecifiedPartitionContext specifiedPartition() {
			return getRuleContext(SpecifiedPartitionContext.class,0);
		}
		public TabletListContext tabletList() {
			return getRuleContext(TabletListContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public RelationHintContext relationHint() {
			return getRuleContext(RelationHintContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_relationPrimary);
		int _la;
		try {
			int _alt;
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				multipartIdentifier();
				setState(1731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1730);
					optScanParams();
					}
					break;
				}
				setState(1734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1733);
					materializedViewName();
					}
					break;
				}
				setState(1737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1736);
					specifiedPartition();
					}
					break;
				}
				setState(1740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1739);
					tabletList();
					}
					break;
				}
				setState(1742);
				tableAlias();
				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1743);
					sample();
					}
					break;
				}
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1746);
					relationHint();
					}
					break;
				}
				setState(1752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1749);
						lateralView();
						}
						} 
					}
					setState(1754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1755);
				match(LEFT_PAREN);
				setState(1756);
				query();
				setState(1757);
				match(RIGHT_PAREN);
				setState(1758);
				tableAlias();
				setState(1762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1759);
						lateralView();
						}
						} 
					}
					setState(1764);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1765);
				((TableValuedFunctionContext)_localctx).tvfName = identifier();
				setState(1766);
				match(LEFT_PAREN);
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (LEFT_BRACKET - 6)) | (1L << (LEFT_BRACE - 6)) | (1L << (RIGHT_BRACE - 6)) | (1L << (ADDDATE - 6)) | (1L << (AFTER - 6)) | (1L << (AGG_STATE - 6)) | (1L << (AGGREGATE - 6)) | (1L << (ALIAS - 6)) | (1L << (ANALYZED - 6)) | (1L << (ARRAY - 6)) | (1L << (ARRAY_RANGE - 6)) | (1L << (AT - 6)) | (1L << (AUTHORS - 6)) | (1L << (AUTO_INCREMENT - 6)) | (1L << (BACKENDS - 6)) | (1L << (BACKUP - 6)) | (1L << (BEGIN - 6)) | (1L << (BELONG - 6)) | (1L << (BIN - 6)) | (1L << (BINARY - 6)) | (1L << (BITAND - 6)) | (1L << (BITMAP - 6)) | (1L << (BITMAP_UNION - 6)) | (1L << (BITOR - 6)) | (1L << (BITXOR - 6)) | (1L << (BLOB - 6)) | (1L << (BOOLEAN - 6)) | (1L << (BRIEF - 6)) | (1L << (BROKER - 6)) | (1L << (BUCKETS - 6)) | (1L << (BUILD - 6)) | (1L << (BUILTIN - 6)) | (1L << (BULK - 6)) | (1L << (CACHED - 6)) | (1L << (CALL - 6)) | (1L << (CATALOG - 6)) | (1L << (CATALOGS - 6)) | (1L << (CHAIN - 6)) | (1L << (CHAR - 6)) | (1L << (CHARSET - 6)) | (1L << (CHECK - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (CLUSTER - 70)) | (1L << (CLUSTERS - 70)) | (1L << (COLLATION - 70)) | (1L << (COLLECT - 70)) | (1L << (COLUMNS - 70)) | (1L << (COMMENT - 70)) | (1L << (COMMIT - 70)) | (1L << (COMMITTED - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPLETE - 70)) | (1L << (CONFIG - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONNECTION_ID - 70)) | (1L << (CONSISTENT - 70)) | (1L << (CONSTRAINTS - 70)) | (1L << (CONVERT - 70)) | (1L << (COPY - 70)) | (1L << (COUNT - 70)) | (1L << (CREATION - 70)) | (1L << (CRON - 70)) | (1L << (CURRENT_CATALOG - 70)) | (1L << (CURRENT_DATE - 70)) | (1L << (CURRENT_TIME - 70)) | (1L << (CURRENT_TIMESTAMP - 70)) | (1L << (CURRENT_USER - 70)) | (1L << (DATA - 70)) | (1L << (DATE - 70)) | (1L << (DATE_ADD - 70)) | (1L << (DATE_CEIL - 70)) | (1L << (DATE_DIFF - 70)) | (1L << (DATE_FLOOR - 70)) | (1L << (DATE_SUB - 70)) | (1L << (DATEADD - 70)) | (1L << (DATEDIFF - 70)) | (1L << (DATETIME - 70)) | (1L << (DATETIMEV2 - 70)) | (1L << (DATEV2 - 70)) | (1L << (DATETIMEV1 - 70)) | (1L << (DATEV1 - 70)) | (1L << (DAY - 70)) | (1L << (DAYS_ADD - 70)) | (1L << (DAYS_SUB - 70)) | (1L << (DECIMAL - 70)) | (1L << (DECIMALV2 - 70)) | (1L << (DECIMALV3 - 70)) | (1L << (DEFERRED - 70)) | (1L << (DEMAND - 70)) | (1L << (DIAGNOSE - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DISTINCTPC - 134)) | (1L << (DISTINCTPCSA - 134)) | (1L << (DO - 134)) | (1L << (DORIS_INTERNAL_TABLE_ID - 134)) | (1L << (DUAL - 134)) | (1L << (DYNAMIC - 134)) | (1L << (ENABLE - 134)) | (1L << (ENCRYPTKEY - 134)) | (1L << (ENCRYPTKEYS - 134)) | (1L << (END - 134)) | (1L << (ENDS - 134)) | (1L << (ENGINE - 134)) | (1L << (ENGINES - 134)) | (1L << (ERRORS - 134)) | (1L << (EVENTS - 134)) | (1L << (EVERY - 134)) | (1L << (EXCLUDE - 134)) | (1L << (EXPIRED - 134)) | (1L << (EXTERNAL - 134)) | (1L << (FAILED_LOGIN_ATTEMPTS - 134)) | (1L << (FALSE - 134)) | (1L << (FAST - 134)) | (1L << (FEATURE - 134)) | (1L << (FIELDS - 134)) | (1L << (FILE - 134)) | (1L << (FILTER - 134)) | (1L << (FIRST - 134)) | (1L << (FORMAT - 134)) | (1L << (FREE - 134)) | (1L << (FRONTENDS - 134)) | (1L << (FUNCTION - 134)) | (1L << (GENERIC - 134)) | (1L << (GLOBAL - 134)) | (1L << (GRAPH - 134)) | (1L << (GROUPING - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (GROUPS - 198)) | (1L << (HASH - 198)) | (1L << (HDFS - 198)) | (1L << (HELP - 198)) | (1L << (HISTOGRAM - 198)) | (1L << (HLL_UNION - 198)) | (1L << (HOSTNAME - 198)) | (1L << (HOUR - 198)) | (1L << (HUB - 198)) | (1L << (IDENTIFIED - 198)) | (1L << (IGNORE - 198)) | (1L << (IMMEDIATE - 198)) | (1L << (INCREMENTAL - 198)) | (1L << (INDEXES - 198)) | (1L << (INVERTED - 198)) | (1L << (IPV4 - 198)) | (1L << (IPV6 - 198)) | (1L << (IS_NOT_NULL_PRED - 198)) | (1L << (IS_NULL_PRED - 198)) | (1L << (ISNULL - 198)) | (1L << (ISOLATION - 198)) | (1L << (JOB - 198)) | (1L << (JOBS - 198)) | (1L << (JSON - 198)) | (1L << (JSONB - 198)) | (1L << (LABEL - 198)) | (1L << (LAST - 198)) | (1L << (LDAP - 198)) | (1L << (LDAP_ADMIN_PASSWORD - 198)) | (1L << (LESS - 198)) | (1L << (LEVEL - 198)) | (1L << (LINES - 198)) | (1L << (LINK - 198)) | (1L << (LOCAL - 198)) | (1L << (LOCALTIME - 198)) | (1L << (LOCALTIMESTAMP - 198)) | (1L << (LOCATION - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (LOCK - 262)) | (1L << (LOGICAL - 262)) | (1L << (MANUAL - 262)) | (1L << (MAP - 262)) | (1L << (MATCH_ALL - 262)) | (1L << (MATCH_ANY - 262)) | (1L << (MATCH_ELEMENT_EQ - 262)) | (1L << (MATCH_ELEMENT_GE - 262)) | (1L << (MATCH_ELEMENT_GT - 262)) | (1L << (MATCH_ELEMENT_LE - 262)) | (1L << (MATCH_ELEMENT_LT - 262)) | (1L << (MATCH_PHRASE - 262)) | (1L << (MATCH_PHRASE_EDGE - 262)) | (1L << (MATCH_PHRASE_PREFIX - 262)) | (1L << (MATCH_REGEXP - 262)) | (1L << (MATERIALIZED - 262)) | (1L << (MAX - 262)) | (1L << (MEMO - 262)) | (1L << (MERGE - 262)) | (1L << (MIGRATE - 262)) | (1L << (MIGRATIONS - 262)) | (1L << (MIN - 262)) | (1L << (MINUTE - 262)) | (1L << (MODIFY - 262)) | (1L << (MONTH - 262)) | (1L << (MTMV - 262)) | (1L << (NAME - 262)) | (1L << (NAMES - 262)) | (1L << (NEGATIVE - 262)) | (1L << (NEVER - 262)) | (1L << (NEXT - 262)) | (1L << (NGRAM_BF - 262)) | (1L << (NO - 262)) | (1L << (NON_NULLABLE - 262)) | (1L << (NULL - 262)) | (1L << (NULLS - 262)) | (1L << (OF - 262)) | (1L << (OFFSET - 262)) | (1L << (ONLY - 262)) | (1L << (OPEN - 262)) | (1L << (OPTIMIZED - 262)) | (1L << (PARAMETER - 262)) | (1L << (PARSED - 262)) | (1L << (PARTITIONS - 262)) | (1L << (PASSWORD - 262)) | (1L << (PASSWORD_EXPIRE - 262)) | (1L << (PASSWORD_HISTORY - 262)) | (1L << (PASSWORD_LOCK_TIME - 262)) | (1L << (PASSWORD_REUSE - 262)))) != 0) || ((((_la - 326)) & ~0x3f) == 0 && ((1L << (_la - 326)) & ((1L << (PATH - 326)) | (1L << (PAUSE - 326)) | (1L << (PERCENT - 326)) | (1L << (PERIOD - 326)) | (1L << (PERMISSIVE - 326)) | (1L << (PHYSICAL - 326)) | (1L << (PLAN - 326)) | (1L << (PROCESS - 326)) | (1L << (PLUGIN - 326)) | (1L << (PLUGINS - 326)) | (1L << (POLICY - 326)) | (1L << (PROC - 326)) | (1L << (PROCESSLIST - 326)) | (1L << (PROFILE - 326)) | (1L << (PROPERTIES - 326)) | (1L << (PROPERTY - 326)) | (1L << (QUANTILE_STATE - 326)) | (1L << (QUANTILE_UNION - 326)) | (1L << (QUERY - 326)) | (1L << (QUOTA - 326)) | (1L << (RANDOM - 326)) | (1L << (RECOVER - 326)) | (1L << (RECYCLE - 326)) | (1L << (REFRESH - 326)) | (1L << (REPEATABLE - 326)) | (1L << (REPLACE - 326)) | (1L << (REPLACE_IF_NOT_NULL - 326)) | (1L << (REPOSITORIES - 326)) | (1L << (REPOSITORY - 326)) | (1L << (RESOURCE - 326)) | (1L << (RESOURCES - 326)) | (1L << (RESTORE - 326)) | (1L << (RESTRICTIVE - 326)) | (1L << (RESUME - 326)) | (1L << (RETURNS - 326)) | (1L << (REWRITTEN - 326)) | (1L << (RLIKE - 326)) | (1L << (ROLLBACK - 326)) | (1L << (ROLLUP - 326)) | (1L << (ROUTINE - 326)) | (1L << (S3 - 326)) | (1L << (SAMPLE - 326)) | (1L << (SCHEDULE - 326)) | (1L << (SCHEDULER - 326)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (SCHEMA - 390)) | (1L << (SECOND - 390)) | (1L << (SEQUENCE - 390)) | (1L << (SERIALIZABLE - 390)) | (1L << (SESSION - 390)) | (1L << (SHAPE - 390)) | (1L << (SKEW - 390)) | (1L << (SNAPSHOT - 390)) | (1L << (SONAME - 390)) | (1L << (SPLIT - 390)) | (1L << (START - 390)) | (1L << (STARTS - 390)) | (1L << (STATS - 390)) | (1L << (STATUS - 390)) | (1L << (STOP - 390)) | (1L << (STORAGE - 390)) | (1L << (STREAM - 390)) | (1L << (STREAMING - 390)) | (1L << (STRING - 390)) | (1L << (STRUCT - 390)) | (1L << (SUBDATE - 390)) | (1L << (SUM - 390)) | (1L << (TABLES - 390)) | (1L << (TASK - 390)) | (1L << (TASKS - 390)) | (1L << (TEMPORARY - 390)) | (1L << (TEXT - 390)) | (1L << (THAN - 390)) | (1L << (TIME - 390)) | (1L << (TIMESTAMP - 390)) | (1L << (TIMESTAMPADD - 390)) | (1L << (TIMESTAMPDIFF - 390)) | (1L << (TRANSACTION - 390)) | (1L << (TREE - 390)) | (1L << (TRIGGERS - 390)) | (1L << (TRUE - 390)) | (1L << (TRUNCATE - 390)) | (1L << (TYPE - 390)) | (1L << (TYPES - 390)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (UNCOMMITTED - 454)) | (1L << (UNLOCK - 454)) | (1L << (USER - 454)) | (1L << (VALUE - 454)) | (1L << (VARCHAR - 454)) | (1L << (VARIABLES - 454)) | (1L << (VARIANT - 454)) | (1L << (VERBOSE - 454)) | (1L << (VERSION - 454)) | (1L << (VIEW - 454)) | (1L << (WARNINGS - 454)) | (1L << (WEEK - 454)) | (1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (SUBTRACT - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
					{
					setState(1767);
					((TableValuedFunctionContext)_localctx).properties = propertyItemList();
					}
				}

				setState(1770);
				match(RIGHT_PAREN);
				setState(1771);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new RelationListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1773);
				match(LEFT_PAREN);
				setState(1774);
				relations();
				setState(1775);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterializedViewNameContext extends ParserRuleContext {
		public IdentifierContext indexName;
		public TerminalNode INDEX() { return getToken(DorisParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MaterializedViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materializedViewName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMaterializedViewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMaterializedViewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMaterializedViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterializedViewNameContext materializedViewName() throws RecognitionException {
		MaterializedViewNameContext _localctx = new MaterializedViewNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_materializedViewName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			match(INDEX);
			setState(1780);
			((MaterializedViewNameContext)_localctx).indexName = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyClauseContext extends ParserRuleContext {
		public PropertyItemListContext fileProperties;
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public PropertyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyClauseContext propertyClause() throws RecognitionException {
		PropertyClauseContext _localctx = new PropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_propertyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(PROPERTIES);
			setState(1783);
			match(LEFT_PAREN);
			setState(1784);
			((PropertyClauseContext)_localctx).fileProperties = propertyItemList();
			setState(1785);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyItemListContext extends ParserRuleContext {
		public PropertyItemContext propertyItem;
		public List<PropertyItemContext> properties = new ArrayList<PropertyItemContext>();
		public List<PropertyItemContext> propertyItem() {
			return getRuleContexts(PropertyItemContext.class);
		}
		public PropertyItemContext propertyItem(int i) {
			return getRuleContext(PropertyItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PropertyItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyItemListContext propertyItemList() throws RecognitionException {
		PropertyItemListContext _localctx = new PropertyItemListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_propertyItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			((PropertyItemListContext)_localctx).propertyItem = propertyItem();
			((PropertyItemListContext)_localctx).properties.add(((PropertyItemListContext)_localctx).propertyItem);
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1788);
				match(COMMA);
				setState(1789);
				((PropertyItemListContext)_localctx).propertyItem = propertyItem();
				((PropertyItemListContext)_localctx).properties.add(((PropertyItemListContext)_localctx).propertyItem);
				}
				}
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyItemContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public PropertyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyItemContext propertyItem() throws RecognitionException {
		PropertyItemContext _localctx = new PropertyItemContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_propertyItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			((PropertyItemContext)_localctx).key = propertyKey();
			setState(1796);
			match(EQ);
			setState(1797);
			((PropertyItemContext)_localctx).value = propertyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyKeyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_propertyKey);
		try {
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1799);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1800);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_propertyValue);
		try {
			setState(1805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1807);
					match(AS);
					}
				}

				setState(1810);
				strictIdentifier();
				setState(1812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1811);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DorisParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DorisParser.DOT, i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(1821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1817);
					match(DOT);
					setState(1818);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleColumnDefsContext extends ParserRuleContext {
		public SimpleColumnDefContext simpleColumnDef;
		public List<SimpleColumnDefContext> cols = new ArrayList<SimpleColumnDefContext>();
		public List<SimpleColumnDefContext> simpleColumnDef() {
			return getRuleContexts(SimpleColumnDefContext.class);
		}
		public SimpleColumnDefContext simpleColumnDef(int i) {
			return getRuleContext(SimpleColumnDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public SimpleColumnDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleColumnDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSimpleColumnDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSimpleColumnDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSimpleColumnDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleColumnDefsContext simpleColumnDefs() throws RecognitionException {
		SimpleColumnDefsContext _localctx = new SimpleColumnDefsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_simpleColumnDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			((SimpleColumnDefsContext)_localctx).simpleColumnDef = simpleColumnDef();
			((SimpleColumnDefsContext)_localctx).cols.add(((SimpleColumnDefsContext)_localctx).simpleColumnDef);
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1825);
				match(COMMA);
				setState(1826);
				((SimpleColumnDefsContext)_localctx).simpleColumnDef = simpleColumnDef();
				((SimpleColumnDefsContext)_localctx).cols.add(((SimpleColumnDefsContext)_localctx).simpleColumnDef);
				}
				}
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleColumnDefContext extends ParserRuleContext {
		public IdentifierContext colName;
		public Token comment;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public SimpleColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleColumnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSimpleColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSimpleColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSimpleColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleColumnDefContext simpleColumnDef() throws RecognitionException {
		SimpleColumnDefContext _localctx = new SimpleColumnDefContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_simpleColumnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			((SimpleColumnDefContext)_localctx).colName = identifier();
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1833);
				match(COMMENT);
				setState(1834);
				((SimpleColumnDefContext)_localctx).comment = match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefsContext extends ParserRuleContext {
		public ColumnDefContext columnDef;
		public List<ColumnDefContext> cols = new ArrayList<ColumnDefContext>();
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ColumnDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefsContext columnDefs() throws RecognitionException {
		ColumnDefsContext _localctx = new ColumnDefsContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_columnDefs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			((ColumnDefsContext)_localctx).columnDef = columnDef();
			((ColumnDefsContext)_localctx).cols.add(((ColumnDefsContext)_localctx).columnDef);
			setState(1842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1838);
					match(COMMA);
					setState(1839);
					((ColumnDefsContext)_localctx).columnDef = columnDef();
					((ColumnDefsContext)_localctx).cols.add(((ColumnDefsContext)_localctx).columnDef);
					}
					} 
				}
				setState(1844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefContext extends ParserRuleContext {
		public IdentifierContext colName;
		public DataTypeContext type;
		public AggTypeDefContext aggType;
		public NumberContext autoIncInitValue;
		public Token nullValue;
		public Token stringValue;
		public Token defaultTimestamp;
		public NumberContext defaultValuePrecision;
		public NumberContext onUpdateValuePrecision;
		public Token comment;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public List<TerminalNode> NULL() { return getTokens(DorisParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(DorisParser.NULL, i);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(DorisParser.AUTO_INCREMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(DorisParser.UPDATE, 0); }
		public List<TerminalNode> CURRENT_TIMESTAMP() { return getTokens(DorisParser.CURRENT_TIMESTAMP); }
		public TerminalNode CURRENT_TIMESTAMP(int i) {
			return getToken(DorisParser.CURRENT_TIMESTAMP, i);
		}
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public AggTypeDefContext aggTypeDef() {
			return getRuleContext(AggTypeDefContext.class,0);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(DorisParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(DorisParser.STRING_LITERAL, i);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(DorisParser.CURRENT_DATE, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DorisParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DorisParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DorisParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DorisParser.RIGHT_PAREN, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			((ColumnDefContext)_localctx).colName = identifier();
			setState(1846);
			((ColumnDefContext)_localctx).type = dataType();
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(1847);
				match(KEY);
				}
			}

			setState(1851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITMAP_UNION || _la==GENERIC || _la==HLL_UNION || _la==MAX || _la==MIN || ((((_la - 347)) & ~0x3f) == 0 && ((1L << (_la - 347)) & ((1L << (QUANTILE_UNION - 347)) | (1L << (REPLACE - 347)) | (1L << (REPLACE_IF_NOT_NULL - 347)))) != 0) || _la==SUM) {
				{
				setState(1850);
				((ColumnDefContext)_localctx).aggType = aggTypeDef();
				}
			}

			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(1854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1853);
					match(NOT);
					}
				}

				setState(1856);
				match(NULL);
				}
			}

			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(1859);
				match(AUTO_INCREMENT);
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1860);
					match(LEFT_PAREN);
					setState(1861);
					((ColumnDefContext)_localctx).autoIncInitValue = number();
					setState(1862);
					match(RIGHT_PAREN);
					}
				}

				}
			}

			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1868);
				match(DEFAULT);
				setState(1880);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(1869);
					((ColumnDefContext)_localctx).nullValue = match(NULL);
					}
					break;
				case INTEGER_VALUE:
					{
					setState(1870);
					match(INTEGER_VALUE);
					}
					break;
				case STRING_LITERAL:
					{
					setState(1871);
					((ColumnDefContext)_localctx).stringValue = match(STRING_LITERAL);
					}
					break;
				case CURRENT_DATE:
					{
					setState(1872);
					match(CURRENT_DATE);
					}
					break;
				case CURRENT_TIMESTAMP:
					{
					setState(1873);
					((ColumnDefContext)_localctx).defaultTimestamp = match(CURRENT_TIMESTAMP);
					setState(1878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_PAREN) {
						{
						setState(1874);
						match(LEFT_PAREN);
						setState(1875);
						((ColumnDefContext)_localctx).defaultValuePrecision = number();
						setState(1876);
						match(RIGHT_PAREN);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1884);
				match(ON);
				setState(1885);
				match(UPDATE);
				setState(1886);
				match(CURRENT_TIMESTAMP);
				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1887);
					match(LEFT_PAREN);
					setState(1888);
					((ColumnDefContext)_localctx).onUpdateValuePrecision = number();
					setState(1889);
					match(RIGHT_PAREN);
					}
				}

				}
			}

			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1895);
				match(COMMENT);
				setState(1896);
				((ColumnDefContext)_localctx).comment = match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefsContext extends ParserRuleContext {
		public IndexDefContext indexDef;
		public List<IndexDefContext> indexes = new ArrayList<IndexDefContext>();
		public List<IndexDefContext> indexDef() {
			return getRuleContexts(IndexDefContext.class);
		}
		public IndexDefContext indexDef(int i) {
			return getRuleContext(IndexDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public IndexDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIndexDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIndexDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIndexDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexDefsContext indexDefs() throws RecognitionException {
		IndexDefsContext _localctx = new IndexDefsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_indexDefs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			((IndexDefsContext)_localctx).indexDef = indexDef();
			((IndexDefsContext)_localctx).indexes.add(((IndexDefsContext)_localctx).indexDef);
			setState(1904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1900);
					match(COMMA);
					setState(1901);
					((IndexDefsContext)_localctx).indexDef = indexDef();
					((IndexDefsContext)_localctx).indexes.add(((IndexDefsContext)_localctx).indexDef);
					}
					} 
				}
				setState(1906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefContext extends ParserRuleContext {
		public IdentifierContext indexName;
		public IdentifierListContext cols;
		public Token indexType;
		public PropertyItemListContext properties;
		public Token comment;
		public TerminalNode INDEX() { return getToken(DorisParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode BITMAP() { return getToken(DorisParser.BITMAP, 0); }
		public TerminalNode INVERTED() { return getToken(DorisParser.INVERTED, 0); }
		public TerminalNode NGRAM_BF() { return getToken(DorisParser.NGRAM_BF, 0); }
		public IndexDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIndexDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIndexDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIndexDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexDefContext indexDef() throws RecognitionException {
		IndexDefContext _localctx = new IndexDefContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_indexDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			match(INDEX);
			setState(1908);
			((IndexDefContext)_localctx).indexName = identifier();
			setState(1909);
			((IndexDefContext)_localctx).cols = identifierList();
			setState(1912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1910);
				match(USING);
				setState(1911);
				((IndexDefContext)_localctx).indexType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BITMAP || _la==INVERTED || _la==NGRAM_BF) ) {
					((IndexDefContext)_localctx).indexType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPERTIES) {
				{
				setState(1914);
				match(PROPERTIES);
				setState(1915);
				match(LEFT_PAREN);
				setState(1916);
				((IndexDefContext)_localctx).properties = propertyItemList();
				setState(1917);
				match(RIGHT_PAREN);
				}
			}

			setState(1923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1921);
				match(COMMENT);
				setState(1922);
				((IndexDefContext)_localctx).comment = match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionsDefContext extends ParserRuleContext {
		public PartitionDefContext partitionDef;
		public List<PartitionDefContext> partitions = new ArrayList<PartitionDefContext>();
		public List<PartitionDefContext> partitionDef() {
			return getRuleContexts(PartitionDefContext.class);
		}
		public PartitionDefContext partitionDef(int i) {
			return getRuleContext(PartitionDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PartitionsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionsDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionsDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionsDefContext partitionsDef() throws RecognitionException {
		PartitionsDefContext _localctx = new PartitionsDefContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_partitionsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			((PartitionsDefContext)_localctx).partitionDef = partitionDef();
			((PartitionsDefContext)_localctx).partitions.add(((PartitionsDefContext)_localctx).partitionDef);
			setState(1930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1926);
				match(COMMA);
				setState(1927);
				((PartitionsDefContext)_localctx).partitionDef = partitionDef();
				((PartitionsDefContext)_localctx).partitions.add(((PartitionsDefContext)_localctx).partitionDef);
				}
				}
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefContext extends ParserRuleContext {
		public PropertyItemListContext partitionProperties;
		public LessThanPartitionDefContext lessThanPartitionDef() {
			return getRuleContext(LessThanPartitionDefContext.class,0);
		}
		public FixedPartitionDefContext fixedPartitionDef() {
			return getRuleContext(FixedPartitionDefContext.class,0);
		}
		public StepPartitionDefContext stepPartitionDef() {
			return getRuleContext(StepPartitionDefContext.class,0);
		}
		public InPartitionDefContext inPartitionDef() {
			return getRuleContext(InPartitionDefContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public PartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionDefContext partitionDef() throws RecognitionException {
		PartitionDefContext _localctx = new PartitionDefContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_partitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1933);
				lessThanPartitionDef();
				}
				break;
			case 2:
				{
				setState(1934);
				fixedPartitionDef();
				}
				break;
			case 3:
				{
				setState(1935);
				stepPartitionDef();
				}
				break;
			case 4:
				{
				setState(1936);
				inPartitionDef();
				}
				break;
			}
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1939);
				match(LEFT_PAREN);
				setState(1940);
				((PartitionDefContext)_localctx).partitionProperties = propertyItemList();
				setState(1941);
				match(RIGHT_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanPartitionDefContext extends ParserRuleContext {
		public IdentifierContext partitionName;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public TerminalNode LESS() { return getToken(DorisParser.LESS, 0); }
		public TerminalNode THAN() { return getToken(DorisParser.THAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MAXVALUE() { return getToken(DorisParser.MAXVALUE, 0); }
		public ConstantSeqContext constantSeq() {
			return getRuleContext(ConstantSeqContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public LessThanPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLessThanPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLessThanPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLessThanPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanPartitionDefContext lessThanPartitionDef() throws RecognitionException {
		LessThanPartitionDefContext _localctx = new LessThanPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lessThanPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			match(PARTITION);
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1946);
				match(IF);
				setState(1947);
				match(NOT);
				setState(1948);
				match(EXISTS);
				}
			}

			setState(1951);
			((LessThanPartitionDefContext)_localctx).partitionName = identifier();
			setState(1952);
			match(VALUES);
			setState(1953);
			match(LESS);
			setState(1954);
			match(THAN);
			setState(1957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXVALUE:
				{
				setState(1955);
				match(MAXVALUE);
				}
				break;
			case LEFT_PAREN:
				{
				setState(1956);
				constantSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedPartitionDefContext extends ParserRuleContext {
		public IdentifierContext partitionName;
		public ConstantSeqContext lower;
		public ConstantSeqContext upper;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConstantSeqContext> constantSeq() {
			return getRuleContexts(ConstantSeqContext.class);
		}
		public ConstantSeqContext constantSeq(int i) {
			return getRuleContext(ConstantSeqContext.class,i);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public FixedPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFixedPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFixedPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFixedPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPartitionDefContext fixedPartitionDef() throws RecognitionException {
		FixedPartitionDefContext _localctx = new FixedPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fixedPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			match(PARTITION);
			setState(1963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1960);
				match(IF);
				setState(1961);
				match(NOT);
				setState(1962);
				match(EXISTS);
				}
			}

			setState(1965);
			((FixedPartitionDefContext)_localctx).partitionName = identifier();
			setState(1966);
			match(VALUES);
			setState(1967);
			match(LEFT_BRACKET);
			setState(1968);
			((FixedPartitionDefContext)_localctx).lower = constantSeq();
			setState(1969);
			match(COMMA);
			setState(1970);
			((FixedPartitionDefContext)_localctx).upper = constantSeq();
			setState(1971);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepPartitionDefContext extends ParserRuleContext {
		public ConstantSeqContext from;
		public ConstantSeqContext to;
		public Token unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TerminalNode TO() { return getToken(DorisParser.TO, 0); }
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public List<ConstantSeqContext> constantSeq() {
			return getRuleContexts(ConstantSeqContext.class);
		}
		public ConstantSeqContext constantSeq(int i) {
			return getRuleContext(ConstantSeqContext.class,i);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public StepPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStepPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStepPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStepPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepPartitionDefContext stepPartitionDef() throws RecognitionException {
		StepPartitionDefContext _localctx = new StepPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_stepPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			match(FROM);
			setState(1974);
			((StepPartitionDefContext)_localctx).from = constantSeq();
			setState(1975);
			match(TO);
			setState(1976);
			((StepPartitionDefContext)_localctx).to = constantSeq();
			setState(1977);
			match(INTERVAL);
			setState(1978);
			((StepPartitionDefContext)_localctx).unitsAmount = match(INTEGER_VALUE);
			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DAY || _la==HOUR || _la==MINUTE || _la==MONTH || _la==SECOND || _la==WEEK || _la==YEAR) {
				{
				setState(1979);
				((StepPartitionDefContext)_localctx).unit = datetimeUnit();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InPartitionDefContext extends ParserRuleContext {
		public IdentifierContext partitionName;
		public ConstantSeqContext constantSeq;
		public List<ConstantSeqContext> constantSeqs = new ArrayList<ConstantSeqContext>();
		public ConstantSeqContext constants;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public TerminalNode IN() { return getToken(DorisParser.IN, 0); }
		public List<ConstantSeqContext> constantSeq() {
			return getRuleContexts(ConstantSeqContext.class);
		}
		public ConstantSeqContext constantSeq(int i) {
			return getRuleContext(ConstantSeqContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public InPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPartitionDefContext inPartitionDef() throws RecognitionException {
		InPartitionDefContext _localctx = new InPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_inPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			match(PARTITION);
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1983);
				match(IF);
				setState(1984);
				match(NOT);
				setState(1985);
				match(EXISTS);
				}
			}

			setState(1988);
			((InPartitionDefContext)_localctx).partitionName = identifier();
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(1989);
				match(VALUES);
				setState(1990);
				match(IN);
				setState(2003);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					{
					setState(1991);
					match(LEFT_PAREN);
					setState(1992);
					((InPartitionDefContext)_localctx).constantSeq = constantSeq();
					((InPartitionDefContext)_localctx).constantSeqs.add(((InPartitionDefContext)_localctx).constantSeq);
					setState(1997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1993);
						match(COMMA);
						setState(1994);
						((InPartitionDefContext)_localctx).constantSeq = constantSeq();
						((InPartitionDefContext)_localctx).constantSeqs.add(((InPartitionDefContext)_localctx).constantSeq);
						}
						}
						setState(1999);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2000);
					match(RIGHT_PAREN);
					}
					}
					break;
				case 2:
					{
					setState(2002);
					((InPartitionDefContext)_localctx).constants = constantSeq();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantSeqContext extends ParserRuleContext {
		public PartitionValueDefContext partitionValueDef;
		public List<PartitionValueDefContext> values = new ArrayList<PartitionValueDefContext>();
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<PartitionValueDefContext> partitionValueDef() {
			return getRuleContexts(PartitionValueDefContext.class);
		}
		public PartitionValueDefContext partitionValueDef(int i) {
			return getRuleContext(PartitionValueDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ConstantSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConstantSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConstantSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConstantSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantSeqContext constantSeq() throws RecognitionException {
		ConstantSeqContext _localctx = new ConstantSeqContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constantSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			match(LEFT_PAREN);
			setState(2008);
			((ConstantSeqContext)_localctx).partitionValueDef = partitionValueDef();
			((ConstantSeqContext)_localctx).values.add(((ConstantSeqContext)_localctx).partitionValueDef);
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2009);
				match(COMMA);
				setState(2010);
				((ConstantSeqContext)_localctx).partitionValueDef = partitionValueDef();
				((ConstantSeqContext)_localctx).values.add(((ConstantSeqContext)_localctx).partitionValueDef);
				}
				}
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2016);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValueDefContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode MAXVALUE() { return getToken(DorisParser.MAXVALUE, 0); }
		public TerminalNode NULL() { return getToken(DorisParser.NULL, 0); }
		public PartitionValueDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionValueDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionValueDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionValueDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionValueDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValueDefContext partitionValueDef() throws RecognitionException {
		PartitionValueDefContext _localctx = new PartitionValueDefContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_partitionValueDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			_la = _input.LA(1);
			if ( !(_la==MAXVALUE || _la==NULL || _la==STRING_LITERAL || _la==INTEGER_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollupDefsContext extends ParserRuleContext {
		public RollupDefContext rollupDef;
		public List<RollupDefContext> rollups = new ArrayList<RollupDefContext>();
		public List<RollupDefContext> rollupDef() {
			return getRuleContexts(RollupDefContext.class);
		}
		public RollupDefContext rollupDef(int i) {
			return getRuleContext(RollupDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public RollupDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollupDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRollupDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRollupDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRollupDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollupDefsContext rollupDefs() throws RecognitionException {
		RollupDefsContext _localctx = new RollupDefsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_rollupDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			((RollupDefsContext)_localctx).rollupDef = rollupDef();
			((RollupDefsContext)_localctx).rollups.add(((RollupDefsContext)_localctx).rollupDef);
			setState(2025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2021);
				match(COMMA);
				setState(2022);
				((RollupDefsContext)_localctx).rollupDef = rollupDef();
				((RollupDefsContext)_localctx).rollups.add(((RollupDefsContext)_localctx).rollupDef);
				}
				}
				setState(2027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollupDefContext extends ParserRuleContext {
		public IdentifierContext rollupName;
		public IdentifierListContext rollupCols;
		public IdentifierListContext dupKeys;
		public PropertyClauseContext properties;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public TerminalNode DUPLICATE() { return getToken(DorisParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public RollupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollupDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRollupDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRollupDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRollupDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollupDefContext rollupDef() throws RecognitionException {
		RollupDefContext _localctx = new RollupDefContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_rollupDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			((RollupDefContext)_localctx).rollupName = identifier();
			setState(2029);
			((RollupDefContext)_localctx).rollupCols = identifierList();
			setState(2033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DUPLICATE) {
				{
				setState(2030);
				match(DUPLICATE);
				setState(2031);
				match(KEY);
				setState(2032);
				((RollupDefContext)_localctx).dupKeys = identifierList();
				}
			}

			setState(2036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPERTIES) {
				{
				setState(2035);
				((RollupDefContext)_localctx).properties = propertyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggTypeDefContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(DorisParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(DorisParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(DorisParser.SUM, 0); }
		public TerminalNode REPLACE() { return getToken(DorisParser.REPLACE, 0); }
		public TerminalNode REPLACE_IF_NOT_NULL() { return getToken(DorisParser.REPLACE_IF_NOT_NULL, 0); }
		public TerminalNode HLL_UNION() { return getToken(DorisParser.HLL_UNION, 0); }
		public TerminalNode BITMAP_UNION() { return getToken(DorisParser.BITMAP_UNION, 0); }
		public TerminalNode QUANTILE_UNION() { return getToken(DorisParser.QUANTILE_UNION, 0); }
		public TerminalNode GENERIC() { return getToken(DorisParser.GENERIC, 0); }
		public AggTypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggTypeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAggTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAggTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAggTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggTypeDefContext aggTypeDef() throws RecognitionException {
		AggTypeDefContext _localctx = new AggTypeDefContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_aggTypeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			_la = _input.LA(1);
			if ( !(_la==BITMAP_UNION || _la==GENERIC || _la==HLL_UNION || _la==MAX || _la==MIN || ((((_la - 347)) & ~0x3f) == 0 && ((1L << (_la - 347)) & ((1L << (QUANTILE_UNION - 347)) | (1L << (REPLACE - 347)) | (1L << (REPLACE_IF_NOT_NULL - 347)))) != 0) || _la==SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabletListContext extends ParserRuleContext {
		public Token INTEGER_VALUE;
		public List<Token> tabletIdList = new ArrayList<Token>();
		public TerminalNode TABLET() { return getToken(DorisParser.TABLET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DorisParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DorisParser.INTEGER_VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TabletListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabletList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTabletList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTabletList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTabletList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabletListContext tabletList() throws RecognitionException {
		TabletListContext _localctx = new TabletListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_tabletList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			match(TABLET);
			setState(2041);
			match(LEFT_PAREN);
			setState(2042);
			((TabletListContext)_localctx).INTEGER_VALUE = match(INTEGER_VALUE);
			((TabletListContext)_localctx).tabletIdList.add(((TabletListContext)_localctx).INTEGER_VALUE);
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2043);
				match(COMMA);
				setState(2044);
				((TabletListContext)_localctx).INTEGER_VALUE = match(INTEGER_VALUE);
				((TabletListContext)_localctx).tabletIdList.add(((TabletListContext)_localctx).INTEGER_VALUE);
				}
				}
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2050);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public List<RowConstructorContext> rowConstructor() {
			return getRuleContexts(RowConstructorContext.class);
		}
		public RowConstructorContext rowConstructor(int i) {
			return getRuleContext(RowConstructorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			match(VALUES);
			setState(2053);
			rowConstructor();
			setState(2058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2054);
					match(COMMA);
					setState(2055);
					rowConstructor();
					}
					} 
				}
				setState(2060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_namedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			expression();
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(2062);
					match(AS);
					}
				}

				{
				setState(2065);
				identifierOrText();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			namedExpression();
			setState(2073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2069);
					match(COMMA);
					setState(2070);
					namedExpression();
					}
					} 
				}
				setState(2075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_expression);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				booleanExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2077);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> args = new ArrayList<ErrorCapturingIdentifierContext>();
		public BooleanExpressionContext body;
		public TerminalNode ARROW() { return getToken(DorisParser.ARROW, 0); }
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_lambdaExpression);
		int _la;
		try {
			setState(2096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case ARRAY_RANGE:
			case AT:
			case AUTHORS:
			case AUTO_INCREMENT:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BELONG:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case BULK:
			case CACHED:
			case CALL:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLLECT:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONSTRAINTS:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DUAL:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXPIRED:
			case EXTERNAL:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GENERIC:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INVERTED:
			case IPV4:
			case IPV6:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LESS:
			case LEVEL:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MANUAL:
			case MAP:
			case MATCH_ALL:
			case MATCH_ANY:
			case MATCH_ELEMENT_EQ:
			case MATCH_ELEMENT_GE:
			case MATCH_ELEMENT_GT:
			case MATCH_ELEMENT_LE:
			case MATCH_ELEMENT_LT:
			case MATCH_PHRASE:
			case MATCH_PHRASE_EDGE:
			case MATCH_PHRASE_PREFIX:
			case MATCH_REGEXP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PROCESS:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VARIANT:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2080);
				((LambdaExpressionContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
				((LambdaExpressionContext)_localctx).args.add(((LambdaExpressionContext)_localctx).errorCapturingIdentifier);
				setState(2081);
				match(ARROW);
				setState(2082);
				((LambdaExpressionContext)_localctx).body = booleanExpression(0);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2084);
				match(LEFT_PAREN);
				setState(2085);
				((LambdaExpressionContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
				((LambdaExpressionContext)_localctx).args.add(((LambdaExpressionContext)_localctx).errorCapturingIdentifier);
				setState(2088); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2086);
					match(COMMA);
					setState(2087);
					((LambdaExpressionContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((LambdaExpressionContext)_localctx).args.add(((LambdaExpressionContext)_localctx).errorCapturingIdentifier);
					}
					}
					setState(2090); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(2092);
				match(RIGHT_PAREN);
				setState(2093);
				match(ARROW);
				setState(2094);
				((LambdaExpressionContext)_localctx).body = booleanExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ExistContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LOGICALNOT() { return getToken(DorisParser.LOGICALNOT, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsnullContext extends BooleanExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode ISNULL() { return getToken(DorisParser.ISNULL, 0); }
		public TerminalNode IS_NULL_PRED() { return getToken(DorisParser.IS_NULL_PRED, 0); }
		public IsnullContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIsnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIsnull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIsnull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_not_null_predContext extends BooleanExpressionContext {
		public TerminalNode IS_NOT_NULL_PRED() { return getToken(DorisParser.IS_NOT_NULL_PRED, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public Is_not_null_predContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIs_not_null_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIs_not_null_pred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIs_not_null_pred(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DorisParser.AND, 0); }
		public TerminalNode LOGICALAND() { return getToken(DorisParser.LOGICALAND, 0); }
		public TerminalNode OR() { return getToken(DorisParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublePipesContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode DOUBLEPIPES() { return getToken(DorisParser.DOUBLEPIPES, 0); }
		public DoublePipesContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDoublePipes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDoublePipes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDoublePipes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2099);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==LOGICALNOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2100);
				booleanExpression(8);
				}
				break;
			case 2:
				{
				_localctx = new ExistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2101);
				match(EXISTS);
				setState(2102);
				match(LEFT_PAREN);
				setState(2103);
				query();
				setState(2104);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new IsnullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2106);
				_la = _input.LA(1);
				if ( !(_la==IS_NULL_PRED || _la==ISNULL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2107);
				match(LEFT_PAREN);
				setState(2108);
				valueExpression(0);
				setState(2109);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new Is_not_null_predContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2111);
				match(IS_NOT_NULL_PRED);
				setState(2112);
				match(LEFT_PAREN);
				setState(2113);
				valueExpression(0);
				setState(2114);
				match(RIGHT_PAREN);
				}
				break;
			case 5:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2116);
				valueExpression(0);
				setState(2118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2117);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2122);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2123);
						((LogicalBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGICALAND) ) {
							((LogicalBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2124);
						((LogicalBinaryContext)_localctx).right = booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2125);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2126);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2127);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new DoublePipesContext(new BooleanExpressionContext(_parentctx, _parentState));
						((DoublePipesContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2128);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2129);
						((DoublePipesContext)_localctx).operator = match(DOUBLEPIPES);
						setState(2130);
						((DoublePipesContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RowConstructorContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<RowConstructorItemContext> rowConstructorItem() {
			return getRuleContexts(RowConstructorItemContext.class);
		}
		public RowConstructorItemContext rowConstructorItem(int i) {
			return getRuleContext(RowConstructorItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public RowConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowConstructorContext rowConstructor() throws RecognitionException {
		RowConstructorContext _localctx = new RowConstructorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_rowConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			match(LEFT_PAREN);
			setState(2145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXISTS - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NOT - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (LOGICALNOT - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
				{
				setState(2137);
				rowConstructorItem();
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2138);
					match(COMMA);
					setState(2139);
					rowConstructorItem();
					}
					}
					setState(2144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2147);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowConstructorItemContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public RowConstructorItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowConstructorItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRowConstructorItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRowConstructorItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRowConstructorItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowConstructorItemContext rowConstructorItem() throws RecognitionException {
		RowConstructorItemContext _localctx = new RowConstructorItemContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_rowConstructorItem);
		try {
			setState(2151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case LEFT_BRACKET:
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADD:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case ARRAY_RANGE:
			case AT:
			case AUTHORS:
			case AUTO_INCREMENT:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BELONG:
			case BIN:
			case BINARY:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case BULK:
			case CACHED:
			case CALL:
			case CASE:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLLECT:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONSTRAINTS:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATABASE:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DUAL:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPIRED:
			case EXTERNAL:
			case EXTRACT:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GENERIC:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IF:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INTERVAL:
			case INVERTED:
			case IPV4:
			case IPV6:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case KEY:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LEFT:
			case LESS:
			case LEVEL:
			case LIKE:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MANUAL:
			case MAP:
			case MATCH_ALL:
			case MATCH_ANY:
			case MATCH_ELEMENT_EQ:
			case MATCH_ELEMENT_GE:
			case MATCH_ELEMENT_GT:
			case MATCH_ELEMENT_LE:
			case MATCH_ELEMENT_LT:
			case MATCH_PHRASE:
			case MATCH_PHRASE_EDGE:
			case MATCH_PHRASE_PREFIX:
			case MATCH_REGEXP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PROCESS:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REGEXP:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RIGHT:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VARIANT:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case PLUS:
			case SUBTRACT:
			case ASTERISK:
			case TILDE:
			case LOGICALNOT:
			case ATSIGN:
			case DOUBLEATSIGN:
			case STRING_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2149);
				namedExpression();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2150);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(DorisParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(DorisParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(DorisParser.LIKE, 0); }
		public TerminalNode REGEXP() { return getToken(DorisParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(DorisParser.RLIKE, 0); }
		public TerminalNode MATCH() { return getToken(DorisParser.MATCH, 0); }
		public TerminalNode MATCH_ANY() { return getToken(DorisParser.MATCH_ANY, 0); }
		public TerminalNode MATCH_ALL() { return getToken(DorisParser.MATCH_ALL, 0); }
		public TerminalNode MATCH_PHRASE() { return getToken(DorisParser.MATCH_PHRASE, 0); }
		public TerminalNode MATCH_PHRASE_PREFIX() { return getToken(DorisParser.MATCH_PHRASE_PREFIX, 0); }
		public TerminalNode MATCH_REGEXP() { return getToken(DorisParser.MATCH_REGEXP, 0); }
		public TerminalNode MATCH_PHRASE_EDGE() { return getToken(DorisParser.MATCH_PHRASE_EDGE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode IN() { return getToken(DorisParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode IS() { return getToken(DorisParser.IS, 0); }
		public TerminalNode NULL() { return getToken(DorisParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_predicate);
		int _la;
		try {
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2153);
					match(NOT);
					}
				}

				setState(2156);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2157);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2158);
				match(AND);
				setState(2159);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2161);
					match(NOT);
					}
				}

				setState(2164);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==REGEXP || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2165);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2166);
					match(NOT);
					}
				}

				setState(2169);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (MATCH - 267)) | (1L << (MATCH_ALL - 267)) | (1L << (MATCH_ANY - 267)) | (1L << (MATCH_PHRASE - 267)) | (1L << (MATCH_PHRASE_EDGE - 267)) | (1L << (MATCH_PHRASE_PREFIX - 267)) | (1L << (MATCH_REGEXP - 267)))) != 0)) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2170);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2171);
					match(NOT);
					}
				}

				setState(2174);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2175);
				match(LEFT_PAREN);
				setState(2176);
				query();
				setState(2177);
				match(RIGHT_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2179);
					match(NOT);
					}
				}

				setState(2182);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2183);
				match(LEFT_PAREN);
				setState(2184);
				expression();
				setState(2189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2185);
					match(COMMA);
					setState(2186);
					expression();
					}
					}
					setState(2191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2192);
				match(RIGHT_PAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2194);
				match(IS);
				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2195);
					match(NOT);
					}
				}

				setState(2198);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitOperationContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BITAND() { return getToken(DorisParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(DorisParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(DorisParser.BITXOR, 0); }
		public BitOperationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBitOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBitOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(DorisParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(DorisParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(DorisParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(DorisParser.PLUS, 0); }
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public TerminalNode HAT() { return getToken(DorisParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(DorisParser.PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(DorisParser.AMPERSAND, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public TerminalNode PLUS() { return getToken(DorisParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(DorisParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2202);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2203);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 489)) & ~0x3f) == 0 && ((1L << (_la - 489)) & ((1L << (PLUS - 489)) | (1L << (SUBTRACT - 489)) | (1L << (TILDE - 489)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2204);
				valueExpression(5);
				}
				break;
			case 3:
				{
				_localctx = new BitOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2205);
				((BitOperationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BITAND) | (1L << BITOR) | (1L << BITXOR))) != 0)) ) {
					((BitOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2206);
				match(LEFT_PAREN);
				setState(2207);
				((BitOperationContext)_localctx).left = valueExpression(0);
				setState(2208);
				match(COMMA);
				setState(2209);
				((BitOperationContext)_localctx).right = valueExpression(0);
				setState(2210);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2215);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 491)) & ~0x3f) == 0 && ((1L << (_la - 491)) & ((1L << (ASTERISK - 491)) | (1L << (SLASH - 491)) | (1L << (MOD - 491)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2216);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2218);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 489)) & ~0x3f) == 0 && ((1L << (_la - 489)) & ((1L << (PLUS - 489)) | (1L << (SUBTRACT - 489)) | (1L << (AMPERSAND - 489)) | (1L << (PIPE - 489)) | (1L << (HAT - 489)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2219);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2220);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2221);
						comparisonOperator();
						setState(2222);
						((ComparisonContext)_localctx).right = valueExpression(3);
						}
						break;
					}
					} 
				}
				setState(2228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DatetimeUnitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DorisParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DorisParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(DorisParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(DorisParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DorisParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DorisParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DorisParser.SECOND, 0); }
		public DatetimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDatetimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDatetimeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDatetimeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeUnitContext datetimeUnit() throws RecognitionException {
		DatetimeUnitContext _localctx = new DatetimeUnitContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_datetimeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==MONTH || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateCeilContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode DATE_CEIL() { return getToken(DorisParser.DATE_CEIL, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public DateCeilContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDateCeil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDateCeil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDateCeil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDateContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(DorisParser.CURRENT_DATE, 0); }
		public CurrentDateContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCurrentDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCurrentDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCurrentDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampaddContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPADD() { return getToken(DorisParser.TIMESTAMPADD, 0); }
		public TerminalNode DATEADD() { return getToken(DorisParser.DATEADD, 0); }
		public TimestampaddContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTimestampadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTimestampadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTimestampadd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Date_subContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode SUBDATE() { return getToken(DorisParser.SUBDATE, 0); }
		public TerminalNode DAYS_SUB() { return getToken(DorisParser.DAYS_SUB, 0); }
		public TerminalNode DATE_SUB() { return getToken(DorisParser.DATE_SUB, 0); }
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public Date_subContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDate_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDate_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDate_sub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(DorisParser.CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserVariableContext extends PrimaryExpressionContext {
		public TerminalNode ATSIGN() { return getToken(DorisParser.ATSIGN, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public UserVariableContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUserVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUserVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUserVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementAtContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ElementAtContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterElementAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitElementAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitElementAt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalTimestampContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LOCALTIMESTAMP() { return getToken(DorisParser.LOCALTIMESTAMP, 0); }
		public LocalTimestampContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLocalTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLocalTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLocalTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharFunctionContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public IdentifierOrTextContext charSet;
		public TerminalNode CHAR() { return getToken(DorisParser.CHAR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public CharFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCharFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCharFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayRangeContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext start;
		public ValueExpressionContext end;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ARRAY_RANGE() { return getToken(DorisParser.ARRAY_RANGE, 0); }
		public TerminalNode SEQUENCE() { return getToken(DorisParser.SEQUENCE, 0); }
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public ArrayRangeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArrayRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArrayRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArrayRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(DorisParser.CASE, 0); }
		public TerminalNode END() { return getToken(DorisParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DorisParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(DorisParser.BINARY, 0); }
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConvertTypeContext extends PrimaryExpressionContext {
		public ExpressionContext argument;
		public DataTypeContext type;
		public TerminalNode CONVERT() { return getToken(DorisParser.CONVERT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ConvertTypeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConvertType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConvertType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConvertType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampdiffContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPDIFF() { return getToken(DorisParser.TIMESTAMPDIFF, 0); }
		public TerminalNode DATEDIFF() { return getToken(DorisParser.DATEDIFF, 0); }
		public TimestampdiffContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTimestampdiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTimestampdiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTimestampdiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConvertCharSetContext extends PrimaryExpressionContext {
		public ExpressionContext argument;
		public IdentifierOrTextContext charSet;
		public TerminalNode CONVERT() { return getToken(DorisParser.CONVERT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public ConvertCharSetContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConvertCharSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConvertCharSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConvertCharSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EncryptKeyContext extends PrimaryExpressionContext {
		public IdentifierContext dbName;
		public IdentifierContext keyName;
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public EncryptKeyContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterEncryptKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitEncryptKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitEncryptKey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Date_addContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ADDDATE() { return getToken(DorisParser.ADDDATE, 0); }
		public TerminalNode DAYS_ADD() { return getToken(DorisParser.DAYS_ADD, 0); }
		public TerminalNode DATE_ADD() { return getToken(DorisParser.DATE_ADD, 0); }
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public Date_addContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDate_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDate_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDate_add(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentTimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_TIME() { return getToken(DorisParser.CURRENT_TIME, 0); }
		public CurrentTimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCurrentTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCurrentTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCurrentTime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalTimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LOCALTIME() { return getToken(DorisParser.LOCALTIME, 0); }
		public LocalTimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLocalTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLocalTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLocalTime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemVariableContext extends PrimaryExpressionContext {
		public Token kind;
		public TerminalNode DOUBLEATSIGN() { return getToken(DorisParser.DOUBLEATSIGN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public TerminalNode GLOBAL() { return getToken(DorisParser.GLOBAL, 0); }
		public TerminalNode SESSION() { return getToken(DorisParser.SESSION, 0); }
		public SystemVariableContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSystemVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSystemVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSystemVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollateContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(DorisParser.COLLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public CollateContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCollate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCollate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCollate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(DorisParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(DorisParser.EXTRACT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DorisParser.TIMESTAMP, 0); }
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentTimestampContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DorisParser.CURRENT_TIMESTAMP, 0); }
		public CurrentTimestampContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCurrentTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCurrentTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCurrentTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraySliceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext begin;
		public ValueExpressionContext end;
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(DorisParser.COLON, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ArraySliceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArraySlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArraySlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArraySlice(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateFloorContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode DATE_FLOOR() { return getToken(DorisParser.DATE_FLOOR, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public DateFloorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDateFloor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDateFloor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDateFloor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(DorisParser.CASE, 0); }
		public TerminalNode END() { return getToken(DorisParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DorisParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				{
				_localctx = new TimestampdiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2232);
				((TimestampdiffContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEDIFF || _la==TIMESTAMPDIFF) ) {
					((TimestampdiffContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2233);
				match(LEFT_PAREN);
				setState(2234);
				((TimestampdiffContext)_localctx).unit = datetimeUnit();
				setState(2235);
				match(COMMA);
				setState(2236);
				((TimestampdiffContext)_localctx).startTimestamp = valueExpression(0);
				setState(2237);
				match(COMMA);
				setState(2238);
				((TimestampdiffContext)_localctx).endTimestamp = valueExpression(0);
				setState(2239);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new TimestampaddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2241);
				((TimestampaddContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEADD || _la==TIMESTAMPADD) ) {
					((TimestampaddContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2242);
				match(LEFT_PAREN);
				setState(2243);
				((TimestampaddContext)_localctx).unit = datetimeUnit();
				setState(2244);
				match(COMMA);
				setState(2245);
				((TimestampaddContext)_localctx).startTimestamp = valueExpression(0);
				setState(2246);
				match(COMMA);
				setState(2247);
				((TimestampaddContext)_localctx).endTimestamp = valueExpression(0);
				setState(2248);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new Date_addContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2250);
				((Date_addContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDDATE || _la==DATE_ADD || _la==DAYS_ADD) ) {
					((Date_addContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2251);
				match(LEFT_PAREN);
				setState(2252);
				((Date_addContext)_localctx).timestamp = valueExpression(0);
				setState(2253);
				match(COMMA);
				setState(2259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2254);
					match(INTERVAL);
					setState(2255);
					((Date_addContext)_localctx).unitsAmount = valueExpression(0);
					setState(2256);
					((Date_addContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(2258);
					((Date_addContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(2261);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new Date_subContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2263);
				((Date_subContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATE_SUB || _la==DAYS_SUB || _la==SUBDATE) ) {
					((Date_subContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2264);
				match(LEFT_PAREN);
				setState(2265);
				((Date_subContext)_localctx).timestamp = valueExpression(0);
				setState(2266);
				match(COMMA);
				setState(2272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2267);
					match(INTERVAL);
					setState(2268);
					((Date_subContext)_localctx).unitsAmount = valueExpression(0);
					setState(2269);
					((Date_subContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(2271);
					((Date_subContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(2274);
				match(RIGHT_PAREN);
				}
				break;
			case 5:
				{
				_localctx = new DateFloorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2276);
				((DateFloorContext)_localctx).name = match(DATE_FLOOR);
				setState(2277);
				match(LEFT_PAREN);
				setState(2278);
				((DateFloorContext)_localctx).timestamp = valueExpression(0);
				setState(2279);
				match(COMMA);
				setState(2285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2280);
					match(INTERVAL);
					setState(2281);
					((DateFloorContext)_localctx).unitsAmount = valueExpression(0);
					setState(2282);
					((DateFloorContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(2284);
					((DateFloorContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(2287);
				match(RIGHT_PAREN);
				}
				break;
			case 6:
				{
				_localctx = new DateCeilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2289);
				((DateCeilContext)_localctx).name = match(DATE_CEIL);
				setState(2290);
				match(LEFT_PAREN);
				setState(2291);
				((DateCeilContext)_localctx).timestamp = valueExpression(0);
				setState(2292);
				match(COMMA);
				setState(2298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2293);
					match(INTERVAL);
					setState(2294);
					((DateCeilContext)_localctx).unitsAmount = valueExpression(0);
					setState(2295);
					((DateCeilContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(2297);
					((DateCeilContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(2300);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new ArrayRangeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2302);
				((ArrayRangeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ARRAY_RANGE || _la==SEQUENCE) ) {
					((ArrayRangeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2303);
				match(LEFT_PAREN);
				setState(2304);
				((ArrayRangeContext)_localctx).start = valueExpression(0);
				setState(2305);
				match(COMMA);
				setState(2306);
				((ArrayRangeContext)_localctx).end = valueExpression(0);
				setState(2307);
				match(COMMA);
				setState(2313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2308);
					match(INTERVAL);
					setState(2309);
					((ArrayRangeContext)_localctx).unitsAmount = valueExpression(0);
					setState(2310);
					((ArrayRangeContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(2312);
					((ArrayRangeContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(2315);
				match(RIGHT_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new CurrentDateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2317);
				((CurrentDateContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 9:
				{
				_localctx = new CurrentTimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2318);
				((CurrentTimeContext)_localctx).name = match(CURRENT_TIME);
				}
				break;
			case 10:
				{
				_localctx = new CurrentTimestampContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2319);
				((CurrentTimestampContext)_localctx).name = match(CURRENT_TIMESTAMP);
				}
				break;
			case 11:
				{
				_localctx = new LocalTimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2320);
				((LocalTimeContext)_localctx).name = match(LOCALTIME);
				}
				break;
			case 12:
				{
				_localctx = new LocalTimestampContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2321);
				((LocalTimestampContext)_localctx).name = match(LOCALTIMESTAMP);
				}
				break;
			case 13:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2322);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 14:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2323);
				match(CASE);
				setState(2325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2324);
					whenClause();
					}
					}
					setState(2327); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2329);
					match(ELSE);
					setState(2330);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2333);
				match(END);
				}
				break;
			case 15:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2335);
				match(CASE);
				setState(2336);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2337);
					whenClause();
					}
					}
					setState(2340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2342);
					match(ELSE);
					setState(2343);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2346);
				match(END);
				}
				break;
			case 16:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2348);
				((CastContext)_localctx).name = match(CAST);
				setState(2349);
				match(LEFT_PAREN);
				setState(2350);
				expression();
				setState(2351);
				match(AS);
				setState(2352);
				dataType();
				setState(2353);
				match(RIGHT_PAREN);
				}
				break;
			case 17:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2355);
				constant();
				}
				break;
			case 18:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2356);
				interval();
				}
				break;
			case 19:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2357);
				match(ASTERISK);
				}
				break;
			case 20:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2358);
				qualifiedName();
				setState(2359);
				match(DOT);
				setState(2360);
				match(ASTERISK);
				}
				break;
			case 21:
				{
				_localctx = new CharFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2362);
				match(CHAR);
				setState(2363);
				match(LEFT_PAREN);
				setState(2364);
				((CharFunctionContext)_localctx).expression = expression();
				((CharFunctionContext)_localctx).arguments.add(((CharFunctionContext)_localctx).expression);
				setState(2369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2365);
					match(COMMA);
					setState(2366);
					((CharFunctionContext)_localctx).expression = expression();
					((CharFunctionContext)_localctx).arguments.add(((CharFunctionContext)_localctx).expression);
					}
					}
					setState(2371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2372);
					match(USING);
					setState(2373);
					((CharFunctionContext)_localctx).charSet = identifierOrText();
					}
				}

				setState(2376);
				match(RIGHT_PAREN);
				}
				break;
			case 22:
				{
				_localctx = new ConvertCharSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2378);
				match(CONVERT);
				setState(2379);
				match(LEFT_PAREN);
				setState(2380);
				((ConvertCharSetContext)_localctx).argument = expression();
				setState(2381);
				match(USING);
				setState(2382);
				((ConvertCharSetContext)_localctx).charSet = identifierOrText();
				setState(2383);
				match(RIGHT_PAREN);
				}
				break;
			case 23:
				{
				_localctx = new ConvertTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2385);
				match(CONVERT);
				setState(2386);
				match(LEFT_PAREN);
				setState(2387);
				((ConvertTypeContext)_localctx).argument = expression();
				setState(2388);
				match(COMMA);
				setState(2389);
				((ConvertTypeContext)_localctx).type = dataType();
				setState(2390);
				match(RIGHT_PAREN);
				}
				break;
			case 24:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2392);
				functionCallExpression();
				}
				break;
			case 25:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2393);
				match(LEFT_PAREN);
				setState(2394);
				query();
				setState(2395);
				match(RIGHT_PAREN);
				}
				break;
			case 26:
				{
				_localctx = new UserVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2397);
				match(ATSIGN);
				setState(2398);
				identifierOrText();
				}
				break;
			case 27:
				{
				_localctx = new SystemVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2399);
				match(DOUBLEATSIGN);
				setState(2402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2400);
					((SystemVariableContext)_localctx).kind = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==SESSION) ) {
						((SystemVariableContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2401);
					match(DOT);
					}
					break;
				}
				setState(2404);
				identifier();
				}
				break;
			case 28:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(2405);
					match(BINARY);
					}
				}

				setState(2408);
				identifier();
				}
				break;
			case 29:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2409);
				match(LEFT_PAREN);
				setState(2410);
				expression();
				setState(2411);
				match(RIGHT_PAREN);
				}
				break;
			case 30:
				{
				_localctx = new EncryptKeyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2413);
				match(KEY);
				setState(2417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2414);
					((EncryptKeyContext)_localctx).dbName = identifier();
					setState(2415);
					match(DOT);
					}
					break;
				}
				setState(2419);
				((EncryptKeyContext)_localctx).keyName = identifier();
				}
				break;
			case 31:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2420);
				match(EXTRACT);
				setState(2421);
				match(LEFT_PAREN);
				setState(2422);
				((ExtractContext)_localctx).field = identifier();
				setState(2423);
				match(FROM);
				setState(2425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2424);
					_la = _input.LA(1);
					if ( !(_la==DATE || _la==TIMESTAMP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2427);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2428);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2456);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
					case 1:
						{
						_localctx = new ElementAtContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((ElementAtContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2432);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2433);
						match(LEFT_BRACKET);
						setState(2434);
						((ElementAtContext)_localctx).index = valueExpression(0);
						setState(2435);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new ArraySliceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((ArraySliceContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2437);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2438);
						match(LEFT_BRACKET);
						setState(2439);
						((ArraySliceContext)_localctx).begin = valueExpression(0);
						setState(2440);
						match(COLON);
						setState(2442);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
							{
							setState(2441);
							((ArraySliceContext)_localctx).end = valueExpression(0);
							}
						}

						setState(2444);
						match(RIGHT_BRACKET);
						}
						break;
					case 3:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2446);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2447);
						match(DOT);
						setState(2448);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					case 4:
						{
						_localctx = new CollateContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2449);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2450);
						match(COLLATE);
						setState(2454);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LEFT_BRACE:
						case RIGHT_BRACE:
						case ADDDATE:
						case AFTER:
						case AGG_STATE:
						case AGGREGATE:
						case ALIAS:
						case ANALYZED:
						case ARRAY:
						case ARRAY_RANGE:
						case AT:
						case AUTHORS:
						case AUTO_INCREMENT:
						case BACKENDS:
						case BACKUP:
						case BEGIN:
						case BELONG:
						case BIN:
						case BITAND:
						case BITMAP:
						case BITMAP_UNION:
						case BITOR:
						case BITXOR:
						case BLOB:
						case BOOLEAN:
						case BRIEF:
						case BROKER:
						case BUCKETS:
						case BUILD:
						case BUILTIN:
						case BULK:
						case CACHED:
						case CALL:
						case CATALOG:
						case CATALOGS:
						case CHAIN:
						case CHAR:
						case CHARSET:
						case CHECK:
						case CLUSTER:
						case CLUSTERS:
						case COLLATION:
						case COLLECT:
						case COLUMNS:
						case COMMENT:
						case COMMIT:
						case COMMITTED:
						case COMPACT:
						case COMPLETE:
						case CONFIG:
						case CONNECTION:
						case CONNECTION_ID:
						case CONSISTENT:
						case CONSTRAINTS:
						case CONVERT:
						case COPY:
						case COUNT:
						case CREATION:
						case CRON:
						case CURRENT_CATALOG:
						case CURRENT_DATE:
						case CURRENT_TIME:
						case CURRENT_TIMESTAMP:
						case CURRENT_USER:
						case DATA:
						case DATE:
						case DATE_ADD:
						case DATE_CEIL:
						case DATE_DIFF:
						case DATE_FLOOR:
						case DATE_SUB:
						case DATEADD:
						case DATEDIFF:
						case DATETIME:
						case DATETIMEV2:
						case DATEV2:
						case DATETIMEV1:
						case DATEV1:
						case DAY:
						case DAYS_ADD:
						case DAYS_SUB:
						case DECIMAL:
						case DECIMALV2:
						case DECIMALV3:
						case DEFERRED:
						case DEMAND:
						case DIAGNOSE:
						case DISTINCTPC:
						case DISTINCTPCSA:
						case DO:
						case DORIS_INTERNAL_TABLE_ID:
						case DUAL:
						case DYNAMIC:
						case ENABLE:
						case ENCRYPTKEY:
						case ENCRYPTKEYS:
						case END:
						case ENDS:
						case ENGINE:
						case ENGINES:
						case ERRORS:
						case EVENTS:
						case EVERY:
						case EXCLUDE:
						case EXPIRED:
						case EXTERNAL:
						case FAILED_LOGIN_ATTEMPTS:
						case FAST:
						case FEATURE:
						case FIELDS:
						case FILE:
						case FILTER:
						case FIRST:
						case FORMAT:
						case FREE:
						case FRONTENDS:
						case FUNCTION:
						case GENERIC:
						case GLOBAL:
						case GRAPH:
						case GROUPING:
						case GROUPS:
						case HASH:
						case HDFS:
						case HELP:
						case HISTOGRAM:
						case HLL_UNION:
						case HOSTNAME:
						case HOUR:
						case HUB:
						case IDENTIFIED:
						case IGNORE:
						case IMMEDIATE:
						case INCREMENTAL:
						case INDEXES:
						case INVERTED:
						case IPV4:
						case IPV6:
						case IS_NOT_NULL_PRED:
						case IS_NULL_PRED:
						case ISNULL:
						case ISOLATION:
						case JOB:
						case JOBS:
						case JSON:
						case JSONB:
						case LABEL:
						case LAST:
						case LDAP:
						case LDAP_ADMIN_PASSWORD:
						case LESS:
						case LEVEL:
						case LINES:
						case LINK:
						case LOCAL:
						case LOCALTIME:
						case LOCALTIMESTAMP:
						case LOCATION:
						case LOCK:
						case LOGICAL:
						case MANUAL:
						case MAP:
						case MATCH_ALL:
						case MATCH_ANY:
						case MATCH_ELEMENT_EQ:
						case MATCH_ELEMENT_GE:
						case MATCH_ELEMENT_GT:
						case MATCH_ELEMENT_LE:
						case MATCH_ELEMENT_LT:
						case MATCH_PHRASE:
						case MATCH_PHRASE_EDGE:
						case MATCH_PHRASE_PREFIX:
						case MATCH_REGEXP:
						case MATERIALIZED:
						case MAX:
						case MEMO:
						case MERGE:
						case MIGRATE:
						case MIGRATIONS:
						case MIN:
						case MINUTE:
						case MODIFY:
						case MONTH:
						case MTMV:
						case NAME:
						case NAMES:
						case NEGATIVE:
						case NEVER:
						case NEXT:
						case NGRAM_BF:
						case NO:
						case NON_NULLABLE:
						case NULLS:
						case OF:
						case OFFSET:
						case ONLY:
						case OPEN:
						case OPTIMIZED:
						case PARAMETER:
						case PARSED:
						case PARTITIONS:
						case PASSWORD:
						case PASSWORD_EXPIRE:
						case PASSWORD_HISTORY:
						case PASSWORD_LOCK_TIME:
						case PASSWORD_REUSE:
						case PATH:
						case PAUSE:
						case PERCENT:
						case PERIOD:
						case PERMISSIVE:
						case PHYSICAL:
						case PLAN:
						case PROCESS:
						case PLUGIN:
						case PLUGINS:
						case POLICY:
						case PROC:
						case PROCESSLIST:
						case PROFILE:
						case PROPERTIES:
						case PROPERTY:
						case QUANTILE_STATE:
						case QUANTILE_UNION:
						case QUERY:
						case QUOTA:
						case RANDOM:
						case RECOVER:
						case RECYCLE:
						case REFRESH:
						case REPEATABLE:
						case REPLACE:
						case REPLACE_IF_NOT_NULL:
						case REPOSITORIES:
						case REPOSITORY:
						case RESOURCE:
						case RESOURCES:
						case RESTORE:
						case RESTRICTIVE:
						case RESUME:
						case RETURNS:
						case REWRITTEN:
						case RLIKE:
						case ROLLBACK:
						case ROLLUP:
						case ROUTINE:
						case S3:
						case SAMPLE:
						case SCHEDULE:
						case SCHEDULER:
						case SCHEMA:
						case SECOND:
						case SEQUENCE:
						case SERIALIZABLE:
						case SESSION:
						case SHAPE:
						case SKEW:
						case SNAPSHOT:
						case SONAME:
						case SPLIT:
						case START:
						case STARTS:
						case STATS:
						case STATUS:
						case STOP:
						case STORAGE:
						case STREAM:
						case STREAMING:
						case STRING:
						case STRUCT:
						case SUBDATE:
						case SUM:
						case TABLES:
						case TASK:
						case TASKS:
						case TEMPORARY:
						case TEXT:
						case THAN:
						case TIME:
						case TIMESTAMP:
						case TIMESTAMPADD:
						case TIMESTAMPDIFF:
						case TRANSACTION:
						case TREE:
						case TRIGGERS:
						case TRUNCATE:
						case TYPE:
						case TYPES:
						case UNCOMMITTED:
						case UNLOCK:
						case USER:
						case VALUE:
						case VARCHAR:
						case VARIABLES:
						case VARIANT:
						case VERBOSE:
						case VERSION:
						case VIEW:
						case WARNINGS:
						case WEEK:
						case WORK:
						case YEAR:
						case IDENTIFIER:
						case BACKQUOTED_IDENTIFIER:
							{
							setState(2451);
							identifier();
							}
							break;
						case STRING_LITERAL:
							{
							setState(2452);
							match(STRING_LITERAL);
							}
							break;
						case DEFAULT:
							{
							setState(2453);
							match(DEFAULT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(2460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode OVER() { return getToken(DorisParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode ORDER() { return getToken(DorisParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(DorisParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			functionIdentifier();
			setState(2462);
			match(LEFT_PAREN);
			setState(2486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ALL) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BINARY) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCT - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXISTS - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (EXTRACT - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FALSE - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IF - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INTERVAL - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (KEY - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LEFT - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LIKE - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NOT - 258)) | (1L << (NULL - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REGEXP - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RIGHT - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRIM - 386)) | (1L << (TRUE - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)) | (1L << (PLUS - 450)) | (1L << (SUBTRACT - 450)) | (1L << (ASTERISK - 450)) | (1L << (TILDE - 450)) | (1L << (LOGICALNOT - 450)) | (1L << (ATSIGN - 450)) | (1L << (DOUBLEATSIGN - 450)) | (1L << (STRING_LITERAL - 450)) | (1L << (INTEGER_VALUE - 450)) | (1L << (EXPONENT_VALUE - 450)))) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & ((1L << (DECIMAL_VALUE - 514)) | (1L << (IDENTIFIER - 514)) | (1L << (BACKQUOTED_IDENTIFIER - 514)))) != 0)) {
				{
				setState(2464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(2463);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2466);
				((FunctionCallExpressionContext)_localctx).expression = expression();
				((FunctionCallExpressionContext)_localctx).arguments.add(((FunctionCallExpressionContext)_localctx).expression);
				setState(2471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2467);
					match(COMMA);
					setState(2468);
					((FunctionCallExpressionContext)_localctx).expression = expression();
					((FunctionCallExpressionContext)_localctx).arguments.add(((FunctionCallExpressionContext)_localctx).expression);
					}
					}
					setState(2473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(2474);
					match(ORDER);
					setState(2475);
					match(BY);
					setState(2476);
					sortItem();
					setState(2481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2477);
						match(COMMA);
						setState(2478);
						sortItem();
						}
						}
						setState(2483);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
			}

			setState(2488);
			match(RIGHT_PAREN);
			setState(2491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2489);
				match(OVER);
				setState(2490);
				windowSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext dbName;
		public FunctionNameIdentifierContext functionNameIdentifier() {
			return getRuleContext(FunctionNameIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				{
				setState(2493);
				((FunctionIdentifierContext)_localctx).dbName = identifier();
				setState(2494);
				match(DOT);
				}
				break;
			}
			setState(2498);
			functionNameIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(DorisParser.ADD, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(DorisParser.CONNECTION_ID, 0); }
		public TerminalNode CURRENT_CATALOG() { return getToken(DorisParser.CURRENT_CATALOG, 0); }
		public TerminalNode CURRENT_USER() { return getToken(DorisParser.CURRENT_USER, 0); }
		public TerminalNode DATABASE() { return getToken(DorisParser.DATABASE, 0); }
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode LEFT() { return getToken(DorisParser.LEFT, 0); }
		public TerminalNode LIKE() { return getToken(DorisParser.LIKE, 0); }
		public TerminalNode PASSWORD() { return getToken(DorisParser.PASSWORD, 0); }
		public TerminalNode REGEXP() { return getToken(DorisParser.REGEXP, 0); }
		public TerminalNode RIGHT() { return getToken(DorisParser.RIGHT, 0); }
		public TerminalNode SCHEMA() { return getToken(DorisParser.SCHEMA, 0); }
		public TerminalNode TRIM() { return getToken(DorisParser.TRIM, 0); }
		public TerminalNode USER() { return getToken(DorisParser.USER, 0); }
		public FunctionNameIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNameIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFunctionNameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFunctionNameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFunctionNameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameIdentifierContext functionNameIdentifier() throws RecognitionException {
		FunctionNameIdentifierContext _localctx = new FunctionNameIdentifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_functionNameIdentifier);
		try {
			setState(2515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2500);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2501);
				match(ADD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2502);
				match(CONNECTION_ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2503);
				match(CURRENT_CATALOG);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2504);
				match(CURRENT_USER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2505);
				match(DATABASE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2506);
				match(IF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2507);
				match(LEFT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2508);
				match(LIKE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2509);
				match(PASSWORD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2510);
				match(REGEXP);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2511);
				match(RIGHT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2512);
				match(SCHEMA);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2513);
				match(TRIM);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2514);
				match(USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public SortClauseContext sortClause() {
			return getRuleContext(SortClauseContext.class,0);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWindowSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWindowSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWindowSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_windowSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2517);
			match(LEFT_PAREN);
			setState(2519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2518);
				partitionClause();
				}
			}

			setState(2522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2521);
				sortClause();
				}
			}

			setState(2525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(2524);
				windowFrame();
				}
			}

			setState(2527);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public FrameBoundaryContext start;
		public FrameBoundaryContext end;
		public FrameUnitsContext frameUnits() {
			return getRuleContext(FrameUnitsContext.class,0);
		}
		public List<FrameBoundaryContext> frameBoundary() {
			return getRuleContexts(FrameBoundaryContext.class);
		}
		public FrameBoundaryContext frameBoundary(int i) {
			return getRuleContext(FrameBoundaryContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(DorisParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DorisParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_windowFrame);
		try {
			setState(2538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2529);
				frameUnits();
				setState(2530);
				((WindowFrameContext)_localctx).start = frameBoundary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2532);
				frameUnits();
				setState(2533);
				match(BETWEEN);
				setState(2534);
				((WindowFrameContext)_localctx).start = frameBoundary();
				setState(2535);
				match(AND);
				setState(2536);
				((WindowFrameContext)_localctx).end = frameBoundary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameUnitsContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(DorisParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(DorisParser.RANGE, 0); }
		public FrameUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFrameUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFrameUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFrameUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameUnitsContext frameUnits() throws RecognitionException {
		FrameUnitsContext _localctx = new FrameUnitsContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_frameUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundaryContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(DorisParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(DorisParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(DorisParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(DorisParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(DorisParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBoundary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFrameBoundary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFrameBoundary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFrameBoundary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundaryContext frameBoundary() throws RecognitionException {
		FrameBoundaryContext _localctx = new FrameBoundaryContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_frameBoundary);
		int _la;
		try {
			setState(2549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2542);
				match(UNBOUNDED);
				setState(2543);
				((FrameBoundaryContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundaryContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2544);
				((FrameBoundaryContext)_localctx).boundType = match(CURRENT);
				setState(2545);
				match(ROW);
				}
				break;
			case LEFT_PAREN:
			case LEFT_BRACKET:
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADD:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case ARRAY_RANGE:
			case AT:
			case AUTHORS:
			case AUTO_INCREMENT:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BELONG:
			case BIN:
			case BINARY:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case BULK:
			case CACHED:
			case CALL:
			case CASE:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLLECT:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONSTRAINTS:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATABASE:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DUAL:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPIRED:
			case EXTERNAL:
			case EXTRACT:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GENERIC:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IF:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INTERVAL:
			case INVERTED:
			case IPV4:
			case IPV6:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case KEY:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LEFT:
			case LESS:
			case LEVEL:
			case LIKE:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MANUAL:
			case MAP:
			case MATCH_ALL:
			case MATCH_ANY:
			case MATCH_ELEMENT_EQ:
			case MATCH_ELEMENT_GE:
			case MATCH_ELEMENT_GT:
			case MATCH_ELEMENT_LE:
			case MATCH_ELEMENT_LT:
			case MATCH_PHRASE:
			case MATCH_PHRASE_EDGE:
			case MATCH_PHRASE_PREFIX:
			case MATCH_REGEXP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PROCESS:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REGEXP:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RIGHT:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VARIANT:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case PLUS:
			case SUBTRACT:
			case ASTERISK:
			case TILDE:
			case LOGICALNOT:
			case ATSIGN:
			case DOUBLEATSIGN:
			case STRING_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2546);
				expression();
				setState(2547);
				((FrameBoundaryContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundaryContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DorisParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DorisParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2551);
			identifier();
			setState(2556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2552);
					match(DOT);
					setState(2553);
					identifier();
					}
					} 
				}
				setState(2558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifiedPartitionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(DorisParser.TEMPORARY, 0); }
		public TerminalNode PARTITIONS() { return getToken(DorisParser.PARTITIONS, 0); }
		public SpecifiedPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifiedPartition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSpecifiedPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSpecifiedPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSpecifiedPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifiedPartitionContext specifiedPartition() throws RecognitionException {
		SpecifiedPartitionContext _localctx = new SpecifiedPartitionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_specifiedPartition);
		int _la;
		try {
			setState(2572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(2559);
					match(TEMPORARY);
					}
				}

				setState(2562);
				match(PARTITION);
				setState(2565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case ARRAY_RANGE:
				case AT:
				case AUTHORS:
				case AUTO_INCREMENT:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BELONG:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case BULK:
				case CACHED:
				case CALL:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLLECT:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONSTRAINTS:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DUAL:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GENERIC:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IPV4:
				case IPV6:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MANUAL:
				case MAP:
				case MATCH_ALL:
				case MATCH_ANY:
				case MATCH_ELEMENT_EQ:
				case MATCH_ELEMENT_GE:
				case MATCH_ELEMENT_GT:
				case MATCH_ELEMENT_LE:
				case MATCH_ELEMENT_LT:
				case MATCH_PHRASE:
				case MATCH_PHRASE_EDGE:
				case MATCH_PHRASE_PREFIX:
				case MATCH_REGEXP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PARTITIONS:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PROCESS:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VARIANT:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(2563);
					identifier();
					}
					break;
				case LEFT_PAREN:
					{
					setState(2564);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(2567);
					match(TEMPORARY);
					}
				}

				setState(2570);
				match(PARTITIONS);
				setState(2571);
				identifierList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructLiteralContext extends ConstantContext {
		public ConstantContext constant;
		public List<ConstantContext> items = new ArrayList<ConstantContext>();
		public TerminalNode LEFT_BRACE() { return getToken(DorisParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DorisParser.RIGHT_BRACE, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public StructLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStructLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStructLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStructLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(DorisParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode BINARY() { return getToken(DorisParser.BINARY, 0); }
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public Token type;
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode DATEV1() { return getToken(DorisParser.DATEV1, 0); }
		public TerminalNode DATEV2() { return getToken(DorisParser.DATEV2, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DorisParser.TIMESTAMP, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralContext extends ConstantContext {
		public ConstantContext constant;
		public List<ConstantContext> items = new ArrayList<ConstantContext>();
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ArrayLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapLiteralContext extends ConstantContext {
		public ConstantContext constant;
		public List<ConstantContext> items = new ArrayList<ConstantContext>();
		public TerminalNode LEFT_BRACE() { return getToken(DorisParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DorisParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(DorisParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DorisParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public MapLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_constant);
		int _la;
		try {
			setState(2624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2574);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2575);
				((TypeConstructorContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (DATE - 105)) | (1L << (DATEV2 - 105)) | (1L << (DATEV1 - 105)))) != 0) || _la==TIMESTAMP) ) {
					((TypeConstructorContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2576);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2577);
				number();
				}
				break;
			case 4:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2578);
				booleanValue();
				}
				break;
			case 5:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(2579);
					match(BINARY);
					}
				}

				setState(2582);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				_localctx = new ArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2583);
				match(LEFT_BRACKET);
				setState(2585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << BINARY))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (DATE - 105)) | (1L << (DATEV2 - 105)) | (1L << (DATEV1 - 105)))) != 0) || _la==FALSE || _la==NULL || ((((_la - 438)) & ~0x3f) == 0 && ((1L << (_la - 438)) & ((1L << (TIMESTAMP - 438)) | (1L << (TRUE - 438)) | (1L << (SUBTRACT - 438)))) != 0) || ((((_la - 507)) & ~0x3f) == 0 && ((1L << (_la - 507)) & ((1L << (STRING_LITERAL - 507)) | (1L << (INTEGER_VALUE - 507)) | (1L << (EXPONENT_VALUE - 507)) | (1L << (DECIMAL_VALUE - 507)))) != 0)) {
					{
					setState(2584);
					((ArrayLiteralContext)_localctx).constant = constant();
					((ArrayLiteralContext)_localctx).items.add(((ArrayLiteralContext)_localctx).constant);
					}
				}

				setState(2591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2587);
					match(COMMA);
					setState(2588);
					((ArrayLiteralContext)_localctx).constant = constant();
					((ArrayLiteralContext)_localctx).items.add(((ArrayLiteralContext)_localctx).constant);
					}
					}
					setState(2593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2594);
				match(RIGHT_BRACKET);
				}
				break;
			case 7:
				_localctx = new MapLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2595);
				match(LEFT_BRACE);
				setState(2600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << BINARY))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (DATE - 105)) | (1L << (DATEV2 - 105)) | (1L << (DATEV1 - 105)))) != 0) || _la==FALSE || _la==NULL || ((((_la - 438)) & ~0x3f) == 0 && ((1L << (_la - 438)) & ((1L << (TIMESTAMP - 438)) | (1L << (TRUE - 438)) | (1L << (SUBTRACT - 438)))) != 0) || ((((_la - 507)) & ~0x3f) == 0 && ((1L << (_la - 507)) & ((1L << (STRING_LITERAL - 507)) | (1L << (INTEGER_VALUE - 507)) | (1L << (EXPONENT_VALUE - 507)) | (1L << (DECIMAL_VALUE - 507)))) != 0)) {
					{
					setState(2596);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					setState(2597);
					match(COLON);
					setState(2598);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					}
				}

				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2602);
					match(COMMA);
					setState(2603);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					setState(2604);
					match(COLON);
					setState(2605);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					}
					}
					setState(2611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2612);
				match(RIGHT_BRACE);
				}
				break;
			case 8:
				_localctx = new StructLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2613);
				match(LEFT_BRACE);
				setState(2614);
				((StructLiteralContext)_localctx).constant = constant();
				((StructLiteralContext)_localctx).items.add(((StructLiteralContext)_localctx).constant);
				setState(2619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2615);
					match(COMMA);
					setState(2616);
					((StructLiteralContext)_localctx).constant = constant();
					((StructLiteralContext)_localctx).items.add(((StructLiteralContext)_localctx).constant);
					}
					}
					setState(2621);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2622);
				match(RIGHT_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(DorisParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(DorisParser.LT, 0); }
		public TerminalNode LTE() { return getToken(DorisParser.LTE, 0); }
		public TerminalNode GT() { return getToken(DorisParser.GT, 0); }
		public TerminalNode GTE() { return getToken(DorisParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(DorisParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2626);
			_la = _input.LA(1);
			if ( !(((((_la - 482)) & ~0x3f) == 0 && ((1L << (_la - 482)) & ((1L << (EQ - 482)) | (1L << (NSEQ - 482)) | (1L << (NEQ - 482)) | (1L << (LT - 482)) | (1L << (LTE - 482)) | (1L << (GT - 482)) | (1L << (GTE - 482)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DorisParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DorisParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(DorisParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(DorisParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630);
			match(WHEN);
			setState(2631);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2632);
			match(THEN);
			setState(2633);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public ExpressionContext value;
		public UnitIdentifierContext unit;
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnitIdentifierContext unitIdentifier() {
			return getRuleContext(UnitIdentifierContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			match(INTERVAL);
			setState(2636);
			((IntervalContext)_localctx).value = expression();
			setState(2637);
			((IntervalContext)_localctx).unit = unitIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitIdentifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DorisParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DorisParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(DorisParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(DorisParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DorisParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DorisParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DorisParser.SECOND, 0); }
		public UnitIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUnitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUnitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUnitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitIdentifierContext unitIdentifier() throws RecognitionException {
		UnitIdentifierContext _localctx = new UnitIdentifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_unitIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==MONTH || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeWithNullableContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DorisParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public DataTypeWithNullableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeWithNullable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDataTypeWithNullable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDataTypeWithNullable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDataTypeWithNullable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeWithNullableContext dataTypeWithNullable() throws RecognitionException {
		DataTypeWithNullableContext _localctx = new DataTypeWithNullableContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_dataTypeWithNullable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2641);
			dataType();
			setState(2646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(2643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2642);
					match(NOT);
					}
				}

				setState(2645);
				match(NULL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(DorisParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(DorisParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(DorisParser.ARRAY, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode MAP() { return getToken(DorisParser.MAP, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(DorisParser.STRUCT, 0); }
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggStateDataTypeContext extends DataTypeContext {
		public DataTypeWithNullableContext dataTypeWithNullable;
		public List<DataTypeWithNullableContext> dataTypes = new ArrayList<DataTypeWithNullableContext>();
		public TerminalNode AGG_STATE() { return getToken(DorisParser.AGG_STATE, 0); }
		public TerminalNode LT() { return getToken(DorisParser.LT, 0); }
		public FunctionNameIdentifierContext functionNameIdentifier() {
			return getRuleContext(FunctionNameIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode GT() { return getToken(DorisParser.GT, 0); }
		public List<DataTypeWithNullableContext> dataTypeWithNullable() {
			return getRuleContexts(DataTypeWithNullableContext.class);
		}
		public DataTypeWithNullableContext dataTypeWithNullable(int i) {
			return getRuleContext(DataTypeWithNullableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public AggStateDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAggStateDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAggStateDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAggStateDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public PrimitiveColTypeContext primitiveColType() {
			return getRuleContext(PrimitiveColTypeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DorisParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DorisParser.INTEGER_VALUE, i);
		}
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_dataType);
		int _la;
		try {
			setState(2693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2648);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2649);
				match(LT);
				setState(2650);
				dataType();
				setState(2651);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2653);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2654);
				match(LT);
				setState(2655);
				dataType();
				setState(2656);
				match(COMMA);
				setState(2657);
				dataType();
				setState(2658);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2660);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2661);
				match(LT);
				setState(2662);
				complexColTypeList();
				setState(2663);
				match(GT);
				}
				break;
			case 4:
				_localctx = new AggStateDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2665);
				match(AGG_STATE);
				setState(2666);
				match(LT);
				setState(2667);
				functionNameIdentifier();
				setState(2668);
				match(LEFT_PAREN);
				setState(2669);
				((AggStateDataTypeContext)_localctx).dataTypeWithNullable = dataTypeWithNullable();
				((AggStateDataTypeContext)_localctx).dataTypes.add(((AggStateDataTypeContext)_localctx).dataTypeWithNullable);
				setState(2674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2670);
					match(COMMA);
					setState(2671);
					((AggStateDataTypeContext)_localctx).dataTypeWithNullable = dataTypeWithNullable();
					((AggStateDataTypeContext)_localctx).dataTypes.add(((AggStateDataTypeContext)_localctx).dataTypeWithNullable);
					}
					}
					setState(2676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2677);
				match(RIGHT_PAREN);
				setState(2678);
				match(GT);
				}
				break;
			case 5:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2680);
				primitiveColType();
				setState(2691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(2681);
					match(LEFT_PAREN);
					setState(2682);
					_la = _input.LA(1);
					if ( !(_la==ASTERISK || _la==INTEGER_VALUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2683);
						match(COMMA);
						setState(2684);
						match(INTEGER_VALUE);
						}
						}
						setState(2689);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2690);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveColTypeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode TINYINT() { return getToken(DorisParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(DorisParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(DorisParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(DorisParser.INTEGER, 0); }
		public TerminalNode SIGNED() { return getToken(DorisParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(DorisParser.UNSIGNED, 0); }
		public TerminalNode BIGINT() { return getToken(DorisParser.BIGINT, 0); }
		public TerminalNode LARGEINT() { return getToken(DorisParser.LARGEINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DorisParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(DorisParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(DorisParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(DorisParser.DATETIME, 0); }
		public TerminalNode TIME() { return getToken(DorisParser.TIME, 0); }
		public TerminalNode DATEV2() { return getToken(DorisParser.DATEV2, 0); }
		public TerminalNode DATETIMEV2() { return getToken(DorisParser.DATETIMEV2, 0); }
		public TerminalNode DATEV1() { return getToken(DorisParser.DATEV1, 0); }
		public TerminalNode DATETIMEV1() { return getToken(DorisParser.DATETIMEV1, 0); }
		public TerminalNode BITMAP() { return getToken(DorisParser.BITMAP, 0); }
		public TerminalNode QUANTILE_STATE() { return getToken(DorisParser.QUANTILE_STATE, 0); }
		public TerminalNode HLL() { return getToken(DorisParser.HLL, 0); }
		public TerminalNode AGG_STATE() { return getToken(DorisParser.AGG_STATE, 0); }
		public TerminalNode STRING() { return getToken(DorisParser.STRING, 0); }
		public TerminalNode JSON() { return getToken(DorisParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(DorisParser.JSONB, 0); }
		public TerminalNode TEXT() { return getToken(DorisParser.TEXT, 0); }
		public TerminalNode VARCHAR() { return getToken(DorisParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(DorisParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(DorisParser.DECIMAL, 0); }
		public TerminalNode DECIMALV2() { return getToken(DorisParser.DECIMALV2, 0); }
		public TerminalNode DECIMALV3() { return getToken(DorisParser.DECIMALV3, 0); }
		public TerminalNode IPV4() { return getToken(DorisParser.IPV4, 0); }
		public TerminalNode IPV6() { return getToken(DorisParser.IPV6, 0); }
		public TerminalNode VARIANT() { return getToken(DorisParser.VARIANT, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public PrimitiveColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPrimitiveColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPrimitiveColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPrimitiveColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveColTypeContext primitiveColType() throws RecognitionException {
		PrimitiveColTypeContext _localctx = new PrimitiveColTypeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_primitiveColType);
		int _la;
		try {
			setState(2731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case RIGHT_PAREN:
			case COMMA:
			case AUTO_INCREMENT:
			case BITMAP_UNION:
			case COMMENT:
			case DEFAULT:
			case GENERIC:
			case HLL_UNION:
			case KEY:
			case MAX:
			case MIN:
			case NOT:
			case NULL:
			case ON:
			case QUANTILE_UNION:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case SUM:
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2696);
				((PrimitiveColTypeContext)_localctx).type = match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2697);
				((PrimitiveColTypeContext)_localctx).type = match(SMALLINT);
				}
				break;
			case INT:
			case INTEGER:
			case SIGNED:
			case UNSIGNED:
				enterOuterAlt(_localctx, 4);
				{
				setState(2699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGNED || _la==UNSIGNED) {
					{
					setState(2698);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2701);
				((PrimitiveColTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==INTEGER) ) {
					((PrimitiveColTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2702);
				((PrimitiveColTypeContext)_localctx).type = match(BIGINT);
				}
				break;
			case LARGEINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2703);
				((PrimitiveColTypeContext)_localctx).type = match(LARGEINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(2704);
				((PrimitiveColTypeContext)_localctx).type = match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(2705);
				((PrimitiveColTypeContext)_localctx).type = match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2706);
				((PrimitiveColTypeContext)_localctx).type = match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2707);
				((PrimitiveColTypeContext)_localctx).type = match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 11);
				{
				setState(2708);
				((PrimitiveColTypeContext)_localctx).type = match(DATETIME);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 12);
				{
				setState(2709);
				((PrimitiveColTypeContext)_localctx).type = match(TIME);
				}
				break;
			case DATEV2:
				enterOuterAlt(_localctx, 13);
				{
				setState(2710);
				((PrimitiveColTypeContext)_localctx).type = match(DATEV2);
				}
				break;
			case DATETIMEV2:
				enterOuterAlt(_localctx, 14);
				{
				setState(2711);
				((PrimitiveColTypeContext)_localctx).type = match(DATETIMEV2);
				}
				break;
			case DATEV1:
				enterOuterAlt(_localctx, 15);
				{
				setState(2712);
				((PrimitiveColTypeContext)_localctx).type = match(DATEV1);
				}
				break;
			case DATETIMEV1:
				enterOuterAlt(_localctx, 16);
				{
				setState(2713);
				((PrimitiveColTypeContext)_localctx).type = match(DATETIMEV1);
				}
				break;
			case BITMAP:
				enterOuterAlt(_localctx, 17);
				{
				setState(2714);
				((PrimitiveColTypeContext)_localctx).type = match(BITMAP);
				}
				break;
			case QUANTILE_STATE:
				enterOuterAlt(_localctx, 18);
				{
				setState(2715);
				((PrimitiveColTypeContext)_localctx).type = match(QUANTILE_STATE);
				}
				break;
			case HLL:
				enterOuterAlt(_localctx, 19);
				{
				setState(2716);
				((PrimitiveColTypeContext)_localctx).type = match(HLL);
				}
				break;
			case AGG_STATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(2717);
				((PrimitiveColTypeContext)_localctx).type = match(AGG_STATE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 21);
				{
				setState(2718);
				((PrimitiveColTypeContext)_localctx).type = match(STRING);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 22);
				{
				setState(2719);
				((PrimitiveColTypeContext)_localctx).type = match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 23);
				{
				setState(2720);
				((PrimitiveColTypeContext)_localctx).type = match(JSONB);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 24);
				{
				setState(2721);
				((PrimitiveColTypeContext)_localctx).type = match(TEXT);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 25);
				{
				setState(2722);
				((PrimitiveColTypeContext)_localctx).type = match(VARCHAR);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 26);
				{
				setState(2723);
				((PrimitiveColTypeContext)_localctx).type = match(CHAR);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 27);
				{
				setState(2724);
				((PrimitiveColTypeContext)_localctx).type = match(DECIMAL);
				}
				break;
			case DECIMALV2:
				enterOuterAlt(_localctx, 28);
				{
				setState(2725);
				((PrimitiveColTypeContext)_localctx).type = match(DECIMALV2);
				}
				break;
			case DECIMALV3:
				enterOuterAlt(_localctx, 29);
				{
				setState(2726);
				((PrimitiveColTypeContext)_localctx).type = match(DECIMALV3);
				}
				break;
			case IPV4:
				enterOuterAlt(_localctx, 30);
				{
				setState(2727);
				((PrimitiveColTypeContext)_localctx).type = match(IPV4);
				}
				break;
			case IPV6:
				enterOuterAlt(_localctx, 31);
				{
				setState(2728);
				((PrimitiveColTypeContext)_localctx).type = match(IPV6);
				}
				break;
			case VARIANT:
				enterOuterAlt(_localctx, 32);
				{
				setState(2729);
				((PrimitiveColTypeContext)_localctx).type = match(VARIANT);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 33);
				{
				setState(2730);
				((PrimitiveColTypeContext)_localctx).type = match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2733);
			complexColType();
			setState(2738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2734);
				match(COMMA);
				setState(2735);
				complexColType();
				}
				}
				setState(2740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DorisParser.COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			identifier();
			setState(2742);
			match(COLON);
			setState(2743);
			dataType();
			setState(2745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2744);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2747);
			match(COMMENT);
			setState(2748);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public Token seed;
		public TerminalNode TABLESAMPLE() { return getToken(DorisParser.TABLESAMPLE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(DorisParser.REPEATABLE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
			match(TABLESAMPLE);
			setState(2751);
			match(LEFT_PAREN);
			setState(2753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(2752);
				sampleMethod();
				}
			}

			setState(2755);
			match(RIGHT_PAREN);
			setState(2758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2756);
				match(REPEATABLE);
				setState(2757);
				((SampleContext)_localctx).seed = match(INTEGER_VALUE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode ROWS() { return getToken(DorisParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token percentage;
		public TerminalNode PERCENT() { return getToken(DorisParser.PERCENT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_sampleMethod);
		try {
			setState(2764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2760);
				((SampleByPercentileContext)_localctx).percentage = match(INTEGER_VALUE);
				setState(2761);
				match(PERCENT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2762);
				match(INTEGER_VALUE);
				setState(2763);
				match(ROWS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
			identifier();
			setState(2767);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> SUBTRACT() { return getTokens(DorisParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(DorisParser.SUBTRACT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2771); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2769);
						match(SUBTRACT);
						setState(2770);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2773); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2778);
			strictIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(DorisParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_strictIdentifier);
		try {
			setState(2783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2780);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2781);
				quotedIdentifier();
				}
				break;
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case ARRAY_RANGE:
			case AT:
			case AUTHORS:
			case AUTO_INCREMENT:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BELONG:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case BULK:
			case CACHED:
			case CALL:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLLECT:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONSTRAINTS:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DUAL:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXPIRED:
			case EXTERNAL:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GENERIC:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INVERTED:
			case IPV4:
			case IPV6:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LESS:
			case LEVEL:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MANUAL:
			case MAP:
			case MATCH_ALL:
			case MATCH_ANY:
			case MATCH_ELEMENT_EQ:
			case MATCH_ELEMENT_GE:
			case MATCH_ELEMENT_GT:
			case MATCH_ELEMENT_LE:
			case MATCH_ELEMENT_LT:
			case MATCH_PHRASE:
			case MATCH_PHRASE_EDGE:
			case MATCH_PHRASE_PREFIX:
			case MATCH_REGEXP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PROCESS:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VARIANT:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2782);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(DorisParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(DorisParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(DorisParser.DECIMAL_VALUE, 0); }
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_number);
		int _la;
		try {
			setState(2795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACT) {
					{
					setState(2787);
					match(SUBTRACT);
					}
				}

				setState(2790);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACT) {
					{
					setState(2791);
					match(SUBTRACT);
					}
				}

				setState(2794);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADDDATE() { return getToken(DorisParser.ADDDATE, 0); }
		public TerminalNode AFTER() { return getToken(DorisParser.AFTER, 0); }
		public TerminalNode AGG_STATE() { return getToken(DorisParser.AGG_STATE, 0); }
		public TerminalNode AGGREGATE() { return getToken(DorisParser.AGGREGATE, 0); }
		public TerminalNode ALIAS() { return getToken(DorisParser.ALIAS, 0); }
		public TerminalNode ANALYZED() { return getToken(DorisParser.ANALYZED, 0); }
		public TerminalNode ARRAY() { return getToken(DorisParser.ARRAY, 0); }
		public TerminalNode ARRAY_RANGE() { return getToken(DorisParser.ARRAY_RANGE, 0); }
		public TerminalNode AT() { return getToken(DorisParser.AT, 0); }
		public TerminalNode AUTHORS() { return getToken(DorisParser.AUTHORS, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(DorisParser.AUTO_INCREMENT, 0); }
		public TerminalNode BACKENDS() { return getToken(DorisParser.BACKENDS, 0); }
		public TerminalNode BACKUP() { return getToken(DorisParser.BACKUP, 0); }
		public TerminalNode BEGIN() { return getToken(DorisParser.BEGIN, 0); }
		public TerminalNode BELONG() { return getToken(DorisParser.BELONG, 0); }
		public TerminalNode BIN() { return getToken(DorisParser.BIN, 0); }
		public TerminalNode BITAND() { return getToken(DorisParser.BITAND, 0); }
		public TerminalNode BITMAP() { return getToken(DorisParser.BITMAP, 0); }
		public TerminalNode BITMAP_UNION() { return getToken(DorisParser.BITMAP_UNION, 0); }
		public TerminalNode BITOR() { return getToken(DorisParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(DorisParser.BITXOR, 0); }
		public TerminalNode BLOB() { return getToken(DorisParser.BLOB, 0); }
		public TerminalNode BOOLEAN() { return getToken(DorisParser.BOOLEAN, 0); }
		public TerminalNode BRIEF() { return getToken(DorisParser.BRIEF, 0); }
		public TerminalNode BROKER() { return getToken(DorisParser.BROKER, 0); }
		public TerminalNode BUCKETS() { return getToken(DorisParser.BUCKETS, 0); }
		public TerminalNode BUILD() { return getToken(DorisParser.BUILD, 0); }
		public TerminalNode BUILTIN() { return getToken(DorisParser.BUILTIN, 0); }
		public TerminalNode BULK() { return getToken(DorisParser.BULK, 0); }
		public TerminalNode CACHED() { return getToken(DorisParser.CACHED, 0); }
		public TerminalNode CALL() { return getToken(DorisParser.CALL, 0); }
		public TerminalNode CATALOG() { return getToken(DorisParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(DorisParser.CATALOGS, 0); }
		public TerminalNode CHAIN() { return getToken(DorisParser.CHAIN, 0); }
		public TerminalNode CHAR() { return getToken(DorisParser.CHAR, 0); }
		public TerminalNode CHARSET() { return getToken(DorisParser.CHARSET, 0); }
		public TerminalNode CHECK() { return getToken(DorisParser.CHECK, 0); }
		public TerminalNode CLUSTER() { return getToken(DorisParser.CLUSTER, 0); }
		public TerminalNode CLUSTERS() { return getToken(DorisParser.CLUSTERS, 0); }
		public TerminalNode COLLATION() { return getToken(DorisParser.COLLATION, 0); }
		public TerminalNode COLLECT() { return getToken(DorisParser.COLLECT, 0); }
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(DorisParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(DorisParser.COMMITTED, 0); }
		public TerminalNode COMPACT() { return getToken(DorisParser.COMPACT, 0); }
		public TerminalNode COMPLETE() { return getToken(DorisParser.COMPLETE, 0); }
		public TerminalNode CONFIG() { return getToken(DorisParser.CONFIG, 0); }
		public TerminalNode CONNECTION() { return getToken(DorisParser.CONNECTION, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(DorisParser.CONNECTION_ID, 0); }
		public TerminalNode CONSISTENT() { return getToken(DorisParser.CONSISTENT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(DorisParser.CONSTRAINTS, 0); }
		public TerminalNode CONVERT() { return getToken(DorisParser.CONVERT, 0); }
		public TerminalNode COPY() { return getToken(DorisParser.COPY, 0); }
		public TerminalNode COUNT() { return getToken(DorisParser.COUNT, 0); }
		public TerminalNode CREATION() { return getToken(DorisParser.CREATION, 0); }
		public TerminalNode CRON() { return getToken(DorisParser.CRON, 0); }
		public TerminalNode CURRENT_CATALOG() { return getToken(DorisParser.CURRENT_CATALOG, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(DorisParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(DorisParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DorisParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(DorisParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(DorisParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode DATE_ADD() { return getToken(DorisParser.DATE_ADD, 0); }
		public TerminalNode DATE_CEIL() { return getToken(DorisParser.DATE_CEIL, 0); }
		public TerminalNode DATE_DIFF() { return getToken(DorisParser.DATE_DIFF, 0); }
		public TerminalNode DATE_FLOOR() { return getToken(DorisParser.DATE_FLOOR, 0); }
		public TerminalNode DATE_SUB() { return getToken(DorisParser.DATE_SUB, 0); }
		public TerminalNode DATEADD() { return getToken(DorisParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(DorisParser.DATEDIFF, 0); }
		public TerminalNode DATETIME() { return getToken(DorisParser.DATETIME, 0); }
		public TerminalNode DATETIMEV1() { return getToken(DorisParser.DATETIMEV1, 0); }
		public TerminalNode DATETIMEV2() { return getToken(DorisParser.DATETIMEV2, 0); }
		public TerminalNode DATEV1() { return getToken(DorisParser.DATEV1, 0); }
		public TerminalNode DATEV2() { return getToken(DorisParser.DATEV2, 0); }
		public TerminalNode DAY() { return getToken(DorisParser.DAY, 0); }
		public TerminalNode DAYS_ADD() { return getToken(DorisParser.DAYS_ADD, 0); }
		public TerminalNode DAYS_SUB() { return getToken(DorisParser.DAYS_SUB, 0); }
		public TerminalNode DECIMAL() { return getToken(DorisParser.DECIMAL, 0); }
		public TerminalNode DECIMALV2() { return getToken(DorisParser.DECIMALV2, 0); }
		public TerminalNode DECIMALV3() { return getToken(DorisParser.DECIMALV3, 0); }
		public TerminalNode DEFERRED() { return getToken(DorisParser.DEFERRED, 0); }
		public TerminalNode DEMAND() { return getToken(DorisParser.DEMAND, 0); }
		public TerminalNode DIAGNOSE() { return getToken(DorisParser.DIAGNOSE, 0); }
		public TerminalNode DISTINCTPC() { return getToken(DorisParser.DISTINCTPC, 0); }
		public TerminalNode DISTINCTPCSA() { return getToken(DorisParser.DISTINCTPCSA, 0); }
		public TerminalNode DO() { return getToken(DorisParser.DO, 0); }
		public TerminalNode DORIS_INTERNAL_TABLE_ID() { return getToken(DorisParser.DORIS_INTERNAL_TABLE_ID, 0); }
		public TerminalNode DUAL() { return getToken(DorisParser.DUAL, 0); }
		public TerminalNode DYNAMIC() { return getToken(DorisParser.DYNAMIC, 0); }
		public TerminalNode ENABLE() { return getToken(DorisParser.ENABLE, 0); }
		public TerminalNode ENCRYPTKEY() { return getToken(DorisParser.ENCRYPTKEY, 0); }
		public TerminalNode ENCRYPTKEYS() { return getToken(DorisParser.ENCRYPTKEYS, 0); }
		public TerminalNode END() { return getToken(DorisParser.END, 0); }
		public TerminalNode ENDS() { return getToken(DorisParser.ENDS, 0); }
		public TerminalNode ENGINE() { return getToken(DorisParser.ENGINE, 0); }
		public TerminalNode ENGINES() { return getToken(DorisParser.ENGINES, 0); }
		public TerminalNode ERRORS() { return getToken(DorisParser.ERRORS, 0); }
		public TerminalNode EVENTS() { return getToken(DorisParser.EVENTS, 0); }
		public TerminalNode EVERY() { return getToken(DorisParser.EVERY, 0); }
		public TerminalNode EXCLUDE() { return getToken(DorisParser.EXCLUDE, 0); }
		public TerminalNode EXPIRED() { return getToken(DorisParser.EXPIRED, 0); }
		public TerminalNode EXTERNAL() { return getToken(DorisParser.EXTERNAL, 0); }
		public TerminalNode FAILED_LOGIN_ATTEMPTS() { return getToken(DorisParser.FAILED_LOGIN_ATTEMPTS, 0); }
		public TerminalNode FAST() { return getToken(DorisParser.FAST, 0); }
		public TerminalNode FEATURE() { return getToken(DorisParser.FEATURE, 0); }
		public TerminalNode FIELDS() { return getToken(DorisParser.FIELDS, 0); }
		public TerminalNode FILE() { return getToken(DorisParser.FILE, 0); }
		public TerminalNode FILTER() { return getToken(DorisParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(DorisParser.FIRST, 0); }
		public TerminalNode FORMAT() { return getToken(DorisParser.FORMAT, 0); }
		public TerminalNode FREE() { return getToken(DorisParser.FREE, 0); }
		public TerminalNode FRONTENDS() { return getToken(DorisParser.FRONTENDS, 0); }
		public TerminalNode FUNCTION() { return getToken(DorisParser.FUNCTION, 0); }
		public TerminalNode GENERIC() { return getToken(DorisParser.GENERIC, 0); }
		public TerminalNode GLOBAL() { return getToken(DorisParser.GLOBAL, 0); }
		public TerminalNode GRAPH() { return getToken(DorisParser.GRAPH, 0); }
		public TerminalNode GROUPING() { return getToken(DorisParser.GROUPING, 0); }
		public TerminalNode GROUPS() { return getToken(DorisParser.GROUPS, 0); }
		public TerminalNode HASH() { return getToken(DorisParser.HASH, 0); }
		public TerminalNode HDFS() { return getToken(DorisParser.HDFS, 0); }
		public TerminalNode HELP() { return getToken(DorisParser.HELP, 0); }
		public TerminalNode HISTOGRAM() { return getToken(DorisParser.HISTOGRAM, 0); }
		public TerminalNode HLL_UNION() { return getToken(DorisParser.HLL_UNION, 0); }
		public TerminalNode HOSTNAME() { return getToken(DorisParser.HOSTNAME, 0); }
		public TerminalNode HOUR() { return getToken(DorisParser.HOUR, 0); }
		public TerminalNode HUB() { return getToken(DorisParser.HUB, 0); }
		public TerminalNode IDENTIFIED() { return getToken(DorisParser.IDENTIFIED, 0); }
		public TerminalNode IGNORE() { return getToken(DorisParser.IGNORE, 0); }
		public TerminalNode IMMEDIATE() { return getToken(DorisParser.IMMEDIATE, 0); }
		public TerminalNode INCREMENTAL() { return getToken(DorisParser.INCREMENTAL, 0); }
		public TerminalNode INDEXES() { return getToken(DorisParser.INDEXES, 0); }
		public TerminalNode INVERTED() { return getToken(DorisParser.INVERTED, 0); }
		public TerminalNode IPV4() { return getToken(DorisParser.IPV4, 0); }
		public TerminalNode IPV6() { return getToken(DorisParser.IPV6, 0); }
		public TerminalNode IS_NOT_NULL_PRED() { return getToken(DorisParser.IS_NOT_NULL_PRED, 0); }
		public TerminalNode IS_NULL_PRED() { return getToken(DorisParser.IS_NULL_PRED, 0); }
		public TerminalNode ISNULL() { return getToken(DorisParser.ISNULL, 0); }
		public TerminalNode ISOLATION() { return getToken(DorisParser.ISOLATION, 0); }
		public TerminalNode JOB() { return getToken(DorisParser.JOB, 0); }
		public TerminalNode JOBS() { return getToken(DorisParser.JOBS, 0); }
		public TerminalNode JSON() { return getToken(DorisParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(DorisParser.JSONB, 0); }
		public TerminalNode LABEL() { return getToken(DorisParser.LABEL, 0); }
		public TerminalNode LAST() { return getToken(DorisParser.LAST, 0); }
		public TerminalNode LDAP() { return getToken(DorisParser.LDAP, 0); }
		public TerminalNode LDAP_ADMIN_PASSWORD() { return getToken(DorisParser.LDAP_ADMIN_PASSWORD, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(DorisParser.LEFT_BRACE, 0); }
		public TerminalNode LESS() { return getToken(DorisParser.LESS, 0); }
		public TerminalNode LEVEL() { return getToken(DorisParser.LEVEL, 0); }
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public TerminalNode LINK() { return getToken(DorisParser.LINK, 0); }
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public TerminalNode LOCALTIME() { return getToken(DorisParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(DorisParser.LOCALTIMESTAMP, 0); }
		public TerminalNode LOCATION() { return getToken(DorisParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(DorisParser.LOCK, 0); }
		public TerminalNode LOGICAL() { return getToken(DorisParser.LOGICAL, 0); }
		public TerminalNode MANUAL() { return getToken(DorisParser.MANUAL, 0); }
		public TerminalNode MAP() { return getToken(DorisParser.MAP, 0); }
		public TerminalNode MATCH_ALL() { return getToken(DorisParser.MATCH_ALL, 0); }
		public TerminalNode MATCH_ANY() { return getToken(DorisParser.MATCH_ANY, 0); }
		public TerminalNode MATCH_ELEMENT_EQ() { return getToken(DorisParser.MATCH_ELEMENT_EQ, 0); }
		public TerminalNode MATCH_ELEMENT_GE() { return getToken(DorisParser.MATCH_ELEMENT_GE, 0); }
		public TerminalNode MATCH_ELEMENT_GT() { return getToken(DorisParser.MATCH_ELEMENT_GT, 0); }
		public TerminalNode MATCH_ELEMENT_LE() { return getToken(DorisParser.MATCH_ELEMENT_LE, 0); }
		public TerminalNode MATCH_ELEMENT_LT() { return getToken(DorisParser.MATCH_ELEMENT_LT, 0); }
		public TerminalNode MATCH_PHRASE() { return getToken(DorisParser.MATCH_PHRASE, 0); }
		public TerminalNode MATCH_PHRASE_EDGE() { return getToken(DorisParser.MATCH_PHRASE_EDGE, 0); }
		public TerminalNode MATCH_PHRASE_PREFIX() { return getToken(DorisParser.MATCH_PHRASE_PREFIX, 0); }
		public TerminalNode MATCH_REGEXP() { return getToken(DorisParser.MATCH_REGEXP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(DorisParser.MAX, 0); }
		public TerminalNode MEMO() { return getToken(DorisParser.MEMO, 0); }
		public TerminalNode MERGE() { return getToken(DorisParser.MERGE, 0); }
		public TerminalNode MIGRATE() { return getToken(DorisParser.MIGRATE, 0); }
		public TerminalNode MIGRATIONS() { return getToken(DorisParser.MIGRATIONS, 0); }
		public TerminalNode MIN() { return getToken(DorisParser.MIN, 0); }
		public TerminalNode MINUTE() { return getToken(DorisParser.MINUTE, 0); }
		public TerminalNode MODIFY() { return getToken(DorisParser.MODIFY, 0); }
		public TerminalNode MONTH() { return getToken(DorisParser.MONTH, 0); }
		public TerminalNode MTMV() { return getToken(DorisParser.MTMV, 0); }
		public TerminalNode NAME() { return getToken(DorisParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(DorisParser.NAMES, 0); }
		public TerminalNode NEGATIVE() { return getToken(DorisParser.NEGATIVE, 0); }
		public TerminalNode NEVER() { return getToken(DorisParser.NEVER, 0); }
		public TerminalNode NEXT() { return getToken(DorisParser.NEXT, 0); }
		public TerminalNode NGRAM_BF() { return getToken(DorisParser.NGRAM_BF, 0); }
		public TerminalNode NO() { return getToken(DorisParser.NO, 0); }
		public TerminalNode NON_NULLABLE() { return getToken(DorisParser.NON_NULLABLE, 0); }
		public TerminalNode NULLS() { return getToken(DorisParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(DorisParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(DorisParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(DorisParser.ONLY, 0); }
		public TerminalNode OPEN() { return getToken(DorisParser.OPEN, 0); }
		public TerminalNode OPTIMIZED() { return getToken(DorisParser.OPTIMIZED, 0); }
		public TerminalNode PARAMETER() { return getToken(DorisParser.PARAMETER, 0); }
		public TerminalNode PARSED() { return getToken(DorisParser.PARSED, 0); }
		public TerminalNode PASSWORD() { return getToken(DorisParser.PASSWORD, 0); }
		public TerminalNode PASSWORD_EXPIRE() { return getToken(DorisParser.PASSWORD_EXPIRE, 0); }
		public TerminalNode PASSWORD_HISTORY() { return getToken(DorisParser.PASSWORD_HISTORY, 0); }
		public TerminalNode PASSWORD_LOCK_TIME() { return getToken(DorisParser.PASSWORD_LOCK_TIME, 0); }
		public TerminalNode PASSWORD_REUSE() { return getToken(DorisParser.PASSWORD_REUSE, 0); }
		public TerminalNode PARTITIONS() { return getToken(DorisParser.PARTITIONS, 0); }
		public TerminalNode PATH() { return getToken(DorisParser.PATH, 0); }
		public TerminalNode PAUSE() { return getToken(DorisParser.PAUSE, 0); }
		public TerminalNode PERCENT() { return getToken(DorisParser.PERCENT, 0); }
		public TerminalNode PERIOD() { return getToken(DorisParser.PERIOD, 0); }
		public TerminalNode PERMISSIVE() { return getToken(DorisParser.PERMISSIVE, 0); }
		public TerminalNode PHYSICAL() { return getToken(DorisParser.PHYSICAL, 0); }
		public TerminalNode PLAN() { return getToken(DorisParser.PLAN, 0); }
		public TerminalNode PLUGIN() { return getToken(DorisParser.PLUGIN, 0); }
		public TerminalNode PLUGINS() { return getToken(DorisParser.PLUGINS, 0); }
		public TerminalNode POLICY() { return getToken(DorisParser.POLICY, 0); }
		public TerminalNode PROC() { return getToken(DorisParser.PROC, 0); }
		public TerminalNode PROCESS() { return getToken(DorisParser.PROCESS, 0); }
		public TerminalNode PROCESSLIST() { return getToken(DorisParser.PROCESSLIST, 0); }
		public TerminalNode PROFILE() { return getToken(DorisParser.PROFILE, 0); }
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public TerminalNode PROPERTY() { return getToken(DorisParser.PROPERTY, 0); }
		public TerminalNode QUANTILE_STATE() { return getToken(DorisParser.QUANTILE_STATE, 0); }
		public TerminalNode QUANTILE_UNION() { return getToken(DorisParser.QUANTILE_UNION, 0); }
		public TerminalNode QUERY() { return getToken(DorisParser.QUERY, 0); }
		public TerminalNode QUOTA() { return getToken(DorisParser.QUOTA, 0); }
		public TerminalNode RANDOM() { return getToken(DorisParser.RANDOM, 0); }
		public TerminalNode RECOVER() { return getToken(DorisParser.RECOVER, 0); }
		public TerminalNode RECYCLE() { return getToken(DorisParser.RECYCLE, 0); }
		public TerminalNode REFRESH() { return getToken(DorisParser.REFRESH, 0); }
		public TerminalNode REPEATABLE() { return getToken(DorisParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(DorisParser.REPLACE, 0); }
		public TerminalNode REPLACE_IF_NOT_NULL() { return getToken(DorisParser.REPLACE_IF_NOT_NULL, 0); }
		public TerminalNode REPOSITORIES() { return getToken(DorisParser.REPOSITORIES, 0); }
		public TerminalNode REPOSITORY() { return getToken(DorisParser.REPOSITORY, 0); }
		public TerminalNode RESOURCE() { return getToken(DorisParser.RESOURCE, 0); }
		public TerminalNode RESOURCES() { return getToken(DorisParser.RESOURCES, 0); }
		public TerminalNode RESTORE() { return getToken(DorisParser.RESTORE, 0); }
		public TerminalNode RESTRICTIVE() { return getToken(DorisParser.RESTRICTIVE, 0); }
		public TerminalNode RESUME() { return getToken(DorisParser.RESUME, 0); }
		public TerminalNode RETURNS() { return getToken(DorisParser.RETURNS, 0); }
		public TerminalNode REWRITTEN() { return getToken(DorisParser.REWRITTEN, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DorisParser.RIGHT_BRACE, 0); }
		public TerminalNode RLIKE() { return getToken(DorisParser.RLIKE, 0); }
		public TerminalNode ROLLBACK() { return getToken(DorisParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(DorisParser.ROLLUP, 0); }
		public TerminalNode ROUTINE() { return getToken(DorisParser.ROUTINE, 0); }
		public TerminalNode S3() { return getToken(DorisParser.S3, 0); }
		public TerminalNode SAMPLE() { return getToken(DorisParser.SAMPLE, 0); }
		public TerminalNode SCHEDULE() { return getToken(DorisParser.SCHEDULE, 0); }
		public TerminalNode SCHEDULER() { return getToken(DorisParser.SCHEDULER, 0); }
		public TerminalNode SCHEMA() { return getToken(DorisParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(DorisParser.SECOND, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(DorisParser.SERIALIZABLE, 0); }
		public TerminalNode SEQUENCE() { return getToken(DorisParser.SEQUENCE, 0); }
		public TerminalNode SESSION() { return getToken(DorisParser.SESSION, 0); }
		public TerminalNode SHAPE() { return getToken(DorisParser.SHAPE, 0); }
		public TerminalNode SKEW() { return getToken(DorisParser.SKEW, 0); }
		public TerminalNode SNAPSHOT() { return getToken(DorisParser.SNAPSHOT, 0); }
		public TerminalNode SONAME() { return getToken(DorisParser.SONAME, 0); }
		public TerminalNode SPLIT() { return getToken(DorisParser.SPLIT, 0); }
		public TerminalNode START() { return getToken(DorisParser.START, 0); }
		public TerminalNode STARTS() { return getToken(DorisParser.STARTS, 0); }
		public TerminalNode STATS() { return getToken(DorisParser.STATS, 0); }
		public TerminalNode STATUS() { return getToken(DorisParser.STATUS, 0); }
		public TerminalNode STOP() { return getToken(DorisParser.STOP, 0); }
		public TerminalNode STORAGE() { return getToken(DorisParser.STORAGE, 0); }
		public TerminalNode STREAM() { return getToken(DorisParser.STREAM, 0); }
		public TerminalNode STREAMING() { return getToken(DorisParser.STREAMING, 0); }
		public TerminalNode STRING() { return getToken(DorisParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(DorisParser.STRUCT, 0); }
		public TerminalNode SUBDATE() { return getToken(DorisParser.SUBDATE, 0); }
		public TerminalNode SUM() { return getToken(DorisParser.SUM, 0); }
		public TerminalNode TABLES() { return getToken(DorisParser.TABLES, 0); }
		public TerminalNode TASK() { return getToken(DorisParser.TASK, 0); }
		public TerminalNode TASKS() { return getToken(DorisParser.TASKS, 0); }
		public TerminalNode TEMPORARY() { return getToken(DorisParser.TEMPORARY, 0); }
		public TerminalNode TEXT() { return getToken(DorisParser.TEXT, 0); }
		public TerminalNode THAN() { return getToken(DorisParser.THAN, 0); }
		public TerminalNode TIME() { return getToken(DorisParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DorisParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(DorisParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(DorisParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TRANSACTION() { return getToken(DorisParser.TRANSACTION, 0); }
		public TerminalNode TREE() { return getToken(DorisParser.TREE, 0); }
		public TerminalNode TRIGGERS() { return getToken(DorisParser.TRIGGERS, 0); }
		public TerminalNode TRUNCATE() { return getToken(DorisParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(DorisParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(DorisParser.TYPES, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(DorisParser.UNCOMMITTED, 0); }
		public TerminalNode UNLOCK() { return getToken(DorisParser.UNLOCK, 0); }
		public TerminalNode USER() { return getToken(DorisParser.USER, 0); }
		public TerminalNode VALUE() { return getToken(DorisParser.VALUE, 0); }
		public TerminalNode VARCHAR() { return getToken(DorisParser.VARCHAR, 0); }
		public TerminalNode VARIABLES() { return getToken(DorisParser.VARIABLES, 0); }
		public TerminalNode VARIANT() { return getToken(DorisParser.VARIANT, 0); }
		public TerminalNode VERBOSE() { return getToken(DorisParser.VERBOSE, 0); }
		public TerminalNode VERSION() { return getToken(DorisParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode WARNINGS() { return getToken(DorisParser.WARNINGS, 0); }
		public TerminalNode WEEK() { return getToken(DorisParser.WEEK, 0); }
		public TerminalNode WORK() { return getToken(DorisParser.WORK, 0); }
		public TerminalNode YEAR() { return getToken(DorisParser.YEAR, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << ARRAY_RANGE) | (1L << AT) | (1L << AUTHORS) | (1L << AUTO_INCREMENT) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BELONG) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << BULK) | (1L << CACHED) | (1L << CALL) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOGS - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARSET - 64)) | (1L << (CHECK - 64)) | (1L << (CLUSTER - 64)) | (1L << (CLUSTERS - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMNS - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPACT - 64)) | (1L << (COMPLETE - 64)) | (1L << (CONFIG - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_ID - 64)) | (1L << (CONSISTENT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (COUNT - 64)) | (1L << (CREATION - 64)) | (1L << (CRON - 64)) | (1L << (CURRENT_CATALOG - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (CURRENT_USER - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_ADD - 64)) | (1L << (DATE_CEIL - 64)) | (1L << (DATE_DIFF - 64)) | (1L << (DATE_FLOOR - 64)) | (1L << (DATE_SUB - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DATETIME - 64)) | (1L << (DATETIMEV2 - 64)) | (1L << (DATEV2 - 64)) | (1L << (DATETIMEV1 - 64)) | (1L << (DATEV1 - 64)) | (1L << (DAY - 64)) | (1L << (DAYS_ADD - 64)) | (1L << (DAYS_SUB - 64)) | (1L << (DECIMAL - 64)) | (1L << (DECIMALV2 - 64)) | (1L << (DECIMALV3 - 64)) | (1L << (DEFERRED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DEMAND - 128)) | (1L << (DIAGNOSE - 128)) | (1L << (DISTINCTPC - 128)) | (1L << (DISTINCTPCSA - 128)) | (1L << (DO - 128)) | (1L << (DORIS_INTERNAL_TABLE_ID - 128)) | (1L << (DUAL - 128)) | (1L << (DYNAMIC - 128)) | (1L << (ENABLE - 128)) | (1L << (ENCRYPTKEY - 128)) | (1L << (ENCRYPTKEYS - 128)) | (1L << (END - 128)) | (1L << (ENDS - 128)) | (1L << (ENGINE - 128)) | (1L << (ENGINES - 128)) | (1L << (ERRORS - 128)) | (1L << (EVENTS - 128)) | (1L << (EVERY - 128)) | (1L << (EXCLUDE - 128)) | (1L << (EXPIRED - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FAILED_LOGIN_ATTEMPTS - 128)) | (1L << (FAST - 128)) | (1L << (FEATURE - 128)) | (1L << (FIELDS - 128)) | (1L << (FILE - 128)) | (1L << (FILTER - 128)) | (1L << (FIRST - 128)) | (1L << (FORMAT - 128)) | (1L << (FREE - 128)) | (1L << (FRONTENDS - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GLOBAL - 192)) | (1L << (GRAPH - 192)) | (1L << (GROUPING - 192)) | (1L << (GROUPS - 192)) | (1L << (HASH - 192)) | (1L << (HDFS - 192)) | (1L << (HELP - 192)) | (1L << (HISTOGRAM - 192)) | (1L << (HLL_UNION - 192)) | (1L << (HOSTNAME - 192)) | (1L << (HOUR - 192)) | (1L << (HUB - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCREMENTAL - 192)) | (1L << (INDEXES - 192)) | (1L << (INVERTED - 192)) | (1L << (IPV4 - 192)) | (1L << (IPV6 - 192)) | (1L << (IS_NOT_NULL_PRED - 192)) | (1L << (IS_NULL_PRED - 192)) | (1L << (ISNULL - 192)) | (1L << (ISOLATION - 192)) | (1L << (JOB - 192)) | (1L << (JOBS - 192)) | (1L << (JSON - 192)) | (1L << (JSONB - 192)) | (1L << (LABEL - 192)) | (1L << (LAST - 192)) | (1L << (LDAP - 192)) | (1L << (LDAP_ADMIN_PASSWORD - 192)) | (1L << (LESS - 192)) | (1L << (LEVEL - 192)) | (1L << (LINES - 192)) | (1L << (LINK - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (LOCAL - 258)) | (1L << (LOCALTIME - 258)) | (1L << (LOCALTIMESTAMP - 258)) | (1L << (LOCATION - 258)) | (1L << (LOCK - 258)) | (1L << (LOGICAL - 258)) | (1L << (MANUAL - 258)) | (1L << (MAP - 258)) | (1L << (MATCH_ALL - 258)) | (1L << (MATCH_ANY - 258)) | (1L << (MATCH_ELEMENT_EQ - 258)) | (1L << (MATCH_ELEMENT_GE - 258)) | (1L << (MATCH_ELEMENT_GT - 258)) | (1L << (MATCH_ELEMENT_LE - 258)) | (1L << (MATCH_ELEMENT_LT - 258)) | (1L << (MATCH_PHRASE - 258)) | (1L << (MATCH_PHRASE_EDGE - 258)) | (1L << (MATCH_PHRASE_PREFIX - 258)) | (1L << (MATCH_REGEXP - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MAX - 258)) | (1L << (MEMO - 258)) | (1L << (MERGE - 258)) | (1L << (MIGRATE - 258)) | (1L << (MIGRATIONS - 258)) | (1L << (MIN - 258)) | (1L << (MINUTE - 258)) | (1L << (MODIFY - 258)) | (1L << (MONTH - 258)) | (1L << (MTMV - 258)) | (1L << (NAME - 258)) | (1L << (NAMES - 258)) | (1L << (NEGATIVE - 258)) | (1L << (NEVER - 258)) | (1L << (NEXT - 258)) | (1L << (NGRAM_BF - 258)) | (1L << (NO - 258)) | (1L << (NON_NULLABLE - 258)) | (1L << (NULLS - 258)) | (1L << (OF - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLY - 258)) | (1L << (OPEN - 258)) | (1L << (OPTIMIZED - 258)) | (1L << (PARAMETER - 258)) | (1L << (PARSED - 258)) | (1L << (PARTITIONS - 258)) | (1L << (PASSWORD - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PASSWORD_EXPIRE - 322)) | (1L << (PASSWORD_HISTORY - 322)) | (1L << (PASSWORD_LOCK_TIME - 322)) | (1L << (PASSWORD_REUSE - 322)) | (1L << (PATH - 322)) | (1L << (PAUSE - 322)) | (1L << (PERCENT - 322)) | (1L << (PERIOD - 322)) | (1L << (PERMISSIVE - 322)) | (1L << (PHYSICAL - 322)) | (1L << (PLAN - 322)) | (1L << (PROCESS - 322)) | (1L << (PLUGIN - 322)) | (1L << (PLUGINS - 322)) | (1L << (POLICY - 322)) | (1L << (PROC - 322)) | (1L << (PROCESSLIST - 322)) | (1L << (PROFILE - 322)) | (1L << (PROPERTIES - 322)) | (1L << (PROPERTY - 322)) | (1L << (QUANTILE_STATE - 322)) | (1L << (QUANTILE_UNION - 322)) | (1L << (QUERY - 322)) | (1L << (QUOTA - 322)) | (1L << (RANDOM - 322)) | (1L << (RECOVER - 322)) | (1L << (RECYCLE - 322)) | (1L << (REFRESH - 322)) | (1L << (REPEATABLE - 322)) | (1L << (REPLACE - 322)) | (1L << (REPLACE_IF_NOT_NULL - 322)) | (1L << (REPOSITORIES - 322)) | (1L << (REPOSITORY - 322)) | (1L << (RESOURCE - 322)) | (1L << (RESOURCES - 322)) | (1L << (RESTORE - 322)) | (1L << (RESTRICTIVE - 322)) | (1L << (RESUME - 322)) | (1L << (RETURNS - 322)) | (1L << (REWRITTEN - 322)) | (1L << (RLIKE - 322)) | (1L << (ROLLBACK - 322)) | (1L << (ROLLUP - 322)) | (1L << (ROUTINE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (S3 - 386)) | (1L << (SAMPLE - 386)) | (1L << (SCHEDULE - 386)) | (1L << (SCHEDULER - 386)) | (1L << (SCHEMA - 386)) | (1L << (SECOND - 386)) | (1L << (SEQUENCE - 386)) | (1L << (SERIALIZABLE - 386)) | (1L << (SESSION - 386)) | (1L << (SHAPE - 386)) | (1L << (SKEW - 386)) | (1L << (SNAPSHOT - 386)) | (1L << (SONAME - 386)) | (1L << (SPLIT - 386)) | (1L << (START - 386)) | (1L << (STARTS - 386)) | (1L << (STATS - 386)) | (1L << (STATUS - 386)) | (1L << (STOP - 386)) | (1L << (STORAGE - 386)) | (1L << (STREAM - 386)) | (1L << (STREAMING - 386)) | (1L << (STRING - 386)) | (1L << (STRUCT - 386)) | (1L << (SUBDATE - 386)) | (1L << (SUM - 386)) | (1L << (TABLES - 386)) | (1L << (TASK - 386)) | (1L << (TASKS - 386)) | (1L << (TEMPORARY - 386)) | (1L << (TEXT - 386)) | (1L << (THAN - 386)) | (1L << (TIME - 386)) | (1L << (TIMESTAMP - 386)) | (1L << (TIMESTAMPADD - 386)) | (1L << (TIMESTAMPDIFF - 386)) | (1L << (TRANSACTION - 386)) | (1L << (TREE - 386)) | (1L << (TRIGGERS - 386)) | (1L << (TRUNCATE - 386)))) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (TYPE - 450)) | (1L << (TYPES - 450)) | (1L << (UNCOMMITTED - 450)) | (1L << (UNLOCK - 450)) | (1L << (USER - 450)) | (1L << (VALUE - 450)) | (1L << (VARCHAR - 450)) | (1L << (VARIABLES - 450)) | (1L << (VARIANT - 450)) | (1L << (VERBOSE - 450)) | (1L << (VERSION - 450)) | (1L << (VIEW - 450)) | (1L << (WARNINGS - 450)) | (1L << (WEEK - 450)) | (1L << (WORK - 450)) | (1L << (YEAR - 450)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 39:
			return querySpecification_sempred((QuerySpecificationContext)_localctx, predIndex);
		case 107:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 111:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 113:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean querySpecification_sempred(QuerySpecificationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return doris_legacy_SQL_syntax;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u020d\u0af2\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\3\2\3\2\7\2\u0125"+
		"\n\2\f\2\16\2\u0128\13\2\6\2\u012a\n\2\r\2\16\2\u012b\3\2\3\2\3\3\3\3"+
		"\7\3\u0132\n\3\f\3\16\3\u0135\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\u0140\n\4\f\4\16\4\u0143\13\4\5\4\u0145\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u014d\n\4\3\4\5\4\u0150\n\4\3\4\3\4\3\4\3\4\7\4\u0156\n\4\f\4\16"+
		"\4\u0159\13\4\3\4\3\4\7\4\u015d\n\4\f\4\16\4\u0160\13\4\3\4\3\4\3\4\3"+
		"\4\5\4\u0166\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u016f\n\4\3\4\3\4\3\4"+
		"\3\4\5\4\u0175\n\4\3\5\5\5\u0178\n\5\3\5\3\5\5\5\u017c\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u0184\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u018f"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0198\n\5\3\5\3\5\3\5\3\5\5\5\u019e"+
		"\n\5\3\5\3\5\5\5\u01a2\n\5\3\5\3\5\3\5\3\5\5\5\u01a8\n\5\3\5\5\5\u01ab"+
		"\n\5\3\5\3\5\5\5\u01af\n\5\3\5\3\5\3\5\5\5\u01b4\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u01bc\n\5\5\5\u01be\n\5\3\5\3\5\5\5\u01c2\n\5\3\5\5\5\u01c5"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u01cc\n\5\3\5\3\5\3\5\5\5\u01d1\n\5\5\5\u01d3"+
		"\n\5\5\5\u01d5\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u01dc\n\5\3\5\5\5\u01df\n\5"+
		"\3\5\3\5\5\5\u01e3\n\5\3\5\3\5\5\5\u01e7\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u01ee"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u01f5\n\5\3\5\3\5\5\5\u01f9\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0205\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u020c"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u0212\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u021a\n"+
		"\5\5\5\u021c\n\5\3\5\5\5\u021f\n\5\3\5\3\5\3\5\3\5\5\5\u0225\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u022c\n\5\3\5\5\5\u022f\n\5\3\5\3\5\3\5\5\5\u0234\n"+
		"\5\3\5\5\5\u0237\n\5\3\5\3\5\3\5\3\5\5\5\u023d\n\5\3\5\3\5\5\5\u0241\n"+
		"\5\3\5\5\5\u0244\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u024c\n\5\3\5\5\5\u024f"+
		"\n\5\3\5\5\5\u0252\n\5\3\5\5\5\u0255\n\5\3\5\3\5\3\5\3\5\5\5\u025b\n\5"+
		"\3\5\3\5\3\5\5\5\u0260\n\5\3\5\5\5\u0263\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u026c\n\5\f\5\16\5\u026f\13\5\3\5\3\5\5\5\u0273\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u027a\n\5\3\5\5\5\u027d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0286\n\5\3\5\5\5\u0289\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0290\n\5\3\5\5"+
		"\5\u0293\n\5\3\5\3\5\3\5\5\5\u0298\n\5\3\5\5\5\u029b\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u02a3\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u02aa\n\5\3\5\5\5\u02ad"+
		"\n\5\3\5\3\5\5\5\u02b1\n\5\3\5\5\5\u02b4\n\5\5\5\u02b6\n\5\3\5\5\5\u02b9"+
		"\n\5\3\5\3\5\5\5\u02bd\n\5\3\5\3\5\5\5\u02c1\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u02c9\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u02d0\n\5\3\5\3\5\5\5\u02d4\n"+
		"\5\5\5\u02d6\n\5\3\5\5\5\u02d9\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u02e5\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u02f3\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u02fa\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0301"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u032b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0338\n\6\3\6\3\6\3\6\5\6\u033d\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0343\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u034b\n\6\3\6\3\6\5\6\u034f\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0357\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0364\n\6\3\6\3\6\3\6\3\6\5\6\u036a\n\6\3\6\3\6\3\6"+
		"\5\6\u036f\n\6\3\6\3\6\3\6\3\6\5\6\u0375\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u037d\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0387\n\6\3\6\3\6\3\6"+
		"\3\6\5\6\u038d\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0394\n\6\3\6\5\6\u0397\n\6"+
		"\3\6\3\6\5\6\u039b\n\6\3\7\3\7\3\7\5\7\u03a0\n\7\5\7\u03a2\n\7\3\7\3\7"+
		"\3\7\3\7\5\7\u03a8\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u03af\n\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03bd\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u03cb\n\n\3\13\5\13\u03ce\n\13\3\13\3\13"+
		"\3\13\5\13\u03d3\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u03db\n\13\3"+
		"\f\5\f\u03de\n\f\3\f\3\f\3\f\5\f\u03e3\n\f\3\f\3\f\3\f\5\f\u03e8\n\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\7\r\u03f0\n\r\f\r\16\r\u03f3\13\r\3\r\3\r\3\16"+
		"\3\16\5\16\u03f9\n\16\3\17\5\17\u03fc\n\17\3\17\5\17\u03ff\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0407\n\17\f\17\16\17\u040a\13\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0412\n\17\3\17\3\17\3\17\3\17\5\17\u0418"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u041e\n\17\3\17\3\17\3\17\5\17\u0423\n"+
		"\17\3\17\5\17\u0426\n\17\3\17\5\17\u0429\n\17\3\17\5\17\u042c\n\17\3\17"+
		"\5\17\u042f\n\17\3\17\5\17\u0432\n\17\3\17\5\17\u0435\n\17\3\17\5\17\u0438"+
		"\n\17\3\17\5\17\u043b\n\17\3\17\5\17\u043e\n\17\3\17\5\17\u0441\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u044c\n\17\3\17\5\17"+
		"\u044f\n\17\3\17\5\17\u0452\n\17\3\17\5\17\u0455\n\17\3\17\5\17\u0458"+
		"\n\17\5\17\u045a\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0464"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u046b\n\22\3\23\3\23\3\24\3\24\5\24"+
		"\u0471\n\24\3\25\3\25\3\25\5\25\u0476\n\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u047f\n\26\5\26\u0481\n\26\3\27\3\27\5\27\u0485\n\27\3\27"+
		"\3\27\5\27\u0489\n\27\3\27\5\27\u048c\n\27\3\27\5\27\u048f\n\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\7\36\u04ac"+
		"\n\36\f\36\16\36\u04af\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u04d1\n \5 \u04d3\n \3!\3!\3!\3!\3!\3!\3!\5!\u04dc\n!\3\"\3\"\3\"\5"+
		"\"\u04e1\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u04ea\n\"\3\"\3\"\3\"\3\""+
		"\5\"\u04f0\n\"\3\"\3\"\3\"\3\"\5\"\u04f6\n\"\3\"\5\"\u04f9\n\"\3\"\5\""+
		"\u04fc\n\"\3\"\5\"\u04ff\n\"\3\"\5\"\u0502\n\"\3#\3#\3#\3#\3#\3#\5#\u050a"+
		"\n#\3$\3$\3$\3$\3$\3$\5$\u0512\n$\3$\5$\u0515\n$\3%\5%\u0518\n%\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\5&\u0523\n&\3&\7&\u0526\n&\f&\16&\u0529\13&\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\5(\u0533\n(\3)\3)\5)\u0537\n)\3)\5)\u053a\n)\3"+
		")\5)\u053d\n)\3)\5)\u0540\n)\3)\5)\u0543\n)\3)\3)\3)\3*\3*\3*\3*\7*\u054c"+
		"\n*\f*\16*\u054f\13*\3+\3+\5+\u0553\n+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u055e"+
		"\n,\f,\16,\u0561\13,\3,\3,\3-\3-\5-\u0567\n-\3-\5-\u056a\n-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u0575\n.\3/\3/\3/\3\60\3\60\3\60\3\61\5\61\u057e\n"+
		"\61\3\61\3\61\3\61\5\61\u0583\n\61\3\61\3\61\3\61\5\61\u0588\n\61\7\61"+
		"\u058a\n\61\f\61\16\61\u058d\13\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\7\64\u059a\n\64\f\64\16\64\u059d\13\64\3\65\3\65"+
		"\7\65\u05a1\n\65\f\65\16\65\u05a4\13\65\3\66\3\66\3\66\5\66\u05a9\n\66"+
		"\3\66\3\66\5\66\u05ad\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u05b7\n\67\38\38\38\38\78\u05bd\n8\f8\168\u05c0\138\38\38\38\38\38\3"+
		"8\78\u05c8\n8\f8\168\u05cb\138\38\38\58\u05cf\n8\39\39\39\39\3:\3:\3:"+
		"\3:\3:\7:\u05da\n:\f:\16:\u05dd\13:\5:\u05df\n:\3:\3:\3:\3:\3:\3:\7:\u05e7"+
		"\n:\f:\16:\u05ea\13:\5:\u05ec\n:\3:\3:\3:\3:\3:\3:\3:\7:\u05f5\n:\f:\16"+
		":\u05f8\13:\3:\3:\3:\3:\3:\7:\u05ff\n:\f:\16:\u0602\13:\5:\u0604\n:\3"+
		";\3;\3;\3;\7;\u060a\n;\f;\16;\u060d\13;\5;\u060f\n;\3;\3;\3<\3<\3<\3="+
		"\3=\3=\5=\u0619\n=\3=\7=\u061c\n=\f=\16=\u061f\13=\3=\3=\3>\3>\3>\3>\5"+
		">\u0627\n>\3>\7>\u062a\n>\f>\16>\u062d\13>\3>\3>\5>\u0631\n>\3?\3?\3?"+
		"\3?\5?\u0637\n?\5?\u0639\n?\3@\3@\3@\3@\5@\u063f\n@\3A\3A\3A\7A\u0644"+
		"\nA\fA\16A\u0647\13A\3B\3B\3B\3B\3B\3B\3B\7B\u0650\nB\fB\16B\u0653\13"+
		"B\5B\u0655\nB\3B\3B\3B\3B\3B\3B\7B\u065d\nB\fB\16B\u0660\13B\3C\5C\u0663"+
		"\nC\3C\5C\u0666\nC\3D\3D\3D\3D\3D\7D\u066d\nD\fD\16D\u0670\13D\3E\3E\5"+
		"E\u0674\nE\3E\3E\5E\u0678\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0684\n"+
		"F\3G\3G\3G\3G\3G\7G\u068b\nG\fG\16G\u068e\13G\3H\5H\u0691\nH\3H\3H\3H"+
		"\5H\u0696\nH\3H\3H\5H\u069a\nH\3H\3H\5H\u069e\nH\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u06a8\nH\3I\3I\3I\3I\5I\u06ae\nI\3J\3J\3J\3J\3K\3K\3K\7K\u06b7"+
		"\nK\fK\16K\u06ba\13K\3L\3L\3L\3L\5L\u06c0\nL\3L\3L\3M\3M\5M\u06c6\nM\3"+
		"M\5M\u06c9\nM\3M\5M\u06cc\nM\3M\5M\u06cf\nM\3M\3M\5M\u06d3\nM\3M\5M\u06d6"+
		"\nM\3M\7M\u06d9\nM\fM\16M\u06dc\13M\3M\3M\3M\3M\3M\7M\u06e3\nM\fM\16M"+
		"\u06e6\13M\3M\3M\3M\5M\u06eb\nM\3M\3M\3M\3M\3M\3M\3M\5M\u06f4\nM\3N\3"+
		"N\3N\3O\3O\3O\3O\3O\3P\3P\3P\7P\u0701\nP\fP\16P\u0704\13P\3Q\3Q\3Q\3Q"+
		"\3R\3R\5R\u070c\nR\3S\3S\5S\u0710\nS\3T\5T\u0713\nT\3T\3T\5T\u0717\nT"+
		"\5T\u0719\nT\3U\3U\3U\7U\u071e\nU\fU\16U\u0721\13U\3V\3V\3V\7V\u0726\n"+
		"V\fV\16V\u0729\13V\3W\3W\3W\5W\u072e\nW\3X\3X\3X\7X\u0733\nX\fX\16X\u0736"+
		"\13X\3Y\3Y\3Y\5Y\u073b\nY\3Y\5Y\u073e\nY\3Y\5Y\u0741\nY\3Y\5Y\u0744\n"+
		"Y\3Y\3Y\3Y\3Y\3Y\5Y\u074b\nY\5Y\u074d\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\5Y\u0759\nY\5Y\u075b\nY\5Y\u075d\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0766\n"+
		"Y\5Y\u0768\nY\3Y\3Y\5Y\u076c\nY\3Z\3Z\3Z\7Z\u0771\nZ\fZ\16Z\u0774\13Z"+
		"\3[\3[\3[\3[\3[\5[\u077b\n[\3[\3[\3[\3[\3[\5[\u0782\n[\3[\3[\5[\u0786"+
		"\n[\3\\\3\\\3\\\7\\\u078b\n\\\f\\\16\\\u078e\13\\\3]\3]\3]\3]\5]\u0794"+
		"\n]\3]\3]\3]\3]\5]\u079a\n]\3^\3^\3^\3^\5^\u07a0\n^\3^\3^\3^\3^\3^\3^"+
		"\5^\u07a8\n^\3_\3_\3_\3_\5_\u07ae\n_\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`"+
		"\3`\3`\3`\3`\5`\u07bf\n`\3a\3a\3a\3a\5a\u07c5\na\3a\3a\3a\3a\3a\3a\3a"+
		"\7a\u07ce\na\fa\16a\u07d1\13a\3a\3a\3a\5a\u07d6\na\5a\u07d8\na\3b\3b\3"+
		"b\3b\7b\u07de\nb\fb\16b\u07e1\13b\3b\3b\3c\3c\3d\3d\3d\7d\u07ea\nd\fd"+
		"\16d\u07ed\13d\3e\3e\3e\3e\3e\5e\u07f4\ne\3e\5e\u07f7\ne\3f\3f\3g\3g\3"+
		"g\3g\3g\7g\u0800\ng\fg\16g\u0803\13g\3g\3g\3h\3h\3h\3h\7h\u080b\nh\fh"+
		"\16h\u080e\13h\3i\3i\5i\u0812\ni\3i\5i\u0815\ni\3j\3j\3j\7j\u081a\nj\f"+
		"j\16j\u081d\13j\3k\3k\5k\u0821\nk\3l\3l\3l\3l\3l\3l\3l\3l\6l\u082b\nl"+
		"\rl\16l\u082c\3l\3l\3l\3l\5l\u0833\nl\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0849\nm\5m\u084b\nm\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\3m\7m\u0856\nm\fm\16m\u0859\13m\3n\3n\3n\3n\7n\u085f\nn\fn\16"+
		"n\u0862\13n\5n\u0864\nn\3n\3n\3o\3o\5o\u086a\no\3p\5p\u086d\np\3p\3p\3"+
		"p\3p\3p\3p\5p\u0875\np\3p\3p\3p\5p\u087a\np\3p\3p\3p\5p\u087f\np\3p\3"+
		"p\3p\3p\3p\3p\5p\u0887\np\3p\3p\3p\3p\3p\7p\u088e\np\fp\16p\u0891\13p"+
		"\3p\3p\3p\3p\5p\u0897\np\3p\5p\u089a\np\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\5q\u08a7\nq\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\7q\u08b3\nq\fq\16q\u08b6"+
		"\13q\3r\3r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u08d6\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\5s\u08e3\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u08f0\ns\3s\3s\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\5s\u08fd\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\5s\u090c\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\6s\u0918\ns\rs\16s\u0919"+
		"\3s\3s\5s\u091e\ns\3s\3s\3s\3s\3s\6s\u0925\ns\rs\16s\u0926\3s\3s\5s\u092b"+
		"\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\7s"+
		"\u0942\ns\fs\16s\u0945\13s\3s\3s\5s\u0949\ns\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0965\ns\3s\3"+
		"s\5s\u0969\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0974\ns\3s\3s\3s\3s\3s\3"+
		"s\5s\u097c\ns\3s\3s\3s\5s\u0981\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u098d"+
		"\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0999\ns\7s\u099b\ns\fs\16s\u099e"+
		"\13s\3t\3t\3t\5t\u09a3\nt\3t\3t\3t\7t\u09a8\nt\ft\16t\u09ab\13t\3t\3t"+
		"\3t\3t\3t\7t\u09b2\nt\ft\16t\u09b5\13t\5t\u09b7\nt\5t\u09b9\nt\3t\3t\3"+
		"t\5t\u09be\nt\3u\3u\3u\5u\u09c3\nu\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\5v\u09d6\nv\3w\3w\5w\u09da\nw\3w\5w\u09dd\nw\3w\5w\u09e0"+
		"\nw\3w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u09ed\nx\3y\3y\3z\3z\3z\3z\3z"+
		"\3z\3z\5z\u09f8\nz\3{\3{\3{\7{\u09fd\n{\f{\16{\u0a00\13{\3|\5|\u0a03\n"+
		"|\3|\3|\3|\5|\u0a08\n|\3|\5|\u0a0b\n|\3|\3|\5|\u0a0f\n|\3}\3}\3}\3}\3"+
		"}\3}\5}\u0a17\n}\3}\3}\3}\5}\u0a1c\n}\3}\3}\7}\u0a20\n}\f}\16}\u0a23\13"+
		"}\3}\3}\3}\3}\3}\3}\5}\u0a2b\n}\3}\3}\3}\3}\3}\7}\u0a32\n}\f}\16}\u0a35"+
		"\13}\3}\3}\3}\3}\3}\7}\u0a3c\n}\f}\16}\u0a3f\13}\3}\3}\5}\u0a43\n}\3~"+
		"\3~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u0a56\n\u0083"+
		"\3\u0083\5\u0083\u0a59\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\7\u0084\u0a73\n\u0084\f\u0084\16\u0084\u0a76\13\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0a80"+
		"\n\u0084\f\u0084\16\u0084\u0a83\13\u0084\3\u0084\5\u0084\u0a86\n\u0084"+
		"\5\u0084\u0a88\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0a8e\n"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0aae\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\7\u0086\u0ab3\n\u0086\f\u0086\16\u0086\u0ab6\13\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u0abc\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u0ac4\n\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0ac9\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0acf\n"+
		"\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\6\u008c\u0ad6\n\u008c\r"+
		"\u008c\16\u008c\u0ad7\3\u008c\5\u008c\u0adb\n\u008c\3\u008d\3\u008d\3"+
		"\u008e\3\u008e\3\u008e\5\u008e\u0ae2\n\u008e\3\u008f\3\u008f\3\u0090\5"+
		"\u0090\u0ae7\n\u0090\3\u0090\3\u0090\5\u0090\u0aeb\n\u0090\3\u0090\5\u0090"+
		"\u0aee\n\u0090\3\u0091\3\u0091\3\u0091\4\u0157\u015e\6J\u00d8\u00e0\u00e4"+
		"\u0092\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\2\61\3\2\u0156\u0157\4\2\u014c\u014c\u0176\u0176\5"+
		"\2\23\23\u0093\u0093\u01cb\u01cb\4\2\"\"\u0202\u0202\5\2\u00c2\u00c2\u0104"+
		"\u0104\u018f\u018f\4\2\u0136\u0136\u01e2\u01e2\3\2\u0141\u0142\4\2\u0102"+
		"\u0102\u0161\u0161\4\2\u0080\u0080\u00d6\u00d6\4\2\"\"SS\6\2\u00c5\u00c5"+
		"\u014e\u014e\u01bf\u01bf\u01d7\u01d7\13\2\25\25\30\30\u0109\u0109\u011c"+
		"\u011c\u0138\u0138\u0140\u0140\u014d\u014d\u017a\u017a\u0192\u0192\5\2"+
		"\33\33\u0081\u0081\u011d\u011d\6\2\u00a1\u00a1\u00e2\u00e2\u0121\u0121"+
		"\u01ca\u01ca\4\2\25\25\u0087\u0087\4\2\37\37\u0083\u0083\4\2\u00b2\u00b2"+
		"\u00f7\u00f7\5\2//\u00e5\u00e5\u012c\u012c\6\2\u011b\u011b\u0130\u0130"+
		"\u01fd\u01fd\u0202\u0202\n\2\60\60\u00c1\u00c1\u00cf\u00cf\u011a\u011a"+
		"\u0120\u0120\u015d\u015d\u016e\u016f\u01a6\u01a6\4\2\u012f\u012f\u01f3"+
		"\u01f3\3\2\u00ea\u00eb\4\2\31\31\u01f2\u01f2\5\2\u00fe\u00fe\u0169\u0169"+
		"\u017c\u017c\4\2\u010d\u010f\u0115\u0118\4\2\u01eb\u01ec\u01f0\u01f0\4"+
		"\2..\61\62\4\2\u008c\u008c\u01ed\u01ef\6\2\u01eb\u01ec\u01f1\u01f1\u01f4"+
		"\u01f4\u01f6\u01f6\t\2xx\u00d1\u00d1\u0122\u0122\u0124\u0124\u018a\u018a"+
		"\u01db\u01db\u01e3\u01e3\4\2rr\u01ba\u01ba\4\2qq\u01b9\u01b9\5\2\17\17"+
		"llyy\5\2ppzz\u01a5\u01a5\4\2\35\35\u018d\u018d\4\2\u00c2\u00c2\u018f\u018f"+
		"\4\2kk\u01b8\u01b8\4\2\u0161\u0161\u0183\u0183\4\2\u00b5\u00b5\u0153\u0153"+
		"\6\2kkuuww\u01b8\u01b8\3\2\u01e4\u01ea\4\2\u00ac\u00ac\u01c2\u01c2\4\2"+
		"\u01ed\u01ed\u0202\u0202\4\2\u0194\u0194\u01cd\u01cd\3\2\u00df\u00e0\3"+
		"\2\u0203\u0204_\2\n\13\17\17\21\24\30\30\34\35 !##%(++.:<=AFHIKLNWY\\"+
		"^_chk}\u0080\u0080\u0082\u0082\u0085\u0085\u0088\u0089\u008d\u008e\u0092"+
		"\u0092\u0094\u0094\u0096\u009c\u009e\u00a0\u00a2\u00a2\u00a5\u00a5\u00a9"+
		"\u00a9\u00ab\u00ab\u00ad\u00b2\u00b9\u00ba\u00bd\u00bd\u00bf\u00bf\u00c1"+
		"\u00c2\u00c5\u00c5\u00c7\u00c9\u00cb\u00cd\u00cf\u00d3\u00d5\u00d6\u00d8"+
		"\u00d8\u00da\u00da\u00e5\u00e7\u00e9\u00ee\u00f0\u00f1\u00f5\u00f5\u00f7"+
		"\u00f7\u00f9\u00fa\u00fc\u00fd\u0100\u0101\u0104\u0109\u010b\u010c\u010e"+
		"\u011a\u011c\u0120\u0122\u0127\u0129\u012e\u0131\u0131\u0133\u0134\u0136"+
		"\u0138\u013f\u0140\u0142\u0152\u0156\u0156\u0158\u0160\u0165\u0167\u016d"+
		"\u016f\u0171\u0178\u017a\u017a\u017c\u017c\u017f\u0181\u0184\u0188\u018a"+
		"\u018a\u018d\u018f\u0192\u0192\u0195\u0195\u0197\u0199\u019b\u01a6\u01ac"+
		"\u01ac\u01b0\u01b2\u01b4\u01b5\u01b7\u01ba\u01bd\u01bd\u01bf\u01c0\u01c3"+
		"\u01c4\u01c6\u01c6\u01c8\u01c8\u01cc\u01cc\u01d0\u01d0\u01d2\u01d2\u01d4"+
		"\u01db\u01e0\u01e0\u01e3\u01e3\2\u0c7a\2\u0129\3\2\2\2\4\u012f\3\2\2\2"+
		"\6\u0174\3\2\2\2\b\u032a\3\2\2\2\n\u039a\3\2\2\2\f\u03ae\3\2\2\2\16\u03b0"+
		"\3\2\2\2\20\u03b3\3\2\2\2\22\u03ca\3\2\2\2\24\u03da\3\2\2\2\26\u03dd\3"+
		"\2\2\2\30\u03eb\3\2\2\2\32\u03f8\3\2\2\2\34\u0459\3\2\2\2\36\u045b\3\2"+
		"\2\2 \u0463\3\2\2\2\"\u0465\3\2\2\2$\u046c\3\2\2\2&\u0470\3\2\2\2(\u0475"+
		"\3\2\2\2*\u0477\3\2\2\2,\u0488\3\2\2\2.\u0490\3\2\2\2\60\u0492\3\2\2\2"+
		"\62\u0494\3\2\2\2\64\u0498\3\2\2\2\66\u049c\3\2\2\28\u04a0\3\2\2\2:\u04a6"+
		"\3\2\2\2<\u04b2\3\2\2\2>\u04d2\3\2\2\2@\u04d4\3\2\2\2B\u04dd\3\2\2\2D"+
		"\u0509\3\2\2\2F\u050b\3\2\2\2H\u0517\3\2\2\2J\u051c\3\2\2\2L\u052a\3\2"+
		"\2\2N\u0532\3\2\2\2P\u0534\3\2\2\2R\u0547\3\2\2\2T\u0550\3\2\2\2V\u0559"+
		"\3\2\2\2X\u0564\3\2\2\2Z\u0574\3\2\2\2\\\u0576\3\2\2\2^\u0579\3\2\2\2"+
		"`\u057d\3\2\2\2b\u058e\3\2\2\2d\u0591\3\2\2\2f\u0596\3\2\2\2h\u059e\3"+
		"\2\2\2j\u05a5\3\2\2\2l\u05b6\3\2\2\2n\u05ce\3\2\2\2p\u05d0\3\2\2\2r\u0603"+
		"\3\2\2\2t\u0605\3\2\2\2v\u0612\3\2\2\2x\u0615\3\2\2\2z\u0622\3\2\2\2|"+
		"\u0632\3\2\2\2~\u063a\3\2\2\2\u0080\u0640\3\2\2\2\u0082\u0648\3\2\2\2"+
		"\u0084\u0662\3\2\2\2\u0086\u0667\3\2\2\2\u0088\u0671\3\2\2\2\u008a\u0683"+
		"\3\2\2\2\u008c\u0685\3\2\2\2\u008e\u06a7\3\2\2\2\u0090\u06ad\3\2\2\2\u0092"+
		"\u06af\3\2\2\2\u0094\u06b3\3\2\2\2\u0096\u06bb\3\2\2\2\u0098\u06f3\3\2"+
		"\2\2\u009a\u06f5\3\2\2\2\u009c\u06f8\3\2\2\2\u009e\u06fd\3\2\2\2\u00a0"+
		"\u0705\3\2\2\2\u00a2\u070b\3\2\2\2\u00a4\u070f\3\2\2\2\u00a6\u0718\3\2"+
		"\2\2\u00a8\u071a\3\2\2\2\u00aa\u0722\3\2\2\2\u00ac\u072a\3\2\2\2\u00ae"+
		"\u072f\3\2\2\2\u00b0\u0737\3\2\2\2\u00b2\u076d\3\2\2\2\u00b4\u0775\3\2"+
		"\2\2\u00b6\u0787\3\2\2\2\u00b8\u0793\3\2\2\2\u00ba\u079b\3\2\2\2\u00bc"+
		"\u07a9\3\2\2\2\u00be\u07b7\3\2\2\2\u00c0\u07c0\3\2\2\2\u00c2\u07d9\3\2"+
		"\2\2\u00c4\u07e4\3\2\2\2\u00c6\u07e6\3\2\2\2\u00c8\u07ee\3\2\2\2\u00ca"+
		"\u07f8\3\2\2\2\u00cc\u07fa\3\2\2\2\u00ce\u0806\3\2\2\2\u00d0\u080f\3\2"+
		"\2\2\u00d2\u0816\3\2\2\2\u00d4\u0820\3\2\2\2\u00d6\u0832\3\2\2\2\u00d8"+
		"\u084a\3\2\2\2\u00da\u085a\3\2\2\2\u00dc\u0869\3\2\2\2\u00de\u0899\3\2"+
		"\2\2\u00e0\u08a6\3\2\2\2\u00e2\u08b7\3\2\2\2\u00e4\u0980\3\2\2\2\u00e6"+
		"\u099f\3\2\2\2\u00e8\u09c2\3\2\2\2\u00ea\u09d5\3\2\2\2\u00ec\u09d7\3\2"+
		"\2\2\u00ee\u09ec\3\2\2\2\u00f0\u09ee\3\2\2\2\u00f2\u09f7\3\2\2\2\u00f4"+
		"\u09f9\3\2\2\2\u00f6\u0a0e\3\2\2\2\u00f8\u0a42\3\2\2\2\u00fa\u0a44\3\2"+
		"\2\2\u00fc\u0a46\3\2\2\2\u00fe\u0a48\3\2\2\2\u0100\u0a4d\3\2\2\2\u0102"+
		"\u0a51\3\2\2\2\u0104\u0a53\3\2\2\2\u0106\u0a87\3\2\2\2\u0108\u0aad\3\2"+
		"\2\2\u010a\u0aaf\3\2\2\2\u010c\u0ab7\3\2\2\2\u010e\u0abd\3\2\2\2\u0110"+
		"\u0ac0\3\2\2\2\u0112\u0ace\3\2\2\2\u0114\u0ad0\3\2\2\2\u0116\u0ada\3\2"+
		"\2\2\u0118\u0adc\3\2\2\2\u011a\u0ae1\3\2\2\2\u011c\u0ae3\3\2\2\2\u011e"+
		"\u0aed\3\2\2\2\u0120\u0aef\3\2\2\2\u0122\u0126\5\6\4\2\u0123\u0125\7\3"+
		"\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u0122\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\7\2\2\3\u012e\3\3\2\2\2\u012f\u0133\5\6\4\2"+
		"\u0130\u0132\7\3\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\7\2\2\3\u0137\5\3\2\2\2\u0138\u0175\5\b\5\2\u0139\u013a\7=\2\2"+
		"\u013a\u013b\5\u00a8U\2\u013b\u0144\7\4\2\2\u013c\u0141\5\u00d4k\2\u013d"+
		"\u013e\7\6\2\2\u013e\u0140\5\u00d4k\2\u013f\u013d\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\7\5\2\2\u0147\u0175\3\2\2\2\u0148\u0150\7\26\2\2\u0149"+
		"\u014c\7]\2\2\u014a\u014b\7\u0139\2\2\u014b\u014d\7\u016e\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u0150\7\u016e\2"+
		"\2\u014f\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0152\t\2\2\2\u0152\u0153\5\u00a8U\2\u0153\u0157\7\4\2"+
		"\2\u0154\u0156\13\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015e\7\5\2\2\u015b\u015d\13\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0175\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\u0090\2\2\u0162\u0165\t\2\2\2\u0163"+
		"\u0164\7\u00d4\2\2\u0164\u0166\7\u00a4\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0175\5\u00a8U\2\u0168\u0169\7\u0193"+
		"\2\2\u0169\u016a\7\u0157\2\2\u016a\u016e\7\u019e\2\2\u016b\u016c\7\u00fe"+
		"\2\2\u016c\u016f\5\u00e0q\2\u016d\u016f\5\\/\2\u016e\u016b\3\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0175\3\2\2\2\u0170\u0171\7\u0193"+
		"\2\2\u0171\u0172\7]\2\2\u0172\u0173\7\u0157\2\2\u0173\u0175\5\u00a8U\2"+
		"\u0174\u0138\3\2\2\2\u0174\u0139\3\2\2\2\u0174\u014f\3\2\2\2\u0174\u0161"+
		"\3\2\2\2\u0174\u0168\3\2\2\2\u0174\u0170\3\2\2\2\u0175\7\3\2\2\2\u0176"+
		"\u0178\5,\27\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017b\5H%\2\u017a\u017c\5F$\2\u017b\u017a\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u032b\3\2\2\2\u017d\u017e\7]\2\2\u017e\u017f\7\u0182\2"+
		"\2\u017f\u0183\7\u0152\2\2\u0180\u0181\7\u00d4\2\2\u0181\u0182\7\u012f"+
		"\2\2\u0182\u0184\7\u00a4\2\2\u0183\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\5\u0118\u008d\2\u0186\u0187\7\u0135\2\2\u0187"+
		"\u0188\5\u00a8U\2\u0188\u0189\7\36\2\2\u0189\u018a\t\3\2\2\u018a\u018e"+
		"\7\u01bc\2\2\u018b\u018f\5*\26\2\u018c\u018d\7\u017d\2\2\u018d\u018f\5"+
		"\u0118\u008d\2\u018e\u018b\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\7\u01d1\2\2\u0191\u0192\7\4\2\2\u0192\u0193\5\u00d8m"+
		"\2\u0193\u0194\7\5\2\2\u0194\u032b\3\2\2\2\u0195\u0197\7]\2\2\u0196\u0198"+
		"\7\u00a9\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019d\7\u01ab\2\2\u019a\u019b\7\u00d4\2\2\u019b\u019c\7\u012f"+
		"\2\2\u019c\u019e\7\u00a4\2\2\u019d\u019a\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01ae\5\u00a8U\2\u01a0\u01a2\5\u0092J\2\u01a1\u01a0"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01af\3\2\2\2\u01a3\u01a4\7\4\2\2\u01a4"+
		"\u01a7\5\u00aeX\2\u01a5\u01a6\7\6\2\2\u01a6\u01a8\5\u00b2Z\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01ab\7\6\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7\5"+
		"\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a1\3\2\2\2\u01ae\u01a3\3\2\2\2\u01af"+
		"\u01b3\3\2\2\2\u01b0\u01b1\7\u009b\2\2\u01b1\u01b2\7\u01e4\2\2\u01b2\u01b4"+
		"\5\u0118\u008d\2\u01b3\u01b0\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01bd\3"+
		"\2\2\2\u01b5\u01b6\t\4\2\2\u01b6\u01b7\7\u00f2\2\2\u01b7\u01bb\5\u0092"+
		"J\2\u01b8\u01b9\7H\2\2\u01b9\u01ba\7;\2\2\u01ba\u01bc\5\u0092J\2\u01bb"+
		"\u01b8\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b5\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01c0\7O\2\2\u01c0"+
		"\u01c2\7\u01fd\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4"+
		"\3\2\2\2\u01c3\u01c5\5\26\f\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2"+
		"\u01c5\u01d4\3\2\2\2\u01c6\u01c7\7\u008a\2\2\u01c7\u01cb\7;\2\2\u01c8"+
		"\u01c9\7\u00c9\2\2\u01c9\u01cc\5\u0092J\2\u01ca\u01cc\7\u0160\2\2\u01cb"+
		"\u01c8\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01d2\3\2\2\2\u01cd\u01d0\7\67"+
		"\2\2\u01ce\u01d1\7\u0202\2\2\u01cf\u01d1\7\"\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01c6\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01db\3\2\2\2\u01d6\u01d7\7\u0180\2\2\u01d7\u01d8\7\4\2\2\u01d8\u01d9"+
		"\5\u00c6d\2\u01d9\u01da\7\5\2\2\u01da\u01dc\3\2\2\2\u01db\u01d6\3\2\2"+
		"\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01df\5\u009cO\2\u01de"+
		"\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e1\7\66"+
		"\2\2\u01e1\u01e3\5\u009cO\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e5\7\36\2\2\u01e5\u01e7\5H%\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u032b\3\2\2\2\u01e8\u01e9\7]\2\2\u01e9"+
		"\u01ed\7\u01d9\2\2\u01ea\u01eb\7\u00d4\2\2\u01eb\u01ec\7\u012f\2\2\u01ec"+
		"\u01ee\7\u00a4\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f4\5\u00a8U\2\u01f0\u01f1\7\4\2\2\u01f1\u01f2\5\u00aa"+
		"V\2\u01f2\u01f3\7\5\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f7\7O\2\2\u01f7\u01f9\7\u01fd"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\7\36\2\2\u01fb\u01fc\5H%\2\u01fc\u032b\3\2\2\2\u01fd\u01fe\7\26"+
		"\2\2\u01fe\u01ff\7\u01d9\2\2\u01ff\u0204\5\u00a8U\2\u0200\u0201\7\4\2"+
		"\2\u0201\u0202\5\u00aaV\2\u0202\u0203\7\5\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u0200\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7\36"+
		"\2\2\u0207\u0208\5H%\2\u0208\u032b\3\2\2\2\u0209\u020b\7]\2\2\u020a\u020c"+
		"\7\u00a9\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u0211\7\u01ab\2\2\u020e\u020f\7\u00d4\2\2\u020f\u0210\7\u012f"+
		"\2\2\u0210\u0212\7\u00a4\2\2\u0211\u020e\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0214\5\u00a8U\2\u0214\u0215\7\u00fe\2\2\u0215\u021b"+
		"\5\u00a8U\2\u0216\u0217\7\u01df\2\2\u0217\u0219\7\u0180\2\2\u0218\u021a"+
		"\5\u0092J\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2"+
		"\2\u021b\u0216\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u032b\3\2\2\2\u021d\u021f"+
		"\5,\27\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0224\7\u00dd\2\2\u0221\u0225\7\u00e4\2\2\u0222\u0223\7\u013e\2\2\u0223"+
		"\u0225\7\u01ab\2\2\u0224\u0221\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u022b"+
		"\3\2\2\2\u0226\u022c\5\u00a8U\2\u0227\u0228\7\u008e\2\2\u0228\u0229\7"+
		"\4\2\2\u0229\u022a\7\u0202\2\2\u022a\u022c\7\5\2\2\u022b\u0226\3\2\2\2"+
		"\u022b\u0227\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022f\5\24\13\2\u022e\u022d"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0233\3\2\2\2\u0230\u0231\7\u01df\2"+
		"\2\u0231\u0232\7\u00f5\2\2\u0232\u0234\5\u0118\u008d\2\u0233\u0230\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0237\5\u0092J\2\u0236"+
		"\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023c\3\2\2\2\u0238\u0239\7\b"+
		"\2\2\u0239\u023a\5\u0094K\2\u023a\u023b\7\t\2\2\u023b\u023d\3\2\2\2\u023c"+
		"\u0238\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u032b\5H"+
		"%\2\u023f\u0241\5,\27\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0244\5R*\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2"+
		"\2\u0244\u0245\3\2\2\2\u0245\u0246\7\u01ce\2\2\u0246\u0247\5\u00a8U\2"+
		"\u0247\u0248\5\u00a6T\2\u0248\u0249\7\u0190\2\2\u0249\u024b\5\u0080A\2"+
		"\u024a\u024c\5^\60\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e"+
		"\3\2\2\2\u024d\u024f\5\\/\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u032b\3\2\2\2\u0250\u0252\5,\27\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0254\3\2\2\2\u0253\u0255\5R*\2\u0254\u0253\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\7\u0081\2\2\u0257\u0258\7\u00bb"+
		"\2\2\u0258\u025a\5\u00a8U\2\u0259\u025b\5\24\13\2\u025a\u0259\3\2\2\2"+
		"\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025f\5\u00a6T\2\u025d"+
		"\u025e\7\u01d1\2\2\u025e\u0260\5f\64\2\u025f\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0263\5\\/\2\u0262\u0261\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u032b\3\2\2\2\u0264\u0265\7\u0103\2\2\u0265\u0266"+
		"\7\u00f5\2\2\u0266\u0267\5\u0118\u008d\2\u0267\u0268\7\4\2\2\u0268\u026d"+
		"\5\34\17\2\u0269\u026a\7\6\2\2\u026a\u026c\5\34\17\2\u026b\u0269\3\2\2"+
		"\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270"+
		"\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272\7\5\2\2\u0271\u0273\5> \2\u0272"+
		"\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0279\3\2\2\2\u0274\u0275\7\u015a"+
		"\2\2\u0275\u0276\7\4\2\2\u0276\u0277\5\u009eP\2\u0277\u0278\7\5\2\2\u0278"+
		"\u027a\3\2\2\2\u0279\u0274\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2"+
		"\2\2\u027b\u027d\5\u010e\u0088\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u032b\3\2\2\2\u027e\u027f\7\u0103\2\2\u027f\u0285\5B\"\2\u0280"+
		"\u0281\7\u015a\2\2\u0281\u0282\7\4\2\2\u0282\u0283\5\u009eP\2\u0283\u0284"+
		"\7\5\2\2\u0284\u0286\3\2\2\2\u0285\u0280\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0288\3\2\2\2\u0287\u0289\5\u010e\u0088\2\u0288\u0287\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289\u032b\3\2\2\2\u028a\u028b\7\u00a7\2\2\u028b\u028c\7\u01ab"+
		"\2\2\u028c\u028f\5\u00a8U\2\u028d\u028e\7\u0141\2\2\u028e\u0290\5\u0092"+
		"J\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u0293\5\\/\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0295\7\u01bc\2\2\u0295\u0297\7\u01fd\2\2\u0296\u0298\5\u009c"+
		"O\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299"+
		"\u029b\5> \2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u032b\3\2\2"+
		"\2\u029c\u029d\7]\2\2\u029d\u029e\7\u0119\2\2\u029e\u02a2\7\u01d9\2\2"+
		"\u029f\u02a0\7\u00d4\2\2\u02a0\u02a1\7\u012f\2\2\u02a1\u02a3\7\u00a4\2"+
		"\2\u02a2\u029f\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a9"+
		"\5\u00a8U\2\u02a5\u02a6\7\4\2\2\u02a6\u02a7\5\u00aaV\2\u02a7\u02a8\7\5"+
		"\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a5\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02ac\3\2\2\2\u02ab\u02ad\5\36\20\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3"+
		"\2\2\2\u02ad\u02b5\3\2\2\2\u02ae\u02b0\7\u0167\2\2\u02af\u02b1\5$\23\2"+
		"\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b4"+
		"\5 \21\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5"+
		"\u02ae\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02bc\3\2\2\2\u02b7\u02b9\7\u0093"+
		"\2\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bb\7\u00f2\2\2\u02bb\u02bd\5\u0092J\2\u02bc\u02b8\3\2\2\2\u02bc\u02bd"+
		"\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bf\7O\2\2\u02bf\u02c1\7\u01fd\2"+
		"\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c8\3\2\2\2\u02c2\u02c3"+
		"\7\u0141\2\2\u02c3\u02c4\7;\2\2\u02c4\u02c5\7\4\2\2\u02c5\u02c6\5\u0118"+
		"\u008d\2\u02c6\u02c7\7\5\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c2\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02d5\3\2\2\2\u02ca\u02cb\7\u008a\2\2\u02cb\u02cf"+
		"\7;\2\2\u02cc\u02cd\7\u00c9\2\2\u02cd\u02d0\5\u0092J\2\u02ce\u02d0\7\u0160"+
		"\2\2\u02cf\u02cc\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02d2\7\67\2\2\u02d2\u02d4\t\5\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3"+
		"\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02ca\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d8\3\2\2\2\u02d7\u02d9\5\u009cO\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7\36\2\2\u02db\u02dc\5H%\2\u02dc"+
		"\u032b\3\2\2\2\u02dd\u02de\7\u0167\2\2\u02de\u02df\7\u0119\2\2\u02df\u02e0"+
		"\7\u01d9\2\2\u02e0\u02e4\5\u00a8U\2\u02e1\u02e5\5\24\13\2\u02e2\u02e5"+
		"\7S\2\2\u02e3\u02e5\7\"\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e3\3\2\2\2\u02e5\u032b\3\2\2\2\u02e6\u02e7\7\26\2\2\u02e7\u02e8\7"+
		"\u0119\2\2\u02e8\u02e9\7\u01d9\2\2\u02e9\u02f9\5\u00a8U\2\u02ea\u02eb"+
		"\7\u016b\2\2\u02eb\u02fa\5\u0118\u008d\2\u02ec\u02f2\7\u0167\2\2\u02ed"+
		"\u02f3\5$\23\2\u02ee\u02f3\5 \21\2\u02ef\u02f0\5$\23\2\u02f0\u02f1\5 "+
		"\21\2\u02f1\u02f3\3\2\2\2\u02f2\u02ed\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f2"+
		"\u02ef\3\2\2\2\u02f3\u02fa\3\2\2\2\u02f4\u02f5\7\u0190\2\2\u02f5\u02f6"+
		"\7\4\2\2\u02f6\u02f7\5\u009eP\2\u02f7\u02f8\7\5\2\2\u02f8\u02fa\3\2\2"+
		"\2\u02f9\u02ea\3\2\2\2\u02f9\u02ec\3\2\2\2\u02f9\u02f4\3\2\2\2\u02fa\u032b"+
		"\3\2\2\2\u02fb\u02fc\7\u0090\2\2\u02fc\u02fd\7\u0119\2\2\u02fd\u0300\7"+
		"\u01d9\2\2\u02fe\u02ff\7\u00d4\2\2\u02ff\u0301\7\u00a4\2\2\u0300\u02fe"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u032b\5\u00a8U"+
		"\2\u0303\u0304\7\u0149\2\2\u0304\u0305\7\u0119\2\2\u0305\u0306\7\u01d9"+
		"\2\2\u0306\u0307\7\u00ed\2\2\u0307\u0308\7\u0135\2\2\u0308\u032b\5\u00a8"+
		"U\2\u0309\u030a\7\u0177\2\2\u030a\u030b\7\u0119\2\2\u030b\u030c\7\u01d9"+
		"\2\2\u030c\u030d\7\u00ed\2\2\u030d\u030e\7\u0135\2\2\u030e\u032b\5\u00a8"+
		"U\2\u030f\u0310\7>\2\2\u0310\u0311\7\u0119\2\2\u0311\u0312\7\u01d9\2\2"+
		"\u0312\u0313\7\u01b0\2\2\u0313\u0314\7\u0202\2\2\u0314\u0315\7\u0135\2"+
		"\2\u0315\u032b\5\u00a8U\2\u0316\u0317\7\26\2\2\u0317\u0318\7\u01ab\2\2"+
		"\u0318\u0319\5\u00a8U\2\u0319\u031a\7\16\2\2\u031a\u031b\7X\2\2\u031b"+
		"\u031c\5\u0114\u008b\2\u031c\u031d\5\22\n\2\u031d\u032b\3\2\2\2\u031e"+
		"\u031f\7\26\2\2\u031f\u0320\7\u01ab\2\2\u0320\u0321\5\u00a8U\2\u0321\u0322"+
		"\7\u0090\2\2\u0322\u0323\7X\2\2\u0323\u0324\5\u0114\u008b\2\u0324\u032b"+
		"\3\2\2\2\u0325\u0326\7\u0193\2\2\u0326\u0327\7Y\2\2\u0327\u0328\7\u00bb"+
		"\2\2\u0328\u032b\5\u00a8U\2\u0329\u032b\5\n\6\2\u032a\u0177\3\2\2\2\u032a"+
		"\u017d\3\2\2\2\u032a\u0195\3\2\2\2\u032a\u01e8\3\2\2\2\u032a\u01fd\3\2"+
		"\2\2\u032a\u0209\3\2\2\2\u032a\u021e\3\2\2\2\u032a\u0240\3\2\2\2\u032a"+
		"\u0251\3\2\2\2\u032a\u0264\3\2\2\2\u032a\u027e\3\2\2\2\u032a\u028a\3\2"+
		"\2\2\u032a\u029c\3\2\2\2\u032a\u02dd\3\2\2\2\u032a\u02e6\3\2\2\2\u032a"+
		"\u02fb\3\2\2\2\u032a\u0303\3\2\2\2\u032a\u0309\3\2\2\2\u032a\u030f\3\2"+
		"\2\2\u032a\u0316\3\2\2\2\u032a\u031e\3\2\2\2\u032a\u0325\3\2\2\2\u032a"+
		"\u0329\3\2\2\2\u032b\t\3\2\2\2\u032c\u032d\7\u0190\2\2\u032d\u032e\5\u0118"+
		"\u008d\2\u032e\u032f\7\36\2\2\u032f\u0330\7\177\2\2\u0330\u0331\7\u01a0"+
		"\2\2\u0331\u0332\7\u020d\2\2\u0332\u039b\3\2\2\2\u0333\u0334\7\u0190\2"+
		"\2\u0334\u0337\7\u015b\2\2\u0335\u0336\7\u00b6\2\2\u0336\u0338\5(\25\2"+
		"\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u039b"+
		"\5\u009eP\2\u033a\u033c\7\u0190\2\2\u033b\u033d\t\6\2\2\u033c\u033b\3"+
		"\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\5\u0118\u008d"+
		"\2\u033f\u0342\7\u01e4\2\2\u0340\u0343\5\u00d4k\2\u0341\u0343\7\177\2"+
		"\2\u0342\u0340\3\2\2\2\u0342\u0341\3\2\2\2\u0343\u039b\3\2\2\2\u0344\u0345"+
		"\7\u0190\2\2\u0345\u039b\5\f\7\2\u0346\u034a\7\u0190\2\2\u0347\u0348\7"+
		"D\2\2\u0348\u034b\7\u0190\2\2\u0349\u034b\7E\2\2\u034a\u0347\3\2\2\2\u034a"+
		"\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034f\5(\25\2\u034d\u034f\7\177"+
		"\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f\u039b\3\2\2\2\u0350"+
		"\u0351\7\u0190\2\2\u0351\u0352\7\u0127\2\2\u0352\u0353\7\u01e4\2\2\u0353"+
		"\u039b\5\u00d4k\2\u0354\u0356\7\u0190\2\2\u0355\u0357\t\6\2\2\u0356\u0355"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0363\7\u01bd\2"+
		"\2\u0359\u0364\5\16\b\2\u035a\u0364\5\20\t\2\u035b\u035c\5\16\b\2\u035c"+
		"\u035d\7\6\2\2\u035d\u035e\5\20\t\2\u035e\u0364\3\2\2\2\u035f\u0360\5"+
		"\20\t\2\u0360\u0361\7\6\2\2\u0361\u0362\5\16\b\2\u0362\u0364\3\2\2\2\u0363"+
		"\u0359\3\2\2\2\u0363\u035a\3\2\2\2\u0363\u035b\3\2\2\2\u0363\u035f\3\2"+
		"\2\2\u0364\u039b\3\2\2\2\u0365\u0366\7\u0190\2\2\u0366\u0369\7\u0127\2"+
		"\2\u0367\u036a\5(\25\2\u0368\u036a\7\177\2\2\u0369\u0367\3\2\2\2\u0369"+
		"\u0368\3\2\2\2\u036a\u036e\3\2\2\2\u036b\u036c\7J\2\2\u036c\u036f\5(\25"+
		"\2\u036d\u036f\7\177\2\2\u036e\u036b\3\2\2\2\u036e\u036d\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u039b\3\2\2\2\u0370\u0371\7\u0190\2\2\u0371\u0374"+
		"\7\u0143\2\2\u0372\u0373\7\u00b6\2\2\u0373\u0375\5*\26\2\u0374\u0372\3"+
		"\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037c\7\u01e4\2\2"+
		"\u0377\u037d\7\u01fd\2\2\u0378\u0379\7\u0143\2\2\u0379\u037a\7\4\2\2\u037a"+
		"\u037b\7\u01fd\2\2\u037b\u037d\7\5\2\2\u037c\u0377\3\2\2\2\u037c\u0378"+
		"\3\2\2\2\u037d\u039b\3\2\2\2\u037e\u037f\7\u0190\2\2\u037f\u0380\7\u00fa"+
		"\2\2\u0380\u0386\7\u01e4\2\2\u0381\u0387\7\u01fd\2\2\u0382\u0383\7\u0143"+
		"\2\2\u0383\u0384\7\4\2\2\u0384\u0385\7\u01fd\2\2\u0385\u0387\7\5\2\2\u0386"+
		"\u0381\3\2\2\2\u0386\u0382\3\2\2\2\u0387\u039b\3\2\2\2\u0388\u038c\7\u01cf"+
		"\2\2\u0389\u038a\5\u0118\u008d\2\u038a\u038b\7\7\2\2\u038b\u038d\3\2\2"+
		"\2\u038c\u0389\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u039b"+
		"\5\u0118\u008d\2\u038f\u0396\7\u01cf\2\2\u0390\u0391\5\u0118\u008d\2\u0391"+
		"\u0392\7\7\2\2\u0392\u0394\3\2\2\2\u0393\u0390\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0397\5\u0118\u008d\2\u0396\u0393\3\2\2"+
		"\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\7\u01fb\2\2\u0399"+
		"\u039b\5\u0118\u008d\2\u039a\u032c\3\2\2\2\u039a\u0333\3\2\2\2\u039a\u033a"+
		"\3\2\2\2\u039a\u0344\3\2\2\2\u039a\u0346\3\2\2\2\u039a\u0350\3\2\2\2\u039a"+
		"\u0354\3\2\2\2\u039a\u0365\3\2\2\2\u039a\u0370\3\2\2\2\u039a\u037e\3\2"+
		"\2\2\u039a\u0388\3\2\2\2\u039a\u038f\3\2\2\2\u039b\13\3\2\2\2\u039c\u039d"+
		"\7\u01fb\2\2\u039d\u039f\7\u01fb\2\2\u039e\u03a0\t\6\2\2\u039f\u039e\3"+
		"\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039c\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\5\u0118\u008d\2\u03a4\u03a7"+
		"\7\u01e4\2\2\u03a5\u03a8\5\u00d4k\2\u03a6\u03a8\7\177\2\2\u03a7\u03a5"+
		"\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03af\3\2\2\2\u03a9\u03aa\7\u01fb\2"+
		"\2\u03aa\u03ab\5\u0118\u008d\2\u03ab\u03ac\7\u01e4\2\2\u03ac\u03ad\5\u00d4"+
		"k\2\u03ad\u03af\3\2\2\2\u03ae\u03a1\3\2\2\2\u03ae\u03a9\3\2\2\2\u03af"+
		"\r\3\2\2\2\u03b0\u03b1\7\u0162\2\2\u03b1\u03b2\t\7\2\2\u03b2\17\3\2\2"+
		"\2\u03b3\u03b4\7\u00ec\2\2\u03b4\u03bc\7\u00fd\2\2\u03b5\u03b6\7\u0162"+
		"\2\2\u03b6\u03bd\7\u01c8\2\2\u03b7\u03b8\7\u0162\2\2\u03b8\u03bd\7Q\2"+
		"\2\u03b9\u03ba\7\u016d\2\2\u03ba\u03bd\7\u0162\2\2\u03bb\u03bd\7\u018e"+
		"\2\2\u03bc\u03b5\3\2\2\2\u03bc\u03b7\3\2\2\2\u03bc\u03b9\3\2\2\2\u03bc"+
		"\u03bb\3\2\2\2\u03bd\21\3\2\2\2\u03be\u03bf\7\u0155\2\2\u03bf\u03c0\7"+
		"\u00f2\2\2\u03c0\u03cb\5\u0092J\2\u03c1\u03c2\7\u01cb\2\2\u03c2\u03cb"+
		"\5\u0092J\2\u03c3\u03c4\7\u00b7\2\2\u03c4\u03c5\7\u00f2\2\2\u03c5\u03c6"+
		"\5\u0092J\2\u03c6\u03c7\7\u0168\2\2\u03c7\u03c8\5\u00a8U\2\u03c8\u03c9"+
		"\5\u0092J\2\u03c9\u03cb\3\2\2\2\u03ca\u03be\3\2\2\2\u03ca\u03c1\3\2\2"+
		"\2\u03ca\u03c3\3\2\2\2\u03cb\23\3\2\2\2\u03cc\u03ce\7\u01b2\2\2\u03cd"+
		"\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\t\b"+
		"\2\2\u03d0\u03db\5\u0092J\2\u03d1\u03d3\7\u01b2\2\2\u03d2\u03d1\3\2\2"+
		"\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\7\u0141\2\2\u03d5"+
		"\u03db\5\u0114\u008b\2\u03d6\u03d7\t\b\2\2\u03d7\u03d8\7\4\2\2\u03d8\u03d9"+
		"\7\u01ed\2\2\u03d9\u03db\7\5\2\2\u03da\u03cd\3\2\2\2\u03da\u03d2\3\2\2"+
		"\2\u03da\u03d6\3\2\2\2\u03db\25\3\2\2\2\u03dc\u03de\7\"\2\2\u03dd\u03dc"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\7\u0141\2"+
		"\2\u03e0\u03e2\7;\2\2\u03e1\u03e3\t\t\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3"+
		"\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\5\30\r\2\u03e5\u03e7\7\4\2\2"+
		"\u03e6\u03e8\5\u00b6\\\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03ea\7\5\2\2\u03ea\27\3\2\2\2\u03eb\u03ec\7\4\2"+
		"\2\u03ec\u03f1\5\32\16\2\u03ed\u03ee\7\6\2\2\u03ee\u03f0\5\32\16\2\u03ef"+
		"\u03ed\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2"+
		"\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5\7\5\2\2\u03f5"+
		"\31\3\2\2\2\u03f6\u03f9\5\u0118\u008d\2\u03f7\u03f9\5\u00e6t\2\u03f8\u03f6"+
		"\3\2\2\2\u03f8\u03f7\3\2\2\2\u03f9\33\3\2\2\2\u03fa\u03fc\7\u01df\2\2"+
		"\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff"+
		"\5\60\31\2\u03fe\u03fb\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2"+
		"\u0400\u0401\7h\2\2\u0401\u0402\7\u00db\2\2\u0402\u0403\7\4\2\2\u0403"+
		"\u0408\7\u01fd\2\2\u0404\u0405\7\6\2\2\u0405\u0407\7\u01fd\2\2\u0406\u0404"+
		"\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040b\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u040c\7\5\2\2\u040c\u040d\7\u00e4"+
		"\2\2\u040d\u040e\7\u01ab\2\2\u040e\u0411\5\u00a8U\2\u040f\u0410\7\u0141"+
		"\2\2\u0410\u0412\5\u0092J\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0417\3\2\2\2\u0413\u0414\7N\2\2\u0414\u0415\7\u01b3\2\2\u0415\u0416"+
		"\7;\2\2\u0416\u0418\7\u01fd\2\2\u0417\u0413\3\2\2\2\u0417\u0418\3\2\2"+
		"\2\u0418\u041d\3\2\2\2\u0419\u041a\7\u0100\2\2\u041a\u041b\7\u01b3\2\2"+
		"\u041b\u041c\7;\2\2\u041c\u041e\7\u01fd\2\2\u041d\u0419\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u0422\3\2\2\2\u041f\u0420\7\u00b9\2\2\u0420\u0421"+
		"\7\36\2\2\u0421\u0423\5&\24\2\u0422\u041f\3\2\2\2\u0422\u0423\3\2\2\2"+
		"\u0423\u0425\3\2\2\2\u0424\u0426\5\u0092J\2\u0425\u0424\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0429\58\35\2\u0428\u0427\3\2"+
		"\2\2\u0428\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u042c\5:\36\2\u042b"+
		"\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042f\5\62"+
		"\32\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430"+
		"\u0432\5\\/\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2"+
		"\2\2\u0433\u0435\5\64\33\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0437\3\2\2\2\u0436\u0438\5\66\34\2\u0437\u0436\3\2\2\2\u0437\u0438\3"+
		"\2\2\2\u0438\u043a\3\2\2\2\u0439\u043b\5\u009cO\2\u043a\u0439\3\2\2\2"+
		"\u043a\u043b\3\2\2\2\u043b\u045a\3\2\2\2\u043c\u043e\7\u01df\2\2\u043d"+
		"\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\5\60"+
		"\31\2\u0440\u043d\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"\u0443\7h\2\2\u0443\u0444\7\u00bb\2\2\u0444\u0445\7\u01ab\2\2\u0445\u0446"+
		"\5\u00a8U\2\u0446\u0447\7\u00e4\2\2\u0447\u0448\7\u01ab\2\2\u0448\u044b"+
		"\5\u00a8U\2\u0449\u044a\7\u0141\2\2\u044a\u044c\5\u0092J\2\u044b\u0449"+
		"\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e\3\2\2\2\u044d\u044f\5:\36\2\u044e"+
		"\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u0452\5\\"+
		"/\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453"+
		"\u0455\5\64\33\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0457\3"+
		"\2\2\2\u0456\u0458\5\u009cO\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2"+
		"\u0458\u045a\3\2\2\2\u0459\u03fe\3\2\2\2\u0459\u0440\3\2\2\2\u045a\35"+
		"\3\2\2\2\u045b\u045c\78\2\2\u045c\u045d\t\n\2\2\u045d\37\3\2\2\2\u045e"+
		"\u045f\7\u0135\2\2\u045f\u0464\7\u010b\2\2\u0460\u0461\7\u0135\2\2\u0461"+
		"\u0462\7\u0186\2\2\u0462\u0464\5\"\22\2\u0463\u045e\3\2\2\2\u0463\u0460"+
		"\3\2\2\2\u0464!\3\2\2\2\u0465\u0466\7\u00a0\2\2\u0466\u0467\7\u0202\2"+
		"\2\u0467\u046a\5\u0118\u008d\2\u0468\u0469\7\u019c\2\2\u0469\u046b\7\u01fd"+
		"\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b#\3\2\2\2\u046c\u046d"+
		"\t\13\2\2\u046d%\3\2\2\2\u046e\u0471\5\u0118\u008d\2\u046f\u0471\7\u01fd"+
		"\2\2\u0470\u046e\3\2\2\2\u0470\u046f\3\2\2\2\u0471\'\3\2\2\2\u0472\u0476"+
		"\5\u0114\u008b\2\u0473\u0476\7\u01fd\2\2\u0474\u0476\7\u01fe\2\2\u0475"+
		"\u0472\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0474\3\2\2\2\u0476)\3\2\2\2"+
		"\u0477\u0480\5(\25\2\u0478\u047e\7\u01fb\2\2\u0479\u047f\5(\25\2\u047a"+
		"\u047b\7\4\2\2\u047b\u047c\5(\25\2\u047c\u047d\7\5\2\2\u047d\u047f\3\2"+
		"\2\2\u047e\u0479\3\2\2\2\u047e\u047a\3\2\2\2\u047f\u0481\3\2\2\2\u0480"+
		"\u0478\3\2\2\2\u0480\u0481\3\2\2\2\u0481+\3\2\2\2\u0482\u0484\7\u00a6"+
		"\2\2\u0483\u0485\5.\30\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u0489\3\2\2\2\u0486\u0489\7\u0083\2\2\u0487\u0489\7\u0084\2\2\u0488\u0482"+
		"\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0487\3\2\2\2\u0489\u048b\3\2\2\2\u048a"+
		"\u048c\t\f\2\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\3\2"+
		"\2\2\u048d\u048f\7\u014f\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f"+
		"-\3\2\2\2\u0490\u0491\t\r\2\2\u0491/\3\2\2\2\u0492\u0493\t\16\2\2\u0493"+
		"\61\3\2\2\2\u0494\u0495\7\u0153\2\2\u0495\u0496\7\u00b1\2\2\u0496\u0497"+
		"\5\u00d4k\2\u0497\63\3\2\2\2\u0498\u0499\7\u0081\2\2\u0499\u049a\7\u0135"+
		"\2\2\u049a\u049b\5\u00d4k\2\u049b\65\3\2\2\2\u049c\u049d\7\u013a\2\2\u049d"+
		"\u049e\7;\2\2\u049e\u049f\5\u0118\u008d\2\u049f\67\3\2\2\2\u04a0\u04a1"+
		"\7N\2\2\u04a1\u04a2\7\u00bb\2\2\u04a2\u04a3\7\u0148\2\2\u04a3\u04a4\7"+
		"\36\2\2\u04a4\u04a5\5\u0092J\2\u04a59\3\2\2\2\u04a6\u04a7\7\u0190\2\2"+
		"\u04a7\u04a8\7\4\2\2\u04a8\u04ad\5<\37\2\u04a9\u04aa\7\6\2\2\u04aa\u04ac"+
		"\5<\37\2\u04ab\u04a9\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b1\7\5"+
		"\2\2\u04b1;\3\2\2\2\u04b2\u04b3\5\u0118\u008d\2\u04b3\u04b4\7\u01e4\2"+
		"\2\u04b4\u04b5\5\u00d4k\2\u04b5=\3\2\2\2\u04b6\u04d3\5@!\2\u04b7\u04b8"+
		"\7\u01df\2\2\u04b8\u04b9\7\u0184\2\2\u04b9\u04ba\7\4\2\2\u04ba\u04bb\5"+
		"\u009eP\2\u04bb\u04bc\7\5\2\2\u04bc\u04d3\3\2\2\2\u04bd\u04be\7\u01df"+
		"\2\2\u04be\u04bf\7\u00cb\2\2\u04bf\u04c0\7\4\2\2\u04c0\u04c1\5\u009eP"+
		"\2\u04c1\u04c2\7\5\2\2\u04c2\u04d3\3\2\2\2\u04c3\u04c4\7\u01df\2\2\u04c4"+
		"\u04c5\7\u0104\2\2\u04c5\u04c6\7\4\2\2\u04c6\u04c7\5\u009eP\2\u04c7\u04c8"+
		"\7\5\2\2\u04c8\u04d3\3\2\2\2\u04c9\u04ca\7\u01df\2\2\u04ca\u04cb\7\66"+
		"\2\2\u04cb\u04d0\5(\25\2\u04cc\u04cd\7\4\2\2\u04cd\u04ce\5\u009eP\2\u04ce"+
		"\u04cf\7\5\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04cc\3\2\2\2\u04d0\u04d1\3\2"+
		"\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04b6\3\2\2\2\u04d2\u04b7\3\2\2\2\u04d2"+
		"\u04bd\3\2\2\2\u04d2\u04c3\3\2\2\2\u04d2\u04c9\3\2\2\2\u04d3?\3\2\2\2"+
		"\u04d4\u04d5\7\u01df\2\2\u04d5\u04d6\7\u0173\2\2\u04d6\u04db\5(\25\2\u04d7"+
		"\u04d8\7\4\2\2\u04d8\u04d9\5\u009eP\2\u04d9\u04da\7\5\2\2\u04da\u04dc"+
		"\3\2\2\2\u04db\u04d7\3\2\2\2\u04db\u04dc\3\2\2\2\u04dcA\3\2\2\2\u04dd"+
		"\u04e0\7h\2\2\u04de\u04df\7\u0104\2\2\u04df\u04e1\5\u00fc\177\2\u04e0"+
		"\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\7\u00db"+
		"\2\2\u04e3\u04e4\7\u01fd\2\2\u04e4\u04e5\7\u00e4\2\2\u04e5\u04e6\7\u01ab"+
		"\2\2\u04e6\u04e9\5\u00a8U\2\u04e7\u04e8\7\u0141\2\2\u04e8\u04ea\5\u0092"+
		"J\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ef\3\2\2\2\u04eb"+
		"\u04ec\7N\2\2\u04ec\u04ed\7\u01b3\2\2\u04ed\u04ee\7;\2\2\u04ee\u04f0\7"+
		"\u01fd\2\2\u04ef\u04eb\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f5\3\2\2\2"+
		"\u04f1\u04f2\7\u0100\2\2\u04f2\u04f3\7\u01b3\2\2\u04f3\u04f4\7;\2\2\u04f4"+
		"\u04f6\7\u01fd\2\2\u04f5\u04f1\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8"+
		"\3\2\2\2\u04f7\u04f9\5D#\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fb\3\2\2\2\u04fa\u04fc\5\u0092J\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc"+
		"\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04ff\5:\36\2\u04fe\u04fd\3\2\2\2\u04fe"+
		"\u04ff\3\2\2\2\u04ff\u0501\3\2\2\2\u0500\u0502\5\u009cO\2\u0501\u0500"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502C\3\2\2\2\u0503\u0504\7\u00d5\2\2\u0504"+
		"\u0505\7\u0202\2\2\u0505\u050a\7\u0100\2\2\u0506\u0507\7\u00d5\2\2\u0507"+
		"\u0508\7\u0202\2\2\u0508\u050a\7\u0183\2\2\u0509\u0503\3\2\2\2\u0509\u0506"+
		"\3\2\2\2\u050aE\3\2\2\2\u050b\u050c\7\u00e4\2\2\u050c\u050d\7\u013c\2"+
		"\2\u050d\u0511\5\u00f8}\2\u050e\u050f\7\u00b9\2\2\u050f\u0510\7\36\2\2"+
		"\u0510\u0512\5\u0118\u008d\2\u0511\u050e\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0514\3\2\2\2\u0513\u0515\5\u009cO\2\u0514\u0513\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515G\3\2\2\2\u0516\u0518\5R*\2\u0517\u0516\3\2\2\2\u0517\u0518"+
		"\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\5J&\2\u051a\u051b\5\u0084C\2"+
		"\u051bI\3\2\2\2\u051c\u051d\b&\1\2\u051d\u051e\5N(\2\u051e\u0527\3\2\2"+
		"\2\u051f\u0520\f\3\2\2\u0520\u0522\t\17\2\2\u0521\u0523\5L\'\2\u0522\u0521"+
		"\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0526\5J&\4\u0525"+
		"\u051f\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0527\u0528\3\2"+
		"\2\2\u0528K\3\2\2\2\u0529\u0527\3\2\2\2\u052a\u052b\t\20\2\2\u052bM\3"+
		"\2\2\2\u052c\u0533\5P)\2\u052d\u052e\7\4\2\2\u052e\u052f\5H%\2\u052f\u0530"+
		"\7\5\2\2\u0530\u0533\3\2\2\2\u0531\u0533\5\u00ceh\2\u0532\u052c\3\2\2"+
		"\2\u0532\u052d\3\2\2\2\u0532\u0531\3\2\2\2\u0533O\3\2\2\2\u0534\u0536"+
		"\5X-\2\u0535\u0537\5`\61\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537"+
		"\u0539\3\2\2\2\u0538\u053a\5^\60\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2"+
		"\2\2\u053a\u053c\3\2\2\2\u053b\u053d\5\\/\2\u053c\u053b\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u0540\5p9\2\u053f\u053e\3\2\2"+
		"\2\u053f\u0540\3\2\2\2\u0540\u0542\3\2\2\2\u0541\u0543\5v<\2\u0542\u0541"+
		"\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\6)\3\2\u0545"+
		"\u0546\5\u0084C\2\u0546Q\3\2\2\2\u0547\u0548\7\u01df\2\2\u0548\u054d\5"+
		"T+\2\u0549\u054a\7\6\2\2\u054a\u054c\5T+\2\u054b\u0549\3\2\2\2\u054c\u054f"+
		"\3\2\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054eS\3\2\2\2\u054f"+
		"\u054d\3\2\2\2\u0550\u0552\5\u0118\u008d\2\u0551\u0553\5V,\2\u0552\u0551"+
		"\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\7\36\2\2"+
		"\u0555\u0556\7\4\2\2\u0556\u0557\5H%\2\u0557\u0558\7\5\2\2\u0558U\3\2"+
		"\2\2\u0559\u055a\7\4\2\2\u055a\u055f\5\u0118\u008d\2\u055b\u055c\7\6\2"+
		"\2\u055c\u055e\5\u0118\u008d\2\u055d\u055b\3\2\2\2\u055e\u0561\3\2\2\2"+
		"\u055f\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561\u055f"+
		"\3\2\2\2\u0562\u0563\7\5\2\2\u0563W\3\2\2\2\u0564\u0566\7\u018b\2\2\u0565"+
		"\u0567\5x=\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2"+
		"\2\u0568\u056a\7\u0087\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u056c\5Z.\2\u056cY\3\2\2\2\u056d\u0575\5\u00d2j\2"+
		"\u056e\u056f\7\u01ed\2\2\u056f\u0570\7\u00a1\2\2\u0570\u0571\7\4\2\2\u0571"+
		"\u0572\5\u00d2j\2\u0572\u0573\7\5\2\2\u0573\u0575\3\2\2\2\u0574\u056d"+
		"\3\2\2\2\u0574\u056e\3\2\2\2\u0575[\3\2\2\2\u0576\u0577\7\u01dd\2\2\u0577"+
		"\u0578\5\u00d8m\2\u0578]\3\2\2\2\u0579\u057a\7\u00bb\2\2\u057a\u057b\5"+
		"f\64\2\u057b_\3\2\2\2\u057c\u057e\5b\62\2\u057d\u057c\3\2\2\2\u057d\u057e"+
		"\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0582\7\u00e4\2\2\u0580\u0583\5d\63"+
		"\2\u0581\u0583\5\u0118\u008d\2\u0582\u0580\3\2\2\2\u0582\u0581\3\2\2\2"+
		"\u0583\u058b\3\2\2\2\u0584\u0587\7\6\2\2\u0585\u0588\5d\63\2\u0586\u0588"+
		"\5\u0118\u008d\2\u0587\u0585\3\2\2\2\u0587\u0586\3\2\2\2\u0588\u058a\3"+
		"\2\2\2\u0589\u0584\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b"+
		"\u058c\3\2\2\2\u058ca\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u058f\7:\2\2\u058f"+
		"\u0590\7L\2\2\u0590c\3\2\2\2\u0591\u0592\5\u0118\u008d\2\u0592\u0593\7"+
		"\4\2\2\u0593\u0594\7\u0202\2\2\u0594\u0595\7\5\2\2\u0595e\3\2\2\2\u0596"+
		"\u059b\5h\65\2\u0597\u0598\7\6\2\2\u0598\u059a\5h\65\2\u0599\u0597\3\2"+
		"\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"g\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u05a2\5\u0098M\2\u059f\u05a1\5j\66"+
		"\2\u05a0\u059f\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3"+
		"\3\2\2\2\u05a3i\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5\u05a6\5\u008eH\2\u05a6"+
		"\u05a8\7\u00ef\2\2\u05a7\u05a9\5l\67\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9"+
		"\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\5\u0098M\2\u05ab\u05ad\5\u0090"+
		"I\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05adk\3\2\2\2\u05ae\u05af"+
		"\7\b\2\2\u05af\u05b0\5\u0118\u008d\2\u05b0\u05b1\7\t\2\2\u05b1\u05b7\3"+
		"\2\2\2\u05b2\u05b3\7\u01f9\2\2\u05b3\u05b4\5\u0118\u008d\2\u05b4\u05b5"+
		"\7\u01fa\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05ae\3\2\2\2\u05b6\u05b2\3\2\2"+
		"\2\u05b7m\3\2\2\2\u05b8\u05b9\7\b\2\2\u05b9\u05be\5\u0118\u008d\2\u05ba"+
		"\u05bb\7\6\2\2\u05bb\u05bd\5\u0118\u008d\2\u05bc\u05ba\3\2\2\2\u05bd\u05c0"+
		"\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0"+
		"\u05be\3\2\2\2\u05c1\u05c2\7\t\2\2\u05c2\u05cf\3\2\2\2\u05c3\u05c4\7\u01f9"+
		"\2\2\u05c4\u05c9\5\u0118\u008d\2\u05c5\u05c6\7\6\2\2\u05c6\u05c8\5\u0118"+
		"\u008d\2\u05c7\u05c5\3\2\2\2\u05c8\u05cb\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9"+
		"\u05ca\3\2\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cc\u05cd\7\u01fa"+
		"\2\2\u05cd\u05cf\3\2\2\2\u05ce\u05b8\3\2\2\2\u05ce\u05c3\3\2\2\2\u05cf"+
		"o\3\2\2\2\u05d0\u05d1\7\u00c6\2\2\u05d1\u05d2\7;\2\2\u05d2\u05d3\5r:\2"+
		"\u05d3q\3\2\2\2\u05d4\u05d5\7\u0180\2\2\u05d5\u05de\7\4\2\2\u05d6\u05db"+
		"\5\u00d4k\2\u05d7\u05d8\7\6\2\2\u05d8\u05da\5\u00d4k\2\u05d9\u05d7\3\2"+
		"\2\2\u05da\u05dd\3\2\2\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc"+
		"\u05df\3\2\2\2\u05dd\u05db\3\2\2\2\u05de\u05d6\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u05e0\3\2\2\2\u05e0\u0604\7\5\2\2\u05e1\u05e2\7a\2\2\u05e2"+
		"\u05eb\7\4\2\2\u05e3\u05e8\5\u00d4k\2\u05e4\u05e5\7\6\2\2\u05e5\u05e7"+
		"\5\u00d4k\2\u05e6\u05e4\3\2\2\2\u05e7\u05ea\3\2\2\2\u05e8\u05e6\3\2\2"+
		"\2\u05e8\u05e9\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05eb\u05e3"+
		"\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u0604\7\5\2\2\u05ee"+
		"\u05ef\7\u00c7\2\2\u05ef\u05f0\7\u0191\2\2\u05f0\u05f1\7\4\2\2\u05f1\u05f6"+
		"\5t;\2\u05f2\u05f3\7\6\2\2\u05f3\u05f5\5t;\2\u05f4\u05f2\3\2\2\2\u05f5"+
		"\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\3\2"+
		"\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fa\7\5\2\2\u05fa\u0604\3\2\2\2\u05fb"+
		"\u0600\5\u00d4k\2\u05fc\u05fd\7\6\2\2\u05fd\u05ff\5\u00d4k\2\u05fe\u05fc"+
		"\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
		"\u0604\3\2\2\2\u0602\u0600\3\2\2\2\u0603\u05d4\3\2\2\2\u0603\u05e1\3\2"+
		"\2\2\u0603\u05ee\3\2\2\2\u0603\u05fb\3\2\2\2\u0604s\3\2\2\2\u0605\u060e"+
		"\7\4\2\2\u0606\u060b\5\u00d4k\2\u0607\u0608\7\6\2\2\u0608\u060a\5\u00d4"+
		"k\2\u0609\u0607\3\2\2\2\u060a\u060d\3\2\2\2\u060b\u0609\3\2\2\2\u060b"+
		"\u060c\3\2\2\2\u060c\u060f\3\2\2\2\u060d\u060b\3\2\2\2\u060e\u0606\3\2"+
		"\2\2\u060e\u060f\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\7\5\2\2\u0611"+
		"u\3\2\2\2\u0612\u0613\7\u00ca\2\2\u0613\u0614\5\u00d8m\2\u0614w\3\2\2"+
		"\2\u0615\u0616\7\u01f9\2\2\u0616\u061d\5z>\2\u0617\u0619\7\6\2\2\u0618"+
		"\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\5z"+
		">\2\u061b\u0618\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d"+
		"\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0621\7\u01fa"+
		"\2\2\u0621y\3\2\2\2\u0622\u0630\5\u0118\u008d\2\u0623\u0624\7\4\2\2\u0624"+
		"\u062b\5|?\2\u0625\u0627\7\6\2\2\u0626\u0625\3\2\2\2\u0626\u0627\3\2\2"+
		"\2\u0627\u0628\3\2\2\2\u0628\u062a\5|?\2\u0629\u0626\3\2\2\2\u062a\u062d"+
		"\3\2\2\2\u062b\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062e\3\2\2\2\u062d"+
		"\u062b\3\2\2\2\u062e\u062f\7\5\2\2\u062f\u0631\3\2\2\2\u0630\u0623\3\2"+
		"\2\2\u0630\u0631\3\2\2\2\u0631{\3\2\2\2\u0632\u0638\5(\25\2\u0633\u0636"+
		"\7\u01e4\2\2\u0634\u0637\5\u00f8}\2\u0635\u0637\5\u0118\u008d\2\u0636"+
		"\u0634\3\2\2\2\u0636\u0635\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u0633\3\2"+
		"\2\2\u0638\u0639\3\2\2\2\u0639}\3\2\2\2\u063a\u063b\5\u00a8U\2\u063b\u063e"+
		"\7\u01e4\2\2\u063c\u063f\5\u00d4k\2\u063d\u063f\7\177\2\2\u063e\u063c"+
		"\3\2\2\2\u063e\u063d\3\2\2\2\u063f\177\3\2\2\2\u0640\u0645\5~@\2\u0641"+
		"\u0642\7\6\2\2\u0642\u0644\5~@\2\u0643\u0641\3\2\2\2\u0644\u0647\3\2\2"+
		"\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0081\3\2\2\2\u0647\u0645"+
		"\3\2\2\2\u0648\u0649\7\u00f8\2\2\u0649\u064a\7\u01d9\2\2\u064a\u064b\5"+
		"\u0118\u008d\2\u064b\u0654\7\4\2\2\u064c\u0651\5\u00d4k\2\u064d\u064e"+
		"\7\6\2\2\u064e\u0650\5\u00d4k\2\u064f\u064d\3\2\2\2\u0650\u0653\3\2\2"+
		"\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0655\3\2\2\2\u0653\u0651"+
		"\3\2\2\2\u0654\u064c\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\3\2\2\2\u0656"+
		"\u0657\7\5\2\2\u0657\u0658\5\u0118\u008d\2\u0658\u0659\7\36\2\2\u0659"+
		"\u065e\5\u0118\u008d\2\u065a\u065b\7\6\2\2\u065b\u065d\5\u0118\u008d\2"+
		"\u065c\u065a\3\2\2\2\u065d\u0660\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f"+
		"\3\2\2\2\u065f\u0083\3\2\2\2\u0660\u065e\3\2\2\2\u0661\u0663\5\u0086D"+
		"\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0665\3\2\2\2\u0664\u0666"+
		"\5\u008aF\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0085\3\2\2"+
		"\2\u0667\u0668\7\u013a\2\2\u0668\u0669\7;\2\2\u0669\u066e\5\u0088E\2\u066a"+
		"\u066b\7\6\2\2\u066b\u066d\5\u0088E\2\u066c\u066a\3\2\2\2\u066d\u0670"+
		"\3\2\2\2\u066e\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0087\3\2\2\2\u0670"+
		"\u066e\3\2\2\2\u0671\u0673\5\u00d4k\2\u0672\u0674\t\21\2\2\u0673\u0672"+
		"\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0677\3\2\2\2\u0675\u0676\7\u0131\2"+
		"\2\u0676\u0678\t\22\2\2\u0677\u0675\3\2\2\2\u0677\u0678\3\2\2\2\u0678"+
		"\u0089\3\2\2\2\u0679\u067a\7\u00ff\2\2\u067a\u0684\7\u0202\2\2\u067b\u067c"+
		"\7\u00ff\2\2\u067c\u067d\7\u0202\2\2\u067d\u067e\7\u0134\2\2\u067e\u0684"+
		"\7\u0202\2\2\u067f\u0680\7\u00ff\2\2\u0680\u0681\7\u0202\2\2\u0681\u0682"+
		"\7\6\2\2\u0682\u0684\7\u0202\2\2\u0683\u0679\3\2\2\2\u0683\u067b\3\2\2"+
		"\2\u0683\u067f\3\2\2\2\u0684\u008b\3\2\2\2\u0685\u0686\7\u0141\2\2\u0686"+
		"\u0687\7;\2\2\u0687\u068c\5\u00d4k\2\u0688\u0689\7\6\2\2\u0689\u068b\5"+
		"\u00d4k\2\u068a\u0688\3\2\2\2\u068b\u068e\3\2\2\2\u068c\u068a\3\2\2\2"+
		"\u068c\u068d\3\2\2\2\u068d\u008d\3\2\2\2\u068e\u068c\3\2\2\2\u068f\u0691"+
		"\7\u00dc\2\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u06a8\3\2\2"+
		"\2\u0692\u06a8\7`\2\2\u0693\u0695\7\u00fb\2\2\u0694\u0696\7\u013b\2\2"+
		"\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u06a8\3\2\2\2\u0697\u0699"+
		"\7\u017b\2\2\u0698\u069a\7\u013b\2\2\u0699\u0698\3\2\2\2\u0699\u069a\3"+
		"\2\2\2\u069a\u06a8\3\2\2\2\u069b\u069d\7\u00be\2\2\u069c\u069e\7\u013b"+
		"\2\2\u069d\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a8\3\2\2\2\u069f"+
		"\u06a0\7\u00fb\2\2\u06a0\u06a8\7\u018c\2\2\u06a1\u06a2\7\u017b\2\2\u06a2"+
		"\u06a8\7\u018c\2\2\u06a3\u06a4\7\u00fb\2\2\u06a4\u06a8\7\32\2\2\u06a5"+
		"\u06a6\7\u017b\2\2\u06a6\u06a8\7\32\2\2\u06a7\u0690\3\2\2\2\u06a7\u0692"+
		"\3\2\2\2\u06a7\u0693\3\2\2\2\u06a7\u0697\3\2\2\2\u06a7\u069b\3\2\2\2\u06a7"+
		"\u069f\3\2\2\2\u06a7\u06a1\3\2\2\2\u06a7\u06a3\3\2\2\2\u06a7\u06a5\3\2"+
		"\2\2\u06a8\u008f\3\2\2\2\u06a9\u06aa\7\u0135\2\2\u06aa\u06ae\5\u00d8m"+
		"\2\u06ab\u06ac\7\u01d1\2\2\u06ac\u06ae\5\u0092J\2\u06ad\u06a9\3\2\2\2"+
		"\u06ad\u06ab\3\2\2\2\u06ae\u0091\3\2\2\2\u06af\u06b0\7\4\2\2\u06b0\u06b1"+
		"\5\u0094K\2\u06b1\u06b2\7\5\2\2\u06b2\u0093\3\2\2\2\u06b3\u06b8\5\u0114"+
		"\u008b\2\u06b4\u06b5\7\6\2\2\u06b5\u06b7\5\u0114\u008b\2\u06b6\u06b4\3"+
		"\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u0095\3\2\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bc\7\u01fb\2\2\u06bc\u06bd"+
		"\5\u0118\u008d\2\u06bd\u06bf\7\4\2\2\u06be\u06c0\5\u009eP\2\u06bf\u06be"+
		"\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\7\5\2\2\u06c2"+
		"\u0097\3\2\2\2\u06c3\u06c5\5\u00a8U\2\u06c4\u06c6\5\u0096L\2\u06c5\u06c4"+
		"\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c8\3\2\2\2\u06c7\u06c9\5\u009aN"+
		"\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06cb\3\2\2\2\u06ca\u06cc"+
		"\5\u00f6|\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ce\3\2\2"+
		"\2\u06cd\u06cf\5\u00ccg\2\u06ce\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf"+
		"\u06d0\3\2\2\2\u06d0\u06d2\5\u00a6T\2\u06d1\u06d3\5\u0110\u0089\2\u06d2"+
		"\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06d6\5n"+
		"8\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06da\3\2\2\2\u06d7"+
		"\u06d9\5\u0082B\2\u06d8\u06d7\3\2\2\2\u06d9\u06dc\3\2\2\2\u06da\u06d8"+
		"\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06f4\3\2\2\2\u06dc\u06da\3\2\2\2\u06dd"+
		"\u06de\7\4\2\2\u06de\u06df\5H%\2\u06df\u06e0\7\5\2\2\u06e0\u06e4\5\u00a6"+
		"T\2\u06e1\u06e3\5\u0082B\2\u06e2\u06e1\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4"+
		"\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06f4\3\2\2\2\u06e6\u06e4\3\2"+
		"\2\2\u06e7\u06e8\5\u0118\u008d\2\u06e8\u06ea\7\4\2\2\u06e9\u06eb\5\u009e"+
		"P\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec"+
		"\u06ed\7\5\2\2\u06ed\u06ee\5\u00a6T\2\u06ee\u06f4\3\2\2\2\u06ef\u06f0"+
		"\7\4\2\2\u06f0\u06f1\5f\64\2\u06f1\u06f2\7\5\2\2\u06f2\u06f4\3\2\2\2\u06f3"+
		"\u06c3\3\2\2\2\u06f3\u06dd\3\2\2\2\u06f3\u06e7\3\2\2\2\u06f3\u06ef\3\2"+
		"\2\2\u06f4\u0099\3\2\2\2\u06f5\u06f6\7\u00d9\2\2\u06f6\u06f7\5\u0118\u008d"+
		"\2\u06f7\u009b\3\2\2\2\u06f8\u06f9\7\u015a\2\2\u06f9\u06fa\7\4\2\2\u06fa"+
		"\u06fb\5\u009eP\2\u06fb\u06fc\7\5\2\2\u06fc\u009d\3\2\2\2\u06fd\u0702"+
		"\5\u00a0Q\2\u06fe\u06ff\7\6\2\2\u06ff\u0701\5\u00a0Q\2\u0700\u06fe\3\2"+
		"\2\2\u0701\u0704\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703"+
		"\u009f\3\2\2\2\u0704\u0702\3\2\2\2\u0705\u0706\5\u00a2R\2\u0706\u0707"+
		"\7\u01e4\2\2\u0707\u0708\5\u00a4S\2\u0708\u00a1\3\2\2\2\u0709\u070c\5"+
		"\u0118\u008d\2\u070a\u070c\5\u00f8}\2\u070b\u0709\3\2\2\2\u070b\u070a"+
		"\3\2\2\2\u070c\u00a3\3\2\2\2\u070d\u0710\5\u0118\u008d\2\u070e\u0710\5"+
		"\u00f8}\2\u070f\u070d\3\2\2\2\u070f\u070e\3\2\2\2\u0710\u00a5\3\2\2\2"+
		"\u0711\u0713\7\36\2\2\u0712\u0711\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714"+
		"\3\2\2\2\u0714\u0716\5\u011a\u008e\2\u0715\u0717\5\u0092J\2\u0716\u0715"+
		"\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0719\3\2\2\2\u0718\u0712\3\2\2\2\u0718"+
		"\u0719\3\2\2\2\u0719\u00a7\3\2\2\2\u071a\u071f\5\u0114\u008b\2\u071b\u071c"+
		"\7\7\2\2\u071c\u071e\5\u0114\u008b\2\u071d\u071b\3\2\2\2\u071e\u0721\3"+
		"\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u00a9\3\2\2\2\u0721"+
		"\u071f\3\2\2\2\u0722\u0727\5\u00acW\2\u0723\u0724\7\6\2\2\u0724\u0726"+
		"\5\u00acW\2\u0725\u0723\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725\3\2\2"+
		"\2\u0727\u0728\3\2\2\2\u0728\u00ab\3\2\2\2\u0729\u0727\3\2\2\2\u072a\u072d"+
		"\5\u0118\u008d\2\u072b\u072c\7O\2\2\u072c\u072e\7\u01fd\2\2\u072d\u072b"+
		"\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u00ad\3\2\2\2\u072f\u0734\5\u00b0Y"+
		"\2\u0730\u0731\7\6\2\2\u0731\u0733\5\u00b0Y\2\u0732\u0730\3\2\2\2\u0733"+
		"\u0736\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u00af\3\2"+
		"\2\2\u0736\u0734\3\2\2\2\u0737\u0738\5\u0118\u008d\2\u0738\u073a\5\u0106"+
		"\u0084\2\u0739\u073b\7\u00f2\2\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2"+
		"\2\u073b\u073d\3\2\2\2\u073c\u073e\5\u00caf\2\u073d\u073c\3\2\2\2\u073d"+
		"\u073e\3\2\2\2\u073e\u0743\3\2\2\2\u073f\u0741\7\u012f\2\2\u0740\u073f"+
		"\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0744\7\u0130\2"+
		"\2\u0743\u0740\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u074c\3\2\2\2\u0745\u074a"+
		"\7#\2\2\u0746\u0747\7\4\2\2\u0747\u0748\5\u011e\u0090\2\u0748\u0749\7"+
		"\5\2\2\u0749\u074b\3\2\2\2\u074a\u0746\3\2\2\2\u074a\u074b\3\2\2\2\u074b"+
		"\u074d\3\2\2\2\u074c\u0745\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u075c\3\2"+
		"\2\2\u074e\u075a\7\177\2\2\u074f\u075b\7\u0130\2\2\u0750\u075b\7\u0202"+
		"\2\2\u0751\u075b\7\u01fd\2\2\u0752\u075b\7d\2\2\u0753\u0758\7f\2\2\u0754"+
		"\u0755\7\4\2\2\u0755\u0756\5\u011e\u0090\2\u0756\u0757\7\5\2\2\u0757\u0759"+
		"\3\2\2\2\u0758\u0754\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075b\3\2\2\2\u075a"+
		"\u074f\3\2\2\2\u075a\u0750\3\2\2\2\u075a\u0751\3\2\2\2\u075a\u0752\3\2"+
		"\2\2\u075a\u0753\3\2\2\2\u075b\u075d\3\2\2\2\u075c\u074e\3\2\2\2\u075c"+
		"\u075d\3\2\2\2\u075d\u0767\3\2\2\2\u075e\u075f\7\u0135\2\2\u075f\u0760"+
		"\7\u01ce\2\2\u0760\u0765\7f\2\2\u0761\u0762\7\4\2\2\u0762\u0763\5\u011e"+
		"\u0090\2\u0763\u0764\7\5\2\2\u0764\u0766\3\2\2\2\u0765\u0761\3\2\2\2\u0765"+
		"\u0766\3\2\2\2\u0766\u0768\3\2\2\2\u0767\u075e\3\2\2\2\u0767\u0768\3\2"+
		"\2\2\u0768\u076b\3\2\2\2\u0769\u076a\7O\2\2\u076a\u076c\7\u01fd\2\2\u076b"+
		"\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u00b1\3\2\2\2\u076d\u0772\5\u00b4"+
		"[\2\u076e\u076f\7\6\2\2\u076f\u0771\5\u00b4[\2\u0770\u076e\3\2\2\2\u0771"+
		"\u0774\3\2\2\2\u0772\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u00b3\3\2"+
		"\2\2\u0774\u0772\3\2\2\2\u0775\u0776\7\u00d9\2\2\u0776\u0777\5\u0118\u008d"+
		"\2\u0777\u077a\5\u0092J\2\u0778\u0779\7\u01d1\2\2\u0779\u077b\t\23\2\2"+
		"\u077a\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u0781\3\2\2\2\u077c\u077d"+
		"\7\u015a\2\2\u077d\u077e\7\4\2\2\u077e\u077f\5\u009eP\2\u077f\u0780\7"+
		"\5\2\2\u0780\u0782\3\2\2\2\u0781\u077c\3\2\2\2\u0781\u0782\3\2\2\2\u0782"+
		"\u0785\3\2\2\2\u0783\u0784\7O\2\2\u0784\u0786\7\u01fd\2\2\u0785\u0783"+
		"\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u00b5\3\2\2\2\u0787\u078c\5\u00b8]"+
		"\2\u0788\u0789\7\6\2\2\u0789\u078b\5\u00b8]\2\u078a\u0788\3\2\2\2\u078b"+
		"\u078e\3\2\2\2\u078c\u078a\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u00b7\3\2"+
		"\2\2\u078e\u078c\3\2\2\2\u078f\u0794\5\u00ba^\2\u0790\u0794\5\u00bc_\2"+
		"\u0791\u0794\5\u00be`\2\u0792\u0794\5\u00c0a\2\u0793\u078f\3\2\2\2\u0793"+
		"\u0790\3\2\2\2\u0793\u0791\3\2\2\2\u0793\u0792\3\2\2\2\u0794\u0799\3\2"+
		"\2\2\u0795\u0796\7\4\2\2\u0796\u0797\5\u009eP\2\u0797\u0798\7\5\2\2\u0798"+
		"\u079a\3\2\2\2\u0799\u0795\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u00b9\3\2"+
		"\2\2\u079b\u079f\7\u0141\2\2\u079c\u079d\7\u00d4\2\2\u079d\u079e\7\u012f"+
		"\2\2\u079e\u07a0\7\u00a4\2\2\u079f\u079c\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0"+
		"\u07a1\3\2\2\2\u07a1\u07a2\5\u0118\u008d\2\u07a2\u07a3\7\u01d3\2\2\u07a3"+
		"\u07a4\7\u00fc\2\2\u07a4\u07a7\7\u01b5\2\2\u07a5\u07a8\7\u011b\2\2\u07a6"+
		"\u07a8\5\u00c2b\2\u07a7\u07a5\3\2\2\2\u07a7\u07a6\3\2\2\2\u07a8\u00bb"+
		"\3\2\2\2\u07a9\u07ad\7\u0141\2\2\u07aa\u07ab\7\u00d4\2\2\u07ab\u07ac\7"+
		"\u012f\2\2\u07ac\u07ae\7\u00a4\2\2\u07ad\u07aa\3\2\2\2\u07ad\u07ae\3\2"+
		"\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0\5\u0118\u008d\2\u07b0\u07b1\7\u01d3"+
		"\2\2\u07b1\u07b2\7\b\2\2\u07b2\u07b3\5\u00c2b\2\u07b3\u07b4\7\6\2\2\u07b4"+
		"\u07b5\5\u00c2b\2\u07b5\u07b6\7\5\2\2\u07b6\u00bd\3\2\2\2\u07b7\u07b8"+
		"\7\u00bb\2\2\u07b8\u07b9\5\u00c2b\2\u07b9\u07ba\7\u01bc\2\2\u07ba\u07bb"+
		"\5\u00c2b\2\u07bb\u07bc\7\u00e3\2\2\u07bc\u07be\7\u0202\2\2\u07bd\u07bf"+
		"\5\u00e2r\2\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u00bf\3\2\2"+
		"\2\u07c0\u07c4\7\u0141\2\2\u07c1\u07c2\7\u00d4\2\2\u07c2\u07c3\7\u012f"+
		"\2\2\u07c3\u07c5\7\u00a4\2\2\u07c4\u07c1\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u07c6\3\2\2\2\u07c6\u07d7\5\u0118\u008d\2\u07c7\u07c8\7\u01d3\2\2\u07c8"+
		"\u07d5\7\u00d7\2\2\u07c9\u07ca\7\4\2\2\u07ca\u07cf\5\u00c2b\2\u07cb\u07cc"+
		"\7\6\2\2\u07cc\u07ce\5\u00c2b\2\u07cd\u07cb\3\2\2\2\u07ce\u07d1\3\2\2"+
		"\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07cf"+
		"\3\2\2\2\u07d2\u07d3\7\5\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d6\5\u00c2b"+
		"\2\u07d5\u07c9\3\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u07d8\3\2\2\2\u07d7\u07c7"+
		"\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u00c1\3\2\2\2\u07d9\u07da\7\4\2\2\u07da"+
		"\u07df\5\u00c4c\2\u07db\u07dc\7\6\2\2\u07dc\u07de\5\u00c4c\2\u07dd\u07db"+
		"\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0"+
		"\u07e2\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e3\7\5\2\2\u07e3\u00c3\3\2"+
		"\2\2\u07e4\u07e5\t\24\2\2\u07e5\u00c5\3\2\2\2\u07e6\u07eb\5\u00c8e\2\u07e7"+
		"\u07e8\7\6\2\2\u07e8\u07ea\5\u00c8e\2\u07e9\u07e7\3\2\2\2\u07ea\u07ed"+
		"\3\2\2\2\u07eb\u07e9\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u00c7\3\2\2\2\u07ed"+
		"\u07eb\3\2\2\2\u07ee\u07ef\5\u0118\u008d\2\u07ef\u07f3\5\u0092J\2\u07f0"+
		"\u07f1\7\u0093\2\2\u07f1\u07f2\7\u00f2\2\2\u07f2\u07f4\5\u0092J\2\u07f3"+
		"\u07f0\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f6\3\2\2\2\u07f5\u07f7\5\u009c"+
		"O\2\u07f6\u07f5\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u00c9\3\2\2\2\u07f8"+
		"\u07f9\t\25\2\2\u07f9\u00cb\3\2\2\2\u07fa\u07fb\7\u01ae\2\2\u07fb\u07fc"+
		"\7\4\2\2\u07fc\u0801\7\u0202\2\2\u07fd\u07fe\7\6\2\2\u07fe\u0800\7\u0202"+
		"\2\2\u07ff\u07fd\3\2\2\2\u0800\u0803\3\2\2\2\u0801\u07ff\3\2\2\2\u0801"+
		"\u0802\3\2\2\2\u0802\u0804\3\2\2\2\u0803\u0801\3\2\2\2\u0804\u0805\7\5"+
		"\2\2\u0805\u00cd\3\2\2\2\u0806\u0807\7\u01d3\2\2\u0807\u080c\5\u00dan"+
		"\2\u0808\u0809\7\6\2\2\u0809\u080b\5\u00dan\2\u080a\u0808\3\2\2\2\u080b"+
		"\u080e\3\2\2\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u00cf\3\2"+
		"\2\2\u080e\u080c\3\2\2\2\u080f\u0814\5\u00d4k\2\u0810\u0812\7\36\2\2\u0811"+
		"\u0810\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\5("+
		"\25\2\u0814\u0811\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u00d1\3\2\2\2\u0816"+
		"\u081b\5\u00d0i\2\u0817\u0818\7\6\2\2\u0818\u081a\5\u00d0i\2\u0819\u0817"+
		"\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c"+
		"\u00d3\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u0821\5\u00d8m\2\u081f\u0821"+
		"\5\u00d6l\2\u0820\u081e\3\2\2\2\u0820\u081f\3\2\2\2\u0821\u00d5\3\2\2"+
		"\2\u0822\u0823\5\u0114\u008b\2\u0823\u0824\7\u01f8\2\2\u0824\u0825\5\u00d8"+
		"m\2\u0825\u0833\3\2\2\2\u0826\u0827\7\4\2\2\u0827\u082a\5\u0114\u008b"+
		"\2\u0828\u0829\7\6\2\2\u0829\u082b\5\u0114\u008b\2\u082a\u0828\3\2\2\2"+
		"\u082b\u082c\3\2\2\2\u082c\u082a\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082e"+
		"\3\2\2\2\u082e\u082f\7\5\2\2\u082f\u0830\7\u01f8\2\2\u0830\u0831\5\u00d8"+
		"m\2\u0831\u0833\3\2\2\2\u0832\u0822\3\2\2\2\u0832\u0826\3\2\2\2\u0833"+
		"\u00d7\3\2\2\2\u0834\u0835\bm\1\2\u0835\u0836\t\26\2\2\u0836\u084b\5\u00d8"+
		"m\n\u0837\u0838\7\u00a4\2\2\u0838\u0839\7\4\2\2\u0839\u083a\5H%\2\u083a"+
		"\u083b\7\5\2\2\u083b\u084b\3\2\2\2\u083c\u083d\t\27\2\2\u083d\u083e\7"+
		"\4\2\2\u083e\u083f\5\u00e0q\2\u083f\u0840\7\5\2\2\u0840\u084b\3\2\2\2"+
		"\u0841\u0842\7\u00e9\2\2\u0842\u0843\7\4\2\2\u0843\u0844\5\u00e0q\2\u0844"+
		"\u0845\7\5\2\2\u0845\u084b\3\2\2\2\u0846\u0848\5\u00e0q\2\u0847\u0849"+
		"\5\u00dep\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084b\3\2\2"+
		"\2\u084a\u0834\3\2\2\2\u084a\u0837\3\2\2\2\u084a\u083c\3\2\2\2\u084a\u0841"+
		"\3\2\2\2\u084a\u0846\3\2\2\2\u084b\u0857\3\2\2\2\u084c\u084d\f\5\2\2\u084d"+
		"\u084e\t\30\2\2\u084e\u0856\5\u00d8m\6\u084f\u0850\f\4\2\2\u0850\u0851"+
		"\7\u0139\2\2\u0851\u0856\5\u00d8m\5\u0852\u0853\f\3\2\2\u0853\u0854\7"+
		"\u01f5\2\2\u0854\u0856\5\u00d8m\4\u0855\u084c\3\2\2\2\u0855\u084f\3\2"+
		"\2\2\u0855\u0852\3\2\2\2\u0856\u0859\3\2\2\2\u0857\u0855\3\2\2\2\u0857"+
		"\u0858\3\2\2\2\u0858\u00d9\3\2\2\2\u0859\u0857\3\2\2\2\u085a\u0863\7\4"+
		"\2\2\u085b\u0860\5\u00dco\2\u085c\u085d\7\6\2\2\u085d\u085f\5\u00dco\2"+
		"\u085e\u085c\3\2\2\2\u085f\u0862\3\2\2\2\u0860\u085e\3\2\2\2\u0860\u0861"+
		"\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0863\u085b\3\2\2\2\u0863"+
		"\u0864\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\7\5\2\2\u0866\u00db\3\2"+
		"\2\2\u0867\u086a\5\u00d0i\2\u0868\u086a\7\177\2\2\u0869\u0867\3\2\2\2"+
		"\u0869\u0868\3\2\2\2\u086a\u00dd\3\2\2\2\u086b\u086d\7\u012f\2\2\u086c"+
		"\u086b\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u086f\7)"+
		"\2\2\u086f\u0870\5\u00e0q\2\u0870\u0871\7\31\2\2\u0871\u0872\5\u00e0q"+
		"\2\u0872\u089a\3\2\2\2\u0873\u0875\7\u012f\2\2\u0874\u0873\3\2\2\2\u0874"+
		"\u0875\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\t\31\2\2\u0877\u089a\5"+
		"\u00e0q\2\u0878\u087a\7\u012f\2\2\u0879\u0878\3\2\2\2\u0879\u087a\3\2"+
		"\2\2\u087a\u087b\3\2\2\2\u087b\u087c\t\32\2\2\u087c\u089a\5\u00e0q\2\u087d"+
		"\u087f\7\u012f\2\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880"+
		"\3\2\2\2\u0880\u0881\7\u00d7\2\2\u0881\u0882\7\4\2\2\u0882\u0883\5H%\2"+
		"\u0883\u0884\7\5\2\2\u0884\u089a\3\2\2\2\u0885\u0887\7\u012f\2\2\u0886"+
		"\u0885\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\7\u00d7"+
		"\2\2\u0889\u088a\7\4\2\2\u088a\u088f\5\u00d4k\2\u088b\u088c\7\6\2\2\u088c"+
		"\u088e\5\u00d4k\2\u088d\u088b\3\2\2\2\u088e\u0891\3\2\2\2\u088f\u088d"+
		"\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\3\2\2\2\u0891\u088f\3\2\2\2\u0892"+
		"\u0893\7\5\2\2\u0893\u089a\3\2\2\2\u0894\u0896\7\u00e8\2\2\u0895\u0897"+
		"\7\u012f\2\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0898\3\2\2"+
		"\2\u0898\u089a\7\u0130\2\2\u0899\u086c\3\2\2\2\u0899\u0874\3\2\2\2\u0899"+
		"\u0879\3\2\2\2\u0899\u087e\3\2\2\2\u0899\u0886\3\2\2\2\u0899\u0894\3\2"+
		"\2\2\u089a\u00df\3\2\2\2\u089b\u089c\bq\1\2\u089c\u08a7\5\u00e4s\2\u089d"+
		"\u089e\t\33\2\2\u089e\u08a7\5\u00e0q\7\u089f\u08a0\t\34\2\2\u08a0\u08a1"+
		"\7\4\2\2\u08a1\u08a2\5\u00e0q\2\u08a2\u08a3\7\6\2\2\u08a3\u08a4\5\u00e0"+
		"q\2\u08a4\u08a5\7\5\2\2\u08a5\u08a7\3\2\2\2\u08a6\u089b\3\2\2\2\u08a6"+
		"\u089d\3\2\2\2\u08a6\u089f\3\2\2\2\u08a7\u08b4\3\2\2\2\u08a8\u08a9\f\6"+
		"\2\2\u08a9\u08aa\t\35\2\2\u08aa\u08b3\5\u00e0q\7\u08ab\u08ac\f\5\2\2\u08ac"+
		"\u08ad\t\36\2\2\u08ad\u08b3\5\u00e0q\6\u08ae\u08af\f\4\2\2\u08af\u08b0"+
		"\5\u00fa~\2\u08b0\u08b1\5\u00e0q\5\u08b1\u08b3\3\2\2\2\u08b2\u08a8\3\2"+
		"\2\2\u08b2\u08ab\3\2\2\2\u08b2\u08ae\3\2\2\2\u08b3\u08b6\3\2\2\2\u08b4"+
		"\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u00e1\3\2\2\2\u08b6\u08b4\3\2"+
		"\2\2\u08b7\u08b8\t\37\2\2\u08b8\u00e3\3\2\2\2\u08b9\u08ba\bs\1\2\u08ba"+
		"\u08bb\t \2\2\u08bb\u08bc\7\4\2\2\u08bc\u08bd\5\u00e2r\2\u08bd\u08be\7"+
		"\6\2\2\u08be\u08bf\5\u00e0q\2\u08bf\u08c0\7\6\2\2\u08c0\u08c1\5\u00e0"+
		"q\2\u08c1\u08c2\7\5\2\2\u08c2\u0981\3\2\2\2\u08c3\u08c4\t!\2\2\u08c4\u08c5"+
		"\7\4\2\2\u08c5\u08c6\5\u00e2r\2\u08c6\u08c7\7\6\2\2\u08c7\u08c8\5\u00e0"+
		"q\2\u08c8\u08c9\7\6\2\2\u08c9\u08ca\5\u00e0q\2\u08ca\u08cb\7\5\2\2\u08cb"+
		"\u0981\3\2\2\2\u08cc\u08cd\t\"\2\2\u08cd\u08ce\7\4\2\2\u08ce\u08cf\5\u00e0"+
		"q\2\u08cf\u08d5\7\6\2\2\u08d0\u08d1\7\u00e3\2\2\u08d1\u08d2\5\u00e0q\2"+
		"\u08d2\u08d3\5\u00e2r\2\u08d3\u08d6\3\2\2\2\u08d4\u08d6\5\u00e0q\2\u08d5"+
		"\u08d0\3\2\2\2\u08d5\u08d4\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\7\5"+
		"\2\2\u08d8\u0981\3\2\2\2\u08d9\u08da\t#\2\2\u08da\u08db\7\4\2\2\u08db"+
		"\u08dc\5\u00e0q\2\u08dc\u08e2\7\6\2\2\u08dd\u08de\7\u00e3\2\2\u08de\u08df"+
		"\5\u00e0q\2\u08df\u08e0\5\u00e2r\2\u08e0\u08e3\3\2\2\2\u08e1\u08e3\5\u00e0"+
		"q\2\u08e2\u08dd\3\2\2\2\u08e2\u08e1\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4"+
		"\u08e5\7\5\2\2\u08e5\u0981\3\2\2\2\u08e6\u08e7\7";
	private static final String _serializedATNSegment1 =
		"o\2\2\u08e7\u08e8\7\4\2\2\u08e8\u08e9\5\u00e0q\2\u08e9\u08ef\7\6\2\2\u08ea"+
		"\u08eb\7\u00e3\2\2\u08eb\u08ec\5\u00e0q\2\u08ec\u08ed\5\u00e2r\2\u08ed"+
		"\u08f0\3\2\2\2\u08ee\u08f0\5\u00e0q\2\u08ef\u08ea\3\2\2\2\u08ef\u08ee"+
		"\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2\7\5\2\2\u08f2\u0981\3\2\2\2\u08f3"+
		"\u08f4\7m\2\2\u08f4\u08f5\7\4\2\2\u08f5\u08f6\5\u00e0q\2\u08f6\u08fc\7"+
		"\6\2\2\u08f7\u08f8\7\u00e3\2\2\u08f8\u08f9\5\u00e0q\2\u08f9\u08fa\5\u00e2"+
		"r\2\u08fa\u08fd\3\2\2\2\u08fb\u08fd\5\u00e0q\2\u08fc\u08f7\3\2\2\2\u08fc"+
		"\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\7\5\2\2\u08ff\u0981\3\2"+
		"\2\2\u0900\u0901\t$\2\2\u0901\u0902\7\4\2\2\u0902\u0903\5\u00e0q\2\u0903"+
		"\u0904\7\6\2\2\u0904\u0905\5\u00e0q\2\u0905\u090b\7\6\2\2\u0906\u0907"+
		"\7\u00e3\2\2\u0907\u0908\5\u00e0q\2\u0908\u0909\5\u00e2r\2\u0909\u090c"+
		"\3\2\2\2\u090a\u090c\5\u00e0q\2\u090b\u0906\3\2\2\2\u090b\u090a\3\2\2"+
		"\2\u090c\u090d\3\2\2\2\u090d\u090e\7\5\2\2\u090e\u0981\3\2\2\2\u090f\u0981"+
		"\7d\2\2\u0910\u0981\7e\2\2\u0911\u0981\7f\2\2\u0912\u0981\7\u0105\2\2"+
		"\u0913\u0981\7\u0106\2\2\u0914\u0981\7g\2\2\u0915\u0917\7?\2\2\u0916\u0918"+
		"\5\u00fe\u0080\2\u0917\u0916\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u0917\3"+
		"\2\2\2\u0919\u091a\3\2\2\2\u091a\u091d\3\2\2\2\u091b\u091c\7\u0095\2\2"+
		"\u091c\u091e\5\u00d4k\2\u091d\u091b\3\2\2\2\u091d\u091e\3\2\2\2\u091e"+
		"\u091f\3\2\2\2\u091f\u0920\7\u0099\2\2\u0920\u0981\3\2\2\2\u0921\u0922"+
		"\7?\2\2\u0922\u0924\5\u00d4k\2\u0923\u0925\5\u00fe\u0080\2\u0924\u0923"+
		"\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0924\3\2\2\2\u0926\u0927\3\2\2\2\u0927"+
		"\u092a\3\2\2\2\u0928\u0929\7\u0095\2\2\u0929\u092b\5\u00d4k\2\u092a\u0928"+
		"\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092d\7\u0099\2"+
		"\2\u092d\u0981\3\2\2\2\u092e\u092f\7@\2\2\u092f\u0930\7\4\2\2\u0930\u0931"+
		"\5\u00d4k\2\u0931\u0932\7\36\2\2\u0932\u0933\5\u0106\u0084\2\u0933\u0934"+
		"\7\5\2\2\u0934\u0981\3\2\2\2\u0935\u0981\5\u00f8}\2\u0936\u0981\5\u0100"+
		"\u0081\2\u0937\u0981\7\u01ed\2\2\u0938\u0939\5\u00f4{\2\u0939\u093a\7"+
		"\7\2\2\u093a\u093b\7\u01ed\2\2\u093b\u0981\3\2\2\2\u093c\u093d\7D\2\2"+
		"\u093d\u093e\7\4\2\2\u093e\u0943\5\u00d4k\2\u093f\u0940\7\6\2\2\u0940"+
		"\u0942\5\u00d4k\2\u0941\u093f\3\2\2\2\u0942\u0945\3\2\2\2\u0943\u0941"+
		"\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0948\3\2\2\2\u0945\u0943\3\2\2\2\u0946"+
		"\u0947\7\u01d1\2\2\u0947\u0949\5(\25\2\u0948\u0946\3\2\2\2\u0948\u0949"+
		"\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\7\5\2\2\u094b\u0981\3\2\2\2\u094c"+
		"\u094d\7Z\2\2\u094d\u094e\7\4\2\2\u094e\u094f\5\u00d4k\2\u094f\u0950\7"+
		"\u01d1\2\2\u0950\u0951\5(\25\2\u0951\u0952\7\5\2\2\u0952\u0981\3\2\2\2"+
		"\u0953\u0954\7Z\2\2\u0954\u0955\7\4\2\2\u0955\u0956\5\u00d4k\2\u0956\u0957"+
		"\7\6\2\2\u0957\u0958\5\u0106\u0084\2\u0958\u0959\7\5\2\2\u0959\u0981\3"+
		"\2\2\2\u095a\u0981\5\u00e6t\2\u095b\u095c\7\4\2\2\u095c\u095d\5H%\2\u095d"+
		"\u095e\7\5\2\2\u095e\u0981\3\2\2\2\u095f\u0960\7\u01fb\2\2\u0960\u0981"+
		"\5(\25\2\u0961\u0964\7\u01fc\2\2\u0962\u0963\t%\2\2\u0963\u0965\7\7\2"+
		"\2\u0964\u0962\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0981"+
		"\5\u0118\u008d\2\u0967\u0969\7,\2\2\u0968\u0967\3\2\2\2\u0968\u0969\3"+
		"\2\2\2\u0969\u096a\3\2\2\2\u096a\u0981\5\u0118\u008d\2\u096b\u096c\7\4"+
		"\2\2\u096c\u096d\5\u00d4k\2\u096d\u096e\7\5\2\2\u096e\u0981\3\2\2\2\u096f"+
		"\u0973\7\u00f2\2\2\u0970\u0971\5\u0118\u008d\2\u0971\u0972\7\7\2\2\u0972"+
		"\u0974\3\2\2\2\u0973\u0970\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975\3\2"+
		"\2\2\u0975\u0981\5\u0118\u008d\2\u0976\u0977\7\u00aa\2\2\u0977\u0978\7"+
		"\4\2\2\u0978\u0979\5\u0118\u008d\2\u0979\u097b\7\u00bb\2\2\u097a\u097c"+
		"\t&\2\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\3\2\2\2\u097d"+
		"\u097e\5\u00e0q\2\u097e\u097f\7\5\2\2\u097f\u0981\3\2\2\2\u0980\u08b9"+
		"\3\2\2\2\u0980\u08c3\3\2\2\2\u0980\u08cc\3\2\2\2\u0980\u08d9\3\2\2\2\u0980"+
		"\u08e6\3\2\2\2\u0980\u08f3\3\2\2\2\u0980\u0900\3\2\2\2\u0980\u090f\3\2"+
		"\2\2\u0980\u0910\3\2\2\2\u0980\u0911\3\2\2\2\u0980\u0912\3\2\2\2\u0980"+
		"\u0913\3\2\2\2\u0980\u0914\3\2\2\2\u0980\u0915\3\2\2\2\u0980\u0921\3\2"+
		"\2\2\u0980\u092e\3\2\2\2\u0980\u0935\3\2\2\2\u0980\u0936\3\2\2\2\u0980"+
		"\u0937\3\2\2\2\u0980\u0938\3\2\2\2\u0980\u093c\3\2\2\2\u0980\u094c\3\2"+
		"\2\2\u0980\u0953\3\2\2\2\u0980\u095a\3\2\2\2\u0980\u095b\3\2\2\2\u0980"+
		"\u095f\3\2\2\2\u0980\u0961\3\2\2\2\u0980\u0968\3\2\2\2\u0980\u096b\3\2"+
		"\2\2\u0980\u096f\3\2\2\2\u0980\u0976\3\2\2\2\u0981\u099c\3\2\2\2\u0982"+
		"\u0983\f\r\2\2\u0983\u0984\7\b\2\2\u0984\u0985\5\u00e0q\2\u0985\u0986"+
		"\7\t\2\2\u0986\u099b\3\2\2\2\u0987\u0988\f\f\2\2\u0988\u0989\7\b\2\2\u0989"+
		"\u098a\5\u00e0q\2\u098a\u098c\7\u01f7\2\2\u098b\u098d\5\u00e0q\2\u098c"+
		"\u098b\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\7\t"+
		"\2\2\u098f\u099b\3\2\2\2\u0990\u0991\f\7\2\2\u0991\u0992\7\7\2\2\u0992"+
		"\u099b\5\u0118\u008d\2\u0993\u0994\f\3\2\2\u0994\u0998\7J\2\2\u0995\u0999"+
		"\5\u0118\u008d\2\u0996\u0999\7\u01fd\2\2\u0997\u0999\7\177\2\2\u0998\u0995"+
		"\3\2\2\2\u0998\u0996\3\2\2\2\u0998\u0997\3\2\2\2\u0999\u099b\3\2\2\2\u099a"+
		"\u0982\3\2\2\2\u099a\u0987\3\2\2\2\u099a\u0990\3\2\2\2\u099a\u0993\3\2"+
		"\2\2\u099b\u099e\3\2\2\2\u099c\u099a\3\2\2\2\u099c\u099d\3\2\2\2\u099d"+
		"\u00e5\3\2\2\2\u099e\u099c\3\2\2\2\u099f\u09a0\5\u00e8u\2\u09a0\u09b8"+
		"\7\4\2\2\u09a1\u09a3\t\20\2\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3\3\2\2\2"+
		"\u09a3\u09a4\3\2\2\2\u09a4\u09a9\5\u00d4k\2\u09a5\u09a6\7\6\2\2\u09a6"+
		"\u09a8\5\u00d4k\2\u09a7\u09a5\3\2\2\2\u09a8\u09ab\3\2\2\2\u09a9\u09a7"+
		"\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09b6\3\2\2\2\u09ab\u09a9\3\2\2\2\u09ac"+
		"\u09ad\7\u013a\2\2\u09ad\u09ae\7;\2\2\u09ae\u09b3\5\u0088E\2\u09af\u09b0"+
		"\7\6\2\2\u09b0\u09b2\5\u0088E\2\u09b1\u09af\3\2\2\2\u09b2\u09b5\3\2\2"+
		"\2\u09b3\u09b1\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u09b7\3\2\2\2\u09b5\u09b3"+
		"\3\2\2\2\u09b6\u09ac\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b9\3\2\2\2\u09b8"+
		"\u09a2\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bd\7\5"+
		"\2\2\u09bb\u09bc\7\u013d\2\2\u09bc\u09be\5\u00ecw\2\u09bd\u09bb\3\2\2"+
		"\2\u09bd\u09be\3\2\2\2\u09be\u00e7\3\2\2\2\u09bf\u09c0\5\u0118\u008d\2"+
		"\u09c0\u09c1\7\7\2\2\u09c1\u09c3\3\2\2\2\u09c2\u09bf\3\2\2\2\u09c2\u09c3"+
		"\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\5\u00eav\2\u09c5\u00e9\3\2\2"+
		"\2\u09c6\u09d6\5\u0118\u008d\2\u09c7\u09d6\7\16\2\2\u09c8\u09d6\7V\2\2"+
		"\u09c9\u09d6\7c\2\2\u09ca\u09d6\7g\2\2\u09cb\u09d6\7i\2\2\u09cc\u09d6"+
		"\7\u00d4\2\2\u09cd\u09d6\7\u00fb\2\2\u09ce\u09d6\7\u00fe\2\2\u09cf\u09d6"+
		"\7\u0143\2\2\u09d0\u09d6\7\u0169\2\2\u09d1\u09d6\7\u017b\2\2\u09d2\u09d6"+
		"\7\u0188\2\2\u09d3\u09d6\7\u01c1\2\2\u09d4\u09d6\7\u01d0\2\2\u09d5\u09c6"+
		"\3\2\2\2\u09d5\u09c7\3\2\2\2\u09d5\u09c8\3\2\2\2\u09d5\u09c9\3\2\2\2\u09d5"+
		"\u09ca\3\2\2\2\u09d5\u09cb\3\2\2\2\u09d5\u09cc\3\2\2\2\u09d5\u09cd\3\2"+
		"\2\2\u09d5\u09ce\3\2\2\2\u09d5\u09cf\3\2\2\2\u09d5\u09d0\3\2\2\2\u09d5"+
		"\u09d1\3\2\2\2\u09d5\u09d2\3\2\2\2\u09d5\u09d3\3\2\2\2\u09d5\u09d4\3\2"+
		"\2\2\u09d6\u00eb\3\2\2\2\u09d7\u09d9\7\4\2\2\u09d8\u09da\5\u008cG\2\u09d9"+
		"\u09d8\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09dc\3\2\2\2\u09db\u09dd\5\u0086"+
		"D\2\u09dc\u09db\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09df\3\2\2\2\u09de"+
		"\u09e0\5\u00eex\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1"+
		"\3\2\2\2\u09e1\u09e2\7\5\2\2\u09e2\u00ed\3\2\2\2\u09e3\u09e4\5\u00f0y"+
		"\2\u09e4\u09e5\5\u00f2z\2\u09e5\u09ed\3\2\2\2\u09e6\u09e7\5\u00f0y\2\u09e7"+
		"\u09e8\7)\2\2\u09e8\u09e9\5\u00f2z\2\u09e9\u09ea\7\31\2\2\u09ea\u09eb"+
		"\5\u00f2z\2\u09eb\u09ed\3\2\2\2\u09ec\u09e3\3\2\2\2\u09ec\u09e6\3\2\2"+
		"\2\u09ed\u00ef\3\2\2\2\u09ee\u09ef\t\'\2\2\u09ef\u00f1\3\2\2\2\u09f0\u09f1"+
		"\7\u01c7\2\2\u09f1\u09f8\t(\2\2\u09f2\u09f3\7b\2\2\u09f3\u09f8\7\u0182"+
		"\2\2\u09f4\u09f5\5\u00d4k\2\u09f5\u09f6\t(\2\2\u09f6\u09f8\3\2\2\2\u09f7"+
		"\u09f0\3\2\2\2\u09f7\u09f2\3\2\2\2\u09f7\u09f4\3\2\2\2\u09f8\u00f3\3\2"+
		"\2\2\u09f9\u09fe\5\u0118\u008d\2\u09fa\u09fb\7\7\2\2\u09fb\u09fd\5\u0118"+
		"\u008d\2\u09fc\u09fa\3\2\2\2\u09fd\u0a00\3\2\2\2\u09fe\u09fc\3\2\2\2\u09fe"+
		"\u09ff\3\2\2\2\u09ff\u00f5\3\2\2\2\u0a00\u09fe\3\2\2\2\u0a01\u0a03\7\u01b2"+
		"\2\2\u0a02\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04"+
		"\u0a07\7\u0141\2\2\u0a05\u0a08\5\u0118\u008d\2\u0a06\u0a08\5\u0092J\2"+
		"\u0a07\u0a05\3\2\2\2\u0a07\u0a06\3\2\2\2\u0a08\u0a0f\3\2\2\2\u0a09\u0a0b"+
		"\7\u01b2\2\2\u0a0a\u0a09\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0c\3\2\2"+
		"\2\u0a0c\u0a0d\7\u0142\2\2\u0a0d\u0a0f\5\u0092J\2\u0a0e\u0a02\3\2\2\2"+
		"\u0a0e\u0a0a\3\2\2\2\u0a0f\u00f7\3\2\2\2\u0a10\u0a43\7\u0130\2\2\u0a11"+
		"\u0a12\t)\2\2\u0a12\u0a43\7\u01fd\2\2\u0a13\u0a43\5\u011e\u0090\2\u0a14"+
		"\u0a43\5\u00fc\177\2\u0a15\u0a17\7,\2\2\u0a16\u0a15\3\2\2\2\u0a16\u0a17"+
		"\3\2\2\2\u0a17\u0a18\3\2\2\2\u0a18\u0a43\7\u01fd\2\2\u0a19\u0a1b\7\b\2"+
		"\2\u0a1a\u0a1c\5\u00f8}\2\u0a1b\u0a1a\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c"+
		"\u0a21\3\2\2\2\u0a1d\u0a1e\7\6\2\2\u0a1e\u0a20\5\u00f8}\2\u0a1f\u0a1d"+
		"\3\2\2\2\u0a20\u0a23\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22"+
		"\u0a24\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a24\u0a43\7\t\2\2\u0a25\u0a2a\7\n"+
		"\2\2\u0a26\u0a27\5\u00f8}\2\u0a27\u0a28\7\u01f7\2\2\u0a28\u0a29\5\u00f8"+
		"}\2\u0a29\u0a2b\3\2\2\2\u0a2a\u0a26\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b"+
		"\u0a33\3\2\2\2\u0a2c\u0a2d\7\6\2\2\u0a2d\u0a2e\5\u00f8}\2\u0a2e\u0a2f"+
		"\7\u01f7\2\2\u0a2f\u0a30\5\u00f8}\2\u0a30\u0a32\3\2\2\2\u0a31\u0a2c\3"+
		"\2\2\2\u0a32\u0a35\3\2\2\2\u0a33\u0a31\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34"+
		"\u0a36\3\2\2\2\u0a35\u0a33\3\2\2\2\u0a36\u0a43\7\13\2\2\u0a37\u0a38\7"+
		"\n\2\2\u0a38\u0a3d\5\u00f8}\2\u0a39\u0a3a\7\6\2\2\u0a3a\u0a3c\5\u00f8"+
		"}\2\u0a3b\u0a39\3\2\2\2\u0a3c\u0a3f\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3d"+
		"\u0a3e\3\2\2\2\u0a3e\u0a40\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a40\u0a41\7\13"+
		"\2\2\u0a41\u0a43\3\2\2\2\u0a42\u0a10\3\2\2\2\u0a42\u0a11\3\2\2\2\u0a42"+
		"\u0a13\3\2\2\2\u0a42\u0a14\3\2\2\2\u0a42\u0a16\3\2\2\2\u0a42\u0a19\3\2"+
		"\2\2\u0a42\u0a25\3\2\2\2\u0a42\u0a37\3\2\2\2\u0a43\u00f9\3\2\2\2\u0a44"+
		"\u0a45\t*\2\2\u0a45\u00fb\3\2\2\2\u0a46\u0a47\t+\2\2\u0a47\u00fd\3\2\2"+
		"\2\u0a48\u0a49\7\u01dc\2\2\u0a49\u0a4a\5\u00d4k\2\u0a4a\u0a4b\7\u01b6"+
		"\2\2\u0a4b\u0a4c\5\u00d4k\2\u0a4c\u00ff\3\2\2\2\u0a4d\u0a4e\7\u00e3\2"+
		"\2\u0a4e\u0a4f\5\u00d4k\2\u0a4f\u0a50\5\u0102\u0082\2\u0a50\u0101\3\2"+
		"\2\2\u0a51\u0a52\t\37\2\2\u0a52\u0103\3\2\2\2\u0a53\u0a58\5\u0106\u0084"+
		"\2\u0a54\u0a56\7\u012f\2\2\u0a55\u0a54\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56"+
		"\u0a57\3\2\2\2\u0a57\u0a59\7\u0130\2\2\u0a58\u0a55\3\2\2\2\u0a58\u0a59"+
		"\3\2\2\2\u0a59\u0105\3\2\2\2\u0a5a\u0a5b\7\34\2\2\u0a5b\u0a5c\7\u01e7"+
		"\2\2\u0a5c\u0a5d\5\u0106\u0084\2\u0a5d\u0a5e\7\u01e9\2\2\u0a5e\u0a88\3"+
		"\2\2\2\u0a5f\u0a60\7\u010c\2\2\u0a60\u0a61\7\u01e7\2\2\u0a61\u0a62\5\u0106"+
		"\u0084\2\u0a62\u0a63\7\6\2\2\u0a63\u0a64\5\u0106\u0084\2\u0a64\u0a65\7"+
		"\u01e9\2\2\u0a65\u0a88\3\2\2\2\u0a66\u0a67\7\u01a4\2\2\u0a67\u0a68\7\u01e7"+
		"\2\2\u0a68\u0a69\5\u010a\u0086\2\u0a69\u0a6a\7\u01e9\2\2\u0a6a\u0a88\3"+
		"\2\2\2\u0a6b\u0a6c\7\22\2\2\u0a6c\u0a6d\7\u01e7\2\2\u0a6d\u0a6e\5\u00ea"+
		"v\2\u0a6e\u0a6f\7\4\2\2\u0a6f\u0a74\5\u0104\u0083\2\u0a70\u0a71\7\6\2"+
		"\2\u0a71\u0a73\5\u0104\u0083\2\u0a72\u0a70\3\2\2\2\u0a73\u0a76\3\2\2\2"+
		"\u0a74\u0a72\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a77\3\2\2\2\u0a76\u0a74"+
		"\3\2\2\2\u0a77\u0a78\7\5\2\2\u0a78\u0a79\7\u01e9\2\2\u0a79\u0a88\3\2\2"+
		"\2\u0a7a\u0a85\5\u0108\u0085\2\u0a7b\u0a7c\7\4\2\2\u0a7c\u0a81\t,\2\2"+
		"\u0a7d\u0a7e\7\6\2\2\u0a7e\u0a80\7\u0202\2\2\u0a7f\u0a7d\3\2\2\2\u0a80"+
		"\u0a83\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a81\u0a82\3\2\2\2\u0a82\u0a84\3\2"+
		"\2\2\u0a83\u0a81\3\2\2\2\u0a84\u0a86\7\5\2\2\u0a85\u0a7b\3\2\2\2\u0a85"+
		"\u0a86\3\2\2\2\u0a86\u0a88\3\2\2\2\u0a87\u0a5a\3\2\2\2\u0a87\u0a5f\3\2"+
		"\2\2\u0a87\u0a66\3\2\2\2\u0a87\u0a6b\3\2\2\2\u0a87\u0a7a\3\2\2\2\u0a88"+
		"\u0107\3\2\2\2\u0a89\u0aae\3\2\2\2\u0a8a\u0aae\7\u01bb\2\2\u0a8b\u0aae"+
		"\7\u0196\2\2\u0a8c\u0a8e\t-\2\2\u0a8d\u0a8c\3\2\2\2\u0a8d\u0a8e\3\2\2"+
		"\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0aae\t.\2\2\u0a90\u0aae\7*\2\2\u0a91\u0aae"+
		"\7\u00f6\2\2\u0a92\u0aae\7\64\2\2\u0a93\u0aae\7\u00b3\2\2\u0a94\u0aae"+
		"\7\u008f\2\2\u0a95\u0aae\7k\2\2\u0a96\u0aae\7s\2\2\u0a97\u0aae\7\u01b7"+
		"\2\2\u0a98\u0aae\7u\2\2\u0a99\u0aae\7t\2\2\u0a9a\u0aae\7w\2\2\u0a9b\u0aae"+
		"\7v\2\2\u0a9c\u0aae\7/\2\2\u0a9d\u0aae\7\u015c\2\2\u0a9e\u0aae\7\u00ce"+
		"\2\2\u0a9f\u0aae\7\22\2\2\u0aa0\u0aae\7\u01a3\2\2\u0aa1\u0aae\7\u00f0"+
		"\2\2\u0aa2\u0aae\7\u00f1\2\2\u0aa3\u0aae\7\u01b4\2\2\u0aa4\u0aae\7\u01d4"+
		"\2\2\u0aa5\u0aae\7D\2\2\u0aa6\u0aae\7{\2\2\u0aa7\u0aae\7|\2\2\u0aa8\u0aae"+
		"\7}\2\2\u0aa9\u0aae\7\u00e6\2\2\u0aaa\u0aae\7\u00e7\2\2\u0aab\u0aae\7"+
		"\u01d6\2\2\u0aac\u0aae\7\25\2\2\u0aad\u0a89\3\2\2\2\u0aad\u0a8a\3\2\2"+
		"\2\u0aad\u0a8b\3\2\2\2\u0aad\u0a8d\3\2\2\2\u0aad\u0a90\3\2\2\2\u0aad\u0a91"+
		"\3\2\2\2\u0aad\u0a92\3\2\2\2\u0aad\u0a93\3\2\2\2\u0aad\u0a94\3\2\2\2\u0aad"+
		"\u0a95\3\2\2\2\u0aad\u0a96\3\2\2\2\u0aad\u0a97\3\2\2\2\u0aad\u0a98\3\2"+
		"\2\2\u0aad\u0a99\3\2\2\2\u0aad\u0a9a\3\2\2\2\u0aad\u0a9b\3\2\2\2\u0aad"+
		"\u0a9c\3\2\2\2\u0aad\u0a9d\3\2\2\2\u0aad\u0a9e\3\2\2\2\u0aad\u0a9f\3\2"+
		"\2\2\u0aad\u0aa0\3\2\2\2\u0aad\u0aa1\3\2\2\2\u0aad\u0aa2\3\2\2\2\u0aad"+
		"\u0aa3\3\2\2\2\u0aad\u0aa4\3\2\2\2\u0aad\u0aa5\3\2\2\2\u0aad\u0aa6\3\2"+
		"\2\2\u0aad\u0aa7\3\2\2\2\u0aad\u0aa8\3\2\2\2\u0aad\u0aa9\3\2\2\2\u0aad"+
		"\u0aaa\3\2\2\2\u0aad\u0aab\3\2\2\2\u0aad\u0aac\3\2\2\2\u0aae\u0109\3\2"+
		"\2\2\u0aaf\u0ab4\5\u010c\u0087\2\u0ab0\u0ab1\7\6\2\2\u0ab1\u0ab3\5\u010c"+
		"\u0087\2\u0ab2\u0ab0\3\2\2\2\u0ab3\u0ab6\3\2\2\2\u0ab4\u0ab2\3\2\2\2\u0ab4"+
		"\u0ab5\3\2\2\2\u0ab5\u010b\3\2\2\2\u0ab6\u0ab4\3\2\2\2\u0ab7\u0ab8\5\u0118"+
		"\u008d\2\u0ab8\u0ab9\7\u01f7\2\2\u0ab9\u0abb\5\u0106\u0084\2\u0aba\u0abc"+
		"\5\u010e\u0088\2\u0abb\u0aba\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u010d\3"+
		"\2\2\2\u0abd\u0abe\7O\2\2\u0abe\u0abf\7\u01fd\2\2\u0abf\u010f\3\2\2\2"+
		"\u0ac0\u0ac1\7\u01ad\2\2\u0ac1\u0ac3\7\4\2\2\u0ac2\u0ac4\5\u0112\u008a"+
		"\2\u0ac3\u0ac2\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0ac8"+
		"\7\5\2\2\u0ac6\u0ac7\7\u016d\2\2\u0ac7\u0ac9\7\u0202\2\2\u0ac8\u0ac6\3"+
		"\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0111\3\2\2\2\u0aca\u0acb\7\u0202\2\2"+
		"\u0acb\u0acf\7\u014a\2\2\u0acc\u0acd\7\u0202\2\2\u0acd\u0acf\7\u0183\2"+
		"\2\u0ace\u0aca\3\2\2\2\u0ace\u0acc\3\2\2\2\u0acf\u0113\3\2\2\2\u0ad0\u0ad1"+
		"\5\u0118\u008d\2\u0ad1\u0ad2\5\u0116\u008c\2\u0ad2\u0115\3\2\2\2\u0ad3"+
		"\u0ad4\7\u01ec\2\2\u0ad4\u0ad6\5\u0118\u008d\2\u0ad5\u0ad3\3\2\2\2\u0ad6"+
		"\u0ad7\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0adb\3\2"+
		"\2\2\u0ad9\u0adb\3\2\2\2\u0ada\u0ad5\3\2\2\2\u0ada\u0ad9\3\2\2\2\u0adb"+
		"\u0117\3\2\2\2\u0adc\u0add\5\u011a\u008e\2\u0add\u0119\3\2\2\2\u0ade\u0ae2"+
		"\7\u0206\2\2\u0adf\u0ae2\5\u011c\u008f\2\u0ae0\u0ae2\5\u0120\u0091\2\u0ae1"+
		"\u0ade\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae0\3\2\2\2\u0ae2\u011b\3\2"+
		"\2\2\u0ae3\u0ae4\7\u0207\2\2\u0ae4\u011d\3\2\2\2\u0ae5\u0ae7\7\u01ec\2"+
		"\2\u0ae6\u0ae5\3\2\2\2\u0ae6\u0ae7\3\2\2\2\u0ae7\u0ae8\3\2\2\2\u0ae8\u0aee"+
		"\7\u0202\2\2\u0ae9\u0aeb\7\u01ec\2\2\u0aea\u0ae9\3\2\2\2\u0aea\u0aeb\3"+
		"\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aee\t/\2\2\u0aed\u0ae6\3\2\2\2\u0aed"+
		"\u0aea\3\2\2\2\u0aee\u011f\3\2\2\2\u0aef\u0af0\t\60\2\2\u0af0\u0121\3"+
		"\2\2\2\u0174\u0126\u012b\u0133\u0141\u0144\u014c\u014f\u0157\u015e\u0165"+
		"\u016e\u0174\u0177\u017b\u0183\u018e\u0197\u019d\u01a1\u01a7\u01aa\u01ae"+
		"\u01b3\u01bb\u01bd\u01c1\u01c4\u01cb\u01d0\u01d2\u01d4\u01db\u01de\u01e2"+
		"\u01e6\u01ed\u01f4\u01f8\u0204\u020b\u0211\u0219\u021b\u021e\u0224\u022b"+
		"\u022e\u0233\u0236\u023c\u0240\u0243\u024b\u024e\u0251\u0254\u025a\u025f"+
		"\u0262\u026d\u0272\u0279\u027c\u0285\u0288\u028f\u0292\u0297\u029a\u02a2"+
		"\u02a9\u02ac\u02b0\u02b3\u02b5\u02b8\u02bc\u02c0\u02c8\u02cf\u02d3\u02d5"+
		"\u02d8\u02e4\u02f2\u02f9\u0300\u032a\u0337\u033c\u0342\u034a\u034e\u0356"+
		"\u0363\u0369\u036e\u0374\u037c\u0386\u038c\u0393\u0396\u039a\u039f\u03a1"+
		"\u03a7\u03ae\u03bc\u03ca\u03cd\u03d2\u03da\u03dd\u03e2\u03e7\u03f1\u03f8"+
		"\u03fb\u03fe\u0408\u0411\u0417\u041d\u0422\u0425\u0428\u042b\u042e\u0431"+
		"\u0434\u0437\u043a\u043d\u0440\u044b\u044e\u0451\u0454\u0457\u0459\u0463"+
		"\u046a\u0470\u0475\u047e\u0480\u0484\u0488\u048b\u048e\u04ad\u04d0\u04d2"+
		"\u04db\u04e0\u04e9\u04ef\u04f5\u04f8\u04fb\u04fe\u0501\u0509\u0511\u0514"+
		"\u0517\u0522\u0527\u0532\u0536\u0539\u053c\u053f\u0542\u054d\u0552\u055f"+
		"\u0566\u0569\u0574\u057d\u0582\u0587\u058b\u059b\u05a2\u05a8\u05ac\u05b6"+
		"\u05be\u05c9\u05ce\u05db\u05de\u05e8\u05eb\u05f6\u0600\u0603\u060b\u060e"+
		"\u0618\u061d\u0626\u062b\u0630\u0636\u0638\u063e\u0645\u0651\u0654\u065e"+
		"\u0662\u0665\u066e\u0673\u0677\u0683\u068c\u0690\u0695\u0699\u069d\u06a7"+
		"\u06ad\u06b8\u06bf\u06c5\u06c8\u06cb\u06ce\u06d2\u06d5\u06da\u06e4\u06ea"+
		"\u06f3\u0702\u070b\u070f\u0712\u0716\u0718\u071f\u0727\u072d\u0734\u073a"+
		"\u073d\u0740\u0743\u074a\u074c\u0758\u075a\u075c\u0765\u0767\u076b\u0772"+
		"\u077a\u0781\u0785\u078c\u0793\u0799\u079f\u07a7\u07ad\u07be\u07c4\u07cf"+
		"\u07d5\u07d7\u07df\u07eb\u07f3\u07f6\u0801\u080c\u0811\u0814\u081b\u0820"+
		"\u082c\u0832\u0848\u084a\u0855\u0857\u0860\u0863\u0869\u086c\u0874\u0879"+
		"\u087e\u0886\u088f\u0896\u0899\u08a6\u08b2\u08b4\u08d5\u08e2\u08ef\u08fc"+
		"\u090b\u0919\u091d\u0926\u092a\u0943\u0948\u0964\u0968\u0973\u097b\u0980"+
		"\u098c\u0998\u099a\u099c\u09a2\u09a9\u09b3\u09b6\u09b8\u09bd\u09c2\u09d5"+
		"\u09d9\u09dc\u09df\u09ec\u09f7\u09fe\u0a02\u0a07\u0a0a\u0a0e\u0a16\u0a1b"+
		"\u0a21\u0a2a\u0a33\u0a3d\u0a42\u0a55\u0a58\u0a74\u0a81\u0a85\u0a87\u0a8d"+
		"\u0aad\u0ab4\u0abb\u0ac3\u0ac8\u0ace\u0ad7\u0ada\u0ae1\u0ae6\u0aea\u0aed";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}