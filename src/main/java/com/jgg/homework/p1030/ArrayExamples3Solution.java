package com.jgg.homework.p1030;

import java.util.Arrays;

public class ArrayExamples3Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts a long array
    //       and returns the difference between the biggest and the smallest elements.
    //       If the accepted array is null, then -1 should be returned.
    //       If the accepted array's length is 0, then -1 should be returned.
    //       If the accepted array has only one element, return that element.
    //       ATTENTION: original array should not be altered
    
    //       Try your method with those inputs
    // sample input                 // expected output
    long[] testArr1 = null;         // -1
    long[] testArr2 = { 3 };        // 3
    long[] testArr3 = { 3, 3 };     // 0
    long[] testArr4 = { 3, 5 };     // 2
    long[] testArr5 = { 3, 2, 6 };  // 4
    long[] testArr6 = new long[0];  // -1


    System.out.println(calculateDifference(testArr1)); // -1
    System.out.println(calculateDifference(testArr2)); // 3
    System.out.println(calculateDifference(testArr3)); // 0
    System.out.println(calculateDifference(testArr4)); // 2
    System.out.println(calculateDifference(testArr5)); // 4
    System.out.println(calculateDifference(testArr6)); // -1

  }

  public static long calculateDifference(long[] array) {
    if (array == null || array.length == 0) {
      // If the array is null or empty, return -1
      return -1;
    } else if (array.length == 1) {
      // If the array has only one element, return that element
      return array[0];
    } else {
      // Create a copy of the array to avoid altering the original array
      long[] sortedArray = Arrays.copyOf(array, array.length);
      Arrays.sort(sortedArray); // Sort the copied array

      // Calculate the difference between the largest and smallest elements
      long min = sortedArray[0];
      long max = sortedArray[sortedArray.length - 1];
      return max - min;
    }
  }

}
