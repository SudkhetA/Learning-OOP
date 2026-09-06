package week02.chapter04.section03;

class Car {
    // Attribute.
    String color;
    String model;
    int year;


    // Constructor.
    // - Default Constructor.
    public Car() {
        color = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // - Parameterized Constructor.
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method.
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }


}

public class Main {
    public static void main(String[] args) {
        // Creating an object using the Parameterized constructor.
        Car car01 = new Car("Red", "Toyota", 2020);
        car01.displayDetails();

        // Creating an object using default constructor.
        Car car02 = new Car();
        car02.displayDetails();
    }
}