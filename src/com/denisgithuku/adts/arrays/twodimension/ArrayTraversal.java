package com.denisgithuku.adts.arrays.twodimension;

public class ArrayTraversal {
    static int[][] arr = null; //declaration

    public static void main(String[] args) {
        new ArrayTraversal(2, 3);
        traverseArray();
    }


    public ArrayTraversal(int rows, int cols) {
        arr = new int[rows][cols]; //initialization
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }
    // traversing a 2D array
    public static void traverseArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.println("[" + row + "]" + "[" + col + "]" + " = " + arr[row][col]);
            }
        }
    }
}
