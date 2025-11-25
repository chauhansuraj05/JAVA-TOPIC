//  write a java program to achieve constructer chaining using super calling statement.

class Dhirubhai {

    int a;
    int b;
    String s;

    Dhirubhai(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
        System.out.println("Dhirubhai Constructor");
    }
}

class Mukesh extends Dhirubhai {

    int i;
    int j;

    Mukesh(int a, int b, String s, int i, int j) {
        super(a, b, s);
        this.i = i;
        this.j = j;
        System.out.println("Mukesh Constructor");
    }
}

class Ram {
    public static void main(String[] args) {

        System.out.println("Main Start");

        Mukesh ref = new Mukesh(10, 20, "Anita", 30, 40);

        System.out.println("From Dhirubhai class: " + ref.a + ", " + ref.b + ", " + ref.s);
        System.out.println("From Mukesh class: " + ref.i + ", " + ref.j);

        System.out.println("Main End");
    }
}
