class LargestNumber {
    public static void main(String[] args) {
        int a = 20, b = 15;
        int max = (a > b) ? a : b;
        System.out.println("Largest number is: " + max);
    }
}

//| Part     | Meaning                                | Example                           |
//| -------- | -------------------------------------- | --------------------------------- |
//| `?`      | if true                                | `(marks >= 50) ? "Pass"`          |
//| `:`      | if false                               | `: "Fail"`                        |
//| Combined | `condition ? trueResult : falseResult` | `(age >= 18) ? "Adult" : "Minor"` |

//boolean hungry = true;
//String action = (hungry) ? "Eat food 🍔" : "Keep playing 🎮"
//System.out.println(action);

