class example1 {

    int id;
    String name;

    public example1(int i, String n) {
        this.id = i;
        this.name = n;

    }

    public static void main(String[] args) {
        example1 ref = new example1(1, "shree");
        System.out.println("id:" + ref.id + " name:" + ref.name);
    }
}