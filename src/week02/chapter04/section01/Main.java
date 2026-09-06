package week02.chapter04.section01;



public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class.
        Car myCar = new Car("Red", "Toyota", 2020);

        // Assessing object's attributes.
        System.out.println("My Car's Model: " + myCar.model);

        // Calling object's method.
        myCar.displayDetails();
    }
}
