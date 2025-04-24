## ✅ How to Run Java in a Jupyter Notebook

### ⚙️ Requirements
- **Java JDK 8+** (install from [https://adoptium.net](https://adoptium.net))
- **Python 3.x** and **Jupyter Notebook**

You can check with:
```bash
java -version
python --version
jupyter --version
```

---

### 📦 Step 1: Install Jupyter (if you haven’t)
```bash
pip install notebook
```

---

### Step 2:

Let’s install JDK 11 (keeping 21 intact) and temporarily switch to it.

```bash
sudo apt update
sudo apt install openjdk-11-jdk
```

Run:

```
sudo update-alternatives --config java
```


### 🧠 Step 2: Install the IJava Kernel (Java Kernel for Jupyter)

Use Git to clone and install the IJava kernel manually:

```bash
git clone https://github.com/SpencerPark/IJava.git
cd IJava
./gradlew installKernel
```

> 💡 `./gradlew` will compile and register the Java kernel into Jupyter.

To fix for `./gradlew installKernel` Failure:

Gather information and perform debugging:

```bash
./gradlew --info
./gradlew --debug
```

Try cleaning Gradle’s local state:

```bash
./gradlew --stop
./gradlew clean
```

Then try:

```bash
./gradlew installKernel
```

---

### 🚀 Step 3: Run Jupyter Notebook
```bash
jupyter notebook
```

In the notebook interface:
- Click `New`
- Choose `Java` as your kernel

---

### 🧪 Example Java Code
```java
System.out.println("Hello from Java in Jupyter!");
```

---

### 🛠️ Troubleshooting Tips

| Problem | Solution |
|--------|----------|
| `./gradlew` fails | Make sure JDK is installed and `java` is in your `PATH` |
| No `Java` kernel in Jupyter | Run `jupyter kernelspec list` to confirm kernel is installed |
| Gradle not found | No worries — the project uses a bundled Gradle wrapper (`./gradlew`) |