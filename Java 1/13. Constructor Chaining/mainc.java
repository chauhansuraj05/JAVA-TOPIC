class Demo {

    Demo() {
        this(10); // calls second constructor
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        this(x, 20); // calls third constructor
        System.out.println("One Parameter Constructor");
    }

    Demo(int x, int y) {
        System.out.println("Two Parameter Constructor: " + x + ", " + y);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
// Constructor Chaining within the Same Class