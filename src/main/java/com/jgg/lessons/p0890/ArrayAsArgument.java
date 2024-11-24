package com.jgg.lessons.p0890;

import java.util.Arrays;

public class ArrayAsArgument {

  public static void main(String[] args){
    // Create a method which returns the received int array size
    System.out.println(getArraySize(new int[] {3, 5, 5, 7}));

    // Create a method which accepts a String array and nullifies all elements
    String[] strArr = { "nullify", "me" };
    nullifyStringArray(strArr);
    System.out.println(Arrays.toString(strArr));

    // Send a null array to the nullifyStringArray() method
    strArr = null;
    nullifyStringArray(strArr); // Read the exception

    // Update nullifyStringArray() method to check if parameter is null
    nullifyStringArrayNullCheck(strArr);
  }

  public static int getArraySize(int[] intArray) {
    return intArray.length;
  }

  public static void nullifyStringArray(String[] array) {
    for(int i = 0; i < array.length; i++) {
      array[i] = null;
    }
  }

  public static void nullifyStringArrayNullCheck(String[] array) {
    if (array != null) {
      for(int i = 0; i < array.length; i++) {
        array[i] = null;
      }
    }
  }

}
