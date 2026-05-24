# Order Management System (Microservices Architecture)

Microservices-based Order Management System built using Spring Boot. It includes Customer, Product, and Order services with REST APIs and inter-service communication using Feign Client.

---

## 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Cloud OpenFeign
- MySQL
- Maven

---

## 🏗 Microservices

- Customer Service → Manages customer data
- Product Service → Manages product data
- Order Service → Handles orders and communicates with other services

---

## 🔗 Architecture Flow

Order Service  
   ↓  
Feign Clients  
   ↓  
Customer Service & Product Service  

---

## ✨ Features
- Microservices architecture
- REST API development
- CRUD operations
- Feign Client communication
- Modular service design

---

## 🚀 How to Run

1. Clone the repository
2. Start MySQL server
3. Run Customer Service
4. Run Product Service
5. Run Order Service

---

## 📡 API Endpoints

### Customer Service
- POST /customers
- GET /customers/{id}

### Product Service
- POST /products
- GET /products/{id}

### Order Service
- POST /orders
- GET /orders/{id}

---

## 👨‍💻 Author
Saud Shaik
Java Backend Developer (Fresher)
