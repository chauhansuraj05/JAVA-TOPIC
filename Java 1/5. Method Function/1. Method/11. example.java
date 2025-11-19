class ram {
    public static void main(String[] args) {
        add();
        System.out.println(addtwo(3, 4));
        System.out.println(addfour(3, 4, 7, 5));
        System.out.println(twostr("sona", "mona"));
    }

    public static void add() {
        int a = 4, b = 6, c = 7;
        int res = a + b + c;
        System.out.println(res);
    }

    public static int addtwo(int a, int b) {
        // int ans = a + b;
        // return ans;
        return a + b;
    }

    public static int addfour(int a, int b, int c, int d) {
        int ans = a + b + c + d;
        return ans;
    }

    public static String twostr(String a, String b) {
        String ans = a + b;
        return ans;
    }
}