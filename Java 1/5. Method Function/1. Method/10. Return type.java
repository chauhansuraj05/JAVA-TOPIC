class AdvancedMath {

    // 1. Power
    double power(int a, int b) {
        return Math.pow(a, b);
    }

    // 2. Factorial
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 3. Even or Odd
    String evenOrOdd(int n) {
        if (n % 2 == 0)
            return "even";
        else
            return "odd";
    }

    // 4. Largest of 3 numbers
    int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 5. Smallest of 3 numbers
    int smallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}

class Main {
    public static void main(String[] args) {

        AdvancedMath obj = new AdvancedMath();

        System.out.println("Power: " + obj.power(2, 3));
        System.out.println("Factorial: " + obj.factorial(5));
        System.out.println("Even/Odd: " + obj.evenOrOdd(7));
        System.out.println("Largest: " + obj.largest(10, 5, 8));
        System.out.println("Smallest: " + obj.smallest(10, 5, 8));
    }
}
