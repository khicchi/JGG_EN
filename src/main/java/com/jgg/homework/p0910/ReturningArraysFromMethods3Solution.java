package com.jgg.homework.p0910;

public class ReturningArraysFromMethods3Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts long array.
    //       Create an int array in the method and
    //       add all long array elements by casting to int.
    //       Return the newly created int array

    long[] longArray = {100L, 200L, 300L};
    int[] intArray = convertAndSumLongArray(longArray);

    // Print the int array to verify conversion
    for(int i = 0; i < intArray.length; i++) {
      System.out.print(intArray[i] + " "); // // Output: 100 200 300
    }
  }

  // Method to convert long array to int array and sum the elements
  public static int[] convertAndSumLongArray(long[] longArray) {
    // Create an int array with the same length as the long array
    int[] intArray = new int[longArray.length];

    // Variable to hold the sum of int values
    int sum = 0;

    // Convert each long element to int and store in intArray
    for (int i = 0; i < longArray.length; i++) {
      intArray[i] = (int) longArray[i];
      sum += intArray[i];
    }

    // Print the sum of the int values
    System.out.println("Sum of int values: " + sum);

    return intArray;
  }

}
