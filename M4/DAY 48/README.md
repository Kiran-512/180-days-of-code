Syllabus
------------
- DBT Technologies:
- DATA base concepts:
- MySQL v5.7 (RDBMS -> Relational DataBase Management System)
- Oracle v11g and above 21c Dec 2021 (RDBMS + OODBMS(Object Oriented))=> ORDBMS 
- NoSQL => Not Only Structural Query language 
- MongoDB

Borland Inc. :
Sybase International : NY Stock Exchange uses Sybase to manage their data
siebel systems : top 5th largest companies in the world
top 10 largest companies in the world


Start
----------
- Best way to learn anything is to go into the history of that thing!

Origin of computer word :
- Computaire - to Calculate/Compute
- Charles babage was a mathematician and he wanted to do mathematical calculations easily with the less time
- job of computer is to convert the data into the information
- 022-22021984

input(data)=>
------------
- lets say 20384849 is the no but does not convey any message 
- raw facts

computer =>
------------
- processing / work done by the computer to convert the data into the information

output =>
------------
- Information
- raw data voncerted to meaningful data
- processed data
- data on the basis of management can take some action and make something out of it

Database =>
--------
- Colletion of data
- Colletion of LARGE AMOUNT of data

DBMS => 
--------
- Database Management System 
- Readymade software helps to manage the data
- Commercial licences Rs.9000/- 
- ANSI Definition - DBMS collections of programs that allows us to insert, update, delete and process!
eg. Excel Foxbase,dbase, foxpro(Sahkari bank uses), Clipper(Union bank of india uses),Advanced Revelations, 
DB vista, Datese,Data flex, Quattro flex etc.

- Excel program is know as Macro (VBA Programming):

=> 53% of the work in IT industry is done in Excel :


=> Comparision of RDBMS vs DBMS :
---------------------
		RDBMS                                          	 DBMS
- Field                                          	Column,Attributes
- Records                                        	Row,Tuple[tyupal],entity
- File                                           	Table,Relation,Entity Class
- More Time is needed                           	Processing is done within less time
- Relation between two files is maintained  		Relation between two tables  specified  atthe time of    
	Programatically                         		table creation(eg.Forein key constraint)	
- eg.Oracle,MySQL									eg.Excel
- Faster and Cheaper(In terms Cost of             	Slow,Expensive	
  hardware netwrok and infrastruct)								
- Processing on server								Processing on client Machine
- Low Netwrok Traffic								High Netwrok Traffic				
- Most of the databases suopports Ditributed DTBS   dOES NOT SUPPORTS   
- Client server architecture is  supported          Not supported
- Data is secured,Login level,command level and     Data is not secured
  object level securiyt							  			


Password protected file in Excel in case of DBMS:
------------
- Create file then save as => then before saving click on tools => and choose general options and set the password
- But this is not the security as anyone can delete that file if he wants, 
- another security option is file can be made hidden but again that is also not the security
  
Security in case of RDBMS:
----------
- OS doent not allow access to the files in case of RDBMS
1.Logining in level: My SQL database username/password
2.Command level security : pwrmision to give my SQL commands  
3.Object level security :Permission to access the tables of other users

Total 80 commands :

Challeneg in DBMS:

In RDBMS, row levellocking is there!
- Internally table is not a file and every row is a file hence table is multi file 

In DBMS, there is file level locking. 
- at a time only one user can aceess and modify the data and hence its not suitable ofr multiuser.

RDBMS:
===========
INFORMIX
-----------
- Fastest in terms of processing speed
- very few does the assembly programming in industry

Oracle 
-----------
- Slow but most popular
- largest program is oracle is only 9 lines
- Programming is very easy
- #1 s/w company in the world
- Founder - Larry Ellison Friend of Steve Jobs as Steve job was the photographer in the wedding of larry and he is big fan of Iron Man   
- 63% of commercial database world market in the client server environment
- 86% of world commercial database market in the Internet invironment 
- Oracles the technology that we dont have to worry for another 40 year!
- Oracles Works on 113 OS

