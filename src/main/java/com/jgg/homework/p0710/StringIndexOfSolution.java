package com.jgg.homework.p0710;

public class StringIndexOfSolution {

  public static void main(String[] args){

    // TASK-1: What is the index of String "101" in "cake101"
    String mainString1 = "cake101";
    String subString1 = "101";
    System.out.println(mainString1.indexOf(subString1)); // 4

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: What is the index of char 101 in "cake101"
    char subChar = 101;
    System.out.println(mainString1.indexOf(subChar)); // 3

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: What is the index of "a" in "Aero"
    System.out.println("Aero".indexOf("a")); // -1

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: What is the index of last character of a non-null String
    int lastCharIndex = mainString1.length() - 1;
    System.out.println(lastCharIndex); // 6

    System.out.println("************************** TASK 4 FINISHED **************************");

  }

}
