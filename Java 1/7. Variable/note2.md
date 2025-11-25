**how to classify a variable** based on:

### ✅ **1. Its data type (primitive / non-primitive)**

### ✅ **2. Its scope (local / instance / static)**

Here is the **easiest explanation** so you will NEVER get confused again.

---

# ⭐ **1. Depending Upon Data Type — Types of Variables**

| Type                       | Meaning                   | Example                  |
| -------------------------- | ------------------------- | ------------------------ |
| **Primitive Variable**     | Stores simple values      | `int a = 10;`            |
| **Non-Primitive Variable** | Stores address of objects | `String name = "Suraj";` |

### 🔥 Examples of Primitive Variables:

```java
int age = 20;
char grade = 'A';
boolean isJavaEasy = true;
float price = 99.9f;
```

### 🔥 Examples of Non-Primitive Variables:

```java
String name = "Suraj";
int[] marks = {10, 20, 30};
Student s = new Student();
```

---

# ⭐ **2. Depending Upon Scope — Types of Variables**

There are **3** types based on scope:

## ✔ **A. Local Variable**

- Declared **inside a method**
- Exists only while method runs

```java
void show() {
    int x = 10;   // local variable
}
```

---

## ✔ **B. Instance Variable**

- Declared **inside class**, but **outside methods**
- Each **object** gets its own copy

```java
class Car {
    int speed = 100;  // instance variable
}
```

---

## ✔ **C. Static Variable**

- Declared with **static** keyword
- Shared among **all** objects

```java
class Counter {
    static int count = 0;  // static variable
}
```

---

# ⭐ **FINAL SUMMARY TABLE (VERY IMPORTANT)**

| Classification         | Type          | Where it is declared             | Example             |
| ---------------------- | ------------- | -------------------------------- | ------------------- |
| **Based on Data Type** | Primitive     | Stores simple value              | `int a = 10;`       |
|                        | Non-Primitive | Stores address/object            | `String name;`      |
| **Based on Scope**     | Local         | Inside method                    | `int x = 5;`        |
|                        | Instance      | Inside class, outside method     | `int age;`          |
|                        | Static        | Inside class with static keyword | `static int count;` |

---
