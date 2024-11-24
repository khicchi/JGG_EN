package com.jgg.homework.p1030;

import java.util.Arrays;

public class ArrayExamples5Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array.
    //       This method should calculate the average
    //       of the numbers smaller than 5 <avgSmallerThan5>.
    //       Similarly, calculate the average
    //       of the numbers greater than 5 <avgGreaterThan5>.
    //       Return a two-dimensional double array,
    //       whose [0, 0] element is <avgSmallerThan5>,
    //       and [1, 0] element is <avgGreaterThan5>.
    //       If the array parameter is null, return null

    //       Try your method with those inputs
    // Sample inputs                            // expected output
    int[] testArr1 = null;                      // null
    int[] testArr2 = new int[0];                // [[0.0], [0.0]]
    int[] testArr3 = new int[1];                // [[0.0], [0.0]]
    int[] testArr4 = { 3, 5 };                  // [[3.0], [0.0]]
    int[] testArr5 = { 3, 3, 3 };               // [[3.0], [0.0]]
    int[] testArr6 = { 3, 3, 3, 5 };            // [[3.0], [0.0]]
    int[] testArr7 = { 3, 3, 1, 2, 1, 5, 6 };   // [[2.0], [6.0]]
    int[] testArr8 = { 1, 1, 2, 4, 8, 10 };     // [[2.0], [9.0]]

    System.out.println(Arrays.deepToString(calculateAverages(testArr1))); // null
    System.out.println(Arrays.deepToString(calculateAverages(testArr2))); // [[0.0], [0.0]]
    System.out.println(Arrays.deepToString(calculateAverages(testArr3))); // [[0.0], [0.0]]
    System.out.println(Arrays.deepToString(calculateAverages(testArr4))); // [[3.1], [5.1]]
    System.out.println(Arrays.deepToString(calculateAverages(testArr5))); // [[3.2], [0.0]]
    System.out.println(Arrays.deepToString(calculateAverages(testArr6))); // [[3.2], [5.0]]
    System.out.println(Arrays.deepToString(calculateAverages(testArr7))); // [[3.2], [5.05]]
    System.out.println(Arrays.deepToString(calculateAverages(testArr8))); // [[3.2], [37.86666666666667]]
  }

  public static double[][] calculateAverages(int[] array) {
    if (array == null) {
      return null; // If the array is null, return null
    }

    double sumSmallerThan5 = 0;
    double sumGreaterThan5 = 0;
    int countSmallerThan5 = 0;
    int countGreaterThan5 = 0;

    for (double num : array) {
      if (num < 5) {
        sumSmallerThan5 += num;
        countSmallerThan5++;
      } else if (num > 5) {
        sumGreaterThan5 += num;
        countGreaterThan5++;
      }
    }

    // Calculate the averages
    double avgSmallerThan5 = countSmallerThan5 == 0 ? 0 : sumSmallerThan5 / countSmallerThan5;
    double avgGreaterThan5 = countGreaterThan5 == 0 ? 0 : sumGreaterThan5 / countGreaterThan5;

    // Create a two-dimensional array to store the averages
    double[][] result = new double[2][1];
    // Store the average of numbers smaller than 5 in [0, 0] element
    result[0][0] = avgSmallerThan5;
    // Store the average of numbers greater than 5 in [1, 0] element
    result[1][0] = avgGreaterThan5;

    return result;
  }
}
