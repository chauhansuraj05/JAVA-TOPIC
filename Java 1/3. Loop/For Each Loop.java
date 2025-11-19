//🎯 4️⃣ for-each loop

//👉 Used to go through all elements in an array (list of items).
//It’s very simple and clean.

class ForEachExample {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Banana", "Mango" };

        for (String fruit : fruits) {
            System.out.println("I like " + fruit + " 🍎");
        }
    }
}

// ✅ Output

// I like Apple 🍎
// I like Banana 🍎
// I like Mango 🍎

// | Loop Type | When to Use | Example Idea |
// | ---------- | ---------------------------------- |
// ----------------------------------- |
// | `for` | You know how many times | Count 1 to 10 |
// | `while` | You don’t know the number of times | Keep asking until answer is
// correct |
// | `do-while` | Run code at least once | Ask once before checking |
// | `for-each` | For arrays or lists | Print all fruits |

// ■ What is a For-Each Loop?

// - Imagine you have a box of chocolates ■.

// - You want to eat each chocolate one by one, without worrying about how many
// are left.

// - The for-each loop helps you do that — it goes through every item in a list,
// array, or collection

// automatically.

// ■ Simple Definition

// The for-each loop is used to go through (or iterate) all the elements in an
// array or collection one by

// one.

// ■ Syntax (the rule)

// for (type variable : arrayName) {

// code to run for each item

// }

// ■ Example 1: Numbers in an Array

// public class Main {

// public static void main(String[] args) {

// int numbers[] = {10, 20, 30, 40, 50};

// for (int n : numbers) {

// System.out.println("Number: " + n);

// }

// }

// }

// ■ Example 2: Words (Strings)

// public class Main {

// public static void main(String[] args) {

// String fruits[] = {"Apple", "Banana", "Mango"};

// for (String fruit : fruits) {

// System.out.println("I like " + fruit);

// }

// }

// }

// ■ Example 3: For Each with ArrayList

// import java.util.ArrayList;

// public class Main {

// public static void main(String[] args) {
// ArrayList colors = new ArrayList<>();

// colors.add("Red");

// colors.add("Blue");

// colors.add("Green");

// for (String c : colors) {

// System.out.println("Color: " + c);

// }

// }

// }

// ■ When to Use For-Each

// ■ When you want to look at every element in an array or list

// ■ When you don’t need to change or remove elements

// ■ When you want clean and easy code

// ■ When NOT to Use For-Each

// ■ If you need to know the index (position) of each element

// ■ If you want to add or remove items during looping

// ■ Key Points

// - You can’t change array elements inside a for-each loop directly.

// - You can’t get index (like 0, 1, 2) in for-each.

// - It’s mainly for reading and printing data.

// ■ Kid Example (Story Style)

// String toys[] = {"Red Car", "Blue Car", "Green Car"};

// for (String t : toys) {

// System.out.println("I have a " + t + "!");

// }

// ■ In Short

// for (int n : numbers) → take each number from the array

// n → current number

// numbers → array of all numbers