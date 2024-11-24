package com.jgg.homework.p1040;

public class VariableArguments1Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts variable String arguments
    //       and returns their concatenation.

    System.out.println(concatenateStrings("Hello", " ", "World", "!")); // Hello World!
    System.out.println(concatenateStrings("Java", " ", "is", " ", "fun")); // Java is fun
    System.out.println(concatenateStrings("Concatenation", " ", "using", " ", "varargs")); // Concatenation using varargs
  }

  // Method that accepts variable number of String arguments and returns their concatenation
  public static String concatenateStrings(String... strings) {
    // Create a StringBuilder to efficiently concatenate the strings
    StringBuilder result = new StringBuilder();

    // Loop through each string argument
    for (String str : strings) {
      // Append each string to the StringBuilder
      result.append(str);
    }

    // Convert the StringBuilder to a String and return it
    return result.toString();
  }

}
