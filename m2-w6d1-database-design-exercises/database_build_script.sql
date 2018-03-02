CREATE database w6d1_database_design_exercises;

--DROP TABLE employee_project;
--DROP TABLE project;
--DROP TABLE employee;
--DROP TABLE department;


CREATE TABLE employee
(
    employeeId int not null,
    job_title varchar(35) not null,
    first_name varchar(35) not null,
    last_name varchar(35) not null,
    gender varchar(1) not null,
    birthdate date,
    hire_date date,
    departmentId int,

   constraint pk_employeeId PRIMARY KEY (employeeId),
   constraint chk_gender CHECK (gender IN( 'M', 'F')),
   CONSTRAINT chk_job_title CHECK (job_title IN ('Manager', 'Part Time', 'Full Time'))


);


CREATE TABLE department
(
    departmentId serial not null,
    name varchar(35) not null,
    startdate date,
    employee_Count int,
 

    constraint pk_departmentId PRIMARY KEY (departmentId)
 
);

ALTER TABLE employee ADD CONSTRAINT fk_department_id FOREIGN KEY (departmentId) REFERENCES department(departmentId);

CREATE TABLE project
(
    projectId serial not null,
    name varchar(35) not null,
    startdate date,
    employee_Count int,
    --employeeId int,
  
    
 

    CONSTRAINT pk_projectId PRIMARY KEY (projectId)
    --CONSTRAINT fk_employee_id FOREIGN KEY (employeeId) REFERENCES employee(employeeId)
 
);

CREATE TABLE employee_project (
      employee_id int not null,
      project_id int not null,
      
     
      CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employeeId),
      CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES project(projectId)
      
);

INSERT INTO department (departmentId, name, startdate, employee_Count) VALUES (1, 'Sales', '2001-12-01', 50);
INSERT INTO department (departmentId, name, startdate, employee_Count) VALUES (2, 'Accounting', '2005-01-21', 10);
INSERT INTO department (departmentId, name, startdate, employee_Count) VALUES (3, 'Marketing', '2011-07-01', 25);

INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (1, 'Manager', 'John', 'Smith', 'M', '1978-1-18', '2005-01-17', 1);
INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (2, 'Manager', 'Dominic', 'Toretto', 'F', '1978-5-18', '2005-01-17', 1);
INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (3, 'Part Time', 'Brian', 'Conner', 'M', '1982-8-08', '2004-01-18', 2);
INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (4, 'Part Time', 'Gisele', 'Gadot', 'F', '1987-1-18', '2011-01-17', 2);
INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (5, 'Full Time', 'Roman', 'Gibson', 'M', '1992-8-15', '2016-05-17', 2);
INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (6, 'Full Time', 'Hobbs', 'Johnson', 'M', '1975-5-12', '2011-01-17', 3);
INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (7, 'Full Time', 'Mia', 'Brewster', 'F', '1995-12-11', '2011-01-17', 3);
INSERT INTO employee (employeeId, job_title, first_name, last_name, gender, birthdate, hire_date, departmentId) VALUES (8, 'Full Time', 'Gisele', 'Gadot', 'F', '1987-11-12', '2015-01-17', 3);

INSERT INTO project (projectId, name, startdate, employee_count) VALUES (1, 'Dynamo', '1940-05-27', 5);
INSERT INTO project (projectId, name, startdate, employee_count) VALUES (2, 'Sea Lion', '1940-09-15', 10);
INSERT INTO project (projectId, name, startdate, employee_count) VALUES (3, 'Overlord', '1944-06-06', 3);

INSERT INTO employee_project(employee_id, project_id) VALUES (1, 2);
INSERT INTO employee_project(employee_id, project_id) VALUES (2, 2);
INSERT INTO employee_project(employee_id, project_id) VALUES (3, 1);
INSERT INTO employee_project(employee_id, project_id) VALUES (4, 1);
INSERT INTO employee_project(employee_id, project_id) VALUES (5, 1);
INSERT INTO employee_project(employee_id, project_id) VALUES (6, 3);
INSERT INTO employee_project(employee_id, project_id) VALUES (7, 3);
INSERT INTO employee_project(employee_id, project_id) VALUES (8, 3);

