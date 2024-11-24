package com.jgg.homework.p1000;

import java.util.Arrays;

public class ArraysSort3Solution {

  public static void main(String[] args){

    // TASK-1: Create a method which accepts two int arrays
    //         and returns a boolean whether they are equal or not
    int[] intArray1 = {1, 2, 3};
    int[] intArray2 = {1, 2, 3};
    System.out.println(areArraysEqual(intArray1, intArray2)); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Overload the created method to accept
    //         two String arrays and perform the same logic
    String[] strArray1 = {"apple", "banana", "cherry"};
    String[] strArray2 = {"apple", "banana", "cherry"};
    System.out.println(areArraysEqual(strArray1, strArray2)); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

  // Method to compare two int arrays
  public static boolean areArraysEqual(int[] array1, int[] array2) {
    // Check if both arrays are null or not
    if (array1 == null || array2 == null) {
      return array1 == array2;
    }
    // Use Arrays.equals() to check if both int arrays are equal
    return Arrays.equals(array1, array2);
  }

  // Overloaded method to compare two String arrays
  public static boolean areArraysEqual(String[] array1, String[] array2) {
    // Check if both arrays are null or not
    if (array1 == null || array2 == null) {
      return array1 == array2;
    }
    // Use Arrays.equals() to check if both String arrays are equal
    return Arrays.equals(array1, array2);
  }

}
