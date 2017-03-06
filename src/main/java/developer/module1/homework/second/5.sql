SELECT
  customers.NAME     AS 'customer'
FROM projects
  INNER JOIN customers ON projects.customer_id = customers.ID
GROUP BY customers.NAME
ORDER BY SUM(projects.cost)
LIMIT 1
