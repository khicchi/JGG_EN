package com.jgg.lessons.p0680;

public class StringCharAt {

  public static void main(String[] args){

    // Print the first character of "a"
    String str1 = "a"; // a
    System.out.println("str1.charAt(0) = " + str1.charAt(0));

    // Print the 3rd character of "abcdef"
    String str2 = "abcdef"; // c
    System.out.println("str2.charAt(3) = " + str2.charAt(2));
    // Since index starts from 0, Third character means index = 2

    // Print the last char of a non-null guaranteed String <str3>
    String str3 = "World";
    System.out.println("str3.length() = " + str3.length()); // 5
    int lastCharIndex = str3.length() - 1; // 4
    System.out.println("lastCharIndex = " + lastCharIndex);
    System.out.println("str3.charAt(lastCharIndex) = " + str3.charAt(lastCharIndex));
    // last char index is always length()-1

    // Print each char of "Hello" in separate line
    String str4 = "Hello";
    for(int i = 0; i < str4.length(); i++) {
      System.out.println(str4.charAt(i));
    }

    // Print the 5th char of "hi"
    String str5 = "hi";
    System.out.println("str5.charAt(4) = " + str5.charAt(4));
    // throws StringIndexOutOfBoundsException

  }
}
