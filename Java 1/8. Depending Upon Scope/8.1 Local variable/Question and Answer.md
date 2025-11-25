# 📌 **Local Variable – Quick Definition**

- A **local variable** is a variable **declared inside a method / constructor / block**.
- It is created when method is called and destroyed after method execution.
- **Cannot be static, cannot have default value, must be initialized before use**.

---

# 🎯 **Example Program Demonstrating Local Variable**

```java
class Demo {

    void show() {
        int x = 10; // local variable
        System.out.println("Local Variable value: " + x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
```

### **Output**

```
Local Variable value: 10
```

---

# 🚫 **Local Variable Must Be Initialized Example**

```java
class Test {
    public static void main(String[] args) {
        int a;     // local variable
        // System.out.println(a);  // ❌ Error: variable a might not have been initialized
    }
}
```

---

# ⭐ **Local Variable vs Instance Variable Example**

```java
class Student {
    int roll; // instance
    String name; // instance

    void input() {
        int marks = 80; // local variable
        System.out.println("Marks: " + marks);
    }
}
```

---

# 💻 **Local Variable in Loop Example**

```java
class LoopExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) { // 'i' local to loop
            System.out.println(i);
        }
        // System.out.println(i); // ❌ Error: i not accessible outside loop
    }
}
```

---

# 📌 **Local Variable Inside Block Example**

```java
class BlockExample {
    public static void main(String[] args) {

        if(true) {
            int x = 20; // local to if block
            System.out.println(x);
        }
        // System.out.println(x);  // ❌ Error
    }
}
```

---

# 🧠 **Local Variable Practice Programs (Interview & Lab)**

### **Practice Questions**

1. Write a program to demonstrate local variable inside method.
2. Write a program to show local variable scope inside loop.
3. Write a program to use local variable for calculating area of circle.
4. Write a program with multiple local variables performing addition.
5. Write a program showing error when local variable not initialized.
6. Write a program to read two numbers using Scanner and sum them using local variables.
7. Write a program using local variable inside constructor.
8. Write a program to demonstrate shadowing between local & instance variable using `this`.
9. Program to find factorial using local variable.
10. Program using block & local variable scope.

---

# 🧪 **Example Program for Local Variable + Scanner**

```java
import java.util.*;

class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();  // local
        int b = sc.nextInt();  // local

        int sum = a + b;       // local

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
```

---

# 💥 **Local Variable Shadowing Example (Important Interview)**

```java
class Shadowing {

    int x = 50; // instance variable

    void show() {
        int x = 10;  // local with same name
        System.out.println("Local x = " + x);
        System.out.println("Instance x = " + this.x);
    }

    public static void main(String[] args) {
        new Shadowing().show();
    }
}
```

### **Output**

```
Local x = 10
Instance x = 50
```

---
