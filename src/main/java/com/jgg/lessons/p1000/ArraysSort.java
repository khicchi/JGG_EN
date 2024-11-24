package com.jgg.lessons.p1000;

import java.util.Arrays;

public class ArraysSort {

  public static void main(String[] args){

    int[] arr1 = {1, 2, 3};
    int[] arr2 = {3, 2, 1};

    // Check if arr1 equals arr2
    System.out.println(Arrays.equals(arr1, arr2));
    // false

    // Check if arr1 equals arr2 by disregarding item order
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2)); // [1, 2, 3]
    System.out.println(Arrays.equals(arr1, arr2)); // true

    String[] names = { "Michael", "John", "Abigail" };
    // Sort and print names
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
    // [Abigail, John, Michael]


  }
}
