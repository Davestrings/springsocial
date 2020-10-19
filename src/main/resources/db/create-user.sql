DROP USER IF EXISTS 'davestrings'@'localhost';
CREATE USER 'davestrings'@'localhost' IDENTIFIED BY 'fatunbi171761@';
GRANT ALL PRIVILEGES  ON socialdb.* TO 'davestrings'@'localhost';
FLUSH PRIVILEGES ;

DROP DATABASE IF EXISTS socialdb;
CREATE DATABASE socialdb;

-- // security, mysql, rest repositories, spring web, lombok,
