public class example {

    int id;
    String name;
    Double sal;

    example() {
        this.id = 0;
        this.name = "Unknown";
        this.sal = 0.0;
    }

    example(int id) {
        this.id = id;
    }

    example(String name) {
        this.name = name;
    }

    example(double sal) {
        this.sal = sal;
    }

    example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    example(int id, Double sal) {
        this.id = id;
        this.sal = sal;
    }

    example(String name, Double sal) {
        this.name = name;
        this.sal = sal;
    }

    example(int id, String name, Double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + sal);
    }

    public static void main(String[] args) {
        System.out.println("This is an example file for constructor chaining.");
        example ex1 = new example();
        example ex2 = new example(101);
        example ex3 = new example("John");
        example ex4 = new example(50000.0);
        example ex5 = new example(102, "Alice");
        example ex6 = new example(103, 60000.0);
        example ex7 = new example("Bob", 70000.0);

        example ex8 = new example(104, "Charlie", 80000.0);
        ex1.display();
        ex2.display();
        ex3.display();
        ex4.display();
        ex5.display();
        ex6.display();
        ex7.display();
    }
}
