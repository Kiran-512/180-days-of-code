#CURSOR
-- ==============================================
/*
- PRESENT in all the RDBMS, some DBMS, and some of the front ends s/w also .net e.g. recordset )
- cursor is the type of a variable
- used for storing the multiple rows
- used for processing multiple rows => PRACTICAL USE
- used for handling multiple rows
- used for storing data temprorily 
- used for storing data like 2D array
- cursor is based on select statement

-- ==============================================
#SYNTAX
	declare cursor_name cursor for select * from emp; 

e.g. declare pqr cursor from select * from emp where deptno =1 order by 1;
-- ==============================================

- curosor pointer willbe automatically pointingat the first row
- The variable in which we will be fetching the values, must have the same datatype and the width or else it will give an ERROR as 	 
- cursor is read only and we can fetch sequencially, we can't go backward and can fecth only one row at a time,there might be linked list ion its source code(possibility)  
- data inside the cursor can not be manipulated since its read only
- we will have the fetch 1 row at a time in intermediate a,b,c,d variables and do our processing with those variables
- We can fetch sequencially that is top to bottom 
- In MySQL and in Oracle we can't go backward
- We can have cursor based on join
- e.g. 
declare c1 cursor for select empno,dname from emp, dept
		where dept.deptno = emp.deptno;

-- ==============================================
#RANKING_REPORT
when we dcalre the cursor and we fetch only top 10,20 rows and not the complete rows in that case it said that we are fetching the ranking report
 -- ==============================================
#continue handler
- declare the continue handler for not found event (Exception)
- NOT FOUND is cursor attribute it return a boolean TRUE IF THE LAST FETCH was unsuccessfull, and false value if the last fetch was successfull

-- ==============================================
*/
-- ==============================================
show full tables;

drop table emp;

create table emp(
empno int,
ename varchar(25),
sal float,
deptno int
);

insert into emp values
(1,'A',5000,1),
(2,'B',6000,1),
(3,'C',7000,1),
(4,'D',9000,2),
(5,'E',8000,2);

select * from emp;
desc emp;


-- ==============================================
#program_12 
delimiter //
create procedure cursor_demo()
begin
		declare a int;
        declare b varchar(25);
        declare c int;
        declare d int;
        declare x int default 0;
        declare hra int;
        declare c1 cursor for select * from emp; #CURSOR DECLARATION/DEFINITION and this point cursor doesn't contain any data 
        open c1;								 #this will open the cursor C1 and EXCUTES THE SELECT STATEMENT and It will populate the cursor c1
        while x<5 do
			fetch c1 into a,b,c,d;
            /*processing hra calc, etc*/
            set hra = c*0.4;
            insert into emp_op values(hra,b,'HRA');
			set x = x+1;
		end while;
		close c1;
end; //
delimiter ;

call cursor_demo();

select * from emp_op;
/*
2000	A	HRA
2400	B	HRA
2800	C	HRA
3600	D	HRA
3200	E	HRA
*/
-- ==============================================

#program_13 - RANKING_REPORT
 
delimiter //
create procedure cursor_demo2()
begin
		declare a int;
        declare b varchar(25);
        declare c int;
        declare d int;
        declare x int default 0;
        declare hra int;
        declare c1 cursor for select * from emp;  
        open c1;								 
        while x<3 do   -- here we are fetching the top 3 rows out of total 5 rows of the table hence its called as the ranking report
			fetch c1 into a,b,c,d;
            /*processing hra calc, etc*/
            set hra = c*0.4;
            insert into emp_op values(hra,b,'HRA');
			set x = x+1;
		end while;
		close c1;
end; //
delimiter ;

call cursor_demo2();

select * from emp_op;

-- -- ==================================================

#program_14 - 
/*
when we fetch the cursor for more times than the total no of rows of the table, in that case we will get an ERROR, (soime of 
the RDBM,S supports this, they might have ciurcular linked list as cursor on reaching end of the row it starts from the first 
row again which is not the case in MySQL and  in Oracle the last row repeats iself again and again till the last iteration) 

 */
