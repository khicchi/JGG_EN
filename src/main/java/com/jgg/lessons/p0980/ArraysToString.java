package com.jgg.lessons.p0980;

import java.util.Arrays;

public class ArraysToString {

  public static void main(String[] args){

    int[] intArr = new int[2];

    System.out.println(intArr); // [I@2a84aee7
    // prints the string representation of the array object,
    // not the contents of the array


    System.out.println(Arrays.toString(intArr)); // [0, 0]
    // This should be used to print the contents of an array

    int[][] dimensionalArr = new int[3][2];

    System.out.println(Arrays.toString(dimensionalArr));
    // [[I@a09ee92, [I@30f39991, [I@452b3a41]
    // prints the string representation of each array in <dimensionalArr>

    System.out.println(Arrays.deepToString(dimensionalArr));
    // [[0, 0], [0, 0], [0, 0]]
    // This should be used to print the contents of a dimensional array


  }
}
