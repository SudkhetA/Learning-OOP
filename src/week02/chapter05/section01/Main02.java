package week02.chapter05.section01;

import java.util.Scanner;

// Array

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] userArray = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            System.out.print("  Element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }
        System.out.println("You entered the following elements: ");
        for(int i = 0; i < n; i ++) {
            System.out.println("Element at index " + i + ": " + userArray[i]);
        }
        scanner.close();
    }
}
