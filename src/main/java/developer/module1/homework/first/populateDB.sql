INSERT INTO skills (ID, name)
VALUES
  (1, 'java'),
  (2, 'python'),
  (3, '1C'),
  (4, 'C++');

SELECT *
FROM skills;

INSERT INTO companies (ID, NAME)
VALUES
  (1, 'luxoft'),
  (2, 'EPAM'),
  (3, 'GlobalLogic');

SELECT *
FROM companies;

INSERT INTO customers
VALUES
  (1, 'Bodo'),
  (2, 'NP'),
  (3, 'Voenkom'),
  (4, 'Salmo'),
  (5, 'ErpLab');

SELECT *
FROM customers;

INSERT INTO projects (ID, name, customer_id)
VALUES
  (1, 'project_Bodo', 1),
  (2, 'project_NP', 2),
  (3, 'project_Voenkom', 3),
  (4, 'project_Salmo', 4),
  (5, 'project_ErpLab', 5);

SELECT *
FROM projects;

INSERT INTO developers (ID, NAME, project_id, company_id)
VALUES
  (1, 'Petro', 1, 1),
  (2, 'Vania', 2, 2),
  (3, 'Don', 3, 3),
  (4, 'Ban', 4, 1),
  (5, 'Alex', 5, 2),
  (6, 'Chack', 1, 3),
  (7, 'Sam', 3, 1);

SELECT *
FROM developers;

INSERT INTO developers_skills (ID_dev, ID_skill)
VALUES
  (1, 1),
  (1, 2),
  (2, 3),
  (3, 3),
  (3, 4),
  (4, 1),
  (4, 2),
  (4, 3),
  (5, 4),
  (6, 1),
  (7, 1);

SELECT *
FROM developers_skills;

DELETE FROM developers_skills;

