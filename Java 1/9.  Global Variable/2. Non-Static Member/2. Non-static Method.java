class Student {

    // non-static variable
    String name;

    // non-static method
    void displayName() {
        System.out.println("Student name is: " + name);
    }

    public static void main(String[] args) {

        // create object of Student class
        Student s = new Student();

        // assign value to non-static variable
        s.name = "Suraj";

        // call non-static method using object
        s.displayName();
    }
}
