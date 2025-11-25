class Student {

    Student() {
        this("Suraj", 22); // calling parameterized constructor
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}
