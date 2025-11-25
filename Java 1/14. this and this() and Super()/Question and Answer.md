---

# 🧠 **100 Questions & Answers**

### 🔷 **Section 1: `this` keyword (Current object reference)**

1. **What is `this` keyword?**
   → Reference variable that refers to the current object.

2. **Why is `this` keyword used?**
   → To differentiate instance variables from local variables.

3. **Where can `this` be used?**
   → Inside constructors and non-static methods.

4. **Can `this` be used in a static method?**
   → ❌ No, because static does not belong to object.

5. **Can `this` be used to call instance methods?**
   → ✔ Yes. Example: `this.display()`.

6. **Can `this` keyword return the current object?**
   → ✔ Yes, return this; is valid.

7. **Can `this` be printed?**
   → ✔ Yes, it prints memory address of object.

8. **Can `this` access class variables?**
   → ✔ Yes.

9. **Is `this` used for resolving variable shadowing?**
   → ✔ Yes.

10. **Can we assign values using `this` keyword?**
    → ✔ Example: `this.x = x`.

11. **Is `this` used for constructor chaining?**
    → ❌ No, that’s `this()` not `this`.

12. **Can `this` call another constructor?**
    → ❌ No, `this()` does.

13. **Is `this` automatically added by compiler?**
    → ✔ Yes, when accessing instance members.

14. **Is `this` compulsory always?**
    → ❌ No, only when local & instance variable names match.

15. **Can `this` refer to parent object?**
    → ❌ No.

---

### 🔶 **Section 2: `this()` constructor calling**

16. **What is `this()`?**
    → A constructor calling another constructor of the same class.

17. **Where is `this()` used?**
    → Inside constructors only.

18. **Must `this()` be the first statement?**
    → ✔ Yes.

19. **Can we use print statement before `this()`?**
    → ❌ No.

20. **Can `this()` reduce code duplication?**
    → ✔ Yes.

21. **Can a constructor contain more than one `this()`?**
    → ❌ No.

22. **Can we use both `this()` and `super()` in same constructor?**
    → ❌ No.

23. **What is constructor chaining?**
    → Linking multiple constructors through `this()`.

24. **Can `this()` call parameterized constructor?**
    → ✔ Yes.

25. **Can `this()` call default constructor?**
    → ✔ Yes.

26. **Who inserts `super()` automatically?**
    → Compiler, if not written.

---

### 🟣 **Section 3: `super()`**

27. **What is `super()`?**
    → Calls constructor of parent class.

28. **Where is `super()` used?**
    → Inside child constructor.

29. **Must `super()` be the first statement?**
    → ✔ Yes.

30. **What if we don’t write `super()`?**
    → Compiler automatically inserts default super().

31. **Can `super()` call parameterized constructor?**
    → ✔ Yes.

32. **Can `super()` access parent variables?**
    → ✔ Yes.

33. **Can `super()` access parent methods?**
    → ✔ Yes.

34. **Can `super()` call parent static members?**
    → ❌ Not directly.

35. **Can we call both parent and child constructor?**
    → ✔ Yes, automatically via chaining.

36. **Can we use print statement before `super()`?**
    → ❌ No.

37. **Is `super()` used in inheritance?**
    → ✔ Yes.

38. **Can `super()` call grandparent constructor?**
    → ✔ Yes indirectly.

39. **Can `super()` be used in static block?**
    → ❌ No.

40. **Can we overload parent methods using super?**
    → ✔ Yes.

---

### 🟩 **Section 4: Short conceptual Q&A**

41. **Can `this` and `super` be used together?**
    → ✔ Yes, but not in same statement.

42. **Can `this()` be written after super()?**
    → ❌ No.

43. **Is `super` a keyword?**
    → ✔ Yes.

44. **Is `this` a keyword?**
    → ✔ Yes.

45. **Can `super` refer to object indirectly?**
    → ✔ Conceptually.

46. **Does `super()` always call default constructor?**
    → ❌ No, depends on parameters.

47. **Can constructors be inherited?**
    → ❌ No.

48. **Does constructor return value?**
    → ❌ No.

49. **Will deleting parent constructor cause error in child?**
    → ✔ Yes, if calling super().

50. **Can child class skip parent constructor?**
    → ❌ No.

---

### ✨ More Quick Q&A (51-100 Rapid)

51. `this` refers to current object? → ✔
52. `super()` refers to parent constructor? → ✔
53. `this()` inside static method? → ❌
54. `super()` inside static method? → ❌
55. Use of `super.variable`? → Access parent variable
56. Use `this.variable`? → Access current variable
57. `this()` must be first? → ✔
58. Can main use this? → ❌
59. Is constructor chaining possible via `super()`? → ✔
60. Can we call `super()` from method? → ❌
61. Can parent be abstract? → ✔
62. Will constructor run without object creation? → ❌
63. Can class have many constructors? → ✔
64. What is overriding? → Same method diff class
65. Can super call overridden method? → ✔ super.method()
66. Can we skip constructor? → ❌
67. What is default constructor? → No-parameter constructor
68. Who creates default constructor? → Compiler
69. Why use constructor? → Initialize object
70. Constructor return type? → None
71. Can constructor be final? → ❌
72. Can constructor be abstract? → ❌
73. Can constructor private? → ✔
74. Use? → Singleton
75. Can constructor static? → ❌
76. `super()` usage for readability? → ✔
77. Call parents method? → super.show()
78. Can we overload constructor? → ✔
79. Can super call private members? → ❌
80. Can call parent variable? → `super.x`
81. Can we create object without new? → some cases like cloning
82. What is memory block? → Object heap
83. Constructor executes when? → Object creation
84. Execution order? → Parent → Child
85. What is polymorphism? → Many forms
86. What is inheritance? → Acquire parents properties
87. What is encapsulation? → Data hiding
88. Why use super()? → Parent initialization
89. Can constructor call method? → ✔
90. Can `this` call method? → ✔
91. Can constructor final? → ❌
92. Can use super more than once? → ❌
93. Which runs first? → super()
94. Can we use loop before super? → ❌
95. Can throw exception before super? → ❌
96. Can this refer parent? → ❌
97. Can super refer child? → ❌
98. `this()` and method name same? → Constructor call
99. Default super invocation? → Automatic
100.  Main reason for `this()`? → Avoid duplication & chaining

---
