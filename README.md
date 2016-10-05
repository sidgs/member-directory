# member-directory

1. Import it as a git project and run it on apache tomcat.
2. Change the database name,username,password in db.properties file.
3. Go to mysql command line and run the following query.


 CREATE TABLE member (
 firstName varchar(25),
 lastName varchar(25) NOT NULL,
 email varchar(15),
 phone int(10) NOT NULL,
 address varchar(30) NOT NULL,
 PRIMARY KEY (lastName));

4. Right click on project-->run as-->run on server.
