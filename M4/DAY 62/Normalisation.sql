#Normalisation
/*
-- =====================================================================
- Applicable to RDBMS and ORDMBS and not to the DBMS
- 1st - 4th Normal Form -- RDBMS
- 1st - 9th Normal Form - ORDBMS
- CONCEPT OF THE TABLE DESIGN
- WE WILL HAVE TOD DECIDE WHTA TABLES, structures, columns, datatypes, width, and constraints
- Based on the user requirements ( Communication is most important - interaction with the user which is non verbal)
- Part of design phase (1/6th of time is spent on the design) 

#SDLC
- data flow diagrams, ER Model, CAD diagrams, Pseudocode, actual code (25% - 35% of TIME) and then testing, production and software installation onclient side
- 53% of software development is loss due to hurry and they skip the basic steps and jumps to the coding part

- primary aim of normalisation is data redundency (avoid unnecesary duplciation of data)
- secondary aim to reduce the problem of DML operations(INSERT/UPDAET/DELETE etc.)

#Normalisation is done from input perspective 
- Normalisation is done from Form perspective
- Over the period of time DML became complex as upon insertion with trigegr we maintaint he log make changes in related tables, keep standby server, create shadow tables etc so half of the doxen of the things we do paralely with DML commands
Hence Normalisation is done from input persepctive

- Whatever applciation we creates, we have to view it from per transaction basis!
- VIEW THE ENTIRE APPLICATION FROM PER TRANSACTION BASIS, AND NORMALISE THE EACH TRANSACTION SEPERATLY (I.E. APPLY 9 STEPS OF normalisation )
 
 Transaction e.g.
- customer_withdraw_amount, places_order, cancels_order etc.

-- =====================================================================
Getting ready for Normalisation Customer_places and order()

#STEP 1 => 
- List all the attributes or field for an entity for an each transaction
onum
cnum
cname
cadd
ccity
cpincode
cmobno
cemailid
orderdate
deldate
product_code
pro_name
qty
rate
item total
Ototal

#STEP 2 => 
- Ask the sample data from the client

#STEP 3 => 
- With permission, approval and involvement of a client . STRIVE FOR ATOMICITY (Fields can be devided into the sub fields, and suib fields can further devided into the sub-sub fields)

lets say cadd : might contains plotno, bldgno, flatno, floor, street, area, landmarks etc.

#STEP 4 => 
- For every field make a list of field properties
 eg. cpincode 	-> numeric, 6 digits, fixed length, >0 mandatory columns
	 add 		-> alphanumeric, max 200 characters, etc.
	 cemailid	-> alpha-numeric, max 100 characters, must contains a values, no duplicates etc.
     
#STEP 5 => 
- GET USER SIGN OFF

#STEP 6 => 
- END OF USER ENVIRONMENT

#STEP 7 => 
- ASSIGN THE DATATYPE FOR EACH COLUMN
E.G CNAME VARCHAR(50), Cpincode int, 

#STEP 8 => 
 - Assign not null, unique and check constraints only these three
e.g. cpincode check 6 digits 

#STEP 9 => 
- For practical purpose, we can have single table with all these columns
In actaul we can not have one table with the all the fields because
- Assuming customer has placed only one order and if we delete the order detaisl then we will lose the precious data of the customer
- If customer places more than one order then the same data will be repeated again and again, so it's DATA REDUNDENCY problem

#Step 10
- Key element will be primary key for this table, Remebers the three steps for deciding the p[rimary KEY
- First find KEY element
- If no KEY field then try for composite KEY
- If no composite KEY, then go for Surrogate KEY 

=================================================================================================

At this point of time data is in Unnormalised form i.e. UNF which is the STARTING POINT OF Normalisation

After this,actual 9 steps for the normalisation STARTS :

onum
cnum
cname
cadd
ccity
cpincode
cmobno
cemailid
orderdate
deldate
product_id
pro_name
qty
rate
item total -> having this field is wastage of harddisk =>  We can have thid as computed column
Ototal

- REMOVE columns what we can have as the COMPUTED columns, as this could be the waste of HD(eg. itemtotal = qty*rate, ototal = sum(qty*rate), etc )

=================================================================================================

STEP NO 1 :
- REMOVE the repeating field into the new table and KEY element will be the primary KEY of the new table
- with this we will have another table now and that is efficient becasue we wont be repeating the non repeating fields like FIELD LEFT IN TH FIRST TABLE AS SPECIFIED BELOW

onum                    product_id
cnum					pro_name			
cname					qty
cadd					rate
ccity					onum
cpincode
cmobno
cemailid
orderdate
deldate

product_code -> for the new table, this field can not be a primary key as same product can be bought by different customers hence repeating the product_id!
				Hence we can have Onum field also in the new table and then we can create the compsite primary KEY,  

In SHORT,
		1. Remove repeating columns into the new table
        2. Key element will be the primary KEY for the new table
        3. (This may or may not required step depends on relationship if tis many to many) Add the primary key of the original table, to the new table to give you a composite Primary Key 

THE THREE STEPS ARE REPEATING AGAIN AND AGAIN INFINITELY TILL YOU CAN NOT NORMALIZE ANY FURTHER!

After this stpe, we have reached the first normal form (FNF) / Single Normal Form (1NF) => Repeating fields are removed from the table design
			1 : Many Relationship is always encountered here
            DEPT and EMP tables are in first Normal From

1/4th i.e. 25% OF THE TABLE WE COME ACROSS WOULD BE FIRST NORMAL FORM 

=================================================================================================
STEPNO : 2
4. Only the tables with the primary key are examined!
- The columns which forms the composite primary key, 
5. Those non Key elements which are non depended on the composite key are removed into the new table


- In our example, since pro_name and the  rate is not depended on the composite primary key (i.e.onum and product_id)  we removed it into the new table

onum                    onum		      product_id
cnum					product_id		product_name
cname					pro_name		   rate
cadd					
ccity
cpincode
cmobno
cemailid
orderdate
deldate

6. Key element on which originally dependent, it is to be added to the new table and it will be the primary key of the new table
	in this example, its product_ID 

THE THREE STEPS ARE REPEATING AGAIN AND AGAIN INFINITELY TILL YOU CAN NOT NORMALIZE ANY FURTHER!

We have reached Second normal form (SNS) or also called as Double Normal Form (2NF)
- Every column is functionally dependednt on primary KEY known as FUNCTIONAL DEPENDECNY
- Without primary key that column can not function
=> In our example, In the third table we have created, We have product_name and rate dependent upon the prdouct_id and IN the second table we created we have ety dependent on composite primary key of our table

2/3rd i.e. 67% OF THE TABLE WE COME ACROSS WOULD BE SECOND NORMAL FORM 

so for less tahn 10% we required step no 7,8 and 9
===================================================================================================

7. ONLY the non key elements are examined for inter dependencies
- 

onum                    onum		      product_id
cnum					product_id		product_name
cname					pro_name		   rate
cadd					
ccity
cpincode
cmobno
cemailid
orderdate
deldate

Now, here we have orderdate, deldate depending on the onum, but the customer details are not depends on the onum and they are inter dependent columns 
e.g. We can have an account ion amazon but its likely that we can;t place and order so the details are not depending on the order they are inter dependent, So remove them into the new table!

8. So inter dependent columns have to be removed into the new tables
- Here we created new table from original table and seperated interdependent fields

onum                    onum		      product_id 			cnum
orderdate				product_id		product_name			cname
deldate					pro_name		   rate					cadd
																ccity
																cpincode
																cmobno
																cemailid			

9. Key element will be Primary key of the new table, and the primary key of the new table will have to retain in the originla table for relation purpose
- In our example, we have cnum as the primary key for the new table we created and then have retained the same key in the original table for relationship


onum                    onum		      product_id 			cnum
cnum					product_id		product_name			cname
orderdate				pro_name		   rate					cadd
deldate															ccity
																cpincode
																cmobno
																cemailid			


THE THREE STEPS ARE REPEATING AGAIN AND AGAIN INFINITELY TILL YOU CAN NOT NORMALIZE ANY FURTHER!

This is the Thrid Normal Form (TNF) or Tripple Normal Form (3NF)

Transitive dependencies are removed from the table design after TNF and TNF is very rarely used almost 10% as 90% design would be done after  first two Forms

=================================================================================================



=================================================================================================



=================================================================================================



=================================================================================================

*/
