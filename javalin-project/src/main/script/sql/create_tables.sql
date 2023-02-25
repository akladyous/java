
CREATE TABLE IF NOT EXISTS users (
    ID INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50)  NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(64) NOT NULL,
    active BOOLEAN DEFAULT true,
    verified BOOLEAN DEFAULT false,
    created_at TIMESTAMP DEFAULT current_timestamp(),
    CONSTRAINT password_length_between_6_and_32 CHECK (CHAR_LENGTH(password) BETWEEN 6 AND 32),
    UNIQUE KEY (email),
    PRIMARY KEY (ID)
);
