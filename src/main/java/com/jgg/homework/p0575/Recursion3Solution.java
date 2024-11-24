package com.jgg.homework.p0575;

public class Recursion3Solution {

  public static void main(String[] args) {

    int n = 10;  // Find the 10th Fibonacci number
    System.out.println("The " + n + "th Fibonacci number is: " + fibonacciRecursion(n));
    System.out.println("The " + n + "th Fibonacci number is: " + fibonacciIterative(n));

  }

  // TASK: Write a program to find the Fibonacci of N
  // Must: Use recursion.
  // The Fibonacci sequence is a series of numbers where
  // each number is the sum of the two preceding numbers, starting from 0 and 1.
  // The sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
  // Recursive method to calculate the nth Fibonacci number
  public static int fibonacciRecursion(int n) {
    if (n == 0) {  // Base case 1
      return 0;
    } else if (n == 1) {  // Base case 2
      return 1;
    } else {
      // Recursive call: F(n) = F(n-1) + F(n-2)
      return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
  }

  public static int fibonacciIterative(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    int a = 0, b = 1, fib = 1;
    for (int i = 2; i <= n; i++) {
      fib = a + b;
      a = b;
      b = fib;
    }
    return fib;
  }

}
