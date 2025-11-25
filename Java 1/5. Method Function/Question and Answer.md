# 🎓 **100 Method Interview Questions & Answers (Java)**

## ⭐ Basics

1. **What is a method in Java?**
   → A block of code that performs a specific task and executes when called.

2. **Why do we use methods?**
   → To achieve reusability, modularity, readability.

3. **Syntax of a method?**
   → `returnType methodName(parameters) { body }`

4. **What is method signature?**
   → Method name + parameter list.

5. **Is return type part of method signature?**
   → ❌ No.

6. **Can a method have no return type?**
   → ✔ Yes, use `void`.

7. **Can a method return multiple values?**
   → ❌ Directly no, but possible using objects/arrays.

8. **What is a void method?**
   → A method that returns nothing.

9. **What is a parameter?**
   → Variable listed inside the method definition.

10. **What is an argument?**
    → Value passed when calling the method.

---

## 🟣 Types of Methods

11. **Types of methods in Java?**
    → User-defined & Predefined (library methods).

12. **What is a predefined method?**
    → Provided by Java, e.g., `println()`.

13. **What is a user-defined method?**
    → Created by programmer.

14. **Static method meaning?**
    → Belongs to class, can be called without object.

15. **Non-static method meaning?**
    → Belongs to object, requires object to call.

16. **Can static methods access non-static variables?**
    → ❌ No, needs object.

17. **Can non-static methods access static?**
    → ✔ Yes.

18. **What is main() method?**
    → Entry point of Java program.

19. **Main method syntax?**
    → `public static void main(String[] args)`

20. **Can we overload main()?**
    → ✔ Yes, but JVM calls only standard one.

---

## 🔵 Method Overloading

21. **What is method overloading?**
    → Same method name, different parameters.

22. **Why overloading used?**
    → Convenience and readability.

23. **Return type role in overloading?**
    → ❌ Cannot overload by return type only.

24. **Can static methods be overloaded?**
    → ✔ Yes.

25. **Access modifier affect overloading?**
    → ❌ No.

---

## 🟡 Method Overriding

26. **What is method overriding?**
    → Child class provides new implementation of parent method.

27. **Key rule of overriding?**
    → Same name, same parameters, different body.

28. **Why overriding used?**
    → Runtime polymorphism.

29. **Static methods overriding allowed?**
    → ❌ They are hidden, not overridden.

30. **Can private methods be overridden?**
    → ❌ No.

---

## 🧠 Parameters & Arguments

31. **What are parameter types in methods?**
    → Actual and formal parameters.

32. **What is pass by value?**
    → Java passes copy of variable.

33. **Does Java support pass by reference?**
    → ❌ No, reference copy is passed.

34. **Can method accept objects as arguments?**
    → ✔ Yes.

35. **Varargs meaning?**
    → Allows variable number of arguments.

36. **Syntax for varargs?**
    → `void show(int... a)`

37. **Can varargs be overloaded?**
    → ✔ Yes.

38. **Can we use multiple varargs in one method?**
    → ❌ Only one.

39. **Varargs must be last parameter?**
    → ✔ Yes.

40. **Is `int... a` same as array?**
    → ✔ Internally yes.

---

## 🔥 Return Type & Calling

41. **What is return statement?**
    → Returns value and exits method.

42. **Can return be used inside void?**
    → ✔ Yes, but without value.

43. **Can method return object?**
    → ✔ Yes.

44. **Can method call itself?**
    → ✔ Yes, recursion.

45. **Can method call another method?**
    → ✔ Yes.

46. **Where memory stores method calls?**
    → Stack memory.

47. **Can method have multiple return statements?**
    → ✔ Yes.

48. **What is method execution order?**
    → Call → Execute → Return to caller.

49. **Can we write method inside another method?**
    → ❌ Not allowed.

50. **Can method exist outside class?**
    → ❌ No, Java is fully class based.

---

## 💎 Access Modifiers

51. public → accessible everywhere
52. private → within class only
53. protected → same package + child
54. default → same package only
55. Access modifiers affect overriding? ✔

---

## 🧪 Advanced & Trick Questions

56. Recursion without stop condition → StackOverflowError
57. Can constructors call methods? ✔
58. Can methods call constructors? ✔ via `new`
59. Can abstract class have methods? ✔
60. Can interface contain methods? ✔ (abstract & default & static)
61. Method inside interface cannot be private? ❌ (Java 9 allows private)
62. Overriding reduces access modifier? ❌
63. Overriding increases access modifier? ✔
64. Covariant return type allowed? ✔
65. Same method name with different return only? ❌

---

## 🧩 Program Output Questions

66. Overloaded call based on argument type.
67. `method(null)` ambiguous if reference hierarchy conflict.
68. Recursion print order depends on call position.
69. Static method calling non-static not allowed.
70. Using object reference inside static method allowed.

---

## 💡 Real-Time Uses

71. Code reuse.
72. Centralized logic.
73. Service layer operations.
74. API design.
75. Helper & utility classes.

---

## ⚙ Runtime & Compile Time

76. Overloading → compile time polymorphism
77. Overriding → runtime polymorphism
78. JVM resolves overriding.
79. Compiler resolves overloading.
80. Method dispatch dynamic for overriding.

---

## 📌 Practical Challenges

81. Choosing best overloaded match.
82. Ambiguous call errors.
83. Using recursion wisely.
84. Infinite recursion danger.
85. Using varargs with care.

---

## ✔ MCQ style

86. main overloaded? ✔
87. Can override final? ❌
88. Can override static? ❌
89. Can overload private? ✔
90. Can propagate exceptions? ✔

---

## 🧵 Concept Summary

91. Method = collection of statements.
92. Improves reusability.
93. Helps modular programming.
94. Supports recursion.
95. Helps abstraction.
96. Used in encapsulation.
97. Used in OOP inheritance.
98. Used in polymorphism.
99. Must be inside class.
100.  **Everything in Java runs using methods.**

---

# 🎉 Done — 100 Java Method Interview Questions Completed!

---
