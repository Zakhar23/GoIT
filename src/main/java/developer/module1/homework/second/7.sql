/*
какая компания больше всего выплачивает зп разработчикам
 */

SELECT
  companies.name         AS 'company',
  SUM(developers.salary) AS 'salary sum'
FROM developers_companies
  INNER JOIN developers ON developers_companies.ID_dev = developers.ID
  INNER JOIN companies ON developers_companies.ID_company = companies.ID
GROUP BY companies.name
ORDER BY SUM(developers.salary) DESC
LIMIT 1