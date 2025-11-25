class ram {
    static int a = 30;

    public static void main(String[] args) {
        System.out.println("Hello World");
        ram sc = new ram();
        sc.display();
        System.out.println("By World");
    }

    void display() {
        int a = 20;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(ram.a);

    }
}

// How to use this keyword in java non static context
// how to use static members in non static context