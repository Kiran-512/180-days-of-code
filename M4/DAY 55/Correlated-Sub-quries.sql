#CorrelatedSubQuries
/*
- Using EXISTS operator
- Its a special Operator
- rarely used

- If we have join along with the subquery, To  make it work faster, use correlated sub-queries  
- use EXISTS operator
- This is exception where sub-query is faster than Join

-- ==========================================================

INTERNAL IMPLEMENTATION AND WORKING OF CORRELATED SUB-Query : 
- first the main query is executed
- for every row returned by main query, it will run the sub-query ONCE the sub-query retruns the boolean true or false
- if the sub-query returns the TRUE then main query is executed for the next row
- if the sub-query returns the FALSE then main query is NOT executed for the next row and it will...
	...stop and get the another row from the main query and again runs sub-query for the new row
- unlike earlier the number of full table scan is reduced, this further speeds it up
 
*/
-- ==========================================================
desc emp;
/*
EMPNO	char(10)	YES			
ENAME	varchar(50)	YES			
SAL	float	YES			
DEPTNO	char(10)	YES			
JOB	char(10)	YES			
MGR	char(5)	YES			
Emp_Address	varchar(100)	YES			
*/

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
desc dept;
/*
DEPTNO	char(10)	YES			
DNAME	varchar(15)	YES			
LOC		char(10)	YES			
*/

select * from dept;
/*
1	TRN		Bby
2	EXP		Dlh
3	MKTG	Cal
4	Sales	Chn
*/

-- ==========================================================

-- Q. Display the Dnames that contains the employees and the Dnames that do not contains the employees:
#Solution 1:
select dname from dept 
where deptno in -- since sub-query returns more than one we used 'IN' operator here
(select distinct emp.deptno from emp,dept
where dept.deptno = emp.deptno);
/*
TRN
EXP
*/

#Solution 2:
select dname from dept
where deptno = any
(select distinct deptno from emp);
/*
TRN
EXP
*/

#Solution 3:
select distinct dname from emp,dept
where dept.deptno = emp.deptno;
/*
TRN
EXP
*/

#Solution 4: using correlated sub query
select dname from dept 
where exists
(select deptno from emp
where dept.deptno = emp.deptno);
/*
TRN
EXP
*/
-- ==========================================================

#Dnames that do not contains the employees
#Solution 1:
select dname from dept
where deptno not in #(1,2,7)
(select distinct deptno from emp
where deptno is not null);
/*
MKTG
Sales
*/

#Solution 2: using correlated sub query
select dname from dept 
where not exists
(select deptno from emp
where dept.deptno = emp.deptno);
/*
MKTG
Sales
*/

-- =====================================================

#Think_About_Below:

select dname from dept
where deptno not in #(1,2,null,7)
(select distinct deptno from emp); #(1,2,null,7);
/*
No Output
*/


select distinct deptno from emp;
/*
1
2
null
7
*/

select dname from dept
where deptno not in (1,2,null,7);
/*
No OutPut
*/

#AND

select dname from dept
where deptno not in (1,2,7);
/*
MKTG
Sales
*/

select distinct deptno from emp
where deptno is not null;
/*
1
2
7
*/

-- =====================================================

