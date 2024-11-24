package com.jgg.lessons.p2745;

public class LambdaExample {

  public static void main(String[] args) {
    // Creating MathOperation implementations with lambda expression
    MathOperation addition = (x, y) -> x + y; // lambda expression
    MathOperation multiplication = (x, y) -> x * y; // lambda expression

    // Passing lambda expressions as methods
    System.out.println(executeOperation(5, 3, addition));        // Output: 8
    System.out.println(executeOperation(5, 3, multiplication));   // Output: 15
  }

  // Method that takes a MathOperation interface as a parameter
  public static int executeOperation(int a, int b, MathOperation operation) {
    return operation.operate(a, b);
  }

}
