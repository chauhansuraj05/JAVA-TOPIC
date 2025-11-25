---
# 🎓 **100 Method Overloading Interview Questions & Answers**

## ⭐ Basics

1. **What is method overloading?**
→ Declaring multiple methods with the same name but different parameters in the same class.

2. **Why do we use method overloading?**
→ To increase readability and flexibility by performing similar tasks with different inputs.

3. **How is method overloading achieved in Java?**
→ By changing number, type or order of parameters.

4. **Other name of method overloading?**
→ Compile-time polymorphism.

5. **Does return type play a role in overloading?**
→ ❌ No, return type alone cannot overload a method.

6. **Can method overloading occur in same class?**
→ ✔ Yes.

7. **Can method overloading occur in different class?**
→ ✔ Through inheritance indirectly.

8. **Can private methods be overloaded?**
→ ✔ Yes.

9. **Can static methods be overloaded?**
→ ✔ Yes.

10. **Can constructors be overloaded?**
→ ✔ Yes.
---

## 🔥 Rules / Concepts

11. **Three ways to overload a method?**
    → Change **number**, **type**, **order** of parameters.

12. **Can we overload method by changing return type only?**
    → ❌ No.

13. **Can we overload by changing access modifier?**
    → ❌ Not enough.

14. **Can we overload by changing exceptions?**
    → ❌ No.

15. **Can overloaded methods have different names?**
    → ❌ Must have same name.

16. **Who resolves method overloading?**
    → Compiler.

17. **When does binding happen?**
    → Compile time.

18. **Can abstract methods be overloaded?**
    → ✔ Yes.

19. **Is method signature important for overloading?**
    → ✔ Yes.

20. **What is method signature?**
    → Method name + parameter list.

---

## 🧠 Parameter Related Questions

21. **Overload by increasing parameters?**
    → ✔ Yes.

22. **Overload by decreasing parameters?**
    → ✔ Yes.

23. **Overload by different datatype?**
    → ✔ Yes.

24. **Overload by changing order?**
    → ✔ Yes.

25. **Example of order-based overloading?**
    → `display(int, String)` vs `display(String, int)`.

26. **Can we overload varargs method?**
    → ✔ Yes.

27. **Conflict between varargs and exact type?**
    → Prefer exact type first.

28. **Varargs with int vs int[] conflict?**
    → Yes, error if ambiguous.

29. **Overloading with wrapper classes (Integer, Double)?**
    → Possible.

30. **Can autoboxing affect overloading selection?**
    → ✔ Yes.

---

## 🔵 Static & Overloading

31. **Are static methods overloadable?**
    → ✔ Yes.

32. **Can static methods override?**
    → ❌ Only hide, not override.

33. **Can main() be overloaded?**
    → ✔ Yes.

34. **Does JVM call overloaded main()?**
    → ❌ It always calls `main(String[] args)`.

35. **Can overloaded static have different return types?**
    → ✔ Yes.

---

## 🟣 Constructor Overloading

36. **What is constructor overloading?**
    → Multiple constructors with different parameters.

37. **Use of constructor overloading?**
    → Different ways to initialize object.

38. **Can default and parameterized constructor overload?**
    → ✔ Yes.

39. **Can constructor be private?**
    → ✔ Yes.

40. **Can constructor return type overload?**
    → ❌ no return type in constructor.

---

## 🏁 Polymorphism

41. **Is overloading polymorphism?**
    → ✔ Compile-time polymorphism.

42. **Difference between overloading and overriding?**
    → Overloading = same class, same method name, different parameters.
    Overriding = child class modifies parent method.

43. **Which happens at compile time?**
    → Overloading.

44. **Which happens at run time?**
    → Overriding.

45. **Polymorphism meaning?**
    → Many forms.

---

## ✨ Output & Code-based Questions

46. `sum(int,int)` vs `sum(float,float)` → chosen by argument type
47. Ambiguous overload → compilation error
48. `print(10)` calls `print(int)`
49. `print('A')` calls `print(char)`
50. `print(10L)` calls `print(long)`
51. `print(10.5)` calls `print(double)`
52. `print(null)` depends on reference type
53. `fun(Integer)` vs `fun(int)` → int preferred
54. Boxing & widening conflict? → widening wins
55. Boxing vs varargs conflict? → boxing wins

---

## 💯 Theory & Conceptual

56. Overloading cannot differ only by return type.
57. Overloading improves code readability.
58. Can overload final methods? → ✔ Yes.
59. Can overload synchronized methods? → ✔ Yes.
60. Can overload native methods? → ✔ Yes.
61. Can overload method from parent? → ✔ Based on params.
62. Overloaded method selection based on argument match.
63. Order of resolution: exact → widening → boxing → varargs
64. Ambiguity resolved? → ❌ compile-time error.
65. void return vs int return → allowed.

---

## 🧪 Real-world Examples

66. `println()` overloaded in PrintStream.
67. Scanner `nextInt()`, `nextLine()` overload-like operations.
68. Math `abs()` overloaded.
69. Method `add()` in ArrayList overloaded.
70. Constructors overload in `String`.

---

## 🎤 Practical Use Case

71. Payment methods (UPI, card, cash).
72. Area calculation (circle, square).
73. Logging different data types.
74. Sorting with different inputs.
75. Database insert(id, name) vs insert(object).

---

## 🧩 Deep & Advanced

76. Can we overload generic methods? ✔
77. Can we overload operators in Java? ❌
78. Autoboxing + Overloading tricky questions.
79. Overloading with interface references.
80. Boolean type overload allowed? ✔
81. Char & int confusion example.
82. Overloading resolution hierarchy.
83. Null argument conflict.
84. Runtime binding not used.
85. JVM overload resolution.

---

## 📝 Short Q&A

86. Is overloading reusable? ✔
87. Can interface have overloaded methods? ✔
88. Can annotation methods overload? ✔
89. Overloaded with default parameters? ❌ in Java
90. Kotlin default args act like overload.
91. C++ supports function overloading? ✔
92. Python supports? ✔ by default handling
93. Can we overload private? ✔
94. Can we overload protected? ✔
95. Can we overload static blocks? ❌
96. Can overloaded methods be recursive? ✔
97. Can interface use overload for polymorphism? ✔
98. Can overloaded methods call each other? ✔
99. Overloading improves performance? ✔ Less branching
100.  Real reason for overloading? ✔ Clean API design

---
