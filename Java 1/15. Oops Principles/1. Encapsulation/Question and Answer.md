# 🎓 **100 Encapsulation Interview Questions & Answers**

---

## ⭐ **Basics**

1. **What is Encapsulation?**
   → Binding data & methods together inside a single unit (class).

2. **Main goal of Encapsulation?**
   → To protect data (data hiding).

3. **How to achieve Encapsulation in Java?**
   → Using **private variables** + **public getter/setter methods**.

4. **Why Encapsulation needed?**
   → To control access and secure sensitive data.

5. **Is Encapsulation related to abstraction?**
   → ✔ Yes, abstraction hides implementation, encapsulation hides data.

6. **Is Encapsulation an OOP principle?**
   → ✔ Yes (one of the 4 pillars).

7. **Can class be encapsulated without setters?**
   → ✔ Yes, if read-only object.

8. **Can class be encapsulated without getters?**
   → ✔ Yes, if write-only object.

9. **Can Encapsulation exist without private variables?**
   → ❌ Not proper encapsulation.

10. **Does Encapsulation support security?**
    → ✔ Yes — prevents unauthorized access.

---

## 🔥 Key Concepts

11. Variables must be **private**.
12. Access using public methods.
13. Allows validation of data.
14. Protects internal structure.
15. Improves maintainability.

---

## 🧠 Access Modifiers & Encapsulation

16. Which access modifier best for encapsulation? → `private`.
17. Getter/Setter access modifier? → `public`.
18. Protected variables encapsulated? → Partially.
19. Default variables encapsulated? → Not outside package.
20. Encapsulation hides complexity from users.

---

## 🟣 Real Life Examples

21. ATM PIN check system.
22. Bank Balance information.
23. Login System ID & password.
24. Car Engine internal functioning.
25. Capsule in medicine (outer shell hides internal chemicals).

---

## 💡 Benefits

26. Secure data.
27. Easy change management.
28. Prevent incorrect values.
29. Code modularity.
30. Flexibility.

---

## 🟡 Advanced

31. Works with abstraction.
32. Used in frameworks (Spring/Hibernate entity classes).
33. Used in API design & DTO objects.
34. Easy debugging.
35. Reduces complexity.

---

## 🔍 Encapsulation vs Other Concepts

36. Encapsulation vs Abstraction.
37. Encapsulation vs Data hiding.
38. Encapsulation vs Inheritance.
39. Encapsulation vs Polymorphism.
40. Encapsulation vs static.

---

## ⚙ Implementation Questions

41. Why variables private? Better security.
42. Why getter/setter public? Controlled access.
43. Can setters include validation? ✔ Yes.
44. Can getters perform formatting? ✔ Yes.
45. Why avoid public fields? Breaks encapsulation.

---

## 🧠 Example-based Q/A

46. Updating balance using setter — secure change.
47. Prevent negative salary using validation.
48. Access hidden variable through getter.
49. Modify field safely through setter.
50. Read-only encapsulation using only getter.

---

## 🧾 MCQ Style

51. Encapsulation means? → data hiding.
52. Access modifiers allow encapsulation? → private.
53. Getter/setter required? ✔
54. Is class with public fields encapsulated? ❌
55. is final part of encapsulation? indirectly, yes (immutable objects).

---

## 🧪 Output Based / Tricky

56. Direct access of private variable? → compile error
57. Setting invalid value using setter? → rejected
58. Getter returns formatted output? ✔
59. Access private in same class? ✔
60. Child cannot directly access parent private variable? ✔

---

## 🧵 Relationship with Objects

61. Encapsulation improves maintainability.
62. Supports modular programming.
63. Used in large projects for security.
64. Object fields cannot be directly accessed outside.
65. Change in internal code does not affect user.

---

## ⚠ Misconceptions

66. Encapsulation is only for security? ❌ also structure & control.
67. Encapsulation hides code? ❌ abstraction hides code.
68. private always means encapsulation? ❌ setter/getter needed.
69. Encapsulation is optional? ❌ required for good design.
70. All classes encapsulated by default? ❌ only with private fields.

---

## 🧠 Practical Questions

71. why use getter instead of accessing variable?
72. Example where validation required.
73. Example where read-only class needed.
74. Strategy to avoid misuse of objects.
75. Class with immutable design.

---

## 🪢 Real Time Development

76. JDBC database encapsulation.
77. UI models in Android.
78. spring @Entity encapsulation.
79. API data transfer objects.
80. MVVM & MVC layered structure.

---

## 🧠 Deep questions

81. Encapsulation and interface relation.
82. Encapsulation with inheritance subtlety.
83. Using `final` fields with encapsulation.
84. Encapsulation performance discussion.
85. Immutable encapsulated classes.

---

## 🧩 Final Concept Checklist

86. Secure? ✔
87. Flexible? ✔
88. Maintainable? ✔
89. Easier debugging? ✔
90. Used everywhere? ✔ across OOP

---

## 💥 Closing Interview Questions

91. Can encapsulation break? yes via public fields.
92. Why not use public variables? unsafe.
93. Why using setter inside constructor? part of encapsulation.
94. Can setter be removed? for read-only.
95. Required skill for clean architecture? yes.

---

## 🎯 Extra Advanced

96. Encapsulation in serialization.
97. Encapsulation in multi-threading.
98. Encapsulation in security driven code.
99. Automatic encapsulation in Lombok.
100.  Encapsulation in microservices DTO.

---

# 💻 **Encapsulation Example Program**

```java
class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Suraj");
        s.setAge(21);

        System.out.println(s.getName() + " - " + s.getAge());
    }
}
```

### **Output**

```
Suraj - 21
```

---

# 💻 **Immutable Encapsulated Class Example**

```java
final class Employee {
    private final int id;
    private final String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}
```

---

# 📝 **Practice Coding Questions**

| #   | Question                                                |
| --- | ------------------------------------------------------- |
| 1   | Create encapsulated Student class with marks validation |
| 2   | Bank Account deposit/withdraw validation                |
| 3   | ATM PIN system using encapsulation                      |
| 4   | Salary class preventing negative salary                 |
| 5   | Read-only & write-only encapsulated class               |
| 6   | Library Book class with setter restrictions             |
| 7   | Car class using getter & setter                         |
| 8   | Employee class with age eligibility                     |
| 9   | Product stock update validation                         |
| 10  | Doctor/patient medical record encapsulation             |

---
