# Expense Tracker Application

This project is a simple Expense Tracker application developed using Spring Boot for the M604 Advanced Programming module.

## Project Overview
The purpose of this project is to manage daily expenses using basic CRUD operations. The application allows users to create, retrieve, update, and delete expense records through RESTful API endpoints.

## Features
- Add a new expense
- View all expenses
- Update an existing expense
- Delete an expense
- Data stored using H2 in-memory database
- Basic error handling using a global exception handler

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman

## Project Structure
- controller – handles API requests
- service – contains business logic
- repository – interacts with the database
- model – defines the Expense entity
- exception – handles application errors
- resources – contains configuration files

## API Endpoints
- GET /expenses – retrieve all expenses
- POST /expenses – create a new expense
- PUT /expenses/{id} – update an expense
- DELETE /expenses/{id} – delete an expense

## Running the Application
1. Open the project in VS Code or any Java IDE.
2. Run the application using:
   ./mvnw spring-boot:run
3. The application runs on:
   http://localhost:8081

## H2 Database Console
The H2 console can be accessed at:
http://localhost:8081/h2-console

Use the following settings:
- JDBC URL: jdbc:h2:mem:taskdb
- Username: sa
- Password: (leave empty)

## Testing
The API endpoints were tested using Postman.

## Future Improvements
- Add a frontend interface
- Add user authentication
- Add filtering and search features
