# 🎓 **100 Conditional Statements Interview Questions & Answers**

## **Basics**

1. **What is a conditional statement?**
   → A statement that executes code based on a condition.

2. **Examples of conditional statements?**
   → `if`, `else`, `else-if`, `switch`.

3. **Purpose of conditional statements?**
   → To control program flow based on decisions.

4. **Syntax of if statement?**
   → `if(condition) { //code }`

5. **What type must condition be in Java?**
   → Boolean type.

6. **Can we write if without else?**
   → ✔ Yes.

7. **Can we write else without if?**
   → ❌ No.

8. **Can if contain only one line?**
   → ✔ Yes, braces optional.

9. **Can if contain multiple statements?**
   → ✔ Yes, using `{ }`.

10. **Can condition be an assignment?**
    → ✔ But confusing and bad practice.

---

## **Else & Else-if**

11. **What is else used for?**
    → Executes when `if` condition is false.

12. **What is else-if used for?**
    → Multiple conditions.

13. **Can we use multiple else-if?**
    → ✔ Yes.

14. **Is else mandatory?**
    → ❌ No.

15. **Can else-if be used without if?**
    → ❌ No.

16. **Which executes first in chain?**
    → Top condition.

17. **When does none of the block run?**
    → If all conditions false and no else available.

18. **Execution order of nested if?**
    → Inner if executes only if outer if is true.

19. **Else binds to nearest if – true or false?**
    → ✔ True.

20. **What is dangling else problem?**
    → Else attached to wrong if due to improper braces.

---

## **Switch Statement**

21. **What is switch used for?**
    → Replace multiple else-if conditions.

22. **Switch syntax?**

    ```
    switch(value) {
       case x: // code
               break;
       default: // code
    }
    ```

23. **What data types allowed in switch?**
    → int, byte, short, char, String, enum.

24. **Is switch faster than if-else?**
    → ✔ Usually yes for multiple options.

25. **What is break in switch?**
    → Prevents fall-through.

26. **What happens if break missing?**
    → Execution continues to next case.

27. **Is default mandatory?**
    → ❌ No, but good practice.

28. **Where can default be placed?**
    → Anywhere inside switch.

29. **Can switch work with boolean?**
    → ❌ No.

30. **Can switch check ranges?**
    → ❌ No, only equality.

---

## **Examples**

31. Even or odd:
    `if(n % 2 == 0)`

32. Largest of two numbers:
    `(a > b)`

33. Largest of three numbers (if):
    `(a>b && a>c)`

34. Grade system using else-if chain.

35. Menu-based calculator using switch.

36. Day number to day name using switch.

37. Vowel or consonant using switch.

38. Positive, negative, zero using if/else.

39. Login authentication.

40. Student result pass/fail.

---

## **Real Interview Conceptual**

41. **Can switch compare objects?**
    → ❌ except String & Enum indirectly.

42. **Which is more readable — switch or if?**
    → Depends on scenario.

43. **Use switch when?**
    → Fixed values comparison.

44. **Use if when?**
    → Ranges, complex comparisons.

45. **Difference between if and switch?**
    → If supports relational & logical operations; switch deals with equality only.

46. **Nested switch allowed?**
    → ✔ Yes.

47. **Return inside if allowed?**
    → ✔ Yes.

48. **Break inside if?**
    → ❌ Only loops and switch allow break.

49. **Continue inside if?**
    → ❌ Only loops.

50. **Switch inside loop allowed?**
    → ✔ Yes.

---

## **Tricky Questions**

51. `if(true)` executes? → ✔ Yes
52. `if(false)` executes? → ❌
53. `if(1)` valid in Java? → ❌
54. `if(x = y)` valid? → ✔ but wrong logic
55. Empty if valid? → ✔
56. Can if contain return statements? → ✔
57. else without braces? → ✔
58. Multiple conditions in if? → ✔ using && ||
59. Can switch handle null? → ❌ except String with null check
60. Can switch compare floats? → ❌

---

## **Output Based**

61. `if(5>3) System.out.println("Hi");` → Hi
62. `if(false); System.out.println("Yes");` → Yes
63. Nested example:

```
if(true)
 if(false) print A
 else print B
```

Output → B

64. Switch fall-through example outputs next case.

65. `switch(10) case 5: case 10:` prints case 10.

66. Missing break executes two cases.

67. Default at top still executes when no case match.

68. `switch('A') case 65:` works if int matches.

69. `switch("hello") case "hello"` valid.

70. `(x>y)?x:y` simplified if.

---

## **Logical Operators in Conditions**

71. AND (&&) — true only if both true.
72. OR (||) — true if any true.
73. NOT (!) — reverse condition.
74. `if(a>10 && b<5)`
75. `if(a>5 || b==0)`
76. Short-circuit evaluation saves time.
77. `&&` stops if first false.
78. `||` stops if first true.
79. Use precedence with parentheses.
80. `true && false || true` → true.

---

## **Best Practices**

81. Use switch for multiple equals checks.
82. Avoid deep nested if.
83. Use braces always.
84. Always write default case.
85. Use return inside if to avoid deep nesting.
86. Use ternary for short conditions.
87. Avoid complex ternary—use if.
88. Format code properly.
89. Use meaningful comments.
90. Optimize logical expressions.

---

## **Advanced**

91. Switch expression in Java 14+
92. Arrow labels `case 1 ->`
93. Switch returns value
94. Multiple labels `case 1,2,3 ->`
95. Pattern matching switch upcoming
96. Switch with enum better than strings
97. If-else with streams in FP
98. Boolean flags simplify if
99. Use enums instead of numeric cases
100.  Avoid magic numbers in conditions

---