Sybase
-----------
- Going down
- Aquired by SAP (MISTAKE BY SAP :p) 

MS SQL Server
-------------
- Good RDBMS from Microsoft
- Real cahllenge for Oracle
- Connectivity between .net and this RDBMS is good
- Major limitation - Works with only windows OS!
- 16% world's database market
- Kotak Mahindra uses .net and My SQL

Below 3 RDBMS are open source (chracter based - text based): Poor man's RDBMS
----------------------------
- Ingres => 
- Postgress => CDAC kharghar uses Postgress 
- Unify => DENA BANK USES

DATABASE SERVER HAS TO BE MAIN FRAME(SUPER Computer) => wont work on laptop,desktop,mobile e.g. 800 GB ram
- DB2
-------
- Good RDBMS from IBM

CICS
------

Telon
------

IDMS
------

- => ICSAD Pune has developed India's first super comuter : Param => 

MS Access
-----------


Paradox,Vatcom SQL,
--------------


My SQL  
--------
- launched by swedish company 1995
- Its name is combination of "My" Co founder of Michael Widenius daughter and "SQL"
- Most widely used open-source RDBMS 
- part of the widely used LAMP open - source web application software stack (and other "AMP" stack)

L - Linux
A - Apache web server
M - mYSQL
P - perl,php,python

Simillarly;
MAMP,WAMP,XAMP - point is mySQL is part of all
 
Used in : Facebook,Twitter,Joomla,WordPress,Google(Not for searching, they have big Table in house database)
,Google contacts, Flicker,Youtube etc.

 Market Share => 42% of world open source database market

- Sun Microsystem Aquired MySQL IN 2008
- ORACLE AQUIRED SUN MICROSYSTEMS IN 2010

MySQL Database =>
==========================================
SQL
--------------------
- Struuctured Query Language
- Create Drop Alter
- Insert Update Delete
- Grant Revoke Select
- conforms ANSI standards (eg. 1 cahr occupies 1 Byte of storage)
- conforms to ISO standards (for QA)
- conforms for all RDBMS
- Thomas Scott Chris Huma Gavin => C&C++ 90% and 10% assembly language 
- SQL was initialy launched in 1975-77
- Initailly SQL know as RQBE(Relational Wuery by Example)
- IBM gave RQBE free of cost to ANSI 
- ANSI renamed RQBE to SQL and now SQL is controlled by ANSI and hence its controlled by ANSI, it is common for all RDBMS 
- IN 2005 THE CODE IS REWRITTEN IN JAVA(100%) and thats how oracle aquired Sun MicroSystems in 2008
- those 6 people formed the company Oracle(Greek word)   
- chracter text based

MySQL Command Line Client
----------------------
- MySQL Client s/w 
- used to connect to MySQL 
- textbased 

MySQL Workbench
--------------------
- GUI Based 
- MySQL Client s/w 
- used to connect to MySQL 

MySQL-PL
--------------------
- MySQL programming language 
- used for database programming

MySQL CONNECTORS
--------------------
- used to connect the other frontend s/w with the MySQL database
- drivers used for database connectivity
- JDBC,ODBC,Python, C,C++,etc.
 
MySQL FOR EXCEL
--------------------
- import,export and edit the MySQL using MS Excel
  
MySQL Notofier
--------------------
- startup and shutdown MySQL database
- if not using database rather to kep SQL unnecesary on we can shutdowon
- noramally DBA's job database administrator
 
MySQL Entrerprise Backup
--------------------
- used to take backup of the data
- also used to restore from the backups
- noramally DBA's job database administrator 
- also used to transport the database from one MySQL database to another MySQL database

