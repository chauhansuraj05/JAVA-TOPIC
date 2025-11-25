class Student {

    // non-static variable (instance variable)
    int marks = 80;
    // int marks;

    void show() {
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student(); // object 1
        Student s2 = new Student(); // object 2

        s1.marks = 90;
        s2.marks = 75;

        s1.show(); // prints 90
        s2.show(); // prints 75
    }
}

// # ⭐ **What is a Non-Static Variable? (Instance Variable)**

// A **non-static variable**:

// * Belongs to the **object**, not the class
// * Every object gets **its own separate copy**
// * Declared **inside the class**, but **outside all methods**
// * Needs an object to access it
// * Also called an **instance variable**

// ```

// ---

// # ⭐ **Explanation**

// ### ✔ `int marks = 80;`

// This is a **non-static (instance) variable**.

// Every object will get **its own copy** of `marks`.

// ### ✔ `Student s1 = new Student();`

// Object 1 → has its own marks variable

// ### ✔ `Student s2 = new Student();`

// Object 2 → has its own marks variable

// ---

// # ⭐ **What happens?**

// ```
// s1.marks = 90 → changes ONLY for s1
// s2.marks = 75 → changes ONLY for s2
// ```

// So output:

// ```
// Marks = 90
// Marks = 75
// ```

// ---

// # ⭐ Difference Between Static & Non-Static

// | Feature | Static Variable | Non-Static Variable |
// | ----------------- | ------------------ | ------------------------ |
// | Belongs to | Class | Object |
// | Copies | Only 1 | Separate copy per object |
// | Access | ClassName.variable | new object.variable |
// | Memory allocation | Class loaded | Object created |
// | Use case | Common data | Object-specific data |

// ---

// # ⭐ Simple Real-Life Example

// Imagine:

// * Static variable = School Name (same for all students)
// * Non-static variable = Student Name (different for each student)

// ---
