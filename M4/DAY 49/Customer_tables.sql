use customer;
create table customers
(
CustomerID INT,
CustomerName varchar(50),
ContactNmae varchar(50),
Address varchar(100),
City char(15),
PostalCode INT,
Country char(15)
);

insert into customers values
(1,'White Clover Markets','Karl Jablonski','	305 - 14th Ave. S. Suite 3B','Seattle',98128,'USA'),
(2,'Wilman Kala','Matti Karttunen','	Keskuskatu 45','Helsinki',21240,'Finland'),
(3,'Wolski','Zbyszek','	ul. Filtrowa 68	','Walla','01-012','Poland'),
(4,'Cardinal',null,null,'Stravar',null,'Norway')
;

select * from customers;









