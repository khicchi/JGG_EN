package com.jgg.homework.p1030;

public class ArrayExamples1 {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array
    //       and returns a new int array
    //       whose first element is the sum of odd numbers,
    //       and second element is the sum of even numbers.
    //       If the array parameter is null, return null.

    //       Try your method with those inputs
    // Sample inputs                            expected output
    int[] testArr1 = null;                        // null
    int[] testArr2 = new int[0];                  // [0, 0]
    int[] testArr3 = { 1 };                       // [1, 0]
    int[] testArr4 = { 1, 2 };                    // [1, 2]
    int[] testArr5 = { 1, 2, 3 };                 // [4, 2]
    int[] testArr6 = { 1, 2, 3, -3, -1, -2, 0 };  // [0, 0]

  }

}
