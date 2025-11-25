class GlobalExample2 {

    static int count = 0; // static variable (global for class)

    GlobalExample2() {
        count++; // every object will increase the same count
    }

    public static void main(String[] args) {
        new GlobalExample2();
        new GlobalExample2();
        new GlobalExample2();

        System.out.println("Total objects created: " + count);
    }
}
