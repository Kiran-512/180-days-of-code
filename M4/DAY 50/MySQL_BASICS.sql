#MySQL - SQL
/*
#row_storing in Server DB HD
- Rows of the table in DB server HD are stored at scattered locations and not at the 
	same loction as in the case of excel file.
- Hence we can not have the rows as per sequence when the all rows are 
	selected from the particular table;
- IT'S ONLY WHEN WE PHYSICALY OR EXPLICITELY STORES THE ROW INDEX IN THE PARTICULAR 
	ROW AND THEN SELECT that row with the index given
- When you insert a row into your table, where-ever MySQL finds a free space, 
	it will store the row over there!
- In all RDBMS, the row's inside the table are not stored sequencially, 
	the rows inside the table are fragmented all over the server database HD   
- When you select the table, the order of the rows in the output depends on the row address 
- When in future if you UPDATE the row, if the row length is icreasing, if the free space is not available, 
	then the row address may change,
  Hence there's no way to find out the the first 'N' rows inside the table or the last 'N' rows of the last table;

==========================================================================
#Order by clause
- to get the row's by some order;
- DEFAULT IS ASCENDING ORDER
- asc --> by default its ascending sorting
- desc --> descending sorting
- - No upper limit on the columns in ORDER BY clause

- select deptno, job, ename, sal, hiredate from emp
		order by hiredate desc;

- Here if the date is same then time is checked and if the time is also same then address is checked

select --------------------
order by country, state, district, city;

- if you have to large no of rows in the table and if you have the large no of columns in the order by clause then 
select statement will be slow as that much sorting has to take place in the is server RAM.

- sorting is one operation that always slows down your select statement.


#computed columns_order by clause
- computed columns are allowed in order by clause,
- even alias is also allowed in order by clause;


--========================================================================

#Where along with order by clasue
- when we use where clause at that time searching takes place in server HD and
- where clause is ALWAYS used before the order by clasue
- WHERE CLAUSE IS USED TO RESTRICT THE ROWS
- where clause is used to retrieve the row from DB SERVER HD to server RAM.
- when we use order by then sorting takes place in server RAM AFTERWARDS
-- =====================================================

Wildcard => 
---------
- Wildcards used for pattern matching  : 
- % => Any character or any no of character 
- "-" => used to select any one character 
 -- =========================================================
#between operator
#Any Operator  -  more powerfull than 'in' operator 	

#IN Operator - more faster than ANY
- within operator we can check only in or not in 
- whereas with any op- if you want to check for equality or inequality then use 
	In operator
- we can check for = any(),!= any(),>= any(),<= any(),> any(),< any() etc.
- if we want to check for <,>,<=,>=,!=,= oerator 
=========================================================

#UPDATE
- WE CAN UPDATE MULTIPLS ROWS AND COLUMNS FOR 1 TABLE ONLY
- To update the rows of multiple tables we need diff update commands

=========================================================
#DELETE 
- Its not a good practice to delete the data, as data is very precious!
- instead we can have the status column and is employee leaves then we can update the status!

- delete command is not allowed without where clause we have to mention that
=========================================================
#DROP
- drop command is is used without where clause 
- We can not use where caluse with the drop table as drop table is DDL command
- update and delete commands without where clause will not be allowed(update allowed but then it will update the valuyes in 'set' for all the rows of the mentioned column) 

======================================================================================================
To use update and delete without where clause in MySQL Workbench :
-------------------------
- update and delete wont be allowed without where clause in MySQL Workbench

#so to enable it :
--------------------
- click on edit (menu at the top)--> preferences-> SQL editor -> safe updates (checkbox at the bottom) -> uncheck it -> click on OK

- This requires reconnection to the server

- Click on Query (menu at the top) -> Reconnect to server -> Clik on it

=========================================================
#Transaction Processing : DTL/TCL
#commit 
-------
- will save all the DML changes since the last commited state
- commit will make your transaction permanent! 
- when user issues a commit, it is known as End of transaction 
- Commit will make the transaction permanent

- Commit work;
- Commit;

- WORK -> ANSI SQL
- WORK -> optional in MySQL and Oracle both!

TOTAL WORK => t1+t2+t3+t4+......+tN;

- Transaction addition is the total work done in day
 
- eg.
 insert---
 update--
 selete---
 commit work;//Transaction 1
 insert--
 update--
 commit work; // Transaction 2
 insert--
 insert--
 insert--
  
- commit work;// transaction 3
 
=========================================================
 #Rollback 
 
- this will rollback work to the last commit point
- Rollback will undo all the DML changes untill the last commit point
- What is commit, that can not be rolledback!
 
- WORK -> ANSI SQL
- WORK -> optional in MySQL and Oracle both!

=> ONLY DML commands are affected by commit and rollback;
=> Any DDL COMMANDS it DETECTS and those won't be rolledback or commited;

- rollback work;
- rollback;


=> In SQL plus when we exit from command line without commit,
   then it will automatically commits the changes
 
=> Where as in SQL will have to commit the changes and if we dont do so then commit wont be performed explicitely
   its good thing that only commited data will get into the database;
   
=> Any kind of power failure, Network failure, System failure, Improper exit,system boot, window close etc. in all such cases
   last transaction is automatically rolledback;
   To try out Rollback, Commit, savepoints in MySQL in  Workbnch:-
 
- Click on Query(menu at the top)-> Auto-commit Transaction -> Uncheck it

=========================================================
#SAVEPOINTS

- flag points or milestones in work progress
- can be used with rollback work command
- savepoint is sub-unit of transaction
- similar to the bookmark
- Within same transaction we can issue same savepoints and rollback to the savepoints


insert--
insert--
update--
savepoint abc;
update--
insert--
rollback work to abc;// this will rollback work to the abc point here we don't have to commit the work

- rollback to abc;
- OR
- rollback work to abc;

- Work is ANSI SQL
- Work is an optional in MySQL nad Oracle

- We can not commit to a save-point  
- Commit will save all the changes since the last commit points
- We can rollback sequencially only
- When we rollback the intermidiate savepoints are cleared, If we want to use them again
  We will have to reissue them again some new work
- Within a transaction we can have two savepoints but then new savepoint will override 
  the old one and older one no longer exist
- Savepoints will be used in smaller and larger transactions

COMMIT, ROLLBACK AND SAVEPOINT IN WORKBENCH
----------------------
- Click at the Query (menu at top)
- Auto-Commit Transactions
- Uncheck it

In Oracle
----
- SET AUTOCOMMIT ON
- SET AUTOCOMMIT OFF

=> Savepoints:  
- can use upto 30 characters
- same rules for naming

=========================================================

*/
-- =====================================================
#ORDER BY
 select deptno, job, ename, sal from emp
	order by job;

