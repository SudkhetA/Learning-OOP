package week02.chapter04.section11;

// Interface

interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method.");
    }
}

public class Main02 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }
}
