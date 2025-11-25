# 🎓 **100 Inheritance Interview Questions & Answers (Java)**

---

## ⭐ **Basics**

1. **What is inheritance?**
   → A mechanism where one class acquires properties (variables & methods) of another class.

2. **Why inheritance is used?**
   → Code reusability & method overriding.

3. **Which keyword is used for inheritance?**
   → `extends`.

4. **What is parent/base/super class?**
   → The class whose properties are inherited.

5. **What is child/sub/derived class?**
   → The class that inherits properties.

6. **Can Java have multiple inheritance using classes?**
   → ❌ No, because it leads to ambiguity (diamond problem).

7. **Can Java achieve multiple inheritance?**
   → ✔ Yes, using interfaces.

8. **How many parents can a single class extend?**
   → Only one (single inheritance).

9. **Can parent class access child members?**
   → ❌ No, opposite only.

10. **Does inheritance support method overriding?**
    → ✔ Yes.

---

## 🔥 **Types of inheritance in Java**

11. Single inheritance
12. Multilevel inheritance
13. Hierarchical inheritance
14. Multiple inheritance (via interface only)
15. Hybrid inheritance (via interface combination)

---

## 🧠 **Rules of inheritance**

16. Child class extends parent class.
17. Constructors are not inherited.
18. Private members are not inherited directly.
19. Static methods cannot be overridden.
20. final class cannot be inherited.

---

## 🟣 Constructor Related

21. Parent class constructor called first.
22. `super()` always executes before child constructor.
23. Child must call `super(args)` when parent lacks default constructor.
24. Constructor cannot be inherited.
25. Constructor overloading independent in inheritance.

---

## 🟡 Method Related

26. Methods are inherited.
27. Instance methods can be overridden.
28. Static methods cannot be overridden (method hiding).
29. final method cannot be overridden.
30. abstract method must be overridden.

---

## 🔥 Access Modifiers & Inheritance

31. private not inherited.
32. protected accessible to child.
33. public accessible everywhere.
34. default accessible in same package.
35. protected allows inheritance across packages.

---

## 🧾 Overriding & Polymorphism

36. Inheritance supports runtime polymorphism.
37. Parent reference can refer to child object.
38. Dynamic dispatch occurs at runtime.
39. return types must be same or covariant.
40. static binding vs dynamic binding difference.

---

## 🔍 Inheritance vs Other Concepts

41. Inheritance vs Composition.
42. Inheritance vs Interface.
43. Inheritance vs Aggregation.
44. Inheritance vs Abstraction.
45. Inheritance vs Encapsulation.

---

## ⚙ Memory & Execution

46. Parent loaded first.
47. Child object contains parent object reference.
48. super keyword used to refer parent.
49. polymorphism uses inheritance for execution.
50. method overriding resolves at runtime.

---

## 🧪 Scenarios

51. child class override method.
52. variable shadowing using same names.
53. call parent method using `super.method()`.
54. child can access protected.
55. use inheritance to share reusable logic.

---

## 🎤 Practical Usage

56. Real-time Banking model.
57. Vehicle class hierarchy.
58. Employee-Salary example.
59. Student details hierarchy.
60. Form validation chain.

---

## 🧠 Advanced

61. Multilevel inheritance chain control.
62. Using interface with inheritance hybrid.
63. Diamond problem explanation.
64. Why Java avoids multiple inheritance.
65. Interface solving diamond issue.

---

## 🧩 Trick Questions

66. Can we inherit private members? → ❌ directly
67. Can child override static? → ❌
68. What happens if parent abstract? → must override
69. super() mandatory? → if no default parent constructor
70. Can we stop inheritance? → final class

---

## 🧾 MCQ Type

71. Inheritance keyword? → extends
72. Parent reference to child object allowed? ✔
73. Child reference to parent object? ❌
74. Base class create object in hierarchy? Needed via child
75. constructor inheritance allowed? ❌

---

## 🧠 Real Implementation Use

76. Code reuse.
77. Standard model template.
78. overriding business logic.
79. customizing implementation.
80. reducing duplication.

---

## 🪢 Multi-Level Q&A

81. order: Grandparent → Parent → Child
82. super chain.
83. output trace question.
84. instance block execution order.
85. overriding chain.

---

## 💡 Final Summary

86. supports reusability.
87. supports polymorphism.
88. supports overriding.
89. reduces code.
90. increases maintainability.

---

## Extra Deep Questions

91. diamond problem explanation.
92. how interface solves diamond.
93. why avoid too deep inheritance.
94. composition recommended more.
95. has-a vs is-a relationship.

---

## Final 5 Quick Answers

96. Is inheritance optional? ✔
97. Why inheritance? reuse.
98. why avoid misuse? tight coupling.
99. recommended approach? composition.
100.  real-world example? car, bike, vehicle.

---

# 💻 **Example Program – Single Inheritance**

```java
class A {
    void show() {
        System.out.println("Parent Class");
    }
}

class B extends A {
    void display() {
        System.out.println("Child Class");
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
```

### Output

```
Parent Class
Child Class
```

---

# 💻 **Example – Multilevel Inheritance**

```java
class A { A() { System.out.println("A"); } }
class B extends A { B() { System.out.println("B"); } }
class C extends B { C() { System.out.println("C"); } }

public class Main {
    public static void main(String[] args) {
        new C();
    }
}
```

### Output

```
A
B
C
```

---

# 💻 **Example – Hierarchical**

```java
class Parent { void greet() { System.out.println("Hello Parent"); } }

class Child1 extends Parent {}
class Child2 extends Parent {}

public class Demo {
    public static void main(String[] args) {
        new Child1().greet();
        new Child2().greet();
    }
}
```

---

# 📝 **Practice Coding Questions**

| #   | Question                                              |
| --- | ----------------------------------------------------- |
| 1   | Program for single inheritance                        |
| 2   | Program for multilevel inheritance                    |
| 3   | Program for hierarchical inheritance                  |
| 4   | Program using method overriding                       |
| 5   | Program using super() with parameter                  |
| 6   | Program accessing parent variables with super         |
| 7   | Program demonstrating diamond problem using interface |
| 8   | Program shadowing parent variable                     |
| 9   | Program tracking constructor chain                    |
| 10  | Real time model: Employee → Manager → Director        |

---
