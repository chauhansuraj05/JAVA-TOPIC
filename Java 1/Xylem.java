import java.util.Scanner;

class XylemPhloemString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next(); // taking number as string

        int length = num.length();

        // first digit (outer)
        int firstDigit = Character.getNumericValue(num.charAt(0));

        // last digit (outer)
        int lastDigit = Character.getNumericValue(num.charAt(length - 1));

        int sumOuter = firstDigit + lastDigit;
        int sumInner = 0;

        // add middle digits
        for (int i = 1; i < length - 1; i++) {
            sumInner += Character.getNumericValue(num.charAt(i));
        }

        System.out.println("Outer sum = " + sumOuter);
        System.out.println("Inner sum = " + sumInner);

        if (sumOuter == sumInner) {
            System.out.println(num + " is a Xylem Number");
        } else {
            System.out.println(num + " is a Phloem Number");
        }
    }
}
