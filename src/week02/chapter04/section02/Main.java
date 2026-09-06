package week02.chapter04.section02;

class Car {
    // Instance Attribute/Variables.
    String color;
    String model;
    int year;
    // Static attribute.
    static int numberOfCars;


    // Constructor.
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;

        numberOfCars++;
    }

    // Method.
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    // Static Method.
    public static void displayNumberOfCars() {
        System.out.println("Total number of cars: " + numberOfCars);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class.
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2021);

        car1.displayDetails(); // Display details of car1.
        car2.displayDetails(); // Display details of car2.

        Car.displayNumberOfCars(); // Displaying the total number of cars.
    }
}