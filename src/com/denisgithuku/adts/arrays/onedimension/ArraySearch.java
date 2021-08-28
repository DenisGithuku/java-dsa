package com.denisgithuku.adts.arrays.onedimension;

import java.util.Arrays;

public class ArraySearch {
    static int[] arr = null;

    public static void main(String[] args) {
        new ArraySearch(12);
        setInsertIntoArray(0, 67);
        setInsertIntoArray(1, 45);
        setInsertIntoArray(2, 34);
        setInsertIntoArray(5, 64);
        System.out.println(Arrays.toString(arr));
       searchArray(64);
    }

    public ArraySearch(int arrSize){
        arr = new int[arrSize];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public static void setInsertIntoArray(int location, int value) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Inserted successfully!");
            } else {
                System.out.println("This cell is already occupied!!");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
    }
    public static void searchArray(int key){
        for (int j = 0; j < arr.length; j++){
            if(arr[j] == key){
                System.out.println(key + " found at the index of " + j);
                return;
            }
        }
        System.out.println(key + " not in array");
    }
}
