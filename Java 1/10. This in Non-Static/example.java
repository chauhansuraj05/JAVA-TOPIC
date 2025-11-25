class ram {
    int a = 10;

    public static void main(String[] args) {

        System.out.println("Hello World");
        ram obj = new ram();
        obj.a = 20;
        obj.diplay();
        System.out.println(obj.a);
        System.out.println("By World");
    }

    void diplay() {
        System.out.println(a);
        System.out.println(this.a);
    }
}
// How to use this keyword in java non static context
// how to use non static members in non static context