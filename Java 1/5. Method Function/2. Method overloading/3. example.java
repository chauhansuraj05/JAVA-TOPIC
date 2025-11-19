class ram {
    public static void main(String[] args) {
        ram obj = new ram();
        System.out.println(obj.great());
        System.out.println(obj.great("sona"));
        System.out.println(obj.great("mona", 21));
    }

    String great() {
        return "Hello";
    }

    String great(String name) {
        return "Hello " + name + "!";
    }

    String great(String name, int age) {
        return "Hello " + name + "! your are " + age + " year old";
    }
}