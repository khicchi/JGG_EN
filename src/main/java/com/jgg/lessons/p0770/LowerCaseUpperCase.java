package com.jgg.lessons.p0770;

public class LowerCaseUpperCase {

  public static void main(String[] args){

    String str = "progress 101";

    // Convert <str> to uppercase and print
    System.out.println(str.toUpperCase()); // PROGRESS 101

    // Print <str>
    System.out.println("str = " + str); // progress 101

    // Assign the uppercase of <str> to itself and print
    str = str.toUpperCase();
    System.out.println("str = " + str); // PROGRESS 101

    // Print the lowercase of <str>
    System.out.println("str.toLowerCase() = " + str.toLowerCase());
    // progress 101

    // Print
    // xxxx
    // xxx
    // xx
    // x
    // using String "XXXX"
    str = "XXXX";
    for(int i = str.length(); i >= 0; i--) {
      System.out.println(str.substring(0, i).toLowerCase());
    }

  }
}
