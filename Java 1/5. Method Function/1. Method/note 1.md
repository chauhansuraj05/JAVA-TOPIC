# 🌟 **WHAT IS RETURN TYPE?**

The **return type** tells Java:

👉 **What the method will give back**
👉 **What the method will return after finishing its work**

Every method either:

- **returns something**
- or **returns nothing**

---

# 🟩 **If method returns something → You must write a return type**

Example:

```java
int add() { ... }
```

This means:

✔ This method will return an **int**

Like giving back a number.

---

# 🟥 **If method returns nothing → Use `void`**

Example:

```java
void show() { ... }
```

This means:

✔ Method returns **nothing**

Like printing something and finishing.

---

# 🧠 **Kid-Level Explanation**

### Think of a method like a vending machine.

If the machine gives you **chips**, then return type = **chips**
If the machine gives you **water**, then return type = **water**
If the machine gives you **nothing**, return type = **void**

Return type tells Java:
**“What will come out of this method?”**

---

# 🔥 **Different Return Types**

| Return Type | Meaning          | Example Value |
| ----------- | ---------------- | ------------- |
| `int`       | returns number   | 10            |
| `double`    | decimal number   | 12.5          |
| `char`      | single letter    | 'A'           |
| `String`    | word or sentence | "Hello"       |
| `boolean`   | true/false       | true          |
| `void`      | returns nothing  | —             |

---

# 🎯 **Examples (VERY SIMPLE)**

## 📌 **1. Method returning int**

```java
int getAge() {
    return 20;
}
```

✔ returns 20
✔ return type = int

---

## 📌 **2. Method returning String**

```java
String getName() {
    return "Suraj";
}
```

✔ returns "Suraj"
✔ return type = String

---

## 📌 **3. Method returning char**

```java
char getGrade() {
    return 'A';
}
```

---

## 📌 **4. Method returning boolean**

```java
boolean isAdult() {
    return true;
}
```

---

## 📌 **5. Method returning NOTHING (void)**

```java
void showMessage() {
    System.out.println("Hello Java");
}
```

✔ prints something
✔ returns nothing

---

# 🎯 RULE YOU MUST REMEMBER

### ⭐ If method has a return type → it must use `return` keyword

Example:

```java
int test() {
    return 10;   // MUST
}
```

### ⭐ If method is void → NEVER returns value

Example:

```java
void test() {
    // No return value
}
```

---
