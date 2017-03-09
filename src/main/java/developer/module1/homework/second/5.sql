CREATE TEMPORARY TABLE companies_projectCost
  SELECT
    companies.NAME     AS 'comp_name',
    min(projects.cost) AS 'proj_cost'

  FROM developers
    LEFT JOIN companies ON developers.company_id = companies.ID
    LEFT JOIN projects ON developers.project_id = projects.ID
    LEFT JOIN customers ON projects.customer_id = customers.ID
  GROUP BY companies.NAME;

SELECT
  cp.comp_name   AS 'Company',
  cp.proj_cost   AS 'Cost',
  customers.NAME AS 'Customer'
FROM companies_projectCost cp
  LEFT JOIN projects ON cp.proj_cost = projects.cost
  LEFT JOIN customers ON projects.customer_id = customers.ID

