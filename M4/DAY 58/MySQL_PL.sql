#MySQL PL
/*
- Programming language for MySQL
- Used for database programmming 
- e.g. HRA_CALC, TAX_CALC,Attendence_calc, etc.
- used for server-side data processing // any processing where select,insert/update/delete, data, etc is involved, its best to do it on the server
- MySQL PL program can be called from command line or workbench, Oracle forms, Oracle reports, Oralce MenU,Oracle graphics, Oralce apex, Java, MS .net, etc.(any frontend s/w)
e.g. user_mysql> call hra_cal();
- few 4 GL features!
begin 
	insert into dept values('1','TRN','Bbl',);
end; 

- case insensitive Quries , BEGIN or begin, end or END tec.
- Known as block level language 
- used only for processing
- We can use the select statement inside the block, but its not recommended
- SQL Command that are allowed inside MySQL PL
- DDL,DML,DQL,DTL/TCL, etc.
- we can use select statement as part of sub-query as output wont be on the screen!
- DCL commands are not allowed inside MySQL PL, if we want then we will have do it manualy from commnd line or workbench

-- ==============================================

We can have block within a block with no upper limit,upper limit is 4095 (not as per the documentation )
begin
	-- some code;
	begin
		-- some code
    eng;
    -- some code...
end;    


main block -> Parent block -> Outer block
sub block -> child block ->inner block 

-- sub block can have sub sub-block.. no upper limit.alter

-- recommennded that block must not exceed more tahn 25 statements

-- ==============================================

#Global_variable and Local_variable

begin
	-- some code;
    variable x -- > global variable, available throught the program 
	begin
		variable y -- >local variable, available only for this block
		-- some code
    eng;
    -- some code...
end;    

-- ==============================================

#Exception in inner block
#ERROR at run time in inner block

-- The exeception occured in the inner block can be handled inside the inner block only, outer block wont be affected  
begin
	-- some code;
	begin
		-- some code
        Exception when .... then..... (handled here only, so ouetr block wont be affected) 
    eng;
    -- some code...
end;  

-- ==============================================
#Input_Output
-- user inpute and Screen output is not available here in MySQL PL (PRINTF, SCANF ISNOT AVAILABLE ETC.)
-- If we want teh data from user, we will have to create html for that! like enter your naem, enter dob , etc.
-- used only for processing

-- ==============================================
#OutPut table

#UniversalSolution for printing output
-- We will have to create the output table for all the possible out in advance
 
 create table tempp
 (
 first int,
 sec char(15)
 );

-- ==============================================

#MySQL PL are written inthe form of stored procedues:

#Stored_Objects 

- Objects that are stored in the database
- e.g.create ........ tables, indexes, etc.
- anything that we create with the CREATE command is a stored object

#stored procedues :
- Its routine (set of commands) that has tobe called explicitely
- function has return statement,procedure doesnt return anythings it's void function!
- global procedure -> can be called from anywhere, command line java, Workbench, .net etc.ONLY drivers are needed for connecitivity
- stored in the database in the COMPILED format(Execution will be very fast, will hide the source code from end user)
- within the procedure, all MySQL PL statements are allowed, we can have IF statements,loops cursors, etc.
- one procedure can call another procedure
- called procedure must be created firts an dcalling procedure to be creatred afterwards! 
- procedure can call itself( Known as Recursion )
- overloading of stored procedures is not allowed, (We can not create the procedure with the same name, even if the number of parameter passed is different or the DATATYPE of parameter passed is different) 
- becasue we can not create the tables with the same names:

-- ==============================================

- in MySQL PL we decalre the variable and if we do not initialise it then the default value would be 'null'
- We will have to declare all the variable at the top, as MySQL PL is sturctured language
- In MySQL float to int conversion is implicit(auto-rounding takes place)   

-- ==============================================
*/

use employee_details;

#output table
create table tempp
 (
 fir int, 
 sec char(15)
 );
 
 desc tempp;

 -- ==============================================

#create_procedure
#same rules applies to name the procedure name, as the rules for the table name

/* here we changed the delimitor to '//' */
delimiter //    	
create procedure abc()
begin
	insert into tempp values(1,'Hello'); 
    -- commit; we can commit here too based on our requirement
end; //  			#here we ended with the delimiter which means that the entire block will be treated as one
delimiter ; 		#here we again assign delimiter as ';'

#once procedure is created it will be read, compiled. planned and stored in DB in the COMPILED FORMAT
/*
=>  ';'  is known as terminator also known as delimiter
=> We can not use the symbols which would be performing the function ofany other operators like *for multiplication and / for division
	instead we can use ** or // symbols etc.  
=> since create is permanent command no need say commit 
*/  

-- ==============================================
#call procedure
  
call abc();
  
select * from tempp;
 #commit; we can commit here too based on our requirement
 
-- ==============================================
#drop_procedure 

drop procedure abc;

-- ============================================== 
#program2

drop procedure abc;

delimiter //
create procedure xyz()
begin
	declare x int; -- default value of x here would be 'null'
    declare y int default 10; -- declare and assign the value at the same time -- recommended way
    declare z char(10) default 'CDAC';
    set x = 10;
    insert into tempp values (x,'hello');
	insert into tempp values (y,'World');
	insert into tempp values (y,z);
end; //
delimiter ;

-- Largest program is MySQL is of 17 line and in case of Oracle its of 9 lines!

call xyz();

select * from tempp;
commit;

drop table tempp;

drop procedure xyz;

-- ============================================== 

#PROGRAM_3

delimiter //
create procedure emp_op()
begin
	declare ename char(15) default 'King';
	declare sal float default 3000;
    declare comm float default 0.4;
    declare hra float;
    set hra = sal*comm;
	insert into tempp values (sal,ename);   -- In MySQL float to int conversion is implicit(auto-rounding takes place)
	insert into tempp values (hra,'HRA');
end; //
delimiter ;
 
 call emp_op();
 
 select * from tempp;

drop procedure emp_op; 
 
-- ==============================================  
#Paramterised procedure
#PROGRAM_3 

delimiter //
create procedure tempp_op(ename char(15), sal float, comm float)
begin
    declare hra float;
    set hra = sal*comm;
	insert into tempp values (sal,ename);   -- In MySQL float to int conversion is implicit(auto-rounding takes place)
	insert into tempp values (hra,'HRA');
end; //
delimiter ; 
 
call tempp_op('Kiran',3000,0.3);
call tempp_op('Akshay',4000,0.35);
 
select * from tempp;

-- ==============================================  
#see_all_procedure_you_have_created

#Shows all the procedure in all the schemas
show procedure status;  

#shows all the procedures from particular database
show procedure status where db ='employee_Details';

#shows procedure status where the name like 'a%'
show procedure status where name like 'a%';

#view ths source code of the procedure
show create procedure abc;

-- ==============================================   
#procedures in multiuser environment

#with the below line user2 can call porocedure abc, which is created by user Kiran
grant execute on abc to user2;

grant execute on abc to user2,user3;
 
revoke execute on abc from user2;

-- ==============================================   
