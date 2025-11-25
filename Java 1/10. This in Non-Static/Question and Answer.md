# 🎓 **100 Interview Questions & Answers on `this` Keyword in Java**

## ⭐ **Basics**

1. **What is `this` keyword?**
   → A reference variable that refers to the **current object**.

2. **Is `this` a keyword or variable?**
   → Keyword (reserved).

3. **Why use `this` keyword?**
   → To avoid confusion between local & instance variables with the same name.

4. **Can we use `this` in static methods?**
   → ❌ No, because static does not belong to any object.

5. **Can we use `this` in non-static methods?**
   → ✔ Yes.

6. **Can constructor use `this`?**
   → ✔ Yes.

7. **Can `this` be used to call another method?**
   → ✔ `this.methodName()`.

8. **Can `this()` call constructor?**
   → ✔ Yes, used for constructor chaining.

9. **Must `this()` be first statement in constructor?**
   → ✔ Yes.

10. **Can `this` be used inside static block?**
    → ❌ No.

---

## 🔥 **`this` for Instance Variables**

11. Used to differentiate instance vs local variables.
12. `this.x = x;` assigns parameter to instance variable.
13. Helps remove naming conflict.
14. Used to reference current class variable.
15. Access non-static variables easily.

---

## 🧠 **`this` for Method Calling**

16. `this.show()` calls current object method.
17. Useful when method and variable names same.
18. Calls overloaded method internally.
19. Helps manage recursive class method references.
20. Useful in event-driven programming.

---

## 🟣 **`this()` Constructor Chaining**

21. Calls another constructor in same class.
22. Must be first statement in constructor.
23. Avoids code duplication.
24. Improves reusability.
25. Cannot be used multiple times.

---

## 🧵 **Restrictions**

26. Cannot be used in static context.
27. Cannot be used before super/this() inside constructor.
28. Cannot be used to call static variable.
29. Cannot be used to call static methods directly.
30. Cannot exist outside class.

---

## 🎤 **Object Reference**

31. `this` represents current object address.
32. Print `this` displays reference value.
33. Each object has different `this`.
34. Useful to return current object.
35. Used in builder design pattern.

---

## 🚀 **Uses of `this` keyword**

36. Resolve naming conflict.
37. Constructor chaining.
38. Passing object as argument.
39. Returning current object.
40. Accessing instance block.

---

## 🧪 **Program Examples**

41. Using `this` in constructor.
42. Using `this` in method call.
43. Using `this()` for chaining.
44. Using `this` for shadowing.
45. Returning `this` from method.

---

## ⚙ Advanced Concepts

46. Used in method overriding reference.
47. Used with setter methods.
48. Used in encapsulation.
49. Used in inheritance relationship.
50. Works only with objects.

---

## 🧾 MCQ Style

51. `this` refers to? → current object.
52. `this` in static? → compile error.
53. `this()`? → constructor call.
54. Must be first? → yes.
55. used to access? → non-static members.

---

## 📦 Practical Use Cases

56–60: Data structures using classes.
61–65: GUI event handling.
66–70: Builder pattern returning `this`.
71–72: Constructor overloading scenarios.
73–75: Method overload / chaining.

---

## 💡 Conceptual Q&A

76. Is `this` optional? → Yes if no conflict.
77. Can we write code without `this` always? → Yes sometimes.
78. Is `this` runtime or compile-time? → Runtime.
79. Does JVM manage `this`? → Yes.
80. Does each object have separate `this` reference? → Yes.

---

## 🧩 Tricky Questions

81. Can `this()` & `super()` be used together? → ❌ same line.
82. Access instance block with `this`? → ✔ Yes.
83. Is `this` required in method overriding? → Not required but useful.
84. Is `this` mandatory inside constructor? → Not always.
85. Can anonymous class use `this`? → Yes.

---

## 🏁 Comparison

86. `this` vs `this()` → reference vs constructor call.
87. `this` vs super → current object vs parent object.
88. `this()` vs `super()` → both must be first line.

---

## 📍 Memory Concepts

89. `this` references heap object.
90. stack stores reference pointer.
91. points to the object calling method.
92. destroyed when object removed.
93. live until object exists.

---

## 🧠 Real Interview Questions

94. Why use `this` in setters?
95. Example where local & instance name is same.
96. Output-based question printing `this`.
97. Why static cannot use `this`?
98. Can `this` call both static and non-static?
99. Where is `this` available in recursion?
100.  When exactly `this` is created? → Object creation time.

---

# 💻 **Example Program Using `this`**

```java
class Demo {
    int a;

    Demo(int a) {
        this.a = a; // using this
    }

    void display() {
        System.out.println("Value: " + this.a);
        System.out.println(this); // prints object address
    }

    public static void main(String[] args) {
        Demo d1 = new Demo(10);
        Demo d2 = new Demo(20);

        d1.display();
        d2.display();
    }
}
```

### **Output**

```
Value: 10
Demo@6d06d69c
Value: 20
Demo@7852e922
```

---

## 🚀 **Constructor Chaining Example**

```java
class Test {
    Test() {
        this(100);
        System.out.println("Default Constructor");
    }

    Test(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Test();
    }
}
```

### Output

```
Parameterized Constructor: 100
Default Constructor
```

---

# 🎯 Practice Questions (You should try)

1. Write a program with local & instance same name using `this`.
2. Show constructor chaining using `this()`.
3. Passing current object using `this`.
4. Returning current object using `this`.
5. Print object reference using `this`.

---
