package week02.chapter05.section01;

// Array

public class Main {
    public static void main(String[] args) {
//        int[] numbers;
//        numbers = new int[5];
//
//        int[] numbers = new int[5];

        int[] numbers = {1, 2, 3, 4, 5};

        int first = numbers[0];
        System.out.println("First element of Array: " + first);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(); // New line.
        int a = 0, sum = 0;
        while (a < numbers.length) {
            sum += numbers[a];
            a++;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
