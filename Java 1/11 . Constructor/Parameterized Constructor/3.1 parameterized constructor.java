class Calculator {
    int num1, num2;

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void add() {
        System.out.println("Sum = " + (num1 + num2));
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(10, 20);
        c.add();
    }
}
