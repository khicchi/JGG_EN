package com.jgg.homework.p0690;

public class StringConcat2Solution {

  public static void main(String[] args){

    // TASK: Create a static method which accepts a String parameter
    //       and returns the reverse of the String Parameter
    System.out.println("reverseString(\"reverse\") = " + reverseString("reverse"));
    
  }

  public static String reverseString(String str) {
    String reversed = "";

    // Iterate through the characters of the string in reverse order
    for (int i = str.length() - 1; i >= 0; i--) {
      // Concatenate each character to the reversed string
      reversed = reversed.concat(String.valueOf(str.charAt(i)));
    }

    return reversed;
  }

}
