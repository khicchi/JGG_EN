package com.jgg.homework.p0780;

public class StringTrimSolution {

  public static void main(String[] args){

    // TASK-1: Check if "blue" equals to "Blue " when "Blue " is trimmed and converted to lowercase
    String str1 = "blue";
    String str2 = "Blue ";
    boolean isEqual = str1.equals(str2.trim().toLowerCase());
    System.out.println(isEqual); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Print " 3 spaces   inside                       " by trimming the leading and trailing spaces
    String originalString = " 3 spaces   inside                       ";
    String trimmedString = originalString.trim();
    System.out.println(trimmedString); // "3 spaces   inside"

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Print the length of an empty string when trimmed
    String emptyString = "";
    int lengthAfterTrim = emptyString.trim().length();
    System.out.println(lengthAfterTrim); // 0

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

}
