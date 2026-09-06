package week01.chapter04.car;

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class.
        Car myCar = new Car("Red", "Toyota", 2026);
        myCar.displayDetails();

        for(int i = 0; i < 20; i++) 
            System.out.println('-');
        System.out.println();

        Car myCar2 = new Car("Yellow", "Honda", 2025);
        myCar2.displayDetails();

        for(int i = 0; i < 20; i++) 
            System.out.println('-');
        System.out.println();

        Car myCarX = new Car();
        myCarX.displayDetails();
    }
}
