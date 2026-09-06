package week01.chapter02;

import java.util.Scanner;

public class ControlFlow03 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            System.out.println("Iteration: " + i);

            i = i + 1;
        }

        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            System.out.println("Enter number between 1 and 10: ");
            number = scanner.nextInt();
            if ((number >= 1) && (number <= 10)) {
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        System.out.println("you entered: " + number);
        scanner.close();
    }
}
