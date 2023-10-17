package javaproject;

import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("You entered the following elements:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    } 
}
