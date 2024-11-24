package com.jgg.homework.p1030;

public class ArrayExamples6Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array
    //       and returns the sum of the elements as int.
    //       Rules;
    //       If the element is 7, then it does not count.
    //       If there is an element just after 7, it does not count either.
    //       If the array is null, then return -1.
    //       If the array has 0 size, then return -1.
    
    // Try your solution with those inputs
    // Sample inputs                            expected output
    int[] testArr1 = null;                          // -1
    int[] testArr2 = new int[0];                    // -1
    int[] testArr3 = { 3 };                         // 3
    int[] testArr4 = { 3, -3 };                     // 0
    int[] testArr5 = { 3, -3, 7 };                  // 0
    int[] testArr6 = { 3, -3, 7 , 8 };              // 0
    int[] testArr7 = { 3, -3, 7 , 8, 9 };           // 9
    int[] testArr8 = { 3, -3, 7 , 8, 9, 7 };        // 9
    int[] testArr9 = { 3, -3, 7 , 8, 9, 7, 1 };     // 9
    int[] testArr10 = { 3, -3, 7 , 8, 9, 7, 1, 1 }; // 10
    int[] testArr11 = { 7 };                        // 0

    System.out.println(calculateSum(testArr1)); // -1
    System.out.println(calculateSum(testArr2)); // -1
    System.out.println(calculateSum(testArr3)); // 3
    System.out.println(calculateSum(testArr4)); // 0
    System.out.println(calculateSum(testArr5)); // 0
    System.out.println(calculateSum(testArr6)); // 0
    System.out.println(calculateSum(testArr7)); // 9
    System.out.println(calculateSum(testArr8)); // 9
    System.out.println(calculateSum(testArr9)); // 9
    System.out.println(calculateSum(testArr10)); // 10
    System.out.println(calculateSum(testArr11)); // 0
  }

  public static int calculateSum(int[] array) {
    if (array == null || array.length == 0) {
      // If the array is null or empty, return -1
      return -1;
    }

    int sum = 0;
    boolean skipNext = false;

    for (int i = 0; i < array.length; i++) {
      if (array[i] != 7 && !skipNext) {
        sum += array[i];
      }

      // Check if the current or the next element is 7
      if (array[i] == 7 || (i < array.length - 1 && array[i + 1] == 7)) {
        // If the next element is 7, set the skipNext flag to true
        skipNext = true;
      }
      else {
        skipNext = false;
      }
    }
    return sum;
  }

}
