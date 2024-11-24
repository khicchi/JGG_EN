package com.jgg.homework.p1030;

public class ArrayExamples7 {

  public static void main(String[] args){

    // TASK: Create a method which accepts an int array
    //       and returns the sum of the elements.
    //       Ignore those sections of numbers:
    //       starting with 3 and extending to the 10
    //       (including 3 and 10).
    //       int array parameter is not null (guaranteed).
    //       int array parameter always has 10 after 3
    //       (but not guaranteed to have 10 just after 3).
    //       There may be no 3 in the elements.
    //       But if there is a 3, it is guaranteed to have 10
    //       after 3 at somewhere in the array.

    // Try your solution with those inputs
    // Sample inputs                            expected output
    int[] testArr1 = { -2, 2 };                     // 0
    int[] testArr2 = { -2, 3, 10 };                 // -2
    int[] testArr3 = { 3, 10 };                     // 0
    int[] testArr4 = { 3, 10, 2 };                  // 2
    int[] testArr5 = { -2, 3, 10, 2 };              // 0
    int[] testArr6 = { -2, 3, 10, 2, 3, 10, 1 };    // 1

  }

}
