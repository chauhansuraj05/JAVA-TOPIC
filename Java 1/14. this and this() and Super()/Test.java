class Student {
    String name;
    int age;

    Student() {
        this("Suraj", 22); // Calling parameterized constructor of same class
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + " Age: " + age);
        System.out.println("Parameterized Constructor");
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("Amit", 21);
    }
}
