class Person {
    Person() {
        System.out.println("Person Constructor");
    }
}

class Employee extends Person {
    Employee() {
        super(); // Calling parent class constructor
        System.out.println("Employee Constructor");
    }
}

class tests {
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
