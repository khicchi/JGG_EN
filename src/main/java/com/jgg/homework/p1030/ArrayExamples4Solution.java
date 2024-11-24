package com.jgg.homework.p1030;

public class ArrayExamples4Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array.
    //       Method should find the first two adjacent
    //       same values and return as int.
    //       Return -1 if the array is null,
    //       or array size is smaller than 2,
    //       or no adjacent same values found.

    //       Try your method with those inputs
    // Sample Inputs                        Expected Output
    int[] testArr1 = null;                      // -1
    int[] testArr2 = new int[0];                // -1
    int[] testArr3 = new int[1];                // -1
    int[] testArr4 = new int[2];                // 0
    int[] testArr5 = { 2, 1, 3, 2, 2, 3 };      // 2
    int[] testArr6 = { 1, 1, 3, 2, 2, 3 };      // 1
    int[] testArr7 = { 3, 1, 3, 2, 3, 3 };      // 3
    int[] testArr8 = { 3, 1, 3, 2, 4, 3 };      // -1

    System.out.println(findFirstAdjacentSameValue(testArr1)); // -1
    System.out.println(findFirstAdjacentSameValue(testArr2)); // -1
    System.out.println(findFirstAdjacentSameValue(testArr3)); // -1
    System.out.println(findFirstAdjacentSameValue(testArr4)); // 0
    System.out.println(findFirstAdjacentSameValue(testArr5)); // 2
    System.out.println(findFirstAdjacentSameValue(testArr6)); // 1
    System.out.println(findFirstAdjacentSameValue(testArr7)); // 3
    System.out.println(findFirstAdjacentSameValue(testArr8)); // -1
  }

  public static int findFirstAdjacentSameValue(int[] array) {
    if (array == null || array.length < 2) {
      // Return -1 if the array is null or has less than two elements
      return -1;
    }

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1]) {
        // Return the value of the first adjacent same value found
        return array[i];
      }
    }

    // Return -1 if no adjacent same values are found
    return -1;
  }

}
