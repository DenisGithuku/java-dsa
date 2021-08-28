package com.denisgithuku.time_complexity;

public class ArraySumProduct {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        sumProductArray(array);
    }

    static void sumProductArray(int [] arr) {
        int sum = 0;
        int product = 1;  //cannot be set to 0 due to multiplication
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            product *= arr[j];
        }
        System.out.println("Sum: " + sum + ", Product: " + product);
    }
}
