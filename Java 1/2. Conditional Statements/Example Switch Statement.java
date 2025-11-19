//🧩 4️⃣ switch statement

//👉 Used when you have many choices — like a menu.
//It’s cleaner than writing too many “if” statements.

class SwitchExample {
    public static void main(String[] args) {
        int day = 5;

        // rule switch
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }
    }
}

// switch (day) {
// case 1:
// System.out.println("Monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("Wednesday");
// break;
// default:
// System.out.println("Other day");
// }