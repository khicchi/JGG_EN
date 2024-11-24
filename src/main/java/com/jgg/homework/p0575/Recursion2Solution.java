package com.jgg.homework.p0575;

public class Recursion2Solution {

  public static void main(String[] args) {

    printNumbers(5);

  }

  // TASK: Write a recursive method that prints all numbers from N to 0.
  public static void printNumbers(int n) {
    System.out.println(n);  // Print the current number before the recursive call

    if (n == 0) {  // Base case: stop when n reaches 0
      return;
    }
    printNumbers(n - 1);  // Recursive call with n-1
  }

}
