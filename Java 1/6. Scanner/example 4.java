import java.util.Scanner;

class Ram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charecter:");

        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("uper case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("special no.");

        } else {
            System.out.println("sc");
        }

        sc.close();
    }
}