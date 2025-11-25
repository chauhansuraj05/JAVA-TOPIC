---
# 🎓 **100 Method Recursion Interview Questions & Answers**

## ⭐ Basics

1. **What is recursion?**
→ A method calling itself repeatedly until a base condition is met.

2. **Why recursion is used?**
→ To solve complex, repetitive problems in a simpler and cleaner way.

3. **Example of recursion?**
→ Factorial, Fibonacci, Tree Traversal.

4. **What is base condition in recursion?**
→ The terminating condition that stops recursion.

5. **What happens if base condition is missing?**
→ Infinite recursion → StackOverflowError.

6. **What is recursive call?**
→ A method calling itself inside its own body.

7. **What is stack memory in recursion?**
→ Where function call frames are stored.

8. **What is StackOverflowError?**
→ Error caused by too many recursive calls.

9. **Is recursion faster than loops?**
→ ❌ Usually slower due to stack calls.

10. **Which is more memory-friendly? recursion or loop?**
→ Loop.
---

## 🔥 Types of Recursion

11. **Direct recursion** – method directly calls itself.
12. **Indirect recursion** – method calls another method which calls itself.
13. **Tail recursion** – recursive call is the last statement.
14. **Head recursion** – recursive call before any processing.
15. **Tree recursion** – multiple recursive calls.
16. **Linear recursion** – one recursive call per function.
17. **Binary recursion** – two recursive calls per function.
18. **Mutual recursion** – multiple methods calling each other.

---

## 🧠 Examples

19. Factorial using recursion.
20. Fibonacci using recursion.
21. Sum of digits using recursion.
22. Reverse a string using recursion.
23. Reverse a number using recursion.
24. Power of number using recursion.
25. Count digits using recursion.
26. Print numbers 1 to N using recursion.
27. Print numbers N to 1 using recursion.
28. Palindrome check using recursion.

---

## 🎤 Conceptual Questions

29. Why recursion is important?
    → Reduces complexity, solves divide-and-conquer problems easily.

30. What is recursive tree?
    → Visual representation of recursive calls.

31. What is call stack?
    → Stores details of each method call.

32. What is activation record?
    → Memory frame of a single call.

33. Difference between iteration and recursion?
    → Recursion uses function calls; iteration uses loops.

34. When to prefer recursion?
    → When problem can be subdivided (like trees & graphs).

35. Can recursion always be replaced by loop?
    → ✔ Yes logically, but may complicate code.

36. Is tail recursion optimized in Java?
    → ❌ No.

37. Which languages support tail call optimization?
    → Scala, Haskell, Python, etc.

38. Should we always use recursion?
    → ❌ Not if loops are simpler.

39. Advantage of recursion?
    → Short code, easy understanding.

40. Disadvantages?
    → Slow, memory costly, stack overflow.

---

## 🧩 Output / Trick Questions

41. Recursion without base case → infinite.
42. Base case always executed last? → ❌ First when reached.
43. Recursive method must always return? → ✔ If non-void.
44. Multiple recursive calls allowed? → ✔
45. Can recursion call multiple functions? → ✔ Indirect recursion.
46. Recursion time complexity? → Usually higher.
47. Fibonacci recursive complexity? → O(2^n).
48. Factorial recursive complexity? → O(n).
49. Binary recursion doubling calls? → ✔
50. Print function recursion prints reverse order? → ✔ When printing after recursion.

---

## 🔍 Real Use Cases

51. Tree traversal (inorder, preorder, postorder).
52. Graph traversal (DFS).
53. QuickSort algorithm.
54. MergeSort algorithm.
55. Tower of Hanoi.
56. Maze solving.
57. File system directory traversal.
58. Backtracking problems.
59. N-Queens problem.
60. Sudoku solver.

---

## 🧱 Structural Questions

61. What is recursive step?
    → Step where function calls itself.

62. Can constructor be recursive?
    → ✔ Yes but not recommended.

63. Can recursion be indirect?
    → ✔ Yes.

64. Can recursion be infinite?
    → ✔ Yes.

65. Example of indirect recursion?
    → A→B→A.

66. What is base condition role?
    → Stop calling recursion.

67. Base condition must be before recursive call?
    → Usually yes.

68. What is partial recursion?
    → Some levels stop early.

69. Can recursion take parameters?
    → ✔ Yes.

70. Can recursion return values?
    → ✔ Yes.

---

## 🧠 Coding Concepts

71. Printing values before recursive call → forward order.
72. Printing values after recursive call → reverse order.
73. Swap recursion level by printing differently.
74. Recursive pattern printing.
75. Recursion + static variable control.

---

## ⚙ Errors & Debugging

76. StackOverflowError meaning.
77. How to prevent recursion overflow? → Add base case.
78. Maximum recursion depth? → Depends on JVM stack.
79. Large recursion risk? → Yes for large input.
80. Why debugging recursion harder? → Multiple stack frames.

---

## 📊 Complexity

81. Recursion time complexity often exponential.
82. Memory complexity higher than loops.
83. Tail recursion best? → If optimized language.
84. Memoization improves recursion? ✔
85. Dynamic programming alternative? ✔

---

## 🧪 Deep Topics

86. Recursion in divide and conquer? Essential.
87. Sorting using recursion? → Merge & Quick sort.
88. Recursion vs iteration performance? Iteration wins.
89. Does recursion improve readability? ✔ sometimes.
90. Can compiler convert recursion to iteration? ✔ sometimes.

---

## 💡 Practical Interview Questions

91. Print sum of digits using recursion.
92. Replace loop with recursion.
93. Reverse array using recursion.
94. Count vowels using recursion.
95. Find min/max in array using recursion.
96. GCD using recursion.
97. Binary search recursive.
98. Power function recursion.
99. Convert decimal to binary using recursion.
100.  Tower of Hanoi explanation.

---

---
