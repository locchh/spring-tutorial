# **Maven Essentials**

Maven is a powerful build automation tool primarily used for Java projects. It simplifies project management, building, and deployment through a standardized process.

---

## Maven Lifecycle

The Maven build process is controlled by a **lifecycle**, which consists of several phases:

| Phase        | Description |
|--------------|-------------|
| `validate`   | Checks if the project is correct and all necessary information is available. |
| `compile`    | Compiles the source code of the project. |
| `test`       | Runs unit tests (without packaging). |
| `package`    | Packages the compiled code into a JAR or WAR file. |
| `verify`     | Runs checks to verify the package is valid. |
| `install`    | Installs the package into the local Maven repository for use in other projects. |
| `deploy`     | Copies the final package to a remote repository for sharing. |

**Example Command:**
```bash
mvn clean install
```
- `clean`: Cleans the `target/` directory.
- `install`: Compiles, tests, packages, and installs the build artifacts locally.

---

## Maven Folder Structure

Maven enforces a **standard directory layout** to maintain consistency across projects:

```
my-project/
 ├── src/
 │    ├── main/
 │    │    ├── java/          # Application source code
 │    │    ├── resources/     # Configuration files, static resources
 │    └── test/
 │         ├── java/          # Test source code
 │         └── resources/     # Test configuration files
 ├── pom.xml                  # Maven configuration file
```

- **`src/main/java/`**: Main application code.
- **`src/main/resources/`**: Properties, YAML files, templates.
- **`src/test/java/`**: Unit and integration tests.
- **`pom.xml`**: Defines project details, dependencies, plugins, and build instructions.

---

## Maven Workflow

Typical Maven workflow steps:

1. **Create a Project**  
   Use the Maven Archetype to generate a project structure:
   ```bash
   mvn archetype:generate
   ```

2. **Add Dependencies**  
   Add libraries or frameworks inside the `pom.xml`:
   ```xml
   <dependencies>
     <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-web</artifactId>
       <version>3.2.0</version>
     </dependency>
   </dependencies>
   ```

3. **Build the Project**  
   Compile and package the project:
   ```bash
   mvn clean package
   ```

4. **Run Tests**  
   Execute all tests automatically during the build:
   ```bash
   mvn test
   ```

5. **Install Locally**  
   Install the final package into your local Maven repository:
   ```bash
   mvn install
   ```

6. **Deploy (optional)**  
   Deploy artifacts to a remote repository if needed:
   ```bash
   mvn deploy
   ```

---

# Summary

- Maven organizes projects into a predictable structure.
- It automates compilation, testing, packaging, and deployment.
- Understanding the Maven lifecycle and folder structure makes Java project management much easier.