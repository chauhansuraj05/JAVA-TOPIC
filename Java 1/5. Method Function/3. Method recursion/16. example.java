class ram {
    public static void main(String[] args) {
        test(1);
    }

    public static void test(int n) {
        if (n <= 4) {
            System.out.println("Hello World");
            // test(n + 1); // original line
            test(++n);
        }
        System.out.println("Bye World");
    }
}