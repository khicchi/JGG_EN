package com.jgg.homework.p0220;

public class RelationalOperatorsNotEqualToSolution {

  public static void main(String[] args){

    // TASK-1: Compare <true> and <false> to check if they are not equal
    System.out.println(true != false); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Compare <true> and <!false> to check if they are not equal
    System.out.println(true != !false); // false

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Compare two identical char variables to check if they are not equal
    char char1 = 'B';
    char char2 = 'B';
    System.out.println(char1 != char2); // false

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Compare two different int variables to check if they are not equal
    int int1 = 15;
    int int2 = 30;
    System.out.println(int1 != int2); // true

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Assign the result of the last comparison to a boolean variable,
    //         negate its value, and print the result
    boolean areIntsNotEqual = int1 != int2;
    areIntsNotEqual = !areIntsNotEqual;
    System.out.println(areIntsNotEqual); // false

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Compare two identical double values (not variables)
    //         to check if they are not equal, and print the result
    System.out.println(5.67 != 5.67); // false

    System.out.println("************************** TASK 6 FINISHED **************************");



  }

}
