#Triggers
/*
#Sotred Objects
- Objects tha are stored in the database
- create .... table, indexes, views, procedures, functions, triggers etc.
- Triger name, table name can not be the same and applies for all the stored objects
- When we drop a table then indexes and trigegrs are also dropped but then views, functions procedure remains even through they are invalid!

-- =================================================
- In Oracle we have 148 trigegrs, where as in MySQL we have ONLY 6 

- present in some of the RDBMS's and  
- it's routine (set of command) which executes automatically whenever some EVENT takes place
- EVENT -> means something happens, 
- Triggers are written on tables
- TOTAL 6 events in the MySQL, and Oracle

- 	before insert, after insert , 
	before delete after delete, 
	before update, after update.

- Read, Compile, Plan and stores in DB in the compiled format

- Triger name, table name can not be the same and applies for all the stored objects

- within the trigger all MySQL-PL STATEMENTS are allowed, declare variables, CURSORS, if statements, 
	loops, etc. depends on the requirement
- ==================================================================
#INSERT trigger
- When ever user insert into the table, we want some action to to do lets say to displauy the message or to save log of it etc.
for that purporse insert trigger is used
- TWO option for insert trigger
- It depends on teh our requirement if we want some action to takes placebefore OR after the insertion of the row
- If necessary we can write both the trigegr vefore and after at the saem time

- ==================================================================
#before insert 
- insert into emp values();
- When user try to insert into table, first MySQL will pasue and will check if there is any trigger,
If YES then before insert trigger is fired, and after its completion ONLY this row will get added into the emp

- ==================================================================
#after insert 
- insert into emp values();
- In this case FIRST this row will get added into the table, then MySQL will pasue and will check if there is any trigger,
If ist 'after insert' YES then after insert trigger is fired, and triggered will complete

==================================================================================
#CASE 1

#First_situation
- if the DML operation on table is failing, then it will casue the event to fail and then the trigger 
	changes are automatically rollbacked and vice versa
i.e In case if user insert the new row at that time if lets say even occured, trigger fired and some entry added to the log but later on  
	insertion failed due to some reasons lets null constraint or data type mismatch then the inserted row will automatically be rollbacked
    
#Second_situation    
- if the trigger fails then it will casue the even to fail and then the DML operation on table, is automatically rolleback, 
i.e. Incase if the row first inserted and then trigger failed to add entry in the log then the insereted row will be rollbacked!

- Wheather first or second situation, YOUR DATA WILL ALWAYS BE CONSISTENT 

- WHEATRHER WE ROLLBACK OR COMMIT AFTERWARDS THE DATA WILL ALWAYS BE consistent
=============================================================================================
#CASE 2
insert into emp values 
('G',3000,2);
rollback;

#BEFORE event
Lets say we rollback afterwards, then first the DML Operation will get rollback and then the whatever changes(eg maintained log) done in the trigger 
will get rollbacked

#AFTER event
Lets say we rollback afterwards, then first whatever changes(eg maintained log) done in the trigger 
will get rollbacked, and then the DML Operation will get rollback!
 
#AND rollback and commit is not allowed inside the triggers, is to bve specified afterwards at the end of the transaction 
	BECAUSE when after DML operation we say rollback then at that time changes in triogger would be already commited which can not be rolledback

- wheather the Rollback or Commit AFTERWARD the data will always be CONSISTENT!

HENCE, AFTER INSERT Trigegr is recommended 
- ==================================================================
- In MySQL trigegrs are at the row levels
- triggers will fire for each row inserted
- In MySQL we can have max 6 triggers per table

- if you droop the table, then indexes and triggeres are dropped automatically,

#MySQL created variables in trigger's
- If we want to enter the inserted values into the table inside our trigegr then we can use those it with the 'new.column_name' 
- new.name, name.sal, name.deptno are MySQL created variables
- We can directly use them in the trigegrs
- In microsoft server these values are not available
 
- ==================================================================
USES :
- maintain the logs (audit trailing) of the insertion (It's standard practice to maintain the logs of the insertion)
- automatic data duplication also knwon as replication OR data mirroring, concept of paralel server OR also called Standby database
i.e. ON INSERTING THE NEW ROW'S if we use the MySQL created variables (e.g. new.ename etc) and can stored the values in another table having same structure and its good practice to store the values in another table too!
and both the tablsmust be on diff drivers
	becasue we cant have a situation where our servers are crashed and website is off! Its a loss of reputation and ultimately loss of a bussiness! 
- To maintain the standby servers, trigger are used with the MySQL creatred variables and both the tables miust be in different partitions 
- These duplicate tables are alsoc alled shadow tables, to maintains teh insertss
- First company in india to maintain the shadow tables was ICICI bank, which uses Oracle
- DATA Cleansing 
- data validations can also be done insde the trigegrs
- auto-updation of related tables
- to maintain the log of deletion 
- MAINTAIN THE history TABLES WITH delete trigegrs
- maintains the logs of the updation (audits trails)
- TO MAINTAIN THE SHADOW TABLES (AFTER UPDATE IS RECOMMMENDED)
- DATA cleansing with update trigger (Before update is recommedned)
- Data validations (Before update is recommended)


#Log of rollback and commit is maintained by one of the system table in MySQL

select * from events;
 
#cascading triggers
One trigegrs casues second trigger to execute and that second trigger causes another third trigger to execute and so on and so forth
-  it depends how complex opur application is

-any kind of power failure or any failure, the entire transaction is automatically rollbacked, and hence DATA IS CONSISTENT
  

e.g.

delimiiter //
create trigger xyz1
before update
on emp for each row
begin
	insert into tempp va;ues.......
end; //
delimiiter ;
=======================================
delimiiter //
create trigger xyz2
before insert
on tempp for each row
begin
	delete from deptot values ...........
end; //
delimiiter ;
=======================================
delimiiter //
create trigger xyz3
before insert
on tempp for each row
begin
	........................;
end; //
delimiiter ;
=======================================
#Mutating Tables - Its an ERROR 

ERROR of Mutation of tables :
one of the cascading trigger if it cases to trigger the previous tables in the cascade then instead oif getting inot the infinite loop it ill give an ERROR  
-- NO LIMIT ON THE TOTAL NO OF Trigger on the CASCADING TIGEGRS

*/
-- =================================================
use employee_details;

