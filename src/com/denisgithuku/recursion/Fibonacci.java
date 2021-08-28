package com.denisgithuku.recursion;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter value to find fibonacci: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n < 0) {
            return n;
        }
        if (n == 0 || n == 1) {
            return n;
        }
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
