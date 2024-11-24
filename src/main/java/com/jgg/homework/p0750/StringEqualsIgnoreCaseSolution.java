package com.jgg.homework.p0750;

public class StringEqualsIgnoreCaseSolution {

  public static void main(String[] args){

    // TASK-1: Check if "a" equals "a" by ignoring case
    System.out.println("a".equalsIgnoreCase("a")); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Check if "A" equals "a" by ignoring case
    String aUpperCase = "A", aLowerCase = "a";
    System.out.println(aUpperCase.equalsIgnoreCase(aLowerCase)); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Check if "paRrot" equals "ParroT" by ignoring case
    System.out.println("paRrot".equalsIgnoreCase("ParroT")); // true

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Define String <a> as null, and String <b> as null
    //         Check if <a> equals <b> by ignoring case
    String a = null, b = null;
    // System.out.println(a.equalsIgnoreCase(b)); // throws NPE

    System.out.println("************************** TASK 4 FINISHED **************************");
  }

}
