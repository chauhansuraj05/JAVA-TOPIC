class Example {

    public static char calculateGrade(int marks) {

        if (marks >= 90)
            return 'A';
        else if (marks >= 70)
            return 'B';
        else if (marks >= 50)
            return 'C';
        else
            return 'F';
    }

    public static void main(String[] args) {

        System.out.println("Ravi Grade: " + calculateGrade(67));
        System.out.println("Sona Grade: " + calculateGrade(89));
        System.out.println("Raja Grade: " + calculateGrade(90));
    }
}
