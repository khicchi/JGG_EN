package com.jgg.homework.p0770;

public class LowerCaseUpperCase1Solution {

  public static void main(String[] args){

    // TASK-1: Check if "Family" equals "family" case-insensitive
    //         without using equalsIgnoreCase() method
    String str1 = "Family";
    String str2 = "family";
    boolean areEqualCaseInsensitive = str1.toLowerCase().equals(str2.toLowerCase());
    System.out.println(areEqualCaseInsensitive); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Convert all letters to uppercase in "Think big"
    String originalString1 = "Think big";
    String upperCaseString1 = originalString1.toUpperCase();
    System.out.println(upperCaseString1); // THINK BIG

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Convert all letters to lowercase in "DREAM big"
    String originalString2 = "DREAM big";
    String lowerCaseString2 = originalString2.toLowerCase();
    System.out.println(lowerCaseString2); // dream big

    System.out.println("************************** TASK 3 FINISHED **************************");
  }

}
