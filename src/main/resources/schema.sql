CREATE TABLE IF NOT EXISTS task(
    id INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(150) NOT NULL,
    status BOOLEAN NOT NULL,
    email VARCHAR(200) NOT NULL
);