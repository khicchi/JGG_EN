package com.jgg.homework.p0890;

public class ArraysAsArgumentSolution {

  public static void main(String[] args){

    // TASK: Create a method which returns the max number
    //       in the accepted int array parameter
    int[] numbers = {10, 20, 30, 40, 50};
    int maxNumber = findMax(numbers);
    System.out.println("Maximum number in the array: " + maxNumber);

  }

  public static int findMax(int[] array) {
    if (array == null || array.length == 0) {
      // Handle edge cases where array is null or empty
      throw new IllegalArgumentException("Array must not be null or empty");
    }

    int max = array[0]; // Assume the first element as maximum
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

}
