CREATE DATABASE IF NOT EXISTS IAM;

USE IAM;

CREATE TABLE IF NOT EXISTS permission_categories (
    id bigint primary key,
    name varchar(255) not null UNIQUE,
    description text(255)
);