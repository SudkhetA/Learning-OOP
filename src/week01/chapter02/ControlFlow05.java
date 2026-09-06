package week01.chapter02;

public class ControlFlow05 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
