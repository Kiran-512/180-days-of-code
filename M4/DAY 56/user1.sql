show databases;

use user1_schema;

create table student(
sid char,
sname varchar(25),
smob_no char(15)
);

insert into student values
('1','Kiran','99898787656'),
('2','Akshay','99876547656');

select * from student;


