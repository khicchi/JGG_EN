package com.jgg.lessons.p0790;

public class IsEmptyIsBlank {

  public static void main(String[] args){

    // Check if "green" is empty
    String green = "green";
    System.out.println("green.isEmpty() = " + green.isEmpty());
    // false

    // Check if "green" is blank
    System.out.println("green.isBlank() = " + green.isBlank());
    // false

    // Check if "" is empty
    System.out.println("\"\".isEmpty() = " + "".isEmpty());
    // true

    // Check if "" is blank
    System.out.println("\"\".isBlank() = " + "".isBlank());
    // true

    // Check if " " is empty
    System.out.println("\" \".isEmpty() = " + " ".isEmpty());
    // false

    // Check if " " is blank
    System.out.println("\" \".isBlank() = " + " ".isBlank());
    // true

  }
}
