/*
data is of  two type
1.USER DATA :
- user created 
- user tables and indexes


2.System data:
- system created(MySQL created)
- data which is stored in the system tables
- system data is also know as meta data
- meta data - data about the data
- Information of user created tables will be stored in the sysetm tables
*/

#system_tables
/*
- 63 system tables 
- stores a complete information about the database
- system tables are stored in information_schema
- set of system tables is know as DATA-SICTIONARY or data- catalogue
- statistic,table_constraint,key_column_usage, table_privilages etc.
- all system tables are read only
- we can only select from systrem tables (DML operations are not allowed )
- DDL for us is DML for system tables


*/

use information_schema; 
show tables;

select * from ADMINISTRABLE_ROLE_AUTHORIZATIONS;
select * from ADMINISTRABLE_ROLE_AUTHORIZATIONS;
select * from APPLICABLE_ROLES;
select * from CHARACTER_SETS;
select * from CHECK_CONSTRAINTS;
select * from COLLATION_CHARACTER_SET_APPLICABILITY;
select * from COLLATIONS;
select * from COLUMN_PRIVILEGES;
select * from COLUMN_STATISTICS;
select * from COLUMNS;
select * from ENABLED_ROLES;
select * from ENGINES;
select * from EVENTS;
select * from FILES;
select * from INNODB_BUFFER_PAGE;
select * from INNODB_BUFFER_PAGE_LRU;
select * from INNODB_BUFFER_POOL_STATS;
select * from INNODB_CACHED_INDEXES;
select * from INNODB_CMP;
select * from INNODB_CMP_PER_INDEX;
select * from INNODB_CMP_PER_INDEX_RESET;
select * from INNODB_CMP_RESET;
select * from INNODB_CMPMEM;
select * from INNODB_CMPMEM_RESET;
select * from INNODB_COLUMNS;
select * from INNODB_DATAFILES;
select * from INNODB_FIELDS;
select * from INNODB_FOREIGN;
select * from INNODB_FOREIGN_COLS;
select * from INNODB_FT_BEING_DELETED;
select * from INNODB_FT_CONFIG;
select * from INNODB_FT_DEFAULT_STOPWORD;
select * from INNODB_FT_DELETED;
select * from INNODB_FT_INDEX_CACHE;
select * from INNODB_FT_INDEX_TABLE;
select * from INNODB_INDEXES;
select * from INNODB_METRICS;
select * from INNODB_SESSION_TEMP_TABLESPACES;
select * from INNODB_TABLES;
select * from INNODB_TABLESPACES;
select * from INNODB_TABLESPACES_BRIEF;
select * from INNODB_TABLESTATS;
select * from INNODB_TEMP_TABLE_INFO;
select * from INNODB_TRX;
select * from INNODB_VIRTUAL;
select * from KEY_COLUMN_USAGE;
select * from KEYWORDS;
select * from OPTIMIZER_TRACE;
select * from PARAMETERS;
select * from PARTITIONS;
select * from PLUGINS;
select * from PROCESSLIST;
select * from PROFILING;
select * from REFERENTIAL_CONSTRAINTS;
select * from RESOURCE_GROUPS;
select * from ROLE_COLUMN_GRANTS;
select * from ROLE_ROUTINE_GRANTS;
select * from ROLE_TABLE_GRANTS;
select * from ROUTINES;
select * from SCHEMA_PRIVILEGES;
select * from SCHEMATA;
select * from ST_GEOMETRY_COLUMNS;
select * from ST_SPATIAL_REFERENCE_SYSTEMS;
select * from ST_UNITS_OF_MEASURE;
select * from STATISTICS;
select * from TABLE_CONSTRAINTS;
select * from TABLE_PRIVILEGES;
select * from TABLES;
select * from TABLESPACES;
select * from TRIGGERS;
select * from USER_PRIVILEGES;
select * from VIEW_ROUTINE_USAGE;
select * from VIEW_TABLE_USAGE;
select * from VIEWS;


#used in oracle to check the toal no of system tables'
select count(*) from tab;


select count(*) from tables;


# IP of CDAC KHarghar -> 192.168.4.31

