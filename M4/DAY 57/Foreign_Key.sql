#Foreign_Key (Foreign column)
-- ==========================
/*
- column or set of columns of the one table that references a column or set of columns of another table or sometimes of the same table too!
- FK is not required write a join, as join helps us to get thye common or uncommon data of the two diff tables, or of the same table but FK helps to let us know that the entered value is valid or not! 
- FK constraint is specified on the child column and not on the parent column or the relation would get inverted
- Parent column has to be primary key or Unique key (Pre-requisite for FK) Why unique => as no duplicates and about null, any comparision done with the null returns null only!
- FK will allow duplicate values unless specified otherwise (unless the same column specified as primary key!)
- FK will allow null values also unless specified otherwise(unless the same column has not given the not null constraint)
- FK may reference column of same table also and its know as self referencing
 
*/

drop table emp;

drop table dept;

create table dept(
deptno int primary key,
dname varchar(25),
loc varchar(15)
);

create table emp(
empno char(4) primary key,
ename varchar(25),
sal float ,
deptno int,
mgr char(4),
constraint fk_emp_deptno foreign key(deptno) 
references dept(deptno),
-- constraint fk_emp_mgr is optional,it's just ato give user friently name 
foreign key(mgr) references emp(empno) -- one column(child) of the one table is refrencee the another column (PARENT) of the same table
);

desc emp;

desc dept;

#constraint fk_emp_mgr : Optional, if not specified then MySQL will given its own name for foreign key

/*
ERROR while inserting into emp before inserting into dept :
0	165	14:21:08	insert into emp values
 ('1','A',5000,'1','1'),
 ('2','B',6000,'1','1'),
 ('3','C',7000,'1','1'),
 ('4','A',9000,'2','2'),
 ('5','E',8000,'2','2'),
 ('6','F',9000,'2','2')	Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails 
 (`employee_details`.`emp`, CONSTRAINT `fk_emp_deptno` FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`))	0.125 sec
*/

insert into emp values
('1','A',5000,'1','1'),
('2','B',6000,'1','1'),
('3','C',7000,'1','1'),
('4','A',9000,'2','2'),
('5','E',8000,'2','2'),
('6','F',9000,'2','2');

select * from emp;

insert into dept values
('1','TRN','Bby'),
('2','EXP','Dlh'),
('3','MKTG','Cal');

select * from dept;

-- ==========================================

show indexes from emp;

select * from information_schema.table_constraints;

select * from information_schema.table_constraints
where table_schema = 'employee_details';

select * from information_schema.table_constraints
where table_name = 'emp';

select * from information_schema.key_column_usage
where table_name = 'emp';

-- ================================================

#drop foreign key
/*
alter table table_name
	drop foreign key key_name;
*/

alter table emp 
	drop foreign key fk_emp_deptno;

-- ================================================

#to add FK afterwards
/*
alter table table_name 
	add constraint  fk_name foreign key(child_column) 
			references parent_column_table_name(parent_column);
*/

alter table emp 
	add constraint  fk_emp_deptno foreign key(deptno) 
			references dept(deptnoi);

-- constraint fk_name is optional,if not proided MySQL provide the name for FK
 
-- ================================================

#deletion of parent table row which is primary key for the foreign key in child table

-- We can delete the parent row provided, child row doesnt exist in this case its deptno = 3 for which there is no any row in the emp table with the deptno = 3 
 delete from dept where deptno = 3; # allowed as there is row with the dept no 3 in the child table i.e. in the emp table here

-- We can not delete the parent row if child rows exist! in this case its deptno = 2, as deptno =2 is used by for the three rows in the child i.e. in emp table's deptno column  
 delete from dept where deptno =2; # not allowed 
 
# so to delete this row in parent, first we will have to delete the same in the child 
delete from emp where deptno = 2 ;
delete from dept where deptno =2; # now this will allow as there isnt any row in the child table with deptno 2


 -- We can not delete the master row when detailed row exist, we can delete master by by deletingthe detailed row first or by changing the value of foreign key in the detailed row!
 
-- ====================================================
#on delete cascade => #automatic deletion 
-- if you delete the master row then MySQL will automatically delete the detailed row too in cascading manner!
-- while table creation we can we can write different command

drop table emp;

create table emp(
empno char(4) primary key,
ename varchar(25),
sal float,
deptno int,
mgr char(4),
constraint fk_emp_deptno foreign key(deptno) 
references dept(deptno) on delete cascade,
constraint fk_emp_mgr foreign key(mgr) 
references emp(empno)
);

insert into emp values
('1','A',5000,'1','1'),
('2','B',6000,'1','1'),
('3','C',7000,'1','1'),
('4','A',9000,'2','2'),
('5','E',8000,'2','2'),
('6','F',9000,'2','2');


select * from emp;
select * from dept;

#now we can delete from the master table but all the rows having refrences of this row with the deptno 2 will be deleted from detailed table
delete from dept where deptno = '2';

-- ====================================================

/*
- to preserve the child rows we can update the child row deptno to null
- 

*/
-- ====================================================

#Updation of rows in the parent table

#We can not update the rows of the parent table, if the child rows exist
update dept set deptno = 4 where deptno = 2; -- not allowed

#We can update the parent rows, if the child rows dont exist
update dept set deptno = 4 where deptno = 3; -- allowed

 -- ====================================================
 # on update cascade
 -- if the parent column updated then the existing child rows are automatically updated, without on update cascade we can not update the master row which has existing child row 
 
drop table emp;

create table emp(
empno char(4) primary key,
ename varchar(25),
sal float,
deptno int,
mgr char(4),
constraint fk_emp_deptno foreign key(deptno) 
references dept(deptno) on delete cascade on update cascade,
constraint fk_emp_mgr foreign key(mgr) 
references emp(empno)
);

insert into emp values
('1','A',5000,'1','1'),
('2','B',6000,'1','1'),
('3','C',7000,'1','1'),
('4','A',9000,'2','2'),
('5','E',8000,'2','2'),
('6','F',9000,'2','2');

update dept 
  set deptno = '4'
	where deptno = '2';

#Drawback of on cascade : 
-- if we delete empno  = 1 from emp then it will delete all the rows where empno = 1 is referenced incase of foreign key and with the cascading if any row gets deleted with the empno = 1 ref then that row's ref if its there anywhere in the table will get deleted and it will continue till there is no any reference.
-- avoid on delete cascade in the even of self referencing, as you may delete the more rows than expected

-- ==================================

#insert_with_FK

#AT THE TIME OF INSERTING empno 7, there was no empno 7 but still it will accept as first it will insert and then it will check for the constraints
#constraint checking is defered after INSERT 
insert into emp	
values('7','G',7000,2,'7');

insert into emp	
values('8','G',7000,2,'9');  #=> ERROR as empno 9 is not available! 

-- ============================================
#COMPOSITE Foreign_KEY
#two columns of the details table referencing two column of the master table

use customer;

create table order_mast(
branch_id char(4),
o_num int,
c_num int,
cost float,
primary key(branch_id,o_num)
);

desc order_mast;

create table order_details(
branch_id char(4),
o_num int,
prod_id char(4),
qty int,
primary key(branch_id,o_num,prod_id),
constraint fk_branchid_onum foreign key(branch_id,o_num) references order_mast(branch_id,o_num) on delete cascade
);

desc order_details;

#here on delete cascade would be a good example as once we delete the order from the master table then automatically all the order details will get deleted from the order_details table







 





