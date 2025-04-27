# Introduction to Spring Framework

The **Spring Framework** is a powerful, lightweight, and widely-used framework for building Java applications. It provides comprehensive infrastructure support for developing Java applications quickly and efficiently.

Originally created to simplify Java EE development, Spring has evolved into a full ecosystem, offering solutions for web applications, microservices, cloud applications, and more.

---

# Overview

- **Lightweight and Modular**: Spring allows developers to pick and choose the parts they need without requiring the entire framework.
- **Inversion of Control (IoC)**: Spring manages object creation and wiring, making code loosely coupled and easier to maintain.
- **Aspect-Oriented Programming (AOP)**: Supports separating cross-cutting concerns like logging, security, and transaction management.
- **Transaction Management**: Provides a consistent programming model for transactions across different underlying transaction technologies.
- **Spring MVC**: A web framework built on the core Spring principles.
- **Spring Boot**: An extension of Spring that simplifies setting up, configuring, and deploying applications with minimal boilerplate.

---

# Core Concepts

## 1. Inversion of Control (IoC) and Dependency Injection (DI)

- **IoC** means the control of object creation and management is transferred from the program to the Spring container.
- **Dependency Injection** is the technique where objects are provided their dependencies rather than creating them directly.

Example:
```java
@Component
public class Car {
    private final Engine engine;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }
}
```

Here, `Engine` is automatically injected into `Car` by Spring.

---

## 2. Bean and ApplicationContext

- A **Bean** is an object managed by the Spring container.
- **ApplicationContext** is the central interface for accessing the Spring container.

Example:
```java
ApplicationContext context = 
    new AnnotationConfigApplicationContext(AppConfig.class);

Car car = context.getBean(Car.class);
```

---

## 3. Aspect-Oriented Programming (AOP)

- AOP helps modularize cross-cutting concerns (like logging or transactions).
- Common terms:
  - **Aspect**: A module that encapsulates cross-cutting concerns.
  - **Advice**: Action taken at a particular join point.
  - **Join Point**: Point in the program execution (e.g., method call).

Example:
```java
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore() {
        System.out.println("Logging before method execution...");
    }
}
```

---

## 4. Spring MVC

- A request-driven web framework.
- Core components:
  - **DispatcherServlet**: Front controller.
  - **Controller**: Handles web requests.
  - **ViewResolver**: Maps views to the output.

Example:
```java
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home"; // View name
    }
}
```

---

## 5. Spring Boot

- Built on top of Spring Framework.
- Provides:
  - Auto-configuration
  - Embedded servers (Tomcat, Jetty)
  - Production-ready features (health checks, metrics)

Quick start with Spring Boot:
```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

---

# Summary

Spring is the foundation for modern Java application development.  
By mastering its core concepts—IoC, DI, AOP, and MVC—you can build scalable, maintainable, and production-ready applications efficiently.