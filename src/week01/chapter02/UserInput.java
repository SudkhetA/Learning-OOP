package week01.chapter02;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello, " + name + "!");
        System.out.println("You are, " + age + " year old.");
        System.out.println("You height is, " + height + " meters.");

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}
