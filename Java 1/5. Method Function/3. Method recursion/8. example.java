class Main {
    public static void main(String[] args) {
        printNumber(1);
    }

    static void printNumber(int n) {
        if (n > 10) { // stopping condition
            return;
        }

        System.out.println(n); // print current number
        // printNumber(n++); using curent value again and again
        printNumber(++n);// call next number
        printNumber(n + 1);
    }
}
