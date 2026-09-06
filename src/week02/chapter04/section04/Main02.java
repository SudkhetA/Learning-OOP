package week02.chapter04.section04;

class MathUtils {
    // Static method for addition.
    public static int add(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    // Static method for substraction.
    public static int subtract(int a, int b) {
        return a - b;
    }
}

public class Main02 {
    public static void main(String[] args) {
        // Calling static methods from the MathUtils class.
        int sum = MathUtils.add(5, 3);
        int difference = MathUtils.subtract(5, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
