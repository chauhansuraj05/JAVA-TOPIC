# 🎓 **100 Interview Questions & Answers on `this()` in Java**

## ⭐ **Basics**

1. **What is `this()` in Java?**
   → A constructor call used to invoke another constructor in the same class.

2. **Purpose of `this()`?**
   → To achieve **constructor chaining** inside the same class.

3. **Can `this()` be used to call methods?**
   → ❌ No, it can only call constructors.

4. **Where must `this()` appear inside a constructor?**
   → First statement.

5. **Can we call `this()` more than once in a constructor?**
   → ❌ No.

6. **Can we use `this()` and `super()` together in same constructor?**
   → ❌ No, both must be first statement.

7. **Can `this()` call a constructor recursively?**
   → ❌ Possible but causes infinite recursion → StackOverflowError.

8. **Can constructor call multiple constructors?**
   → ❌ No, only one `this()` allowed.

9. **Can we use `this()` in static methods?**
   → ❌ No.

10. **Can `this()` call constructor with parameters?**
    → ✔ Yes, example: `this(10, "Suraj");`

---

## 🔥 **Usage & Benefits**

11. Helps avoid code duplication.
12. Improves maintainability.
13. Helps initialize common values centrally.
14. Used to create flexible object creation process.
15. Useful when many overloaded constructors exist.

---

## 🧠 **Constructor Chaining**

16. `this()` enables constructor chaining.
17. Chaining provides better object management.
18. Order of chained calls determined by `this()` sequence.
19. Last constructor does full initialization.
20. Chaining stops when no more `this()` calls exist.

---

## 🟣 **Rules**

21. Must be first line in constructor.
22. Only constructors can use `this()`.
23. this() cannot appear in methods.
24. Cannot follow other statements.
25. Cannot be combined with return statements.

---

## 🟡 **Errors**

26. `call to this() must be first statement` compile error.
27. Recursive constructor invocation error.
28. Ambiguous constructor call if parameters match multiple constructors.
29. `cannot use this() in static context`.
30. mixing `this()` & business logic before it causes compile error.

---

## 🔍 `this()` vs `this`

31. `this()` → calls constructor
32. `this` → refers to current object
33. `this()` must start constructor
34. `this` can be used inside any non-static method
35. `this` can access instance members but `this()` cannot

---

## 🔥 `this()` vs `super()`

36. `this()` calls constructor of same class
37. `super()` calls parent constructor
38. both cannot be in same constructor
39. both must be first statement
40. compiler adds `super()` implicitly but not `this()`

---

## ⚙ Execution Flow Questions

41. Constructor chaining begins from deepest parameter constructor.
42. Order matters for logic.
43. Output order equals chain call sequence.
44. Instance block executes before constructors.
45. Static block executes before chain.

---

## 🧪 Usage Scenarios

46. Chaining default constructor to parameterized constructor.
47. Chaining multiple parameterized constructors.
48. Center initialization in main constructor.
49. Use when common values exist.
50. Real scenario: student details initialization.

---

## 💡 Tricky Q&A

51. Can `this()` skip parameterized constructor? ✔
52. Can `this()` break chain? ❌
53. Can constructor be optional with `this()`? ✔
54. Can we use print before `this()`? ❌
55. this() allowed in abstract class constructor? ✔

---

## 🧾 MCQ Style

56. `this()` first statement? ✔
57. Used for chaining? ✔
58. this() calls method? ❌
59. works only in constructor? ✔
60. allowed in static block? ❌

---

## 🧩 Output-based logic examples

61. Order of printing inside chain.
62. nested chain with 3 constructors.
63. chain with multiple parameters.
64. ambiguous constructor error.
65. removing `this()` changes output.

---

## 🧠 Inheritance Context

66. Only `super()` works across classes.
67. `this()` works only inside same class.
68. mandatory call to `super()` always occurs.
69. If parent has no default constructor, chain must use `super(args)`.
70. Child cannot use `this()` to call parent constructor.

---

## 🪢 Real-world Usage

71. Product attributes default + customizable.
72. Student name, roll and dept optional chaining.
73. Constructor builder pattern style.
74. File handler default vs advanced options.
75. Vehicle details fuel type & model.

---

## 🧱 Advanced

76. Helps maintain consistency.
77. Avoids repeated assignments.
78. improves readability.
79. Common init block structured.
80. used in library design.

---

## 💥 Trick Situations

81. Overloaded constructors conflict order.
82. recursion via `this(this())` illegal.
83. stack overflow case from infinite chaining.
84. combining `this()` with thrown exceptions.
85. inner class constructor scenario.

---

## 🎯 Final Concepts

86. Always leads to central full constructor.
87. helps object creation variations.
88. helps dependency injection manually.
89. supports polymorphism behavior indirectly.
90. supports clean code architecture.

---

## ❤️ Summary

91. this() calls same class constructor
92. first line
93. one per constructor
94. cannot mix with super()
95. used for chaining
96. compile-time binding
97. improves maintainability
98. reduces duplication
99. common initializer approach
100.  essential OOP concept

---

# 💻 Example Program — Basic `this()` Chaining

```java
class Demo {
    Demo() {
        this(100);
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
```

### **Output**

```
Parameterized Constructor: 100
Default Constructor
```

---

# 💻 Example — Multiple `this()` Chaining

```java
class Test {
    Test() {
        this("Suraj");
        System.out.println("No-Arg Constructor");
    }

    Test(String name) {
        this(name, 21);
        System.out.println("String Constructor");
    }

    Test(String name, int age) {
        System.out.println("Full Constructor: " + name + " " + age);
    }

    public static void main(String[] args) {
        new Test();
    }
}
```

### Output

```
Full Constructor: Suraj 21
String Constructor
No-Arg Constructor
```

---

# 📝 Practice Coding Questions

| #   | Question                                                   |
| --- | ---------------------------------------------------------- |
| 1   | Create a program with 3 constructors chained using this()  |
| 2   | Student class with roll, name, marks chaining construction |
| 3   | Car brand, model, price chaining                           |
| 4   | Use this() to reuse common code                            |
| 5   | ATM balance initialization without duplication             |
| 6   | Demonstrate error on using code before this()              |
| 7   | Show difference between this() and super()                 |
| 8   | Constructor chaining using scanner input                   |
| 9   | Nested chaining order output                               |
| 10  | Use this() with calculations inside constructor            |

---
