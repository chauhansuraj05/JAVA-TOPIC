---
# 🔥 **20 Advanced Practice Questions (with short answers)**
---

## **1️⃣ Can a class have multiple non-static blocks?**

✔ Yes, and they run in the order they appear.

---

## **2️⃣ What is the order of multiple non-static blocks?**

```java
{
  System.out.println("Block 1");
}
{
  System.out.println("Block 2");
}
```

**Output:**

```
Block 1
Block 2
```

---

## **3️⃣ Will non-static block run without object creation?**

❌ No, object must be created.

---

## **4️⃣ Does non-static block run before or after instance variables initialization?**

✔ After instance variables are assigned memory,
✔ Before constructor.

---

## **5️⃣ What happens when constructor throws exception?**

Non-static block still runs before exception.

---

## **6️⃣ Can non-static block contain return statement?**

❌ No (compiler error).

---

## **7️⃣ Can we call methods inside a non-static block?**

✔ Yes, both static and non-static methods.

---

## **8️⃣ Can non-static block initialize an array?**

✔ Yes.

```java
{
    arr = new int[]{1,2,3};
}
```

---

## **9️⃣ Can non-static block contain loops?**

✔ Yes.

---

## **🔟 Are non-static blocks useful in real projects?**

💡 Rarely, but sometimes used for:

- Reusable instance initialization
- File reading per object
- Logging

---

## **1️⃣1️⃣ Write output:**

```java
class A {
    int x = 10;

    {
        x = x + 5;
        System.out.println(x);
    }

    A() {
        System.out.println(x + 5);
    }

    public static void main(String[] args) {
        new A();
    }
}
```

**Output:**

```
15
20
```

---

## **1️⃣2️⃣ Can non-static block modify static variables?**

✔ Yes.

---

## **1️⃣3️⃣ Which is faster? Static block or non-static block?**

Static block (runs once).
Non-static block runs every time → slower.

---

## **1️⃣4️⃣ What if class has only non-static block but no constructor?**

Default constructor runs after the block.

---

## **1️⃣5️⃣ Write output:**

```java
class B {

    {
        System.out.println("X");
    }
    {
        System.out.println("Y");
    }

    B() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new B();
    }
}
```

**Output:**

```
X
Y
Z
```

---

## **1️⃣6️⃣ Write output (tricky):**

```java
class A {

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        System.out.println("3");
        new A();
        System.out.println("4");
    }
}
```

**Output:**

```
1
3
2
4
```

---

## **1️⃣7️⃣ Can we use `super` inside a non-static block?**

✔ Yes, because it's connected to object.

---

## **1️⃣8️⃣ Are non-static blocks executed for anonymous objects?**

```java
new A();
```

✔ Yes.

---

## **1️⃣9️⃣ Can we use `this` inside non-static block?**

✔ Yes.

---

## **2️⃣0️⃣ Can a non-static block override behavior in subclass?**

✔ Non-static block executes before subclass constructor.

---

# ⭐ **DIAGRAM: STATIC vs NON-STATIC EXECUTION ORDER**

```
                ┌───────────────────────────┐
                │     Program Starts        │
                └─────────────┬─────────────┘
                              ▼
                   ┌─────────────────┐
                   │ Static Block    │
                   └─────────────────┘
                              ▼
                   ┌─────────────────┐
                   │ main() Method   │
                   └─────────────────┘
                              ▼
             ┌─────────────────────────────────────┐
             │ Object Created (new keyword used)   │
             └─────────────────────┬──────────────┘
                                   ▼
                         ┌─────────────────┐
                         │ Non-Static Vars │
                         └─────────────────┘
                                   ▼
                         ┌─────────────────┐
                         │ Non-Static Block│
                         └─────────────────┘
                                   ▼
                         ┌─────────────────┐
                         │ Constructor     │
                         └─────────────────┘
                                   ▼
                         ┌─────────────────┐
                         │ Object Ready!   │
                         └─────────────────┘
```

---

# ⭐ **CHEAT SHEET (Learn in 5 seconds)**

### **👉 Static runs ONCE.**

### **👉 Non-static runs EVERY TIME.**

### **👉 Order = S S M N C**

- **S** → Static Block
- **S** → Static Variables
- **M** → main()
- **N** → Non-static Block
- **C** → Constructor

---
