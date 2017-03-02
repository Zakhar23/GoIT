SELECT
  customers.NAME     AS 'customer',
  SUM(projects.cost) AS 'cost of project'
FROM customers_projects
  INNER JOIN customers ON customers_projects.ID_custom = customers.ID
  INNER JOIN projects ON customers_projects.ID_project = projects.ID
GROUP BY customers.NAME
ORDER BY SUM(projects.cost)
LIMIT 1
