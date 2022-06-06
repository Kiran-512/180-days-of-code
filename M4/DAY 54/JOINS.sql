show databases;
select * from emp;
drop table emp;

desc emp;

show tables;
drop database mumbai;
create database Employee_Details;

use Employee_Details;

create table emp(
EMPNO char(10),
ENAME varchar(50),
SAL float,
DEPTNO char(10),
JOB char(10),
MGR char(5) 
);

select * from emp;

insert into emp values
('1','Arun',8000,'1','M','4'),
('2','Ali',7000,'1','C','1'),
('3','Kirun',3000,'1','C','1'),
('4','Jack',9000,'2','M',null),
('5','Thomas',8000,'2','C','4')
;
 
select * from emp;

create table dept(
DEPTNO char(10),
DNAME varchar(15),
LOC char(10)
);

DROP TABLE DEPT;

insert into dept values
('1','TRN','Bby'),
('2','EXP','Dlh'),
('3','MKTG','Cal'),
('4','Sales','Chn')
;

select * from dept;

SHOW TABLES;

show databases;


#Notes =>
/*
- Joins used to view or combine the data of two or more tables
- DATA REDUNDACY - unnecessary duplication of data (wastage of HD space) - thats why different tables are created 
- tablename.columnname
- In order for the join to work faster, preferably the driving table should be table with lesser number of rows
- Innermost table is driven table
- Outermost table is driving table
- The common column in both the tables is `deptno`, the column name need not to be same in both the tables, because the
  same column may have a different meaning in the other table
- What matters is the datatype of the column has to match in both the tables, and there has to be some sensible
  relation on whose basis you are writing the join
- NORMALISATION : USED TO DECIDE THE STRUCTUIRE OF THE TABLE
- full table scan - enitre tables will be searched
*/

select count(*) from emp; -- driven tables as no of rows 5

select count(*) from dept; -- driving table as no fo rows 4

select ename, deptno from emp;
/*
Arun	1
Ali		1
Kirun	1
Jack	2
Thomas	2
*/

#Display the dept name in which employee are workiong with the helpo of join
select ename, dname from emp,dept
where dept.deptno = emp.deptno;
/*
Arun	TRN
Ali		TRN
Kirun	TRN
Jack	EXP
Thomas	EXP
*/

/*
in above eg after 'full table scan' result will be displayed , full table scan is nothing but the entire tables will be searched 
In the first interation, deptno 1 will be pickecd from driving table and then same wil be searched in the driven table which emp table here,
and then ename corresponding to the deptno 1 will be displayed,and in this case first three rows have deptno 1 and after that also SQL will search ahead if there any other row with the dept no 1becasue rows are not sorted here, randomly spreaded
#In above eg dept is known as driving table and emp table is know as driven table
#tablename.columnname
*/
#IDIOM:put Cart before the horse

select * from emp, dept
where dept.deptno = emp.deptno
order by 1;
/*
1	Arun	8000	1	M	4	1	TRN	Bby
2	Ali		7000	1	C	1	1	TRN	Bby
3	Kirun	3000	1	C	1	1	TRN	Bby
4	Jack	9000	2	M		2	EXP	Dlh
5	Thomas	8000	2	C	4	2	EXP	Dlh
*/


-- In above eg as dept no is repeating twice to display the dept no only once see below
select emp.empno, dept.deptno, dept.dname, emp.ename, emp.sal, emp.job, dept.loc from emp, dept
where dept.deptno = emp.deptno
order by 1;
/*
1	1	TRN	Arun	8000	M	Bby
2	1	TRN	Ali		7000	C	Bby
3	1	TRN	Kirun	3000	C	Bby
4	2	EXP	Jack	9000	M	Dlh
5	2	EXP	Thomas	8000	C	Dlh
*/


-- below code given an error as we will have to explicitely mention the table for the common column here deptno in this case
select deptno, empno, dname, ename, sal, job, loc from emp, dept     -- => ERROR correction dept.deptno OR emp.deptno
where dept.deptno = emp.deptno
order by 1;

