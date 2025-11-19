class Addition {

    // 1. No-argument method → adds two fixed numbers
    void add() {
        int a = 10;
        int b = 20;
        System.out.println("Addition (no argument): " + (a + b));
    }

    // 2. Two-argument method → adds two numbers
    void add(int a, int b) {
        System.out.println("Addition (2 arguments): " + (a + b));
    }

    // 3. Four-argument method → adds four numbers
    void add(int a, int b, int c, int d) {
        System.out.println("Addition (4 arguments): " + (a + b + c + d));
    }

    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add(); // no-argument version
        obj.add(5, 7); // 2-argument version
        obj.add(1, 2, 3, 4); // 4-argument version
    }

}
