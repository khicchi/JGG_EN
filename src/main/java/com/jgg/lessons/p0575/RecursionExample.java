package com.jgg.lessons.p0575;

public class RecursionExample {

  public static void main(String[] args) {
    int number = 5;
    System.out.println("Factorial of " +
                  number + " is: " + factorial(number));
  }

  // Recursive method to calculate factorial of n
  public static int factorial(int n) {
    if (n == 0 || n == 1) {  // Base case: 0! = 1! = 1
      return 1; // exit condition
    } else {
      return n * factorial(n - 1);  // Recursive call
    }
  }

}