-- CHECK THE O/P OF BELOW TABLE without WHERE statement => this is cartesian join example
select emp.empno, dept.deptno, dept.dname, emp.ename, emp.sal, emp.job, dept.loc from emp, dept 
order by 1; 
/*
1	1	TRN		Arun	8000	M	Bby
1	2	EXP		Arun	8000	M	Dlh
1	3	MKTG	Arun	8000	M	Cal
1	4	Sales	Arun	8000	M	Chn
2	1	TRN		Ali		7000	C	Bby
2	2	EXP		Ali		7000	C	Dlh
2	3	MKTG	Ali		7000	C	Cal
2	4	Sales	Ali		7000	C	Chn
3	1	TRN		Kirun	3000	C	Bby
3	2	EXP		Kirun	3000	C	Dlh
3	3	MKTG	Kirun	3000	C	Cal
3	4	Sales	Kirun	3000	C	Chn
4	1	TRN		Jack	9000	M	Bby
4	2	EXP		Jack	9000	M	Dlh
4	3	MKTG	Jack	9000	M	Cal
4	4	Sales	Jack	9000	M	Chn
5	1	TRN		Thomas	8000	C	Bby
5	2	EXP		Thomas	8000	C	Dlh
5	3	MKTG	Thomas	8000	C	Cal
5	4	Sales	Thomas	8000	C	Chn
*/
-- ===================================================

select ename, dname from emp,dept
where dept.x = emp.y;   -- => in case column name is different but having same type(data type) of content assume deptno is renamed x and y in dept and emp resp.

-- =======================================================
#Display the total salary cost of different departments
select sum(sal) from emp;
-- 35000

select deptno, sum(sal) from emp; -- meaningless O/P AS we can not use column with the group functions in seelct statement
-- 1	35000

select deptno, sum(sal) from emp
group by deptno;
/*
1	18000
2	17000
*/
select dname, sum(sal) from emp,dept
where dept.deptno = emp.deptno
group by dname;
/*
TRN	18000
EXP	17000
*/
-- =====================================================

-- better way to represent the salary cost of different departments
select upper(dname), sum(sal) from emp, dept
where dept.deptno = emp.deptno
group by upper(dname)
having sum(sal)>17000
order by 2 desc; 

-- tried group by clause in different way!
select sal, sum(sal) from emp
group by deptno
having sal<10000  -- IS NOT GOOD PRACTICE as same thing we could have done with the where clause
order by sal desc;

-- ---------------------------------------------------------------------------

select emp.empno, dept.deptno,emp.deptno, dept.dname, emp.ename, emp.sal, emp.job, dept.loc from emp, dept
where dept.deptno > emp.deptno
order by 2;
/*
1	2	1	EXP		Arun	8000	M	Dlh
2	2	1	EXP		Ali		7000	C	Dlh
3	2	1	EXP		Kirun	3000	C	Dlh
1	3	1	MKTG	Arun	8000	M	Cal
2	3	1	MKTG	Ali		7000	C	Cal
3	3	1	MKTG	Kirun	3000	C	Cal
4	3	2	MKTG	Jack	9000	M	Cal
5	3	2	MKTG	Thomas	8000	C	Cal
1	4	1	Sales	Arun	8000	M	Chn
2	4	1	Sales	Ali		7000	C	Chn
3	4	1	Sales	Kirun	3000	C	Chn
4	4	2	Sales	Jack	9000	M	Chn
5	4	2	Sales	Thomas	8000	C	Chn
*/

-- ---------------------------------------------------------------------------
/*-- Different types of JOINS => 5 Types
#1.  Equijoin / Natural Join
- Joins based on the equality conditions
- Shows the matching rows of the both the tables
- data is not stored in one table; data is stored in multiple tables;if you want to view/combine the columns of 2 or
  more tables then you will write Equijoin
- most frequently used join (more than 90%) hence it is also known as NATURAL JOIN
- practical use : view common columns of tow diffrent tables, data is stored in multiples tables and we want to view the columns of the multiple tables 

-- 2.  Inequijoin:
- join based on inequality conditions
- shows non-matching rows of both the tables
- USES : Exception reports, who are the employess who don't belongs to the training

-- e.g.
select emp.empno, dept.deptno, dept.dname, emp.ename, emp.sal, emp.job, dept.loc from emp, dept
where dept.deptno != emp.deptno
order by 1;

-- 3. OUTER JOIN
-- join with (+) sign (supported only in Oracle RDBMS & not supported by any other RDBMS)
-- We can put the + sign on either side but not on the both sides
-- shows matching rows of both the tables plus the non-matching rows of "OUTER" table(opposide side)
-- Outer table -> table which is on Outer/Opposite side of (+) sign


-- Half outer join (+ sign on  either side)
-- one of the loop is Do-While loop and one is for loop

-- 1> Right OuterJoin 2> Left OuterJoin 3. Full Outer join

-- USES: Master - details report , Parent - child reports etc.

#1> Right OuterJoin
-- Is used if we want all the rows of the master_table even if the details_tables doesn't have related rows

select dname, ename from emp, dept  #(details table, master table)
where dept.deptno = emp.deptno (+);
-- here in above eg dept table has do while loop while emp table has for loop


-- dept table is the parent table / MASTER Table
-- emp table is the child table / DETAILS Table

#2> Left OuterJoin
-- Is used if we want all the rows of details_tables the even if the master_table doesn't have related rows

select dname, ename from emp, dept
where dept.deptno (+) = emp.deptno;
-- here in above eg dept table has for loop while emp table has do while loop

-- dept table is the parent table / MASTER Table
-- emp table is the child table / DETAILS Table

#3.full Outer Join
-- (+) sign on both the sides (theoretically)
-- shows matching rows of both the tables PLUS the non-matching rows of both the table
-- based on nested Do-While loop shows the matching rows of the both the tables plus non matching rows of the outer tables
*/

