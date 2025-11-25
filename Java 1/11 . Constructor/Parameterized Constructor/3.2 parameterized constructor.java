class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Suraj", 30000);
        System.out.println(e.name + " " + e.salary);
    }
}
