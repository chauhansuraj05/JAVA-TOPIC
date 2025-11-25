class Student {

    String name; // instance variable
    int age; // instance variable

    Student() {
        this("Suraj", 22); // calling another constructor
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        this.name = name; // assigning value to instance variables
        this.age = age;
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student sc = new Student();
        Student sc1 = new Student("Amit", 21);

        // System.out.println(sc1.name + " " + sc1.age);
        System.out.println("Hello Suraj");

    }
}

// Constructor Chaining

// Calling one constructor from another constructor within the same class or
// parent class.

// Uses this() to call constructor of same class.

// Uses super() to call constructor of parent class.

// Helps reusability of code and avoiding duplication.

// Must be first line inside a constructor.

// ✨ Example