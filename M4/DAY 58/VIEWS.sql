/*
Files system adopted by Oracle is OFS - Oracle File System (based on Linux Kernel)
Oracle Linux : (know as unbreakabale Linuyx) -> most secure linux in the world (designed specifically to host database)

*/

#Stored_Objects 
/*
- Objects that are stored in the database
- e.g.create ........ tables, indexes, etc.
- anything that we create with the CREATE command is a stored object
*/

#VIEWS 
/*
- Present in all RDBMS, also in some of the DBMS(clipper, foxpro etc).
- HANDLE TO A TABLE 
- view is HD pointer, which stores the address of the table
- view is know as locator, and locator is HD pointer
- used to restrict the access to the users on tables, used to restrict the column access!
- for security purpose
- used for indriect access to the table as we will creat the view for the table and then we will access the table thru view
- its a form of data hiding, and encapsulation
- We can create as many view as we want(No upper limit), of different combinatiuon of columns and shared with thte different users
- View doesnt contains data ONLY definition is stores, data is not stored
- views is a stores query
- the select statement on which views is based, is stored in a system table
- A lot of people have the misconception that view will slow down the select statement, but on contrary the view will speed up the select statement
		select statement on table follow below process => read, compile, plan and finally execution
        but the seelct statement on which view is based is stored in DB inthe compiled format so view is an executable format of select statement
        hence the execution is very fast
- hiding the source code from the end user

- We can perform DML operations on views
- and DML operation on view will affect the base table    
- constraints that are specified on the base table will be enforced, they will be encforced when you will 
	INSERT via view
- In case DELETE of delete even if the access is given for the one columna dn if we delete that values then entire row will get deleted      
- ENTIRE APPLICATION IS BUILT ON VIEWS

- ONLY Owner can drop the view

- Views are also used to restrict the rows to the another user
- used to enforce different checks for different users  
- Complex queries can be stores in view statements

#Advance features
- Types of views:
- to enforce Relational Methods into Object tables
- to enforce Object methods into realtioinal methods
- convert 3D tables into 2D tables
- convert 2D tables into 3D tables
- Migration
- Data amapping
- EAI (Enterprise Application INtegration)
- EIM (Enterprise Untegration Management)



*/

use employee_details;

select * from emp;

drop table emp; 

create table emp(
EMPNO char,
ENAME varchar(25),
sal float,
DEPTNO char
);

desc emp;

insert into emp values
('1','A',5000,'1'),
('2','B',6000,'1'),
('3','C',7000,'1'),
('4','D',9000,'2'),
('5','E',8000,'2');

SELECT * FROM EMP;

-- =========================================
#SYNTAX
-- create view view_name.............;

#COLUMN_LEVE_ACCESS_TO_ANOTHER_USER
create view v1
	as
    select empno, ename from emp;

-- in system table one entry is created as v1 = select empno,deptno from emp;

select * from employee_details.v1;    

#privilages on views:
#user1_mysql> grant select on view_name to user2;

#user2_mysql>select * from employee_details.emp;        => ERROR as user 2 dont have the select permision on table

#user2_mysql>select * from v1;        

-- ==================================================

-- views doent not contains the data but views sotres the address of the table so upon insertion data wil be passed on to the emp table
-- so We can perform DML operations on views
-- and DML operation on view will affect the base table
#user1_mysql> grant select, insert on v1 to user2;

#user2_mysql> insert into employee_details.v1 values('6','f',9000,'3');


-- ======================================

#ROW_LEVE_ACCESS_TO_ANOTHER_USER

#Views are also used to restrict the rows to the another user
create view v2
	as
		select * from emp where deptno = 1;
 
 -- View created
 
grant select,insert on v2 to user2; -- With this we are allowing user2 to access only those rows having deptno =1, which means we have restricted the acces tothe another rows 

#user2_mysql> select * from emp_details.v2;

#user2_mysql> insert into emp_details.v2 values (7,'G',3000,1); -- > Allowed