drop table emp;

create table emp(
ename varchar(25),
sal float,
deptno int
);

delete from emp;

insert into emp values
('A',5000,1),
('B',5000,1),
('C',5000,1),
('D',3000,2),
('E',3000,2);


drop table deptot;

#We could have obtained the same table with the group by clasue but, If the no of rows are lets say 5 cr then it will take time to show the op table as in group by clasue first sorting takes place, 
-- Hence We have created this table to save our time
CREATE TABLE deptot
(
deptno int,
saltot float 
);

insert into deptot values
(1,15000),
(2,6000);

select * from emp;

select * from deptot;

select * from tempp;

select * from emp2;

/*
if the data is large and select statement is slow then its better to create the anpther tbale and stores the data in that 
table here we have created the table deptot table which stores the sum of sal dept wise and same we could have done with ht 
egroup by clause but then in group by clasue sorting taked plcaes in server ram which slows down the statement so its better 
to have seperate table hcen created seperate table for it
*/

show triggers;

-- =================================================
#program_28

delimiter //
create trigger before_insert_trigger_demo
before insert
on emp for each row  -- this trigger is only for emp table on every row i.e. it will execute each time row is inserted
begin
		insert into tempp values(1,'Inserted'); -- insert into tempp values(1,'Inserted', user(), sysdate(), etc.); 
end;//
delimiter ; 

-- =====================================

#program_29
#after insert
delimiter //
create trigger after_insert_trigger_demo
after insert
on emp for each row  -- this trigger is only for emp table on every row i.e. it will execute each time row is inserted
begin
		insert into tempp values(1,'Inserted');
end;//
delimiter ; 

#Once trigger is created is there in the system table in compiled format, which will make execution fast and we are hiding the source code from the end user

insert into emp values 
('F',5000,1);

select * from emp;

-- ===================================================
#program_30
#commit_rollback in trigegrs

delimiter //
create trigger commit_inside_trigger -- ERROR while creating trigger with commit and rollback inside
before insert
on emp for each row
begin
		insert into tempp values(1,'Inserted'); 
        commit;   # rollback and commit is not allowed inside the triggers, is to bve specified afterwards ...
        #...at the end of the transaction amd wheather the Rollback or Commit AFTERWARD the data will always be consistent
        -- rollback;
end;//
delimiter ; 

#roll_back after insertion will create the data inconsistency issue - hence rolback or commit is done after insert statement

insert into emp values 
('G',3000,2);
rollback;

-- ===============================================
/*
Lets say if we have another table emp2 having 4 rows and when we use below command

= > insert into emp select * from emp2;  -- Note the syntax diff, 'values' keyword is NOT USED

in this case trigger will fire 4 time as trigegr are at the row level and triggers fires as per the row inserted into the table
*/
insert into emp select * from emp2; 

-- =================================================
#MySWL created variables
-- used for creating a shadow tables, which would helpto create the standby server 

#program_31

delimiter //
create trigger after_insert_trigger_demo
after insert
on emp for each row  
begin
		insert into tempp values(new.sal, new.ename);
end;//
delimiter ;

-- =================================================
#program_32

