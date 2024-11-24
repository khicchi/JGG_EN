package com.jgg.lessons.p0840;

import java.util.Arrays;

public class InstantiatingArrays {

  public static void main(String[] args){

    // Declare an int array, instantiate it in separate line
    int[] myIntArr;
    myIntArr = new int[5]; // array will keep 5 elements

    // Instantiate an int array when declared
    int[] intArray = new int[3]; // array size is 3

    // Instantiate a String array
    String[] myStrArr = new String[4];

    // Print <intArray> elements
    System.out.println(Arrays.toString(intArray));
    // [0, 0, 0] => default int values

    // Print <myStrArr> elements
    System.out.println(Arrays.toString(myStrArr));
    // [null, null, null, null] => default String values

    // Declare and print a boolean array
    boolean[] myBooleanArr = new boolean[3];
    System.out.println(Arrays.toString(myBooleanArr));
    // [false, false, false] => default boolean values

    // Declare an int array with values 3, 7, 9
    int[] arr = {3, 7, 9};
    System.out.println(Arrays.toString(arr));
    // [3, 7, 9]

  }
}
