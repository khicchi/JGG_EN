package com.jgg.homework.p0520;

public class PassingArgumentsToMethod2Solution {

  public static void main(String[] args){

    // TASK: Create a method which takes 3 String parameters
    //       This method should concat and print those parameters
    //       Call the method

    concatenateAndPrint("Hello, ", "world", "!");

  }

  // Method to concatenate and print three strings
  public static void concatenateAndPrint(String str1, String str2, String str3) {
    // Concatenate the strings
    String result = str1 + str2 + str3;

    // Print the concatenated result
    System.out.println(result);
  }

}