#user2_mysql> insert into emp_details.v2 values (7,'G',3000,2); -- > Allowed

-- ====================================================================

#with check option

#but if you want to have restriction on user2 not enter deptno other than 1 then follow below method

-- make the changes while creating view

create view v3
	as
		select * from emp where deptno = 1 with check option;
        
-- with check option , this will creates compulsion on user2 that while insert,update,delete the value for deptno must be 1 or else it will give an ERROR

grant select,insert on v2 to user2; 

#user2_mysql> insert into emp_details.v2 values (7,'G',3000,2); -- > Now it's Not Allowed

-- view with the check option is similar to the check constraint
-- used to enforce different checks for the different users
-- With this Views are also used to enforece different checks for different users  
-- lets say we want user1 to enter sal less than 10000, user2 to enter the sal less than 15000 and user3 to enter the sal less than 30000 then we can create the different views
-- ...with the different 'with check options' in where clasue and can grant the permission for inserq on those view
-- ... with this the diffrent users can performe the diffrent operation on the same column with the different coinditions


-- ===================================

#DROP VIEW

#SYNTAX:
#drop view view-Name;

drop view v1;

#to change the select statement in which view is based just drop the view and 'create'the view again OR 'creat or repalce' the view with the below command :-

create or replace view v1 
		as
			select * from emp;

-- ===================================

#desc view
-- view also has structure, so we can check with the desc if we forget the structure of view

desc v1;

-- ===================================

#view based on COMPUTED COLUMNS

create view v4 
as
select ename, sal*12 annual from employee_details.emp;

-- Views based on computed column, expression, function, etc.
-- you can ONLY SELECT from this view
-- DML Operations are not allowed 

insert into v4 values(10,'V',7000,1); -- > ERROR Error Code: 1348. Column 'annual' is not updatable	0.093 sec

-- ===================================================

#groupby clause in view creation

create view v5 
	as 
    select deptno, sum(sal) from emp
    group by deptno;

-- you can ONLY SELECT from this view
-- DML Operations are not allowed 

insert into v5 values(10,'V',7000,1); -- > ERROR : The target table v5 of the INSERT is not insertable-into	0.203 sec

-- ============================================

#JOIN in view creation
create view V6
as 
select dname,ename from emp,dept
where dept.deptno = emp.deptno;  

-- views based on join, sub-queries, etc.
-- you can ONLY SELECT from this view
-- DML Operations are not allowed 

-- ===========================================

#view_based_on_view

#Practical use:
-- union of > 255 select statements
-- nested functions > 255 levels
-- sub_queries > 255 levels
-- to simplyfy the writing of complex select statements 
-- e.g. joins of 40 tables 

show tables; -- > will show all the tables and views but wont tell us which is table and which is view

#to see which is table and which is view

show full tables;

-- =================================

use information_schema;

