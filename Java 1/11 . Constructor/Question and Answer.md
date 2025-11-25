---
# 🎓 **100 Constructor Interview Questions & Answers (Java)**

## ⭐ **Basics**

1. **What is a constructor?**
→ A special method used to initialize an object.

2. **When is a constructor called?**
→ Automatically when object is created using `new`.

3. **What is the name of a constructor?**
→ Same as class name.

4. **Does constructor have return type?**
→ ❌ No (not even void).

5. **Can constructor return a value?**
→ ❌ No.

6. **Can a constructor be static?**
→ ❌ No.

7. **Can a constructor be final?**
→ ❌ No.

8. **Can a constructor be abstract?**
→ ❌ No.

9. **Can constructor be private?**
→ ✔ Yes (Used in Singleton class).

10. **Can constructor be protected or public?**
→ ✔ Yes.
---

## 🔥 **Default Constructor**

11. **What is default constructor?**
    → Created by compiler when no constructor is written.

12. **Does default constructor take arguments?**
    → ❌ No.

13. **Does default constructor assign values?**
    → ✔ Yes (default values).

14. **When compiler stops creating default constructor?**
    → When we define any constructor manually.

---

## 🧠 **No-Argument Constructor**

15. **What is no-arg constructor?**
    → Constructor with empty brackets.

16. **Is no-arg constructor and default same?**
    → ✔ Same if created by compiler.
    → ❌ Different if created manually.

---

## 🟣 **Parameterized Constructor**

17. Constructor that takes parameters?
    → Parameterized constructor.

18. Use of parameterized constructor?
    → To initialize values at object creation.

19. Can we overload parameterized constructor?
    → ✔ Yes.

20. Can constructor call another constructor?
    → ✔ Yes using `this()`.

---

## 🟡 **Constructor Overloading**

21. What is constructor overloading?
    → Multiple constructors with same name but different parameters.

22. Advantage of constructor overloading?
    → Multiple ways to create objects.

23. Is constructor overloading runtime or compile-time?
    → Compile-time polymorphism.

24. Rules to overload constructor?
    → Change number, type or order of parameters.

---

## 🔵 **Constructor Chaining**

25. What is constructor chaining?
    → Calling one constructor from another.

26. How to chain within same class?
    → Using `this()`.

27. How to chain in parent-child?
    → Using `super()`.

28. Where must `this()` or `super()` appear?
    → First statement of constructor.

29. Can we use both `this()` and `super()` together?
    → ❌ Not allowed.

---

## 🎤 **super()**

30. What is `super()`?
    → Calls parent class constructor.

31. Is `super()` automatically inserted?
    → ✔ Yes if not written.

32. When does JVM insert `super()`?
    → At first statement internally.

33. Can `super()` call parameterized constructor?
    → ✔ Yes.

---

## ✨ **Execution Order**

34. Static block

35. Instance block

36. Constructor

37. Constructor runs?
    → Each time object created.

38. Can constructor call method?
    → ✔ Yes.

39. Can method call constructor?
    → ✔ Using `new`.

40. Does constructor allocate memory?
    → ❌ `new` allocates memory, constructor initializes.

---

## ⚙ Memory & Object

41. Constructor initializes instance variables.
42. No return value.
43. Called automatically.
44. Cannot call explicitly like a method.
45. Used to set state of object.

---

## 🧪 Inheritance + Constructors

46. Constructor cannot be inherited.
47. Constructor overriding? ❌ Not possible.
48. Constructor can be overloaded? ✔
49. Base class constructor executes first.
50. If parent has parameterized constructor, child must call using `super()` explicitly.

---

## 🧠 Conceptual Questions

51. Why constructors not inherited?
    → Child must define its own state.

52. Why no return type allowed?
    → JVM handles object creation.

53. Why constructor name same as class?
    → To identify special method.

54. Can interface have constructors?
    → ❌ No.

55. Can abstract class have constructors?
    → ✔ Yes.

56. Multiple constructors allowed?
    → ✔ Yes (overloading).

57. Private constructor purpose?
    → Control object creation.

58. Singleton class constructor type?
    → private.

59. When use constructor vs setter?
    → Constructor for mandatory data; setter for optional.

60. Constructor vs method difference?
    → Method has return type, constructor doesn’t.

---

## 🧾 MCQ style

61. Constructor automatically invoked? ✔
62. Can constructor be synchronized? ✔ Even though unnecessary.
63. Can constructor be generic? ✔ Yes.
64. Does constructor participate in inheritance? ❌
65. Can you call another constructor in same class? ✔ using this()
66. new keyword calls constructor? ✔
67. What happens if constructor private? Restricted instantiation
68. Can static block replace constructor? ❌ Only runs once
69. Constructor poly used? ✔ at compile time
70. Parameterized constructor mandatory? ❌ optional

---

## 🧩 Trick Questions

71. Can we overload constructor with same parameters? ❌
72. Constructor be recursive? ✔ Yes (but infinite loop risk)
73. Can constructor return object? ❌
74. Can constructor have try-catch? ✔
75. Can constructor throw exception? ✔
76. Order of constructor calling in inheritance? → Parent → Child
77. Can we define constructor inside method? ❌
78. Can final variable initialized inside constructor? ✔
79. main() inside constructor allowed? ✔ but useless
80. What if constructor private in superclass? → subclass cannot extend properly

---

## 🔍 Real-life Examples

81. Bank account creation.
82. Student details initialization.
83. Product price set.
84. Employee salary assign.
85. Car model details.

---

## 🧠 Summary

86. Constructor initializes objects.
87. Automatically called.
88. No return type.
89. Cannot override.
90. Can overload.
91. Supports chaining.
92. Calls parent constructor automatically.
93. One constructor can call another.
94. Used for encapsulation.
95. Needed for real applications.

---

## 🏁 Advanced

96. Constructor reference in lambda.
97. Reflection creates objects without constructors.
98. JVM invokes constructor after memory allocation.
99. Constructor invoked via `newInstance()` in reflection.
100.  Used for dependency injection in Spring Framework.

---

# 💻 **Example CODE – Constructor Chaining**

```java
class Test {
    Test() {
        this(10);
        System.out.println("Default Constructor");
    }

    Test(int x) {
        System.out.println("Parameterized Constructor " + x);
    }

    public static void main(String[] args) {
        new Test();
    }
}
```

### Output:

```
Parameterized Constructor 10
Default Constructor
```

---

# 💻 **Example – Constructor in Inheritance**

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        new Child();
    }
}
```

### Output:

```
Parent Constructor
Child Constructor
```

---

# 📝 **Constructor Practice Programs**

| #   | Program                                                     |
| --- | ----------------------------------------------------------- |
| 1   | Employee class using parameterized constructor              |
| 2   | Constructor chaining using this()                           |
| 3   | Inheritance constructor example with super()                |
| 4   | Student record using constructor                            |
| 5   | Count objects created                                       |
| 6   | Product billing system using constructor                    |
| 7   | Show difference between default & parameterized constructor |
| 8   | Constructor with Scanner input                              |
| 9   | Encapsulation using constructor                             |
| 10  | Car object storing model, price, brand                      |

---
