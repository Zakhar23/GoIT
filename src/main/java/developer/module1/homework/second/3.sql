SELECT sum(developers.salary)
FROM developers_skills
  INNER JOIN skills ON developers_skills.ID_skill = skills.ID
  INNER JOIN developers ON developers_skills.ID_dev = developers.ID
WHERE skills.name = 'java';
