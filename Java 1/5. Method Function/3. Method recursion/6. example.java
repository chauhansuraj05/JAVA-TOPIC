class rama {
    public static void main(String[] args) {
        System.out.println(number(95));
    }

    public static int number(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return number(number(n + 11));
        }
    }
}

// ---

// # ⭐ **Line-by-Line Explanation**

// ---

// ## **`System.out.println(number(95));`**

// You are calling:

// ```
// number(95)
// ```

// So the recursion starts with **n = 95**

// ---

// # ⭐ Understanding the `number()` method

// ```java
// public static int number(int n) {
// ```

// * The method takes one number `n`
// * It will return an integer

// ---

// ## ✔ **CASE 1 — If n > 100**

// ```java
// if (n > 100) {
// return n - 10;
// }
// ```

// Example:
// `number(105)` → returns **95**

// ---

// ## ✔ **CASE 2 — If n ≤ 100**

// ```java
// else {
// return number(number(n + 11));
// }
// ```

// This means:

// 1️⃣ First call:
// `number(n + 11)`

// 2️⃣ Second call:
// Take the result of first call and again pass it to `number()`

// This is **double recursion**.
// Very powerful and tricky.

// ---

// # ⭐ **What happens for number(95)?**

// Let’s trace it step-by-step:

// ### **Step 1**

// ```
// number(95)
// → number(number(95 + 11))
// → number(number(106))
// ```

// ### **Step 2**

// ```
// number(106)
// Since 106 > 100 → return 106 - 10 = 96
// ```

// So now we have:

// ```
// number(number(106)) = number(96)
// ```

// ---

// ### **Step 3: Now evaluate number(96)**

// ```
// number(96)
// = number(number(96 + 11))
// = number(number(107))
// ```

// ### **Step 4**

// ```
// number(107)
// 107 > 100 → return 97
// ```

// So:

// ```
// number(96) = number(97)
// ```

// ---

// This keeps happening:

// ```
// number(95) → number(96)
// number(96) → number(97)
// number(97) → number(98)
// ...
// number(100) → number(101)
// ```

// Eventually:

// ### **When n = 100**

// ```
// number(100)
// = number(number(111))
// ```

// Since 111 > 100:

// ```
// number(111) = 101
// ```

// So:

// ```
// number(100) = number(101)
// ```

// And because 101 > 100:

// ```
// number(101) = 91
// ```

// ---

// # ⭐ **Final Answer**

// For ANY number from **1 to 100**,
// this function always returns **91**.

// So:

// ```
// number(95) = 91
// ```

// ---

// # ⭐ **Why does it always return 91?**

// Because the recursion climbs up until it goes above 100
// → subtracts 10
// → and bounces back down to 91.

// This is a famous behavior of the **McCarthy 91 function**.

// ---

// # ⭐ Final Output

// ```
// 91
// ```

// ---

// number(95)
// └── number(number(106))
// └── number(96)
// └── number(number(107))
// └── number(97)
// └── number(number(108))
// └── number(98)
// └── number(number(109))
// └── number(99)
// └── number(number(110))
// └── number(100)
// └── number(number(111))
// ├── number(111) → 101
// └── number(101)
// └── 101 > 100 → 91
