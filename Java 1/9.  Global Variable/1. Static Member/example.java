class ram {

    static int a = 10;

    static {
        System.out.println("Static Block");
        System.out.println(a);
        test(15);
    }

    static void test(int a) {
        System.out.println(ram.a);
        ram.a = a + 10;
        System.out.println(a);
    }

    public static void main(String args[]) {
        System.out.println("BY WORLD");
        System.out.println(ram.a);
        a = 19; // Variable Shadowing
        test(ram.a);
        System.out.println(ram.a);
        System.out.println("Hello World");
    }
}