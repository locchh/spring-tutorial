# **Maven Essentials**

Maven is a powerful build automation tool primarily used for Java projects. It simplifies project management, building, and deployment through a standardized process. Here’s a detailed **Maven Lifecycle** table that breaks down the various phases and their purpose. Maven uses a set of lifecycles, and each lifecycle is made up of a series of phases.

## Maven Lifecycle Phases

Maven has three main lifecycles: **default**, **clean**, and **site**. The most commonly used one is the **default** lifecycle.

---

### 1. **Default Lifecycle (for building and deploying projects)**

| **Phase**    | **Description**                                                     |
| ------------ | ------------------------------------------------------------------- |
| **validate** | Validates the project’s structure and configuration.                |
| **compile**  | Compiles the source code of the project.                            |
| **test**     | Runs unit tests using a suitable testing framework.                 |
| **package**  | Packages the compiled code into a JAR/WAR/EAR (or similar format).  |
| **verify**   | Verifies the integrity of the package (i.e., correctness of tests). |
| **install**  | Installs the packaged artifact into the local repository.           |
| **deploy**   | Copies the final package to a remote repository for sharing.        |

---

### 2. **Clean Lifecycle (for cleaning up artifacts)**

| **Phase**      | **Description**                                                  |
| -------------- | ---------------------------------------------------------------- |
| **pre-clean**  | Executes actions before the clean phase.                         |
| **clean**      | Removes any previously generated artifacts, e.g., target folder. |
| **post-clean** | Executes actions after the clean phase.                          |

---

### 3. **Site Lifecycle (for generating project documentation)**

| **Phase**       | **Description**                                            |
| --------------- | ---------------------------------------------------------- |
| **pre-site**    | Executes actions before generating the site documentation. |
| **site**        | Generates project documentation (e.g., reports, Javadoc).  |
| **post-site**   | Executes actions after generating the site documentation.  |
| **site-deploy** | Deploys the generated site to a web server.                |

---

### **Full Maven Lifecycle Flow** (for the default lifecycle):

```
validate → compile → test → package → verify → install → deploy
```

---

### 🔄 **Phases Summary (in order)**

1. **validate**
2. **initialize** *(Not commonly used, used for advanced configurations)*
3. **compile**
4. **test**
5. **package**
6. **verify**
7. **install**
8. **deploy**

---

### **When do the clean and site lifecycles run?**

* **Clean Lifecycle**: Runs when you execute `mvn clean`, and it cleans up the `target` directory where Maven stores all compiled and packaged files.
* **Site Lifecycle**: Runs when you execute `mvn site`, which generates the site documentation (e.g., Javadoc, reports).

---

### 📅 **Typical Maven Command Flow**

* **Build**:

  ```bash
  mvn clean install
  ```

  This will clean previous artifacts, recompile, test, package, and install them locally.

* **Test Only**:

  ```bash
  mvn clean test
  ```

  This cleans previous builds and runs tests.

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

## Standard format of a Java package name

The **standard format of a Java package name** follows specific conventions to ensure uniqueness and readability. Here's the typical structure:

```
<top-level-domain>.<organization>.<project>[.<submodule>...]
```

### 🔤 **Conventions**

| Element               | Rule                                                                        |
| --------------------- | --------------------------------------------------------------------------- |
| All lowercase         | Java package names should always be lowercase                               |
| No special characters | Use only letters, digits, and dots `.` (which separate components)          |
| Start with domain     | Start with your organization’s domain name in reverse (e.g., `com.example`) |
| Optional submodules   | Add project or module names after the domain                                |

---

### 🧪 **Examples**

| Organization     | Domain         | Package Name                 |
| ---------------- | -------------- | ---------------------------- |
| Google           | google.com     | `com.google.guava`           |
| Oracle           | oracle.com     | `com.oracle.database`        |
| Your company     | example.org    | `org.example.myapp.utils`    |
| Personal project | github.com/you | `io.github.yourname.project` |

---

### 🚫 Avoid

* Using capital letters: `Com.Example.App` ❌
* Using underscores or hyphens: `com.example_myapp` ❌
* Using Java keywords or starting with numbers: `com.int` or `com.123example` ❌

## Maven Workflow

Typical Maven workflow steps:

1. **Create a Project**  
   Use the Maven Archetype to generate a project structure:
   ```bash
   mvn archetype:generate \
  -DgroupId=com.example.app \
  -DartifactId=my-app \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false \
  -Dmaven.compiler.source=21 \
  -Dmaven.compiler.target=21
   ```
This command quickly creates a basic Maven project with:

- Group ID: `com.example.app`

- Artifact ID: `my-app`

- A basic App.java and test file

- No interactive questions

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