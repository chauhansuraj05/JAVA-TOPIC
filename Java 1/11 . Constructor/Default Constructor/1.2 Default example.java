class Employee {
    int salary;
    String name;

    Employee() {
        salary = 30000;
        name = "Suraj";
    }
}

class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.name); // Suraj
        System.out.println(e.salary); // 30000
    }
}
