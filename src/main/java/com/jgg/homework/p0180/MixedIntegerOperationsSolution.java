package com.jgg.homework.p0180;

public class MixedIntegerOperationsSolution {

  public static void main(String[] args){

    // TASK-1: Try to initialize an int variable <a> with the result of <5 * 2.5>
    // int a = 5 * 2.5; // compilation error: possible lossy conversion from double to int

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Initialize a double variable <b> with the result of <5 * 2.5>, and print it
    double b = 5 * 2.5;
    System.out.println(b); // 12.5

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Given short1 = 22 and short2 = 23 as short variables
    //         Initialize short3 with the sum of <short1> and <short2>
    short short1 = 22;
    short short2 = 23;
    // short short3 = short1 + short2; // compilation error: possible lossy conversion from int to short
    short short3 = (short) (short1 + short2); // explicit cast
    System.out.println(short3); // 45

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Perform a multiplication between int and double variables
    //         Try to assign the result to an int variable
    int intVar = 10;
    double doubleVar = 2.5;
    double multiplicationResult = intVar * doubleVar; // multiplication
    // int resultInt = multiplicationResult; // compilation error: possible lossy conversion from double to int
    int resultInt = (int) multiplicationResult; // explicit cast
    System.out.println(resultInt); // 25

    System.out.println("************************** TASK 4 FINISHED **************************");



  }

}
