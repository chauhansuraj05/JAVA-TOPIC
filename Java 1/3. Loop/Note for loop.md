---

# ✅ **1. Normal Increasing For Loop**

- Used when you want to run from small → big numbers.

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

**Meaning:**

- `int i = 1;` → start from 1
- `i <= 5;` → stop at 5
- `i++` → increase by 1

---

# ✅ **2. Decreasing For Loop**

- Used when you want to count backward.

```java
for(int i = 5; i >= 1; i--){
    System.out.println(i);
}
```

**Meaning:**
Start 5 → go till 1 → decrease every time.

---

# ✅ **3. For Loop With Step Size**

- When skipping numbers.

```java
for(int i = 0; i <= 10; i += 2){
    System.out.println(i);
}
```

**Meaning:**
Adds 2 each time → prints even numbers.

---

# ✅ **4. Infinite For Loop**

- Be careful 😄

```java
for(;;){
    System.out.println("Running...");
}
```

**Meaning:**
No condition → runs forever.

---

# ✅ **5. For Loop Without Initialization**

```java
int i = 1;
for(; i <= 5; i++){
    System.out.println(i);
}
```

**Meaning:**
Variable is created outside.

---

# ✅ **6. For Loop Without Condition**

```java
for(int i = 1; ; i++){
    System.out.println(i);
}
```

**Meaning:**
Since no condition, it becomes infinite.

---

# ✅ **7. For Loop Without Increment**

```java
for(int i = 1; i <= 5; ){
    System.out.println(i);
    i++;  // increment manually
}
```

**Meaning:**
You increment inside the loop.

---

# ✅ **8. Enhanced For Loop (For-each Loop)**

Used with arrays or lists — very simple.

```java
int[] nums = {10, 20, 30};

for(int n : nums){
    System.out.println(n);
}
```

**Meaning:**
Each value from `nums` comes one-by-one into `n`.

---

# ✅ **9. Nested For Loop**

For patterns or tables.

```java
for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= 3; j++){
        System.out.print(j + " ");
    }
    System.out.println();
}
```

---

# ✅ **10. Using For Loop With Break**

```java
for(int i = 1; i <= 10; i++){
    if(i == 5) break;
    System.out.println(i);
}
```

**Meaning:**
Stops loop when i becomes 5.

---

# ✅ **11. Using For Loop With Continue**

```java
for(int i = 1; i <= 5; i++){
    if(i == 3) continue;
    System.out.println(i);
}
```

**Meaning:**
Skips 3 but continues rest.

---
