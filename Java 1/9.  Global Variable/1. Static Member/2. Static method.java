// Static Context
class StaticExample {

    static void greet() { // static method
        System.out.println("Hello, this is a static method!");
    }

    public static void main(String[] args) {

        greet(); // calling static method directly (NO object needed)

        StaticExample.greet(); // also correct
    }
}

// ---

// # ⭐ **Explanation (Super Simple)**

// ### ✔ `static void greet()`

// * This is a **static method**
// * It belongs **to the class**, not to an object.

// ### ✔ How to call it?

// You can call a static method in two ways:

// ### 1️⃣ **Directly inside main()**

// ```
// greet();
// ```

// ### 2️⃣ **Using class name**

// ```
// StaticExample.greet();
// ```

// ### ❌ No need to create object:

// ```
// StaticExample obj = new StaticExample(); // NOT required
// ```

// ---

// # ⭐ Output

// ```
// Hello, this is a static method!
// Hello, this is a static method!
// ```

// ---

// # ⭐ Why use static method?

// * For utility functions
// * For math operations
// * For methods that don’t depend on object values
// * For main method (`public static void main`)

// ---
