package com.jgg.homework.p0420;

public class ForLoopRulesSolutions {

  public static void main(String[] args){

    // TASK-1: Calculate the sum of all numbers from 1 to n and print
    int n = 10;
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Calculate the factorial of a given number (Ex: 3! = 3 * 2 * 1 = 6)
    int number = 5;
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    System.out.println("Factorial of " + number + " is: " + factorial);

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Print multiples of a given number up to a certain limit.
    number = 3;
    int limit = 10;
    for (int i = 1; i <= limit; i++) {
      System.out.println(number * i);
    }

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Print all even numbers in the same line (space separated)
    //         from 40 to 3 (inclusive)
    for (int i = 40; i >= 3; i--) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }

    System.out.println("************************** TASK 4 FINISHED **************************");

  }

}
