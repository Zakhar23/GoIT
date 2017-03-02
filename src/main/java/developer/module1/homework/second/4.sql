ALTER TABLE projects
  ADD COLUMN cost INT;

SELECT *
FROM projects;

UPDATE projects
SET cost = 15
WHERE ID = 1;
UPDATE projects
SET cost = 30
WHERE ID = 2;
UPDATE projects
SET cost = 8
WHERE ID = 3;
UPDATE projects
SET cost = 13
WHERE ID = 4;
UPDATE projects
SET cost = 23
WHERE ID = 5;
