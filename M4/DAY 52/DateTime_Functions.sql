#DateTime_Functions
/*
- date function in Oracle and MySQL are totally different
- Date (1st Jan 1000 AD to 31st Dec 9999 AD)
- Time
- Datetime
- Year

- internally date is stored as a fixed-length number and it occupies 7 Bytes of storage
- datel-date2 -> returns number of days between the 2 dates
-- =======================================================
#sysdate and #now

- sysdate() -> used for date, time, clock display
- now() -> used to maintain logs of operations, e.g. maintains logs of DML operations

#dateadd(date1,n)  OR #dateadd(date1,-n) OR dateaddd(date1 interval n month) OR dateaddd(date1 interval n year)
#datediff(date1,date2) OR 
#date_add(date,interval n month) OR #date_add(date,interval n year)
#addtime()
#dayname()
#last_date()

#TO_DAYS()

	| Function / Syntax                       | Valid in MySQL? | Notes / Correct Usage                                                               |
| --------------------------------------- | --------------- | ----------------------------------------------------------------------------------- |
| `DATEADD(date1, n)`                     | ❌               | MySQL does **not** have `DATEADD()`. Use `DATE_ADD(date, INTERVAL n unit)` instead. |
| `DATEADD(date1, -n)`                    | ❌               | Same as above; use `DATE_SUB(date, INTERVAL n unit)`.                               |
| `dateaddd(date1 INTERVAL n month/year)` | ❌               | Misspelled. Correct: `DATE_ADD(date1, INTERVAL n MONTH)` or `INTERVAL n YEAR`.      |
| `DATEDIFF(date1, date2)`                | ✅               | Returns number of **days** between `date1` and `date2`.                             |
| `DATE_ADD(date, INTERVAL n month/year)` | ✅               | Correct syntax. Adds months, years, days, etc.                                      |
| `ADDTIME(time, expr)`                   | ✅               | Adds a time interval to a time/datetime.                                            |
| `DAYNAME(date)`                         | ✅               | Returns weekday name, e.g., 'Saturday'.                                             |
| `LAST_DATE()`                           | ❌               | Incorrect. MySQL uses `LAST_DAY(date)` to get month-end.                            |
| `SYSDATE()`                             | ✅               | Returns current system datetime, evaluated **at call time**.                        |
| `NOW()` / `CURRENT_TIMESTAMP`           | ✅               | Returns current datetime, evaluated **once per statement**.                         |

| Function   | Syntax                            | Description                                                                 |
| ---------- | --------------------------------- | --------------------------------------------------------------------------- |
| `DATE_ADD` | `DATE_ADD(date, INTERVAL n unit)` | Adds a specific interval (DAY, MONTH, YEAR, HOUR, MINUTE, SECOND) to a date |
| `DATE_SUB` | `DATE_SUB(date, INTERVAL n unit)` | Subtracts a specific interval from a date                                   |
| `ADDTIME`  | `ADDTIME(time, expr)`             | Adds a time value to a time or datetime                                     |
| `SUBTIME`  | `SUBTIME(time, expr)`             | Subtracts a time value from a time or datetime                              |

| Function   | Syntax                   | Description                                          |
| ---------- | ------------------------ | ---------------------------------------------------- |
| `DATEDIFF` | `DATEDIFF(date1, date2)` | Returns the difference in **days** between two dates |
| `TIMEDIFF` | `TIMEDIFF(time1, time2)` | Returns difference between two times or datetimes    |

| Function    | Syntax                            | Description                                  |
| ----------- | --------------------------------- | -------------------------------------------- |
| `YEAR`      | `YEAR(date)`                      | Extracts the year from a date                |
| `MONTH`     | `MONTH(date)`                     | Extracts the month number (1–12)             |
| `DAY`       | `DAY(date)` or `DAYOFMONTH(date)` | Extracts the day of the month                |
| `HOUR`      | `HOUR(time)`                      | Extracts hour                                |
| `MINUTE`    | `MINUTE(time)`                    | Extracts minute                              |
| `SECOND`    | `SECOND(time)`                    | Extracts second                              |
| `DAYNAME`   | `DAYNAME(date)`                   | Returns weekday name, e.g., 'Saturday'       |
| `MONTHNAME` | `MONTHNAME(date)`                 | Returns month name, e.g., 'August'           |
| `DAYOFWEEK` | `DAYOFWEEK(date)`                 | Returns weekday number (1=Sunday…7=Saturday) |
| `WEEKDAY`   | `WEEKDAY(date)`                   | Returns weekday number (0=Monday…6=Sunday)   |
| `QUARTER`   | `QUARTER(date)`                   | Returns quarter (1–4)                        |
| `DAYOFYEAR` | `DAYOFYEAR(date)`                 | Returns day of year (1–366)                  |
| `WEEK`      | `WEEK(date)`                      | Returns week number of the year              |

| Function   | Syntax                           | Description                              |
| ---------- | -------------------------------- | ---------------------------------------- |
| `LAST_DAY` | `LAST_DAY(date)`                 | Returns the last day of the month        |
| `MAKEDATE` | `MAKEDATE(year, day_of_year)`    | Returns a date from year and day-of-year |
| `MAKETIME` | `MAKETIME(hour, minute, second)` | Returns a time from hour, minute, second |

| Function          | Syntax            | Description           |
| ----------------- | ----------------- | --------------------- |
| `NOW()`           | `NOW()`           | Current date and time |
| `CURRENT_DATE`    | `CURRENT_DATE`    | Current date only     |
| `CURRENT_TIME`    | `CURRENT_TIME`    | Current time only     |
| `CURDATE()`       | `CURDATE()`       | Current date only     |
| `CURTIME()`       | `CURTIME()`       | Current time only     |
| `UTC_DATE()`      | `UTC_DATE()`      | Current UTC date      |
| `UTC_TIME()`      | `UTC_TIME()`      | Current UTC time      |
| `UTC_TIMESTAMP()` | `UTC_TIMESTAMP()` | Current UTC datetime  |

| Function         | Syntax                      | Description                    |
| ---------------- | --------------------------- | ------------------------------ |
| `STR_TO_DATE`    | `STR_TO_DATE(str, format)`  | Converts string to date        |
| `DATE_FORMAT`    | `DATE_FORMAT(date, format)` | Formats date into a string     |
| `TIME_FORMAT`    | `TIME_FORMAT(time, format)` | Formats time into a string     |
| `UNIX_TIMESTAMP` | `UNIX_TIMESTAMP([date])`    | Returns Unix timestamp         |
| `FROM_UNIXTIME`  | `FROM_UNIXTIME(timestamp)`  | Converts timestamp to datetime |


-- =======================================================
LIST Functions :
- independent of datatype

	| Function                                             | Description / Notes                                                                      |
| ---------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `COALESCE(expr1, expr2, ...)`                        | Returns the first **non-NULL** value. Works with numbers, strings, dates, etc.           |
| `NULLIF(expr1, expr2)`                               | Returns `NULL` if `expr1 = expr2`, else returns `expr1`. Works with most datatypes.      |
| `CASE`                                               | Conditional expressions; works for any datatype.                                         |
| `IFNULL(expr1, expr2)` (MySQL)                       | Returns `expr2` if `expr1` is NULL. Works for numbers, strings, dates.                   |
| `GREATEST(expr1, expr2, ...)`                        | Returns the **largest value**; can work for numbers, strings (lexicographically), dates. |
| `LEAST(expr1, expr2, ...)`                           | Returns the **smallest value**; similar rules as `GREATEST`.                             |
| `CAST(expr AS datatype)` / `CONVERT(expr, datatype)` | Converts between datatypes, flexible.                                                    |
| `COALESCE` + `CASE`                                  | Often used together for datatype-independent logic.                                      |


-- =======================================================
*/
drop table emp;

