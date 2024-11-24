package com.jgg.lessons.p0920;

import java.util.Arrays;

public class ArrayExamples2 {

  public static void main(String[] args){
    // Create a method which returns a new String array
    // by processing the provided String array parameter
    // It should ignore null elements and creates a new
    // array with only non-null values
    String[] words = {"apple", null, "banana", null, "orange"};
    String[] nonNullWords = removeNulls(words);
    System.out.println("Non-null elements:");
    System.out.println(Arrays.toString(nonNullWords));
  }

  public static String[] removeNulls(String[] array) {
    // Count the number of non-null elements in the array
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) {
        count++;
      }
    }

    // Create a new array to hold non-null elements
    String[] nonNullArray = new String[count];

    // Copy non-null elements to the new array
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) {
        nonNullArray[index] = array[i];
        index++;
      }
    }

    return nonNullArray;
  }

}
