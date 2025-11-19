class Example {

    public static char grade(int marks) {
        switch (marks / 10) {
            case 10:
            case 9:
                return 'A';
            case 8:
            case 7:
                return 'B';
            case 6:
            case 5:
                return 'C';
            default:
                return 'F';
        }
    }

    public static void main(String[] args) {
        System.out.println("Ravi: " + grade(67));
        System.out.println("Sona: " + grade(89));
        System.out.println("Raja: " + grade(90));
    }
}
