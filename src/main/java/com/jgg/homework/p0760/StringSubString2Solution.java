package com.jgg.homework.p0760;

public class StringSubString2Solution {

  public static void main(String[] args){

    // TASK: Print
    // *
    // **
    // ***
    // ****
    // using String "****" and subString() method

    String str = "****";

    for (int i = 1; i <= str.length(); i++) {
      System.out.println(str.substring(0, i));
    }

  }

}
