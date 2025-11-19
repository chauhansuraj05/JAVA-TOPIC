class EvenNumbers {

    public static void main(String[] args) {
        printEven(1);
    }

    static void printEven(int n) {
        if (n > 20) { // stopping condition
            return;
        }

        if (n % 2 == 0) { // check even
            System.out.println(n);
        }

        printEven(n + 1); // recursive call
    }
}
