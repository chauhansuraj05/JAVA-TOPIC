class Student {
    String name;
    int age;

    Student(String n, int a) { // parameterized constructor
        name = n;
        age = a;
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Suraj", 22);
        Student s2 = new Student("Amit", 20);

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
    }
}
