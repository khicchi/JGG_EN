package com.jgg.homework.p1080;

public class ConvertingPrimitivesWrapperObjectsToString1Solution {

  public static void main(String[] args){

    long l = 0;
    int i = 1;
    char c = 'r';

    // TASK: Convert the above primitives to String objects

    // Convert long to String
    String longToString = Long.toString(l);
    System.out.println("Long to String: " + longToString); // 0

    // Convert int to String
    String intToString = Integer.toString(i);
    System.out.println("Int to String: " + intToString); // 1

    // Convert char to String
    String charToString = Character.toString(c);
    System.out.println("Char to String: " + charToString); // r

    // Alternatively, using concatenation to convert primitives to String
    String longToStringAlt = l + "";
    String intToStringAlt = i + "";
    String charToStringAlt = c + "";

    System.out.println("Long to String (alt): " + longToStringAlt); // Output: Long to String (alt): 0
    System.out.println("Int to String (alt): " + intToStringAlt); // Output: Int to String (alt): 1
    System.out.println("Char to String (alt): " + charToStringAlt); // Output: Char to String (alt): r
  }

}
