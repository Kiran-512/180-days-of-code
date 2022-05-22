#Sub-Quries
#---------
/*
Query within Query 
Select within Select 
Nested Quries

- MAIN QUERY / OUTER QUERY (Parent)
- SUB - Query / inner query (Child)
- ; end of command delimitor
- max upto 255 levels for sub queries
*/


use Employee_Details;

desc emp;
/*
EMPNO		char(10)	YES			
ENAME		varchar(50)	YES			
SAL			float		YES			
DEPTNO		char(10)	YES			
JOB			char(10)	YES			
MGR			char(5)		YES			
*/

select * from emp;
/*
1	Arun	8000	1	 M	4	
2	Ali		7000	1	 C	1	
3	Kirun	3000	1	 C	1	
4	Jack	9000	2	 M	null	
5	Thomas	8000	2	 C	4	
6	Akshay	4000	null C	4	
7	Pranit	5000	7	 C	4	
*/

select min(sal) as 'Min Salary' from emp; -- 3000

select ename, min(sal) from emp; -- Doesnt work in Oracle, works in MySQL but O/P is meaningless 
-- Arun	3000

-- Q. Display the ename who is receiving the min sal  
select ename from emp
where sal = (select min(sal) from emp); 
-- Kirun

#Display the enames with sal 8000
select ename, deptno from emp
where sal = #8000
(select min(sal) from emp
where deptno = #2
(select deptno from emp
where empno = #5
(select EMPNO from emp
	where empno = 5)));
/*
Arun	1
Thomas	2
*/

#simpe way is 
select ename,deptno from emp
where sal = 8000; 
/*
Arun	1
Thomas	2
*/

-- max upto 255 levels for sub queries
-- this limit can be exceeded with the views

-- Join is faster than sub-query as When we solve the problme using the join we use only select statement and and when we solve with the sub quries then we require more than 1 select statement
-- More the number of select statement, slower will be the statement

-- Display the second largest salary
select max(sal) from emp; -- 9000

select max(sal) from emp
where sal< #9000
(select max(sal) from emp); -- 8000

-- Third largest salary
select max(sal) from emp
where sal< (select max(sal) from emp
where sal <(select max(sal) from emp)); -- 7000


-- Display all the rows who belongs to the same DEPT NO  as Thomas;
SELECT * FROM EMP 
WHERE DEPTNO =
(select deptno from emp
where ename ='Thomas');


-- DISPLAY ALL THE ROWS WHO ARE DOING SAME JOPB AS Kirun

select * from emp
where job =
(select job from emp
where ename ='Kirun');

/*
2	Ali		7000	1	C	1	
3	Kirun	3000	1	C	1	
5	Thomas	8000	2	C	4	
6	Akshay	4000		C	4	
7	Pranit	5000	7	C	4	
*/

-- Incase if you knew the kirun's Job
select * from emp
where job ='C';

/*
2	Ali		7000	1	C	1	
3	Kirun	3000	1	C	1	
5	Thomas	8000	2	C	4	
6	Akshay	4000		C	4	
7	Pranit	5000	7	C	4	
*/

-- =========================================================

#DELETE IN Oracle usng SQ

delete from emp
where deptno = #5
(select deptno from emp where ename = 'Thomas');  
/*
ERROR in MySQL  => 
0	113	13:01:05	
delete from emp
 where deptno = #5
 (select deptno from emp where ename = 'Thomas')	
 Error Code: 1093. You can't specify target table 'emp' for update in FROM clause	0.000 sec
*/

#UPDATE in Oracle using SUB-QURIES
-- using sub- quries with DML in Oracle
update emp set sal = 10000
where job = #'C'
(select job from emp where ename ='Kirun');

/*
ERROR in MySQL  => 

0	109	12:58:00	
update emp set sal =10000
 where job =
 (select job from emp where ename ='Kirun')	
 Error Code: 1093. You can't specify target table 'emp' for update in FROM clause	
 0.000 sec
*/

select * from emp;

-- in MySQL 
# -------
/*
In MySQL we can not update or delete from the current table using sub-quries, which we are currently selecting as in above case,
Because the Output of select statement is stored in the server ram
*/
-- =========================================================

