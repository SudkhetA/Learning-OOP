package week02.chapter04.section11;

// Interface

interface Drawable {
    // Abstract method (no implementation)
    void draw();
}

class Circle implements Drawable {
    // Implementing the abstract method.
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Drawable {
    // Implementing the abstract method.
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