#EQUIJOIN
select dname, ename from emp, dept 
where dept.deptno = emp.deptno;
/*
TRN	Arun
TRN	Ali
TRN	Kirun
EXP	Jack
EXP	Thomas
*/

-- ======================================================

#INEQUIJOIN
#will GIVE THE DETAILS WHERE THE employee doesnt belongs to which departments
select dname, ename from emp, dept 
where dept.deptno <> emp.deptno;

-- or

select dname, ename from emp, dept 
where dept.deptno != emp.deptno;
/*
EXP		Arun
MKTG	Arun
Sales	Arun
EXP		Ali
MKTG	Ali
Sales	Ali
EXP		Kirun
MKTG	Kirun
Sales	Kirun
TRN		Jack
MKTG	Jack
Sales	Jack
TRN		Thomas
MKTG	Thomas
Sales	Thomas
*/
-- ======================================================
#To understadn out join lets add one employe who doent belongs to any deptno

delete from emp;

insert into emp values
('1','Arun',8000,'1','M','4'),
('2','Ali',7000,'1','C','1'),
('3','Kirun',3000,'1','C','1'),
('4','Jack',9000,'2','M',null),
('5','Thomas',8000,'2','C','4'),
('6','Akshay',4000,null,'C','4'),
('7','Pranit',5000,'7','C','4');

select * from emp;
/*
1	Arun	8000	1	M	4
2	Ali		7000	1	C	1
3	Kirun	3000	1	C	1
4	Jack	9000	2	M	
5	Thomas	8000	2	C	4
6	Akshay	4000		C	4
7	Pranit	5000	7	C	4
*/

-- ======================================================

#RIGHT OUTER JOIN => In Oracle 
#This will display 
select dname, ename from emp, dept 
where dept.deptno = emp.deptno(+) ;

-- ======================================================

#LEFT OUTER JOIN => In Oracle 
#This will display 
select dname, ename from emp, dept 
where dept.deptno(+) = emp.deptno ;

-- ======================================================

#FULL OUTER JOIN  => In Oracle 
select dname, ename from emp, dept
where dept.deptno (+) = emp.deptno
			union
select dname, ename from emp, dept
where dept.deptno  = emp.deptno(+);

-- ======================================================

#FULL OUTER JOIN - All RDBMS except MySQL
-- ANSI syntax for Full OuterJoin - supported by all RDBMS including oracle except MySQL 
select dname,ename from  emp full outer join dept
on(dept.deptno = emp.deptno); 

-- ======================================================

#FULL OUTER JOIN => IN MySQL
select dname,ename from  emp right outer join dept
on (dept.deptno = emp.deptno)
union
select dname,ename from  emp left outer join dept
on(dept.deptno = emp.deptno); 
/*
TRN		Arun
TRN		Ali
TRN		Kirun
EXP		Jack
EXP		Thomas
MKTG 	null	
Sales 	null	
null	Akshay
null	Pranit
*/

-- ======================================================

-- ANSI syntax for left OuterJoin
#below left outer join taken on dept table where it will display all the matching rows of the dept table, which is mater table in this case and emp table, which is driving table in this case and the NON-MATCHING ROWS of the driving table which is emp table
select dname,ename from  emp left outer join dept
on(dept.deptno = emp.deptno); 
/*
TRN	 Arun
TRN	 Ali
TRN	 Kirun
EXP	 Jack
EXP	 Thomas
null Akshay
null Pranit
*/

