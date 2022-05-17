#CompositePrimaryKey

/*
==========================================
=> PRIMARY KEY CREATION

create table emp(
empno char(4) PRIMARY KEY,
ename varchar(25),
sal float,
deptno int
);
==========================================
=> Composite primary key creation:
create table emp(
empno char(4),
ename varchar(25),
sal float,
deptno int,
primary key(deptpo,empno)
);

deptno is parent column : Keep it first and next the child column - or else it would affect the performance if the sequence changed

==========================================

CONSTRAINT ARE OF TWO TYPES:
1.Column level 
2.Table level

1.Column level 
- Specified on a single column

2.Table level
- composite 
- specified on combination of two ro more columns
- has to be specified at the end of the table structure

=========================================================

=> drop primayr key:
alter table table_name drop primary key;

=> to add composite primary key afterwards!
alter table table_name add primary key(driving_column,driven_column);

driving column - parent column which has less no of rows
driven column - child column which has more no of rows than the parent column

the sequence is important looking the performance while searching
=========================================================












==========================================





*/