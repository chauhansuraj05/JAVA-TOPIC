# 🎓 **100 Scanner Class Interview Questions & Answers**

## ⭐ Basics

1. **What is Scanner in Java?**
   → A class used to read input from keyboard, files, or streams.

2. **Which package contains Scanner?**
   → `java.util`

3. **How to import Scanner class?**
   → `import java.util.Scanner;`

4. **How to create Scanner object?**
   → `Scanner sc = new Scanner(System.in);`

5. **What is `System.in`?**
   → Standard input stream (keyboard input).

6. **When was Scanner introduced?**
   → Java 5.

7. **Can Scanner read different data types?**
   → ✔ Yes (int, float, double, string, etc.)

8. **Is Scanner a predefined class?**
   → ✔ Yes.

9. **Is Scanner part of `java.io` package?**
   → ❌ No, it's in `java.util`.

10. **Why use Scanner?**
    → For easy input handling.

---

## 🧠 Common Scanner Methods

11. `nextInt()` → reads integer.
12. `nextFloat()` → reads float.
13. `nextDouble()` → reads double.
14. `nextLong()` → reads long.
15. `nextLine()` → reads entire line including spaces.
16. `next()` → reads single word.
17. `nextBoolean()` → reads true/false.
18. `nextByte()` → reads byte.
19. `nextShort()` → reads short.
20. `next().charAt(0)` → read a character.

---

## 🔥 Usage Questions

21. **Difference between next() and nextLine()?**
    → next() reads a word; nextLine() reads entire line.

22. **Why does nextLine() skip input sometimes after nextInt()?**
    → Because `nextInt()` leaves newline in buffer.

23. **How to fix skipping problem?**
    → Use `sc.nextLine()` after numeric read.

24. **Can Scanner read multiple values in one line?**
    → ✔ Yes.

25. **Example of reading full name?**
    → `String name = sc.nextLine();`

---

## 🟣 Errors & Issues

26. **What happens if wrong input given?**
    → Throws `InputMismatchException`.

27. **How to handle InputMismatchException?**
    → Using try-catch.

28. **What happens if nextInt() input is string?**
    → Runtime error.

29. **Can Scanner read file input?**
    → ✔ Yes: `Scanner sc = new Scanner(new File("abc.txt"));`

30. **Checked exception for file scanning?**
    → `FileNotFoundException`.

---

## 🔵 Closing Scanner

31. **How to close scanner?**
    → `sc.close();`

32. **Is closing Scanner recommended?**
    → ✔ Yes, to free system resources.

33. **Can closing System.in scanner affect program?**
    → ✔ Yes, cannot reopen System.in again.

34. **When should we close scanner?**
    → At end of program.

35. **Is closing Scanner optional in small programs?**
    → ✔ Yes but not good for production.

---

## 🧵 Scanner & Keyboard

36. **Scanner reads input from keyboard?**
    → ✔ Yes using `System.in`.

37. **Can we read char using Scanner?**
    → ✔ Yes via `next().charAt(0)`.

38. **Can Scanner read boolean?**
    → ✔ Yes.

39. **Can Scanner check if more input available?**
    → ✔ Using `hasNext()`.

40. **Example of hasNextInt()?**
    → `if(sc.hasNextInt())`

---

## 🧪 Scanner with Loops

41. **How to input N numbers?**
    → Using loop with `nextInt()`.

42. **Use Scanner inside while loop?**
    → ✔ Yes.

43. **Use break with scanner loop?**
    → ✔ Yes.

44. **Real example: menu-driven program?**
    → Done using loop + scanner.

45. **Scanner inside method?**
    → ✔ Yes.

---

## 🟡 Scanner with Arrays

46. Read array size from user.
47. Read array elements using loop.
48. Print array values.
49. Sum of array using Scanner.
50. Search element using Scanner.

---

## 🧠 Advanced

51. Scanner implements which interfaces?
    → Iterator & Closeable.

52. Can Scanner parse tokens using regex? → ✔

53. Can Scanner split input using delimiter? → ✔

54. How to change delimiter?
    → `sc.useDelimiter(",")`

55. Example delimiter usage?
    → reading CSV type input.

56. Scanner reads strings by default? → ✔

57. How to check next token type? → `hasNextInt()`, `hasNextDouble()`

58. Scanner thread-safe? → ❌

59. Scanner vs BufferedReader? → Scanner slower, easy to use

60. Scanner vs Console? → Console used for password input

---

## 🔍 Real-Time Questions

61. Program for sum of numbers using scanner.
62. Program for reading student details.
63. Program for calculator.
64. Program for voting eligibility.
65. Program for prime number check.

---

## 🧩 Trick Questions

66. `nextLine()` after `nextInt()`? → needs extra nextLine
67. Input mismatch exception? → wrong datatype
68. `next()` stops at space? ✔
69. buffer clearing importance? ✔
70. multiple scanner objects bad practice? ✔

---

## ⚙ Scanner & OOP

71. Scanner object inside constructor.
72. Scanner inside static method allowed.
73. Passing scanner as parameter to method.
74. Returning scanner from method.
75. Using scanner in objects.

---

## 📦 Scanner with Collections

76. Read list using scanner.
77. Read set values.
78. Read map key-value pairs.
79. Reading random input counts.
80. Collecting user input until exit keyword.

---

## ✔ MCQ style

81. Import statement for Scanner?
    → `java.util.*`

82. nextLine reads? → entire string

83. next reads? → single token

84. System.in type? → InputStream

85. closing scanner closes? → System.in

86. nextInt returns? → integer

87. nextBoolean returns? → true/false

88. What is delimiter? → separator

89. Leading space effect? → ignored

90. scanner precompiled? → No

---

## 🧵 Concept Summary

91. Scanner = input reading class.
92. High-level input handling.
93. Converts text to primitives.
94. Easy for beginners.
95. Supports regex.
96. Supports multiple sources.
97. Replaces older `BufferedReader` for simple input.
98. Slower vs BufferedReader.
99. Can cause skipping issues.
100.  Must handle InputMismatchException.

---
