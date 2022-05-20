#FUNCTIONS
/*
=======================================================
#Character Functions:

1.CONCAT : CONCAT(STR1,STR2)
2.UPPER : UPPER(COLUMN_NAME)
3.LOWER : LOWER(COLUMN_NAME)
4.RPAD : RPAD(COLUMN_NAME,N,' ') -- here n is the total no of letters inclusing the character and the symbols in ' ', here its blank space 
5.LPAD : LPAD(COLUMN_NAME,N,' ') 
6.RTRIM
7.LTRIM
8.TRIM
9.SUBSTR
=======================================================

*/

create table students
(
fname varchar(25),
lname varchar(25)
);

insert into students(fname,lname) values
('Dinesh', 'Yadav'),
('Rahul', 'Pandey'),
('Akshay', 'Deshmukh'),
('Prait', 'Dubey'),
('Pankaj', 'Shinde'),
('Rahul', 'Yadav');

select * from students;

drop table emp;

create table emp
(
empno char(4),
ename varchar(25),
sal float,
deptno int 
);

insert into emp values
('1','Kiran Shinde',2237.54,1),
('2','Pranit Navale ',1236.1435,1),
('3','Kiran Kumar',3224.5445,2),
('4','Rahul Deshmukh',53231.254,2),
('5','Rahul Pandey',3232.94,2);

select * from emp where deptno = 2;
-- =======================================================
#concat

select concat(fname,lname) from students;

select concat(fname,lname) as 'joined' from students;

#Merged two columns together and displayed
select concat(fname,' ',lname) 'Full Name' from students;

#FUNCTION WITHIN FUNCTION
select concat(concat(fname,' + '),lname) as 'function within function 'from students;

-- max upto 255 levels for a function within function (COMMON FOR ALL rdbms)
-- this uppper limit can be exceeded with the views

select concat('Mr.',fname,' ',lname) 'Guests' from students;

-- =======================================================
#Upper function

select upper(fname) from STUDENTS;

select concat(upper(fname),' ',upper(Lname)) 'SLOWER' from STUDENTS;

select upper(concat(fname,' ',lname)) 'FASTER' from STUDENTS; -- This is faster than above

#UPDAET with the upper

update students 
	set fname = upper(fname);

select * from students;
/*
DINESH	Yadav
RAHUL	Pandey
AKSHAY	Deshmukh
PRAIT	Dubey
PANKAJ	Shinde
RAHUL	Yadav
*/

#Solution for case sensitive queries in Oracle:

select * from students where upper(fname)= 'RAHUL';

#below will also give the same op as above in MySQL as quries are insensitive
select * from students where upper(fname)= 'rahul';

-- =======================================================
#INITCAP -- available in Oracle but not in MySQL

select initcap(fname) from STUDENTS;

-- =======================================================
#LPAD
select lpad(fname,25,' ') from students;   -- this will print the space equal to (25 - No of character in the fname)

/*
                   DINESH
                    RAHUL
                   AKSHAY
                    PRAIT
                   PANKAJ
                    RAHUL
*/

#Uses:
-- right justification
-- checque printing

-- =======================================================
#RPAD 
select rpad(fname,25,'*') from students; 
/*
DINESH*******************
RAHUL********************
AKSHAY*******************
PRAIT********************
PANKAJ*******************
RAHUL********************
*/

#USES:
-- LEFT JUSTIFICATION OF NUBERIC DATA
-- Convert varchar into char (convert variable length to fixed length)
-- cheque printing

#Centre-justification (use combo of lpad & rpad)
-- =======================================================
#LTRIM
select ltrim(fname) from students;
/*
DINESH
RAHUL
AKSHAY
PRAIT
PANKAJ
RAHUL
*/

#Uses:
-- left justification:

-- =======================================================
#RTRIM
select rtrim(Fname) from students;
/*
DINESH
RAHUL
AKSHAY
PRAIT
PANKAJ
RAHUL
*/

