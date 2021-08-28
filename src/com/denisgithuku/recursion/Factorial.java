package com.denisgithuku.recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if(n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("The factorial of: " + n + " is " + factorial(n));
    }
}
