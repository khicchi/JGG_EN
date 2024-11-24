package com.jgg.homework.p1010;

import java.util.Arrays;

public class ArraysBinarySearchSolution {

  public static void main(String[] args){

    float[] array1 = {3.5f, 1.2f, 4.7f, 2.9f};
    float[] array2 = null;

    // TASK: Create a method which accepts a float array parameter and a float parameter.
    //       This method should return a boolean value by checking if the provided
    //       float value exists in the provided float array.
    //       Method should use binarySearch() method of the Arrays class.
    //       ATTENTION: the original array argument should not be altered.
    //       Order od the elements should remain the same after method call.
    //       If the provided array parameter is null, method should return false
    //       try the method with existing and non-existing float values
    //       as well as a null float array to see if it is working as expected

    System.out.println("Does array1 contain 2.9? " + contains(array1, 2.9f)); // true
    System.out.println("Does array1 contain 5.0? " + contains(array1, 5.0f)); // false
    System.out.println("Does array2 contain 1.0? " + contains(array2, 1.0f)); // false

  }

  // Method to check if a float value exists in the provided float array
  public static boolean contains(float[] array, float value) {
    if (array == null) {
      return false; // Return false if the array is null
    }

    // Create a copy of the array and sort it
    Arrays.sort(array);

    // Perform binary search on the sorted array
    int index = Arrays.binarySearch(array, value);

    // If index is non-negative, the value is found; otherwise, it is not found
    return index >= 0;
  }

}
