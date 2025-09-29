-- Delete the emplyees table if it exists
DROP TABLE employees;

-- Create the emplyees table with various data types
CREATE TABLE employees (
    id int IDENTITY(1,1) PRIMARY KEY, -- Integer with auto-increment and primary key. In MySQL IDENTITY is AUTO_INCREMENT
    first_name varchar(100), -- Variable character string with a maximum length of 100
    last_name varchar(100), 
    department_code char(3), -- Fixed-length character string of length 3
    age tinyint, -- Tiny integer
    hourly_rate decimal(5,2), -- Decimal number with 5 digits total and 2 digits after the decimal point
    hire_date date, -- Date
);

-- Insert sample data into the employees table and select all records after each insertion
-- VALUES are used to insert values in the order of columns defined in the table
INSERT INTO employees VALUES('Charlie', 'Johnson', 'CUS', 32, 15.50, '2022-01-15');
SELECT * FROM employees; -- Select all records to verify insertion

INSERT INTO employees VALUES(default, 'Alice', 'Smith', 'HR', 29, 20.00, '2021-06-01');
SELECT * FROM employees;

INSERT INTO employees (first_name, last_name, department_code, age, hourly_rate, hire_date) VALUES('Bob', 'Brown', 'IT', 35, 25.75, '2020-03-20');
SELECT * FROM employees;
