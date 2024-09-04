// Parent class
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

// Main class to test polymorphism
public class Main {
    public static void main(String[] args) {
        // Polymorphism in action
        Animal myAnimal = new Animal(); // Animal reference, Animal object
        Animal myDog = new Dog();       // Animal reference, Dog object
        Animal myCat = new Cat();       // Animal reference, Cat object

        myAnimal.sound(); // Outputs: The animal makes a sound
        myDog.sound();    // Outputs: The dog barks
        myCat.sound();    // Outputs: The cat meows
    }
}
