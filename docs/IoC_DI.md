### **Inversion of Control (IoC)**

**Definition:**  
Inversion of Control (IoC) is a design principle used to decouple components in a software system. Instead of a component controlling its dependencies, the control is "inverted" and given to a framework or a container. This principle allows developers to write loosely coupled, more testable, and reusable code.

**Key Characteristics:**
1. The framework or container decides when and how components are instantiated.
2. Components declare their dependencies and rely on the container to provide them.
3. IoC fosters separation of concerns by reducing the direct dependency between components.

**Example in Java:**  
A classic example is the use of Spring Framework, where the container manages the lifecycle of objects.

Without IoC:
```java
class Service {
    private Repository repository;

    public Service() {
        repository = new Repository(); // tightly coupled
    }
}
```

With IoC:
```java
class Service {
    private Repository repository;

    public Service(Repository repository) { // dependency injected
        this.repository = repository;
    }
}
```

---

### **Dependency Injection (DI)**

**Definition:**  
Dependency Injection is a design pattern and an implementation of IoC. It refers to the process of providing dependencies (objects) to a class from an external source, rather than the class creating them itself. 

**Types of Dependency Injection:**
1. **Constructor Injection:** Dependencies are passed through the constructor.
   ```java
   class Service {
       private Repository repository;

       public Service(Repository repository) { // Constructor Injection
           this.repository = repository;
       }
   }
   ```
2. **Setter Injection:** Dependencies are passed through setter methods.
   ```java
   class Service {
       private Repository repository;

       public void setRepository(Repository repository) { // Setter Injection
           this.repository = repository;
       }
   }
   ```
3. **Interface Injection (less common):** The dependency provides an injector method for itself.

**Benefits:**
- Promotes loose coupling between classes.
- Improves code reusability and testability.
- Simplifies unit testing with mock objects.

---

### **IoC vs DI in Java**
| **Aspect**                 | **Inversion of Control (IoC)**            | **Dependency Injection (DI)**            |
|----------------------------|-------------------------------------------|------------------------------------------|
| **Definition**             | A broader principle for decoupling components. | A specific implementation of IoC.        |
| **Focus**                  | Relinquishes control to a framework or container. | Provides dependencies to components.     |
| **Example**                | Spring Framework managing object lifecycle. | Injecting dependencies using constructors or setters. |

---

### **How They Work Together in Java:**
1. IoC provides the overarching framework for managing object lifecycles and dependencies.
2. DI is one way IoC is implemented in Java, ensuring that objects receive the dependencies they need without hard-coding them.

Frameworks like **Spring** make extensive use of IoC and DI, allowing developers to focus on business logic while the framework handles object creation and dependency management.
