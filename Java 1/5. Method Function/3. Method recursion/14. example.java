class ram {
    public static void main(String[] args) {
        printchar('z');
    }

    public static void printchar(char n) {
        if (n >= 'a') {
            System.out.println(n);
            printchar((char) (n - 1));
        }
    }
}