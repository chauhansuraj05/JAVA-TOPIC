
public class Example {

    int id;
    String name;
    Double sal;

    Example() {
        this(0, "Unknown", 0.0); // Chaining to 3-arg constructor
    }

    Example(int id) {
        this(id, "Unknown", 0.0); // Chaining
    }

    Example(String name) {
        this(0, name, 0.0); // Chaining
    }

    Example(double sal) {
        this(0, "Unknown", sal); // Chaining
    }

    Example(int id, String name) {
        this(id, name, 0.0); // Chaining
    }

    Example(int id, Double sal) {
        this(id, "Unknown", sal); // Chaining
    }

    Example(String name, Double sal) {
        this(0, name, sal); // Chaining
    }

    Example(int id, String name, Double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + sal);
    }

    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example(101);
        Example ex3 = new Example("John");
        Example ex4 = new Example(50000.0);
        Example ex5 = new Example(102, "Alice");
        Example ex6 = new Example(103, 60000.0);
        Example ex7 = new Example("Bob", 70000.0);
        Example ex8 = new Example(104, "Charlie", 80000.0);

        ex1.display();
        ex2.display();
        ex3.display();
        ex4.display();
        ex5.display();
        ex6.display();
        ex7.display();
        ex8.display();
    }
}