insert into emp (job) values
('Manager'),
('Manager'),
('Clerk'),
('MD'),
('VP');  

SELECT * FROM EMP;

-- =====================================================
#Where and Order by

select deptno, job, ename, sal, dob from emp
where deptno = 10
order by ename desc;

select deptno, job, ename, sal, hiredate from emp
order by ename desc
where deptno = 10;  # ERROR

select deptno, job, ename, sal, hiredate from emp
order by deptno, ename desc;

#all table will be ordered by deptno and then within deptno names will be ordered in descending manner.
 
-- =====================================================
#Computed and order by 

select deptno, sal*12 from emp
order by sa*12;

select deptno, sal*12 "annual" from emp
order by "annual";

#easiest way:
select deptno, sal*12 "annual" from emp
order by 2;

#here 2 is the column number and 2nd column number is annual in select statement and not in table
-- ====================================================
#like operator :

#select all the enames with starting with 'A'

select * from emp
where ename>='A' and ename < 'B';

/*
- here ADAMS > A    and ADAMS< B     => 
-------------------------------------
=>Blank padded comparision semansistics:
- When you compare the two strings then the storter of the two strings is temprorility padded 
  with the blank spaces on RHS, such that their length becomes equal and the starts the 
  comparision character by character based on ASCII value.
*/

#Method 2
#solution for MySQL :

select * from emp
		where ename like 'A%';

--  Solution for Oracle:Since its case sensivitve 
select * from emp
		where ename like 'A%' or where ename like 'a%';

-- =====================================================
#Wildcards:
#any name containing A at the start or at the end or in the middle
select * from emp
	where ename like '%A%';

#Any ename end with A
select * from emp
	where ename = '%A';

#Any name with the four letters  - noted : space MUST BE AVAOIDED IN BETWEEN TWO '_'
select * from emp
		where ename like '_____';
        

#any name containg A in the end and word has 5 letters
select * from emp
		where ename like '____N%';
