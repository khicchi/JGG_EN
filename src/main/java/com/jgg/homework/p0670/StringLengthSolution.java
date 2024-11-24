package com.jgg.homework.p0670;

public class StringLengthSolution {

  public static void main(String[] args){

    // TASK-1: Create a static method which accepts a String parameter
    //         and returns the length of the String parameter.
    //         Call the method with two different arguments
    System.out.println("Length of 'Hello': " + getStringLength("Hello")); // 5
    System.out.println("Length of 'World': " + getStringLength("World")); // 5

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Print the length of an empty String object
    String emptyString = "";
    System.out.println("Length of empty string: " + emptyString.length()); // 0

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Find the length of a null String
    String nullString = null;
    // System.out.println("Length of null string: " + getStringLength(nullString)); // throws NPE

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Find the length of " "
    String spaceString = " ";
    System.out.println("Length of ' ': " + spaceString.length()); // 1

    System.out.println("************************** TASK 4 FINISHED **************************");

  }

  // Static method to return the length of a String
  public static int getStringLength(String str) {
    return str.length();
  }

}
