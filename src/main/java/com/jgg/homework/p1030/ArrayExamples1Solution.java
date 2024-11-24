package com.jgg.homework.p1030;

import java.util.Arrays;

public class ArrayExamples1Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array
    //       and returns a new int array
    //       whose first element is the sum of odd numbers,
    //       and second element is the sum of even numbers.
    //       If the array parameter is null, return null.

    //       Try your method with those inputs
    // Sample inputs                            expected output
    int[] testArr1 = null;                        // null
    int[] testArr2 = new int[0];                  // [0, 0]
    int[] testArr3 = { 1 };                       // [1, 0]
    int[] testArr4 = { 1, 2 };                    // [1, 2]
    int[] testArr5 = { 1, 2, 3 };                 // [4, 2]
    int[] testArr6 = { 1, 2, 3, -3, -1, -2, 0 };  // [0, 0]

    System.out.println(Arrays.toString(sumOddEven(testArr1))); // null
    System.out.println(Arrays.toString(sumOddEven(testArr2))); // [0, 0]
    System.out.println(Arrays.toString(sumOddEven(testArr3))); // [1, 0]
    System.out.println(Arrays.toString(sumOddEven(testArr4))); // [1, 2]
    System.out.println(Arrays.toString(sumOddEven(testArr5))); // [4, 2]
    System.out.println(Arrays.toString(sumOddEven(testArr6))); // [0, 0]

  }

  public static int[] sumOddEven(int[] array) {
    if (array == null) {
      return null; // If the array is null, return null
    }

    int sumOdd = 0;
    int sumEven = 0;

    for (int num : array) {
      if (num % 2 != 0) {
        sumOdd += num; // Add odd numbers to sumOdd
      } else {
        sumEven += num; // Add even numbers to sumEven
      }
    }

    // Return the array with sumOdd as the first element
    // and sumEven as the second element
    return new int[]{sumOdd, sumEven};
  }

}
