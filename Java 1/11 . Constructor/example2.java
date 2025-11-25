
public class example2 {
    int id;
    String title, auther;

    example2(int i, String t, String a) {
        id = i;
        title = t;
        auther = a;
    }

    void display() {
        System.out.println(id + " " + title + " " + auther);
    }

    public static void main(String[] args) {
        example2 book1 = new example2(101, "Let us C", "Yashwant Kanetkar");

        book1.display();

        book1.updateDisplay();

    }

    void updateDisplay() {
        this.id = id;
        this.title = title;
        this.auther = auther;
    }
}
