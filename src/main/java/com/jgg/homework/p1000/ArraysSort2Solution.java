package com.jgg.homework.p1000;

import java.util.Arrays;

public class ArraysSort2Solution {

  public static void main(String[] args){

    String str1 = "listen", str2 = "silent";

    // TASK:   Check if <str1> and <str2> equal disregarding the order of the characters
    //         Use Arrays.equals() method
    //         Hint: Arrays.sort() may help

    // Convert strings to char arrays
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    // Sort the char arrays
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    // Compare the sorted char arrays
    boolean areEqual = Arrays.equals(charArray1, charArray2);

    System.out.println(areEqual); // true
  }

}
