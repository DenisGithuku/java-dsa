package com.denisgithuku.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(findSumOfDigits(4578));
    }
    
    public static int findSumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return ((n % 10) + findSumOfDigits(n / 10));
    }
}