#USES
-- right justification:
-- convert char to varchcar (from fixed length to variable length)

-- =================================================================
#TRIM - removes the spaces from both the sides

SELECT TRIM(FNAME) from students;

SELECT TRIM(concat(fname,'  +  ',lname)) from students;
SELECT RTRIM(concat(fname,'    ',lname)) from students;
SELECT LTRIM(concat(fname,'             ',lname)) from students;


-- =================================================================
#SUBSTR
-- used to substract the part of the string 

SELECT SUBSTR(FNAME,3) from students; -- this will display the result with fname starting from the third letter till the last

select substr(ename,3) from emp; -- (3 is starting position)

select substr(fname,3,2) from students; #(3 is starting position,2 is number of characters(gets 3rd & 4th letter)


select * from students;
/*
DINESH	Yadav
RAHUL	Pandey
AKSHAY	Deshmukh
PRAIT	Dubey
PANKAJ	Shinde
RAHUL	Yadav
*/

select substr(fname,-3,2) from students; #-3 is starting position, it will start from right end side of the word, we will get letters of the string from last 3rd postion to last second postion as 2 here is no of character) 
/*
ES
HU
HA
AI
KA
HU
*/

#USES:
-- used to extract a part of string
-- substr('New Mumbai',1,3) -> New
-- substr('New Mumbai',5) ; -> Mumbai


-- =================================================================
#REPLACE

select replace(fname,'UL','ulya') from students; #UL->ulya
/*
DINESH
RAHulya
AKSHAY
PRAIT
PANKAJ
RAHulya
*/

select replace(ename,'un','xyz') from emp;

#REPLCAE any string WITH nothing
select replace(fname,'nit') from Students; # will not work in MySQL 3rd parameter compulsory in MySQL (works in Oracle)
#in above eg the 'un' replaced by nothing so Pranit-> Pra

#USES: 
-- a. Encoding and Decoding
-- b. Encryption and Decryption
-- c. Masking of ATM
-- d. Card Number

-- =================================================================
#TRANSLATE :
-- the major diff between replace and transklate is in transalte word by word will be replaced and in replace entire specified strnig will be replaced 
--  Supported by Oracle but not by MySQL

select translate(ename,'un','xy') from emp;
-- u -> x
-- n -> y

select translate(ename,'un','xyz') from emp;
-- u -> x
-- n -> y
--   -> z // nothing will be translated to z

select translate(ename,'un','x') from emp;
-- n will be removed 

-- =================================================================
#INSTR
-- RETURNS THE INDEX OF the first character in the string specified in ' '
-- INSTR is available in MySQL but 3rd and 4th parameter not allowed in MySQL

select instr(fname,'shay') from students; -- returns index of s in Akshay
/*
0
0
3
0
0
0
*/

select instr(fname,'shay') from students
		where fname = 'AKSHAY';
#op WILL BE 3

 select instr(ename,'un') from emp;
-- eg. Kirun -> return 4, Carun - retrnu 3 and Rahul-> return 0 as un is not found in rahul

#USES: 
-- used to check if one string exists in another string and at which position

#Variations :
select instr(ename,'un',4) from emp; -- 4 -> starting position from where it will start searching

select instr(fname,'ay') from students;

select instr(fname,'ay',6) from students; -- this will seach from the 6th position in any string containing 'ay'

select instr(ename,'un',4,2) from students;
/*
4 -> starting position from where it will start searching
2 ->return position only when un is repeated twice (2nd occurence)
*/

select instr(ename,'un',-4) from emp; -- 4 -> starting position from right end of the word , last 4th, it will start searching

-- =================================================================
#LENGTH: 
-- for varchar as char has fixed length
-- (returns the length of string)
-- return length for char,varchar,date,float etc.


select length(ename) from emp; 

desc emp;
/*
empno	char(4)	YES			
ename	varchar(25)	YES			
sal	float	YES			
city	varchar(15)	YES			
dob	date	YES			
job	char(10)	YES			
deptno	char(4)	YES			
*/
select length(job) from emp;

