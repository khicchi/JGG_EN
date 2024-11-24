package com.jgg.homework.p0680;

public class StringCharAt4Solution {

  public static void main(String[] args){

    // TASK:   Create a static method which accepts a String parameter and a char parameter
    //         and returns the Count of the occurrences
    //         of a char parameter in the String parameter
    System.out.println(
        "countOccurrences(\"Kazablanka\", 'a') = " + countOccurrences("Kazablanka", 'a'));

  }

  public static int countOccurrences(String str, char targetChar) {
    int count = 0;

    // Iterate through the characters of the string
    for (int i = 0; i < str.length(); i++) {
      // Check if the current character matches the target character
      if (str.charAt(i) == targetChar) {
        count++;
      }
    }

    return count;
  }

}
