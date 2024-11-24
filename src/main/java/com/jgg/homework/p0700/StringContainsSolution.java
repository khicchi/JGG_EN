package com.jgg.homework.p0700;

public class StringContainsSolution {

  public static void main(String[] args){

    // TASK-1: Check if "" is included in "cake"
    String mainString1 = "cake";
    String subString1 = "";

    boolean contains1 = mainString1.contains(subString1);
    System.out.println(contains1); // Output: true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Check if "father" is included in "Father"
    System.out.println("Father".contains("father")); // false

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Check if "red" included in "reed"
    System.out.println("reed".contains("red")); // false

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

}
