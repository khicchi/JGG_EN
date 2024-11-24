package com.jgg.lessons.p0990;

import java.util.Arrays;

public class ArraysEquals {

  public static void main(String[] args){

    int[] arr1 = {1, 2, 3};
    int[] arr2 = {1, 2, 3};
    int[] arr3 = {3, 2, 1};

    // Compare arr1 with arr2
    System.out.println(Arrays.equals(arr1, arr2));
    // true

    // Compare arr1 with arr3
    System.out.println(Arrays.equals(arr1, arr3));
    // false

    // Create two String arrays with values: "A", "B"
    // Compare if they are equal
    boolean equals = Arrays.equals(new String[] { "A", "B"},
                                  new String[] { "A", "B"});
    System.out.println(equals);
    // true


  }
}
