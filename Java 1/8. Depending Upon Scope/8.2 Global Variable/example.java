class GlobalExample {

    int x = 10; // instance variable (global for the object)

    void show() {
        System.out.println("Value of x: " + x);
    }

    void display() {
        System.out.println("Using x again: " + x);
    }

    public static void main(String[] args) {
        GlobalExample obj = new GlobalExample();
        obj.show();
        obj.display();
    }
}
