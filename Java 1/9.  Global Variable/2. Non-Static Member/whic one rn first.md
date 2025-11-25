---
# ⭐ **Short & Simple Answer**

### ✅ **Static runs first — ALWAYS**

### ❌ Non-static runs later, only after object is created.
---

# ⭐ **Why Static Runs First?**

- Static belongs to **class**
- Loaded **when program starts**
- No object needed
- Runs **before main**, **before constructor**, **before anything else**

---

# ⭐ **Exact Order of Execution in Java**

Here is the correct order:

### **1️⃣ Static variables**

### **2️⃣ Static blocks**

### **3️⃣ main() method (static)**

### **4️⃣ Non-static variables**

### **5️⃣ Constructors**

### **6️⃣ Non-static methods**

---

# ⭐ **Example to PROVE It**

```java
class Test {

    // static block
    static {
        System.out.println("1. Static Block Runs");
    }

    // non-static block
    {
        System.out.println("4. Non-Static Block Runs");
    }

    // constructor
    Test() {
        System.out.println("5. Constructor Runs");
    }

    // static method
    static void staticMethod() {
        System.out.println("2. Static Method Runs");
    }

    // non-static method
    void nonStaticMethod() {
        System.out.println("6. Non-Static Method Runs");
    }

    public static void main(String[] args) {

        System.out.println("3. main() Runs");

        Test t = new Test();  // object created

        t.nonStaticMethod();
    }
}
```

---

# ⭐ **Expected Output**

```
1. Static Block Runs
3. main() Runs
4. Non-Static Block Runs
5. Constructor Runs
6. Non-Static Method Runs
```

---

# ⭐ Why static method runs first?

Because Java loads static parts **before running main()**.
Static = class-level → comes first.
Non-static = object-level → requires object → comes later.

---

---

# ⭐ **FLOWCHART / DIAGRAM OF STATIC vs NON-STATIC EXECUTION ORDER**

```
          ┌───────────────────────────┐
          │     Program Starts         │
          └─────────────┬─────────────┘
                        |
                        ▼
        ┌───────────────────────────────────┐
        │ 1. Load Class (JVM loads class)   │
        └──────────────────┬────────────────┘
                           |
                           ▼
         ┌─────────────────────────────────┐
         │ 2. Static Variables Initialized │
         └─────────────────┬──────────────┘
                           |
                           ▼
            ┌───────────────────────────┐
            │ 3. Static Block Executes  │
            └────────────┬─────────────┘
                         |
                         ▼
         ┌────────────────────────────────┐
         │ 4. main() Method (static) runs │
         └──────────────────┬────────────┘
                            |
                            ▼
    ┌───────────────────────────────────────────┐
    │ If object created => move to non-static   │
    └────────────────────────┬──────────────────┘
                             |
                             ▼
             ┌─────────────────────────────┐
             │ 5. Non-Static Variables     │
             │     Initialize              │
             └───────────┬────────────────┘
                         |
                         ▼
         ┌────────────────────────────────┐
         │ 6. Non-Static Block Executes    │
         └──────────────────┬─────────────┘
                            |
                            ▼
           ┌──────────────────────────────┐
           │ 7. Constructor Executes      │
           └────────────┬────────────────┘
                        |
                        ▼
        ┌────────────────────────────────────┐
        │ 8. Non-Static Methods Can Be Called│
        └────────────────────────────────────┘
```

---

# ⭐ **TOP 10 PRACTICE QUESTIONS (For Interview + Learning)**

### **1️⃣ What executes first: static block or main()?**

**Answer:** static block

### **2️⃣ Can we call a non-static method without creating an object?**

**Answer:** No

### **3️⃣ Can a static method access non-static variables directly?**

**Answer:** No

### **4️⃣ Can non-static methods access static variables?**

**Answer:** Yes

### **5️⃣ What executes first: constructor or non-static block?**

**Answer:** Non-static block

### **6️⃣ Which method runs automatically without object?**

**Answer:** static methods (like main)

### **7️⃣ What happens if you create 3 objects? How many times do non-static blocks run?**

**Answer:** 3 times (once per object)

### **8️⃣ How many times do static blocks run in a program?**

**Answer:** Only once (when class loads)

### **9️⃣ Can we overload static methods?**

**Answer:** Yes

### **🔟 What is required to call a non-static method inside main()?**

**Answer:** Create an object → `ClassName obj = new ClassName();`

---

# ⭐ **TRICK TO REMEMBER THE ORDER (Super Easy Trick)**

### \*\*Use this acronym:

👉 “S S M N C N”\*\*

Breakdown:

| Letter | Meaning              |
| ------ | -------------------- |
| **S**  | Static Variables     |
| **S**  | Static Blocks        |
| **M**  | main() Method        |
| **N**  | Non-static Variables |
| **C**  | Constructor          |
| **N**  | Non-static Methods   |

---

# ⭐ **Funny Memory Trick (You’ll Never Forget 😄)**

### 🔥 **“Static people come first, Non-static people come later!”**

Because static = "always ready"
Non-static = "only come when called (object created)"

---
