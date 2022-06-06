#MySQL-PL_Part_2
show full tables;

drop table emp;

create table emp(
empno char(4),
ename varchar(25),
sal float,
-- comm float,
deptno char(4)
-- location char(15)
);

select * from dept;

select * from depthead;

insert into emp values
(1,'Kiran',3000,1),
(2,'Akshay',4000,1),
(3,'Pranit',8000,2),
(4,'Shubham',2000,2);

select * from emp;

drop table emp_op;

#output_table
create table emp_op(
fir float,
sec varchar(25),
third char(4)
);
-- ===========================================
#Program_4
#How to get the data from table into the variable which will b eused in the program

#SYNTAX
#select column_name into variable_name from table_name where condition; NOTE : => here variable should have the same datatype and width as that of column

-- e.g.
select sal into x from emp where ename = 'Akshay';

show create procedure HRA_calc1;

show procedure status where db ='employee_details';

drop procedure HRA_calc1;

delimiter //
create procedure HRA_calc1()
begin
	declare x int;
    declare hra float;
    select sal into x from emp where ename = 'Akshay';    
    set hra = x *0.4;
	insert into emp_op values(1,'Akshay',null);	
	insert into emp_op values(hra,'HRA',null);	
end; //
delimiter ;

delete from emp_op;

call HRA_calc1();

select * from emp;
select * from emp_op;

-- =======================================
#Program_5
#taking inputs while calling functions

drop procedure HRA_calc2;

delimiter //
create procedure HRA_calc2(empname varchar(25))
begin
	declare x int;
    declare hra float;
    select sal into x from emp where ename = empname;
    set hra = x *0.4;
	insert into emp_op values(1,empname,null);	
	insert into emp_op values(hra,'HRA',null);	
end; //
delimiter ;

delete from emp_op;

call HRA_calc2('Kiran'); -- ERROR : result contains more than one row
call HRA_calc2('A');

select * from emp;
select * from emp_op;

desc EMP;
desc emp_op;

-- ===========================================
#program_6
drop procedure HRA_calc3;

delimiter //
create procedure HRA_calc3()
begin
	declare x int;
	declare y char(4);
    declare hra float;
    select sal,deptno into x,y from emp where ename = 'Kiran';
    set hra = x * 0.4; /*processing like set hra = sal*0.4, set y =lower(y); */
	insert into emp_op values(x,'Kiran',y);	
	insert into emp_op values(hra,'HRA',null);	
end; //
delimiter ;

delete from emp_op;

call HRA_calc3();

select * from emp_op;

-- ===========================================
#IF statements
delimiter //
create procedure High_Low_Sal()
begin
	declare x int;
    select sal into x from emp where ename ='Kiran';
    if x > 4000 then
		insert into tempp values (x, 'High sal',null);
	else                  -- Else is always optional
		insert into emp_op values(x,'Low Sal',null);
	end if;
end; //
delimiter ;

delete from emp_op;

call High_Low_Sal();

select * from emp_op;

/*
- else is optional in if-else
- we can have nested if else too!
- We can also have elseif 
*/

-- ===========================================
#Program_7

drop procedure High_Low_Sal_2;

delimiter //
create procedure High_Low_Sal_2(empname varchar(25))
begin
	declare x int;
    select sal into x from emp where ename = empname;
    if x > 4000 then
		insert into emp_op values (x, empname,'HIG');
	elseif x < 4000 then
		insert into emp_op values(x,empname,'LOW'); 
    else                  
		insert into emp_op values(x,empname,'MED');
	end if;
end; //
delimiter ;

delete from emp_op;

call High_Low_Sal_2('Kiran');
call High_Low_Sal_2('Akshay');
call High_Low_Sal_2('Pranit');
call High_Low_Sal_2('Shubham');


select * from emp;

select * from emp_op;

-- ======================================
#Program_8
#boolean_data_type
#if_not_then

delimiter //
create procedure if_not_then()
begin
	declare x boolean default false;
    if not x then
		insert into emp_op value(1,'True',null);
    end if;    
end; //
delimiter ;

call if_not_then();

select * from emp_op;
-- ======================================
