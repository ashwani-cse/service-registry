# Eureka Server Registry

This project serves as a Eureka Server, facilitating service discovery and registration within a microservices architecture.

## Overview

Eureka Server, a core component of Netflix's Eureka, enables microservices to dynamically locate and communicate with each other without hardcoded network locations. With Eureka, services can register themselves and discover others within the same ecosystem seamlessly.

## Configuration

The Eureka Server registry is configured via the `application.yml` file. Key configurations include defining the server port as 8088.

## Code Structure

The main class, `EurekServerRegistryApplication`, acts as the entry point for the application, responsible for bootstrapping the Spring application context. Annotated with `@EnableEurekaServer` and `@SpringBootApplication`, it enables Eureka Server functionality and Spring Boot auto-configuration.

Additionally, the project provides two endpoints:

1. **GET /service-instances/{applicationName}**: Retrieves service instances registered under a specific application name.
2. **GET /services**: Retrieves a list of all registered services.

## Endpoints

### Retrieve Service Instances by Application Name

- **URL**: `/service-instances/{applicationName}`
- **Method**: GET
- **Description**: Retrieves service instances for a specific application.
- **Parameters**: `applicationName`

### Retrieve Registered Services

- **URL**: `/services`
- **Method**: GET
- **Description**: Retrieves all registered services.

## Eureka Server Start

The Eureka Server starts on: [http://localhost:8088](http://localhost:8088)

## Stay Connected

Connect with us on social media and stay updated with the latest news and developments:

- [LinkedIn](https://www.linkedin.com/in/ashwanicse/)
- [Leetcode](https://leetcode.com/ashwani__kumar/)
- [Need Help? Schedule A Call](https://topmate.io/ashwanikumar)

## Subscribe to our Newsletter
Stay ahead of the curve by subscribing to our LinkedIn newsletter:
- [Subscribe Now](https://www.linkedin.com/newsletters/7084124970443767808/)

Experience the future of e-commerce with CommerceNexus - where innovation meets efficiency!
