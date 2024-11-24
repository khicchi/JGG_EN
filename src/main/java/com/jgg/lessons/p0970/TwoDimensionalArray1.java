package com.jgg.lessons.p0970;

import java.util.Arrays;

public class TwoDimensionalArray1 {

  public static void main(String[] args){

    // Declaration and initialization of a 2D array with 3 rows and 4 columns
    int[][] grid = new int[3][4];

    // Declaration and initialization of a 2D array with predefined values
    int[][] matrix = {
        {1, 2, 3, 4},
        {4, 5, 6, 7},
        {7, 8, 9, 1}
    };

    // Print each array in matrix
    for (int[] innerArray: matrix) {
      System.out.println(Arrays.toString(innerArray));
    }

    // Print each element in matrix
    for (int[] innerArray: matrix) {
      for (int element: innerArray) {
        System.out.println(element);
      }
    }

    // Print each element in matrix with for-loop
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

  }

}