#Since MySQL is case insensitive in case of quries hence the o/p for both the select statements will be the same
select * from emp
		where ename like '____n%';

#any name containg B at the start and A at last and 5 letters word
select * from emp
	where ename like 'B___A';

#any name NOT containing A at the start
select * from emp
	where ename not like 'A%';

-- =================================================
#between operator

select * from emp
		where sal>= 5000 and sal<= 7000;

#same can be written as below with the between operator
select * from emp
where sal between 5000 and 7000; #inclusive values

#above statement is easier to write and works faster

select * from emp
where sal not between 3000 and 5000;  #both the values inclusive

select * from emp
where hiredate >= '1900-01-01' and hiredate<= '1990-6-3';

#same can be written as below
select * from emp
where dob between '1900-01-01' and '1990-6-3'; #both the date inclusive

select * from emp
where ename >= 'A' and ename <= 'F';

#ABOVE can be written as below
select * from emp
where ename between 'A' and 'F';

-- =====================================================
#Any Operator  -  more powerfull than 'in' operator 

--  ANY -> Logical or operator

select * from emp
where deptno = 10 or deptno = 20 or deptno =30;

select * from emp
where deptno = any(10,20,30);

select * from emp
where deptno != any(10,20,30);

select * from emp
where deptno > any(10,20,30);

select * from emp
where deptno < any(10,20,30);

-- ==========================================================
#in Operator - faster than any OPERATOR as any OPERATOR has one more operator '=' which increases the time for the results

#in -> Logical or operator

select * from emp
	where deptno = 10 or deptno = 20 or deptno =30;

select * from emp
	where deptno in(10,20,30);

select * from emp
	where deptno not in(10,20,30);

-- =========================================================
#UPDATE

update emp
	set deptno = 10
		where city = 'mumbai';

SELECT * FROM EMP;

#Even expression can be written for CONSTANTS in set
#add 40% to the sal of empno 1
update emp
	set sal = sal + sal*0.4
		where empno = 1;

#We can change BOTH the values at the same time with set statement in update
update emp
	set sal = sal + sal*0.4, city = 'Pune'
		where empno = 3;

update emp
	set sal = sal + sal*0.4, city = 'Chennai'
		where empno = 4;
        
update emp
	set sal = 10000, city = 'jalgoan',empno= 10, deptno = 20,ename ='Pankaj Kumar'
		where job ='Manager';


update emp
	set sal = 1000, city = 'Nashik',empno= 12, deptno = 30,ename ='Rishi Kumar'
		where job ='Clerk';

select * from emp;

#if where condition is removed the deptno will bet set 20 for all the employee of emp table

update emp
	set deptno = 20;
    
select * from emp;

/*
1	Amit	7000	Mumbai	1990-06-03		20
2	Amit	8000	Mumbai	1999-08-12		20
3	Pranit	11200	Pune	1970-08-13		20
4	Ramesh	9800	Chennai	1990-09-03		20
5	Rahul	6000	Mumbai	1990-10-03		20
6	Kiran	5000	umbai	1990-11-03		20
3		9800	Pune			20
4		11200	Chennai			20
5		9000				20
10	Pankaj Kumar	10000	jalgoan		Manager	20
10	Pankaj Kumar	10000	jalgoan		Manager	20
12	Rishi Kumar	1000	Nashik		Clerk	20
					MD	20
					VP	20
*/

-- ======================================================

#DELETE 
delete from emp
	where empno = 1;

select * from emp;

/*
2	Amit	8000	Mumbai	1999-08-12		10
3	Pranit	11200	Pune	1970-08-13		10
4	Ramesh	9800	Chennai	1990-09-03		10
5	Rahul	6000	Mumbai	1990-10-03		10
6	Kiran	5000	umbai	1990-11-03		
3			9800	Pune			
4			11200	Chennai			
5			9000				
10	Pankaj Kumar	10000	jalgoan		Manager	20
10	Pankaj Kumar	10000	jalgoan		Manager	20
12	Rishi Kumar	1000	Nashik		Clerk	30
null				MD	
null				VP	
*/

#Since any comparision done tih the null return null only hence no rows will be deleted with this command 
delete from emp
	where ename = null;

select * from emp;

-- ============================================
#DROP TABLE
#will delete the entire table and also deletd the table structure too!

drop table emp;

drop table emp, dept;

-- ============================================
