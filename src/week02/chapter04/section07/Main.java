package week02.chapter04.section07;

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

class ElectricCar extends Car {
    // Additional instance variable.
    int batteryCapacity;

    // Constructor.
    public ElectricCar(String brand, int wheels, int doors, int batteryCapacity) {
        super(brand, wheels, doors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class.
        ElectricCar myEv = new ElectricCar("Tesla", 4, 4, 100);

        // Calling the displayDetails method.
        myEv.displayDetails();
    }
}
