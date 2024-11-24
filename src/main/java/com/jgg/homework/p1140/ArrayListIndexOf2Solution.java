package com.jgg.homework.p1140;

import java.util.ArrayList;

public class ArrayListIndexOf2Solution {

  public static void main(String[] args){

    ArrayList<String> testArr1 = null;
    ArrayList<String> testArr2 = new ArrayList<>();
    testArr2.add("John"); testArr2.add("Jane");
    
    // TASK: Create a method which accepts a String ArrayList and a String parameter.
    //       Method should return true if the provided String parameter is found in the ArrayList object,
    //       otherwise false.
    //       Return null if the ArrayList parameter is null.
    //       Hint: use indexOf() method

    // Try your solution with those inputs
    // Sample Inputs            Expected Output
    // testArr1, "Jane"         null
    // testArr2, "Jane"         true
    // testArr2, "Michael"      false

    System.out.println(containsString(testArr1, "Jane")); // null
    System.out.println(containsString(testArr2, "Jane")); // true
    System.out.println(containsString(testArr2, "Michael")); // false
  }

  public static Boolean containsString(ArrayList<String> list, String target) {
    // Check if the ArrayList parameter is null
    if (list == null) {
      return null;
    }

    // Use indexOf() method to check if the target string is found in the list
    return list.indexOf(target) != -1;
  }

}
