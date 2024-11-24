package com.jgg.homework.p0770;

public class LowerCaseUpperCase2Solution {

  public static void main(String[] args){

    // TASK: Print
    // X
    // XX
    // XXX
    // XXXX
    // using String "xxxx"

    String baseString = "xxxx".toUpperCase();

    // Print the pattern
    for (int i = 1; i <= baseString.length(); i++) {
      System.out.println(baseString.substring(0, i));
    }

  }

}
