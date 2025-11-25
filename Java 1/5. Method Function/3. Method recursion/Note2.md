---
# ⭐ **LEVEL 1 — BASIC RECURSION**
---

## ✅ **1. Print 1 to N**

### ✔ Code

```java
void print1ToN(int n){
    if(n == 0) return;
    print1ToN(n-1);
    System.out.println(n);
}
```

### ✔ Input

`print1ToN(5);`

### ✔ Expected Output

```
1
2
3
4
5
```

---

## ✅ **2. Print N to 1**

### ✔ Code

```java
void printNTo1(int n){
    if(n == 0) return;
    System.out.println(n);
    printNTo1(n-1);
}
```

### ✔ Input

`printNTo1(5);`

### ✔ Expected Output

```
5
4
3
2
1
```

---

## ✅ **3. Sum of Digits**

### ✔ Code

```java
int sumDigits(int n){
    if(n == 0) return 0;
    return (n % 10) + sumDigits(n / 10);
}
```

### ✔ Input

`sumDigits(1234)`

### ✔ Expected Output

```
10
```

Because → 1 + 2 + 3 + 4 = 10

---

## ✅ **4. Factorial**

### ✔ Code

```java
int fact(int n){
    if(n == 0) return 1;
    return n * fact(n-1);
}
```

### ✔ Input

`fact(5)`

### ✔ Expected Output

```
120
```

Because → 5×4×3×2×1

---

## ✅ **5. Power (n^p)**

### ✔ Code

```java
int power(int n, int p){
    if(p == 0) return 1;
    return n * power(n, p-1);
}
```

### ✔ Input

`power(2, 5)`

### ✔ Expected Output

```
32
```

---

# ⭐ **LEVEL 2 — ARRAYS RECURSION**

---

## ✅ **6. Search element in array**

### ✔ Code

```java
boolean search(int[] arr, int idx, int target){
    if(idx == arr.length) return false;
    if(arr[idx] == target) return true;
    return search(arr, idx+1, target);
}
```

### ✔ Input

Array = `{3, 8, 1, 9}`
Search = `9`

### ✔ Expected Output

```
true
```

---

## ✅ **7. Max element in array**

### ✔ Code

```java
int maxElement(int[] arr, int idx){
    if(idx == arr.length - 1) return arr[idx];
    return Math.max(arr[idx], maxElement(arr, idx+1));
}
```

### ✔ Input

`{5, 2, 9, 1}`

### ✔ Expected Output

```
9
```

---

## ✅ **8. Print Array**

### ✔ Code

```java
void printArr(int[] arr, int idx){
    if(idx == arr.length) return;
    System.out.println(arr[idx]);
    printArr(arr, idx+1);
}
```

### ✔ Input

`{10, 20, 30}`

### ✔ Expected Output

```
10
20
30
```

---

## ✅ **9. Reverse Array**

### ✔ Code

```java
void reverseArr(int[] arr, int start, int end){
    if(start >= end) return;

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    reverseArr(arr, start+1, end-1);
}
```

### ✔ Input

`{1, 2, 3, 4}`

### ✔ Expected Output

```
4 3 2 1
```

---

# ⭐ **LEVEL 3 — STRING RECURSION**

---

## ✅ **10. Reverse String**

### ✔ Code

```java
String reverse(String s){
    if(s.length() == 0) return "";
    return reverse(s.substring(1)) + s.charAt(0);
}
```

### ✔ Input

`reverse("abc")`

### ✔ Expected Output

```
cba
```

---

## ✅ **11. Palindrome Check**

### ✔ Code

```java
boolean isPalin(String s, int i, int j){
    if(i >= j) return true;
    if(s.charAt(i) != s.charAt(j)) return false;
    return isPalin(s, i+1, j-1);
}
```

### ✔ Input

`"madam"`

### ✔ Expected Output

```
true
```

---

## ✅ **12. Remove Duplicates**

### ✔ Code

```java
String removeDup(String s){
    if(s.length() <= 1) return s;
    if(s.charAt(0) == s.charAt(1))
        return removeDup(s.substring(1));
    return s.charAt(0) + removeDup(s.substring(1));
}
```

### ✔ Input

`"aabbcc"`

### ✔ Expected Output

```
abc
```

---

## ✅ **13. Print All Subsequences**

### ✔ Code

```java
void subseq(String s, String ans){
    if(s.length() == 0){
        System.out.println(ans);
        return;
    }

    char ch = s.charAt(0);
    subseq(s.substring(1), ans + ch); // include
    subseq(s.substring(1), ans);      // skip
}
```

### ✔ Input

`"ab"`

### ✔ Expected Output

```
ab
a
b
(blank line)
```

---

# ⭐ **LEVEL 4 — PATTERNS / NUMBER RECURSION**

---

## ✅ **14. Pattern (stars)**

### ✔ Input

`pattern(3)`

### ✔ Output

```
*
* *
* * *
```

---

## ✅ **15. Tower of Hanoi (2 disks)**

### ✔ Output

```
Move disk 1 from A to B
Move disk 2 from A to C
Move disk 1 from B to C
```

---

## ✅ **16. Fibonacci**

### ✔ Input

`fib(6)`

### ✔ Output

```
8
```

Sequence: 0 1 1 2 3 5 8

---

# ⭐ **LEVEL 5 — ADVANCED BACKTRACKING**

---

## ✅ **17. Permutations of “abc”**

### ✔ Output

```
abc
acb
bac
bca
cab
cba
```

---

## ✅ **18. Subset Sum**

Array = `{3, 1, 5}`
Target = `6`

### ✔ Output

```
true
```

Because 1 + 5 = 6.

---
