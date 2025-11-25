---

# 🎓 **100 Ternary Operator Interview Questions & Answers**

### **Basics**

1. **What is a ternary operator?**
   → A shorthand form of `if-else` using `?:`.

2. **Syntax of ternary operator?**
   → `condition ? value1 : value2;`

3. **How many operands ternary uses?**
   → 3 operands.

4. **Is ternary faster than if-else?**
   → Slightly faster & shorter, but depends on readability.

5. **Can ternary replace all if-else?**
   → ❌ No, only for simple conditions.

6. **Does ternary operator return a value?**
   → ✔ Yes.

7. **Is ternary operator same as conditional operator?**
   → ✔ Yes.

8. **Can ternary operator be nested?**
   → ✔ Yes, but affects readability.

9. **Example of ternary operator?**
   → `int result = (a > b) ? a : b;`

10. **What does ternary return?**
    → Either first value or second value based on condition.

---

### **Data Types**

11. **Can ternary return different data types?**
    → ✔ Yes with implicit conversion.

12. **Can ternary return objects?**
    → ✔ Yes.

13. **Can ternary return method calls?**
    → ✔ Yes.

14. **Can ternary return expressions?**
    → ✔ Yes.

15. **Can ternary return boolean values?**
    → ✔ Yes.

16. **Can ternary return strings?**
    → ✔ Yes.

17. **Can ternary return numbers?**
    → ✔ Yes.

18. **Do both returned values need same type?**
    → ✔ Mostly yes to avoid type conflict.

19. **Can ternary be used for variable assignment?**
    → ✔ Yes.

20. **Can ternary assign to final variable?**
    → ✔ Yes.

---

### **Examples**

21. **Biggest of two numbers using ternary?**
    → `int max = (a > b) ? a : b;`

22. **Check even or odd?**
    → `String s = (n % 2 == 0) ? "Even" : "Odd";`

23. **Check eligible for vote?**
    → `(age >= 18) ? "Yes" : "No"`

24. **Positive or Negative?**
    → `(n >= 0) ? "Positive" : "Negative"`

25. **Login status?**
    → `boolean logged = (password.equals("123")) ? true : false;`

---

### **Nested Ternary**

26. **Example of nested ternary?**
    → `int max = (a>b) ? (a>c? a:c) : (b>c? b:c);`

27. **Disadvantage of nested ternary?**
    → Hard to read & debug.

28. **Better alternative?**
    → if-else or switch.

---

### **Interview Conceptual Questions**

29. **Which executes first in ternary?**
    → Condition.

30. **Will both expressions execute always?**
    → ❌ Only selected one executes.

31. **Can ternary cause short-circuit evaluation?**
    → ✔ Yes.

32. **Is ternary operator right-associative?**
    → ✔ Yes.

33. **Operator precedence: ternary vs logical?**
    → Logical operators have higher precedence.

34. **Can ternary be used inside print()?**
    → ✔ Yes.

35. **Example inside print:**
    → `System.out.println(a>b ? "A" : "B");`

36. **Is ternary encouraged?**
    → ✔ For short logic, ❌ for complex logic.

37. **Can ternary have side effects?**
    → ✔ If using increment, function calls etc.

38. **Can we throw exception using ternary?**
    → ✔ Yes, `(x < 0) ? throw new RuntimeException() : x;`

---

### **Error / tricky Qs**

39. **Can ternary return void?**
    → ❌ Not directly.

40. **Can ternary replace switch entirely?**
    → ❌ No.

41. **What happens if both return types are different?**
    → Compilation error unless convertible.

42. **Ternary on multiple conditions example?**
    → `(a>b && a>c) ? a : c`

43. **Ternary inside loop allowed?**
    → ✔ Yes.

44. **Can ternary modify original object?**
    → ✔ If returning reference.

45. **Can ternary assign to multiple variables?**
    → ✔ But not readable.

---

### **Output-Based Questions**

46. `System.out.println(5>3 ? 10 : 20);` → 10
47. `System.out.println(5<3 ? 10 : 20);` → 20
48. `System.out.println(true ? "Yes" : "No");` → Yes
49. `System.out.println(false ? "Yes" : "No");` → No
50. `System.out.println((10==10) ? 1 : 0);` → 1
51. `System.out.println((10!=10) ? 1 : 0);` → 0
52. `(10>5?10:5)+5` → 15
53. `(10<5?10:5)+5` → 10
54. `System.out.println((5>10)?5+10:5*10);` → 50
55. `System.out.println((true)?(false?1:2):3);` → 2

---

### **Multi-level**

56. `(a>b) ? "bigger" : (a==b ? "equal" : "smaller")`
57. `(n>0)?"p":(n<0?"n":"z")`
58. `(x%3==0 && x%5==0)?"FizzBuzz":(x%3==0?"Fizz":"Buzz")`

---

### **Comparison & Theory**

59. Difference between if-else and ternary?
    → Ternary returns value; if-else executes block.

60. Which gives better readability?
    → if-else.

61. Can ternary help reduce LOC?
    → ✔ Yes.

62. Should ternary contain long expressions?
    → ❌ No.

63. Is ternary used in functional programming?
    → ✔ Often.

64. Does Java allow chained ternary?
    → ✔ Yes.

65. Can ternary be used for default values?
    → ✔ Example: `s = (str!=null) ? str : "Empty";`

---

### **Advanced**

66. Ternary with Optional in Java?
    → Can simplify null checks.

67. Ternary performance vs if-else?
    → Readability more important than speed.

68. Can ternary break switch?
    → ✔ In some cases replacing 2-3 cases.

69. Can ternary allocate objects based on condition?
    → ✔ Yes.

70. Ternary used in stream operations?
    → ✔ Yes.

---

### **Real Projects**

71. Default username logic?
    → `name = (input.isEmpty()) ? "Guest" : input;`

72. Pricing discount?
    → `price = (age>=60) ? price*.5 : price;`

73. Grading?
    → `grade = (marks>=50)?"Pass":"Fail";`

74. Min / Max example?
    → `int min = (a<b)?a:b;`

75. Login Success?
    → `msg = (status)? "Success" : "Failed";`

---

### **MCQ Style**

76. Is ternary unary or binary? → Ternary (3 operands)
77. Which operator used in ternary? → `? :`
78. `(true?false:true)` → false
79. `(false?false:true)` → true
80. `(10>20?"hi":10<5?"ok":"done")` → done

---

### **Coding Output**

81. `int x=5,y=10; int z=(x>y)?x:y;` → 10
82. `(x==5)?x++:++x;` → returns 5 then x becomes 6
83. `(x==6)?x++:++x;` → returns 7
84. `(false)?10/0:10*2` → 20
85. `(true)?10/0:10*2` → ArithmeticException

---

### **Pronunciation & Language**

86. Also called conditional operator? → ✔
87. C language supports ternary? → ✔
88. Python alternative? → `x if cond else y`
89. JavaScript ternary same? → ✔
90. C++ ternary same? → ✔

---

### **Practical Cases**

91. UI messages conditional
92. Button enable/disable
93. Logging
94. Mobile display changes
95. Selection of database environment
96. Environment variable shortcut
97. Null check placeholder
98. Validation condition
99. Sorting condition
100.  Toggle boolean → `flag = flag ? false : true;`

---
