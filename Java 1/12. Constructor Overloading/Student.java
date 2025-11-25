class Student {
    String name;
    int age;

    Student() {
        this.name = "Default";
        this.age = 0;
    }

    Student(String n) {
        this.name = n;
    }

    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args) {
        Student sc = new Student(); // calls 1st constructor
        Student sc1 = new Student("Suraj"); // calls 2nd constructor
        Student sc2 = new Student("Amit", 21); // calls 3rd constructor

        System.out.println("Name: " + sc.name + ", Age: " + sc.age);
        System.out.println("Name: " + sc1.name + ", Age: " + sc1.age);
        System.out.println("Name: " + sc2.name + ", Age: " + sc2.age);
    }

}

// 📌 Constructor Overloading

// Creating multiple constructors in the same class.

// Each constructor has a different number or type of parameters.

// Helps to initialize objects in different ways.

// Java automatically decides which constructor to call based on arguments
// passed.

// Does not require calling another constructor explicitly.