
DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
    ID SERIAL PRIMARY KEY,
    first_name VARCHAR(50) UNIQUE NOT NULL,
    last_name VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(64) NOT NULL CHECK (CHAR_LENGTH(password) BETWEEN 6 AND 64),
    active BOOLEAN DEFAULT true,
    verified BOOLEAN DEFAULT false,
    created_at TIMESTAMP DEFAULT current_timestamp
);

