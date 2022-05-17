#UNIQUE_Constraint
/*
- no duplicate are allowed , Only UNIQUYE values (similar to primary key)
- null values are allowed (unlike primary key)
- Can enter any number of null value
- unique index automatically created (similar to primary key) and Unique constrains is also an index
- Text and Blob can not be UNIQUE 
- We can have ONLY ONE PRIMARY KEY, but then we can any no of unique constraints per table unlike primayr key
- As constraint are function in MySQL, and the name for those functions are nothing but the column anmes
- Unique constrains is also an index
 
 => In MySQL, we can combine upto 32 composite uniques
 
 
 #IMPORTANT for declaring constraints
 
- column level constraint can be specified at the table level constraints(at the bottom of the table structure), but a table level constraint can never be specified at the table
	level composite constraint can never be specified at the column level.
- column level constraint can be specified at the table level constraints(at the bottom of the table structure), 
	except for null constraint which which is alwys a column level constraint and therefore syntax wont support from from specifying it at the tbale level

i.e.

create table emp(
empno char(4),
ename varchar(25),
sal float,
deptno int,
mob_no char(15),  
unique (deptno,empno),  #--> table level constrain at the end of the table structure
unique(mobno) --  #--> column level constrains at the table level at the end of the table structure
); 

*/

drop table emp;

create table emp(
empno char(4),
ename varchar(25),
sal float,
deptno int,
mob_no char(15) unique,   #--> column level constrains
unique (deptno,empno)     #--> table level constrains AT THE END of the table structure
);

desc emp;

-- =====================================================
#view indexes

show indexes from emp;

select * from information_schema.table_constraints;

select * from information_schema.table_constraints
where table_schema = 'employee_details';

select * from information_schema.key_column_usage
where table_name = 'emp';

-- =====================================================

#checkindexes - Unique constrains is also an index
show indexes from emp;

use information_schema;
select * from statistics;

use employee_details;

drop index mob_no on emp;

drop index deptno on emp;

show indexes from emp;

-- =====================================================

#ADD_UNIQUW_CONSTRAINTS_AFTERWARDS

alter table emp
	 add constraint u_emp_mob_no unique(mob_no);

show indexes from emp;

#constraint u_emp_mob_no  -> Optional

alter table emp
	 add unique(mob_no);

-- =====================================================
#composite_UNIQUE

alter table emp
	 add unique(empno,deptno);

show indexes from emp;

drop index empno on emp; 
/*
here in the above Code, empno is the unique index name and  in case of composite unique constraint the driving key  
name is assigned to the unique index name so on deleting the index empno  it will seach for the normal empno index 
first if not found then it will search for the composite unique constraint having empno as driving index   
*/

alter table emp
	 add unique(deptno,empno);

drop index deptno on emp; -- here deptno is the unique index name


-- =====================================================

-- name the user friendly name to the index 
#for normal index
alter table emp
	add constraint un_mobno unique(mobno); 

#for composite index
alter table emp
	add constraint un_emp_deptno unique(deptno,empno);

-- constraint constraint_name is optional


-- =====================================================




