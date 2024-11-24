package com.jgg.homework.p1030;

import java.util.Arrays;

public class ArrayExamples3 {

  public static void main(String[] args){

    // TASK: Create a method which accepts a long array
    //       and returns the difference between the biggest and the smallest elements.
    //       If the accepted array is null, then -1 should be returned.
    //       If the accepted array's length is 0, then -1 should be returned.
    //       If the accepted array has only one element, return that element.
    //       ATTENTION: original array should not be altered

    //       Try your method with those inputs
    // sample input                 // expected output
    long[] testArr1 = null;         // -1
    long[] testArr2 = { 3 };        // 3
    long[] testArr3 = { 3, 3 };     // 0
    long[] testArr4 = { 3, 5 };     // 2
    long[] testArr5 = { 3, 2, 6 };  // 4
    long[] testArr6 = new long[0];  // -1

  }

}