select dname,ename from  emp left outer join dept
on( emp.deptno = dept.deptno ); 
/*
TRN	Arun
TRN	Ali
TRN	Kirun
EXP	Jack
EXP	Thomas
null Akshay
null Pranit
*/

#below left outer join taken on emp table where it will display all the matching rows of the emp table, which is mater table in this case and dept table, which is driving table in this case and the NON-MATCHING ROWS of the driving table which is dept table
select dname,ename from  dept left outer join emp 
on( emp.deptno = dept.deptno ); 

/*
TRN	 Arun
TRN	 Ali
TRN	 Kirun
EXP	 Jack
EXP	 Thomas
MKTG  null	
Sales null	
*/

-- ======================================================

-- ANSI syntax for Right OuterJoin

#below right outer join taken on dept table where it will display all the matching rows of the dept table, which is mater table in this case and emp table, which is driving table in this case and the NON-MATCHING ROWS of the master table which is dept table
select dname, ename from  emp right outer join dept
on (dept.deptno = emp.deptno); 
/*
TRN	 Arun
TRN	 Ali
TRN	 Kirun
EXP	 Jack
EXP	 Thomas
MKTG  null	
Sales null	
*/

select dname,ename from  emp right outer join dept
on (emp.deptno = dept.deptno);

/*
TRN	 Arun
TRN	 Ali
TRN	 Kirun
EXP	 Jack
EXP	 Thomas
MKTG  null	
Sales null	
*/

#below right outer join taken on emp table where it will display all the matching rows of the emp which is mater table in this case and dept table which is driving table in this case and t he NON-MATCHING ROWS of the master table which is EMP table
select dname, ename from  dept right outer join emp
on (dept.deptno = emp.deptno);

/*
TRN	Arun
TRN	Ali
TRN	Kirun
EXP	Jack
EXP	Thomas
null Akshay
null Pranit
*/

-- ======================================================
/*
-- 4. Inner Join
-- bydefault every join is inner join
-- using + sign or by using keyword 'outer' it becomes outer join
-- NOT TO MENTION INNER JOIN IN INTERVIEW UNLESS ASKED BY INTERVIEWER

-- 5.CARTESIAN JOIN / CROSS JOIN
- JOIN WITHOUT WHERE CLAUSE IN SELECT STATEMENT
- FASTEST join because you don't have a WHERE clause, and therefore no seraching is involved
- every row of driving table is combined with the each and every row of the driven table
- similar to taking cross poroduct of the table
USES :
-----
- PRINTING PURPOSE EG. WHILE PRINTING THE Marksheet every studnet will be combined with the each of the subject hence 
	printing will be done for all subject with each students
*/

select dname, ename from emp, dept; -- FAST (I/0 between server HD nad Server RAM is 3) 3*5

select dname, ename from dept,emp; -- SLOW (I/0 between server HD nad Server RAM is 5) 5*3

-- Lesser the I/O faster is the processing and vise a versa!

#6. SELF JOIN
select * from emp;
-- Since the  MGR column stores the values of empno hence empno is parent column and MGR is the child column
/*
- joining a table to itself
- RARELY USED BUT ASKED IN INTERVIEWS
- used when the both parent and the child columns present in the same table
- This is the slowest join
- Nothing can be done and its based on the concept of recursion and recursion is the slowest thing in any problme but then there are no other methods other than recursion
- do not give the alias to the table name unneccesarily, do so in rare case such as when you write sefl join 
USES
----
- EMP_NAME MGR_NAME
*/

select a.ename 'Manager', b.ename as 'Employee'from emp a, emp b
where a.empno = b.mgr ; 
/*
Jack	Arun
Arun	Ali
Arun	Kirun
Jack	Thomas
Jack	Akshay
Jack	Pranit
*/


-- Summary
/*
Equijoin -- Mostly used > 90% hence also know as Natural join 
Inequijoin (Non - equijoin )
Outerjoin 
Cartesian join (also known as Cross join Fastest join as there is no whee clause and hence no searching so fastest)
Self join (Slow as its based on recrusion)

-- Uneccesary giving table name alias will cause the entire table to called in the server RAM and eventually it will make process slower

#Internally all joins are based on nested for loop except Outerjoin where one or more loops may be Do-While Loop (rest all are for loop) 
*/

-- JOINS with the more than two tables

