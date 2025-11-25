# 🎓 **100 Loop Interview Questions & Answers**

## ⭐ Basics

1. **What is a loop?**
   → A structure that repeats a block of code multiple times.

2. **Why loops are used?**
   → To avoid repetitive code.

3. **Types of loops in Java?**
   → for, while, do-while, enhanced for loop.

4. **What is a counter variable?**
   → Controls number of iterations.

5. **What is iteration?**
   → One execution cycle of loop body.

6. **What is infinite loop?**
   → A loop that never stops.

7. **Which loop guarantees at least one execution?**
   → do-while loop.

8. **Which loop checks condition first?**
   → for & while.

9. **Which loop checks condition last?**
   → do-while.

10. **Can loops be nested?**
    → ✔ Yes.

---

## 🟣 For Loop

11. **Syntax of for loop?**
    → `for(init; condition; update) { }`

12. **When to use for loop?**
    → When number of iterations is known.

13. **Can init, condition, update be empty?**
    → ✔ Yes.

14. **Is this allowed?** `for(;;)`
    → ✔ Yes, infinite loop.

15. **Can update be inside loop body instead of header?**
    → ✔ Yes.

16. **Can we use multiple variables in for loop?**
    → ✔ Yes: `for(int i=0,j=10; i<j; i++,j--)`

17. **Can for loop return a value?**
    → ❌ No.

18. **Can we break out of for loop?**
    → ✔ Yes.

19. **Can we skip iterations?**
    → ✔ Using continue.

20. **Most suited for array and indexing?**
    → ✔ for loop.

---

## 🟡 While Loop

21. **Syntax of while loop?**
    → `while(condition) { }`

22. **When to use while loop?**
    → When number of iterations unknown.

23. **Condition type?**
    → boolean only.

24. **Can while loop run zero times?**
    → ✔ Yes.

25. **Infinite while example?**
    → `while(true) { }`

26. **Place where while often used?**
    → Reading inputs until a condition satisfied.

27. **Can while loop be nested?**
    → ✔ Yes.

28. **Can while loop contain break?**
    → ✔ Yes.

29. **Can update be missing?**
    → ✔ But may cause infinite loop.

30. **Input validation scenario uses?**
    → while.

---

## 🟢 Do-While Loop

31. **Syntax of do-while?**

```
do {
    code
} while(condition);
```

32. **Check happens when?**
    → After execution.

33. **Guarantees one execution?**
    → ✔ Yes.

34. **Example use case?**
    → Menus, user input repetition.

35. **Can do-while create infinite loop?**
    → ✔ Yes.

36. **Can break be used?**
    → ✔ Yes.

37. **Can continue be used?**
    → ✔ Yes.

38. **Can condition be missing?**
    → ❌ No.

39. **Must semicolon after while?**
    → ✔ Yes.

40. **Compare do-while vs while?**
    → do-while always runs once; while may run zero.

---

## 🔵 Enhanced For Loop (for-each)

41. **What is enhanced for loop?**
    → Used to iterate arrays/collections easily.

42. **Syntax?**
    → `for(type var : array)`

43. **Can enhanced for modify index?**
    → ❌ No.

44. **Used for arrays?**
    → ✔ Yes.

45. **Used for collections?**
    → ✔ Yes.

46. **Can remove elements from collection?**
    → ❌ Not directly.

47. **Readable compared to normal for?**
    → ✔ Yes.

48. **Best use case?**
    → Reading data only.

49. **Can enhanced for create infinite loop?**
    → ❌ No.

50. **Example:**
    → `for(int x : arr) System.out.println(x);`

---

## 🚨 Loop Control Statements

51. **What is break?**
    → Stops loop immediately.

52. **What is continue?**
    → Skips current iteration.

53. **What is return inside loop?**
    → Exits loop & method completely.

54. **Where break mainly used?**
    → Switch & loops.

55. **Where continue mainly used?**
    → Skipping specific values.

56. **What is labeled break?**
    → Break outer loop.

57. **Syntax of labeled break:**

```
outer:
for(...) {
    for(...) {
        break outer;
    }
}
```

58. **Labeled continue?**
    → Skip to next iteration of outer loop.

59. **Use case of labeled loops?**
    → Breaking nested loops.

60. **Bad practice if overused?**
    → ✔ Yes.

---

## 🧠 Nested Loops

61. **What is nested loop?**
    → Loop inside another loop.

62. **Time complexity of nested loop?**
    → O(n²) generally.

63. **Real use case?**
    → Matrix, patterns printing.

64. **Can one loop be for and other while?**
    → ✔ Yes.

65. **Can nesting be unlimited?**
    → ❌ Practical limit exists.

66. **Risk of nested loops?**
    → Performance issues.

67. **Can we break inner loop only?**
    → ✔ Yes.

68. **Can we break outer?**
    → ✔ Labeled break.

69. **Pattern programs use?**
    → Nested loops.

70. **Printing tables uses?**
    → Nested loops.

---

## ⚙ Output-Based Questions

71. `for(int i=1;i<=5;i++) System.out.print(i);` → 1 2 3 4 5
72. `for(int i=5;i>=1;i--)` → 5 4 3 2 1
73. `for(int i=1;i<=5;i++); System.out.print(i);` → always 6
74. `while(false)` → compile error
75. `do { } while(false);` → runs once
76. `int i=0; while(i<3){ i++; }` → final i=3
77. `continue;` skips printing
78. infinite: `while(1==1)`
79. nested print star pattern
80. printing multiplication table.

---

## 🧩 Tricky & Logical

81. Missing update causes infinite loop.
82. Missing condition also infinite.
83. while(true) break possible.
84. do-while semicolon needed.
85. `for(int i=0;i<10;i+=2)` steps by 2.
86. `for(;;)` infinite loop.
87. `for(int i=0,j=10;i<j;i++,j--)` meets in middle.
88. continue jumps to update section.
89. break exits loop directly.
90. return exits method.

---

## 🏁 Concept Understanding

91. Loops reduce repeated code.
92. Loops improve performance & automation.
93. Use while when input-driven.
94. Use for when count known.
95. Use do-while when must run once.
96. Use for-each for collections.
97. Use break & continue carefully.
98. Avoid infinite loops.
99. Avoid deep nested loops.
100.  Debug loops using print statements.

---
