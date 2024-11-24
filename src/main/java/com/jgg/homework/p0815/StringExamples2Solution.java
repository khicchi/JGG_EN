package com.jgg.homework.p0815;

public class StringExamples2Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts a String parameter.
    // This method changes "  " with " " and returns the new String.
    // Call this method until the input string does not contain any adjacent spaces.
    // Test your solution with those inputs and DEBUG;
    
    String test1 = "             ";
    String test2 = "        s   s    s     s               ";

    // test1
    while (test1.contains("  ")) {
      test1 = reduceSpaces(test1);
    }
    System.out.println(test1);

    // test2
    while (test2.contains("  ")) {
      test2 = reduceSpaces(test2);
    }
    System.out.println(test2);
  }

  public static String reduceSpaces(String input) {
    return input.replace("  ", " ");
  }

}
