# 🎓 **100 Interview Questions & Answers on `super()` in Java**

---

## ⭐ **Basics**

1. **What is `super()` in Java?**
   → A constructor call used to invoke the **parent class constructor**.

2. **Why use `super()`?**
   → To initialize parent class variables & reuse parent initialization logic.

3. **Where must `super()` be placed inside a constructor?**
   → Must be the **first line**.

4. **Is `super()` automatically added by compiler?**
   → ✔ Yes — if not written explicitly and parent has a default constructor.

5. **Can `super()` be used inside methods?**
   → ✔ Yes (e.g., `super.method()` to call parent method).

6. **Can `super()` call a parameterized constructor?**
   → ✔ Yes, e.g., `super(10)`.

7. **Can `super()` appear after some statements?**
   → ❌ No — compile-time error.

8. **Can `super()` and `this()` be used in same constructor?**
   → ❌ No — both must be first statement.

9. **What happens if parent class has only parameterized constructor?**
   → Child must explicitly call `super(args)`.

10. **Can `super()` be used in static context?**
    → ❌ No.

---

## 🔥 **Purpose & Benefits**

11. Used for constructor chaining in inheritance.
12. Avoid code duplication.
13. Reuse parent initialization logic.
14. Ensure parent object initialization first.
15. Helps achieve hierarchical OOP structure.

---

## 🧠 Inheritance Behavior

16. Constructor execution always begins from parent.
17. Child constructor cannot execute before parent.
18. Multiple derivation chain possible (multilevel).
19. `super()` helps preserve parent class structure.
20. Used in overriding to access parent method.

---

## 🟣 Rules

21. Only one `super()` allowed.
22. Must be first statement.
23. Cannot call `super()` outside constructor.
24. Cannot call private parent constructor.
25. Cannot access static context.

---

## 🟡 `super()` vs `this()`

26. `super()` → parent constructor
27. `this()` → same class constructor
28. both cannot appear together
29. both must be first
30. difference in scope: parent vs class chaining

---

## 🧾 MCQ style

31. super() automatically inserted? ✔
32. super() calls parent constructor? ✔
33. can call method? ✔ super.method()
34. static cannot use super? ✔
35. parent constructor runs first? ✔

---

## 🔍 `super` (without parentheses) vs `super()`

36. `super` → reference to parent object
37. `super()` → calls parent constructor
38. `super.variable` → access parent variable
39. `super.method()` → call parent method
40. used often in overriding

---

## ⚙ Common compile errors

41. statement before super() → Illegal
42. Parent constructor missing → error
43. wrong super arguments → mismatch error
44. multiple >1 super() calls → error
45. calling super() inside method → error

---

## 🔥 Example Uses

46. calling parent default constructor.
47. calling parent parameterized.
48. resolving variable shadowing.
49. calling overridden method.
50. calling parent block effect.

---

## 🧪 Output-based conceptual

51. order: parent constructor → child constructor
52. print sequence evaluation
53. super(10) changes output
54. multi-level effect example
55. no default parent constructor error case

---

## 💡 Conceptual Questions

56. why constructor inheritance not allowed?
57. why super mandatory sometimes?
58. why first statement? initialization hierarchy.
59. what happens if removed? default super()
60. difference between overriding & hiding? super supports overriding.

---

## 🧠 Real usage

61. UI framework construction.
62. Spring, Hibernate core POJO initialization.
63. base configuration class initialization.
64. parent resource allocation.
65. database connection standard setup.

---

## 🧩 Trick Advanced

66. multiple-level constructor call chain.
67. protected constructor access with super().
68. private parent constructor prevents inheritance.
69. super in anonymous inner class.
70. super with exceptions thrown.

---

## 🧵 Multi-level Inheritance

71. execution: grandparent → parent → child
72. super calls cascade.
73. overriding chain logic.
74. instance block order in multi-level.
75. static block hierarchy.

---

## 🪢 Polymorphism Interaction

76. super.method() to access overridden parent method.
77. runtime dispatch still respects override.
78. constructor chaining not runtime — compile time.
79. polymorphism doesn't affect constructor order.
80. method overriding uses super to access original code.

---

## 🪼 Misconceptions

81. super() does not create object — `new` does.
82. super() not optional if parent lacks default constructor.
83. this() not same as super().
84. overriding constructors not allowed.
85. super cannot access private members directly.

---

## 🏁 Final Quick Points

86. First parent, then child.
87. First initialize parent variables.
88. Used for clarity & clean code.
89. Use parameterized super() when required.
90. constructor chaining essential for OOP architecture.

---

## 🚀 Extreme Questions

91. What if parent throws exception? → must handle.
92. Can child block override super behavior? no.
93. Why super cannot be second? memory already built.
94. Can interface use super()? no constructors.
95. abstract parent constructor chaining? yes.

---

## 🎤 Interview Closing

96. real example from industrial Java code.
97. recommended usage guidelines.
98. performance effect minimal.
99. readability improves.
100.  maintainability improves.

---

# 💻 **Basic Program Example — super()**

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        new Child();
    }
}
```

### **Output**

```
Parent Constructor
Child Constructor
```

---

# 💻 **Program — Parameterized super()**

```java
class Parent {
    Parent(int x) {
        System.out.println("Parent: " + x);
    }
}

class Child extends Parent {
    Child() {
        super(100);
        System.out.println("Child Default");
    }
}

public class Demo {
    public static void main(String[] args) {
        new Child();
    }
}
```

### Output

```
Parent: 100
Child Default
```

---

# 💻 **Multi-level super() Chaining**

```java
class A {
    A() { System.out.println("A"); }
}

class B extends A {
    B() { super(); System.out.println("B"); }
}

class C extends B {
    C() { super(); System.out.println("C"); }
}

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

# 📝 **Practice Coding Questions**

| #   | Question                                               |
| --- | ------------------------------------------------------ |
| 1   | Program using super() & this() difference              |
| 2   | constructor chaining 3 levels inheritance              |
| 3   | Parameterized super() example                          |
| 4   | Multi-level inheritance order of execution             |
| 5   | Show compile error if parent lacks default constructor |
| 6   | super.variable and super.method() example              |
| 7   | Diamond problem scenario demonstration                 |
| 8   | super() and overriding example                         |
| 9   | super() in abstract class example                      |
| 10  | real-world Student, Person, Employee example           |

---
