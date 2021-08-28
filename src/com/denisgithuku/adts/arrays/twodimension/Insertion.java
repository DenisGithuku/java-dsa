package com.denisgithuku.adts.arrays.twodimension;

import java.util.*;

public class Insertion {
    // array declaration
    static int[][] arr = null;

    public static void main(String[] args) {
        new Insertion(3, 4);
        System.out.println("Array is: " + Arrays.deepToString(arr));
        insertValue(0, 1, 14);
        insertValue(1, 1, 38);
        insertValue(1, 3, 12);
        insertValue(2, 1, 23);
        insertValue(0, 3, 67);
        System.out.println("Array is: " + Arrays.deepToString(arr));

        accessCellValue(0, 1);
    }

    // constructor to initialize array
    public Insertion(int rows, int cols) {
        arr = new int[rows][cols];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // inserting into a 2D array
    public static void insertValue(int row, int col, int valueToInsert) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToInsert;
                System.out.println("Insertion successful!");
            } else {
                System.out.println("Cell already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    //accessing array values
    public static void accessCellValue(int row, int col) {
        System.out.println("Accessing row #" + row + " col #" + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }


}
