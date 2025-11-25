class Employee {
    String name;
    int salary;

    Employee() { // no-argument constructor
        name = "Suraj";
        salary = 30000;
    }
}

class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.name);
        System.out.println(e.salary);
    }
}