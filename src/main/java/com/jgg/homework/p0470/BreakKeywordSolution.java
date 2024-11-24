package com.jgg.homework.p0470;

public class BreakKeywordSolution {

  public static void main(String[] args){

    // TASK-1: Print numbers from 1 to 10,
    // but stop and exit the loop when the number is 5

    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        break; // Exit the loop when i is 5
      }
      System.out.println(i);
    }

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Find and print the first weird number greater than 10 and less than 50
    // using a while loop. Exit the loop as soon as you find the number.
    // Weird number is a number whose multiplication with itself is greater than 1000

    int num = 11; // Start checking from 11

    while (num < 50) {
      if (num * num > 1000) { // Check if the square of the number is greater than 1000
        System.out.println("The first weird number greater than 10 and less than 50 is: " + num);
        break; // Exit the loop as soon as we find the first weird number
      }
      num++; // Increment the number
    }

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

}
