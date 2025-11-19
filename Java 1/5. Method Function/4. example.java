class example {
    public static void CalculateGrade(String name, int marks) {
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'f';
        }

        System.out.println("Student:" + name + ",Grade:" + grade);
    }

    public static void main(String[] args) {
        CalculateGrade("Ravi", 67);
        CalculateGrade("Sona", 89);
        CalculateGrade("Raja", 90);
    }
}
