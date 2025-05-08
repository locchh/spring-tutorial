# Spring Beans

In the Spring Framework, **Spring Beans** are the foundation of any application. They are objects that are instantiated, assembled, and managed by the Spring IoC container.

---

### **What is a Spring Bean?**

A Spring Bean is:
- An object created, configured, and managed by the Spring IoC container
- The fundamental building block of a Spring application
- Defined through configuration metadata that instructs the container how to create, configure, and assemble these objects

---

### **Bean Definition Methods**

Spring provides multiple ways to define beans:

#### 1. XML Configuration

```xml
<bean id="userService" class="com.example.service.UserServiceImpl">
    <property name="userRepository" ref="userRepository"/>
</bean>
```

#### 2. Java-Based Configuration

```java
@Configuration
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }
    
    @Bean
    public UserRepository userRepository() {
        return new JpaUserRepository();
    }
}
```

#### 3. Annotation-Based Configuration

```java
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

---

### **Bean Scopes**

Spring provides several scopes for beans:

1. **Singleton** (default): One instance per Spring container
   ```java
   @Bean
   @Scope("singleton")
   public UserService userService() {
       return new UserServiceImpl();
   }
   ```

2. **Prototype**: New instance each time requested
   ```java
   @Bean
   @Scope("prototype")
   public UserService userService() {
       return new UserServiceImpl();
   }
   ```

3. **Request**: One instance per HTTP request (web-aware contexts)
4. **Session**: One instance per HTTP session (web-aware contexts)
5. **Application**: One instance per ServletContext (web-aware contexts)
6. **WebSocket**: One instance per WebSocket (web-aware contexts)

---

### **Bean Lifecycle**

Spring beans follow a well-defined lifecycle:

#### Initialization Phase

1. **Instantiation**: The container creates the bean instance
2. **Populate Properties**: Dependencies are injected
3. **BeanNameAware's setBeanName()**: If the bean implements BeanNameAware
4. **BeanFactoryAware's setBeanFactory()**: If the bean implements BeanFactoryAware
5. **ApplicationContextAware's setApplicationContext()**: If the bean implements ApplicationContextAware
6. **PreInitialization (BeanPostProcessors)**: postProcessBeforeInitialization methods
7. **InitializingBean's afterPropertiesSet()**: If the bean implements InitializingBean
8. **Custom init-method**: Specified in configuration
9. **PostInitialization (BeanPostProcessors)**: postProcessAfterInitialization methods

#### Destruction Phase

1. **DestructionAwareBeanPostProcessors**: postProcessBeforeDestruction methods
2. **DisposableBean's destroy()**: If the bean implements DisposableBean
3. **Custom destroy-method**: Specified in configuration

Example of lifecycle callbacks:

```java
@Component
public class UserService implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        // Initialization logic
        System.out.println("Bean is initialized");
    }
    
    @Override
    public void destroy() throws Exception {
        // Cleanup logic
        System.out.println("Bean is being destroyed");
    }
}
```

Using annotations:

```java
@Component
public class ProductService {
    @PostConstruct
    public void init() {
        // Initialization logic
    }
    
    @PreDestroy
    public void cleanup() {
        // Cleanup logic
    }
}
```

---

### **Bean Autowiring**

Spring can automatically wire beans together through:

#### 1. Constructor Injection (Recommended)

```java
@Service
public class OrderService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    
    @Autowired // Optional in newer Spring versions
    public OrderService(ProductRepository productRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }
}
```

#### 2. Setter Injection

```java
@Service
public class OrderService {
    private ProductRepository productRepository;
    
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
```

#### 3. Field Injection (Not Recommended)

```java
@Service
public class OrderService {
    @Autowired
    private ProductRepository productRepository;
}
```

---

### **Bean Naming**

Beans can be named explicitly:

```java
@Component("userService")
public class UserServiceImpl implements UserService {
    // ...
}
```

Or implicitly (camelCase of class name):

```java
@Component
public class UserServiceImpl implements UserService {
    // userServiceImpl will be the bean name
}
```

---

### **Bean Inheritance**

Beans can inherit configuration from parent beans:

```xml
<bean id="baseService" abstract="true">
    <property name="timeout" value="30000"/>
</bean>

<bean id="userService" parent="baseService">
    <property name="repository" ref="userRepository"/>
</bean>
```

---

### **Lazy Initialization**

By default, Spring creates singleton beans eagerly at startup. You can change this behavior:

```java
@Component
@Lazy
public class ExpensiveService {
    // This bean will only be created when first requested
}
```

---

### **Bean Definition Profiles**

Profiles allow you to register beans conditionally:

```java
@Configuration
public class AppConfig {
    @Bean
    @Profile("development")
    public DataSource devDataSource() {
        return new EmbeddedDatabaseBuilder()
            .setType(EmbeddedDatabaseType.H2)
            .build();
    }
    
