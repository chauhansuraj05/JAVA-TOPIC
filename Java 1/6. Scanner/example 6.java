import java.util.Scanner;

class Ram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charecter:");

        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowels are here");
        } else {
            System.out.println("not here");
        }

        sc.close();

    }
}