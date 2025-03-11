# TwitterFlow
## Microservices Architecture Project
This project is a microservices architecture built with Java 17, Spring Boot, Kafka, ElasticSearch, and Docker. It streams data from Twitter, processes it via Kafka, stores it in ElasticSearch and PostgreSQL, and exposes query services via REST APIs.



## Overview
This project is a microservices architecture built with Java 11, Spring Boot, Kafka, ElasticSearch, and Docker. It streams data from Twitter, processes it via Kafka, stores it in ElasticSearch and PostgreSQL, and exposes query services via REST APIs.

## Key Technologies
- **Java 11**
- **Spring Boot**
- **Kafka** (for streaming data)
- **ElasticSearch** (for data indexing and querying)
- **PostgreSQL** (for relational data storage)
- **Docker & Docker Compose** (for containerization)
- **Keycloak** (for authentication and authorization)
- **Prometheus & Grafana** (for monitoring)
- **ELK Stack** (for log aggregation)
- **Eureka & Spring Cloud Gateway** (for service discovery and API gateway)

## Architecture Diagram
![project_architecture](https://github.com/user-attachments/assets/100322bd-13f9-4dfa-8069-15e37cb976fb)


## Microservices Overview
1. **Twitter to Kafka Service**
   - Streams real-time data from Twitter using Twitter4J.
   - Publishes data to Kafka topics.

2. **Kafka to ElasticSearch Service**
   - Consumes Kafka data and indexes it into ElasticSearch.

3. **Elastic Query Service**
   - Provides REST APIs to query data from ElasticSearch.

4. **Kafka Streams Service**
   - Processes streaming data and publishes results to a new Kafka topic.

5. **Analytics Service**
   - Consumes processed data and stores it in PostgreSQL.

6. **Elastic Query Web Client**
   - A simple front-end for querying data.

## Getting Started
### Prerequisites
- Java 11
- Docker & Docker Compose
- Maven

### Running Services
1. **Start Dependencies**
```bash
docker-compose up -d
```

2. **Build and Run Services**
```bash
mvn clean install
java -jar target/<service-name>.jar
```

### Access Services
- **Kafka UI**: `http://localhost:9000`
- **ElasticSearch**: `http://localhost:9200`
- **Grafana**: `http://localhost:3000`

## Security
- Authentication and authorization are managed via Keycloak using OAuth2 and OpenID Connect.

## Monitoring & Logging
- Metrics are captured using Prometheus and visualized in Grafana.
- Logs are aggregated using ELK Stack (ElasticSearch, Logstash, Kibana).

## API Documentation
- Swagger UI available at: `http://localhost:<port>/swagger-ui/index.html`
