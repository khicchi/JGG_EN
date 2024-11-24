package com.jgg.homework.p1020;

import java.util.Arrays;

public class ArraysCopyOf2Solution {

  public static void main(String[] args){

    String[] colors = { "Red", "Blue" };

    // TASK: Create a method which accepts a String array parameter.
    //       This method should return a new String array with doubling
    //       the size of the provided String array parameter.
    //       Returned array should contain the provided array parameter's element in the same order,
    //       but the rest of the elements should be null.
    //       If the provided array parameter is null method should return null
    //       MUST: copyOf method of the Arrays class must be used
    //       Print the original array ant the returned array

    // Get the new array with doubled size
    String[] newArray = doubleArraySize(colors);

    // Print the original array
    System.out.println("Original Array: " + Arrays.toString(colors)); // [Red, Blue]

    // Print the new array with doubled size
    System.out.println("New Array: " + Arrays.toString(newArray)); // [Red, Blue, null, null]
  }

  // Method to return a new array with double the size of the provided array
  public static String[] doubleArraySize(String[] array) {
    if (array == null) {
      return null; // Return null if the provided array is null
    }

    // Create a new array with double the size of the original array
    return Arrays.copyOf(array, array.length * 2);
  }

}
