class Mogambo {
    static int a;
    static String s;

    static {
        System.out.println(s);
        s = "QSP";
        test(a + 5);
        System.out.println(a);
    }

    public static void test(int a) {
        System.out.println(Mogambo.a);
        a = Mogambo.a + 10;
        System.out.println(Mogambo.a);
        Mogambo.a = 25 - 9;
    }

    public static void test(String s) {
        System.out.println(s);
        s = "Hello";
        System.out.println(s);
        System.out.println(Mogambo.a);
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println(a);
        a = 4;
        Mogambo.s = "Bye";
        test(s);
        System.out.println(a);
        test(a);
        System.out.println("main ends");
    }
}

// a inside method = local variable

// Mogambo.a = static variable

// Local variable HIDES static variable → this is shadowing

// Assigning a = anything DOES NOT change static variable

// Assigning Mogambo.a = anything DOES change static variable

// That is EXACTLY why static a does NOT get value 10,
// because local a got 10, not static.