select length(dob) from emp;

select length(sal) from emp;
/*
4
4
5
4
4
4
4
5
4
5
5
4

*/

-- =================================================================
#ASCII: 
-- returns the ascii value of 1st letter

select ascii(ename) from emp;

#ASCII value of second letter from ename
select ascii(substr(ename,2)) from emp;

#so far below statemenst would return the ascii values for each row so to supress the duplicates distinct is used
select ascii('z') from emp;

select distinct ascii('z') from emp;

select ascii('z') from dual;

-- =================================================================
#DUAL 
-- is a system table
-- it contains only 1 row and column
-- DUAL is a dummy table (present in all RDBMS)


select substr('New Mumbai',1,3) from dual;

select 'Welcome to CDAC Mumbai' from dual;

select 10+10 from dual; 

select char(65) from dual;  -- will display the diffrent character as in english A has 65 ASCII and chinese 65 might be assined to some diff character

#Oracel me
select char(65 from utf8) from dual; -- will display the character with the ascii values specified in bracket

#where utf8 is the given character set for US English else default binary character set

/*
In Oracle: No such issues 
-------------
select chr (65) from dual; -> A
*/

#database commands => 
	
show character set;

-- =================================================================
#SOUNDEX Function
-- removes the vowels from both string and then compares (a, e, i, o, u, y -> US english y is vowel)

select * from students where soundex(fname) = soundex('Raaaahool');
/*
RAHUL	Pandey
RAHUL	Yadav
*/

-- =================================================================
#2. Number Function :
#ROUND:
-- Sal
-- 1234.567, 1561.019, 1375.516, 1749.167

#In MySQL:
-- sal float
select * from emp;
/*
1	Kiran Shinde	2237.54	1
2	Pranit Navale 	1236.14	1
3	Kiran Kumar	3224.54	2
4	Rahul Deshmukh	53231.3	2
5	Rahul Pandey	3232.94	2
*/
-- eg. 1234.56 => 1235 345.156 => 345 
select ename,round(sal) from emp;
/*
Kiran Shinde	2238
Pranit Navale 	1236
Kiran Kumar		3225
Rahul Deshmukh	53231
Rahul Pandey	3233
*/

#round off the sal till 1 decimal place
-- eg. 1234.56 => 1234.6 345.156 => 345.2 

select round(sal,1) from emp where deptno = 1;
/*
2237.5
1236.1
*/

#round off the sal till 2 decimal place
-- eg. 1234.56 => 1234.56 345.156 => 345.16 

select ename, round(sal,2) from emp;
/*
Kiran Shinde	2237.54
Pranit Navale 	1236.14
Kiran Kumar	3224.54
Rahul Deshmukh	53231.25
Rahul Pandey	3232.94
*/

#round off the sal on left side till 2 decimal place
-- eg. 1234.56 => 1200 345.156 => 300

select ename, round(sal,-2) from emp;
/*
Kiran Shinde	2200
Pranit Navale 	1200
Kiran Kumar		3200
Rahul Deshmukh	53200
Rahul Pandey	3200
*/
/*
In Oracle: -
---------
- sal number (7,3)
- 1234.567
*/

-- ===================================================
#TRUNCATE
/*
- removes the decimal point numbers
- the diff from round is, in round it will check for number greater than 5 or not and accordingly it will round off the number 
- here in truncate no wont be cheked, it will directly convert the number  
eg. 1456.76 => 1456, 576.76829 => 576.768
use:
- to calculate the date and time

*/

#In MySQL:

select ename, truncate(sal,0) from emp;
/*
Kiran Shinde	2237
Pranit Navale 	1236
Kiran Kumar	3224
Rahul Deshmukh	53231
Rahul Pandey	3232
*/

