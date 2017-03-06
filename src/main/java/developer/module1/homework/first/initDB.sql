CREATE TABLE skills (
  ID   INT         NOT NULL,
  name VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE companies (
  ID   INT         NOT NULL,
  NAME VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE customers (
  ID   INT         NOT NULL,
  NAME VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE projects (
  ID          INT         NOT NULL,
  name        VARCHAR(30) NOT NULL,
  customer_id INT         NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (customer_id) REFERENCES customers (ID)
);

CREATE TABLE developers (
  ID         INT         NOT NULL,
  NAME       VARCHAR(30) NOT NULL,
  project_id INT         NOT NULL,
  company_id INT         NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (project_id) REFERENCES projects (ID),
  FOREIGN KEY (company_id) REFERENCES companies (ID)
);

CREATE TABLE developers_skills (
  ID_dev   INT NOT NULL,
  ID_skill INT NOT NULL,
  FOREIGN KEY (ID_dev) REFERENCES developers (ID),
  FOREIGN KEY (ID_skill) REFERENCES skills (ID)
);

/*
CREATE TABLE developers_projects (
  ID_dev     INT NOT NULL,
  ID_project INT NOT NULL,
  FOREIGN KEY (ID_dev) REFERENCES developers (ID),
  FOREIGN KEY (ID_project) REFERENCES projects (ID)
);

CREATE TABLE developers_companies (
  ID_dev     INT NOT NULL,
  ID_company INT NOT NULL,
  FOREIGN KEY (ID_dev) REFERENCES developers (ID),
  FOREIGN KEY (ID_company) REFERENCES companies (ID)
);
*/

/*
CREATE TABLE customers_projects (
  ID_custom  INT NOT NULL,
  ID_project INT NOT NULL,
  FOREIGN KEY (ID_custom) REFERENCES customers (ID),
  FOREIGN KEY (ID_project) REFERENCES projects (ID)
);
*/