create table emp
(
empno char(4),
ename varchar(25),
sal float,
deptno int,
hiredate date 
);

insert into emp values
('1','Kiran Shinde',2237.54,1,'70-12-4'),
('2','Pranit Navale ',1236.1435,1,'57-5-7'),
('3','Kiran Kumar',3224.5445,2,'87-5-7'),
('4','Rahul Deshmukh',53231.254,2,'69-12-6'),
('5','Rahul Pandey',3232.94,2,'99-4-23');

select * from emp;

-- =======================================================

select sysdate() from dual; -- retunr the server date and time and not of client date and time / server date and time is more secure as it can not be manipulated
-- 2022-05-20 18:35:55

select now() from dual; -- return date and time when the statement began to execute 

select sysdate(), now(), sleep(10),sysdate(), now() from dual;
/*
OP :
'2022-05-20 18:25:35'	'2022-05-20 18:25:35'	0	'2022-05-20 18:25:45'	'2022-05-20 18:25:35'
*/
-- =======================================================
#dateadd()

#Display tommorrow's date with today's current time
select adddate(sysdate(),1) from dual; 

#add 1 day to the hiredate of each employee
select adddate(hiredate,1) from emp; 

#Display yesterday's date with todays current time
select adddate(sysdate(),-1) from dual; 

