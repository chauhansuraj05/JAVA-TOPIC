class LocalExample {

    void show() {
        int x = 10; // local variable (local area)
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        LocalExample obj = new LocalExample();
        obj.show();
    }
}
