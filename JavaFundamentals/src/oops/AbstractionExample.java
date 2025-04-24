package oops;

// Abstract class hidden the complexity
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Regular method
    void breathe() {
        System.out.println("Breathing...");
    }
}

// Concrete subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.breathe();
    }
}
