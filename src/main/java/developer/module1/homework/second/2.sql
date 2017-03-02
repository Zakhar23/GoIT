SELECT
  projects.name          AS 'projects',
  SUM(developers.salary) AS 'salary sum'
FROM developers_projects
  INNER JOIN developers ON developers_projects.ID_dev = developers.ID
  INNER JOIN projects ON developers_projects.ID_project = projects.ID
GROUP BY projects.name
ORDER BY SUM(developers.salary) DESC
LIMIT 1