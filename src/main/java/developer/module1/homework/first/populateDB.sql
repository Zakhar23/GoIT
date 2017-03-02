INSERT INTO developers VALUES (1, 'Petro');
INSERT INTO developers VALUES (2, 'Vania');
INSERT INTO developers VALUES (3, 'Don');
INSERT INTO developers VALUES (4, 'Ban');
INSERT INTO developers VALUES (5, 'Alex');
INSERT INTO developers VALUES (6, 'Chack');
INSERT INTO developers VALUES (7, 'Sam');

SELECT *
FROM developers;

INSERT INTO skills VALUES (1, 'java');
INSERT INTO skills VALUES (2, 'java');
INSERT INTO skills VALUES (2, 'python');
INSERT INTO skills VALUES (3, '1C');
INSERT INTO skills VALUES (3, 'python');
INSERT INTO skills VALUES (3, 'java');
INSERT INTO skills VALUES (4, 'java');
INSERT INTO skills VALUES (4, '1C');
INSERT INTO skills VALUES (5, 'C++');
INSERT INTO skills VALUES (6, 'java');
INSERT INTO skills VALUES (7, 'java');
INSERT INTO skills VALUES (7, 'C++');

SELECT *
FROM skills;

INSERT INTO projects VALUES (1, 'project_Bodo');
INSERT INTO projects VALUES (2, 'project_NP');
INSERT INTO projects VALUES (3, 'project_Voenkom');
INSERT INTO projects VALUES (4, 'project_Salmo');
INSERT INTO projects VALUES (5, 'project_ErpLab');

SELECT *
FROM projects;

INSERT INTO developers_projects VALUES (1, 1);
INSERT INTO developers_projects VALUES (2, 1);
INSERT INTO developers_projects VALUES (2, 2);
INSERT INTO developers_projects VALUES (3, 1);
INSERT INTO developers_projects VALUES (3, 3);
INSERT INTO developers_projects VALUES (4, 1);
INSERT INTO developers_projects VALUES (4, 4);
INSERT INTO developers_projects VALUES (5, 1);
INSERT INTO developers_projects VALUES (5, 5);
INSERT INTO developers_projects VALUES (6, 1);
INSERT INTO developers_projects VALUES (6, 5);
INSERT INTO developers_projects VALUES (7, 1);
INSERT INTO developers_projects VALUES (7, 2);
INSERT INTO developers_projects VALUES (7, 3);

SELECT *
FROM developers_projects;
DELETE FROM developers_projects;

INSERT INTO companies VALUES (1, 'luxoft');
INSERT INTO companies VALUES (2, 'EPAM');
INSERT INTO companies VALUES (3, 'GlobalLogic');

SELECT *
FROM companies;

INSERT INTO developers_companies VALUES (1, 1);
INSERT INTO developers_companies VALUES (2, 1);
INSERT INTO developers_companies VALUES (3, 2);
INSERT INTO developers_companies VALUES (4, 2);
INSERT INTO developers_companies VALUES (5, 3);
INSERT INTO developers_companies VALUES (6, 3);
INSERT INTO developers_companies VALUES (7, 3);

SELECT *
FROM developers_companies;

INSERT INTO customers VALUES (1, 'Bodo');
INSERT INTO customers VALUES (2, 'NP');
INSERT INTO customers VALUES (3, 'Voenkom');
INSERT INTO customers VALUES (4, 'Salmo');
INSERT INTO customers VALUES (5, 'ErpLab');

SELECT *
FROM customers;

INSERT INTO customers_projects VALUES (1, 1);
INSERT INTO customers_projects VALUES (1, 2);
INSERT INTO customers_projects VALUES (2, 2);
INSERT INTO customers_projects VALUES (2, 5);
INSERT INTO customers_projects VALUES (3, 3);
INSERT INTO customers_projects VALUES (4, 4);
INSERT INTO customers_projects VALUES (5, 5);
INSERT INTO customers_projects VALUES (5, 2);

SELECT *
FROM customers_projects;
DELETE FROM customers_projects;