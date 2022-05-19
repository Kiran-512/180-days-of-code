show databases;

create user Kiran@'%' IDENTIFIED BY 'cdac';

create user user1@'%' identified by 'user1';
create user user2@'%' identified by 'user2';
create user user3@'%' identified by 'user3';

create schema user1_schema;
create schema user2_schema;
create schema user3_schema;

# command line MySQL:
-- to switch in between users on command line
#mysql -u user_name -p

-- ================================================

grant select on employee_details.emp to user1,user2,user3;

revoke select on employee_details.emp from user1,user2,user3;

grant insert,update,delete, alter,create on emp to user1, user2, user3;
revoke insert,update,delete, alter,create on emp from user1, user2, user3;

-- ================================================












