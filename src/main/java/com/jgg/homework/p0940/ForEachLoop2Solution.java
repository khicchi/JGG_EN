package com.jgg.homework.p0940;

public class ForEachLoop2Solution {

  public static void main(String[] args){

    // TASK : Create a method which accepts a String parameter
    //        In the method, id the String is not null,
    //        then create a char array with the length of the String.
    //        Fill char array with the characters in the String and return
    //        If String parameter is null, then return null.

    String testString = "Hello";
    char[] result = createCharArrayFromString(testString);

    if (result != null) {
      for (char ch: result) {
        System.out.print(ch + " "); // H e l l o
      }
    } else {
      System.out.println("String is null, returned null.");
    }

  }

  public static char[] createCharArrayFromString(String str) {
    if (str != null) {
      char[] charArray = new char[str.length()];
      for (int i = 0; i < str.length(); i++) {
        charArray[i] = str.charAt(i);
      }
      return charArray;
    }
    return null;
  }

}
