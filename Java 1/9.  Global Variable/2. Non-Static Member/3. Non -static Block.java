class Student {

    // non-static block
    {
        System.out.println("This is a non-static block");
    }

    // constructor
    Student() {
        System.out.println("Constructor is running");
    }

    public static void main(String[] args) {

        System.out.println("Main method starts");

        Student s1 = new Student();
        Student s2 = new Student();
    }
}

// output:
// Main method starts
// This is a non-static block
// Constructor is running
// This is a non-static block
// Constructor is running

// Why does it run twice?
// Because you created 2 objects:
// First object → non-static block runs → constructor runs
// Second object → non-static block runs again → constructor runs again