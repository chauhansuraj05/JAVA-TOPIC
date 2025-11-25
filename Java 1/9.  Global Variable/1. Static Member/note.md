Here are the **MOST IMPORTANT points about static members** that interviewers ALWAYS ask.
If you learn these, you will answer **any static-related interview question** easily.

---

# ⭐ **STATIC MEMBER – 10 MUST-KNOW INTERVIEW POINTS**

---

# ✅ **1. Static members belong to the class, not the object**

- A static variable/method is shared by **all objects**.
- Only **one copy** exists in memory.

**Example:**

```java
static int count = 0;
```

**Interview Question:**

> How many copies of a static variable exist?
> ✔ Only **one**, shared across the class.

---

# ✅ **2. Static methods cannot access non-static (instance) members directly**

Because static methods don’t belong to an object.

❌ Not allowed:

```java
static void show() {
    System.out.println(name); // error (name is instance variable)
}
```

✔ Allowed:

```java
static void show() {
    StaticClass obj = new StaticClass();
    System.out.println(obj.name);
}
```

**Interview Question:**

> Why static methods cannot use instance variables?
> ✔ Because instance variables belong to objects, but static methods do not.

---

# ✅ **3. Static methods CAN access static variables**

Because both belong to the class.

```java
static int x = 10;

static void show() {
    System.out.println(x);
}
```

---

# ✅ **4. Static methods cannot use the “this” or “super” keywords**

Because `this` and `super` refer to **objects**, but static methods have **no object**.

**Interview Question:**

> Why can't static method use “this”?
> ✔ There is no object for “this” to reference.

---

# ✅ **5. Main method is static**

```java
public static void main(String[] args)
```

Because JVM calls it **without creating an object**.

**Interview Question:**

> Why is main() method static?
> ✔ So JVM can call it directly when program starts.

---

# ✅ **6. Static block runs before main()**

Used for static initialization.

```java
static {
    System.out.println("Runs before main");
}
```

---

# ✅ **7. Static members load when the class is loaded into memory**

Even before object creation.

Interview Question:

> When does static memory get allocated?
> ✔ At class loading time (not object creation).

---

# ✅ **8. You can call static methods using class name**

Example:

```java
Math.sqrt(25);
StaticClass.display();
```

---

# ✅ **9. Static methods can be overloaded**

```java
static void fun() {}
static void fun(int x) {}
```

---

# ❌ **10. Static methods CANNOT be overridden**

Because overriding works only with objects, but static methods don’t belong to objects.

Only **method hiding** happens.

**Interview Question:**

> Can static methods be overridden?
> ❌ No. They get hidden, not overridden.

---

# 🌟 BONUS: Interview Summary — 10 Points (Short Version)

1. Shared by class, not objects
2. Only one copy in memory
3. Cannot access instance variables directly
4. Cannot use **this**, **super**
5. main() is static
6. Static block runs before main
7. Loaded when class loads
8. Called using class name
9. Can be overloaded
10. Cannot be overridden (only hidden)

---
