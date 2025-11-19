class ram {
    public static void main(String[] args) {
        System.out.println("Printing numbers from n to 1:");
        number(5);
    }

    public static void number(int n) {
        if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println(n);
            number(n - 1);
        }
    }
}