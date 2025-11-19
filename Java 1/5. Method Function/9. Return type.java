class example {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(factorial(5));
        System.out.println(evenOrodd(7));
        System.out.println(maximum(2, 3, 6));
        System.out.println(minimum(6, 3, 6));

    }

    static double power(int a, int b) {
        return Math.pow(a, b);
    }

    static long factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= 1;
        }
        return fact;
    }

    // This only checks if i is allowed to enter the loop.
    // It DOES NOT control the increment.
    // The condition is like a gate:
    // If i is ≤ n → allow inside
    // If i is > n → stop loop

    static String evenOrodd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "odd";
        }
    }

    static int maximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int minimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
