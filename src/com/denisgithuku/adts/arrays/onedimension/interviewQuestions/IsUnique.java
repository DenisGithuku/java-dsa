package com.denisgithuku.adts.arrays.onedimension.interviewQuestions;

public class IsUnique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 9, 3};
        System.out.println(findIfArrayIsUnique(arr));
    }

    public static boolean findIfArrayIsUnique(int[] arr) {
        boolean isUnique = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }
}
