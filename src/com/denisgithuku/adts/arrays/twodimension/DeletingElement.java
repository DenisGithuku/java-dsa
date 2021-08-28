package com.denisgithuku.adts.arrays.twodimension;

import java.util.*;

public class DeletingElement {
    static int[][] arr = {
            {23, 34, 35, 4},
            {6, 78, 45, 56, 90},
            {23, 14, 56, 23}
    };

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(arr));
        deleteElement(0, 1);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void deleteElement(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println(arr[row][col] + "deleted successfully!");
        } catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("Invalid array index");
        }
    }
}
