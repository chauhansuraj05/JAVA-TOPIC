---

# ✅ **10 Practice Examples of Non-Static Methods**

### **1️⃣ Add two numbers**

```java
class MathOps {
    int add(int a, int b) {
        return a + b;
    }
}
```

### **2️⃣ Check if a number is even**

```java
class CheckNumber {
    boolean isEven(int n) {
        return n % 2 == 0;
    }
}
```

### **3️⃣ Print your name**

```java
class Person {
    void printName(String name) {
        System.out.println("Name: " + name);
    }
}
```

### **4️⃣ Calculate square**

```java
class Square {
    int findSquare(int x) {
        return x * x;
    }
}
```

### **5️⃣ Convert Celsius to Fahrenheit**

```java
class Temp {
    double toFahrenheit(double c) {
        return (c * 9/5) + 32;
    }
}
```

### **6️⃣ Find maximum of two numbers**

```java
class Compare {
    int max(int a, int b) {
        return a > b ? a : b;
    }
}
```

### **7️⃣ Greet user**

```java
class Greeting {
    void sayHello() {
        System.out.println("Hello Suraj!");
    }
}
```

### **8️⃣ Get area of circle**

```java
class Circle {
    double area(double r) {
        return 3.14 * r * r;
    }
}
```

### **9️⃣ Reverse a string**

```java
class Word {
    String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
```

### **🔟 Count vowels in a string**

```java
class Vowels {
    int countVowels(String str) {
        int count = 0;
        for(char c : str.toLowerCase().toCharArray()) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
}
```

---

# ⭐ **Static vs Non-Static Difference Chart**

| Feature                | Static              | Non-Static               |
| ---------------------- | ------------------- | ------------------------ |
| Belongs To             | Class               | Object                   |
| How to call?           | ClassName.method()  | object.method()          |
| Memory                 | Created once        | Created per object       |
| Can access non-static? | ❌ No               | ✔ Yes                    |
| Can access static?     | ✔ Yes               | ✔ Yes                    |
| Example                | `Math.max()`        | `s.display()`            |
| Requires object?       | ❌ No               | ✔ Yes                    |
| When to use?           | Utility/common code | Object-specific behavior |

---

# ⭐ **Real-Life Examples of Non-Static Methods**

### **1️⃣ ATM Machine**

- Insert card → machine creates a **customer object**
- Methods depend on object:

  - `checkBalance()`
  - `withdrawMoney()`
  - `changePin()`

These actions depend on **your account**, so they are non-static.

---

### **2️⃣ WhatsApp Chat**

For each user:

- `sendMessage()`
- `deleteMessage()`
- `showLastSeen()`

These work per **user object**, so non-static.

---

### **3️⃣ Car Object**

Each car has:

- `startEngine()`
- `applyBrake()`
- `increaseSpeed()`

Every car works differently → non-static methods.

---

### **4️⃣ Student Object**

Each student object can:

- `displayMarks()`
- `calculatePercentage()`

Values change per object → non-static.

---

### **5️⃣ Mobile App**

In Instagram:

- `uploadPhoto()`
- `likePost()`
- `commentPost()`

These are actions your **profile object** does → non-static.

---
