#Constraints

drop table emp;

select * from emp;

create table emp(
empno char(4) Primary key,
ename varchar(25),
sal float,
deptno char(4),
panno char(15),
ppno char(15)
);

delete from EMP;

insert into emp values
('1','A',5000,'1','A209645704','AMZPY5757F'),
('2','A',6000,'1','A209645705','AMZPY5758F'),
('3','A',7000,'1','A209645706','AMZPY5757B'),
('4','A',9000,'2','A209645707','FMZPY5757F'),
('5','A',8000,'2','A209645708','PMZPY5757F');

select * from emp;


/*
- Limitations/Restrictions on table

#Primary KEY(Columns):
- Columns or KEY that uniquely identifies a row (eg. EMPNO, PANNO,UIDNO etc. unique columns)
- Duplicate values are not allowed  
- It could not be in the sequence, and it could have msiing numbers, it could have alpha numberic values too! 
- Null values are also not allowed
- has to be unique, It's a mandatory column as user has to enter some value for this KEY
- Its recomended that every table should have PRIMARY KEY

- PURPOSE :
- We can distinguish between two rows of the table as Primary key would be unique
- Text and Blob can not be Primary KEY becasue of its size
- unique index is automatically created as we decalre any column as Primary KEY!

- If we declare a composite PRIMARY KEY then MySQL automatically creates a composite unique index 
- We can have ONLY ONE primary key PER TABLE.

Composite PRIMARY KEY :
- Combine two or more columns together to server the purpose of primary key
- in this the combination of tow rows wont repeat hence no duplicates key
- In MyQL we can combine upto 32 composite primary KEY
- In Oracle its 16 column

SURROGATE KEY:
- if we can not identify the primary key for our table then create new column and make it as primary key
- such primary key is known as surrogate key
- is not a constraint
- is a definition
- char is fixed lenght datatype and for surropgate key its programmer who can decide which datatype he can use
- char data type is recommended for suggate key

Why not int?
- int has size limit of which is smaller than the limimt of char.alter
- searching will be faster in int too!
 
Why dont we make ROWID as primary KEY?
- We cann't see ROWID in MySQL
- its fake column, pseudo column
- Its encrypted, something which I can not understand
- Row ID is not constant, if we update the row rowid may change!
- When rows are duplicate then in that case rowid will be duplicate too!
 
=> CANDIDATE KEY:
-> besides primary key, any other key which can server purpose of primary key is candidate key
-> its not a constraint
-> its a difinition
-> Its good practice to have couple of candidate key in the table, in future if we drop the primary key, then we can immidietly make the candidate key as primary key

===============================================================================

#DATA INTEGRITY =>

- All constraint are at the server level
- we can insert using the MySQL command line, workbench, MySQL PL, JAVA,.net,etc. the constraint will always be valid
- we can perform any DML operation using any front end s/w(java) , the constriants can be valid
- this is called DATA INTEGRITY

===============================================================================

internally constraint is MySQL created function, if performs a validations

to find out which constrains we have crated

#to check for all indexed columns from all the databases that you havea ccess to!
select * from information_schema.table.constraints; 

#to get all the indexed columns from particular databse
select * from information_schema.table.constraints
where table_schema= "database_name";
 
#to get all the indexed columns from particular table
select * from information_schema.key_column_usage
where table_name= " table_name";

================================================================
 
 show indexes from table_name;
 
================================================================
DROP primary KEY:

alter table table_name drop primary key;
================================================================
 
ADD PRIMARY KEY CONSTRAINTS TO THE EXISTING  TABLE AFTER WARDS
 
alter table table_name add primary key (column_name); 
 
================================================================
Assignments:
 
to chaneg primary key constraints:
1.drop primary key constraints
2.add primary key constraints

*/
-- ==============
#check for indexes

show indexes from emp;

select * from information_schema.table_constraints;

select * from information_schema.table_constraints
where table_schema='employee_details';

select * from information_schema.key_column_usage
where table_name ='emp';

alter table emp 
	drop primary key;

alter table emp 
	add primary key(empno);

#creating the composite primary key
-- first delet the primary key 
alter table emp 
	drop primary key;

-- then create composite primary key
alter table emp
	add primary key(deptno,empno);

show indexes from emp;

alter table emp
	drop primary key;

-- ==============================================================


#Clear Screen in MySQL Terminal -> \! cls



/*
Adding constraints directly on the table is generally considered good practice, and here’s why — along with the trade-offs compared to handling them programmatically:

Why Table Constraints Are Good Practice

Data Integrity Guaranteed at the Database Level

Constraints (PRIMARY KEY, FOREIGN KEY, UNIQUE, NOT NULL, CHECK) cannot be bypassed, even if multiple applications or scripts write to the database.

Programmatic checks in application code are fragile, because bugs or new code may accidentally skip them.

Consistency Across Applications

If multiple services or applications access the same database, table constraints ensure consistent rules without relying on every app to implement them correctly.

Simpler Maintenance

Defining rules in the schema makes it self-documenting. Anyone looking at the table knows what’s required.

Trade-Offs / Potential Drawbacks

Performance / Latency Impact

Constraints add some overhead on INSERT/UPDATE/DELETE operations.

Example: Foreign keys require a lookup in the parent table.

Usually, this is negligible for small to medium tables but may matter in very high-volume transactional systems.

Flexibility

Programmatic validation can be more flexible (custom logic, conditional rules) than standard SQL constraints.

Bulk Loads

When loading large datasets, constraints can slow inserts. Often, bulk loads temporarily disable constraints and then re-enable them after the load.

Best Practices

Always use constraints for critical rules (primary keys, foreign keys, unique keys, NOT NULL).

Programmatic checks are good for business-specific rules that cannot be expressed easily in SQL (e.g., “an employee cannot belong to more than 3 departments”).

Monitor performance; if a high-volume table has FK constraints causing latency, consider indexing FK columns or using batch inserts.

💡 Rule of Thumb:

Integrity at the database level first, application-level checks second.

Database constraints ensure correctness; programmatic checks ensure business logic compliance.
*/






