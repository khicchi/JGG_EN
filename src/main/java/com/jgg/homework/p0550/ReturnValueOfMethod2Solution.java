package com.jgg.homework.p0550;

public class ReturnValueOfMethod2Solution {

  public static void main(String[] args){

    // TASK: Create a method which takes 3 string parameters
    //       and returns concatenation of them. Call this method

    String result = concatenate("Hello, ", "world", "!");
    System.out.println("Concatenated result: " + result);
  }

  // Method to concatenate three String parameters
  public static String concatenate(String str1, String str2, String str3) {
    return str1 + str2 + str3;
  }

}
