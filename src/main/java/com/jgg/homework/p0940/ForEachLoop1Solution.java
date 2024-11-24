package com.jgg.homework.p0940;

public class ForEachLoop1Solution {

  public static void main(String[] args){

    // TASK: Create a String array with values: "Apple", "Orange", "Grape"
    //       Set each array elements to null
    //       Print the array

    String[] fruits = {"Apple", "Orange", "Grape"};

    // Set each array element to null
    for (int i = 0; i < fruits.length; i++) {
      fruits[i] = null;
    }

    // Print the array
    for (String fruit : fruits) {
      System.out.println(fruit); // Output: null (for each element)
    }
  }

}
