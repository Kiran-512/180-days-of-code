#Group/Aggregate functions
/*
#Single-Row Functions:-
- will operate on 1 row at a time
- Character, Number, Date, List, Environment Functions e.g. upper (ename), round (sal), etc.

#Multi-Row Functions: -
- will operate on multiple rows at a time
- Group Functions
- e.g. sum (sal), etc.
-- ============================================================
VERY IMPORTANT :
- null values are not counted in the group functions while calculating the results

3 restriction on group functions:
- We can not select column(field) with the group function
- We can not select the single row function along with the group function
- We can not use the group function in where clause as where clause is used for searching
	and searching takes place in server HD and that time avg(sal) function is not available as
    avg(sal) is done in the server ram afterwards when the search result is brought into the server RAM.

-- ============================================================
#group_by clause 
- Column used in 'group by' clause may or may not be present in the select statement
- where clause has to be specified before the group by clause.

#where clause before group by
- WHERE clause is used to retrieve the rows from DB server HD to server RAM
- WHERE clause has to be specified before GROUP BY clause
- where clause restrict the no of rows

#More than one columns in group by clause
- no upper limit on the the columns in the group by clause
- make sure to have the column name specified in select, in the group by clasue
- order of the column doesnt matters in group by clause but the representation would be different

- group by parent,child; --> will work faster
- group by child, parent; --- will work slower

#2D query:
any select statement with the group by clause is known as 2D query, 
because we can plot the graph from the o/p(x-y graph,pie charts, bar graphs etc.)

#1 Oracle graphics
- best s/w for making graphical representations

#spatial queries
- if we add one column in group by clasue it becomes 2 dimentional query
- if we add two column in group by clasue it becomes 3 dimentional query
.
.
.
- if we add n column in group by clasue it becomes n+1 dimentional query	

multidimetional queries also know as spatial queries

-- ============================================================
#HAVING CLAUSE
- its recommended that only group functions should be used in HAVING clause
- Becasue having works after group function excution in server RAM AND if we use having with the single coclumn name which we have used in select statement then it makes the query inefficient as we could have son e the same tak by using the where clause!  
- WHERE clause is used for searching
- Searching takes place in DB server HD
- WHERE clause is used to restrict the rows WHERE clause is used to retrieve the rows from DB server HD to server RAM
- HAVING clause works AFTER the summation takes place
- whichever column is present in SELECT clause, it can be used in HAVING clause but check point no 2 
*/
-- ============================================================
#sum()
select sum(sal) from emp;  #if any of the value is null then no need to write ifnull(sal,0)as we did in case of single row functions
#null values are not counted in group functions


select * from emp;
/*
1	Kiran Shinde	2237.54	1	1970-12-04
2	Pranit Navale 	null	1	2057-05-07
3	Kiran Kumar		3224.54	2	1987-05-07
4	Rahul Deshmukh	53231.3	2	2069-12-06
5	Rahul Pandey	3232.94	2	1999-04-23
*/

#avg()
-- returns the avg of the parameter, does not consider null as its a group function
select avg(sal) from emp; 			-- here result would be 61926.2783203125/4

select avg(ifnull(sal,0)) from emp; -- here result would be 61926.2783203125/5


#min()
-- min(string) can also be taken:

select min(sal) from emp; -- min from sal other than null -- 2237.54

select min(ifnull(sal,0)) from emp; -- 0

#max()
-- max(string) can also be taken: 
select max(sal) from emp; -- 53231.3

#count()
select count(sal) from emp; -- return 4 as one row has null value in sal column  
select count(*) from emp; --  returns the no of rows in table
select count(*) - count(sal) from emp;-- will return 1 who's sal value is null


select max(sal)/min(sal) from emp; -- largest sal would be return result times greater than the smaller sal -- 23.456

#group_function s with where clause
select sum(sal) from emp where deptno =1; -- 2237.5400390625

select sum(sal) from emp where job ='Clerk';

#stddev()

#variance()

-- ============================================================
#COUNT-QUERY:
-- Countitng the number of query hits:-

select count(*) from emp where sal > 0; -- null is not considered as any operation with the null return a null

-- ============================================================
#Multiple Function in the same query

#We can use the multiple function in same statements:

select sum(sal), avg(sal),max(sal),min(sal) from emp;

-- ============================================================
#Group_BY

select deptno, sum(sal) from emp; -- ERROR in Oracle but works in MySQL but o/p ius meaningless

select deptno, sum(sal) from emp
	group by deptno;

#where clause has to be specified before the group by clause.

#Display th sum of sal deptno wise with deptno in the op
select deptno, sum(sal) from emp
	where deptno = 1
		group by deptno;

#Display the sum of sal deptno wise
select sum(sal) from emp
	group by deptno;	
    
select deptno, sum(sal) from emp
	where sal > 8000
		group by deptno;    
/*
deptno	sum(sal)
---------------------- 	
2		53231.25390625
*/

#More than one columns in group by clause
select deptno,ename, sum(sal) from emp
		group by deptno,ename;
/*
1	Kiran Shinde	2237.5400390625
1	Pranit Navale 	null
2	Kiran Kumar		3224.54443359375
2	Rahul Deshmukh	53231.25390625
2	Rahul Pandey	3232.93994140625
*/

select * from emp;

#Order of the column doesnt matters in group by clause but the representation would be different
select deptno, job, sum(sal) from emp 
	group by deptno, job;

select job, deptno, sum(sal) from emp 
	group by job, deptno;

/*
- the position of columns in SELECT clause and the position of column in GROUP BY clause need not be same
- the position of columns in SELECT clause will determine the position of columns in the output
- the position of columns in GROUP BY clause will determine the sorting order , grouping order, summation
	order and hence the speed of processing
- no upper limit on the munber of columns in GROUP BY clause

- group by parent,child; --> will work faster
- group by child, parent; --- will work slower
*/
	
-- ============================================================
#HAVING CLAUSE

-- Display the total salary of dept having salary more than 17000
-- here we can not use the below code as below code will give only the total salary of dept 1 which may or may not be greater than 17000     
select deptno,sum(sal) from emp where deptno = 1;

select deptno,sum(sal) from emp where sum(sal) > 17000; -- => ERROR as we ca not use group functions with the where clause as where clause searched in server HD and group functions in server RAM

-- here comes having clause into picture where we can first get the op as per deptno grouping then appling having condition on sum of sal with having clause
select deptno, sum(sal) from emp group by deptno having sum(sal) > 17000; 

select deptno, sum(sal) from emp group by deptno having sal> 7000;  -- => ERROR as sal is not available in server RAM as having is applied group function exectuion and in this case when summation done sal was not available

select deptno, sum(sal) from emp group by deptno having deptno = 1;  -- => This works but its inefficient as we could have achieved this with where clasue too!

Select deptno, sum(sal) from emp group by deptno having sum(sal) > 17000 and sum(sal) < 25000;  -- => ACCEPTABLE AS WE CAN APPLY CONDITIONS TOO IN HAVING CLASUE

-- ============================================================

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

-- ============================================================

-- Display the deptno with the total no fo emplyee with the max sal and min sal of the dept and 
-- sum of total salary of all employees of the dept hacing more than 3 employees
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

-- ============================================================