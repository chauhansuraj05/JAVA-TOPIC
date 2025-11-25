In Java, **variables have different types** based on what kind of data they store.
Here is the **simplest and complete list** of variable types in Java.

---

# ⭐ **1. Primitive Data Types (8 types)**

These are the basic types built directly into Java.

| Type        | Stores                    | Example    |
| ----------- | ------------------------- | ---------- |
| **byte**    | small integers            | 127        |
| **short**   | medium integers           | 32000      |
| **int**     | normal integers           | 10, 2000   |
| **long**    | large integers            | 999999L    |
| **float**   | decimal numbers (4 bytes) | 3.14f      |
| **double**  | decimal numbers (8 bytes) | 3.14159265 |
| **char**    | single character          | 'A' , '9'  |
| **boolean** | true / false              | true       |

---

# ⭐ **2. Non-Primitive (Reference) Types**

| Type           | Meaning                 | Examples        |
| -------------- | ----------------------- | --------------- |
| **String**     | sequence of characters  | "Suraj", "Java" |
| **Arrays**     | collection of same type | int[] arr       |
| **Classes**    | custom objects          | new Student()   |
| **Interfaces** | contract for classes    | Runnable        |
| **Objects**    | instance of class       | Object o        |

These types store **addresses (references)**, not actual data.

---

# ⭐ **3. Types of Variables (based on scope)**

Java has **3 types of variables**:

---

## ✅ **1. Local Variables**

- Declared **inside a method**
- Exists only during method execution
- Must be initialized before use

Example:

```java
void show() {
    int age = 20; // local variable
}
```

---

## ✅ **2. Instance Variables**

- Declared **inside a class**, but NOT inside a method
- Unique to each object
- Also called **non-static variable**

Example:

```java
class Student {
    int marks; // instance variable
}
```

---

## ✅ **3. Static Variables**

- Declared using the **static** keyword
- Shared by ALL objects of a class
- Belongs to the class, not objects

Example:

```java
class Counter {
    static int count = 0; // static variable
}
```

---

# ⭐ Summary Table (Easy to Remember)

| Category           | Types                                                |
| ------------------ | ---------------------------------------------------- |
| **Primitive**      | byte, short, int, long, float, double, char, boolean |
| **Non-Primitive**  | String, Array, Class, Interface, Object              |
| **Variable Scope** | Local, Instance, Static                              |

---

**examples for EVERY type of variable in Java** — Primitive, Non-Primitive, Local, Instance, Static — all in one clean list.

---

# ⭐ **1. Primitive Data Type Examples**

## ✅ **byte**

```java
byte age = 25;
```

## ✅ **short**

```java
short year = 2024;
```

## ✅ **int**

```java
int marks = 85;
```

## ✅ **long**

```java
long population = 1380000000L;
```

## ✅ **float**

```java
float price = 99.99f;
```

## ✅ **double**

```java
double salary = 55000.75;
```

## ✅ **char**

```java
char grade = 'A';
```

## ✅ **boolean**

```java
boolean isJavaFun = true;
```

---

# ⭐ **2. Non-Primitive Data Type Examples**

## ✅ **String**

```java
String name = "Suraj Chauhan";
```

## ✅ **Array**

```java
int[] numbers = {10, 20, 30};
```

## ✅ **Class / Object**

```java
class Student {
    int id = 101;
}
Student s = new Student();
```

## ✅ **Interface**

```java
interface Animal {
    void sound();
}
```

## ✅ **Object Type**

```java
Object obj = new Object();
```

---

# ⭐ **3. Variable Types Based on Scope**

---

## ⭐ **1. Local Variable Example**

- Declared inside a method

```java
void show() {
    int speed = 60;   // local variable
    System.out.println(speed);
}
```

---

## ⭐ **2. Instance Variable Example**

- Belongs to the object
- Declared inside a class, but outside methods

```java
class Car {
    int modelYear = 2020;  // instance variable
}
```

Usage:

```java
Car c = new Car();
System.out.println(c.modelYear);
```

---

## ⭐ **3. Static Variable Example**

- Shared by all objects

```java
class Counter {
    static int count = 0;   // static variable

    Counter() {
        count++;
    }
}
```

Usage:

```java
Counter c1 = new Counter();
Counter c2 = new Counter();
System.out.println(Counter.count);  // prints 2
```

---
