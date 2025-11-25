class ram {
    int marks = 80;
    int age = 21;

    void display() {
        System.out.println("Marks: " + marks);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]) {
        ram r1 = new ram();
        // ram r2 = new ram();

        // r1.marks = 90;
        // r1.age = 22;

        // r2.marks = 75;
        // r2.age = 20;

        r1.display();
        // r2.display();

        // System.out.println("R1 Marks: " + r1.marks);
        // System.out.println("R1 Age: " + r1.age);

        // System.out.println("R2 Marks: " + r2.marks);
        // System.out.println("R2 Age: " + r2.age);
    }
}