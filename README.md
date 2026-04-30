# Distributed Notification Service

## Overview
A Spring Boot-based distributed notification service that supports sending notifications via multiple channels.

## Tech Stack
- Java
- Spring Boot
- Kafka (planned)
- Redis (planned)
- PostgreSQL

## Features
- REST API for sending notifications
- Scalable architecture (event-driven - in progress)
- Retry and fault tolerance (planned)

## API Endpoints
### Send Notification
POST /notifications

## How to Run
1. Clone repo
2. Run:
   mvn spring-boot:run

## Future Enhancements
- Kafka integration
- Redis rate limiting
- Dead Letter Queue (DLQ)
- Circuit Breaker (Resilience4j)
