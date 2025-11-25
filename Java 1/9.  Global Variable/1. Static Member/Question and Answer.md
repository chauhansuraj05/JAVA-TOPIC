---
# 🎓 **100 Static Member Interview Questions & Answers (Java)**

## ⭐ Basics

1. **What is a static member?**
→ A member of a class that belongs to the class, not to objects.

2. **Types of static members?**
→ static variables, static methods, static blocks, static nested class.

3. **When is static member loaded?**
→ When class is loaded into memory.

4. **Where static members stored?**
→ Method area / class area of JVM memory.

5. **Can static variables be accessed without object?**
→ ✔ Yes, using class name.

6. **Can static members be accessed with an object?**
→ ✔ Yes, but not recommended.

7. **Can static method access non-static variables?**
→ ❌ No, requires object.

8. **Can non-static method access static variables?**
→ ✔ Yes.

9. **Can we override static methods?**
→ ❌ They are hidden, not overridden.

10. **Can static methods be overloaded?**
→ ✔ Yes.
---

## 🧠 Static Variables

11. **What is a static variable?**
    → A variable shared among all objects of the class.

12. **Default value of static variable?**
    → Depends on data type (e.g., 0, null, false).

13. **Does static variable occupy memory once?**
    → ✔ Yes.

14. **Can static variables be local?**
    → ❌ No.

15. **Can static variable exist outside class?**
    → ❌ No.

16. **Can static variable be final?**
    → ✔ Yes.

17. **Example usage of static variable?**
    → College name for all students.

18. **Static variable initialized when?**
    → Class load time.

19. **Can static variable be changed?**
    → ✔ Yes (if not final).

20. **Can static variables be accessed in main()?**
    → ✔ Yes.

---

## 🔥 Static Methods

21. Static methods belong to the class.
22. Called using class name.
23. Cannot use `this` keyword.
24. Cannot use `super()` keyword.
25. Can access only static members.
26. Cannot access instance variables directly.
27. Useful for utility functions.
28. JVM calls `main()` which is static.
29. Can have return type.
30. Can take parameters.

---

## ⚡ Static Block

31. **What is static block?**
    → Block executed during class loading.

32. **Syntax**

    ```
    static {
       // code
    }
    ```

33. **Use of static block?**
    → Initializing static variables.

34. **Execution time?**
    → Before main().

35. **Can static block throw exception?**
    → ✔ With try-catch.

36. **Can class have multiple static blocks?**
    → ✔ Yes.

37. **Execution order?**
    → Top to bottom.

38. **Static block vs constructor?**
    → Static block runs once, constructor runs on object creation.

39. **Main() missing but static block exists?**
    → Runs in older Java versions, otherwise error.

40. **Static block allowed in abstract class?**
    → ✔ Yes.

---

## 🧵 Static Class

41. **What is static nested class?**
    → Static class inside another class.

42. Is outer class static? → ❌ No.

43. Can static class access outer non-static? → ❌ No.

44. Create object of static class? → `Outer.Inner obj = new Outer.Inner();`

45. Why use static nested class? → Packaging & grouping.

---

## 🧪 MCQ / Trick Questions

46. Static method using non-static → compile error
47. Static variable shared by all objects → true
48. Static executes before constructor → true
49. Static block runs automatically? → Yes
50. Static main method can be overloaded? → Yes
51. JVM uses signature: `public static void main(String[] args)`
52. return type matters? → Yes
53. finalize() static? → No
54. local static? → Not allowed
55. synchronized static method? → Yes allowed

---

## 📌 Differences

56. static vs instance method
57. static vs instance variable
58. static block vs instance block
59. static class vs normal class
60. static import vs normal import

---

## 🚀 Practical Use Cases

61. Utility classes like `Math`, `Arrays`
62. Connection counters
63. Shared constants
64. Single resource configuration
65. Logger file usage

---

## ⚙ Memory Concepts

66. Static stores in class memory
67. Object heap contains instance variables
68. stack stores method calls
69. Class loads once
70. Object loads multiple times

---

## 🧱 Execution Flow

71. class loaded
72. static block executes
73. static variables initialized
74. main() executes
75. object created
76. constructor executes
77. instance block run
78. object garbage collected
79. static never destroyed until program end
80. JVM exits

---

## 🧩 Advanced

81. Static methods can be final
82. Static methods part of API
83. Static synchronized for thread safety
84. Static methods inside interface after Java 8
85. static import feature after Java 5
86. Static constants used in final exams
87. Static members best for constants
88. Class.forName triggers static block
89. static reference inside lambda allowed
90. static with enum allowed

---

## 🤔 Interview Based

91. Why static main method required?
92. Can main be non-static?
93. Why cannot use super in static?
94. How many times static block runs?
95. Where static members stored?
96. static vs final difference?
97. example use case in real life
98. static inside abstract class?
99. static in multi-threading
100.  Static methods cannot be overridden—why?

---

# 💻 PROGRAMMING QUESTIONS (As requested)

### **Program 1 – Static Variable Example**

```java
class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + " - " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Suraj");
        Student s2 = new Student("Rani");

        s1.show();
        s2.show();
    }
}
```

### **Output**

```
Suraj - ABC College
Rani - ABC College
```

---

### **Program 2 – Static Block Execution Order**

```java
class Test {
    static {
        System.out.println("Static Block Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Executed");
    }
}
```

### Output

```
Static Block Executed
Main Method Executed
```

---

### **Program 3 – Static Method Example**

```java
class Demo {
    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Demo.display();
    }
}
```

---

### **Program 4 – Static Count of Objects**

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Total Objects: " + count);
    }
}
```

---

### **Output**

```
Total Objects: 3
```

---
