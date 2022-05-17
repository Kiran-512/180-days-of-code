#not_null
/*
- null values are not allowed but its mandatory column similar to primary key which mean we must insert something in that column(unless we provide any 'default' value, we willlearn ahed 'default')
- duplicate values are allowed (unlike primarykey)
- can have any number of not null constriants (unlike primary key)
- We can not have composite 'not null', We can not have 'not null' constraint for more than one column (unlike primary key) hence its always a column level constraints i.e.
	its column level constraint as we can specify the 'not null' constraint together for two ormore column, we have to specify 'not null' before each column  
- In MySQL nullability is part of the datatypes:

to find out which are the not null :

desc table_name; 

=>Alternate key :
- not a constraints but its a definition   
- for candidate key we can give 'not null' constraint  +  'unique index' and can have all the unique values that too  without null which fullfills criteria for primary key
- with this we can have multuiple primary keys in the table, but there can be ONLY ONE primary KEY 
- for the candidate key column if you specify the 'not null' constraint and make it as an unique index then it becomes alternate key
  to the primary key and such candidate key is called as alternate key

=>SUPER KEY  
- IF WE HAVE AN ALTERNATE KEY IN THE TABLE THEN PRIMARY KEY Becomes SUPER key  

*/

#e.g.
drop table emp;

create table emp(
empno char(4),
ename varchar(25) not null,
sal float not null,
deptno int
);

desc emp;

-- ==============================================

#to make ename accept null after creating table 
alter table emp 
	modify ename varchar(25) null;

desc emp;

-- ==============================================

#to make ename accept not null after creating table 
alter table emp 
	modify ename varchar(25) not null;

desc emp;

-- ==============================================

insert into emp values('1','A',null,1);    #=> ERROR as sal can not be null

insert into emp(empno,ename,deptno) values('1','A',1); #=> ERROR as sal doest have any default values too! and it can not b null

-- =======================================================

