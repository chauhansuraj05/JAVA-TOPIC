---
# 🎓 **100 Non-Static Member (Instance Member) Interview Questions & Answers**

## ⭐ Basics

1. **What is a non-static member?**
→ A variable or method that belongs to an object, not the class.

2. **Other name of non-static member?**
→ Instance member.

3. **Where are non-static variables stored?**
→ Heap memory (inside object).

4. **When are non-static members created?**
→ When an object is created.

5. **When are non-static members destroyed?**
→ When object is garbage collected.

6. **How to access non-static members?**
→ Using object reference.

7. **Can non-static members access static members?**
→ ✔ Yes.

8. **Can static members access non-static members directly?**
→ ❌ No, requires object.

9. **Can non-static members use `this` keyword?**
→ ✔ Yes.

10. **Can non-static members use `super()`?**
→ ✔ If inside constructor.
---

## 🔥 Non-static Variables

11. **What is a non-static variable?**
    → A variable defined inside a class outside method, but not static.

12. **Default value of non-static variable?**
    → Provided automatically (0, null, false, etc.)

13. **Are non-static variables object-specific?**
    → ✔ Yes.

14. **Each object gets separate copy?**
    → ✔ Yes.

15. **Can non-static variable be final?**
    → ✔ Yes.

16. **Can non-static variable be local?**
    → ❌ No, local variables are not inside class.

17. **Can non-static variable be accessed in static method?**
    → ❌ Without object.

18. **Example real use?**
    → Student name, roll number, marks.

19. **Stored where?**
    → Heap memory.

20. **Created when?**
    → Object created.

---

## 🔵 Non-static Methods

21. **What is non-static method?**
    → A method that needs an object to call.

22. **Can non-static method access both static + non-static members?**
    → ✔ Yes.

23. **Can static method call non-static method?**
    → ❌ Without object.

24. **Can non-static method be overloaded?**
    → ✔ Yes.

25. **Can non-static method be overridden?**
    → ✔ Yes.

26. **Can non-static method be synchronized?**
    → ✔ Yes.

27. **Can non-static method return value?**
    → ✔ Yes.

28. **Entry point of program?**
    → Does not require non-static, only static `main()`.

29. **Is `this` keyword used inside non-static methods?**
    → ✔ Yes.

30. **Can non-static method be final?**
    → ✔ Yes.

---

## 🧱 Memory & Lifecyle

31. Object: allocated on heap.
32. Non-static variable inside object.
33. Garbage collector destroys objects.
34. JVM handles memory.
35. Static memory separate from object memory.
36. Non-static created per object.
37. Static created once.
38. Non-static exists until object exists.
39. Object reference required.
40. Multiple objects have different non-static values.

---

## ⚡ Access Rules

41. Access with object reference.
42. No access via class name.
43. No calling inside static without object.
44. Non-static can access static freely.
45. static cannot access non-static freely.

---

## 🎯 Difference

46. Static belongs to class.
47. Non-static belongs to object.
48. Static shared by all objects.
49. Non-static unique for each object.
50. Static loads once.
51. Non-static loads multiple times.
52. static memory vs heap memory.
53. static cannot use this.
54. non-static can use this.
55. static cannot call super().
56. non-static can.

---

## 🧪 Overriding Related

57. Overriding applies to non-static methods.
58. static cannot override.
59. runtime polymorphism for instance methods.
60. method dispatch dynamic for instance methods.

---

## 🧩 Common Errors

61. Access non-static inside static → error
62. Non-static reference from static context → error
63. object cannot be created inside static incorrectly
64. calling instance before object create.

---

## 🤔 Interview Usage

65. real-life example: Student object
66. real-life: Bank account
67. real-life: Employee salary
68. two objects have different values example
69. variable shadowing with this
70. instance block usage.

---

## 🧠 OOP Concepts Connection

71. Encapsulation uses non-static variables.
72. Inheritance overrides non-static methods.
73. Polymorphism runtime uses non-static.
74. Abstraction uses non-static definitions.
75. this & super used by non-static.

---

## 🧵 MCQ Style

76. non-static created when → object created
77. can main call non-static directly? → no
78. memory location for instance? → heap
79. which belongs to class? → static
80. which belongs to object? → instance
81. instance = non-static? ✔
82. static called without object? ✔
83. instance called without object? ❌
84. super used in non-static? ✔
85. method hiding affects static, overriding affects non-static.

---

## 🧪 Output / Logical

86. each object prints different instance
87. but same static prints same
88. instance changed → only that object affected
89. static changed → all affected
90. instance method can modify instance variables only

---

## 💡 Practical

91. Calculator object storing values
92. Mobile object storing model & price
93. Student records example
94. Employee ID & name
95. Bank balance fields

---

## 💥 Summary

96. Instance created via new keyword
97. data allocated in heap
98. referenced by reference variable
99. used widely in OOP
100.  essential for real-world objects

---

---

# 💻 **PROGRAMS (As Requested)**

### **Program 1 – Basic Non-Static Variable & Method**

```java
class Demo {
    int x = 20; // non-static variable

    void show() { // non-static method
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();   // object created
        d.show();              // calling non-static method
    }
}
```

---

### **Program 2 – Difference Between Static & Non-Static**

```java
class Test {
    static int a = 100;    // static
    int b = 200;           // non-static

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.b = 500;
        System.out.println(t1.b); // 500
        System.out.println(t2.b); // 200
        System.out.println(a);    // 100
    }
}
```

---

### **Program 3 – Using `this` with Non-Static Variable**

```java
class Sample {
    int num;

    Sample(int num) {
        this.num = num;
    }

    void show() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        new Sample(10).show();
        new Sample(20).show();
    }
}
```

---

### **Program 4 – Non-Static Block**

```java
class Example {
    {
        System.out.println("Instance Block");
    }

    Example() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Example();
        new Example();
    }
}
```

**Output**

```
Instance Block
Constructor
Instance Block
Constructor
```

---

# 📝 Practice Questions

| #   | Question                                                                        |
| --- | ------------------------------------------------------------------------------- |
| 1   | Write program to demonstrate non-static variable difference between two objects |
| 2   | Write program to call non-static method from static using object                |
| 3   | Write program using `this` keyword                                              |
| 4   | Show difference between static & non-static members                             |
| 5   | Count number of objects using instance variable                                 |
| 6   | Show instance block execution                                                   |
| 7   | Create student class storing different details                                  |
| 8   | Demonstrate instance method overriding                                          |
| 9   | Show accessing static inside non-static                                         |
| 10  | Example printing object memory using `this`                                     |

---
