use user2_schema;

select * from student; -- ERROR as no such table in user2_schema

select * from user1_schema.student; 

drop table user1_schema.student; -- ERROR no permisiion to drop to user 2 
