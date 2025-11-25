// Static Initialization Block(SIB)

class StaticBlockExample {

    // static block
    static {
        System.out.println("Static block executed before main method");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}

// # ⭐ **Explanation**

// ### ✔ What is a static block?

// A static block is a special block in Java that runs:

// 👉 **Automatically when the class is loaded**
// 👉 **Before the main() method starts**

// ### ✔ When does it run?

// * You don't call it
// * You don’t need to create an object
// * It runs **only one time**

// ---

// # ⭐ **Output**

// ```
// Static block executed before main method
// Main method executed
// ```

// ---

// # ⭐ Why do we use static blocks?

// * To initialize static variables
// * To load configurations
// * To run something one time before main() starts

// Example:

// ```java
// static int x;

// static {
// x = 10;
// }
// ```

// ---
