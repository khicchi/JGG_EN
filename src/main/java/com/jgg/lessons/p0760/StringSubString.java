package com.jgg.lessons.p0760;

public class StringSubString {

  public static void main(String[] args){

    String str = "Hello, World!";

    // Extract substring from index 1 to the end. Use <str>
    System.out.println("str.substring(1) = " + str.substring(1));

    // Extract substring from index 0 to index 1 (exclusive). Use <str>
    System.out.println("str.substring(0,1) = " + str.substring(0, 1));

    // Extract substring from index 7 to index 12 (exclusive). Use <str>
    System.out.println("str.substring(7, 12) = " + str.substring(7, 12));

    // Extract substring from index 5 to index 5. Use <str>
    System.out.println("str.substring(5, 5) = " + str.substring(5, 5));

    // Extract substring from index 0 to the end. Use <str>
    System.out.println("str.substring(0, str.length()) = " +
                                          str.substring(0, str.length()));

    // Print
    // 0000
    // 000
    // 00
    // 0
    // using String "0000"
    str = "0000";
    for(int i = str.length(); i >= 0; i--) {
      System.out.println(str.substring(0, i));
    }

  }

}
