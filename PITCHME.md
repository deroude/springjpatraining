# JPA on Spring Boot Startup

### Presented for LINK

---

## Goals

- Create a Spring JPA / MySQL web enabled application
    - Use Spring Boot IoC
    - Connect to a MySQL DB
    - Use JPA Domain classes
    - Use Spring JPA repositories
    - Expose a simple HAL service for accessing data
- Become familiar with Java Persistence technologies:
    - JPA Domain / relationship modeling
    - Repositories
    - DB access

---

## Prerequisites

- Java 8
    - JDK
    - IDE
    - Maven
- Docker

---

## Start

- Navigate to the [Spring Boot Initializr resource](https://start.spring.io/)
- Select `JPA, Web, MySQL, DevTools, Rest Repositories`
- Download the `zip` file and unpack it
- `mvn clean install`
- `mvn spring-boot:run`

Yup, that simple. Now point your browser to `http//localhost:8080/`.

---?code=pom.xml&lang=xml&title=pom.xml

@[14-19](Spring parent dependency)
@[27-56](Dependencies selected from Initializr)

---?code=docker-compose.yml&lang=yaml&title=docker-compose.yml

@[4](MySQL image)
@[6-12](MySQL service configuration)

---?code=src/main/resources/application.yml&lang=yaml&title=application.yaml

@[13-18](MySQL connection)
@[2-12](JPA Provider configuration)

