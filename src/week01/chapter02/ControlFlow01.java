package week01.chapter02;

public class ControlFlow01 {
    public static void main(String[] args) {
        int number = -10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        int num = -5;
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        int n = 0;
        if (n > 0) {
            System.out.println("The number is positive.");
        } else if (n < 0) { 
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        int num2 = -5;
        String result = (num2 > 0) ? "Positive" : "Negative";
        System.out.println(result);
    }
}
