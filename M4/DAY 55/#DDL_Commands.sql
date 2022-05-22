#DDL_Commands 
/*
1.Alter table
-- ===================================
=> DIRECTLY: We can use commands directly without any effect on data

- rename a table  - 
		#rename table old_table_name to new_table_name;
        
- add a column to the table (bydefault new column id added to the end of the table structure)
		alter table table_name
			add column_name datatype width;
            
- drop a column from table -- 
		alter table table_name 
			drop column_name;
            
- increase the width of the table => Will have to modity the columns everywhere we have specified with old datatype
	alter table table_name
		modify column_name datatype(new_width);

-- ===================================    
=> INDIRECTLY : We can not use commands directly without any effect on data, data gets affected eg.may get truncate hence we use it indirectly

=> reduce the width of the column ->
=> change the datatype of the column ->
=> copy the rows from one table to another table
=> copy a table ( for Testing purpose )
=> copy only structure of the table
=> rename a column
=> change the position of the columns in table structure (becasue of the null values -> for storage considerations )

-- ===================================
=> Extension columns:
#Its better to keep extra columns in the table for future requirements such columns are known as Extension columns
- used to extend the table 

*/

-- ===================================

#RENAME
-- In Oracle
-- rename table_name to new_table_name;

-- in MySQL:
#rename table old_table_name to new_table_name;
rename table emp to Employee;

-- ===================================

#add coulmn
alter table emp
	add emp_address varchar(100);

select * from emp;

-- ===================================
# drop_column_from_table
alter table emp
	drop emp_address;

select * from emp;

-- ===================================
#increase the width of the column
desc emp;    
/*
EMPNO	char(10)	YES			
ENAME	varchar(50)	YES			
SAL		float		YES			
DEPTNO	char(10)	YES			
JOB		char(10)	YES			
MGR		char(5)		YES			
*/


alter table emp
	modify ename varchar(55);
    
desc emp;    
/*
EMPNO	char(10)	YES			
ENAME	varchar(55)	YES			
SAL		float		YES			
DEPTNO	char(10)	YES			
JOB		char(10)	YES			
MGR		char(5)		YES			
*/

-- ===================================
#REDUCE THE WIDTH OF THE COLUMN
/*
- We can not reduce the width direclty as in the case of increasing the width
- In MySQL, We can use command directly we wont get any error ( MySQL is USER FRIENDLY in this case) but then Data will get truncated without warning 
- In Oracle We can reduce the width only if the data is null or else it won't allow  
*/

alter table emp modify ename varchar(50); -- MySQL is user friently this will work in MySQL

/*
EMPNO	char(10)	YES			
ENAME	varchar(50)	YES			
SAL		float		YES			
DEPTNO	char(10)	YES			
JOB		char(10)	YES			
MGR		char(5)		YES			
*/


#BUT below is recommended for both

#=> 5 Steps to reduce the width of the columns:
-- Same process is recommended for MySQL also as dat is important
#1.add new column of the same size
alter table emp add x varchar(55);

#2.copy all the date from the column, whose size to be reduced, into the new coiulmn created above and set that column as null 
update emp set x = ename, ename = null;

#3.Now Modify the width 
alter table emp modify ename varchar(50);

#4.get all the data back from the dummy column we created
update emp set ename =x;

#5.drop the dummy columns
alter table emp drop column x;


-- ===================================
#change_datatype_of_column

alter table emp modify empno int;

-- below is recommended method
alter table emp add x int;
-- desc emp;    
update emp set x=empno, empno =null;
-- desc emp;    
alter table emp modify empno char(4);
-- desc emp;    
/*DATA TESTING WITH THE X COLUMN*/
update emp set empno =null;
alter table emp drop column x;
-- desc emp;    

-- ===================================
#COPY_ROWS_FROM_ONE_TABLE_TO_ANOTHER_TABLE
/*
here emp_bmb and emp_dlh are tow diff tables with the 
*/

-- below line will copy all the rows from dept table to emp table
insert into emp select * from dept;

select * from emp;

-- to copy specific rows add where condition:
insert into emp select * from dept where deptno = '1';
 
select * from emp;

-- ===================================
#COPY_TABLE (Testing purpose)
/*
-- Recommended having multiple copies for testing
-- structure will be copied based on the select statement
-- select statemnet wont given any O/P on screen here it will be copied to new table
-- when we create new table by using sub-query, indexes on the original table are not copy into the table 
-- If you want the same indexes on the new table, you will have yo create them manually
-- when we create new table by using sub-query, constraints on the original table are not copied into the new table 
	except for not null constraint, becasue nullatbility is feature of the datatypes 
*/

create table emp_copy 
as
select * from emp;

-- ===================================
#copy_only_structure_of_the table =>

#Method1
create table emp_strut1
as
select * from emp;

delete  from emp_struct1;

commit;
-- ---------------------------
#Method 2:

create table emp_struct2
as
select * from emp;

truncate table emp_struct2;      -- => here truncate will delete and commit too!

/*

IQ :
Difference between DELETE and TRUNCATE: -
#DELETE 			
*DML command 
*Requires COMMIT 
*ROLLBACK possible 
*can use WHERE clause 
*Free space is not deallocated on table deletion
*when you delete the rows when you truncate a table delete tables
delete triggers on table on triggers will not execute


#TRUNCATE
DDL command
Auto COMMIT
ROLLBACK not possible
cannot use WHERE caluse with TRUNCATE
Free space is deallocated after table truncate

Major diff =>
Lets say emp table has 1 million rows and its size is 1 GB
when we
delete table emp; 
commit;
space is free but it remains allocated to emp table only
now when it comes to the deallocation of free space then we must do 
drop table emp;
and now then only the space gets free and other user and table can it

BUT incase of truncate we can deallocate free space with single truncate command only 

truncate table emp;
*/

#Method 3:

create table emp_struct3
	select * from emp where 1=2;
    
 desc emp_struct3;   
 
-- ===================================
#rename_Column    

create table emp_copy
as
select empno, ename, sal salary from emp;

drop table emp;

rename table emp_copy to emp;

-- ===================================

#change the column position

create table emp_copy
as 
select sal, empno, ename from emp;

drop table emp;

rename table emp_copy to emp;

-- =======================================================================================================