#DATA Cleansing and #DATA _ VALIDATIONS 
#converting data as per our requirements in the trigegrs
/*
Every row is more opportunity to expand the business! 
	lets say if we want every ename to be in capital letter so when user evter the ename in small case instead of giving 
    error by using 'check' constraint we can accesspt the name and then in trigger can convert it to the upper case case 
    and then insert into the emp tabel
    
    set new.ename = upper(new.ename);
    
- Its must that we must do it with the before insert trigger
- BEFORE INSERT is erecommended 
*/

delimiter //
create trigger data_cleansing_trigger
before insert
on emp for each row  
begin
		set new.ename = upper(new.ename);
end;//
delimiter ;

-- =================================================
#program_33

#auto-updation of related tables
-- Here AFTER INSERT is recommended

drop trigger auto_update_related_tables_trigger;

delimiter //
create trigger auto_update_related_tables_trigger
before insert
on emp for each row  
begin								#6000 + 3000
		update deptot set saltot = saltot + new.sal
        where deptno = new.deptno;
end;//					# 2
delimiter ;

insert into emp values 
('H',3000,2);
rollback WORK;

select * from emp;

select * from deptot;

-- =================================================
#drop trigegr :

drop trigger triger_name;

-- =================================================
#show_triggers

show triggers;

#show triggers from database_name;
show triggers from employee_details;


#We get more details with the below code
select * from information_schema.triggers where trigger_schema = 'employee_Details'; 

-- =================================================
#program_34

#DELETE TRIGEGR
#after delete is recommended - because if we use before delete trigger and then delete a row and in case deletion ...
#...doesnt executes, fails then the before delete log will have to rollback and will ask MySQL to do extra work for ...
#...rollback the log in triogger hence its better to use after delete 

DELIMITER //
create trigger before_delete_demo
before delete
on emp for each row
begin
	insert into tempp values(1,'deleted');
end; //
delimiter ;

-- =================================================
#program_35

#OLD VARIABLE USE

#automatically updation of related tables

drop trigger old_after_delete_demo;

DELIMITER //
create trigger old_after_delete_demo
after delete
on emp for each row
begin
	insert into tempp values(old.sal,old.ename);
						#9000       	#3000
    update deptot set saltot = saltot -old.sal
	where deptno = old.deptno;	
end; //				#2
delimiter ;

delete from emp where deptno = 2; 

select * from tempp;
rollback;


-- =================================================
#program_36

#UPDATE TRIGEGR

DELIMITER //
create trigger update_trigger_demo1
after update
on emp for each row
begin
		insert into tempp values(1,'Upated');
		insert into tempp values(old.sal,old.name);
        insert into tempp values(new.sal,new.name);
end; //
DELIMITER ;

update emp
	set sal =6000
		where deptno =1;

-- =================================================
#program_37

#Updation in related tables:
#UPDATE TRIGEGR

DELIMITER //
create trigger update_trigger_demo2
after update
on emp for each row
begin
		insert into tempp values(1,'Upated');
        update deptot set saltot = saltot - (old.sal-new.sal)
        where deptno = new.deptno;
end; //
DELIMITER ;

update emp
	set sal =6000
		where deptno =1;

-- =================================================
#program_38

#Updation in related tables:
#UPDATE TRIGEGR

DELIMITER //
create trigger update_trigger_demo3
after update
on emp for each row
begin
		if old.depno <> new.deptno then
			update deptot set saltot = saltot - old.sal
				where deptno = old.deptno;
			update deptot set saltot = saltot + new.sal
				where deptno = new.deptno;                
        else
        update deptot set saltot = saltot - (old.sal-new.sal)
        where deptno = new.deptno;
        end if;
end; //
DELIMITER ;

update emp
	set deptno = 2
		where ename ='A';
-- =================================================

#program_39

#Since each timewee update the above trigger will execute and the unnecesary code inside the trigger twill get executed 
-- so to avoid this we put codition as below

#Updation in related tables:
#UPDATE TRIGEGR

DELIMITER //
create trigger update_trigger_demo3
after update
on emp for each row
begin
	if old.deptno <> new.deptno or old.sal <> new.sal then 
		if old.depno <> new.deptno then
			update deptot set saltot = saltot - old.sal
				where deptno = old.deptno;
			update deptot set saltot = saltot + new.sal
				where deptno = new.deptno;                
        else
        update deptot set saltot = saltot - (old.sal-new.sal)
        where deptno = new.deptno;
        end if;
	end if;   
end; //
DELIMITER ;

update emp
	set ename = 'Rahul'
		where ename ='A';

#In above update statement there is no need to excute the line to update depto table hence we first cheked if there is change in sal or deptno, if there is nay change then 
#only the code inside trigger will execute and update the realated table which is deptot 

-- =================================================

#Log of rollback and commit is maintained by event system table in MySQL
use information_schema;
select * from events;

-- =================================================