-- =======================================================
#datediff(a,b) -- here a and b refering to the two date column's, or variables having datatype date

-- will give the difference between the two dates

select datediff(sysdate(),hiredate) from emp;
/*
18795
-12771
12797
-17367
8428
*/

-- =======================================================
#interval

select * from emp;
/*
1	Kiran Shinde	2237.54	1	1970-12-04
2	Pranit Navale 	1236.14	1	2057-05-07
3	Kiran Kumar	3224.54	2	1987-05-07
4	Rahul Deshmukh	53231.3	2	2069-12-06
5	Rahul Pandey	3232.94	2	1999-04-23
*/

select date_add(hiredate,interval 2 month) from emp;  #adds 2 months to the date

select date_add(hiredate,1) from emp; -- ERROR 

select adddate(hiredate, interval 100 year) from emp; 

/*
1971-02-04
2057-07-07
1987-07-07
2070-02-06
1999-06-23
*/

#substracts 2 months to the date
select date_add(hiredate,interval -2 month) from emp; 
/*
1970-10-04
2057-03-07
1987-03-07
2069-10-06
1999-02-23
*/

# adds 1 year to the date
select date_add(hiredate,interval 1 year) from emp; 
/*
1971-12-04
2058-05-07
1988-05-07
2070-12-06
2000-04-23
*/

#removes 1 year from the date
select date_add(hiredate,interval -100 year) from emp;
/*
1870-12-04
1957-05-07
1887-05-07
1969-12-06
1899-04-23
*/

-- =======================================================
#last_date()
-- available ONLY in MySQL and Oracle

#returns last date of month 
select last_day(hiredate) from emp;
/*
1970-12-31
2057-05-31
1987-05-31
2069-12-31
1999-04-30
*/

#dayname()
#returns day of the date
select dayname(sysdate()) from dual; 
-- Friday

select substr(dayname(now()),1,3) from dual; -- Fri

#addtime()
#adds 1 seconds to the time
select addtime('2020-01-10 11:00:00','1') from dual; 

select ('2020-01-10 11:00:00','1:10:10') from dual; 

#We can go upto millinseconds that upto 6 digits in seconds
select addtime('2020-01-10 11:00:000001','1') from dual;

-- =======================================================
#LIST Functions

/*
EMP => 

ename sal    comm
----- ----- ------
A 	  5000    500
B     6000    null
C     null    700
*/
select * from emp where comm = null; -- returns nothing => 

select * from emp where comm is null; -- returns comm with null values => B     6000    null

select * from emp where comm != null; -- returns nothing

select * from emp where comm is not null; -- returns comm with not null values 

/*
- Searching for null value is pessimistic querieing
- any comparison done with null, returns null
- 'isnull' is a special operator
- Any operation done with the null retrun null
- e.g. if sal is 5000 and if comm is null then sal+com = null
*/
select sal+comm from emp; --  if any of sal or comm is null then enitre op will be null

select * from emp;
/*
1	Kiran Shinde	2237.54	1	1970-12-04
2	Pranit Navale 	1237.54 1	2057-05-07
3	Kiran Kumar		3224.54	2	1987-05-07
4	Rahul Deshmukh	53231.3	2	2069-12-06
5	Rahul Pandey	3232.94	2	1999-04-23
*/

