class A {
    A() {
        System.out.println("Parent class constructor A");
    }
}

class B extends A {
    B() {
        super(); // calling parent class constructor
        System.out.println("Child class constructor B");
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}
// Constructor Chaining with Inheritance