class rama {
    public static void main(String[] args) {
        System.out.println(number(95));
    }

    public static int number(int n) {
        if (n <= 10) {
            return n;
        } else {
            return number(n - 10);
        }
    }
}

// number(95)
// → number(95 - 10) = number(85)
// → number(85 - 10) = number(75)
// → number(75 - 10) = number(65)
// → number(65 - 10) = number(55)
// → number(55 - 10) = number(45)
// → number(45 - 10) = number(35)
// → number(35 - 10) = number(25)
// → number(25 - 10) = number(15)
// → number(15 - 10) = number(5)
