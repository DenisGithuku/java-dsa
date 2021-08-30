package com.denisgithuku.adts.arrays.onedimension.interviewQuestions;

import java.util.Arrays;

public class PairTwoSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++ ) {
                if (nums[i] + nums[j] == target)
                return new int[] {i, j };
            }
        }
        throw new IllegalArgumentException("No solution found!");
    }
}
