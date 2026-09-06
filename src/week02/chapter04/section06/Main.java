package week02.chapter04.section06;

class Vehicle {
    // Instance Variables.
    String brand;
    int wheels;

    // Constructor
    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    // Instance method.
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + wheels);
    }
}


class Car extends Vehicle {
    // Additional instance variables.
    int doors;

    public Car(String brand, int wheels, int doors) {
        super(brand, wheels); // Call to SuperClass/ParentClass constructor

        this.doors = doors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to SuperClass/ParentClass method.
        System.out.println("Number of Doors: " + doors);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class.
        Car myCar = new Car("Toyota", 4, 4);

        // Calling the displayDetails method.
        myCar.displayDetails();
    }
}
