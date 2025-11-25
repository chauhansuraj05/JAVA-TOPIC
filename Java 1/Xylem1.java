import java.util.Scanner;

class XylemPhloem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;

        int lastDigit = num % 10; // last digit
        num = num / 10;

        int sumInner = 0;

        // extract middle digits
        while (num > 9) { // stop before first digit
            sumInner += num % 10;
            num = num / 10;
        }

        int firstDigit = num; // remaining digit
        int sumOuter = firstDigit + lastDigit;

        System.out.println("Outer sum = " + sumOuter);
        System.out.println("Inner sum = " + sumInner);

        if (sumOuter == sumInner) {
            System.out.println(original + " is a Xylem Number");
        } else {
            System.out.println(original + " is a Phloem Number");
        }
    }
}
