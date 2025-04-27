# **Gradle Essentials**

**Gradle** is a modern, powerful build automation tool used for Java, Kotlin, Groovy, and many other languages.  
It is known for being fast, flexible, and highly customizable, often preferred over Maven in new projects.

---

## Gradle Lifecycle

Gradle organizes the build process into **phases**:

| Phase        | Description |
|--------------|-------------|
| **Initialization** | Determines which projects are going to take part in the build. |
| **Configuration**  | Creates and configures tasks for each project. |
| **Execution**      | Executes the requested tasks (like `build`, `test`, etc.). |

Instead of predefined lifecycles like Maven, Gradle allows you to define **custom tasks** and control the build flow more flexibly.

**Example Command:**
```bash
gradle build
```
This command triggers the tasks to **compile**, **test**, and **package** your code.

---

## Gradle Folder Structure

Gradle's standard project structure (especially for Java projects) is very similar to Maven:

```
my-project/
 ├── src/
 │    ├── main/
 │    │    ├── java/          # Application source code
 │    │    ├── resources/     # Configuration files
 │    └── test/
 │         ├── java/          # Test source code
 │         └── resources/     # Test configuration files
 ├── build.gradle             # Gradle build script
 ├── settings.gradle          # Project settings (especially for multi-project builds)
```

- **`src/main/java/`**: Application logic.
- **`src/main/resources/`**: Properties, YAMLs, templates.
- **`src/test/java/`**: Unit and integration tests.
- **`build.gradle`**: Core build script where dependencies, plugins, and tasks are defined.

---

## Gradle Workflow

Typical Gradle development workflow:

1. **Create a Project**  
   Initialize a new Gradle project:
   ```bash
   gradle init
   ```

2. **Add Dependencies**  
   Declare dependencies in `build.gradle`:
   ```groovy
   dependencies {
       implementation 'org.springframework.boot:spring-boot-starter-web:3.2.0'
       testImplementation 'org.junit.jupiter:junit-jupiter:5.9.3'
   }
   ```

3. **Build the Project**  
   Compile and package:
   ```bash
   gradle build
   ```

4. **Run Tests**  
   Execute tests:
   ```bash
   gradle test
   ```

5. **Run the Application** (if using `application` plugin)  
   ```bash
   gradle run
   ```

6. **Clean Build Artifacts**  
   Remove generated files:
   ```bash
   gradle clean
   ```

---

## Maven vs Gradle Quick Comparison

| Feature                | Maven                         | Gradle                     |
|-------------------------|-------------------------------|-----------------------------|
| Configuration Syntax    | XML (`pom.xml`)               | Groovy/Kotlin (`build.gradle`) |
| Build Speed             | Slower (full build each time) | Faster (incremental builds, parallelism) |
| Customization           | Limited without plugins       | Highly customizable        |
| Dependency Management   | Built-in                      | Built-in + flexible options |
| Popular Use             | Still widely used             | Growing rapidly in modern projects |

---

# Summary

- Gradle provides a **flexible**, **fast**, and **declarative** way to build Java applications.
- It uses **Groovy** or **Kotlin** scripts instead of XML.
- Understanding Gradle’s structure and workflow helps in building and managing projects efficiently.