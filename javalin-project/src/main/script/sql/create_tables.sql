
DROP TABLE IF EXISTS users;
CREATE TABLE users (
    ID INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50)  NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(64) NOT NULL CHECK (CHAR_LENGTH(password) BETWEEN 6 AND 64),
    active BOOLEAN DEFAULT true,
    verified BOOLEAN DEFAULT false,
    created_at TIMESTAMP DEFAULT current_timestamp,
    UNIQUE KEY (email),
    PRIMARY KEY (ID)
);

