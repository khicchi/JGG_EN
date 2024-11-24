package com.jgg.homework.p0815;

public class StringExamples1Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts a String parameter.
    // This method should check if the string parameter is null,
    // if so, then it should return empty String.
    // Otherwise, it should return a clarified String
    // which does not include two adjacent spaces.
    // Returned String should not start with space or end with space as well.
    // Test your solution with those inputs;

    String test1 = "This  is     a test     string.";
    String test2 = null;
    String test3 = "No  extra  spaces ";
    String test4 = " No  extra  spaces";
    String test5 = "   No  extra  spaces ";
    String test6 = " ";
    String test7 = "JJ";

    System.out.println(clarifyString(test1));
    System.out.println(clarifyString(test2));
    System.out.println(clarifyString(test3));
    System.out.println(clarifyString(test4));
    System.out.println(clarifyString(test5));
    System.out.println(clarifyString(test6));
    System.out.println(clarifyString(test7));
  }

  public static String clarifyString(String input) {
    // Check if the input is null
    if (input == null) {
      return "";
    }

    // Replace occurrences of two adjacent spaces with a single space
    String clarified = input;
    while (clarified.contains("  ")) {
      clarified = clarified.replace("  ", " ");
    }

    return clarified.trim();
  }

}