    @Bean
    @Profile("production")
    public DataSource prodDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
        // Additional configuration
        return dataSource;
    }
}
```

---

### **@Conditional Bean Registration**

Spring allows conditional bean registration based on various factors:

```java
@Configuration
public class AppConfig {
    @Bean
    @Conditional(OnMissingBeanCondition.class)
    public UserService backupUserService() {
        return new DefaultUserService();
    }
}
```

Spring Boot provides several built-in conditional annotations:

- **@ConditionalOnClass**: Registers a bean if a specified class is present
- **@ConditionalOnMissingBean**: Registers a bean if no bean of the same type exists
- **@ConditionalOnProperty**: Registers a bean based on a property value
- **@ConditionalOnWebApplication**: Registers a bean if the application is a web application
- **@ConditionalOnExpression**: Registers a bean based on a SpEL expression

Example:

```java
@Configuration
public class SecurityConfig {
    @Bean
    @ConditionalOnProperty(name = "security.enabled", havingValue = "true")
    public SecurityService securityService() {
        return new SecurityServiceImpl();
    }
}
```

---

### **Bean Validation**

Spring integrates with the Bean Validation API (JSR-380) to validate beans:

```java
@Service
public class UserService {
    public void createUser(@Valid User user) {
        // User object will be validated before this method executes
    }
}

public class User {
    @NotBlank
    private String username;
    
    @Email
    private String email;
    
    @Min(18)
    private int age;
    
    // Getters and setters
}
```

---

### **Bean Factory vs ApplicationContext**

Spring provides two types of IoC containers:

1. **BeanFactory**: Basic container, lazy-loads beans
2. **ApplicationContext**: Advanced container, extends BeanFactory with additional features:
   - Internationalization
   - Event publication
   - Resource loading
   - Application-layer specific contexts

Most applications use ApplicationContext:

```java
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
UserService userService = context.getBean("userService", UserService.class);
```

---

### **Bean Aliasing**

A bean can have multiple names or aliases:

```java
@Configuration
public class AppConfig {
    @Bean(name = {"userService", "userManager", "accountService"})
    public UserService userService() {
        return new UserServiceImpl();
    }
}
```

In XML:

```xml
<bean id="userService" class="com.example.service.UserServiceImpl">
    <alias name="userService" alias="userManager"/>
    <alias name="userService" alias="accountService"/>
</bean>
```

---

### **Method Injection**

When a singleton bean needs to use a prototype bean, method injection can be used:

```java
@Component
public abstract class CommandManager {
    public Object process(Object commandState) {
        // Create a new command for each request
        Command command = createCommand();
        command.setState(commandState);
        return command.execute();
    }
    
    // Spring will override this method to return a new Command instance
    @Lookup
    protected abstract Command createCommand();
}
```

---

### **Best Practices for Spring Beans**

1. **Favor constructor injection** over field or setter injection
2. **Use immutable beans** when possible (final fields)
3. **Keep beans stateless** unless they are prototype-scoped
4. **Use appropriate scopes** based on the bean's purpose
5. **Avoid circular dependencies** between beans
6. **Use meaningful bean names** that reflect their purpose
7. **Leverage Spring's component scanning** for automatic bean detection
8. **Use appropriate stereotypes** (@Component, @Service, @Repository, @Controller)
9. **Externalize configuration** using @Value and property sources
10. **Document complex beans** with clear JavaDocs

---

### **Summary**

Spring Beans are the foundation of Spring applications. Understanding how to define, configure, and manage beans is essential for effective Spring development. The Spring IoC container provides powerful features for bean lifecycle management, dependency injection, and configuration that help create loosely coupled, maintainable applications.