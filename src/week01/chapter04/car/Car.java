package week01.chapter04.car;

public class Car {
    // Attribute (Field)
    String color;
    String model;
    int year;

    // Constructor
    public Car() {
        color = "White";
        model = "Nissan";
        year = 2020;
    }
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}
