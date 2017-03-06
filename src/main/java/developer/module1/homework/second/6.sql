SELECT
  projects.name,
  AVG(developers.salary)
FROM developers
  LEFT JOIN projects ON developers.project_id = projects.ID

WHERE project_id = (SELECT ID
                    FROM projects
                    ORDER BY cost
                    LIMIT 1)
GROUP BY projects.name







