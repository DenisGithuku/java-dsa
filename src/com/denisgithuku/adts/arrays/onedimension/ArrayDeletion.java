package com.denisgithuku.adts.arrays.onedimension;

import java.util.*;

public class ArrayDeletion {
    static int[] arr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        deleteValue(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void deleteValue(int[] arr, int valueToDeleteIndex){
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Deleted successfully!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

    }

}
