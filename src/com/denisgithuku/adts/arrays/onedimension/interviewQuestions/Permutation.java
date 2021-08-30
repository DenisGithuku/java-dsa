package com.denisgithuku.adts.arrays.onedimension.interviewQuestions;

public class Permutation {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5, 4, 6};
        int[] arr2 = {1, 3, 2, 4, 6, 5};
        boolean isPermutation = permutation(arr1, arr2);
        System.out.println(isPermutation);

    }

    public static boolean permutation(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 = 0;
        int mul1 = 1, mul2 = 1;

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                mul1 *= arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
            mul2 *= arr2[i];
        }

        return (sum1 == sum2) && (mul1 == mul2);
    }
}
