package com.jgg.homework.p0740;

public class StringEqualsSolution {

  public static void main(String[] args){

    // TASK-1: Check if "me" equals "me" by value
    String str1 = "me";
    String str2 = "me";
    boolean isEqualValue = str1.equals(str2);
    System.out.println(isEqualValue); // Output: true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Check if "me" equals "me" by reference
    boolean isEqualReference = (str1 == str2);
    System.out.println(isEqualReference); // Output: true

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Check if "a" equals "A"
    String str3 = "a";
    String str4 = "A";
    boolean isEqualCaseSensitive = str3.equals(str4);
    System.out.println(isEqualCaseSensitive); // Output: false

    // TASK-4: Check if "a" equals "A".replace("A", "a")
    String str5 = "A".replace("A", "a");
    boolean isEqualAfterReplace = str3.equals(str5);
    System.out.println(isEqualAfterReplace); // Output: true

    System.out.println("************************** TASK 4 FINISHED **************************");

  }

}
