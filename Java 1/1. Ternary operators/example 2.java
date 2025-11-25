class EvenOdd {
    public static void main(String[] args) {
        int number = 9;
        String type = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(type);
    }
}
// This program checks if a number is even or odd using a ternary operator.