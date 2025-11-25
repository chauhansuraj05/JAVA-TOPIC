# 🎓 **100 Abstraction Interview Questions & Answers**

---

## ⭐ **Basics**

1. **What is abstraction?**
   → Hiding internal implementation details and showing only required functionality to the user.

2. **Why abstraction used?**
   → To simplify complexity and improve security.

3. **How abstraction is achieved in Java?**
   → Using **abstract classes** and **interfaces**.

4. **What is the main purpose of abstraction?**
   → To hide implementation and expose behavior.

5. **Is abstraction part of OOP principles?**
   → ✔ Yes (one of the 4 pillars).

6. **Can abstract class create object?**
   → ❌ No.

7. **Can interface create object?**
   → ❌ No.

8. **What is an abstract method?**
   → A method with no body, only declaration.

9. **How to declare abstract method?**
   → `abstract void show();`

10. **Can abstract method exist inside normal class?**
    → ❌ No, only in abstract class.

---

## 🔥 Abstract Class

11. Created using `abstract` keyword.
12. May contain abstract methods.
13. May contain non-abstract methods.
14. May contain constructors.
15. May contain variables & static methods.

---

## 🧠 Rules of Abstract Class

16. Cannot instantiate.
17. Must be extended.
18. child class must override abstract methods.
19. abstract class may have final methods.
20. abstract class may have static methods.

---

## 🔥 Interfaces

21. 100% abstraction before Java 8.
22. Can contain default & static methods (Java 8+).
23. Can contain private methods (Java 9+).
24. Interface variables are `public static final` by default.
25. Interface methods are `public abstract` by default.

---

## 🧠 Abstract Class vs Interface

26. abstract class can contain constructor; interface cannot.
27. interface supports multiple inheritance; abstract class cannot.
28. abstract class 0–100% abstraction; interface 100% abstraction originally.
29. interface used for capability; abstract for base model.
30. abstract class can have any modifier variables; interface only public.

---

## 🟡 Method Related

31. overriding required for abstract methods.
32. non-abstract methods optional to override.
33. private abstract method allowed? ❌
34. static abstract allowed? ❌
35. final abstract method allowed? ❌ contradiction.

---

## 🧾 MCQ Style

36. abstraction hides complexity? ✔
37. abstract keyword required? ✔ for class/method.
38. abstract class with no abstract method allowed? ✔
39. interface multiple inheritance? ✔
40. abstract class extends another abstract class allowed? ✔

---

## 🔍 Implementation Questions

41. Is partial abstraction possible? ✔ using abstract class.
42. Can abstract class contain abstract constructor? ❌
43. Can abstract class implement interface? ✔
44. Can abstract class extend normal class? ✔
45. Can interface extend interface? ✔

---

## 🔥 Runtime & Design Questions

46. Abstraction reduces coupling.
47. Improves code scalability.
48. Implementation decided later.
49. used in frameworks.
50. separating what vs how.

---

## 🧠 Inheritance & Abstraction

51. supports runtime polymorphism.
52. abstract class reference can store child object.
53. method chosen based on object type.
54. constructor chaining still runs.
55. cannot instantiate abstract parent.

---

## 🪢 Real Life Examples

56. ATM machine working (user sees menu, not logic).
57. Car brake pedal (user presses, internal mechanism hidden).
58. Mobile phone UI (hides hardware details).
59. TV remote functionality.
60. Online payment hidden processing.

---

## 🧩 Trick Questions

61. Can abstract class final? ❌
62. Can interface final? ❌
63. Can abstract class be private? ❌
64. Can abstract method be protected? ✔
65. Can interface method be private? ✔ after Java 9.

---

## 🧾 More MCQ

66. class must override all abstract methods? ✔
67. constructor allowed in abstract? ✔
68. child must call parent constructor implicitly? ✔
69. can interface contain main()? ✔
70. can interface contain static block? ❌

---

## ⚙ Advanced Concepts

71. Adapter design pattern uses abstraction.
72. Strategy design pattern built on abstraction.
73. abstraction used in API design.
74. abstraction improves testing.
75. abstraction used in layered architecture.

---

## 💡 Comparison Questions

76. abstraction vs encapsulation.
77. abstraction vs polymorphism.
78. abstraction vs inheritance.
79. abstract class vs normal class.
80. interface vs abstract class real usage.

---

## 🧱 Benefits

81. clean code.
82. manage complexity.
83. loose coupling.
84. scalable design.
85. reusable code components.

---

## 🧩 Final Trick Interview Questions

86. multiple classes implement single interface? ✔
87. abstract class with no abstract methods? ✔
88. can interface have private variable? ❌
89. can final class be abstract? ❌
90. can abstract class have static block? ✔

---

## 🎤 Final 10

91. Why abstraction? hide implementation.
92. Ensure security? ✔
93. Can you achieve 100% abstraction? ✔ via interface.
94. abstract method signature? no body.
95. abstract constructor? ❌
96. interface default methods? ✔
97. implementing 2 interfaces? ✔
98. real-time project use? multiple.
99. OOP pillar? ✔
100.  abstraction meaning? show only essentials.

---

# 💻 **Example Program — Abstract Class**

```java
abstract class Animal {
    abstract void sound();  // abstract method

    void sleep() {
        System.out.println("Animals Sleep");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();  // polymorphism
        a.sound();
        a.sleep();
    }
}
```

### Output

```
Dog barks
Animals Sleep
```

---

# 💻 **Example — Interface**

```java
interface Shape {
    void draw(); // abstract method
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
```

---

# 📝 **Practice Programs**

| #   | Program Question                            |
| --- | ------------------------------------------- |
| 1   | Abstract class Shape with Circle, Rectangle |
| 2   | Bank interest rate using abstraction        |
| 3   | Vehicle example using interface             |
| 4   | Payment gateway UPI/Card/NetBanking         |
| 5   | Employee Salary structure using abstraction |
| 6   | Multiple inheritance using interface        |
| 7   | Abstract class with constructor & method    |
| 8   | Runtime polymorphism using abstraction      |
| 9   | Abstract class + interface combined example |
| 10  | Real-time Hospital example abstraction      |

---
