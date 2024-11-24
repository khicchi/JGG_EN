package com.jgg.lessons.p0880;

import java.util.Arrays;

public class ProcessingArrays {

  public static void main(String[] args){

    String[] strArr = { "Honda", "Toyota", "Mercedes", "Tesla" };

    // Print each element in a new line
    for(int i = 0; i < strArr.length; i++) {
      System.out.println(strArr[i]);
    }

    // Check if there is an element "Tesla"
    boolean teslaFound = false;
    for(int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals("Tesla")) {
        teslaFound = true;
        break;
      }
    }
    System.out.println("teslaFound = " + teslaFound);

    // Assign the lengths of the elements to each element
    for(int i = 0; i < strArr.length; i++) {
      strArr[i] = "" + strArr[i].length();
    }
    System.out.println(Arrays.toString(strArr));
    // [5, 6, 8, 5]

  }

}
