package com.jgg.homework.p1020;

import java.util.Arrays;

public class ArraysCopyOf1Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array and returns a new array.
    //       The returned array should only contain the first element
    //       of the provided int array parameter.
    //       If the provided array parameter is null method should return null
    //       MUST: copyOf method of the Arrays class must be used
    //       Print the original array ant the returned array

    // Example array
    int[] originalArray = {10, 20, 30, 40};

    // Get the new array containing only the first element
    int[] newArray = getFirstElementArray(originalArray);

    // Print the original array
    System.out.println("Original Array: " + Arrays.toString(originalArray));

    // Print the new array
    System.out.println("New Array: " + Arrays.toString(newArray));
  }

  // Method to return a new array containing only the first element of the provided array
  public static int[] getFirstElementArray(int[] array) {
    if (array == null) {
      return null; // Return null if the provided array is null
    }

    // Create a new array with size 1 and copy the first element
    return Arrays.copyOf(array, 1);
  }

}
