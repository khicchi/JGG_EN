package com.jgg.homework.p0575;

public class Recursion1Solution {

  public static void main(String[] args) {

    printNumbers(5);

  }

  // TASK: Write a recursive method that prints all numbers from 1 to N.
  public static void printNumbers(int n) {
    if (n == 0) {  // Base case: stop when n reaches 0
      return;
    }
    printNumbers(n - 1);  // Recursive call with n-1
    System.out.println(n);  // Print the current number after the recursive call
  }

}
