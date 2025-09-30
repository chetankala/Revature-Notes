-- SQL Introduction

-- DDL - Data Definition Language: This is used to define and manage database structures. 
-- creation, alteration, and deletion of tables and other database objects.
    -- Commands: CREATE, ALTER, DROP, TRUNCATE, RENAME

-- DML - Data Manipulation Language: This is used to manipulate data within the database. 
-- Inserting, updating, deleting, and retrieving data from tables.
    -- Commands: SELECT, INSERT (create), UPDATE (update), DELETE (delete), MERGE

-- DCL - Data Control Language: This is used to control access to the database and its objects. It regulates access to the data.
-- Granting and revoking permissions to users and roles.
    -- Commands: GRANT, REVOKE

-- TCL - Transaction Control Language: This is used to manage transactions within the database. Deals with finalizing or reverting changes.
-- Committing and rolling back transactions to ensure data integrity.
    -- Commands: COMMIT, ROLLBACK, SAVEPOINT, SET TRANSACTION


-- Create our table
CREATE TABLE COMPANY(
    ID INT NOT NULL, --contrains that it wants to return something
    Company_Name VARCHAR(25) NOT NULL, --varchar is variable character length
    Company_Address VARCHAR(25)
    PRIMARY KEY (ID) --primary key is used to uniquely identify each record in the table
);

CREATE TABLE EMPLOYEE(
    Employee_ID INT PRIMARY KEY,
    F_Name VARCHAR(25) NOT NULL,
    L_Name VARCHAR(25) NOT NULL,
    Address VARCHAR(25),
    Company_ID INT REFERENCES COMPANY(ID) --foreign key references the primary key of another table (in this case COMPANY table)
)

-- Alter the table structure to include a new column
ALTER TABLE EMPLOYEE ADD Department VARCHAR(20);

-- Remove a column from the table
ALTER TABLE EMPLOYEE DROP COLUMN Department;

-- Remove the table from the database
DROP TABLE EMPLOYEE; -- This will remove the table structure and all its data

SELECT * FROM EMPLOYEE; -- Select all columns and rows from the EMPLOYEE table
