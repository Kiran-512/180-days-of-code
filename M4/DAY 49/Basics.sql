show databases;
create database customer;
create database Mumbai;

create table emp
(
empno char(4),
ename varchar(25),
sal float,
city varchar(15),
dob date
);

insert into emp(empno,ename,sal,city,dob)
values(1,'Kiran',50000,'Kalamboli','1996-09-21');


