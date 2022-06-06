#privilages
/*
- Grant /Revoke (DCL Commands) and not DDL commands!
- 
#Multi-user scenario
user1: schema : A
user2: schema : B
user3:
user4:

user1 MySQL> grant select on emp to user2;

=> No need to commit and these are the permanent permissions

=> if user 2 is trusted user for user1 then can grant inser tpermisiion:
user1 MySQL> grant insert on emp to user2;
user1 MySQL> grant update on emp to user2;
user1 MySQL> grant delete on emp to user2;

=> to grant all permisions to the user2:
user1 MySQL> grant all on emp to user2;

=> to grant select to multiusers:
user1 MySQL> grant select on emp to user2,user3;

=> to grant select to all users:
user1 MySQL> grant select on emp to public;

#revoke
user1 MySQL> revoke select on emp from user2;


===================================================
#to see what permissions granted and received :

select * from information_schema.table_privilages;

===================================================
AFTER GRANTING PERMISSION BY USER1 TO ACCESS TABLE TO USER2 USER2 CAN select from table as below:

#database_name.table_name -> SYNTAX  TO ACCESS THE TABLE OF USER1 FROM DATABASE OF USER 1 IN THE ANOTHER DATABASE OF USER2

user2 MySQL> select * from table_name; -- This will give ERROR if table is not there in the B schema which belongs to user2

user2 MySQL> select * from A.table_name;  -- here A is schema of user1 who has granted permission for table to user2

===================================================
Now user2 can grant permision to other user, on table of user1 which he has got from user1:

user2 MySQL> grant select on A.table_name to user3;

here even if user1 revokes the permission from user2 still user3 will have the permission now unless user1 revokes the permission from user3

===================================================

*/