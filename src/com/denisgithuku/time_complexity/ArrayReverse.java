package com.denisgithuku.time_complexity;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args){
        int[] customArray = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseArray(customArray);
    }

    static void reverseArray(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
