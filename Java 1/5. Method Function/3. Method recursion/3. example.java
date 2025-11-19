class SumExample {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // 15
    }
}

// # ⭐ **3. Recursion Program — Sum of 1 to n**

// ### ✅ Code:

// ```java
// static int sum(int n) {
// if (n == 0) {
// return 0;
// }

// return n + sum(n - 1);
// }
// ```

// ---

// # 📘 **Line-by-Line Explanation**

// ### `static int sum(int n) {`

// * A method that returns the **sum** of numbers from 1 to n

// ---

// ### `if (n == 0) {`

// * If n becomes **0**, stop recursion.

// ---

// ### `return 0;`

// * 0 is the identity for addition
// (Adding 0 doesn't change the result)

// ---

// ### `return n + sum(n - 1);`

// * Recursive call
// * Example:

// ```
// sum(5) = 5 + sum(4)
// 4 + sum(3)
// 3 + sum(2)
// 2 + sum(1)
// 1 + sum(0) → 0
// ```
// * Recursion stops when n = 0

// ---
