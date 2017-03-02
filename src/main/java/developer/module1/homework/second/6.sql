SELECT
  projects.name,
  AVG(developers.salary)
FROM developers_projects
  LEFT JOIN developers ON developers_projects.ID_dev = developers.ID
  LEFT JOIN projects ON developers_projects.ID_project = projects.ID

WHERE ID_project = (SELECT ID
                    FROM projects
                    ORDER BY cost
                    LIMIT 1)
GROUP BY projects.name




