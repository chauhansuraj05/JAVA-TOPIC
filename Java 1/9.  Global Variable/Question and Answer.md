---

# 🎓 **Global Variable Interview Questions WITH Answers**

### **1. What is a global variable in Java?**

→ Java does not have real global variables, but **instance variables** & **static variables** act like global variables within a class.

### **2. Does Java support globally accessible variables like C/C++?**

→ ❌ No. All variables must be inside a class.

### **3. Which variables act as global variables in Java?**

→ **Instance variables** and **static (class-level) variables**.

### **4. Where are global (instance) variables declared?**

→ Inside a class but **outside all methods**.

### **5. Where are static global variables declared?**

→ Inside a class and marked with the **static** keyword.

### **6. Where are global variables stored?**

| Type              | Stored In                |
| ----------------- | ------------------------ |
| Instance variable | Heap Memory              |
| Static variable   | Method Area / Class Area |

### **7. When are global (instance) variables created?**

→ When an object of the class is created.

### **8. When are static global variables created?**

→ When the class is loaded into memory.

### **9. Do global variables have default values automatically?**

→ ✔ Yes (0, null, false, 0.0 depending on datatype).

### **10. Do local variables have default values?**

→ ❌ No, must be initialized before use.

### **11. Can global variables be final?**

→ ✔ Yes.

### **12. Can global variables be static?**

→ ✔ Yes.

### **13. Can we access global variable inside main() method?**

→ ✔ Yes, using object (instance) or className (static).

### **14. Can we access static global variable without object?**

→ ✔ Yes: `ClassName.variable`.

### **15. Can we access instance global variable without object?**

→ ❌ No.

### **16. Can a global variable be accessed in constructor?**

→ ✔ Yes.

### **17. Can global variable be accessed in all methods of same class?**

→ ✔ Yes.

### **18. Can global variable be accessed from another class?**

→ ✔ If public / getter method is provided.

### **19. Can we use `this` keyword with instance variable?**

→ ✔ Yes, used to differentiate from local variable.

### **20. Can we use `this` keyword with static variable?**

→ ❌ No.

### **21. Are global variables object-specific?**

→ Instance → ✔ Yes
Static → ❌ Same for all objects

### **22. Can two objects have different global values?**

→ For instance → ✔ Yes

### **23. Can two objects share same global variable value?**

→ Static → ✔ Yes

### **24. What is scope of global variable?**

→ Entire class.

### **25. Can global variables cause memory overload?**

→ ✔ If used excessively.

### **26. Why avoid too many global variables?**

→ Increases **coupling**, reduces **encapsulation**.

### **27. Can global variable be private?**

→ ✔ Encapsulation.

### **28. Can global variable be static and final?**

→ ✔ Used for constants.

### **29. Can static variable be overridden?**

→ ❌ It is hidden, not overridden.

### **30. Can instance global variable be overridden?**

→ ❌ Variables cannot be overridden, only methods.

### **31. Example real use-case of global variables?**

→ Student name, roll, marks (unique per object), College name (static global for all students)

### **32. Example case where static useful?**

→ Count number of created objects.

### **33. How global variable supports OOP?**

→ Stores object state.

### **34. Can global variable be modified by any method?**

→ ✔ Yes unless final.

### **35. How global variable behaves in multiple objects?**

→ Each object has a separate copy.

### **36. Can global variable be assigned value inside constructor?**

→ ✔ Yes.

### **37. How garbage collection impacts global variable?**

→ Instance values removed when object destroyed.

### **38. How static global stored across objects?**

→ Single memory.

### **39. When garbage collector called?**

→ When object loses reference.

### **40. how to access global variable in another class?**

→ Using object or public getter

### **41. Local vs Global access?**

→ Global visible everywhere in class; local only within block.

### **42. Can we use same variable name for local & global?**

→ ✔ Yes (shadowing concept).

### **43. How differentiate global & local with same name?**

→ `this.variable`.

### **44. Which has higher priority? local or global?**

→ Local variable.

### **45. Can interface have global variables?**

→ ✔ All interface variables are public static final.

### **46. Can abstract class contain global variable?**

→ ✔ Yes.

### **47. Are static variables thread-safe?**

→ ❌ Not automatically.

### **48. Difference static vs instance variable?**

→ static shared, instance per object.

### **49. What happens if we modify static variable?**

→ All objects reflect change.

### **50. What happens if we modify instance variable?**

→ Only that object gets changed.

---

# 💻 **Program with Global Variable + Output**

```java
class Employee {
    int id;            // global instance variable
    String name;       // global instance variable
    static String company = "Infosys";   // global static variable

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name + " " + company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Suraj");
        Employee e2 = new Employee(102, "Rani");

        e1.show();
        e2.show();
    }
}
```

### **Output**

```
101 Suraj Infosys
102 Rani Infosys
```

---

# 🎯 **Shadowing Example Answer**

```java
class Demo {
    int x = 50;  // global variable

    void test() {
        int x = 10;  // local variable
        System.out.println("Local: " + x);
        System.out.println("Global: " + this.x);
    }
    public static void main(String[] args) {
        new Demo().test();
    }
}
```

### Output

```
Local: 10
Global: 50
```

---

# 📝 **Practice Questions WITH Expected Output**

| Q   | Question                                            | Answer Output                 |
| --- | --------------------------------------------------- | ----------------------------- |
| 1   | Create two objects & show different instance values | values differ for each object |
| 2   | Create static global count variable                 | count increases               |
| 3   | Use this with global variable                       | prints shadowing              |
| 4   | Modify static variable in object                    | shared value                  |
| 5   | Show default value of global variable               | prints 0 or null              |

---
