class A {

    A() {
        this(100); // Calls parameterized constructor of SAME class
        System.out.println("A: Default Constructor");
    }

    A(int x) {
        System.out.println("A: Parameterized Constructor = " + x);
    }
}

class B extends A {

    B() {
        super(); // Calls default constructor of parent class A
        System.out.println("B: Default Constructor");
    }

    B(int y) {
        this(); // Calls default constructor of SAME class B
        System.out.println("B: Parameterized Constructor = " + y);
    }
}

class Testst {
    public static void main(String[] args) {
        B obj = new B(200);
    }
}
