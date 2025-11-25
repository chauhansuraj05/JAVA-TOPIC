---
# ✅ **How to Make a Conditional Statement Infinite?**

You can make a loop **infinite** by giving a condition that is **always true**.
---

# ✅ **Ways to Make an Infinite Loop**

---

## **1. Using `while(true)`**

```java
while(true){
    System.out.println("Running...");
}
```

- `true` is always true → loop never stops.

---

## **2. Using `for(;;)`**

```java
for(;;){
    System.out.println("Infinite for loop");
}
```

- No condition → automatically infinite.

---

## **3. Using a Condition That Never Becomes False**

Example:

```java
int i = 1;
while(i == 1){
    System.out.println("Infinite");
}
```

- `i` is always `1`
- You never change `i`
- Condition stays true forever

---

## **4. Using a Condition That Grows Forever**

```java
for(int i = 1; i >= 1; i++){
    System.out.println(i);
}
```

**Why infinite?**

- `i >= 1` will always remain true because `i` keeps increasing.
- So it never becomes false.

---

## **5. Using Negative Direction**

```java
for(int i = 5; i <= 5; i--){
    System.out.println(i);
}
```

**Why infinite?**

- `i` keeps decreasing (5 → 4 → 3 → 2 → …)
- Condition is `i <= 5` → always true
- Infinite loop.

---

# ⭐ Most Important Rule:

**To make any loop infinite → Make sure condition never becomes false.**
