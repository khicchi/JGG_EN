package com.jgg.homework.p0815;

public class StringExamples3Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts a String parameter.
    // Method should
    // (1) change all letters to uppercase
    // (2) remove the trailing spaces
    // (3) remove all digits
    // (4) remove all spaces
    // and returns the new String
    // Try your solution with those inputs;
    // (Method should return <HERE> for all those inputs)

    String test1 = "Here ";
    String test2 = "Here ";
    String test3 = "   He  re ";
    String test4 = "   He3  re ";
    String test5 = "   He3324  re ";
    String test6 = "33h33e    444    R    444e         ";

    System.out.println(transformString(test1));
    System.out.println(transformString(test2));
    System.out.println(transformString(test3));
    System.out.println(transformString(test4));
    System.out.println(transformString(test5));
    System.out.println(transformString(test6));
  }

  public static String transformString(String input) {
    // Check if the input is null
    if (input == null) {
      return "";
    }

    // Convert the string to uppercase
    String result = input.toUpperCase();

    // Remove trailing spaces
    result = result.trim();

    // Remove all digits
    result = result.replaceAll("\\d", "");

    // Remove adjacent spaces
    result = result.replaceAll(" ", "");

    return result;
  }

}
