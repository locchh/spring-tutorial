### ✅ **Open Source Tools**

#### 🖥️ Modern Code (C/C++, Java, Python, etc.)

| Tool                              | Language(s)                   | Notes                                |
| --------------------------------- | ----------------------------- | ------------------------------------ |
| **SonarQube (Community Edition)** | Java, C/C++, Python, JS, etc. | Widely used, extensible              |
| **Cppcheck**                      | C/C++                         | Focus on bugs and memory issues      |
| **Clang Static Analyzer**         | C/C++/Objective-C             | Part of LLVM                         |
| **PMD**                           | Java, Apex, JavaScript        | Rule-based static analysis           |
| **FindBugs/SpotBugs**             | Java                          | Deprecated but still used            |
| **Bandit**                        | Python                        | Security-focused                     |
| **Pylint**                        | Python                        | Coding standard, error detection     |
| **ESLint**                        | JavaScript/TypeScript         | Linting for JS/TS                    |
| **RuboCop**                       | Ruby                          | Popular in Ruby community            |
| **Semgrep**                       | Multiple                      | Lightweight, rule-based, good for CI |

#### 🧓 Legacy/Mainframe Code (COBOL, PL/I, etc.)

| Tool                                           | Language(s) | Notes                                           |
| ---------------------------------------------- | ----------- | ----------------------------------------------- |
| **Open Source COBOL Parser (e.g., OpenCOBOL)** | COBOL       | Limited analysis capabilities                   |
| **IBM Z Open Editor (VS Code)**                | COBOL, PL/I | Used more for editing than full static analysis |
| **ANTLR-based Custom Parsers**                 | COBOL, PL/I | You can build static analysis tools using ANTLR |

---

### 🔒 **Closed Source / Commercial Tools**

#### 🖥️ Modern Code

| Tool                                 | Language(s)                   | Notes                                   |
| ------------------------------------ | ----------------------------- | --------------------------------------- |
| **SonarQube (Developer/Enterprise)** | Same as open-source           | Adds deeper analysis, security scanning |
| **Coverity** (by Synopsys)           | C/C++, Java, C#, Python, etc. | Used in mission-critical projects       |
| **Fortify SCA**                      | Many                          | Focused on security flaws               |
| **Klocwork**                         | C/C++, Java                   | Focus on enterprise use                 |
| **Checkmarx**                        | Multiple                      | Secure code analysis                    |
| **CodeSonar (GrammaTech)**           | C, C++, Java, Python          | Focus on safety-critical systems        |
| **Parasoft C/C++test**               | C, C++                        | MISRA, AUTOSAR compliance checks        |
| **Veracode**                         | Multiple                      | Cloud-based SaaS tool                   |

#### 🧓 Legacy/Mainframe Code

| Tool                                 | Language(s)      | Notes                                      |
| ------------------------------------ | ---------------- | ------------------------------------------ |
| **IBM Rational Developer for Z**     | COBOL, PL/I, ASM | Code analysis, impact analysis             |
| **Micro Focus Enterprise Analyzer**  | COBOL, PL/I      | Extensive support for legacy modernization |
| **EvolveWare Intellisys**            | COBOL, PL/I, JCL | Static/dynamic analysis, modernization     |
| **Delta Software Systems – ADSplus** | COBOL, PL/I, ASM | Supports mainframe code transformation     |
| **Raincode Mainframe Analyzer**      | COBOL, PL/I      | Static analysis with migration focus       |

---

### 💡 Summary by Category

| Category           | Open Source                                 | Closed Source                              |
| ------------------ | ------------------------------------------- | ------------------------------------------ |
| **Modern Code**    | SonarQube, Cppcheck, Clang, ESLint, Semgrep | Coverity, Fortify, Klocwork, Veracode      |
| **Mainframe Code** | ANTLR-based tools, IBM Z Open Editor        | Micro Focus, IBM RDz, EvolveWare, Raincode |



Here is a **feature comparison** of the most well-known **static analysis tools**, organized into four categories:

---

### 🔍 FEATURES TO COMPARE

We'll compare tools on the following key features:

| Feature                      | Description                                |
| ---------------------------- | ------------------------------------------ |
| ✅ Language Support           | Supports a wide range of languages         |
| 🔐 Security Analysis         | Detects vulnerabilities (e.g., OWASP, CWE) |
| 📐 Code Quality              | Code smells, duplication, style            |
| 🧠 Custom Rules              | Ability to define your own analysis rules  |
| 🧪 Integration               | CI/CD tools, IDEs, SCMs                    |
| 📊 Reporting & Dashboards    | GUI/HTML reports, issue tracking           |
| 🏢 Enterprise Support        | Scalability, governance, compliance        |
| 🕰️ Legacy/Mainframe Support | COBOL, PL/I, ASM, JCL, etc.                |

---

#### ✅ **Open Source Tools (Modern Code)**

