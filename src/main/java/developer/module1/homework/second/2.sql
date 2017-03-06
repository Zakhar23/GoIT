SELECT
  projects.name as 'project name',
  sum(developers.salary) as 'cost'
FROM developers
  LEFT JOIN projects ON developers.project_id = projects.ID
GROUP BY projects.name
ORDER BY SUM(developers.salary) DESC
LIMIT 1
