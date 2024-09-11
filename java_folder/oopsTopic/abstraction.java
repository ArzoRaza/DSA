package oopsTopic;

// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    public abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}

// Subclass (Inherits from Animal)
class Dog extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The dog barks");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog();
        dog.sound(); // Calls the implemented method in Dog
        dog.sleep(); // Calls the method from the Animal class
    }
}
