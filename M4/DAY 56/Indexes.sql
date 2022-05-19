#INDEXES

drop table emp;

create table emp(
EMPNO char(5),
ENAME varchar(50),
sal float,
deptno char(4)
);

select * from emp;

-- ---------------------------------------

insert into emp(EMPNO,ename,sal,deptno) values
('1','A',5000,'1'),
('2','A',6000,'1'),
('3','C',7000,'1'),
('1','D',9000,'2'),
('2','E',8000,'2');

delete from emp;

select * from emp;

-- =====================================================================

insert into emp(EMPNO,ename,sal,deptno) values
('5','A',5000,'1'),
('4','A',6000,'1'),
('1','C',7000,'1'),
('2','D',9000,'2'),
('3','E',8000,'2');

delete from emp;

select * from emp;
/*
INDEXES :
- Present in all RDBMS's, all DBMS, some of the programming languages also
- INDEXES ARE USED TO SPEED UP SEARCHING OPERATIONS, For faster access
- Index is just like a table it will occupy space
- We are concerned about the performance and not the HD space
- Used to speed up the select statement with a where clause : when do search with the where clause if there are 1 billion rows then ti will take alot of time for searching as with where clasue it will do full table scan even after it satisfies the condition
- In other RDBMS will have the explicitly mention use index command, but in MySQL and Oracle indexes are automatically invoked as and when required
- IF IN FUTRE WE UPDAET THE index row in a table, index_row table needs to be resorted reorganised etc. 
- In other RDBMS will have to explicitely update the indexes but in MySQL and Oracle it gets automatilcay updated, programmer dont have to keep a track on the changes
- MyQL nad Oracle are self managing RDBMS
- duplicate values are stores in the index and arranged in ascending order
- null values are NOT stored in the index
- Create is DDL command so its permanent, create index, will create the index
- THERE IS NO UPPER LIMIT ON NUMBER OF INDEX per table
- The larger the number of indexes, slower would be DML operations as for each new row addition in each indexes sorting organising need to be done
- Fast searching VS Fast DML operations => USER Requirements
- When we have two or more independent columns in where clause then create the different indexes for each column
- We Can Not index text and BLOB (becasue of its size)
- By default indexes are in ascending order we can make it in descending order by mentioning desc after coulmn name
- MySQL wont allows us to create more than one index on the same column , but we can create the index of the same column if its used with the another column
i.e. different comninations with the composite indexes
===================================================================================

SELECT * FROM EMP
WHERE EMPNO =1;

Execution setps for the above statement:
1. Read
2. Compile
3. Plan
4. Execute

first it wil read the select statement
then it will compile and convert that statement into machine code
and then it will make a plan to execute the statement
in a plan it will check whether emp exist or not 
then it will check whether there is empno or no
then it will check if user has permission to access the table
then it will whether empno has index created or not
if no then it will do full table scan 
it yes then it will check in that index table
then it executes!

imp =>
- In Oracle we can see this plan and its not possible in MySQL
- 99.9% the plan created in Oracle is perfect!

======================================================================

SELECT * FROM EMP
WHERE ename ='A';

Assuming below two columns having indexes:

SELECT * FROM EMP
WHERE empno ='1' and sal>5000;

- When we have two or more independent columns in where clause then create the different indexes for each column
======================================================================
#Composite index : combine two or more inter-dependent columns in index


Index KEY : columns or set of columns on whose basis the index has been created

PRIMARY Index kEY : Parent Column
SECONDARY Index kEY : Child Column
Tertiary Index Key:
.
.
.
so on and so forth

Assuming empno are assigned as per the deptno no so deptno 1 has empno from 1 2 3 and deptno 2 has emp no starting from 1 2 and so no....
So in this case the both the columns are interdependent, and to make searching faster instead of single column index we can create the index of botht the columns together where in data will stored
deptno wise in asecnding order and in that empno also in ascending order within in the deptno's

select * from emp
wehre deptno = 1 and empno = 1;

Limitations:
In MySQL we can combine upto 32 columns in composite index
In Oracle, we can combine upto 16 columns

Normally we will have 3-4 column in composite index, 32 becomes to large number and makes searching operations time consuming

=======================================================================

=> Conditions when an index should be created:
- to speed up the select statement with the where clause, order by clause, distinct clause, group by clasue, union,intersect, minus etc.
- If your select statement returns the less than 25% of the table data (Programmer has to do this calculations of the data if its more than 25% or not) 	
	Becasue if select statement returns more than 25% of the data then larger no of rows wouldbe coming in the output and the if the ;large noi of rows are coming in the output then 
	rather than searching in the index and finding the rowid, it would be good to do the full table scan!
    25% is no recommended by the oracle corporation
    
- Primary key and unique columns (PANNO, UIDNO,EMPNO, etc.) should always be indexed as its best column for searching
- common column in the join should always be indexed

select distinct empno from emp; -- in this case as we have the index for the empno
 
select deptno, sum(sal) fro emp
group by deptno;               -- in this case as we have the index for the deptno then in the index depotno will be sorted and we can easily find the sum as per the dept no,the precious time required for sorting will be saved 

#incase of join
driving index and driven index
======================================================================
#createIndex in MySQL :
-- SYNTAX:
# => create index index_name on table(column); This ascending bydefault
# => create index index_name on table(column desc); This is desecnding

# => for index name same rules as of table names

#Composite_index:
create index index_name on table_name(parent_column,child_column);

create index index_name on table_name(country,city desc);

======================================================================
 
 to see the indexes are created for specific table
 
 show indexes from emp;
 
 to see all indexes on all tables in all schema
 
 use information_schema;
 select * from statistics;
 ======================================================================
 drop the index : 
 
 drop index index_name on table_name;
 
 ======================================================================
 unique index creation:
 
=> SYNTAX:

create unique index index_name on table_name(column_name);
	
-> performs one extra function: it wont allow duplicates in the index : 
-> at the time of creating the uniquye index, if you already have duplicate values in the 
   column to be indexed, then MySQL wont allow you to create the unique index

======================================================================
Types of Indexs:
1. Normal Index
2. Unique Index
3. Bitmap Index
4. Index Organised Table
5. Index Partitioning (global and local)
6. etc

====================================================================== 
*/
/*
#In other RDBMS: Microsoft sql servers
use index ind_empno;
select * from emp where empno = 1;

#In other RDBMS: Microsoft sql servers
INSERT/UPDATE/DELETE ........;
reindex;

*/

