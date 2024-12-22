In **Spring Boot** (and Spring Framework in general), **Inversion of Control (IoC)** and **Dependency Injection (DI)** are core concepts that simplify the development of loosely coupled, testable, and maintainable applications. Here’s a detailed explanation of both:

---

### **1. Inversion of Control (IoC):**
IoC is a design principle where the control of object creation, configuration, and lifecycle management is transferred from the developer to a container or framework. 

#### How it works:
- In traditional programming, the developer writes the code to create and manage objects. This leads to tightly coupled code, making it harder to test or change dependencies.
- With IoC, the **Spring IoC container** takes responsibility for creating and managing the dependencies between objects.

#### Example:
Instead of a class creating its dependencies directly using `new`, the container injects the required dependencies into the class.

---

### **2. Dependency Injection (DI):**
DI is a specific way to achieve IoC by injecting dependencies into a class instead of the class creating them itself. This is done by the Spring IoC container.

#### Types of Dependency Injection in Spring:
1. **Constructor Injection:** The dependencies are provided through the class constructor.
2. **Setter Injection:** The dependencies are injected through public setter methods.
3. **Field Injection:** Dependencies are injected directly into fields using annotations like `@Autowired`.

---

### **Key Concepts in Spring Boot for IoC and DI:**
1. **`@Component` and `@Service`:** Marks a class as a bean (managed by Spring IoC container).
2. **`@Autowired`:** Enables Spring to resolve and inject the bean.
3. **`@Configuration`:** Indicates a class that declares one or more `@Bean` methods.
4. **`@Bean`:** Used to define a bean explicitly in Java-based configuration.
5. **`@Controller` and `@RestController`:** Specialized annotations to mark classes that handle web requests.

---

### **Example in Spring Boot:**

#### Without IoC and DI:
```java
public class UserService {
    private UserRepository userRepository = new UserRepository();
    
    public void performAction() {
        userRepository.save();
    }
}
```

In this case, the `UserService` class directly creates an instance of `UserRepository`, making it tightly coupled.

#### With IoC and DI:
```java
// UserRepository.java
@Component
public class UserRepository {
    public void save() {
        System.out.println("User saved!");
    }
}

// UserService.java
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired // Constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void performAction() {
        userRepository.save();
    }
}

// Main Application
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

#### Key Points in the Above Code:
1. `@Component` marks `UserRepository` as a Spring-managed bean.
2. `@Service` marks `UserService` as a service layer bean.
3. `@Autowired` in the constructor tells Spring to inject an instance of `UserRepository` into `UserService`.

---

### **Benefits of IoC and DI:**
1. **Loose Coupling:** Classes are not responsible for managing their dependencies.
2. **Testability:** Mock dependencies can be easily injected during testing.
3. **Readability and Maintainability:** Dependency management is centralized.
4. **Reusability:** Beans can be reused across different parts of the application.

In short, **IoC** gives the framework control over object creation and lifecycle, while **DI** provides a way to supply the necessary dependencies to objects, enabling flexible and modular design.
