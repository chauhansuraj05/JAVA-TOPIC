class Student {

    static String collegeName;
    int rollNo;
    String name;
    double marks;

    static {
        collegeName = "ABC University";
        System.out.println("Static Block: College name initialized.");

    }

    {
        System.out.println("Non-Static Block: Student object is created.");
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = 0;

    }

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(double marks) {
        this.rollNo = 0;
        this.name = "Unknown";
        this.marks = marks;
    }

    void printDetails() {
        System.out.println("RollNo:" + rollNo + "Name:" + name);
    }

    void printDetails(boolean showMarks) {

        if (showMarks) {
            System.out.println("RollNo:" + rollNo + "Name:" + name + "marks:" + marks);
        } else {
            printDetails();
        }
    }

    public static void showCollege() {
        System.out.println("College Name:" + collegeName);
    }

    void checkPassOrFail() {
        if (marks >= 35) {
            System.out.println(name + " Passed");
        } else {
            System.out.println(name + " Failed");
        }
    }

}

class UniversityTest {

    public static void main(String[] args) {
        Student us1 = new Student(1, "Ravi");
        Student us2 = new Student(1, "Rani", 87.7);
        Student us3 = new Student(26.0);

        us1.printDetails();
        us1.printDetails(true);

        us2.printDetails();
        us2.printDetails(true);

        us3.printDetails();
        us3.printDetails(true);

        us1.checkPassOrFail();
        us2.checkPassOrFail();
        us3.checkPassOrFail();

        Student.showCollege();
    }
}