update emp
	set sal = null	
		where empno = 2;
/*
1	Kiran Shinde	2237.54	1	1970-12-04
2	Pranit Navale 	null    1	2057-05-07
3	Kiran Kumar		3224.54	2	1987-05-07
4	Rahul Deshmukh	53231.3	2	2069-12-06
5	Rahul Pandey	3232.94	2	1999-04-23
*/
        
select * from emp	
	where sal = null;
/*
OP IS NOTHING as any operation done with the null returns null only and null means nothing
*/    

select * from emp	
	where sal is null;
/*
2	Pranit Navale 		1	2057-05-07
*/    
#MySQL solution:
select sal from emp;
/*
2237.54
null
3224.54
53231.3
3232.94
*/
select ifnull(sal,1000) from emp;
/*
2237.54
1000
3224.54
53231.3
3232.94
*/
select sal from emp where empno =2;
select ifnull(sal,0) from emp where empno =2;

select sal + deptno from emp;
/*
2238.5400390625
null
3226.54443359375
53233.25390625
3234.93994140625
*/    
select ifnull(sal,0) + deptno from emp;   
/*
2238.5400390625
1
3226.54443359375
53233.25390625
3234.93994140625
*/

#ifnull()
/*
- ifnull(comm,100) -- here if comm is null then it will return 100 for any operation
- ifnull(orderdat,'2022-01-01') -- here if orderdate is null then it willreturn the date specidified ahead
- ifnull(city,''mumbai') -- here id city is null then default mumbai will be provided in the operation with the city column
*/

#In Oracle - solution
#nvl(columns_name that might contain a null value,default);
select nvl(sal,0) from emp;

-- =======================================================
#greatest()
-- upper limit is upto 255 columns or values
-- greatest(num1,num2,num3);
-- greatest(str1,str2,str3)// string comparision is based on the ascii values 
-- greatest(date1,date2,date3);


select greatest(1,2,3,4,4,5,6,7,54,5,4) from dual; -- 54

select greatest('Kiran','Kirtan', 'Kripalu') from dual; -- Kripalu

select greatest(sysdate(),now(),datediff(sysdate(),now()),adddate(now(),1)) from dual; -- 2022-05-21 20:06:30

select greatest(sal,10000) from emp;
/*
10000
null
10000
53231.3
10000
*/

select  greatest(ifnull(sal,40000),10000) from emp;
/*
10000
40000 -- here since we gave default values of 40,000 in case sal is null and since 40,000 > 10,000 => op is 40,000  
10000
53231.3
10000
*/

#MySQL programming =>  
set x = greatest(num1,num2,num3);

-- =======================================================
#least();
-- returns the smallest value
-- greatest is used to set the lower limit on some value
-- least is used to set the upper limit on some value

#use:

-- BONUS = 10% sal, min BONUS = 300
select greatest(ifnull(sal*0.1,100),300) "BONUS" from emp;
/*
300
300
322.45444335937503
5323.125390625
323.29399414062505
*/

#CASHBACK = 10% amt, max CASHBACK = 1000
select least(amt*0.1, 1000) "CASHBACK" from orders;

-- ===============================================================
#CASE Expression
/*
select 
case
when ---- then ----
when ---- then ----
when ---- then ----
else ----
end
from table_name;

- else is optional but if else is not specified then for all the other values it returns null values
*/

select deptno, ename, ifnull(sal*12,0000) annual, 
case
when deptno= 1 then ifnull(sal*12*0.4,1000)
when deptno= 2 then ifnull(sal*12*0.3,2000)
else sal*12*0.1
end "HRA"
from emp;
/*
1	Kiran Shinde	26850.48046875	10740.1921875
1	Pranit Navale 		  0				1000
2	Kiran Kumar		38694.533203125	11608.3599609375
2	Rahul Deshmukh	638775.046875	191632.5140625
2	Rahul Pandey	38795.279296875	11638.583789062499
*/

