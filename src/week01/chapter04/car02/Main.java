package week01.chapter04.car02;

class Car {
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

class What {
    int x;
    int y;

    public void xxx() {
        System.out.println("xxx");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car01 = new Car();
        car01.displayDetails();

        for (int i = 0; i < 20; i++) 
            System.out.println('-');
        System.out.println();

        What what = new What();
        what.xxx();
    }
}
