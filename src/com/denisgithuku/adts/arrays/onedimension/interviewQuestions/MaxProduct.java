package com.denisgithuku.adts.arrays.onedimension.interviewQuestions;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, -18, -30, 119};
        System.out.println(findMaxProduct(arr));
    }

   public static String findMaxProduct(int[] arr) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] * arr[j] > maxProduct) {
                    maxProduct = arr[i] * arr[j];
                    pairs = "[" + Integer.toString(arr[i]) + "," + Integer.toString(arr[j]) + "]";
                }
            }
        }
        return pairs;
   }
}
