// Program showing BOTH Method Overriding and Recursion

// ----------------------
// PART 1: METHOD OVERRIDING
// ----------------------

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() { // overriding parent method
        System.out.println("Dog barks");
    }
}

// ----------------------
// PART 2: RECURSION
// ----------------------

class RecursionDemo {

    int factorial(int n) {
        if (n == 1) { // base condition
            return 1;
        }
        return n * factorial(n - 1); // recursion (method calling itself)
    }
}

// ----------------------
// MAIN CLASS
// ----------------------

class DemoTest {
    public static void main(String[] args) {

        // --------- Overriding Example ---------
        Animal a = new Animal();
        Animal d = new Dog(); // polymorphism

        a.sound(); // calls Animal method
        d.sound(); // calls Dog overridden method

        // --------- Recursion Example ---------
        RecursionDemo obj = new RecursionDemo();

        int result = obj.factorial(5); // 5*4*3*2*1
        System.out.println("Factorial = " + result);
    }
}
