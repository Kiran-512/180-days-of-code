#SQL_commands 
/*

=> DATA is case sensitive whereas SQL Commands are case insensitive

CREATE 
=======
- ;-> DELIMITER => indicates end of command 

INSERT
=======

-- ==============================================
#Diff between null and blank space

- blank space is something and have the ascii value of 32

- null meaning nothing
- speacial tretment is given to given null value in all DBMS
- null is having ASCII value of 0
- null is independent of data type
- null occupies value of 1 byte(even in case of fixed length datatyes like char) as here it works as a seperator 
- if any row is ending with the null value then it wont take any storage value as there is no other value after null 
- its recommended that those columns that are likely to have large number of null values should preferably be specified at the end of the table structure to
  conserve the HD space

- Data is case sensitive: Must know the correct or else it will create problem while searching
-- ==============================================
#SELECT 
- used to get the details from table

when we write select * from emp;
 then this commands goes from client machine to server and server RAM
- READ
- COMPILE 
- PLAN 
- EXCEUTE

This is slow, inconvinient yes it is!will have to use as it is!
-- ==============================================

#OPERATORS:

=> Relational Operator:
-------------
- >
- <
- >=
- <=
- != OR <>
- =
  
  -- =========================
   => Logical Operator:
-------------
1. NOT
2. AND
3. OR
-- ===========================

Arithmetics operators:
----------
1. ()
2. /
3. *
4. +
5. -
-- ===========================
in oracle:=>
------------- 
- queries are case sensitive in oracle and not the commands
- not user-friendly
- more secure

in MySQL: =>
-------------
- queries are case insensitive
- user-friendly
- not secure 
--==================================================
#COMPUTED COLUMNS
- derived/pseudo/fake column

--==================================================
#DISTINCT
- to supress duplicates, sorting takes place internally in Server RAM
- SORTING is the one operation that slows down the working of select statement while
  supressing duplicates

====================================================

- exit command 
- When you install MySQL, 2 users are automatically created :
- root:
- has DBA privilages
- create users,assign privilages, take backups, restore from the backups, performance planning/monitoring/tuning etc.

mysql.sys
--------
- most important user
- owner of databse and owner of system tables
- start up databse, shutdown databse, perform Recover

MySQL Client s/w 
MySQL common line Client 

- help
- help contents
- help data types

=> mysql -u root -p 
 
-- ==================================================

=> To connect to MySQL workbench:
- Open Workbench
- MySQL connections Click on + sign to create new connection

- Connection name : Connection for root user
- Connection method : Standard (TCP/IP)
- Hostname : DB Server name / localhost
- port: 3306- default ( port number on the server thru which we want to establish a connection)
      
- Oracle -> 1521 (default port no )
- username : root

- Password: store in value ... push button 
- click on OK
- click on OK

to login to MySQL database:-
------------------

- Click on connection you have created
- Object navigator on LHS
- Pull down menu and horizontal tool
- query window at the top
- output window below

==============================================

Ctrl+Enter to exceute

create schema <database_name>;

to connect with the database:
use <database_name>;

==============================================

- user is MySQL created system table:
- total 63 system tables in mysql
- set of system tables is known a data dictionary:also know as database catalog

- create user username@'%' identified by 'password'

- create database <databasename>
- OR
- create schema <databasename>

- schema synonym for database:

- e.g. create user dishi@'%' identified by 'welcome123';

- password : case sensitive
- username : case insensitive

- create database bhopal;
- or 
- create schema bhopal;

- When host create the user that user dont have permissions 

=> to grant the permissions:
-----------------
- Click on server menu at the top:
- User and Priviliges

-> Select the username you created from the user account list on the left hand side

- Click on administrative roles tab : AND GRANT PERMISSIONS 

*/

-- ===================================

create table emp
(
empno char(4),
ename varchar(25),
sal float,
city varchar(15),
dob date,
job char(10),
deptno char(4)
);

-- =====================================
#Variation 1

insert into emp
values('1','Amit',5000,'Mumbai','1990-06-03');  -- order is important

#Variation 2

insert into emp(empno, sal, ename, city, dob)values('2',5000,'King','Mumbai','1991-06-03'); -- order is important

#Variation 3
insert into emp (empno, sal)
values('3',7000);

#Variation 4
insert into emp values('4',7000);  -- ERROR  

insert into emp 
values('4',7000,null,null,null);  #=> this won't give error as column names are not mentioned and we have explicitely specified null for those columns

insert into emp 
values('5',7000,null,null,null);


/*
Recommended : Variation 2
1.Readable
2.Flexible
3.In future, if you alter the table if you add column then you dont have to modity the existing INSERT statement
*/

#Add multiples row in table

insert into emp (empno,ename,sal,city,dob)values
('1','Amit',5000,'Mumbai','1990-06-03'),
('2','Amit',8000,'Mumbai','99-08-12'),
('3','Pranit',8000,'Mumbai','70-08-13'),
('4','Ramesh',7000,'Mumbai','1990-09-03'),
('5','Rahul',6000,'Mumbai','1990-10-03'),
('6','Kiran',5000,'umbai','1990-11-03');

insert into emp(empno,sal) values
('3',7000), 
('4',8000),
('5',9000);

-- ============================================================
#SELECT 
#Variation 1:
select * from emp; -- this will display all the rows and columns from emp table

select * from dept;

#Variation 2: to restrict the columns
select empno,ename from emp;

#Variation 3:
select sal,empno,ename from emp;
-- Here the position of columns in the select statement the position of the columns will be displayed

-- ======================================================
#where clause:

#Variation 1:
select * from emp
 where deptno = 10; -- will display all the rows with the dept no 10

select * from emp
 where sal>2000; -- will display all the rows with sal > 2000

select * from emp
 where sal>2000 aNd sal<3000; -- here we can use AND and And, anD case insensitive 
 
 select * from emp
 where (deptno = 10 or sal>2000 ) and sal<3000;
 
 select * from emp where job = 'Manager';

-- ============================================================
#Computed_Column

#Variation 1 

select ename,sal,sal*12 as "Annual" from emp; -- here sal*12 will be multiplied by 12

#Here, sal*12 is computed/derived/pseudo/fake column  and 'as' - optional and it is used to conform to ANSI stanadrds also called as `alias`
#even "computed_column name" double_quote is optional, it is used to make the column_name case sensitive
#its recommended to use the " ";

select ename "EMPNAME",sal "SALARY", sal*12 "ANNUAL_SALARY" from emp;

select ename "EMPNAME", sal "SALARY", sal*12 + sal*10^2 as "net" from emp;

-- such computed columns we shall not save in the table as that's the wastage of the HD space, and when required we can select sal*12 from emp; 
-- ============================================================
#distinct

select distinct job from emp;

select distinct job, ename from emp; -- here distinct will operate on columns combined together

select (distinct job), ename from emp; -- ERROR 

select ename, distinact job from emp; -- ERROR 

-- ============================================================
show databases;

use mysql;

create database employee_details;

use employee_details;
select * from user;

-- ==========================================================


