# RideServe-Backend-for-Ride-Hailing-Application

A ride-hailing backend system built using Spring Boot, demonstrating core features such as trip requests, driver assignment, real-time status updates, and service-oriented architecture. Designed with scalability and modularity in mind.
### Overview

This project serves as the backend for a ride-hailing platform (like Uber or Ola), focusing on:
	•	Clean REST API design
	•	Microservice-like modular code structure
	•	Realistic domain modeling (Users, Drivers, Rides, Payments, etc.)
	•	Integration with external services (e.g., Maps, Notifications – optional)
	•	Extensible architecture for future frontend or mobile integration

⸻

### Tech Stack

Language - Java 17+
Framework -	Spring Boot, Spring MVC, Spring Data JPA
Database -	PostgreSQL 
API Spec -	Swagger / OpenAPI
Auth -	JWT / OAuth2 (if applicable)
Others -	Lombok, MapStruct, ModelMapper, etc.


⸻

### Features
	•	✅ User & Driver Registration/Login
	•	✅ Ride Request Creation
	•	✅ Driver Matching (Manual / Auto-assignment)
	•	✅ Ride Status Updates (Requested → Accepted → Completed)
	•	✅ In-Memory or Persistent Ride History
	•	⏳ (Planned) Payment Module
	•	⏳ (Planned) Notification System
	•	⏳ (Planned) Real-time Location (via WebSocket or external service)

⸻

📁 Project Structure

src/
├── controller       # REST Controllers
├── service          # Business Logic Layer
├── model            # Entities & DTOs
├── repository       # Spring Data Repos
├── config           # App Config, Security
├── exception        # Custom Exceptions & Handlers
└── util             # Utilities, Mappers


⸻

🧪 API Endpoints

Swagger is available at:

http://localhost:8080/swagger-ui/

Sample APIs
	•	POST /api/users/register – Register user
	•	POST /api/drivers/register – Register driver
	•	POST /api/rides/request – Create a new ride request
	•	PUT /api/rides/{id}/status – Update ride status

⸻

## 🧠 System Design

To ensure scalability and clean architecture, this backend system is modeled using proper UML and functional flow diagrams.

### UML Class Diagram

This diagram outlines the key domain entities and their relationships, including `User`, `Driver`, `Ride`, and their interactions.

![UML Diagram](docs/uml-class-diagram.png)

### Data Flow / Functional Flow Diagram

Illustrates how data moves through the system — from ride request to driver assignment to ride completion.

![DFT Diagram](docs/data-flow-diagram.png)

These diagrams help visualize the backend workflow, promoting better maintenance and extensibility.

<!--
⚙️ Getting Started
	1.	Clone the repo

git clone https://github.com/yourusername/rideserve.git
cd rideserve


	2.	Update DB config in application.yml

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/rideservice
    username: youruser
    password: yourpass


	3.	Run the app

./mvnw spring-boot:run


	4.	Access Swagger UI

http://localhost:8080/swagger-ui/



⸻

✅ In Progress / Roadmap
	•	User and Driver APIs
	•	Ride creation and status flow
	•	Payment system (integrate Stripe / mock)
	•	Real-time location via WebSocket
	•	Notification system (email / SMS / push)
	•	Dockerized deployment
	•	Unit & Integration Tests
-->