(Must have abackup of all the tables => (Disaster management)

MySQL Entrerprise High Availability
--------------------
- for repliucation
- data has to be available all the time
- maintains primary and secondary servers
- We can schdule which server will up for what time  

MySQL Entrerprise Excription 
--------------------
- used to encrpt and decrpt the data over the network
- protection for the sensitive data 
 
MySQL Entrerprise Monitor
--------------------
- for monitoring MySql database server
- for performance planning, monitoring, tunning etc. 

MySQL Entrerprise Query Analyser
--------------------
- 

MySQL :
- Pronuonciation => Sequel or My SQL
- common for all RDBMS
- 9 Commands

4 sub-divisions of sql
------------
- DDL - Data definition language (Create(create the table), Drop(erase and delete the table),Alter(add columns in future)) 
- DML - Data Manipulation language (Insert(to add row), Update(to modity the data), Delete(to remove the row)) 
- DCL - Data Control Langugae(Grant(), Revoke) 
- DQL - Data Query Language (Select ()) 
  
5th componenet of SQL (NOT an ANSI standard hence seperated from those 4)=> 
------------
- DTL/TCL : Data Transaction Language, Transaction control language(Commit, Rollback, Savepoints)  
- DDL (Rename , Truncate )

Extra in Oracle RDBMS only (COST IS 35 LAKH)=>
----------------
- DML (Merge and Upsert Command):

RULES FOR TABLE NAMES, column names, variable names 
---------------------
- max 30 characters
- A-Z,a-z,0-9 allowed
- name must begin with the alphabet 
- Allowed Special chracters => $,#,_ 
- in MySQL to use reserved characters such as # in tablename and columnname enclose it in backquotes
- 134 reserved words are not allowed in tablename

e.g.
`EMP#`

- Reserved words are not allowed in tablename
- Refer MySQL Documentation for all the commands


MySQL Datatypes :
---------
#Char
- allows any character
- max upto 255 character
- default width 1
- fixed length
- wastage of HD space
- searching and retrieval will be very fast
- used for pan_no roll_no adhar_no etc.

#Varchar
- allows any character
- max upto 65533 character (64 kb-1) 
- no default width
- width has to be specified
- variable length
- searching and retrieval will be very slow
- used for name address city etc.

ASCII value of blank is 32 :
so if we take ename char(20); and ename = (amitblank....20th size) since here size is fixed so all 20 bytes will be allocated to amit even if its size is less than 20
but if we take enam Varchar(20) and ename =(amit) since its size if variable so it will take only 4 byte and rest will be empty 


2.Text => 
=========

TinyText
-------
- allows any character
- variavle lenfth
- max 255 chracters

Text 
--------
- Allows
- variable length
- max 65535 characters (64kb -1)


MediumText 
---------
- allows any character
- variable length
- max 16777 215 characters(16mb -1)

LongText
---------
- allows any character
- variable length
- max 4294967295 characters (4gb-1)

- Width does not have to be specified for all of the abopve data types
- above stored out side of the tables
- above 4 are stored away from the table row
- MySQL maintains a locator (HD pointer) from the table row to the text data
- used for columns that will not be used for searching
- used for columns that will be used only for storage and display purposes
- eg. remarks,comments, resume, experience, feedback etc.

3.Blob => Binary large Object
=========

=>Tinyblob;
---------
- max 255 bytes of binary data

=> blog
--------
- max 65,535 bytes of binary data 

=>Mediumblog
--------
- max 16,777,215 bytes of binary data 

=>Longblog
--------
- max 4,294,967,295 bytes of binary data 

- Width does not have to be specified for all of the abopve data types
- above stored out side of the tables
- above 4 are stored away from the table row
- MySQL maintains a locator (HD pointer) from the table row to the text data

e.g.Barcode,Picture_code, QR_code etc.

4.Interger Types(Exact Values):
---------------
signed and unsigned int
bydefault its signed int

- tiny -> 1 bytes
- smallint -> 2 bytes
- Mediumint  -> 3 bytes
- Int -> 4 bytes
- Bigint ->8 bytes

5.Floating point Types
-------------
- Float => upto 7 decimals

- Double =>  upto 15 decimals

6.Fixed Point Types(Exact Values)
--------------
=> Decimal
--------
- Stores  double as a string
eg. "653.7"
- max number of digit is 65
- used wht it is important preserve exact precision
- eg. Monetary data, let's say daily transactions in stock market

7.Boolean data type
--------------
- logical data types
- true / false evaluates to 1 and 0 respectively
- can insert true or false i.1. 1/0
- output will always display 1 or 0


Assignedment for the day :
-------------------------
- Download MySql and Oracle Documentation

Oracle version 11g	Express Edition : 		 

================= DAY 2 ================

Date :
-------
- 1st Jan 100AD to 31st Dec 9999AD
- no problem of Y2K (Year 2000)
- default date format :YYYY-MM-DD OR YY-MM-DD is also allowed 
- eg. 22-05-07  
- year values in the range 70-99 are converted to 1970-1999
- year values in the range 00-69 are converted to 2000-2069

- Date arithmetics is allowed
- date1-date2 =>returns number of days between the two dates (no programming needed, cool feature, saves a lot of time)

Internal calculations:
----------------
- Internally date is stored as a fixed length number and it ocuupied 7 Bytes of storage;
- date is stored as number since 1st Jan 1000 starting from 1

----------------
1st Jan 1000 AD =>1
1st Jan 1000 AD =>2
1st Jan 1000 AD =>3
.
.
.
.
7th May 2022 AD => 1456852


So the case has been taken for all the dates including leap years too!

In Oracle we can work upto BC years!
DD-MM-YY is the default date format in Oracle
e.g. 10-MAY-70
Month is saved as a first three letters abbrevation

- Unix was the first OS which was available loclly and commercially in the market and 
and its launched in 1970 hence all programming languages takes 
as a  mark of respect till date 1970 is considered as a cut off date
- 1970- year of Epoch


Time:
-------
- `hh:mm:ss` OR `HHH:MM:SS`
- RANGE : - 838:59:59 to 838:59:59
- internally time is stored as int and range of the int is from 1 to 2247483648   and the range of time is also in the same range

DateTime:
-------
- date and time in stored as together
- YYYY-MM-DD hh:mm:dd
- range => `1000-01-01 00:00:00` to `9999-12-13 23:59:59`
- datetime1 -datetime2 -> returns number of days hours minutes and seconds between the two


Year:
-------
-YYYY
- range => 1901 to 2155


- In MySQL we can have 4096 columns per table provided the row size<= 65,535 Bytes:
- Why 4096?
- No limt for the row 
- but table size <= 64 terrabytes
- 

=> In Oracle, no limit on tablesize

Largest table in the worls=>
-------------------
=> ORDERS table of amazon : size 100's of terrabyte daily


Emp TRabel:=>


create table emp
(
empno char(4),
ename varchar(25),
sal float,
city varchar(15),
dob date,
):


- SQL commands are case insensitive:

;-> DELIMITER => indicates end of command 

INSERT
-----------

Variation 1
---------
insert into emp
values('1','Amit',5000,'Mumbai','1990-06-03'); //order is important

insert into emp values('1','Amit',5000,'Mumbai','1990-06-03');

Variation 2
---------
insert into emp(empno, sal, ename, city, dob)
values('2',5000,'King',''Mumbai','1991-06-03'); //order is important

Variation 3
---------
insert into emp (empno, sal)
values('3'.7000);

Variation 4
---------
insert into emp 
values('4'.7000); => this will give error 

insert into emp 
values('4'.7000,null,null,null); => this won't give error as column names are not mentioned and we have explicitely specified null for those columns

insert into emp 
values('5'.7000,null,null,null);

---------------------------------
Recommended : Method 2
1.Readable
2.Fleexible
3.In future, if you alter the table if you add column then you dont have to modity the existing INSERT statement

Add multiples row in table
--------------------------------
insert into emp values
('1','Amit',5000,'Mumbai','1990-06-03'),
('2','Amit',5000,'Mumbai','1990-07-03'),
('3','Amit',5000,'Mumbai','1990-08-03'),
('4','Amit',5000,'Mumbai','1990-09-03'),
('5','Amit',5000,'Mumbai','1990-10-03'),
('6','Amit',5000,'Mumbai','1990-11-03'),
;

insert into emp (empno, sal)
values('3'.7000);
values('4'.7000);
values('5'.7000);
 


Diff between null and blank space

- blank space is something and have the ascii value of 32

- null meaning nothing
- speacial trement is given to given null value in all DBMS
- null is having ASCII value of 0
- null is independent of data type
- null occupies value of 1 byte(even in case of fixed length datatyes like char) as here it works as a seperator 
- if any row is ending with the null value then it wont take any storage value as there is no other value after null 
- its recommended that those columns that are likely to have large number of null values should preferably be specified at the end of the table structure to
  conserve the HD space

- Data is case sensitive: Must know the correct or else it will create problem while searching


SELECT
-------
Variation 1:
----------
select * from emp; // this will display all the rows and columns from emp table

select * from dept;

First ERROR: 
------------
mysql> select * from dept;
ERROR 1046 (3D000): No database selected
mysql>

when we write select * from emp;
 then this commands goes from client machine to server and 
 server RAM
- READ
- COMPILE 
- PLAN 
- EXCEUTE

This is slow, inconvinient yes it is!will have to use as it is!

Variation 2: to restrict the columns
----------
select empno,ename from emp;

Variation 3:
-----------
select job,dept,sal,empno,ename from emp;

Here the position of columns in the select statement the position of the columns will be displayed


Variation 4:
-----------
select * from emp;
 where deptno = 10;// will display all the rows with the dept no 10


select * from emp;
 where sal>2000;/ will display all the rows with sal > 2000
 
=> Relational Operator:
-------------
- >
- <
- >=
- <=
- != OR <>
- =
  

select * from emp;
 where sal>2000 and sal<3000; // here we can use AND and And anD case insensitive 
 
 => Logical Operator:
-------------
1. NOT
2. AND
3. OR

select * from emp;
 where (deptno = 10 or sal>2000 ) and sal<3000;
 
select * from emp where job = 'Manager';

in oracle:
=> queries are case sensitive in oracle and not the commands
- not user-friendly
- more secure

in MySQL:
=> queries are case insensitive
- user-friendly
- not secure 

Variation 5 => 
--------
- select enam,sal,sal*12 as "Annual" from emp; /// here sal*12 will be multiplied by 12

- Here, sal*12 is computed/derived/pseudo/fake column  

- as - optional and it is used to conform to ANSI stanadrds

- also called as `alias`

- even "computed_column name" double_quote is optional, it is used to make the column_name case sensitive

- its recommended to use the " ";

- select ename "EMPNAME",
sal "SALARY",
sal*12 "ANNUAL_SALARY" from emp;


- select ename "EMPNAME",
sal "SALARY",
sal*12 +sal*10^2 as "net" from emp;

//idioms:
call it a day
out of touch
 
such computed columns we shall not save in the table as that's the wastage of the HD space, and when required we can select sal*12 from emp; 

Arithmetics operators:
1.()
2./
3.*
4.+
5.-

Variation 6:
-----------
- to supress duplicates, sorting takes place internally in Server RAM
- SORTING is the one operation that slows down the working of select statement while
  supressing duplicates
 
=> select distinct job from emp;

=> select distinact job, enam from emp;// here distinct will operate on columns combined together

=> select (distinact job), enam from emp; => ERROR 

=> select ename, distinact job from emp; => ERROR 
 
 
 

exit command :  

When you install MySQL, 2 users are automatically created :
root:
- has DBA privilages
- create users,assign privilages, take backups, restore from the backups, performance planning/monitoring/tuning etc.

mysql.sys
- most important user
- owner of databse and owner of system tables
- start up databse, shutdown databse, perform Recovery
- 

MySQL Client s/w :
MySQL common line Client : 


help 
help contents 
help data types

=> To connect to MySQL workbench:
- Open Workbench
MySQL connections Click on + sign to create new connection

Connection name : Connection for root user
Connection method : Standard (TCP/IP)
Hostname : DB Server name / localhost
port: 3306- default ( port number on the server thru which we want to establish a connection)
      
Oracle -> 1521 (default port no )
username : root

Password: store in value ... push button 
click on OK
click on OK

to login to MySQL database:-

Click on connection you have created
- Object navigator on LHS
- Pull down menu and horizontal tool
- query window at the top
- output window below

MySQL Commands:
---------------
show databases;
Ctrl+Enter to exceute

to connect with the database:
use <database_name>;
 
use mysql;

select * from user;

- user is MySQL created system table:
- total 63 system tables in mysql
- set of system tables is known a data dictionary:also know as database catalog

- create user <username> identified by <password>

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

Click on administrative roles tab : 




 
=======================
create table emp(
emp 

);

desc emp;


======================= DAY 3 ==========================

- Rows of the table in DB server HD are stored at scattered locations and not atthe same loction s in the case of excel file.
- Hence we can not have the rows as per sequence when the all rows are selected from the particular table;
- IT'S ONLY WHEN WE PHYSICALY OR EXPLICITELY STORES THE ROW INDEX IN THE PARTICULAR ROW AND THEN SELECT that row with the index given
- When you isnert a row into your table, whereever MySQL fins a free space, it will store the row over there!
- In all RDBMS, the row's inside the table are not stored sequencially, the rows inside the table are fragmented all over the server database HD   
- When you select the table, the order of the rows in the output depends on the row address 
- When you select the table, the order of the rows in the output depends on the row address 
- When in future if you UPDATE the row, if the row length is icreasing, if the free space is not available, then the row address may  change,
  Hence there's no way to find out the the first  'N' rows inside the tableor the last 'N' rows of the last table;

to get the row's by some order;
------------------------

select deptno, job, ename, sal, hiredate from emp
order by ename desc;

asc --> by default its ascending sorting
desc --> descending sorting

select deptno, job, ename, sal, hiredate from emp
order by hiredate desc;

- Here if the date is same then time is checked and if the time is also same then address is checked

In combination with the where clause:
----------------------------------
select deptno, job, ename, sal, hiredate from emp
where deptno = 10
order by ename desc;

select deptno, job, ename, sal, hiredate from emp
order by ename desc
where deptno = 10;  <-- ERROR


when we use where clause at that time searching takes place in server HD and
where clause is used before the order by clasue
WHERE CLAUSE IS USED TO RESTRICT THE ROWS
where clause is used to retrieve the row fronm DB SERVER HD to serve RAM.
hen we use order by then sorting takes place in server RAM AFTERWARDS

----------------------------------
select deptno, job, ename, sal, hiredate from emp
order by deptno, ename desc;

- all table will be ordered by deptno and then within deptno names will be ordered in descending manner.
  
-----------------------------------
- No upper limit on the columns in ORDER BY clause

select --------------------
order by country, state, district, city;

if you have to large no of rows in the table and if you have the large no of columns in the order by clause then 
selectstateement will be slow as that much sorting has to take place in the is server RAM.

sorting is one operation that always slows down your select statement.

----------------------------
select deptno, sal*12 from emp
order by sa'*12;

- computed columns are allowed in order by clause,

- even alias is also allowed in order by clause;

select deptno, sal*12 "annual"from emp
order by "annual";

easiest way:
-----------
select deptno, sal*12 "annual"from emp
order by 2;

- here 2 is the column number:and 2nd column number is annual

MySQL - SQL
=======================
select all the enames with 
----------
select * from emp;
where ename>='A' and ename < 'B';


- here ADAMS > A    and ADAMS< B     => 
-------------------------------------
=>Blank padded comparision semansistics:
- When you compare the two strings then the storter of the two strings is temprorility padded 
- with the blank spaces on RHS, such that their length becomes equal and'the starts the 
- comparision character by character based on ASCII value.

Method 2
---------
- solution for MySQL :

select * from emp;
where ename like 'A%';

- Colution for Oracle:

select * from emp;
where ename like 'A%' or where ename like 'a%';

like operator :
---------

Wildcard => 
---------
- Wildcards used for pattern matching  : 
- % => Any character or any no of character 
- "-" => used to select any one character 

- e.g. : 
///any name containing A at the start or at the end or in the middle
select * from emp;
where ename like '%A%';

//Any name with the four letters 
select * from emp;
where ename like '_ _ _ _ _';

//any name containg A in the end
select * from emp;
where ename like '_ _ _ _A%';


select * from emp;
where ename like 'B _ _ _A';

select * from emp;
where ename not like 'A%';

select * from emp
where sal>= 2000 and sal<= 3000;

select * from emp
where sal between 2000 and 3000; <- inclusive values

- above statement is easier to write and works faster

select * from emp
where sal not between 2000 and 3000; // 1000 and 4000

select * from emp
where hiredate between '2021-01-01' and '2021-12-31';

select * from emp
where hiredate >= '2021-01-01' and hiredate<= '2021-12-31';

--------------------------------------------

select * from emp
where ename between 'A' and 'F';

select * from emp
where ename >= 'A' and ename <= 'F';

--------------------------------------------
Any Operator : more powerfull than in operator 
------------ 
select * from emp;
where deptno = 10 or deptno = 20 or deptno =30;

select * from emp;
where deptno = any(10,20,30);

select * from emp;
where deptno != any(10,20,30);

select * from emp;
where deptno > any(10,20,30);

select * from emp;
where deptno < any(10,20,30);

ANY -> Logical or operator

in Operator - faster than any as any has one more operator '=' 
-----------
select * from emp;
where deptno = 10 or deptno = 20 or deptno =30;

select * from emp;
where deptno in(10,20,30);

select * from emp;
where deptno not in(10,20,30);

in -> Logical or operator

- within operatorwe can check only in or not in 
- whereas with any op- if you want to check for equality or inequality then use 
	In operator
- we can check for = any(),!= any(),>= any(),<= any(),> any(),< any() etc.
- - if we want to check for <,>,<=,>=,!=,= oerator 



DML
===========
delete from emp
	where empno = '1';

	
Its not a good practice to delete the data, as data isvery precious!
- instead we can have the status column and is employee leaves then we can update the status!



DDL
======

drop table emp;

drop table emp, dept;

=> We can not use where caluse with the drop table as drop table is DDL command


update and delete commands without where clause will not be allowed 

To use update and delete without where clause in MySQL Workbench:
-------------------------

click on edit (menu at the top)--> preferences-> SQL editor -> safe updates (checkbox at the bottom) -> uncheck it -> click on OK


MySQL - SQL => Transaction Processing : 
==================

commit 
-------
- will save all the DML changes since the last commited change
- commit will make your transaction permanent! 
- when user issues a commit, it is known as End of transaction 
- Commit will make the transaction permanent

Commit work;
Commit;

WORK -> ANSI SQL
WORK -> optional in MySQL and Oracle both!

TOTAL WORK => t1+t2+t3+t4+......+tN;

Transaction addition;

 
 eg.
 insert ---
 update--
 selete---
 commit work;//Transaction 1
 insert --
 update --
 commit work; // Transaction 2
 insert --
 insert --
 insert --
  
 commit work;// transaction 3
 
 
 Rollback=>
 --------------
 
 - this will rollback work to the last commit point
 - Rollback will undo all the DML changes untill the last commit point
 - What is commit that can not be rolledback!
 
WORK -> ANSI SQL
WORK -> optional in MySQL and Oracle both!

=> ONLY DML commands are affected by commit and rollback;
=> Any DDL commands it detects and those wont be rolledback or commited;

rollback work;
rollback;


=> In SQL plus when we wxit from command line without commit,
   then it will automatically commits the changes
 
=> Where as in SQL will have to commit the changes and if we dont do so then commit wont be performed explicitely
   its good thing that only commited data will get into the database;
   
=> Any kind of power failure, Network failure system failure improper exit,system boot, window close etc. in all such cases
   last transaction is automatically rolledback;
 To try out Rollback, Commit, savepoints in MySQL in  Workbnch:-
 
 Click on Query(menu at the top)-> Auto-commit Transaction -> Uncheck it
 
 
 
 
 
 
 
 
 
   
 
	

  


 
 












 
 


To login  


	  
	  
 
  
 


============================== 
- '\c' => used to cls 
     
- Searching takes place in server database harddisk



