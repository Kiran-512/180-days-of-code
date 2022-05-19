#MySQL_Loops
/*
=>  FOR REPITATIVE PROCESSING, ITRERATIVE PROCESSING
-- ==============================================================
#WHILE DO LOOP
- First check sthe condition

SYNTAX:
		while Expression do
			.......................;
			.......................;
        end while;    

-- ==============================================================
#REPEAT LOOP
#DO-WHILE loop
- first executes oince and then checks the condition
- SIMILAR TO THE DO WHILE LOOP
- THERE IS NOT CONDITION TO ENTER THE LOOP BU THen there is condition to exit the loop, 
- it will execute at least once
- e.g. outer join
  
#SYNTAX:
	repeat 
		------------------------;
		------------------------;        
	until expression
    end repeat;
-- ==============================================================

#Loop, leave, iterate statements;-

- Leave statement allows us to exist the loop, similar to break;
- Iterate statement allows us to skip the current iteration like continue in java
- Loop statements are used to execute the repreated block of code repitatively with the an additional flexibility of using a loop label (We can lebel a loop) 
-- ==============================================================
#Global Variables - also called session variables

- set @x  = 10; => created in server ram and it is goinf to be in the ram till we exit
- select @x from dual; -- OP is 10
- set @x = @x + 1;
- select @x from dual; -- OP is 11
 
-- ==============================================================
*/
-- ==============================================================
#Program_9

drop procedure while_loop_demo;
 
delimiter //
create procedure while_loop_demo()
begin
	declare x int default 1;
    while x < 10 do
		insert into emp_op values (x,'in while loop',null);
        set x = x + 1; -- set x = x-1 OR post pre increment isn't allowed here 
    end while;    
end; //
delimiter ; 

show procedure status where db = 'employee_details'; 

call while_loop_demo();
delete from emp_op;
select * from emp_op;

-- ==============================================================
#Program_10
drop procedure nested_while_loop_demo;

#nested while loop
delimiter //
create procedure nested_while_loop_demo()
begin
	declare x int default 1;
    declare y int default 1;
    while x < 10 do
		while y< 10 do
		insert into emp_op values (y,'in y while loop',null);
        set y = y+1;
        end while;
        insert into emp_op values (x,'in x while loop',null);
        set x = x + 1; -- set x = x-1 OR post pre increment isn't allowed here 
    end while;    
end; //
delimiter ; 

call nested_while_loop_demo();
delete from emp_op;
select * from emp_op;
desc emp_op;

-- ==============================================================
#Program_10
#repeat_demo

show procedure status;

drop procedure repeat_demo;

delimiter //
create procedure repeat_demo()
begin
	declare x int default 1;
	repeat 
		insert into emp_op values(x,'in repeat loop',null);
        set x = x + 1;
        until x > 5 end repeat;
end; //
delimiter ;

call repeat_demo();

delete from emp_op;

select * from emp_op;

-- ==============================================================

#Program_11
#loop_Demo
drop procedure loop_Demo;

delimiter //
create procedure loop_Demo()
begin 
	declare x int default 1;
    loop_name:loop
    if x > 10 then 
		leave loop_name;
        end if;
        set x = x+1;
        if mod(x,2) != 0 then
			iterate loop_name;
        else
			insert into emp_op values (x,'loop_name',null);
        end if;
	end loop;
end; //
delimiter ;

delete from emp_op;

call loop_Demo();

select * from emp_op;

-- ==============================================================