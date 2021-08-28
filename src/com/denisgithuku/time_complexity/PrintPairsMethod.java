package com.denisgithuku.time_complexity;

public class PrintPairsMethod {
    public static void main(String[] args) {
        int[] customArray = {1, 2, 3, 4, 5};
        printPairs(customArray);
    }

    static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i] + "" + arr[j] + ", ");
            }
            System.out.println();
        }
    }
}
