package com.jgg.lessons.p0800;

public class StartsWithEndsWith {

  public static void main(String[] args){

    String str = "This day is the day we have been searching for!";

    // Check if <str> starts with "This"
    System.out.println(str.startsWith("This")); // true

    // Check if <str> starts with "This"
    System.out.println(str.startsWith("this")); // false

    // Check if <str> starts with "This "
    System.out.println(str.startsWith("This ")); // true

    // Check if <str> starts with "This day"
    System.out.println(str.startsWith("This day")); // true

    // Check if <str> ends with "r!"
    System.out.println(str.endsWith("r!")); // true


  }
}
