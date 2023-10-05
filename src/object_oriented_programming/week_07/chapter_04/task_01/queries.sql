DROP DATABASE IF EXISTS currencies;
CREATE DATABASE currencies;
USE currencies;

CREATE TABLE currency1 (
    ISO varchar(3) NOT NULL PRIMARY KEY,
    symbol VARCHAR(5) NOT NULL,
    rate DECIMAL(5, 2) NOT NULL
);

INSERT INTO currency1 (ISO, symbol, rate) VALUES
    ('USD', '$', 1.00),
    ('EUR', '€', 0.95),
    ('JPY', '¥', 149.74),
    ('GBP', '£', 0.83),
    ('CNY', '¥', 7.21),
    ('AUD', '$', 1.58),
    ('CAD', '$', 1.37),
    ('SEK', 'kr', 11.04);

DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'curPass123';
GRANT SELECT, INSERT, DELETE, UPDATE ON currencies.currency1 TO 'appuser'@'localhost';


-- Testing
SELECT * FROM currencies.currency1;
SELECT * FROM currencies.currency1 WHERE ISO = 'EUR';
SELECT COUNT(*) as total FROM currencies.currency1;
SELECT max(rate) as max_rate FROM currencies.currency1;