#Read and Write Consistency :
/*
====================================================
- In a multi-user environment, when you SELECT from a table, you can view only the committed data of all users plus changes made by you 

To use two users in mysql command line
---------------------
- set sqlprompt 'USER1>'
- set sqlprompt 'USER2> 

====================================================
#ROW LOCKING: 

* when you UPDATE or DELETE a row, that row is automatically locked for other users AND BECOMES READ ONLY
* ROW LOCKING IS AUTOMATIC IN MYSQL AND ORACLE
* when you UPDATE or DELETE a row, that row becomes READ ONLY for other users
* other users can SELECT from that table; they will view the old data before your changes are commited
* other users can INSERT rows into that table
* other users can UPDATE or DELETE "other" rows of that table
* no other user can UPDATE or DELETE your locked row, till you have issued a Rollback or Commit
* LOCKS ARE AUTOMATICALLY RELEASED WHEN YOU ROLLBACK OR COMMIT

====================================================
#OPTIMISTIC ROW LOCKING: 

- automatic row locking mechanism in MySQL and Oracle
- To try out row locking in MySQL Workbench: 
- Click on Query (menu at the top) 
- New tab to current server 
- click on it
- now you will have 2 query windows to try out row locking
- To abort the operation (to exit from the Request queue) 
- Click on query (menu at the top) 
- Click on Stop

====================================================
#PESSIMISTIC ROW LOCKING: (for update / for delete clause)
- you manually lock the rows BEFORE issuing UPDATE or DELETE
- to lock the rows manually you require SELECT statement with a FOR UPDATE clause

#when you try to lock the row manually, if some other user has locked the same row before you, then by default your request will wait in the Request Queue

#WAIT/NO WAIT options are not available in MySQL
#LOCKS ARE AUTOMATICALLY RELEASED WHEN YOU ROLLBACK OR COMMIT

====================================================


*/
-- ====================================================
#for update 
#entire table is lcoked here
select * from emp for update;

#only those rows with the dept no 10 are locked
select * from emp 
	where deptno = 10 
		for update;

#when you try to lock the row manually, if some other user has locked the same row before you, then by default your request will wait in the Request Queue

#In MyQSL + Oracle
select * from emp where deptno = 10 for update nowait;		

#In Oracle ONLY
select * from emp where deptno = 10 for update wait; #(by default)

select * from emp where deptno = 10 for update wait 60; #(time in SECONDS)

#WAIT/NO WAIT options are not available in MySQL
#LOCKS ARE AUTOMATICALLY RELEASED WHEN YOU ROLLBACK OR COMMIT
