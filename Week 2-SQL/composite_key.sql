--Step 1: Create a table called employee, client, and branch
CREATE TABLE employee (
    employee_id INT PRIMARY KEY, -- Primary key column       
    first_name VARCHAR(50), -- First name column 
    last_name VARCHAR(50), -- Last name column
    manager_id INT, -- Self-referencing foreign key 
    FOREIGN KEY (manager_id) REFERENCES employee(employee_id) ON DELETE SET NULL -- Self-referencing foreign key 
);
CREATE TABLE client (
    client_id INT PRIMARY KEY, -- Primary key column
    client_name VARCHAR(50), -- client name column
    branch_id INT -- Foreign key column
    FOREIGN KEY (branch_id) REFERENCES branch(branch_id) ON DELETE CASCADE -- Foreign key constraint
);
CREATE TABLE branch (
    branch_id INT PRIMARY KEY, -- Primary key column 
    client_name VARCHAR(50), -- Branch name column
    manager_id INT, -- Foreign key column
    FOREIGN KEY (manager_id) REFERENCES employee(employee_id) ON DELETE SET NULL, -- Foreign key constraint
);

--Step 2: Create a table works_path
