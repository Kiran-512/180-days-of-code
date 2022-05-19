#Parameters
/*

delimiter //
create procedure (variable-Name datatyepe )
begin

end; //
delimiter ;
-- =====================================
=> IN (by default - no need to mention this with paramter)
------
- READ ONLY
- We can pass a constant variable and an expression also as argument to the procedure
- call by value only 
- FASTEST in terms of processing speed
- if we dont want to alter or return the value then in is the first preference
-- =====================================
=> OUT
-------
- Write Only - here the parametr comeonly oni left side of = sign
- We can pass variables ONLY 
- can not pass expression or the constant values
- call by address i.e. we are not passing variabledirectly we are passing addraess of that variable to the parameter in th procedure 
- procedure can return a value indireclt if we call by reference
- most secure
- preferred if you are working on public network e.g. internet
-- =====================================
=> INOUT
-------
- read-write -- here the paramtere passed can come on any side of the = sign
- can pass variables only
- call by reference
- procedure can return a value indireclt if we call by reference
- Most powerful
- preferred 
*/
-- =====================================

#program_21
delimiter //
create procedure in_parameter(in y int) 
begin
	set y = 100; -- ERROR i.e. y can not be on left side of = sign
    set x = y+10; -- Allowed
    insert into tempp values(y,'inside in paramter');    
end;
delimiter ;

call in_parameter(5); 
set @x =10;
call in_parameter(@x); 

call in_parameter(2*@x + 5); 

-- We can pass a constant variable and an expression also
-- =====================================

#program_22
#PROCEDURE INSIDE PROCEDURE

delimiter //
create procedure process1(y int)
begin
		insert into tempp values(y, 'inside');l
end; //
delimiter ;


delimiter //
create procedure process2()
begin
		declare x int default 0;	
		call process1(5);
		call process1(x);
		call process1(2*x + 5);        
end; //
delimiter ;

call process2();

-- =====================================
#OUT
#Program_23

delimiter //
create procedure out_parameter(out y int)
begin
	set y =100;
end; //
delimiter ;

set @x =10;
select @x from dual;

call out_parameter(@x);

-- =====================================
#program_24
#OUT variationn2

delimiter //
create procedure out_parameter2(out y int)
begin
    declare x int default 10;
    insert into tempp values(x,'before');
    call out_parameter(x); -- on passing the x(10) to  out_parameter(out y int), y also has the same address that of x, so the values of y changed hence here the value of x is alsoc hanged after this proceduree called
	insert into tempp values(x,'before');
end; //
delimiter ;

set @z = 100;
call out_parameter2(@z);

select * from tempp;

-- ======================================
#program_25

delimiter //
create procedure in_out_parameter(inout y int)
begin
	set y = y*y*y;
end; //
delimiter ;


delimiter //
create procedure demo_process()
begin
	declare x int default 10;
    insert into tempp values(x,'before');
    call in_out_parameter(x); 
	insert into tempp values(x,'after');
end; //
delimiter ;

call demo_process();

select * from tempp;

-- ================================================
