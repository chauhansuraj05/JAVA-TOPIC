class Student {
    int id;
    String name;
}

class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Default constructor created automatically
        System.out.println(s.id); // Output: 0
        System.out.println(s.name); // Output: null
    }
}
