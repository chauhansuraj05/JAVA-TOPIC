class ram {
    public static void main(String[] args) {
        printchar('a');
    }

    public static void printchar(char n) {
        if (n <= 'z') {
            System.out.println(n);
            printchar((char) (n + 1));
        }
    }
}