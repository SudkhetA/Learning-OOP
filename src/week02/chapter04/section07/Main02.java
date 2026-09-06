package week02.chapter04.section07;

class Animal {
    // Method to be overridden.
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    // Overriding the sound method.
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    // Overriding the sound method.
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class Main02 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object.
        Animal myCat = new Cat();       // Animal reference but Cat object.

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
