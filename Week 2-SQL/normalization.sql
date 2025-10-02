-- First Normal Form (1NF): is a conclusive form of a relational database.
-- If we are to consider a database relational, then all relations in the database are in 1NF

-- Second Normal Form (2NF): deals with the elimination of circular dependencies from a relation.
-- We say a relation is in 2NF if it is in 1NF and if every non-key attribute is completely
-- functionally dependent on the primary key.

-- Third Normal Form (3NF): deals with the elimination of non-key attributes that do not depend on the primary key.
-- For a relation to be in 3NF, the relationship between any two non-key attributes, or groups
-- of non-key attributes, must not be in a one to one relationship.

-- Boyce-Codd Normal Form (BCNF): is an extension of the 3NF. Also known as 3.5NF. For any dependency
-- A -> B, A should be a super key. This means that A should be a key attribute if B is a key attribute.

-- Unnormalized
CREATE TABLE zookeepers(
    first_name varchar(100),
    last_name varchar(100),
    exhibit varchar(100),
    animal_type1 VARCHAR(100),
    animal_type2 VARCHAR(100),
    animal_type3 VARCHAR(100),
    salary INTEGER,
    position_title VARCHAR(100)
)

-- This table is unnormalized because it does not have a primary key and it contains repeating groups (animal_type1, animal_type2, animal_type3)

-- 1NF
CREATE TABLE zookeepers(
    id INT IDENTITY(1,1) PRIMARY KEY,  -- auto-incrementing primary key. Use auto_increment for MySQL
    first_name varchar(100),
    last_name varchar(100),
    exhibit varchar(100),
    animal_type varchar(100),
    salary INTEGER,
    position_title VARCHAR(100)
);

-- To put the example in 1NF, we added a primary key (id) and removed the repeating groups by creating a new row for each animal type associated with a zookeeper.

-- 2NF
CREATE TABLE zookeepers(
    id INT IDENTITY(1,1) PRIMARY KEY, 
    first_name varchar(100),
    last_name varchar(100),
    salary INTEGER,
    position_title VARCHAR(100)
);

CREATE TABLE exhibits(
    id INT IDENTITY(1,1) PRIMARY KEY,
    exhibit_name varchar(100),
);

CREATE TABLE animals(
    id INT IDENTITY(1,1) PRIMARY KEY,
    species varchar(100),
    FOREIGN KEY (exhibit_id) REFERENCES exhibits(id) ON DELETE SET NULL -- if exhibit is deleted, set exhibit_id to NULL
);

CREATE TABLE zookeeper_exhibits(
    zookeeper_id INT,
    exhibit_id INT,
    PRIMARY KEY (zookeeper_id, exhibit_id),
    FOREIGN KEY (zookeeper_id) REFERENCES zookeepers(id) ON DELETE CASCADE, -- if zookeeper is deleted, delete the row in this table
    FOREIGN KEY (exhibit_id) REFERENCES exhibits(id) ON DELETE CASCADE -- if exhibit is deleted, delete the row in this table
);

-- The animals table is created and contains a foreign key that references the exhibits table, since an
-- animal would depend / live within an exhibit.

-- 3NF
CREATE TABLE zookeepers(
    id INT IDENTITY(1,1) PRIMARY KEY, 
    first_name varchar(100),
    last_name varchar(100),
    FOREIGN KEY (position_title_id) REFERENCES position_titles(id) ON DELETE SET NULL
)

CREATE TABLE position_titles(
    id INT IDENTITY(1,1) PRIMARY KEY,
    position_title_name VARCHAR(100),
    salary INTEGER
);

-- Lastly, we need to remove a transitive dependency so we can move our zookeepers table into 3NF.
