package week02.chapter04.section10;

// Abstract class

abstract class Shape {
    // Abstract method.
    abstract void draw();

    // Concrete method.
    void display() {
        System.out.println("Displaying shape.");
    }
}

class Circle extends Shape {
    // Implementing the abstract method.
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    // Implementing the abstract method.
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.display();
        circle.draw();
        rectangle.display();
        rectangle.draw();
    }
}
