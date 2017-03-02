ALTER TABLE developers
  ADD COLUMN salary INT;

SELECT *
FROM developers;

UPDATE developers
SET salary = 10000
WHERE ID = 1;
UPDATE developers
SET salary = 15000
WHERE ID = 2;
UPDATE developers
SET salary = 20000
WHERE ID = 3;
UPDATE developers
SET salary = 8000
WHERE ID = 4;
UPDATE developers
SET salary = 11000
WHERE ID = 5;
UPDATE developers
SET salary = 30000
WHERE ID = 6;
UPDATE developers
SET salary = 17000
WHERE ID = 7;