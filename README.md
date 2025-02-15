# Microservices with Spring Boot

This repository contains a sample implementation of a microservices architecture using Spring Boot.

## Table of Contents

- [Overview](#overview)
- [Services](#services)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Running the Services](#running-the-services)
- [API Gateway](#api-gateway)
- [Service Communication](#service-communication)
- [Database Configuration](#database-configuration)
- [Monitoring and Logging](#monitoring-and-logging)
- [Contributing](#contributing)
- [License](#license)

## Overview

In a microservices architecture, an application is composed of multiple loosely coupled services. Each service is:

- **Independent**: Developed, deployed, and scaled independently.
- **Domain-Specific**: Focused on a specific business capability.
- **Communicative**: Interacts with other services through well-defined APIs.

This project showcases such an architecture using Spring Boot, including inter-service communication, API Gateway setup, and more.

## Services

The project comprises the following services:

1. **API Gateway**: Acts as an entry point for all client requests.
2. **Product Service**: Manages product-related operations.
3. **Order Service**: Handles order processing and management.
4. **Inventory Service**: Manages inventory and stock information.

Each service is a standalone Spring Boot application located in its respective directory:

- `api-gateway/`
- `product-service/`
- `order-service/`
- `inventory-service/`

## Prerequisites

- **Java 11** or higher
- **Maven 3.6** or higher
- **Docker** (for containerization, optional)
- **PostgreSQL, MYSQL** or any preferred relational database

## Getting Started

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/SonnetSaif/microservices_spring-boot.git
   cd microservices_spring-boot

2. **Build the Services**

   ```bash
   cd api-gateway
   mvn clean install

3. **Configure Databases**

   Ensure that your database instances are running and accessible. Update the application.properties and docker-compose.yml files in each service to point to your database instances.


## Running the Services

You can run each service individually using Maven:

```bash
mvn spring-boot:run
```

Alternatively, if you have Docker installed, you can build Docker images and run the services as containers. Ensure you have a `Dockerfile` in each service directory.

## API Gateway

The API Gateway serves as a single entry point for all client interactions. It routes requests to the appropriate service based on the URL patterns. This project uses Spring Cloud Gateway for this purpose.

## Service Communication

Services communicate with each other using RESTful APIs. For example, the Order Service may call the Product Service to fetch product details. This inter-service communication is facilitated using tools like `RestTemplate` or `FeignClient`.

## Database Configuration

Each service has its own database schema, promoting loose coupling and service autonomy. Ensure that the database configurations in each service's `application.properties` or `application.yml` are set correctly.

## Monitoring and Logging

Monitoring and logging are crucial in a microservices architecture. This project integrates Spring Boot Actuator for monitoring and uses SLF4J with Logback for logging. You can access health checks and metrics at endpoints like `/actuator/health`.

## Contributing

Contributions are welcome! If you have suggestions or improvements, feel free to open an issue or submit a pull request.
