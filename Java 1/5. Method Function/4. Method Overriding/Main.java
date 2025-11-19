class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running very fast");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.run(); // calls parent class method

        Vehicle b = new Bike();
        b.run(); // calls overridden child class method
    }
}
