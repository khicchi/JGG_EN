package com.jgg.lessons.p0820;

public class Palindrome {

  public static void main(String[] args){

    System.out.println("isPalindrome1(\"madam\") = " + isPalindrome1("madam"));
    System.out.println("isPalindrome1(\"car\") = " + isPalindrome1("car"));
  }

  public static boolean isPalindrome1(String str) {
    // we should ignore spaces and punctuation [Non-alphanumeric characters]
    str = str.replaceAll("[^a-zA-Z0-9]", "");

    //System.out.println("Non-alphanumeric free str: " + str);

    // Compare characters from both ends of the string
    int left = 0;
    int right = str.length() - 1;
    boolean equals = true;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        equals = false; // Characters at left and right indices don't match
      }
      left++;
      right--;
    }
    return equals;
  }

  public static boolean isPalindrome2(String str) {
    // we should ignore spaces and punctuation [Non-alphanumeric characters]
    str = str.replaceAll("[^a-zA-Z0-9]", "");

    //System.out.println("Non-alphanumeric free str: " + str);

    // Compare characters from both ends of the string
    int left = 0;
    int right = str.length() - 1;
    boolean equals = true;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        equals = false; // Characters at left and right indices don't match
        break;
      }
      left++;
      right--;
    }
    return equals;
  }

  public static boolean isPalindrome3(String str) {
    // we should ignore spaces and punctuation [Non-alphanumeric characters]
    str = str.replaceAll("[^a-zA-Z0-9]", "");

    //System.out.println("Non-alphanumeric free str: " + str);

    // Compare characters from both ends of the string
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false; // Characters at left and right indices don't match
      }
      left++;
      right--;
    }
    return true;
  }

  public static boolean isPalindrome4(String str) {
    if (str == null || str.isBlank()) {
      return true;
    }

    str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
    return new StringBuilder(str).reverse().toString().equals(str);
  }

}
