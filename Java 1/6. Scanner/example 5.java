import java.util.Scanner;

class Ram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charecter:");

        String str = sc.nextLine();

        System.out.println(str);

        sc.close();
    }
}