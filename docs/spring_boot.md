# Spring Boot Basics

## What is Spring Boot?

**Spring Boot** is a framework built on top of the traditional **Spring Framework** that simplifies the process of building production-grade Spring applications.

It removes much of the boilerplate configuration required by Spring, allowing developers to start working on business logic faster.

---

## Key Features of Spring Boot

- **Auto-Configuration**  
  Spring Boot automatically configures your application based on the libraries on the classpath.  
  (e.g., If you have `spring-boot-starter-web`, it sets up Tomcat and Spring MVC automatically.)

- **Standalone Applications**  
  You can create applications that run directly without deploying to external servers.  
  (It embeds Tomcat, Jetty, or Undertow.)

- **Opinionated Defaults**  
  Spring Boot provides default configurations that follow best practices, so you don't have to make every decision from scratch.

- **Minimal Setup**  
  No need for complex XML configurations — you can use simple Java annotations.

- **Production-Ready Features**  
  Built-in metrics, health checks, and externalized configuration make it easier to move to production.

- **Starter Dependencies**  
  Convenient "starter" packages group common dependencies for typical use cases.  
  Example: `spring-boot-starter-data-jpa`, `spring-boot-starter-security`, etc.

---

## A Simple Example

A basic Spring Boot application:

```java
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
```

- `@SpringBootApplication` is a combination of:
  - `@Configuration`
  - `@EnableAutoConfiguration`
  - `@ComponentScan`

This annotation marks the main class of a Spring Boot application.

---

## How Spring Boot is Different from Traditional Spring

| Traditional Spring | Spring Boot |
| :------------------ | :---------- |
| Requires extensive configuration | Minimal or no configuration needed |
| Separate server deployment | Embedded server (Tomcat, Jetty) |
| Complex project setup | Simple starter templates |
| Manual management of dependencies | Starter packs to simplify dependencies |

---

## Summary

Spring Boot makes developing Java applications **faster**, **easier**, and **more reliable** by offering sensible defaults, built-in tools, and automation.  
It is now the standard way to create modern Java back-end services, microservices, and cloud applications.