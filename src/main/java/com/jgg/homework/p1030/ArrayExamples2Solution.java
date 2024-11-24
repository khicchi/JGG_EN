package com.jgg.homework.p1030;

import java.util.Arrays;

public class ArrayExamples2Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int parameter
    //       and returns an int array
    //       whose length is the provided int parameter.
    //       The elements of the array should be their index number.
    //       Print the returned array

    //       Try your method with those inputs
    // Sample Inputs      Expected Output
    int testInput1 = 0;     // []
    int testInput2 = 1;     // [0]
    int testInput3 = 2;     // [0, 1]
    int testInput4 = 5;     // [0, 1, 2, 3, 4]

    System.out.println(Arrays.toString(createIndexArray(testInput1))); // []
    System.out.println(Arrays.toString(createIndexArray(testInput2))); // [0]
    System.out.println(Arrays.toString(createIndexArray(testInput3))); // [0, 1]
    System.out.println(Arrays.toString(createIndexArray(testInput4))); // [0, 1, 2, 3, 4]
  }

  public static int[] createIndexArray(int length) {
    // Create an array of the specified length
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
      // Assign the index number to each element
      result[i] = i;
    }

    // Return the created array
    return result;
  }

}
