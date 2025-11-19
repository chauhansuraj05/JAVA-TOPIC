class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Maina {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Animal version

        Animal b = new Dog();
        b.sound(); // Dog version (overridden)
    }
}
