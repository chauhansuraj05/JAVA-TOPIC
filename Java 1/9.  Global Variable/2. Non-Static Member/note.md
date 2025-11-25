# ⭐ **If both NON-STATIC and STATIC variables have the SAME name → which one gets priority?**

The answer depends on **WHERE** you are accessing them.

# ⭐ Case 1 → Inside a **static method**

(example: inside `main()` or any `static` method)

👉 **STATIC variable gets priority**
because static methods cannot directly access non-static variables.

### Example:

```java
class Test {
    static int a = 10;
    int a = 20;  // non-static

    static void show() {
        System.out.println(a);  // ERROR ❌
    }
}
```

Static does NOT allow non-static.
So static variable gets priority.

✔ Priority: **STATIC > NON-STATIC**
(because non-static is NOT allowed without object)

To access non-static you MUST use an object:

```java
System.out.println(new Test().a);
```

---

# ⭐ Case 2 → Inside a **non-static method**

👉 **NON-STATIC variable gets first priority**

Because the object variable (instance variable) belongs to the object,
and the method is also running on that object.

### Example:

```java
class Demo {
    static int a = 10;
    int a = 20;  // instance variable

    void display() {
        System.out.println(a);   // prints 20 ✔ (non-static)
        System.out.println(this.a);  // 20 ✔ (non-static)
        System.out.println(Demo.a);  // 10 (static)
    }
}
```

✔ Priority: **NON-STATIC > STATIC**
because "a" means instance variable inside an object.

---

# ⭐ FINAL RULE (Super Easy to Remember)

| Where are you accessing the variable?         | Priority                                             |
| --------------------------------------------- | ---------------------------------------------------- |
| **Inside static method**                      | STATIC first (non-static not allowed without object) |
| **Inside non-static method**                  | NON-STATIC first                                     |
| **If a local variable exists with same name** | LOCAL gets highest priority                          |

---

# ⭐ Priority Order (Highest → Lowest)

Inside **non-static method**:

```
Local variable  >  Non-static (instance) variable  >  Static variable
```

Inside **static method**:

```
Local variable  >  Static variable  >  Non-static variable (object needed)
```

---

**static and non-static variables CAN have the same name in Java.**
This is **legal**, but you must understand how Java handles it.

Let me explain it clearly and simply.

---

# ⭐ **YES — Static & Non-Static variables can have SAME name**

Example:

```java
class Test {
    static int a = 10;   // static variable
    int a = 20;          // non-static variable (same name)
}
```

This is allowed ✔
No error ❌

But the **priority depends on where you use it**.

---

# ⭐ 1️⃣ **Inside a non-static method → non-static gets priority**

```java
class Test {
    static int a = 10;
    int a = 20;

    void show() {
        System.out.println(a);           // prints 20 (instance)
        System.out.println(this.a);      // prints 20 (instance)
        System.out.println(Test.a);      // prints 10 (static)
    }
}
```

✔ Non-static wins
✔ Static must be accessed using **ClassName**

---

# ⭐ 2️⃣ **Inside a static method → static gets priority**

```java
class Test {
    static int a = 10;
    int a = 20;

    static void display() {
        System.out.println(a);      // prints 10 (static)
        // System.out.println(this.a); ❌ ERROR: static can't use this
        // System.out.println(a); ❌ NON-STATIC NOT accessible here without object
    }
}
```

✔ Static wins
✔ Non-static NOT allowed without creating an object

---

# ⭐ 3️⃣ **If a local variable has same name → LOCAL wins always**

```java
class Test {
    static int a = 10;
    int a = 20;

    void check() {
        int a = 30;
        System.out.println(a);        // 30 (local)
        System.out.println(this.a);   // 20 (instance)
        System.out.println(Test.a);   // 10 (static)
    }
}
```

✔ Local > Instance > Static

---

# ⭐ Final Priority Rule (super easy)

Inside **static method**:

```
Local > Static > Instance (not allowed without object)
```

Inside **non-static method**:

```
Local > Instance > Static
```

---

# ⭐ Summary Answer

**YES**, static and non-static variables can have the **same name**.
Java allows it because:

- They live in **different memory areas**
- They belong to **different things** (class vs object)

---
