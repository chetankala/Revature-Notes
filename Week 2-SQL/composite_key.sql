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
CREATE TABLE works_path (
    employee_id INT, -- Foreign key column
    client_id INT, -- Foreign key column
    sales INT, -- Sales column
    PRIMARY KEY (employee_id, client_id), -- Composite primary key
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id) ON DELETE CASCADE, -- Foreign key constraint
    FOREIGN KEY (client_id) REFERENCES Client(client_id) ON DELETE CASCADE -- Foreign key constraint
);