#null values searching => pessimistic searching
select * from emp
where empno = null;       #=> MySQL will do a full table scan and there is no other way to do it! This is the way it is to search null values!

-- HOW TO MAKE NULL SEARCHING FASTER?
-- stores null values as zero (0), it will take more space but searching will be faster

select * from emp
where empno = 0; 

-- =====================================================================

#createIndex in MySQL :
-- SYNTAX:
# => create index index_name on table(column); This ascending bydefault
# => create index index_name on table(column desc); This is desecnding

# => for index name same rules as of table names

create index i_emp_empno on emp(empno); 

select * from emp where empno ='1';

select * from i_emp_empno; #ERROR : => We can see whats there in the index 

/*
There is no upper limit on the MySQL and Oracle
buut as in MicroSoft sql there is upper limit of 255 index  
*/

-- By default indexes are in ascending order we can make it in descending order by mentioning desc after coulmn name, CHECK SYNTAX Above

-- =====================================================================

#to see all the indexes:

use information_schema;
select * from statistics;

show schemas;

use employee_details;

show indexes from emp;

drop index i_emp_empno on emp;

show indexes from emp;

create index emp_empno on emp(empno desc);

show indexes from emp;

drop index emp_empno on emp;

show indexes from emp;

create unique index emp_empno on emp(empno desc); 

show indexes from emp;

drop index emp_empno on emp;

use information_schema;
select * from statistics;

use employee_Details;
show indexes from emp;

-- =====================================================================

#additing duplicate in emp and creating unique index which is valid SQL wont allow
delete from emp;

insert into emp(EMPNO,ename,sal,deptno) values
('5','A',5000,'1'),
('5','A',6000,'1'),
('1','C',7000,'1'),
('2','D',9000,'2'),
('3','E',8000,'2');

show indexes from emp;

select * from emp;

create unique index u_emp_empno on emp(empno);

#duplicates removed
update emp
	set empno = '4'
		where sal = 5000;

select * from emp;

create unique index u_emp_empno on emp(empno);

show indexes from emp;

drop index u_emp_empno on emp;

-- =====================================================================

#adding null in rows in empno and creating unique index on empno in emp table
delete from emp;

select * from emp;

insert into emp(EMPNO,ename,sal,deptno) values
(null,'A',5000,'1'),
('5','A',6000,'1'),
('1','C',7000,'1'),
('2','D',9000,'2'),
('3','E',8000,'2');

show indexes from emp;

create unique index u_emp_empno on emp(empno);

drop index u_emp_empno on emp;

-- =======================================================

/*
Imporatant summary of duplicate and null in indexes and constraints

index - duplicates allowed but null are not allowed!

unique index - duplicate are not allowed but null are allowed!

primary key - duplicate not allowed and even null is also not allowed!

not null - duplicate are allowed  but null are not allowed

unique - duplicate are not allowed but null are allowed any no of times

*/