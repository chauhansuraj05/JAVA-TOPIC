class Example {

    public static char findGrade(int m) {
        if (m >= 90)
            return 'A';
        else if (m >= 70)
            return 'B';
        else if (m >= 50)
            return 'C';
        return 'F';
    }

    public static void printGrade(String name, int marks) {
        System.out.println("Student: " + name + ", Grade: " + findGrade(marks));
    }

    public static void main(String[] args) {
        printGrade("Ravi", 67);
        printGrade("Sona", 89);
        printGrade("Raja", 90);
    }
}
