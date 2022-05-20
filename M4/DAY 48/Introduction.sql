/*
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
- The Best way to learn anything is to go into the history of that thing!

Origin of computer word :
------------
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
- raw data converted into meaningful data
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
- Commercial licences Rs.9000/- for excel 
- ANSI Definition - DBMS collections of programs that allows us to insert, update, delete and process!
eg. Excel Foxbase,dbase, foxpro(Sahkari bank uses), Clipper(Union bank of india uses),Advanced Revelations, 
DB vista, Datese,Data flex, Quattro flex etc.

- Excel program is know as Macro (VBA Programming): Visual Basic for Applications

=> 53% of the work in IT industry is done in Excel :

=> Comparision of RDBMS vs DBMS :
----------
DBMS (e.g. MS Excel, FoxPro, etc.)
--------
a. Field
b. Record
c. File
1. Naming conventions (Nomenclature)
2. Relationship between 2 files is maintained programmatically
3. More programming
4. More time required for s/w development
5. High network traffic
6. Slow and expensive
7. Processing on Client machine
8. Client-Server architecture is not supported
9. File level locking 
10. Not suitable for multi-user
11. Distributed Databases are not supported
12. No security (of data)
DBMS is dependent on OS for security
DBMS allows access to the data through the OS
Security is not an in-built feature of DBMS 

RDBMS (e.g. Oracle, MySQL etc.)
--------
a. Column, Attribute, Key
b. Row, Tuple, Entity
c. Table, Relation, Entity class
1. Naming conventions (Nomenclature)
2. Relationship between 2 tables can be specified at the time of table creation (e.g. Foreign key constraint) 3. Less
programming
4. Less time required for s/w development
5. Low network traffic
6. Faster (in terms of network speed) and cheaper (in terms of hardware cost, network cost, infrastructure cost)
7. Processing on Server machine (known as Client-Server architecture)
8. Most of the RDBMS support Client-Server architecture
9. Row level locking (internally table is not a file, internally every row is a file)
10. Suitable for multi-user
11. Most of the RDBMS support Distributed Databases (Banking system is an example of Distributed Databases)
12. Multiple levels of security
a. Logging in security
(MySQL database username and password)
b. Command level security
(permission to issue MySQL commands)
(e.g. create table, create function, create user, etc.)
 c. Object level security
(to access the tables and other objects of other users) 


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
M - MySQL
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
- conforms ANSI standards (eg. 1 char occupies 1 Byte of storage)
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

MySQL :
------
- Pronuonciation => Sequel or My SQL
- common for all RDBMS
- 9 Commands

4 sub-divisions of sql
------------
- DDL - Data definition language (Create(create the table), Drop(erase and delete the table),Alter(add columns in future)) 
- DML - Data Manipulation language (Insert(to add row), Update(to modity the data), Delete(to remove the row)) 
- DCL - Data Control Langugae(Grant(), Revoke) 
- DQL - Data Query Language (Select ()) 
  
5th component of SQL (NOT an ANSI standard hence seperated from those 4)=> 
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
- in MySQL to use reserved characters such as # in tablename and columnname enclose it in backquotes e.g `EMP#`
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
- max upto 65535 character (64 kb-1) 
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
- variable length
- max 255 chracters

Text 
--------
- allows any character
- variable length
- max 65535 characters (64kb -1)


MediumText 
---------
- allows any character
- variable length
- max 16777215 characters(16mb -1)

LongText
---------
- allows any character
- variable length
- max 4294967295 characters (4gb-1)

- Width does not have to be specified for all of the above data types
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

- Width does not have to be specified for all of the above data types
- above stored out side of the tables
- above 4 are stored away from the table row
- MySQL maintains a locator (HD pointer) from the table row to the text data

e.g.Barcode,Picture_code, QR_code etc.

4.Interger Types(Exact Values):
---------------
signed and unsigned int
bydefault its signed int

- tinyint -> 1 bytes
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
- Stores double as a string
eg. "653.7"
- max number of digit is 65
- used when it is important to preserve exact precision
- eg. Monetary data, let's say daily transactions in stock market

7.Boolean data type
--------------
- logical data types
- true / false evaluates to 1 and 0 respectively
- can insert true or false i.e. 1/0
- output will always display 1 or 0


Assignedment for the day :
-------------------------
- Download MySql and Oracle Documentation

Oracle version 11g	Express Edition : 		 

Date :
-------
- 1st Jan 1000 AD to 31st Dec 9999AD
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
2nd Jan 1000 AD =>2
3rd Jan 1000 AD =>3
.
.
.
.
7th May 2022 AD => 1456852


So the case has been taken for all the dates including leap years too!

In Oracle we can work upto BC years!
DD-'MMM'-YY is the default date format in Oracle
e.g. 10-MAY-70
Month is saved as a first three letters abbrevation

- Unix was the first OS which was available localy and commercially in the market and 
and its launched in 1970 hence all programming languages takes 
as a  mark of respect till date 1970 is considered as a cut off date
- 1970- year of Epoch


Time:
-------
- `hh:mm:ss` OR `HHH:MM:SS`
- RANGE : - 838:59:59 to 838:59:59
- internally time is stored as int and range of the int is from 1 to 2247483648 and the range of time is also in the same range

DateTime:
-------
- date and time in stored as together
- YYYY-MM-DD hh:mm:dd
- range => `1000-01-01 00:00:00` to `9999-12-13 23:59:59`
- datetime1 -datetime2 -> returns number of days hours minutes and seconds between the two


Year:
-------
-YYYY
- Year range => 1901 to 2155


- In MySQL we can have 4096 columns per table provided the row size<= 65,535 Bytes:
- Why 4096?
- No limt for the row 
- but table size <= 64 terrabytes


=> In Oracle, no limit on tablesize

Largest table in the worls=>
-------------------
=> ORDERS table of amazon : size 100's of terrabyte daily


*/