package com.jgg.homework.p0760;

public class StringSubString1Solution {

  public static void main(String[] args){

    String source = "Hello, World!";

    // TASK-1: Extract substring from index 7 to the end
    String substring1 = source.substring(7); // "World!"

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Extract substring from index 0 to index 5 (exclusive)
    String substring2 = source.substring(0, 5); // "Hello"

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Extract substring from index 2 to index 4 (exclusive)
    String substring3 = source.substring(2, 4); // "ll"

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Extract substring from index 7 to index 7 (empty string)
    String substring5 = source.substring(7, 7); // ""

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Extract substring from index 0 to the end
    String substring6 = source.substring(0, source.length()); // "Hello, World!"

    System.out.println("************************** TASK 5 FINISHED **************************");
    
  }

}
