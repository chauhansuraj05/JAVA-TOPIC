class FactorialExample {

    static int factorial(int n) {
        if (n == 1) {
            return 1; // base condition
        }

        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}

// ---

// # ⭐ **2. Recursion Program — Factorial**

// ### ✅ Code:

// ```java
// static int factorial(int n) {
// if (n == 1) {
// return 1;
// }

// return n * factorial(n - 1);
// }
// ```

// ---

// # 📘 **Line-by-Line Explanation**

// ### `static int factorial(int n) {`

// * A method that returns an **int**
// * Calculates factorial of number `n`

// ---

// ### `if (n == 1) {`

// * If n becomes **1**, stop recursion.

// ---

// ### `return 1;`

// * 1! = 1
// * This is the **base case** to stop calling method again.

// ---

// ### `return n * factorial(n - 1);`

// * Recursive call

// * Example:
// `5 * factorial(4)`
// `4 * factorial(3)`
// `3 * factorial(2)`
// `2 * factorial(1)` → 1

// * The multiplication happens after the recursion unwinds.

// ---
