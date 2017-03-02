CREATE TABLE developers (
  ID   INT         NOT NULL,
  NAME VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE skills (
  ID_dev INT         NOT NULL,
  skill  VARCHAR(30) NOT NULL,
  FOREIGN KEY (ID_dev) REFERENCES developers (ID)
);

CREATE TABLE projects (
  ID   INT         NOT NULL,
  name VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE developers_projects (
  ID_dev     INT NOT NULL,
  ID_project INT NOT NULL,
  FOREIGN KEY (ID_dev) REFERENCES developers (ID),
  FOREIGN KEY (ID_project) REFERENCES projects (ID)
);

CREATE TABLE companies (
  ID   INT         NOT NULL,
  NAME VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE developers_companies (
  ID_dev     INT NOT NULL,
  ID_company INT NOT NULL,
  FOREIGN KEY (ID_dev) REFERENCES developers (ID),
  FOREIGN KEY (ID_company) REFERENCES companies (ID)
);

CREATE TABLE customers (
  ID   INT         NOT NULL,
  NAME VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE customers_projects (
  ID_custom  INT NOT NULL,
  ID_project INT NOT NULL,
  FOREIGN KEY (ID_custom) REFERENCES customers (ID),
  FOREIGN KEY (ID_project) REFERENCES projects (ID)
);