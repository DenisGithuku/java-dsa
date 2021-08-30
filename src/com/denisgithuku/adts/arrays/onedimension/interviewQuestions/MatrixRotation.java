package com.denisgithuku.adts.arrays.onedimension.interviewQuestions;

import com.sun.tools.javac.Main;

import java.util.*;

public class MatrixRotation {
    public static void main(String[] args) {
        MatrixRotation matrixRotation = new MatrixRotation();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrixRotation.rotateMatrix(matrix));
        System.out.println(Arrays.deepToString(matrix));
    }

    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n -1 - layer;
            for (int i = 0; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }
}
