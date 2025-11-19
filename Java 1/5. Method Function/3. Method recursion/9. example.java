class rama {
    public static void main(String[] args) {
        System.out.println(number(5));
    }

    public static int number(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * number(n - 1);
        }
    }
}