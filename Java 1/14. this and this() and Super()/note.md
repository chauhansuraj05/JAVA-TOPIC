---

# ⭐ Example Using Both `this()` and `super()`

class A {

    A() {
        this(100);    // Calls parameterized constructor of SAME class
        System.out.println("A: Default Constructor");
    }

    A(int x) {
        System.out.println("A: Parameterized Constructor = " + x);
    }
}

class B extends A {

    B() {
        super();       // Calls default constructor of parent class A
        System.out.println("B: Default Constructor");
    }

    B(int y) {
        this();        // Calls default constructor of SAME class B
        System.out.println("B: Parameterized Constructor = " + y);
    }
}

class Test {
    public static void main(String[] args) {
        B obj = new B(200);
    }
}
```

---

## 🎯 **Expected Output**

```
A: Parameterized Constructor = 100
A: Default Constructor
B: Default Constructor
B: Parameterized Constructor = 200
```

---

# 🔥 Flow / Execution Order (Step by Step)

| Step | What Happens?                                                          | Why                               |
| ---- | ---------------------------------------------------------------------- | --------------------------------- |
| 1    | `B obj = new B(200);`                                                  | Creating B object with parameter  |
| 2    | Calls `B(int y)`                                                       | Parameterized constructor called  |
| 3    | Inside `B(int y)` → `this()` runs                                      | Calls B default constructor       |
| 4    | In `B()` → `super()` runs                                              | Calls A default constructor       |
| 5    | A default constructor → `this(100)` runs                               | Calls A parameterized constructor |
| 6    | Print `"A: Parameterized Constructor = 100"`                           | Output step                       |
| 7    | After return → print `"A: Default Constructor"`                        | Next step                         |
| 8    | Back to B default → print `"B: Default Constructor"`                   | Output                            |
| 9    | Back to B parameterized → print `"B: Parameterized Constructor = 200"` | Completed                         |

---

## 💡 Learning Trick to Remember

| Trick                      | Meaning                                                          |
| -------------------------- | ---------------------------------------------------------------- |
| **Parent born first**      | `super()` runs before child constructor                          |
| **Same class friends**     | `this()` calls constructor from same class                       |
| **Must be first word**     | No statements allowed before them                                |
| **No combination allowed** | You cannot use `this()` & `super()` together in same constructor |

---

## 🚀 When to Use Both Together

| Requirement                                  | Use                                |
| -------------------------------------------- | ---------------------------------- |
| Avoid duplication inside same class          | `this()`                           |
| Ensure parent data initialized first         | `super()`                          |
| Combining inheritance & constructor chaining | Use both in different constructors |

---

# 🏁 Final Summary

- `this()` → Calls constructor of **same class**
- `super()` → Calls constructor of **parent class**
- Both **must be first line**
- Both help **constructor chaining**
- Cannot use both in same constructor line

---
