//🧩 3️⃣ if-else if-else statement

//👉 Checks many conditions, one by one.
//The first true condition runs its code.

class IfElseIfExample {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("You got Grade A!");
        } else if (marks >= 75) {
            System.out.println("You got Grade B!");
        } else if (marks >= 50) {
            System.out.println("You got Grade C!");
        } else {
            System.out.println("You failed. Study harder!");
        }
    }
}
