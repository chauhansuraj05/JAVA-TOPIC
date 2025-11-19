class Example {

    public static char grade(int m) {
        return (m >= 90) ? 'A' : (m >= 70) ? 'B' : (m >= 50) ? 'C' : 'F';
    }

    public static void main(String[] args) {
        System.out.println("Ravi: " + grade(67));
        System.out.println("Sona: " + grade(89));
        System.out.println("Raja: " + grade(90));
    }
}
