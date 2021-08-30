package com.denisgithuku.adts.arrays.onedimension.interviewQuestions;

public class ValueSearch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 56, 67};
        System.out.println(searchValue(arr, 1));
    }

    public static boolean searchValue(int[] arr, int key) {
        for (int j : arr) {
            if (j == key) {
                return true;
            }
        }
        return false;
    }
}
