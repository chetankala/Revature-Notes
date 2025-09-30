-- First Normal Form (1NF): is a conclusive form of a relational database.
-- If we are to consider a database relational, then all relations in the database are in 1NF

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