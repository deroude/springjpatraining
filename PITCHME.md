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

---

## Prerequisites (Software)

- Java 8
    - JDK
    - IDE
    - Maven
- Docker

---

## Prerequisites (Knowledge)

- __Java 8__
- Maven
- __MySQL__ (or any Relation DB)
- Docker

---

## Use Case (1)

Our application needs to exchange data with a repository (in our case MySQL)

- Steps
    - Connect to the DB using a driver
    - Perform queries to access data according to the business logic
    - Translate the objects and relations manipulated between Java and the DB

## Use Case (2)

- Nice to have
    - Cache frequent hits on the same data
    - Break dependency on a single DB engine / language
    - Control the DB definition from a single point

---

## Object-Relational Mapping  (ORM)

- What does it map?
    - Tables to Objects
    - Fields to Attributes
    - Relations between Tables (Foreign Keys) to Class Relations (e.g. Composition)
    - Cursors to Iterators / Collections
    
---

## Object-Relational Mapping  (ORM)

- How does it help?
    - Generate queries / enforce constraints
    - Enforce constraints
    - Session / Transaction

---

## Concepts

- Entity: Java representation of a Table
- Id: Marks a Primary Key field
- Basic: Java representation of a non-relationship Field
- OneToMany, ManyToOne, ManyToMany: Java representation of FK relations

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
