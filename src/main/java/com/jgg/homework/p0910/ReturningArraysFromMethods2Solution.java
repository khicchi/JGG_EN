package com.jgg.homework.p0910;

public class ReturningArraysFromMethods2Solution {

  public static void main(String[] args){

    // TASK:   Create a method which accepts a boolean array
    //         Set all elements to false of the accepted array and return it

    boolean[] boolArray = {true, false, true};
    boolArray = setAllToFalse(boolArray);

    // Print the array to verify all elements are set to false
    for(int i = 0; i < boolArray.length; i++) {
      System.out.print(boolArray[i] + " "); // Output: false false false
    }

  }

  // Method to set all elements of the boolean array to false
  public static boolean[] setAllToFalse(boolean[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = false;
    }
    return array;
  }

}
