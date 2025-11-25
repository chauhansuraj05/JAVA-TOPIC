---
# ⭐ **10 Practice Questions on Non-Static Block**
---

## **1️⃣ When does a non-static block run?**

**Answer:**
Every time an object is created.

---

## **2️⃣ Does a non-static block run before or after the constructor?**

**Answer:**
Before the constructor.

---

## **3️⃣ How many times will the non-static block run if you create 5 objects?**

**Answer:**
5 times (once for each object).

---

## **4️⃣ Write a program with one class where non-static block prints a message.**

```java
class A {
    {
        System.out.println("Non-static block executed");
    }
}
```

---

## **5️⃣ What is the difference between static block and non-static block?**

**Answer (easy):**

| Static Block                   | Non-Static Block                 |
| ------------------------------ | -------------------------------- |
| Runs once                      | Runs for every object            |
| Runs when class loads          | Runs when object is created      |
| Used for static initialization | Used for instance initialization |

---

## **6️⃣ Write a program where non-static block initializes a variable.**

```java
class Example {
    int x;

    {
        x = 20;
        System.out.println("x initialized in non-static block");
    }
}
```

---

## **7️⃣ Can a non-static block access static variables?**

**Answer:**
Yes (non-static can access everything).

---

## **8️⃣ Can a static method access a non-static block?**

**Answer:**
No, static method cannot run non-static block directly.
It runs only when object is created.

---

## **9️⃣ Arrange in correct order: constructor, main(), static block, non-static block**

**Correct order:**

1. Static block
2. main()
3. Non-static block
4. Constructor

---

## **🔟 Write output of this program:**

```java
class Test {
    {
        System.out.println("A");
    }

    Test() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("C");
        new Test();
        new Test();
    }
}
```

**Output:**

```
C
A
B
A
B
```

---
