package com.denisgithuku.adts.arrays.twodimension;

public class ArraySearch {
    static int [][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12,}
    };

    public static void main(String[] args) {
        searchArray(10);
    }

    public static void searchArray(int key) {
        System.out.println("Searching for " + key);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == key) {
                    System.out.println(key + " found at index: " + "[" + row + "]" + "[" + col + "]");
                    return;
                }
            }
        }
        System.out.println(key + " not found in array");
    }
}