select ename,truncate(sal,1) from emp;
/*
Kiran Shinde	2237.5
Pranit Navale 	1236.1
Kiran Kumar	3224.5
Rahul Deshmukh	53231.2
Rahul Pandey	3232.9
*/
select ename,truncate(sal,2) from emp;
/*
Kiran Shinde	2237.54
Pranit Navale 	1236.14
Kiran Kumar	3224.54
Rahul Deshmukh	53231.25
Rahul Pandey	3232.93
*/
select ename,truncate(sal,-2) from emp;
/*
Kiran Shinde	2200
Pranit Navale 	1200
Kiran Kumar		3200
Rahul Deshmukh	53200
Rahul Pandey	3200
*/

#In Oracle
select trunc(sal) from emp;
select trunc(sal,1) from emp;
select trunc(sal,2) from emp;
select trunc(sal,-2) from emp;

-- =================================================================
#CEIL
/*
- adds 1 to the last no by removing decimal point in decimal number 
- eg. 1245.67 => 1246, 1245.17 => 1246
uses:
- bill payments
- EMI payments
- Interest calculatuions
*/

select ceil(sal) from emp;
/*
2238
1237
3225
53232
3233
*/

-- =========================================
#floor
/*
- removes decimal and goes for lower no
- select floor(sal) from emp;
- select truncate (3.6,0) =>  floor (3.6) // op will be same 3 and 3
- truncate (-3.6,0) => floor (-3.6) from dual;// op will be diff 3 and -4 diff is in case of -ve number flowwr works differently
*/
select * from emp;
/*
1	Kiran Shinde	2237.54	1
2	Pranit Navale 	1236.14	1
3	Kiran Kumar		3224.54	2
4	Rahul Deshmukh	53231.3	2
5	Rahul Pandey	3232.94	2
*/

select ename, floor(sal) from emp;
/*
Kiran Shinde	2237
Pranit Navale 	1236
Kiran Kumar		3224
Rahul Deshmukh	53231
Rahul Pandey	3232
*/


-- =========================================
#SIGN
#return any of three values -1,0,1

select sign (-15) from dual; #returns -1
select sign (15) from dual; #returns 1
select sign (0) from dual; #returns 0

/*
Uses:
-------
1. check if num is +ve or -v
2. sign(SP-CP)
3. sign(temperature)
4. sign(blood_group)
5. sign(medical_report)
6. sign(bank_balance)
7. sign(sensex)
*/
-- =========================================
#MOD
-- RETURN THE REMINDER
select mod(9,5) from dual;

select mod(8.22,2.2) from dual;

SELECT MOD(DEPTNO,SAL) from emp;
/*
1
1
2
2
2
*/


-- =========================================
#SQRT:
-- appliacble only for postitive number can check if nuber is positive or negative with the sign function

select sqrt(81) from dual; 

select sqrt(sal) FROM EMP;
/*
47.30264304520943
35.15883323842673
56.785072277789254
230.71899337993395
56.85894776907369
*/

-- =========================================
#POWER
select power(10,3) from dual; 

select power(10,1/3) from dual;

/*
- does not work in SQL
- works in Oracle PL/SQL programs
- in SQL, if you want to perform exponentiation, then you will have to use the POWER function
*/
-- =========================================
#ABS:
-- changes the sign to positive
-- absolute values can be found with this function

SELECT abs(-56) from dual; -- 56

SELECT abs(12.56) from dual; -- 12.56

SELECT abs(-12.56) from dual; -- 12.56
-- =========================================
/*
- x -> radians
- sin(x)
- cos(x)
- tan(x)
- sinh(x) -> not supported by MySQL (works in Oracle)
- cosh(x) -> not supported by MySQL (works in Oracle)
- tanh(x) -> not supported by MySQL (works in Oracle)
- ln(y)
- log(n,m) n- base and m - value of which we have to find log
*/

select sin(30*22/(7*180)) from dual;

select ln(10) from dual;

select log(10,2) from dual;

-- =========================================

