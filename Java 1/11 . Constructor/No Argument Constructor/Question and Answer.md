---

# 🎓 **30 No-Argument Constructor Interview Questions & Answers**

### **1. What is a No-Argument Constructor?**

→ A constructor that has **no parameters** inside parentheses like: `ClassName(){ }`.

### **2. Is a No-Argument constructor same as Default Constructor?**

→ ✔ Yes if written by compiler.
→ ❌ No if written manually by programmer (called *explicit no-arg constructor*).

### **3. Who creates the no-argument constructor automatically?**

→ The **Java compiler**, only when no constructor is defined.

### **4. When is compiler auto-generated constructor NOT created?**

→ When **any** constructor already exists in class.

### **5. Does a no-argument constructor return any value?**

→ ❌ No return type.

### **6. Can a no-argument constructor have a body?**

→ ✔ Yes, you may write statements inside.

### **7. Does a no-argument constructor initialize default values?**

→ ✔ Yes (0, null, false).

### **8. Can we declare a no-argument constructor manually?**

→ ✔ Yes.

### **9. Can we overload no-argument constructor?**

→ ✔ Yes using parameterized constructors.

### **10. Can no-argument constructor call parameterized?**

→ ✔ Yes using `this(parameters)`.

### **11. Can no-argument constructor call another constructor?**

→ ✔ Yes only using `this()` as first statement.

### **12. Can constructor be private?**

→ ✔ Yes, useful in Singleton class.

### **13. Can a no-argument constructor throw an exception?**

→ ✔ Yes using try-catch inside.

### **14. When is no-argument constructor executed?**

→ When object is created using: `new ClassName()`.

### **15. Is main() method needed for constructor execution?**

→ ✔ Yes because object created inside main.

### **16. Can interface have no-argument constructor?**

→ ❌ No.

### **17. Can abstract class have no-argument constructor?**

→ ✔ Yes.

### **18. Is constructor inherited?**

→ ❌ No.

### **19. Can constructor be final?**

→ ❌ No.

### **20. Can constructor be static?**

→ ❌ No.

### **21. Can constructor be abstract?**

→ ❌ No.

### **22. Does no-argument constructor call `super()`?**

→ ✔ Yes implicitly.

### **23. Which happens first: constructor or static block?**

→ Static block executes first.

### **24. Which happens first: constructor or instance block?**

→ Instance block executes first.

### **25. Can we create multiple objects using no-arguments constructor?**

→ ✔ Yes.

### **26. Is it possible to print values before object creation?**

→ ✔ Using static block, not constructor.

### **27. Can we initialize instance variables inside no-argument constructor?**

→ ✔ Yes.

### **28. Can constructor return current object?**

→ ❌ No return type, cannot explicitly return object.

### **29. What is the difference between no-argument & parameterized constructor?**

→ No argument → gives default values
→ Parameterized → assigns values using arguments.

### **30. Example real-life use of no-argument constructor**

→ Initialize default settings (e.g., default balance = 0 in bank).

---

# 💻 **Example Program – No Argument Constructor**

```java
class Demo {
    Demo() {  // No argument constructor
        System.out.println("No Argument Constructor Called");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
```

### **Output**

```
No Argument Constructor Called
```

---

# 💻 **Example Program – No Argument + Parameterized Constructor**

```java
class Student {
    String name;
    int roll;

    Student() {
        System.out.println("No Argument Constructor");
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Suraj", 101);
        System.out.println(s2.name + " " + s2.roll);
    }
}
```

---

# 💻 **Constructor Chaining Example**

```java
class Example {

    Example() {
        this(500);  // calling parameterized constructor
        System.out.println("No-Argument Constructor");
    }

    Example(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Example();
    }
}
```

### Output

```
Parameterized Constructor: 500
No-Argument Constructor
```

---

# 📝 **Practice Coding Questions**

| #   | Question                                                                |
| --- | ----------------------------------------------------------------------- |
| 1   | Write class with no-argument constructor printing message               |
| 2   | Initialize default values using no-argument constructor                 |
| 3   | Create student class using no-argument and parameterized constructors   |
| 4   | Show constructor chaining using this()                                  |
| 5   | Program to count objects created using no-argument constructor          |
| 6   | Call instance method inside no-argument constructor                     |
| 7   | No-argument constructor with Scanner input                              |
| 8   | Inheritance example using super()                                       |
| 9   | Display difference between local & instance variable using constructors |
| 10  | Use no-argument constructor to initialize array                         |

---
