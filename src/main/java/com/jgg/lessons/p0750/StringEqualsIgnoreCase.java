package com.jgg.lessons.p0750;

public class StringEqualsIgnoreCase {

  public static void main(String[] args){

    String source = "Man";

    // Compare <source> with "MAN" by equalsIgnoreCase()
    System.out.println(source.equalsIgnoreCase("MAN"));
    // true

    // Compare <source> with "MAN" by equals()
    System.out.println(source.equals("MAN"));
    // false

    // Compare <source> with "Man" by equalsIgnoreCase()
    System.out.println(source.equalsIgnoreCase("Man"));
    // true

  }
}
