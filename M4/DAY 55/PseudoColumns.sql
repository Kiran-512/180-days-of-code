#PseudoColumns
/*
- fake columns - Virtual columns
- eg.
1. Computed columns
2. Expressions (two or more columns involved) ( NET_EARNINGS = SAL +COMM )
3. Funciton based columns (eg. Total = sum(sal))

RDBMS supplied pseudo columns:

Row Identifier:
#rowid: 
- is the row address in the database server HD
- actual physical memory location of the row in DB server HD 
- ROWID is of fixed length and encripted string of 18 characters
- When we select from the table the order of the rows in output will always be in ascending order or row ID.
- When we update the ROW , the address of the row(ROW ID) MAY change
- ROW ID work as an unique indentifier for every row in DB server HD.
- AS IN FUTURE ON ROW UPDATION THE ROW ID MAY CHANGE 
- We can use it in where clasue
- No two rows of any table in the entire DB can have same ROWID

- USE:
1.We can use rowid to update or delete the duplicate rows in table

ROWID is used internally by the RDBMS: -
1. To distinguish between 2 rows in the DB
2. For row locking
3. To manage the INDEXEs
4. To manage the CURSORS
5. Row management

- ROWID is present in Oracle and you can view it
- ROWID is present in MySQL and you can NOT view it

#ROWNUM -> returns the row number
- ROWNUM is present in Oracle and you can view it
- ROWNUM is not present in MySQL
 
*/
-- ============================================
#all commands below in Oracle Only

select rowid, ename from emp; 

select rownum, ename, sal from emp;

select rownum, ename, sal from emp;

select rownum, ename, sal from emp where rownum = 1;

select rownum, ename, sal from emp where rownum < 4;

select rowname, ename, sal from
(select ename, sal from emp order by ename);

-- ============================================


