package com.jgg.lessons.p0910;

import java.util.Arrays;

public class ReturningArraysFromMethods {

  public static void main(String[] args){
    // Create a method which accepts three int parameters
    // and returns an array of those
    int[] arrayFromMethod = createIntArray(2,3,4);
    System.out.println(Arrays.toString(arrayFromMethod));
    // [2, 3, 4]

    // Create a method which accepts an int array
    // and returns a NEW array by doubling the element values
    int[] intArr1 = { 5, 6, 7};
    int[] intArr2 = doubleValues(intArr1);
    System.out.println("intArr1 = " + Arrays.toString(intArr1));
    // [5, 6, 7]
    System.out.println("intArr2 = " + Arrays.toString(intArr2));
    // [10, 12, 14]
  }

  public static int[] createIntArray(int a, int b, int c) {
    return new int[] {a, b, c};
  }

  public static int[] doubleValues(int[] array) {
    int[] newInt = new int[array.length];

    for(int i = 0; i < array.length; i++) {
      newInt[i] = array[i] * 2;
    }

    return newInt;
  }

}
