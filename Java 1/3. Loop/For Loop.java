//🧩 There are 4 main types of loops in Java:

//| Loop Type       | When to Use                                 | Description                           |
//| --------------- | ------------------------------------------- | ------------------------------------- |
//| `for` loop      | When you know how many times to repeat      | Repeats code a fixed number of times  |
//| `while` loop    | When you don’t know how many times          | Keeps running while condition is true |
//| `do-while` loop | When you want to run the code at least once | Runs first, checks later              |
//| `for-each` loop | For going through arrays or collections     | Used to visit all items easily        |

//🎯 1️⃣ for loop

//👉 Used when you know how many times to repeat something.
//Example: Count numbers from 1 to 5.

class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

// Explanation:

// int i = 1; → start
// i <= 5; → stop when i reaches 5
// i++ → increase i by 1 every time

// ✅ Output
// Number: 1
// Number: 2
// Number: 3
// Number: 4
// Number: 5
