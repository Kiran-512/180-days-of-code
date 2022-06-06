#check constraint
/*
- used for validations, used for chekcing
- e.g. sal>21000, age>18 etc.
 when we write check(sal>5000) 
 then user should enter the sal greater than 5000, less than and equalto wont be allowed
 
 - check(sal>5000 and sal<20,000),
 
 - for status we can write check(status in ('T','P','R')),
 - IN THIS USER HAS TO ENTER ANY OF THE THREE VALUES, T P or R only
 
 We can use below operators with the check
 - relational
 - arithmatic
 - special operator (in,between,like etc)
 - call single row function(uoper,lower,round,sign, etc.)
 - but not the multi row functions
 
#DEFAULT 
- DEFAULT is not a constraint
- its a claused used while creating a table
- when user dont give any input for any column having default clasue, it willtake default value specified by the programmer,\

#auto_increment 
- it will increment the value in particular column with the auto-increment column clause by 1 each time user insert into the table
- EVEN if user gives wrong input and entry wont bve inserted into the table bu tstill auto_increment will be incremented
 
=>  to make the use of default and auto_increment use below insert statement
insert into emp(ename,deptno,comm,mob_no) 
value();

*/
-- ========================================================
use employee_details;
drop table emp;

show tables;

create table emp
(
empno int auto_increment primary key,
ename varchar(25) check(ename = upper(ename)),
sal float default 7000
check(sal between 5001 and 20999), #column level constraint
deptno int,
comm float not null,
status char(1) default 'T'
check(status in ('T','P','R')),
mob_no char(15) unique,
check(sal+comm<500000),           #=> table level constraint
constraint fk_emp_deptno foreign key(deptno) references dept(deptno)
);

-- ========================================================

select * from emp;
select * from dept;

insert into emp(ename,deptno,comm,mob_no) 
value('Kiran',1,3000,9867874657);

insert into emp(ename,deptno,comm,mob_no) 
value('Akshay',2,3000,98678744567);

insert into emp(ename,deptno,comm,mob_no) 
value('Akshay',2,30000000,98678744567); # => ERROR  AS CHECK CONSTRAINT 4 IS VIOLATED

select * from emp;

-- ========================================================


