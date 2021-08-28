package com.denisgithuku.adts.arrays.twodimension;

import java.util.Arrays;

public class TwoDimensionArrayExample {
    public static void main(String[] args) {
        int[][] TwoDArr;
        TwoDArr = new int[2][2];

        TwoDArr[0][0] = 1;
        TwoDArr[0][1] = 2;
        TwoDArr[1][0] = 3;
        TwoDArr[0][1] = 4;


        System.out.println(Arrays.deepToString(TwoDArr));
    }
}
