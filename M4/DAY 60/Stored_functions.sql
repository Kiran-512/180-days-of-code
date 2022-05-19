#Stored_functions
/*
- routine that returns a values directly or compulsorily
- gloabl functions, can be called from command line, workbench, java, .net, any front end s/w etc
- unlike procedure, function can not be called by itself, as function return a value and that hs to be equated with a variable or it has to be part of some epxression  
- points and benifits are same as of procedure
- upon creation of function they are stored in data base there is system_table which stores a function,code of the sfucntion is in the databse in compiled format so execution will be aster which takes place in derver ram 
- stored procedure can called stored functions and vise-a-versa
- IN parameters only for functions
- stored function can be called in select statement and sql commands as like normal functions

-- -- =====================================
#TYPES 
1. Deterministics
2. Not Deterministics

- for the same input parameters, if the function returns the same result then the functioni is called as an deterministics function
 and otherwise the stored function is stored as an not deterministics
- We have to decide whether its 1 or 2 
- if oyou declare it incorrectly, the stored function may produce an unexpected result or the availablle optimisation is not used  which degrades the performcance
- ONLY if curent date and time is used inside the function then only its goinf to be non deterministic or else mostly it would be deterministic

*/

-- -- =====================================
#program_26

delimiter //
create function dt_function_demo1()
returns int
deterministic
begin
	return 10;
end; //
delimiter ;

delimiter //
create procedure func_with_procedure()
begin
	declare x int;
    set x = dt_function_demo1();
    insert into tempp values(x,'value from func');
end; //
delimiter ;

call func_with_procedure();

select * from tempp;

-- =====================================
#program_27
#Function with procedure to find out the squre of a number and insert into the table

delimiter //
create function whats_the_squre(y int)
returns int
deterministic
begin
	return y*y;
end; //
delimiter ;

delimiter //
create procedure whats_the_squre(z int)
begin
	declare x int;
    set x = whats_the_squre(z);
    insert into tempp values(x,'value from func');
end; //
delimiter ;
delete from tempp;

call whats_the_squre(35);

select * from tempp;

-- =====================================

#functions in select statement
-- similar to the single row and multile row function we can use user created function in seletc statement

select whats_the_squre(sal) from emp where empno =1;


-- =====================================
#multiuser_environment DCL commands on fucntions 

grant execute on function whats_the_square to user2;

revoke execute on function whats_the_square from user2;

-- =====================================


