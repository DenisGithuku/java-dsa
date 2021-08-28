package com.denisgithuku.adts.arrays.onedimension;

import java.util.Arrays;

public class ArrayInsertion {
    static int[] arr = null; //array declaration

    public static void main(String[] args) {

        ArrayInsertion a = new ArrayInsertion(10);

        insert(0, 10);
        insert(4, 23);
        insert(2, 45);
        insert(12, 45);
        insert(4, 35);

        System.out.println("Array is: " + Arrays.toString(arr));
    }

    public ArrayInsertion(int arraySize) {
        arr = new int[arraySize]; //instantiating
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public static void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted; //initialization of the array
                System.out.println("Inserted successfully");
            } else {
                System.out.println("This cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access the array!");
        }

    }
}
