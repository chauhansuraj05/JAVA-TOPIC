class Student {
    String name;
    int age;

    Student() {
        name = "Default";
        age = 0;
    }

    Student(String n) {
        name = n;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Main {
    public static void main(String[] args) {
        new Student(); // calls 1st constructor
        new Student("Suraj"); // calls 2nd constructor
        new Student("Amit", 21); // calls 3rd constructor
    }
}