| Tool                      | ✅ Lang Support | 🔐 Security | 📐 Code Quality | 🧠 Custom Rules    | 🧪 Integration     | 📊 Reports   | 🏢 Enterprise |
| ------------------------- | -------------- | ----------- | --------------- | ------------------ | ------------------ | ------------ | ------------- |
| **SonarQube (Community)** | ✔️ Many        | 🚫 Basic    | ✔️ Yes          | ✔️ Yes             | ✔️ GitHub, Jenkins | ✔️ Basic     | 🚫            |
| **Cppcheck**              | C/C++ only     | 🚫          | ✔️              | ✔️ Custom scripts  | CLI-based          | Text/XML     | 🚫            |
| **Clang Static Analyzer** | C/C++/Obj-C    | 🚫          | ✔️              | ✔️ (via plugins)   | CLI, IDEs          | HTML, XML    | 🚫            |
| **PMD**                   | Java, JS, etc. | 🚫          | ✔️              | ✔️ Ruleset XML     | ✔️ Maven, Gradle   | ✔️           | 🚫            |
| **SpotBugs**              | Java           | 🚫 Limited  | ✔️              | ✔️ Annotations/XML | Jenkins, Maven     | ✔️           | 🚫            |
| **Semgrep**               | Multi          | ✔️ Great    | ✔️              | ✔️ YAML rules      | ✔️ GitHub, GitLab  | ✔️ JSON/HTML | 🚫            |
| **Pylint**                | Python         | 🚫          | ✔️              | ✔️ Plugins         | ✔️                 | Text         | 🚫            |

---

#### 🔒 **Closed Source Tools (Modern Code)**

| Tool            | ✅ Lang Support | 🔐 Security  | 📐 Code Quality | 🧠 Custom Rules   | 🧪 Integration    | 📊 Reports    | 🏢 Enterprise |
| --------------- | -------------- | ------------ | --------------- | ----------------- | ----------------- | ------------- | ------------- |
| **Coverity**    | ✔️ Wide        | ✔️ Excellent | ✔️              | ✔️                | ✔️ Full CI/CD     | ✔️ Rich       | ✔️            |
| **Fortify SCA** | ✔️ Wide        | ✔️ Top-tier  | ✔️              | ✔️ Rules Packs    | ✔️ Azure, Jenkins | ✔️            | ✔️            |
| **Checkmarx**   | ✔️ Wide        | ✔️ Strong    | ✔️              | ✔️                | ✔️                | ✔️            | ✔️            |
| **Klocwork**    | ✔️ Many        | ✔️ Strong    | ✔️              | ✔️ C-style macros | ✔️                | ✔️            | ✔️            |
| **CodeSonar**   | ✔️ Many        | ✔️ Strong    | ✔️              | ✔️                | ✔️                | ✔️            | ✔️            |
| **Veracode**    | ✔️ SaaS        | ✔️ Strong    | ✔️              | 🚫 Limited        | ✔️ Cloud-native   | ✔️ Dashboards | ✔️            |

---

#### ✅ **Open Source / Custom Tools (Legacy Code)**

| Tool                     | 🕰️ Legacy Support | 🔐 Security   | 📐 Code Quality        | 🧠 Custom Rules | 📊 Reports |
| ------------------------ | ------------------ | ------------- | ---------------------- | --------------- | ---------- |
| **IBM Z Open Editor**    | ✔️ COBOL, PL/I     | 🚫            | ✔️ Syntax & highlights | 🚫              | In-editor  |
| **ANTLR + Custom Rules** | ✔️ COBOL/PL/I      | ✔️ If written | ✔️ Depends             | ✔️ Yes          | ✔️ Custom  |

---

#### 🔒 **Closed Source Tools (Legacy/Mainframe)**

| Tool               | 🕰️ Legacy Support        | 🔐 Security | 📐 Code Quality          | 🧠 Custom Rules | 📊 Reports       | 🏢 Enterprise |
| ------------------ | ------------------------- | ----------- | ------------------------ | --------------- | ---------------- | ------------- |
| **IBM RDz**        | ✔️ COBOL, PL/I, ASM       | 🚫          | ✔️                       | 🚫              | ✔️ Graphs/impact | ✔️            |
| **Micro Focus EA** | ✔️ COBOL, PL/I            | ✔️          | ✔️ + Call graph          | ✔️              | ✔️               | ✔️            |
| **EvolveWare**     | ✔️ Legacy + modernization | ✔️          | ✔️ + Reverse engineering | ✔️              | ✔️               | ✔️            |
| **Raincode**       | ✔️ COBOL, PL/I            | ✔️          | ✔️                       | ✔️              | ✔️ HTML/UI       | ✔️            |
| **Delta ADSplus**  | ✔️ COBOL, ASM             | 🚫          | ✔️                       | ✔️              | ✔️               | ✔️            |

---

#### 🔚 Summary: Which Tool for What?

| Goal                                                  | Tool Suggestion                                               |
| ----------------------------------------------------- | ------------------------------------------------------------- |
| 🆕 **Modern multi-language, code quality + security** | **SonarQube**, **Semgrep**, **Coverity**, **Checkmarx**       |
| 🧓 **Legacy/mainframe COBOL analysis**                | **Micro Focus EA**, **IBM RDz**, **EvolveWare**, **Raincode** |
| 💰 **Free & flexible for modern devs**                | **Semgrep**, **PMD**, **Clang**, **ESLint**                   |
| ⚙️ **Custom tooling for COBOL/PL/I**                  | **ANTLR + Custom Rules**                                      |