// # 🍭 1. What is Increment (++)?

// **Increment = increase by 1**
// Think of a game where your score goes up by 1.

// Example:

// `java
// int x = 5;
// x++;
// `

// Meaning:

// _ You had **5 chocolates**
// _ `x++` gives you **one more**
// \* Now you have **6 chocolates**

// ---

// # 🍬 2. What is Decrement (--)?

// **Decrement = decrease by 1**
// Think of someone taking 1 chocolate from you.

// Example:

// `java
// int x = 5;
// x--;
// `

// Meaning:

// _ You had **5 chocolates**
// _ Someone takes 1
// \* Now you have **4 chocolates**

// ---

// # 🎯 3. Postfix & Prefix (The Kid Version)

// ## 🍭 A) POST increment (x++)

// **"First use the number, then increase it."**

// Story:
// You have **5 rupees**, you tell your friend "I have 5."
// AFTER telling, your dad gives you +1 rupee.

// Example:

// `java
// int x = 5;
// System.out.println(x++);  
// `

// Output: **5**
// Then x becomes **6**.

// ---

// ## 🍬 B) PRE increment (++x)

// **"First increase the number, then use it."**

// Story:
// Your dad gives +1 rupee first,
// Then you tell your friend how much money you have now.

// Example:

// `java
// int x = 5;
// System.out.println(++x);
// `

// Output: **6** (because it increased first)

// ---

// # 🔥 4. POST decrement (x--)

// **"First use the number, then decrease it."**

// Story:
// You show your friend **5 candies**,
// Then you eat 1 candy.

// Example:

// `java
// int x = 5;
// System.out.println(x--);
// `

// Output: **5**
// Then x becomes **4**

// ---

// # ❄️ 5. PRE decrement (--x)

// **"First decrease the number, then use it."**

// Story:
// You eat 1 candy first,
// Then tell your friend how many are left.

// Example:

// `java
// int x = 5;
// System.out.println(--x);
// `

// Output: **4**

// ---

// # ⚡ 6. Positive & Negative Values with ++ and --

// ### A) Positive Number Example

// `java
// int x = 10;
// x++;
// `

// 10 becomes **11**
// Because **++ always adds 1**, even if number is positive.

// ---

// ### B) Negative Number Example

// `java
// int x = -5;
// x++;
// `

// -5 becomes **-4**
// Because you still **add +1**, so number moves toward 0.

// Think:

// _ You are at -5 degree cold
// _ Adding +1 makes it less cold → -4

// ---

// ### C) Negative Number with Decrement

// java
// int x = -5;
// x--;

// -5 becomes **-6**
// Because you **subtract 1**, going more negative.

// // Think:

// // _ From -5°C
// // _ Going even colder becomes -6°C

// // ---

// // # 🧠 Suraj’s Magic Memory Trick

// // _ `++` = add 1
// // _ `--` = subtract 1
// // _ **POST (x++)** = use first, change later
// // _ **PRE (++x)** = change first, use later

Sure Suraj! 👦🔥
Here is **each question + answer + kid-style explanation TOGETHER**.
Short, simple, and super clear.

---

# ✅ **1)**

```java
int x = 5;
int y = x++ + ++x + x-- + --x;
```

### ✔ Answer: x = **5**, y = **24**

### ⭐ Explanation:

- `x++` → use 5, x=6
- `++x` → x=7
- `x--` → use 7, x=6
- `--x` → x=5
- y = 5 + 7 + 7 + 5 = 24

---

# ✅ **2)**

```java
int a = 3;
int b = 2 * a++ + ++a - a-- + --a;
```

### ✔ Answer: a = **3**, b = **9**

### ⭐ Explanation:

- `a++` → 3 (a=4)
- `++a` → 5
- `a--` → 5 (a=4)
- `--a` → 3
  b = 2\*3 + 5 - 5 + 3 = 9

---

# ✅ **3)**

```java
int n = -4;
int m = ++n + n++ + n-- + --n + n;
```

### ✔ Answer: n = **-4**, m = **-16**

### ⭐ Explanation:

- ++n → -3
- n++ → -3 (n=-2)
- n-- → -2 (n=-3)
- --n → -4
  m = -3 + -3 + -2 + -4 + -4 = -16

---

# ✅ **4)**

```java
int a = 1;
int b = a++ + ++a + a++ + ++a;
```

### ✔ Answer: a = **5**, b = **12**

### ⭐ Explanation:

1 + 3 + 3 + 5 = 12

---

# ✅ **5)**

```java
int x = 10;
int y = x-- - --x + ++x - x++;
```

### ✔ Answer: x = **10**, y = **2**

### ⭐ Explanation:

10 - 8 + 9 - 9 = 2

---

# ✅ **6)**

```java
int p = -1;
int q = p++ - p-- + ++p + --p + p;
```

### ✔ Answer: p = **-1**, q = **-3**

### ⭐ Explanation:

-1 - 0 + 0 - 1 + -1 = -3

---

# ✅ **7)**

```java
int[] arr = {5,10,15,20};
int x = 1;
int y = arr[x++] + arr[++x];
```

### ✔ Answer: x = **3**, y = **30**

---

# ✅ **8)**

```java
int[] a = {2,4,6,8};
int i = 0;
int sum = a[i++] + a[++i] + a[i--] + a[--i];
```

### ✔ Answer: i = **0**, sum = **16**

---

# ✅ **9)**

```java
int x = 0;
for(int i = 0; i < 4; i++){
    x = x + i++ + ++i;
}
```

### ✔ Answer: x = **8**

---

# ✅ **10)**

```java
int s = 1;
for(int i = 1; i <= 3; i++){
    s = s * (i++ + ++i);
}
```

### ✔ Answer: s = **32**

---

# ✅ **11)**

```java
test(n) = n++ + ++n
```

### ✔ Answer: x = **7**, y = **28**

---

# ✅ **12)**

```java
fun(x) = x-- + ++x
```

### ✔ Answer: a = **1**, b = **10**

---

# ✅ **13)**

```java
int x = 2;
int y = x++ + ++x + (x-- * --x);
```

### ✔ Answer: x = **2**, y = **14**

---

# ✅ **14)**

```java
int p = -2;
int q = ++p - p++ + p-- - --p + (p++ * ++p);
```

### ✔ Answer: p = **0**, q = **-3**

---

# ✅ **15)**

```java
int k = 1;
k = k++ + ++k + k++ + ++k + k;
```

### ✔ Answer: k = **17**

---

# ✅ **16)**

```java
int x = 0;
int y = ++x + x++ + x++ + ++x + --x + x--;
```

### ✔ Answer: x = **2**, y = **10**

---

# ✅ **17)**

```java
int a = -3;
int b = a++ + ++a + --a + a-- + a + ++a;
```

### ✔ Answer: a = **-2**, b = **-9**

---

# ✅ **18)**

```java
int p = 5;
int q = (p++ + ++p) * (p-- + --p);
```

### ✔ Answer: p = **5**, q = **144**

---

# ✅ **19)**

```java
int x = 1;
int y = (x++ + ++x + x-- + --x) - (x++ * ++x);
```

### ✔ Answer: x = **2**, y = **-3**

---

# ✅ **20)**

```java
int m = -1;
int n = (++m * m++) + (m-- + --m) + (m++ * ++m);
```

### ✔ Answer: m = **1**, n = **3**

---
