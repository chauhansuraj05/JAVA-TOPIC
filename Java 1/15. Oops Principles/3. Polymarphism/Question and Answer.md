# 🎓 **100 Polymorphism Interview Questions & Answers**

---

## ⭐ **Basics**

1. **What is polymorphism?**
   → Ability of an object to behave in **multiple forms**.

2. **Types of polymorphism?**
   → Compile-Time & Runtime polymorphism.

3. **Another name for Compile-Time polymorphism?**
   → Method Overloading / Static Polymorphism.

4. **Another name for Runtime polymorphism?**
   → Method Overriding / Dynamic Polymorphism.

5. **How is polymorphism achieved in Java?**
   → Method Overloading & Method Overriding.

6. **What is the main benefit of polymorphism?**
   → Flexibility & maintainability.

7. **Why polymorphism used?**
   → To perform different behavior with same method name.

8. **Is polymorphism part of OOP?**
   → ✔ Yes, one of four principles.

9. **Can polymorphism exist without inheritance?**
   → Compile-time yes, runtime no.

10. **Which polymorphism uses inheritance?**
    → Runtime polymorphism.

---

## 🔥 Compile-Time Polymorphism (Overloading)

11. Achieved by method overloading.
12. Performed during compile time.
13. Faster than runtime polymorphism.
14. Same method name, different arguments.
15. Return type can be different if parameters differ.
16. Cannot overload by only return type.
17. Can overload static methods.
18. Can overload constructors.
19. Cannot overload by only changing access modifiers.
20. Overloading improves code readability.

---

## 🔥 Runtime Polymorphism (Overriding)

21. Achieved by method overriding.
22. Uses inheritance.
23. Resolved at runtime (Dynamic binding).
24. Same method name & same signature.
25. Different implementation in child class.
26. Must involve parent-child relationship.
27. Cannot override static methods.
28. Cannot override final & private methods.
29. Can override abstract methods.
30. Achieves runtime decision behavior.

---

## 🧠 Important Rules

31. Method overriding requires inheritance.
32. Return types must be same or covariant.
33. Access modifier cannot be reduced in overriding.
34. `super.method()` used to call parent method.
35. JVM decides method at runtime in overriding.

---

## 🟣 Polymorphism & References

36. Parent reference can refer to child object.
    → `Parent p = new Child();`

37. This enables runtime polymorphism.

38. Child reference cannot store parent object.

39. Reference type decides what can be accessed.

40. Object type decides which implementation to run.

---

## 🔍 Polymorphism vs Other Concepts

41. Polymorphism vs Inheritance.
42. Polymorphism vs Encapsulation.
43. Polymorphism vs Abstraction.
44. Polymorphism vs Method Overloading.
45. Polymorphism vs Method overriding.

---

## ⚙ Use Cases

46. Web framework controllers.
47. Payment gateway processing.
48. Shape drawing applications.
49. Database connection switching.
50. Logging system implementations.

---

## 🧪 Real-Life Examples

51. Person speaking Hindi, English differently.
52. Same car brake works differently in snow mode.
53. Same remote play button works on TV, AC, fans.
54. Same button action performs different action depending on device.
55. Same animal sound different animals.

---

## 🧾 MCQ Style

56. Polymorphism achieved by? → Overloading & overriding
57. Dynamic binding also called? → Runtime polymorphism
58. Binding done by JVM? → Runtime polymorphism
59. private methods overridden? → ❌
60. final methods overridden? → ❌

---

## 🧩 Output & Trick Questions

61. overriding vs hiding.
62. overloading confusion by data type.
63. runtime reference switching behavior.
64. which method executes? parent or child?
65. abstract class polymorphism example.

---

## 🧠 Abstract & Interface

66. Abstract class supports runtime polymorphism.
67. Interface supports runtime polymorphism.
68. Interface methods always override.
69. dynamic behavior created using interface references.
70. polymorphism with default interface methods.

---

## 🪢 Casting & Polymorphism

71. Upcasting supports polymorphism.
72. Downcasting requires explicit cast.
73. dynamic class cast exception scenario.
74. polymorphism + generics relationship.
75. object type vs reference type difference.

---

## 🧱 Advanced & Theory

76. Virtual method call concept.
77. v-table mechanism support.
78. overriding in multi-level hierarchy.
79. covariant return type rule.
80. runtime polymorphism and performance overhead.

---

## 🔥 Key Interview Hotspots

81. Why polymorphism necessary?
82. Where used in real projects?
83. How design pattern uses polymorphism? (Strategy Pattern)
84. Why avoid too much polymorphism?
85. Polymorphism in Spring (beans).

---

## 💥 Final Key Points

86. One object many forms.
87. allows flexibility.
88. improves extensibility.
89. eliminates conditional logic.
90. improves code maintenance.

---

## ❤️ Final 10 Understanding Questions

91. Why cannot override static? method hiding.
92. Why runtime polymorphism dynamic decision?
93. Can constructor be polymorphic? partly via overloading.
94. Can exception affect overriding? yes rule applies.
95. can interface reference store child object? yes.
96. can abstract objects be polymorphic? yes via reference.
97. real example of runtime polymorphism.
98. how JVM selects method? dynamic dispatch.
99. role of upcasting? allows polymorphism.
100.  Difference: compile-time vs runtime polymorphism?

---

# 💻 Example – Runtime Polymorphism

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog(); // upcasting
        obj.sound();
    }
}
```

### Output

```
Dog barks
```

---

# 💻 Example – Compile-Time Polymorphism (Overloading)

```java
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

---

# 📝 **Practice Programs**

| #   | Program Question                                     |
| --- | ---------------------------------------------------- |
| 1   | Shape: Circle, Square, Triangle runtime polymorphism |
| 2   | Bank: SBI, HDFC, ICICI rate of interest overriding   |
| 3   | Vehicle: Car, Bike runtime overriding                |
| 4   | Animal sound overriding program                      |
| 5   | Payment method: UPI, Card, NetBanking runtime        |
| 6   | Student calculation using method overloading         |
| 7   | Compile & runtime polymorphism together              |
| 8   | Covariant return type overriding example             |
| 9   | super.method() example                               |
| 10  | Interface polymorphism example                       |

---
