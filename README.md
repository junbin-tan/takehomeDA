# Spring Boot RESTful API for Task Management

This project provides a simple RESTful API for managing tasks using Spring Boot, Spring Data JPA and MySQL for Doctor Anywhere Takehome

## Features

- CRUD operations for tasks.
- Persistence using MySQL.


## Usage


Configure MySQL:
- Ensure you have MySQL running and create a new database for the project. Update the application.properties with your database connection details:
```java
spring.datasource.url=jdbc:mysql://localhost:3306/yourdbname
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
```

Build and Run:
```java
gradlew clean build
gradlew bootRun
```

## API Endpoints

The server will start on port 8080 by default. You can access the API at 
- http://localhost:8080/tasks

API Endpoints
- GET /tasks - Retrieve all tasks.
- POST /tasks - Create a new task.
- GET /tasks/{id} - Retrieve a task by its ID.
- PUT /tasks/{id} - Update a task by its ID.
- DELETE /tasks/{id} - Delete a task by its ID.

