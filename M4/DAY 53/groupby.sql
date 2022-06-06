show databases;

use employee_details;
select * from emp;

#Group By Clause:
/*
- used for grouping

1. rows retrieved from DB server Hd to server RAM (WHERE clause is used to retrieve the rows from DB server HD to
server RAm)
2. sorting dept wise
3. grouping dept wise
4. summation dept wise
5. HAVING clause
6. ORDER BY clause

- whichever column is present in GROUP BY clause, it may or may not be present in SELECT clause

- WHERE clause is used to retrieve the rows from DB server HD to server RAM
- WHERE clause has to be specified before GROUP BY clause

- the position of columns in SELECT clause and the position of column in GROUP BY clause need not be same
- the position of columns in SELECT clause will determine the position of columns in the output
- the position of columns in GROUP BY clause will determine the sorting order , grouping order, summation 
  order and hence the speed of processing

- no upper limit on the number of columns in GROUP BY clause

select ................... group by parent,child; 				 -> FASTER
select ................... group by country,state,district,city; -> FASTER

select ................... group by child,parent;       		 -> SLOWER
select ................... group by city,district,state,country; -> SLOWER

- ORDER BY clause is the last clause in SELECT statement

#General Syntax sequence : 
=> select.......from......where......group by.......having......order by......;
*/
-- Display the total salary of dept 1
select deptno,sum(sal) from emp where deptno = 1;

-- Display the total salary of dept 2
select deptno, sum(sal) from emp where deptno = 2;

-- Display the total salary of dept 1 and 2
select deptno, sum(sal) from emp where deptno = '1' and deptno = '2';  -- Question - O/P is null as no deptono have the deptno = 1 and 2

-- here comes the group by clasue into picture
select deptno, sum(sal) from emp group by deptno;

select deptno, max(sal) from emp where deptno = '1';
select deptno, max(sal) from emp where deptno = '2';
select deptno, max(sal) from emp group by deptno;

select * from emp;
select deptno, sum(sal) from emp where sal > 7000 group by deptno;

select deptno, job, sum(sal) from emp group by deptno, job;

select job, deptno, sum(sal) from emp group by job, deptno;

#HAVING clause
/*
- its recommended that only group functions should be used in HAVING clause
- Becasue having works after group function excution in server RAM AND if we use having with the single coclumn name which we have used in select statement then it makes the query inefficient as we could have son e the same tak by using the where clause!  
- WHERE clause is used for searching
- Searching takes place in DB server HD
- WHERE clause is used to restrict the rows WHERE clause is used to retrieve the rows from DB server HD to server RAM
- HAVING clause works AFTER the summation takes place
- whichever column is present in SELECT clause, it can be used in HAVING clause but check point no 2 
*/

-- Display the total salary of dept having salary more than 17000
-- here we can not use the below code as below code will give only the total salary of dept 1 which may or may not be greater than 17000     
select deptno,sum(sal) from emp where deptno = 1;

select deptno,sum(sal) from emp where sum(sal) > 17000; -- => ERROR as we ca not use group functions with the where clause as where clause searched in server HD and group functions in server RAM

-- here comes having clause into picture where we can first get the op as per deptno grouping then appling having condition on sum of sal with having clause
select deptno, sum(sal) from emp group by deptno having sum(sal) > 17000; 

select deptno, sum(sal) from emp group by deptno having sal> 7000;  -- => ERROR as sal is not available in server RAM as having is applied group function exectuion and in this case when summation done sal was not available

select deptno, sum(sal) from emp group by deptno having deptno = 1;  -- => This works but its inefficient as we could have achieved this with where clasue too!

Select deptno, sum(sal) from emp group by deptno having sum(sal) > 17000 and sum(sal) < 25000;  -- => ACCEPTABLE AS WE CAN APPLY CONDITIONS TOO IN HAVING CLASUE

-- Below the count(*) will count the no of employee in deptno i.e. total no of rows having same deptno
select deptno, sum(sal) from emp group by deptno having count(*) = 1;
select deptno, sum(sal) from emp group by deptno having count(*) = 2;
select deptno,COUNT(*) 'Employees', sum(sal) from emp group by deptno having count(*) = 3;

select deptno, sum(sal) from emp group by deptno order by 2;

select deptno, sum(sal) 
from emp 
where sal > 7000 
group by deptno 
having sum(sal) > 10000 
order by 1;

-- Display the deptno with the total no fo emplyee with the max sal and min sal of the dept and sunm of total salary of all employees of the dept hacing more than 3 employees
-- This is also called as MATRIX REPORT 
select deptno,count(*),max(sal),min(sal),sum(sal)
from emp
group by deptno
having count(*)>=3;

#Below Works ONLY in Oracle AND not in any RDBMS:
-- Nesting of group functions is allowed only in oracle
select deptno, (sum(sal)) from emp 
group by deptno; 

#Solution in MySQL
-- DISPLAY THE MAXSUM from the deptno wise sum of sal 
 select max(sum_sal) from
 (select sum(sal) as sum_sal from emp  
 group by deptno) as temp;  			-- => Here alias is given to the temp table created with the select statements O/P








