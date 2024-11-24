package com.jgg.lessons.p1020;

import java.util.Arrays;

public class ArraysCopyOf {

  public static void main(String[] args){
    String[] names = { "Noah", "Ava", "Emma", "Liam" };

    // Check if "Ava" exists in the <names> array
    System.out.println(elementExists(names, "Ava"));

    // Print the <names>
    System.out.println(Arrays.toString(names)); // [Ava, Emma, Liam, Noah]

    // Try to update elementExists method not to alter the array parameter
    System.out.println(elementExistsNoChange(names, "Ava"));

    // Print the <names>
    System.out.println(Arrays.toString(names)); // [Noah, Ava, Emma, Liam]
  }

  public static boolean elementExists(String[] strArr, String target) {
    if (strArr == null)
      return false;

    Arrays.sort(strArr);
    return Arrays.binarySearch(strArr, target) >= 0;
  }

  public static boolean elementExistsNoChange(String[] strArr, String target) {
    if (strArr == null)
      return false;

    String[] strArrCopy = Arrays.copyOf(strArr, strArr.length);
    Arrays.sort(strArrCopy);
    return Arrays.binarySearch(strArrCopy, target) >= 0;
  }

}
