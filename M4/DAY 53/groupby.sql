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






-- #GROUP BY vs PARTITION BY

--📋 Example Table: Orders
--| OrderID | CustomerID | OrderAmount |
| ------- | ---------- | ----------- |
| 101     | C1         | 100         |
| 102     | C1         | 200         |
| 103     | C2         | 300         |
| 104     | C2         | 400         |
| 105     | C3         | 500         |

🔹 Using GROUP BY
SELECT CustomerID, SUM(OrderAmount) AS TotalSales
FROM Orders
GROUP BY CustomerID;


Result:

| CustomerID | TotalSales |
| ---------- | ---------- |
| C1         | 300        |
| C2         | 700        |
| C3         | 500        |


--👉 Rows are collapsed — one row per customer. You lose individual orders.

🔹 Using PARTITION BY with a window function
SELECT 
    CustomerID,
    OrderID,
    OrderAmount,
    SUM(OrderAmount) OVER(PARTITION BY CustomerID) AS TotalSales
FROM Orders;


Result:
| CustomerID | OrderID | OrderAmount | TotalSales |
| ---------- | ------- | ----------- | ---------- |
| C1         | 101     | 100         | 300        |
| C1         | 102     | 200         | 300        |
| C2         | 103     | 300         | 700        |
| C2         | 104     | 400         | 700        |
| C3         | 105     | 500         | 500        |

--👉 Rows are not collapsed — each order is still listed, but now you see the customer’s total alongside each row.

--✅ Quick way to phrase it in an interview:

--“GROUP BY collapses rows into one summary row per group. PARTITION BY doesn’t collapse rows; instead, it applies the aggregation per group but shows it on each row.”

  --✅ Why PARTITION BY helps

--With window functions, SQL Server doesn’t require you to collapse rows. So you can mix:

--Detail columns (OrderID, OrderAmount)

--Aggregates per group (SUM() OVER(PARTITION BY ...))
--
--That’s why this works fine:

SELECT 
    CustomerID,
    OrderID,
    OrderAmount,
    SUM(OrderAmount) OVER(PARTITION BY CustomerID) AS TotalSales,
    AVG(OrderAmount) OVER(PARTITION BY CustomerID) AS AvgOrderAmount,
    COUNT(*) OVER(PARTITION BY CustomerID) AS NumOrders
FROM Orders;


Result:

| CustomerID | OrderID | OrderAmount | TotalSales | AvgOrderAmount | NumOrders |
| ---------- | ------- | ----------- | ---------- | -------------- | --------- |
| C1         | 101     | 100         | 300        | 150            | 2         |
| C1         | 102     | 200         | 300        | 150            | 2         |
| C2         | 103     | 300         | 700        | 350            | 2         |
| C2         | 104     | 400         | 700        | 350            | 2         |
| C3         | 105     | 500         | 500        | 500            | 1         |

  
--👉 Each order row keeps its details, while aggregate stats are added alongside.


--  RANK() OVER (PARTITION BY <grouping_column> ORDER BY <criteria_column> [ASC|DESC])

Example: Rank by Multiple Criteria

You can even rank by more than one column. For example, by performance_score descending, then by experience ascending:

SELECT
    department_id,
    employee_name,
    performance_score,
    years_experience,
    RANK() OVER (
        PARTITION BY department_id
        ORDER BY performance_score DESC, years_experience ASC
    ) AS performance_rank
FROM employees;

--Example: Rank by Multiple Criteria

--You can even rank by more than one column. For example, by performance_score descending, then by experience ascending:

SELECT
    department_id,
    employee_name,
    performance_score,
    years_experience,
    RANK() OVER (
        PARTITION BY department_id
        ORDER BY performance_score DESC, years_experience ASC
    ) AS performance_rank
FROM employees;

  
/*
🔹 1. ROW_NUMBER()

Assigns a unique sequential number to each row in a partition.

No ties — every row gets a distinct number.

SELECT 
    CustomerID,
    OrderAmount,
    ROW_NUMBER() OVER(PARTITION BY CustomerID ORDER BY OrderAmount DESC) AS RowNum
FROM Orders;


👉 If two rows have the same value, they still get different numbers.

🔹 2. RANK()

Assigns a rank number to rows.

If two rows tie (same value), they get the same rank.

But it skips the next rank(s).

Example: If two rows tie at rank 1, the next row will be rank 3 (not 2).

🔹 3. DENSE_RANK()

Similar to RANK().

If two rows tie, they get the same rank.

But it does not skip the next rank.

Example: If two rows tie at rank 1, the next row will be rank 2.

| OrderID | CustomerID | OrderAmount |
| ------- | ---------- | ----------- |
| 101     | C1         | 500         |
| 102     | C1         | 500         |
| 103     | C1         | 400         |
| 104     | C1         | 300         |

SELECT 
    OrderID,
    CustomerID,
    OrderAmount,
    ROW_NUMBER() OVER (PARTITION BY CustomerID ORDER BY OrderAmount DESC) AS RowNum,
    RANK() OVER (PARTITION BY CustomerID ORDER BY OrderAmount DESC) AS RankNo,
    DENSE_RANK() OVER (PARTITION BY CustomerID ORDER BY OrderAmount DESC) AS DenseRankNo
FROM Orders
WHERE CustomerID = 'C1';

| OrderID | OrderAmount | ROW_NUMBER | RANK | DENSE_RANK |
| ------- | ----------- | ---------- | ---- | ---------- |
| 101     | 500         | 1          | 1    | 1          |
| 102     | 500         | 2          | 1    | 1          |
| 103     | 400         | 3          | 3    | 2          |
| 104     | 300         | 4          | 4    | 3          |

Summary (Interview Version)

ROW_NUMBER() → Always unique, no ties.

RANK() → Ties get same rank, but gaps appear.

DENSE_RANK() → Ties get same rank, no gaps.

💡 Pro Tip: In interviews, mention use cases:

ROW_NUMBER() → Picking one row per group (e.g., latest order per customer).

RANK() → Competitions (like Olympic medals, where gaps are expected).

DENSE_RANK() → Categories or tiers (where you don’t want gaps).

*/
