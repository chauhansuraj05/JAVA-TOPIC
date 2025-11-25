
public class example {

    {
        System.out.println("This is example of Non Static Block");
    }

    example() {
        System.out.println("This is example of constructor");
    }

    public static void main(String[] args) {
        example obj = new example();
        example obj1 = new example();
    }
}