#if else is ommited rest all deptno other than 1 will get null values in HRA field
select deptno, ename, ifnull(sal*12,0000) annual, 
case
when deptno= 1 then ifnull(sal*12*0.4,1000) 
end "HRA"
from emp;
/*
deptno		ename			annual			HRA
====================================================
1		Kiran Shinde	26850.48046875	10740.1921875
1		Pranit Navale 			0			1000
2		Kiran Kumar		38694.533203125	 	null
2		Rahul Deshmukh	638775.046875		null
2		Rahul Pandey	38795.279296875		null
*/

select  
case
when deptno = 1 then 'One'
when deptno = 2 then 'two'
end "DEPTCODE"
from emp;
/*
DEPTCODE
  One
  One
  two
  two
  two
*/
/*
if sal < 3000 then REMARK = 'Low Income'
if sal = 3000 then REMARK = 'Middle Income'
if sal > 3000 then REMARK = 'High Income'
*/

select * from emp;
/*
1	Kiran Shinde	2237.54	1	1970-12-04
2	Pranit Navale 	null	1	2057-05-07
3	Kiran Kumar		3224.54	2	1987-05-07
4	Rahul Deshmukh	53231.3	2	2069-12-06
5	Rahul Pandey	3232.94	2	1999-04-23
*/

select ename,
case
when sal<3000 then 'Low Income'
when sal>3000 then 'High Income'
when sal is null then 'No Income'
else 'Middle Income'
end 'INCOME'
from emp;
/*
Kiran Shinde	Low Income
Pranit Navale 	No Income
Kiran Kumar		High Income
Rahul Deshmukh	High Income
Rahul Pandey	High Income
*/

#BETTER_solution

select ename,
case
when sign(3000-sal)= -1 then 'low Income'
when sign(3000-sal)= 1 then 'High Income'
when sal is null then 'No Income'
else 'Middle income'
end 'Income'
from emp;
/*
Kiran Shinde	High Income
Pranit Navale 	No Income
Kiran Kumar		low Income
Rahul Deshmukh	low Income
Rahul Pandey	low Income
*/

/*UPDATE USING CASE :*/
UPDATE emp
SET salary = CASE
    WHEN deptno = 10 THEN salary * 1.10   -- 10% increase for dept 10
    WHEN deptno = 20 THEN salary * 1.05   -- 5% increase for dept 20
    ELSE salary                            -- others remain same
END
WHERE deptno IN (10, 20, 30);

-- ====================================================================
#Environment function (Only for MySQL)

#user()
-- used to maintain the log of the DML Operations

select user() from dual;  -- 'kiran@localhost'

select user from dual; -- In Oracle

-- can be used in values of insert statement
# e.g.
insert into emp(ename,sal,user_name,dateandtime) 
values('KING',5000,user(),now());

-- ====================================================================
#to_days()
-- will return a unique integer assigned for particular date

select TO_DAYS(now()) from dual;

select TO_DAYS('9999-12-31') from dual; -- 3652424

select TO_DAYS('1000-01-01') from dual; -- 365243

#minute() -- return the minutes from the expression
select MINUTE('12:23:00') from dual; -- 23

#WEEK()
-- 	Return the week number
select week(now()) from dual; -- 20

#WEEKDAY()
-- Return the weekday index
select WEEKDAY(now()) from dual; -- 4

#WEEKOFYEAR()
-- Return the calendar week of the date (1-53)
select WEEKOFYEAR(now()) from dual; -- 20

#YEARWEEK()
-- retunr year and week without space
select YEARWEEK(now()) from dual; -- 202220

-- ====================================================================

#FUNCTION PRACTICE 

select trim('      String       ') from dual;
-- String
select rtrim('      String       ') from dual;
--       String
select ltrim('      Kiran') from dual;
-- String      

select RIGHT(ename,3) from emp;
/*
nde
le 
mar
ukh
dey
*/
select LEFT(ename,3) from emp;
/*
Kir
Pra
Kir
Rah
Rah
*/

select REVERSE(ENAME) FROM EMP;
/*
ednihS nariK
elavaN tinarP
ramuK nariK
hkumhseD luhaR
yednaP luhaR
*/

#random floating values
SELECT RAND() from dual;