delimiter //
create procedure cursor_demo3()
begin
		declare a int;
        declare b varchar(25);
        declare c int;
        declare d int;
        declare x int default 0;
        declare hra int;
        declare z int; 
        declare c1 cursor for select * from emp;  
        open c1;								 
		select count(*) into z from emp;
        while x<z do   -- if we gave the VALUE AS MORE THAN 5 to z (i.e. more than the table row's), then we will get ERROR
			fetch c1 into a,b,c,d;
            /*processing hra calc, etc*/
            set hra = c*0.4;
            insert into emp_op values(hra,b,'HRA');
			set x = x+1;
		end while;
		close c1;
end; //
delimiter ;

call cursor_demo3();

select * from emp_op;

-- -- ==================================================
#program_15
#continue_handler

-- variable and condition declaration after continue handler or curosr is not allowed

SHOW PROCEDURE STATUS;

drop procedure cursor_continue_handler_demo;

delimiter //
create procedure cursor_continue_handler_demo(dn int)
begin
	declare a int;
    declare b varchar(25);
    declare c int;
    declare hra float;
    declare y int default 0;
    declare c1 cursor for select empno,ename,sal from emp;
    declare continue handler for not found set y = dn;
    open c1;
    cursor_c1_loop:loop 
		fetch c1 into a,b,c;
        if y = 1 then 
			 leave cursor_c1_loop;
        end if;
        set hra = c*0.4;
        insert into emp_op values(c,b,'HRA');
	end loop cursor_c1_loop;
    /*close c1;*/ -- optional if this is the last line in the program
end; //
delimiter ;


delete from emp_op;
select * from emp;
desc emp;

desc emp_op;
call cursor_continue_handler_demo(2);

select * from emp_op;

-- in above eg when the cursor pointer reached the last row's next iterations, then it will throw an exception of not found which is true and then it will set the value of y = 1 and it will exit the loop withut termination of progarm
-- We can not reset the curosr pointer
-- If the cursor closure is the last line then need not to close the cursor but it there are code line below it then we must close the cursor
-- We can not open cursor twice we will get an ERROR : open c1; open c1; -- ERROR
-- TO RESET the cusor pointer
 /*
 close c1; -- first close it 
 open c1; -- then open it
 */ 
 
-- -- ==================================================
#program_16

#There is no upper limit to open the cursors at a time in the single program, ONLY restriction is the size of server RAM
#ERROR in this code is : for second cursor inside while loop, cursor pointer on reaching the end row its not getting back on the first row
select * from dept;
desc dept;

#out_put table
create table emp_op2(
ename varchar(25),
dname varchar(25)
);

delimiter //
create procedure two_cursors_Demo()
begin
	declare a int;
    declare b int;
    declare empname varchar(25);
	declare dptname varchar(25);
    declare y int default 0;
    declare z int; 
    declare p int default 0;
    declare c1 cursor for select ename,deptno from emp;
    declare c2 cursor for select deptno,dname from dept;
    declare continue handler for not found set y=1;
	select count(*) into z from dept;
    open c1;
    open c2;
	cursor_c1_loop:loop
		fetch c1 into empname,a;
			if y=1 then
				leave cursor_c1_loop;
             end if;   
             set p = 0;
				while p<z do
				fetch c2 into b,dptname;
                if a = b then
					insert into emp_op2 values(empname,dptname);
				end if;
                set p = p+1;
                end while;
     end loop cursor_c1_loop;							
end; //
delimiter ;


call two_cursors_Demo();
select * from emp;
select * from dept;
select * from emp_op2;

-- -- ==================================================
#program_17

#sal will get added to all the sal columns in each iteration

delimiter //
create procedure most_imp_cursor_procedure_base()
begin
	declare a int;
    declare b varchar(25);
    declare c int;
    declare d int;
    declare y int default 0;
    declare c1 cursor for select * from emp;
    declare continue handler for not found set y = 1;
    open c1;
    cursor_c1_loop:loop
		fetch c1 into a,b,c,d;
        if y =1 then
			leave cursor_c1_loop;
		end if;   
        update emp set sal = sal + 1; -- here we are adding 1 to the actual column in emp table and not addiing 1 int the variable c which reprents sal 
        end loop cursor_c1_loop;
        close c1;
end; //
delimiter ;

-- -- ==================================================

#program 18
#Cursor is Used to lock the rows manually - seelct statement with the 'for update' clause 
#

delimiter //
create procedure most_imp_cursor_procedure()
begin
	declare a int;
    declare b varchar(25);
    declare c int;
    declare d int;
    declare y int default 0;
    declare c1 cursor for select * from emp for update; -- due tho for update clause whole row of the table will get locked 
    declare continue handler for not found set y = 1;
    open c1;
    cursor_c1_loop:loop
		fetch c1 into a,b,c,d;
        if y =1 then
			leave cursor_c1_loop;
		end if;   
        if sal > 7000 then
        /*delete from emp where empno = a -- here if we didnt specified empno = a then all the rows will get deleted from the table on meeting the if condition*/ 
        update emp set sal = sal + 100; -- here we are adding 100 to the actual column in emp table and when the condition satisfies then 100 will be added to sal of eac employee so to restrich this we can use where clause with the update statement as where empno = a; with this sal will be increment only for current iteration employee  
		end if;
		end loop cursor_c1_loop;
        commit; -- since we used DML command so to save the cnages commited the work right here! also since we have used for update clause, so until we commit or rollback another user wont be able toupdate this row 
        close c1;	
end; //
delimiter ;

select * from emp;

call most_imp_cursor_procedure();

-- -- ==================================================

#program_19
#manual locking the table

delimiter //
create procedure lock_table()
begin
	declare c1 cursor for select * from emp;
    open c1;
    close c1;
end ; //
delimiter ;

call lock_table(); -- with calling this function,  table will be locked for the other users

-- there is no unlock command so when we rollback or commit it will automatically unlock the table for other users  
-- by closing the cursor we are just exiting the server ram and making it free for other users, it won't unlock the table     

-- ==================================================

#program_20
#manual locking the particular row

delimiter //
create procedure lock_table(dn int)
begin
	declare c1 cursor for select * from emp where deptno = dn;
    open c1;
    close c1;
end ; //
delimiter ;

-- ==================================================

