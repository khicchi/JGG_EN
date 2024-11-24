package com.jgg.homework.p1030;

public class ArrayExamples5 {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array.
    //       This method should calculate the average
    //       of the numbers smaller than 5 <avgSmallerThan5>.
    //       Similarly, calculate the average
    //       of the numbers greater than 5 <avgGreaterThan5>.
    //       Return a two-dimensional double array,
    //       whose [0, 0] element is <avgSmallerThan5>,
    //       and [1, 0] element is <avgGreaterThan5>.
    //       If the array parameter is null, return null

    //       Try your method with those inputs
    // Sample inputs                            // expected output
    int[] testArr1 = null;                      // null
    int[] testArr2 = new int[0];                // [[0.0], [0.0]]
    int[] testArr3 = new int[1];                // [[0.0], [0.0]]
    int[] testArr4 = { 3, 5 };                  // [[3.0], [0.0]]
    int[] testArr5 = { 3, 3, 3 };               // [[3.0], [0.0]]
    int[] testArr6 = { 3, 3, 3, 5 };            // [[3.0], [0.0]]
    int[] testArr7 = { 3, 3, 1, 2, 1, 5, 6 };   // [[2.0], [6.0]]
    int[] testArr8 = { 1, 1, 2, 4, 8, 10 };     // [[2.0], [9.0]]

  }

}
