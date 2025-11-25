class Counter {

    static int count = 0; // static variable (shared by all objects)

    Counter() {
        count++; // increases the same count for every object
    }

    void show() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.count);

        c1.show(); // prints 3
        c2.show(); // prints 3
        c3.show(); // prints 3
    }
}

// ---

// # ⭐ Explanation (Very Simple)

// ### ✔ `static int count = 0;`

// * This variable belongs to the **class**, NOT to objects.
// * All objects share the **same** variable.

// ### ✔ Constructor

// Each time you create an object, it increases `count`.

// ### ✔ Because it is static:

// * Only **one copy** of `count` exists.
// * All objects update the same `count`.

// ---

// # ⭐ Output

// ```
// Count = 3
// Count = 3
// Count = 3
// ```
