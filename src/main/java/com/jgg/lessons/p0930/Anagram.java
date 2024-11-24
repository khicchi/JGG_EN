package com.jgg.lessons.p0930;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args){
    // Create a method which accepts two String parameters
    // and returns true if they are Anagram, otherwise false
    boolean areAnagrams = areAnagrams("silent", "listen");
    System.out.println(areAnagrams);

    areAnagrams = areAnagrams("silent", "lesten");
    System.out.println(areAnagrams);
  }

  public static boolean areAnagrams(String str1, String str2) {
    // Check if any of the parameters is null
    if (str1 == null || str2 == null) {
      return false;
    }

    // Check if both strings have the same length
    if (str1.length() != str2.length()) {
      // If not, there is no chance to be anagram
      return false;
    }

    // Convert strings to character arrays and sort them
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    // We will compare both arrays. But before a sort is needed
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    // Compare sorted arrays
    return Arrays.equals(charArray1, charArray2);
  }

}
