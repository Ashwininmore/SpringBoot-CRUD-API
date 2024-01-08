# Task management system - Spring boot, MySQL,REST API, Postman.

A simple Web-based Task Management System using Spring boot that demonstrates the usage of RESTful API using Spring boot, Hibernate and MySQL. 

## Tools and Technologies used

* Java 1.8
* Spring boot 2.1.1
* MySQL
* JPA
* Hibernate
* Maven
* Eclipse Oxygen
* Postman 

## Steps to install

**1. Clone the application**

```bash
git clone https://github.com/Ashwininmore/SpringBoot-CRUD-API.git
```

**2. Create MySQL database**

```sql
CREATE DATABASE crudapi
```
	
**3. Create table or Run the SQL script file**

```sql
CREATE TABLE tbl_task
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    	title VARCHAR(255),
    	activity VARCHAR(255)
)
```
	
**4. Change MySQL Username and Password as per your MySQL Installation**
	
+ open `src/main/resources/application.properties` file.

+ change `spring.datasource.username` and `spring.datasource.password` as per your installation
	
**5. Run the app**

You can run the spring boot app by typing the following command -

```bash
mvn spring-boot:run
```

You can also package the application in the form of a `jar` file and then run it like so -

```bash
mvn package
java -jar target/crudapi-0.0.1-SNAPSHOT.jar
```

The server will start on port 8080.
	
## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/task
    
    POST /api/task
    
    GET /api/task/{id}
    
    PUT /api/task
    
    DELETE /api/task/{id}

You can test them using postman or any other rest client.

## Working System

[![img4](https://github.com/Ashwininmore/SpringBoot-CRUD-API/assets/69009147/608b01bd-1518-4bce-9ee5-e847cc6c4c46)
![img3](https://github.com/Ashwininmore/SpringBoot-CRUD-API/assets/69009147/f787e267-faa2-4129-a282-cf3756129548)
![img2](https://github.com/Ashwininmore/SpringBoot-CRUD-API/assets/69009147/09b36cbd-ad72-448c-8d8a-238c801f4181)
![img1](https://github.com/Ashwininmore/SpringBoot-CRUD-API/assets/69009147/cb18e5bf-e4d6-4812-9f74-1bc25a31e16d)
](https://github.com/Ashwininmore/SpringBoot-CRUD-API)
