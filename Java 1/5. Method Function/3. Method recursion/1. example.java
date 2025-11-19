class RecursionExample {

    static void printNumber(int n) {
        if (n == 0) {
            return; // stop calling again
        }

        System.out.println(n);
        printNumber(n - 1); // calling itself
    }

    public static void main(String[] args) {
        printNumber(5);
    }
}

// ---

// # ⭐ **1. Recursion Program — Print Numbers**

// ### ✅ Code:

// ```
// static void printNumber(int n) {
// if (n == 0) {
// return;
// }

// System.out.println(n);
// printNumber(n - 1);
// }
// ```

// ---

// # 📘 **Line-by-Line Explanation**

// ### `static void printNumber(int n) {`

// * A method named `printNumber`
// * It receives **one number n**

// ---

// ### `if (n == 0) {`

// * If `n` becomes **0**, stop recursion.

// ---

// ### `return;`

// * Exit the method completely.
// * This line is the **base condition** (stopping point).

// ---

// ### `System.out.println(n);`

// * Print the current value of `n`.

// ---

// ### `printNumber(n - 1);`

// * Call the SAME method again
// * With `n` reduced by **1**
// * This is the **recursive call**.

// ---

// **Process:**
// 5 → 4 → 3 → 2 → 1 → stop

// ---
