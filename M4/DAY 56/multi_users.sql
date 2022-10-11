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
#system mysql -u user_name -p

-- ================================================

grant select on employee_details.emp to user1,user2,user3;

revoke select on employee_details.emp from user1,user2,user3;

grant insert,update,delete, alter,create on emp to user1, user2, user3;
revoke insert,update,delete, alter,create on emp from user1, user2, user3;

-- ================================================
#Access Denied for User 'root'@'localhost'
If you have that same problem in MySql 5.7.+ :

Access denied for user 'root'@'localhost'
it's because MySql 5.7 by default allow to connect with socket, which means you just connect with sudo mysql. If you run sql :

SELECT user,authentication_string,plugin,host FROM mysql.user;
then you will see it :

+------------------+-------------------------------------------+-----------------------+-----------+
| user             | authentication_string                     | plugin                | host      |
+------------------+-------------------------------------------+-----------------------+-----------+
| root             |                                           | auth_socket           | localhost |
| mysql.session    | *THISISNOTAVALIDPASSWORDTHATCANBEUSEDHERE | mysql_native_password | localhost |
| mysql.sys        | *THISISNOTAVALIDPASSWORDTHATCANBEUSEDHERE | mysql_native_password | localhost |
| debian-sys-maint | *497C3D7B50479A812B89CD12EC3EDA6C0CB686F0 | mysql_native_password | localhost |
+------------------+-------------------------------------------+-----------------------+-----------+
4 rows in set (0.00 sec)


#To allow connection with root and password, then update the values in the table with command :

hen run the select command again and you'll see it has changed :

+------------------+-------------------------------------------+-----------------------+-----------+
| user             | authentication_string                     | plugin                | host      |
+------------------+-------------------------------------------+-----------------------+-----------+
| root             | *2F2377C1BC54BE827DC8A4EE051CBD57490FB8C6 | mysql_native_password | localhost |
| mysql.session    | *THISISNOTAVALIDPASSWORDTHATCANBEUSEDHERE | mysql_native_password | localhost |
| mysql.sys        | *THISISNOTAVALIDPASSWORDTHATCANBEUSEDHERE | mysql_native_password | localhost |
| debian-sys-maint | *497C3D7B50479A812B89CD12EC3EDA6C0CB686F0 | mysql_native_password | localhost |
+------------------+-------------------------------------------+-----------------------+-----------+
4 rows in set (0.00 sec)












