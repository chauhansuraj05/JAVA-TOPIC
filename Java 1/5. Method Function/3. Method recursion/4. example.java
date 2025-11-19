class rama {
    public static void main(String[] args) {
        System.out.println(number(10));
    }

    public static int number(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + number(n - 1);
        }
    }
}
// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1
// output: 55

// public static int number(int n) {
// if (n == 0) {
// return 0;
// }

// }

// | Issue | Reason |
// | -------------- | ------------------------------------------ |
// | Missing return | `int` method needs return in all cases |
// | No else block | Program doesn’t know what to do when n ≠ 0 |
