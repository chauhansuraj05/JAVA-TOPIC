---

# ⭐ **1. Print numbers from 1 to N (ascending)**

### **Problem**

Write a recursive method to print numbers from **1 to n**.

### **Code**

```java
static void printAsc(int n) {
    if (n == 0) return;
    printAsc(n - 1);
    System.out.println(n);
}
```

### **Explanation**

* First whole recursion goes DOWN until 0
* Then prints while coming BACK UP

---

# ⭐ **2. Print numbers from N to 1 (descending)**

### **Problem**

Print numbers from **n down to 1** using recursion.

### **Code**

```java
static void printDesc(int n) {
    if (n == 0) return;
    System.out.println(n);
    printDesc(n - 1);
}
```

---

# ⭐ **3. Factorial using recursion**

### **Problem**

Find factorial of `n`.

### **Code**

```java
static int factorial(int n) {
    if (n == 1) return 1;
    return n * factorial(n - 1);
}
```

### **Example**

5! → 5×4×3×2×1 → 120

---

# ⭐ **4. Sum of digits of a number**

### **Problem**

Input: 1234 → Output: 10

### **Code**

```java
static int sumOfDigits(int n) {
    if (n == 0) return 0;
    return (n % 10) + sumOfDigits(n / 10);
}
```

---

# ⭐ **5. Reverse a number**

### **Problem**

Input: 123 → Output: 321

### **Code**

```java
static int reverse(int n, int rev) {
    if (n == 0) return rev;
    return reverse(n / 10, rev * 10 + (n % 10));
}
```

Usage:

```java
System.out.println(reverse(123, 0));
```

---

# ⭐ **6. Fibonacci Series (recursive)**

### **Problem**

Print the nth Fibonacci number.

### **Code**

```java
static int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}
```

**Example:**
fib(5) → 5

---

# ⭐ **7. Sum of 1 to n**

### **Problem**

Find sum: 1 + 2 + ... + n

### **Code**

```java
static int sum(int n) {
    if (n == 0) return 0;
    return n + sum(n - 1);
}
```

---

# ⭐ **8. Count digits in a number**

### **Problem**

Input = 56789 → Output = 5

### **Code**

```java
static int countDigits(int n) {
    if (n == 0) return 0;
    return 1 + countDigits(n / 10);
}
```

---

# ⭐ **9. Power function (aⁿ) using recursion**

### **Problem**

Calculate aⁿ

### **Code**

```java
static int power(int a, int n) {
    if (n == 0) return 1;
    return a * power(a, n - 1);
}
```

---

# ⭐ **10. Check palindrome (recursion)**

### **Problem**

Input: “madam” → palindrome
Input: “hello” → not palindrome

### **Code**

```java
static boolean isPalindrome(String s, int start, int end) {
    if (start >= end) return true;
    if (s.charAt(start) != s.charAt(end)) return false;
    return isPalindrome(s, start + 1, end - 1);
}
```

Usage:

```java
System.out.println(isPalindrome("madam", 0, 4));
```

---
