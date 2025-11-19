---
# 🚫 **Method Overriding ≠ Method Recursion**

They do two very different jobs.
---

# ✅ **1. METHOD OVERRIDING (Parent–Child)**

### ✔ Happens in **two classes**

- Parent class
- Child class

### ✔ Child class writes the **same method** again

Same:

- method name
- parameters
- return type

### ✔ Purpose:

Child changes the behavior of parent’s method.

### Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

🔹 Parent sound() → “Animal makes sound”
🔹 Child sound() → “Dog barks”

👉 Child **overrides** parent method.

---

# ✅ **2. METHOD RECURSION (Method calling itself)**

### ✔ Happens in **one method** only

### ✔ The method **calls itself again and again**

### Purpose:

To repeat a task until a condition is met.

### Example:

```java
int fact(int n) {
    if (n == 1) return 1;
    return n * fact(n - 1);   // recursion
}
```

👉 `fact()` calls **fact()**
👉 Like repeating cycle

---

# 🎯 **SUPER SIMPLE DIFFERENCE**

| Feature | Overriding                 | Recursion                 |
| ------- | -------------------------- | ------------------------- |
| Uses?   | 2 classes: Parent + Child  | Same method               |
| Purpose | Change parent’s method     | Make method repeat itself |
| Calls?  | Child overrides parent     | Method calls itself       |
| Keyword | Uses @Override             | No keyword                |
| Example | Dog overrides Animal sound | Factorial, Fibonacci      |

---

# 🧒 **Kid-Level Example**

### Overriding = Your dad says one rule → you change it

Dad: "Sleep at 10 PM"
You: "No, I sleep at 11 PM"

### Recursion = You calling your own name repeatedly

"Suraj… Suraj… Suraj… Suraj…"

---

---

# 🌟 **TYPES OF METHODS IN JAVA**

There are **4 main types** of methods.
Remember this chart:

```
               WITH RETURN     |     WITHOUT RETURN
--------------------------------------------------------
WITH PARAM     |      1         |            2
NO PARAM       |      3         |            4
```

Let’s learn them one by one.

---

# ✅ **1. Method WITH return & WITH parameters**

**→ Method takes something**
**→ Method gives something back**

### Example:

```java
int add(int a, int b) {
    return a + b;
}
```

### Explanation:

- You give **a** and **b**
- Method returns **sum**

### Use:

```java
int result = add(5, 10);
System.out.println(result);
```

---

# ✅ **2. Method WITHOUT return & WITH parameters**

**→ Method takes something**
**→ Method does NOT give return**

### Example:

```java
void greet(String name) {
    System.out.println("Hello " + name);
}
```

### Use:

```java
greet("Suraj");
```

---

# ✅ **3. Method WITH return & WITHOUT parameters**

**→ Method takes nothing**
**→ Method gives return**

### Example:

```java
int getLuckyNumber() {
    return 7;
}
```

### Use:

```java
int x = getLuckyNumber();
System.out.println(x);
```

---

# ✅ **4. Method WITHOUT return & WITHOUT parameters**

**→ Takes nothing**
**→ Returns nothing**

### Example:

```java
void showMessage() {
    System.out.println("Welcome to Java");
}
```

### Use:

```java
showMessage();
```

---

# 🌟 MASTER EXAMPLE (All 4 types together)

```java
class MethodsExample {

    int add(int a, int b) {           // 1. with return, with param
        return a + b;
    }

    void sub(int a, int b) {          // 2. no return, with param
        System.out.println(a - b);
    }

    int getNumber() {                 // 3. with return, no param
        return 100;
    }

    void display() {                  // 4. no return, no param
        System.out.println("Hello Java!");
    }

}
```

---

# 🚀 **Kid-Level Explanation**

Think of methods like **kitchen machines**:

| Type | Meaning                                                    | Example        |
| ---- | ---------------------------------------------------------- | -------------- |
| 1    | You give ingredients → machine gives food                  | Mixer          |
| 2    | You give ingredients → machine performs work, no food back | Grinder        |
| 3    | Machine gives something without taking anything            | Water purifier |
| 4    | Machine does work without taking or giving back            | Light switch   |

---
