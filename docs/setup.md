# Environment Setup

This guide will walk you through setting up your development environment by installing **Java**, **Maven**, and **IntelliJ IDEA**.

---

## 1. Install Java

You need to install the **Java Development Kit (JDK)**.

### Windows / Mac / Linux

- Download the latest **JDK 17** or **JDK 21** from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or use [Adoptium](https://adoptium.net/).
- Follow the installer instructions.
- After installation, verify the installation:

```bash
java -version
javac -version
```

You should see the installed Java version.

---

## 2. Install Maven

Maven is a build automation tool mainly used for Java projects.

### Windows / Mac / Linux

- Download the latest **Apache Maven** from the [official site](https://maven.apache.org/download.cgi).
- Extract the archive to a desired location.
- Add Maven’s `bin` directory to your system’s `PATH` environment variable.
- Or install by command: `sudo apt install maven -y`
Verify the installation:

```bash
mvn -version
```

---

## 3. Install IntelliJ IDEA

IntelliJ IDEA is a powerful IDE for Java development.

- Download **IntelliJ IDEA Community Edition** (free) or **Ultimate Edition** (paid) from the [JetBrains website](https://www.jetbrains.com/idea/download/).
- Install and follow the setup instructions.
- Recommended Plugins:
  - Maven Integration
  - Lombok (if needed)
  - Git Integration

**Note**:
- IntelliJ IDEA is also available as a snap package. If you’re on Ubuntu 16.04 or later, you can install IntelliJ IDEA from the command line. `sudo snap install intellij-idea-ultimate --classic` or `sudo snap install intellij-idea-community --classic`
- 
---

## 4. Quick Test

After everything is installed:

1. Open IntelliJ IDEA.
2. Create a new **Maven Project**.
3. Add a simple Java file.
4. Build and run the project to verify that Java and Maven are working properly.

---

## Troubleshooting

- **Java not found?**  
  Ensure your `JAVA_HOME` environment variable is set correctly.
  
- **Maven command not recognized?**  
  Double-check that Maven’s `bin` directory is in your system’s `PATH`.

- **IDE issues?**  
  Try restarting IntelliJ IDEA and re-importing your project.
