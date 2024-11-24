package com.jgg.lessons.p0670;

public class StringLength {

  public static void main(String[] args){

    // Print the length of "hi"
    String str1 = "hi"; // 2
    System.out.println("str1.length() = " + str1.length());

    // Print the length of "hi "
    String str2 = "hi "; // 3
    System.out.println("str2.length() = " + str2.length());

    // Print the length of "   "
    String str3 = "   "; // 3
    System.out.println("str3.length() = " + str3.length());

    // Print the length of ""
    String str4 = ""; // 0
    System.out.println("str4.length() = " + str4.length());

    // Print the length of a null String
    String nullStr = null; // no object in memory
    System.out.println("nullStr.length() = " + nullStr.length());
    // nullStr.length() throws NullPointerException
    // "nullStr" is null
  }
}
