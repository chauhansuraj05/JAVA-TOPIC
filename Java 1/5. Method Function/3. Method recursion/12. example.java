class ram {
    public static void main(String[] args) {
        number(5);

    }

    public static void number(int n) {
        if (n > 0) {
            System.out.println(n);
            number(n - 1);
        }
    }
}