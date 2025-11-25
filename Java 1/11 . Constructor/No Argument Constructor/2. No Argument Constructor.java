class Student {
    Student() { // no-argument constructor
        System.out.println("Student object created");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student(); // constructor called automatically
    }
}
