package com.jgg.homework.p0550;

public class ReturnValueOfMethod1Solution {

  public static void main(String[] args){

    int a = 3, b = 5, c = 7, d = 9;

    // TASK-1: Create a method which takes two int parameters
    //         and returns its summation. Call this method
    int result = sum(a, b);
    System.out.println(result);

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Use the method above twice to sum three ints
    result = sum(sum(a, b), c);
    System.out.println(result);

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Use the method above three times to sum four ints
    result = sum(sum(a, b), sum(c, d));
    System.out.println(result);

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

  // Method to sum two int parameters
  public static int sum(int num1, int num2) {
    return num1 + num2;
  }

}
