class Areacalculater {
    public static void main(String[] args) {
        Areacalculater ca = new Areacalculater();
        ca.calculateArea(3);
        System.out.println(ca.calculateArea(3));
        System.out.println(ca.calculateArea(6, 9));
        System.out.println(ca.calculateArea(3.5));
    }

    int calculateArea(int side) {
        return side * side;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }
}