create table DHEAD(
DEPTNO char(10),
DHEAD varchar(50)
);

insert into DHEAD values
('1','Arun'),
('2','Jack');

select * from depthead;

-- to rename the table
ALTER TABLE DHEAD RENAME TO DEPTHEAD;

rename table dhead to depthead  ;

select dname, ename, dhead from emp, dept, depthead
where depthead.deptno = dept.deptno 
and dept.deptno = emp.deptno; -- here the three for loops with the depthead being the outermost table and then mocing on to the emp table being the innermost table
/*
TRN	Arun	Arun
TRN	Ali		Arun
TRN	Kirun	Arun
EXP	Jack	Jack
EXP	Thomas	Jack
*/

select * from emp;


#Display all the depat name,employee and manager even if they dont have any deptno
#STEP 1
select dept.deptno,dname,ename from emp left outer join dept 
on(dept.deptno = emp.deptno); 
/*
1	 TRN	Arun
1	 TRN	Ali
1	 TRN	Kirun
2	 EXP	Jack
2	 EXP	Thomas
null null  	Akshay
null null 	Pranit
*/

#STEP 2 - usng sub-quries (Next topic in the discussion)
select dname,ename,dhead from 
(select dept.deptno ,dname,ename from emp left outer join dept 
on(dept.deptno = emp.deptno)) as temp left outer join depthead
on( depthead.deptno = temp.deptno); 

/*
TRN	Arun	Arun
TRN	Ali		Arun
TRN	Kirun	Arun
EXP	Jack	Jack
EXP	Thomas	Jack
nul	Akshay	nul
nul	Pranit	nul
*/
#pls check why manger for pranit and akshay is null!

#WEIRD SELECT STATEMENT For study purpose
select dept.dname, emp.ename, depthead.dhead from emp,dept right outer join depthead
on ( depthead.deptno = dept.deptno);
/*
TRN	Arun	Arun
EXP	Arun	Jack
TRN	Ali		Arun
EXP	Ali		Jack
TRN	Kirun	Arun
EXP	Kirun	Jack
TRN	Jack	Arun
EXP	Jack	Jack
TRN	Thomas	Arun
EXP	Thomas	Jack
TRN	Akshay	Arun
EXP	Akshay	Jack
TRN	Pranit	Arun
EXP	Pranit	Jack
*/

/*
Types of Relationships:
1    :  1    ( dept : depthead  OR depthead : dept)
1    : Many  ( DEPT:EMP ) AND ( DEPTHEAD : EMP) 
Many :   1   ( Emp : Dept ) and (EMP : DEPTHEAD)
Many : Many  (  )

INTERSECTION TABLE : 
- Required for Many : Many relationship

*/

create table Projects(
PROJNO char(5),
CLIENTNAME VARCHAR(50),
DESCRIP VARCHAR(100)
);

insert into Projects values
('P1','Deloitee','CGS'),
('P2','BNP Paribas','Macros s/w'),
('P3','Morgan Stanley','AWS'),
('P4','ICICI BANK','PPS'),
('P5','AMFI','Website dev');

select * from projects;

-- TO ADD COLUMNS IN THE TABLE 
ALTER TABLE emp
ADD Emp_Address varchar(100);

# Intersection table for many - many relationship
create table projects_emp(
PROJNO char(5),
empno char(5)
);

SELECT * from emp;

insert into projects_emp values
('P1','1'),
('P2','1'),
('P2','2'),
('P3','4'),
('P4','4'),
('P5','5'),
('P6','3'),
('P6','5');

select * from projects_emp;

SELECT clientname, ename,descrip from projects_emp, emp, Projects 
where Projects.PROJNO = projects_emp.PROJNO 
and emp.empno = projects_emp.empno
order by 1,2,3;   
/*
AMFI			Thomas	Website dev
BNP Paribas		Ali		Macros s/w
BNP Paribas		Arun	Macros s/w
Deloitee		Arun	CGS
ICICI BANK		Jack	PPS
Morgan Stanley	Jack	AWS
*/


/*
ERROR =>
0	142	14:52:46	SELECT clientname, ename,descrip from projects_emp, emp, projects 
 where projects.PROJNO = projects_emp.PROJNO 
 and emp.empno = projects_emp.empno
 order by 1,2,3
 LIMIT 0, 1000	Error Code: 1146. Table 'employee_details.projects_emp' doesn't exist	0.000 sec
*/


