package com.jgg.homework.p0210;

public class RelationalOperatorsEqualToSolution {

  public static void main(String[] args){

    // TASK-1: Compare two identical char variables to check if they are equal
    //         and print the result
    char char1 = 'A';
    char char2 = 'A';
    System.out.println(char1 == char2); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Compare two identical char variables to check if they are equal,
    //         assign the result to a boolean variable, and print the result
    boolean areCharsEqual = (char1 == char2);
    System.out.println(areCharsEqual); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Compare true and false to check if they are equal and print the result
    System.out.println(true == false); // false

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Compare two identical float variables to check if they are equal
    //         and print the result
    float float1 = 1.23f;
    float float2 = 1.23f;
    System.out.println(float1 == float2); // true

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Compare two different int variables to check if they are equal,
    //         assign the result to a boolean variable, and print the result
    int int1 = 10;
    int int2 = 20;
    boolean areIntsEqual = (int1 == int2);
    System.out.println(areIntsEqual); // false

    System.out.println("************************** TASK 5 FINISHED **************************");

  }

}