show full tables; -- all the system tables are the system views.. we dont have direct access to the system tables
/*
ADMINISTRABLE_ROLE_AUTHORIZATIONS	SYSTEM VIEW
APPLICABLE_ROLES	SYSTEM VIEW
CHARACTER_SETS	SYSTEM VIEW
CHECK_CONSTRAINTS	SYSTEM VIEW
COLLATION_CHARACTER_SET_APPLICABILITY	SYSTEM VIEW
COLLATIONS	SYSTEM VIEW
COLUMN_PRIVILEGES	SYSTEM VIEW
COLUMN_STATISTICS	SYSTEM VIEW
COLUMNS	SYSTEM VIEW
ENABLED_ROLES	SYSTEM VIEW
ENGINES	SYSTEM VIEW
EVENTS	SYSTEM VIEW
FILES	SYSTEM VIEW
INNODB_BUFFER_PAGE	SYSTEM VIEW
INNODB_BUFFER_PAGE_LRU	SYSTEM VIEW
INNODB_BUFFER_POOL_STATS	SYSTEM VIEW
INNODB_CACHED_INDEXES	SYSTEM VIEW
INNODB_CMP	SYSTEM VIEW
INNODB_CMP_PER_INDEX	SYSTEM VIEW
INNODB_CMP_PER_INDEX_RESET	SYSTEM VIEW
INNODB_CMP_RESET	SYSTEM VIEW
INNODB_CMPMEM	SYSTEM VIEW
INNODB_CMPMEM_RESET	SYSTEM VIEW
INNODB_COLUMNS	SYSTEM VIEW
INNODB_DATAFILES	SYSTEM VIEW
INNODB_FIELDS	SYSTEM VIEW
INNODB_FOREIGN	SYSTEM VIEW
INNODB_FOREIGN_COLS	SYSTEM VIEW
INNODB_FT_BEING_DELETED	SYSTEM VIEW
INNODB_FT_CONFIG	SYSTEM VIEW
INNODB_FT_DEFAULT_STOPWORD	SYSTEM VIEW
INNODB_FT_DELETED	SYSTEM VIEW
INNODB_FT_INDEX_CACHE	SYSTEM VIEW
INNODB_FT_INDEX_TABLE	SYSTEM VIEW
INNODB_INDEXES	SYSTEM VIEW
INNODB_METRICS	SYSTEM VIEW
INNODB_SESSION_TEMP_TABLESPACES	SYSTEM VIEW
INNODB_TABLES	SYSTEM VIEW
INNODB_TABLESPACES	SYSTEM VIEW
INNODB_TABLESPACES_BRIEF	SYSTEM VIEW
INNODB_TABLESTATS	SYSTEM VIEW
INNODB_TEMP_TABLE_INFO	SYSTEM VIEW
INNODB_TRX	SYSTEM VIEW
INNODB_VIRTUAL	SYSTEM VIEW
KEY_COLUMN_USAGE	SYSTEM VIEW
KEYWORDS	SYSTEM VIEW
OPTIMIZER_TRACE	SYSTEM VIEW
PARAMETERS	SYSTEM VIEW
PARTITIONS	SYSTEM VIEW
PLUGINS	SYSTEM VIEW
PROCESSLIST	SYSTEM VIEW
PROFILING	SYSTEM VIEW
REFERENTIAL_CONSTRAINTS	SYSTEM VIEW
RESOURCE_GROUPS	SYSTEM VIEW
ROLE_COLUMN_GRANTS	SYSTEM VIEW
ROLE_ROUTINE_GRANTS	SYSTEM VIEW
ROLE_TABLE_GRANTS	SYSTEM VIEW
ROUTINES	SYSTEM VIEW
SCHEMA_PRIVILEGES	SYSTEM VIEW
SCHEMATA	SYSTEM VIEW
ST_GEOMETRY_COLUMNS	SYSTEM VIEW
ST_SPATIAL_REFERENCE_SYSTEMS	SYSTEM VIEW
ST_UNITS_OF_MEASURE	SYSTEM VIEW
STATISTICS	SYSTEM VIEW
TABLE_CONSTRAINTS	SYSTEM VIEW
TABLE_PRIVILEGES	SYSTEM VIEW
TABLES	SYSTEM VIEW
TABLESPACES	SYSTEM VIEW
TRIGGERS	SYSTEM VIEW
USER_PRIVILEGES	SYSTEM VIEW
VIEW_ROUTINE_USAGE	SYSTEM VIEW
VIEW_TABLE_USAGE	SYSTEM VIEW
VIEWS	SYSTEM VIEW
*/
-- =====================================

#to see the select staement on which viee is based
use employee_details;

show create view v1;

-- CREATE ALGORITHM=UNDEFINED DEFINER=`Kiran`@`%` SQL SECURITY DEFINER VIEW `v1` AS select `emp`.`DEPTNO` AS `deptno`,`emp`.`ENAME` AS `ename` from `emp`

-- ===============================
#Complex queries can be stores in view statements 














