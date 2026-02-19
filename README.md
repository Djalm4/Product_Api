# Product API

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Status](https://img.shields.io/badge/Status-Completed-success)

RESTful API for product management built with Spring Boot and PostgreSQL.

---

## 📌 About the Project

This project is a backend application that provides CRUD operations for managing products.  
It was developed to practice REST architecture, Spring Boot, and relational database integration.

The API allows clients to create, read, update, and delete products stored in a PostgreSQL database.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## 🏗️ Architecture

The project follows a layered architecture:

- **Controller Layer** – Handles HTTP requests and responses
- **Service Layer** – Contains business logic
- **Repository Layer** – Handles database access using Spring Data JPA
- **Entity Layer** – Maps Java objects to database tables

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/products` | Retrieve all products |
| GET | `/products/{id}` | Retrieve a product by ID |
| POST | `/products` | Create a new product |
| PUT | `/products/{id}` | Update an existing product |
| DELETE | `/products/{id}` | Delete a product |

---

## 📥 Example JSON (POST /products)

```json
{
  "name": "Notebook",
  "description": "Gaming laptop",
  "quantity": 10,
  "value": 4500.00
}
```

---

## ⚙️ How to Run the Project

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/product-api.git
```

### 2️⃣ Configure the database

Update your `application.properties` file:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Run the application

```
./mvnw spring-boot:run
```

The API will be available at:

```
http://localhost:8080
```

---

## 🎯 Purpose

This project was created for learning and portfolio purposes, focusing on backend development and RESTful API best practices using Spring Boot.

---

## 👨‍💻 Author

Developed by Djalma Ponciano Rodrigues.
