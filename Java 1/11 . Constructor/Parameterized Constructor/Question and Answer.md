---

# 🎓 **30 Parameterized Constructor Interview Questions & Answers**

### **1. What is a parameterized constructor?**

→ A constructor that accepts **arguments/parameters** to initialize object values.

### **2. Why do we use parameterized constructor?**

→ To provide **custom initialization** to objects at creation time.

### **3. What is the syntax of a parameterized constructor?**

```java
ClassName(datatype variable) { }
```

### **4. Can a class have both default and parameterized constructors?**

→ ✔ Yes.

### **5. What happens if we define any constructor in a class?**

→ Compiler **does not** create default constructor automatically.

### **6. Can parameterized constructor initialize instance variables?**

→ ✔ Yes.

### **7. Can parameterized constructor call another constructor?**

→ ✔ Yes using `this()`.

### **8. Can constructor call a method?**

→ ✔ Yes.

### **9. Can a constructor return a value?**

→ ❌ No explicit return type.

### **10. Can a constructor be private?**

→ ✔ Yes (Used in Singleton design pattern).

---

## 🔥 **Overloading & Usage**

### **11. Can parameterized constructor be overloaded?**

→ ✔ Yes.

### **12. Can parameterized constructor be overridden?**

→ ❌ No, constructors are not inherited.

### **13. Is order of parameters important?**

→ ✔ Yes.

### **14. Can we use `this` keyword inside parameterized constructor?**

→ ✔ Yes, used to distinguish field names from parameters.

### **15. Can `this()` be used inside parameterized constructor?**

→ ✔ Yes, but must be first statement.

### **16. Can constructor take different data types?**

→ ✔ Yes (supports overloading).

### **17. Can constructor throw exceptions?**

→ ✔ Yes using try-catch inside.

---

## 🧠 Memory & Object

### **18. When parameterized constructor executes?**

→ When object created with values: `new ClassName(value)`.

### **19. Does each object call parameterized constructor separately?**

→ ✔ Yes.

### **20. Does parameterized constructor have a return type?**

→ ❌ No.

### **21. Can we make constructor static?**

→ ❌ No.

### **22. Can parameterized constructor be abstract or final?**

→ ❌ No.

### **23. Can abstract class have parameterized constructor?**

→ ✔ Yes.

### **24. Can interface have constructor?**

→ ❌ No.

### **25. Can inheritance use parameterized constructor?**

→ ✔ Yes, using `super()`.

---

## ⚙ Real Use Cases

### **26. Where parameterized constructor used in real life?**

→ Initializing object values like Student details, Employee records, Bank accounts.

### **27. Example using constructor based initialization?**

→ Setting values while creating objects.

### **28. Can parameterized constructor be used for encapsulation?**

→ ✔ Yes using private variables + constructor.

### **29. Can constructor chaining include parameterized constructor?**

→ ✔ Yes.

### **30. What is difference between default & parameterized constructor?**

| Default Constructor    | Parameterized Constructor |
| ---------------------- | ------------------------- |
| No parameters          | Has parameters            |
| Created by compiler    | Created by programmer     |
| Assigns default values | Assigns given values      |

---

# 💻 **PROGRAM 1 — Basic Parameterized Constructor**

```java
class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Suraj");
        Student s2 = new Student(102, "Rani");

        s1.display();
        s2.display();
    }
}
```

### **Output**

```
101 Suraj
102 Rani
```

---

# 💻 **PROGRAM 2 — Constructor Chaining**

```java
class Test {
    Test() {
        this(500);  // calling parameterized constructor
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

### **Output**

```
Parameterized Constructor: 500
Default Constructor
```

---

# 💻 **PROGRAM 3 — Using Scanner in Parameterized Constructor**

```java
import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID & Name:");
        int id = sc.nextInt();
        String name = sc.next();

        Employee e = new Employee(id, name);
        e.show();
    }
}
```

---

# 📝 **Practice Coding Questions**

| #   | Program Task                                                            |
| --- | ----------------------------------------------------------------------- |
| 1   | Create a class Employee using parameterized constructor with id, salary |
| 2   | Create product class with price, quantity & calculate total             |
| 3   | Write program for multiple constructor overloading                      |
| 4   | Use constructor chaining using `this()`                                 |
| 5   | Create class Car storing model, brand, year                             |
| 6   | Program for Student result calculation                                  |
| 7   | Create Bank account class storing balance                               |
| 8   | Show difference between default & parameterized constructor             |
| 9   | Use constructor to multiply two numbers                                 |
| 10  | Show object count using static + parameterized constructor              |

---
