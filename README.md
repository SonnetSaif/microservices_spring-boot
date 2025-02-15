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
- **PostgreSQL** or any preferred relational database

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

