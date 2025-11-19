class Demo {

    void add(int x, int y) { // x and y → Formal Arguments
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.add(10, 20); // 10 and 20 → Actual Arguments
    }
}
