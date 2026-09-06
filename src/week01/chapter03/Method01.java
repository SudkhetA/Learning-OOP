package week01.chapter03;

public class Method01 {
    public static void sayHelloWorld() {
        System.out.println("Hello World.");
    }

    public static int add(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void printDetails(String name, int age, double height) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        sayHelloWorld();

        int result = add(2, 4);
        System.out.println("The sum is " + result);
        System.out.println("The sum is " + add(2, 4));

        String message = greet("Alice");
        System.out.println(message);

        printDetails("Somsak", 20, 5.8);
    }
}
