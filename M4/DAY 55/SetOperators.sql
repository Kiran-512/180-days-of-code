#SetOperators Based on set theory
-- =============================================
create table emp1(
EMPNO char(5),
ename varchar(50)
);

create table emp2(
EMPNO char(5),
ename varchar(50),
Emp_Address varchar(100)
);

insert into emp1 values
('1','A'),
('2','B'),
('3','C');

delete from emp2;

insert into emp2 values
('1','A',null),
('2','B',null),
('3','C',null),
('4','D',null),
('5','E',null);

select * from emp1;

select * from emp2;

/*
=> Whole foundation fo SQL is based on set theory
=> founder of RDBMS (1968) -> Dr.Codd
- Data : intersection of rows and columns

1.UNION:
- supported by all RDBMS
- will combine the output of the both the select statements and it will suppress the duplicates
- Structure of the BOTH THE select statemnet should be the same
- Structure of the two tables can be different 
- order by clause must be specified after second selct statement, if any  

2.union all : 
- supported by all RDBMS
- duplicates are not suppressed and sorting does not takes place

3.Intersect :
- supported by ONLY Oracle
- will return what is common in both the tables 
- We can select from the same table twice too instead of selecting from two diff tables!

4.minus:
- - supported by ONLY Oracle
- will return what is present in first SELECT and what is not present in second SELECT and the
  duplicates are suppressed
- We can select from the same table twice too instead of selecting from two diff tables!

Use of any of the above is mixed way:
 
select ...........................
union
select ...........................
minus
select ...........................
union
select ...........................
union all
select ...........................
intersect
select ...........................
order by x;

- max upto 255 SELECTS (limit can be exceeded with the help of views)
- execution is top to bottom

- multiple SELECTs, brackets for chaging the precedence  -> not supported by MySQL
*/

#union
select empno,ename from emp1
union
select empno,ename from emp2 order by 1;
/*
1	A
2	B
3	C
4	D
5	E
*/

#unionall
select empno,ename from emp1
union all
select empno,ename from emp2 order by 1;
/*
1	A
1	A
2	B
2	B
3	C
3	C
4	D
5	E
*/

-- =============================================

#intersect
-- In Oracle
select empno,ename from emp1
intersect 
select empno,ename from emp2 
order by 1;

#minus 
-- In Oracle
select empno,ename from emp1
minus
select empno,ename from emp2 
order by 1;

-- =============================================








