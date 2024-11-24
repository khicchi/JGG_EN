package com.jgg.homework.p0520;

public class PassingArgumentsToMethod1Solution {

  public static void main(String[] args){

    // TASK: Create a method which takes two int parameters
    //       This method should print the even numbers between those parameters (inclusively)
    //       Call the method
    printEvenNumbers(3, 15);

  }

  // Method to print even numbers between two integers (inclusive)
  public static void printEvenNumbers(int start, int end) {
    // Ensure start is less than or equal to end
    if (start > end) {
      System.out.println("Invalid range: start should be less than or equal to end.");
      return;
    }

    // Adjust start to be even if it is odd
    if (start % 2 != 0) {
      start++;
    }

    // Print even numbers between start and end (inclusive)
    for (int i = start; i <= end; i += 2) {
      System.out.println(i);
    }
  }

}
