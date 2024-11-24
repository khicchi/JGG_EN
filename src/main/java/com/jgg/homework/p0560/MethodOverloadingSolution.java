package com.jgg.homework.p0560;

public class MethodOverloadingSolution {

  public static void main(String[] args){

    // TASK-1: Create a method which takes two int parameters and one char parameter.
    //         Char parameter can only be +, -, / or * which describes the arithmetic operators
    //         This method should perform the desired calculation based on the char parameters
    //         Then it should return the result as int
    //         Call the method 4 times with different char values (one call for each arithmetic calculation)
    System.out.println("10 + 5 = " + calculate(10, 5, '+')); // 15
    System.out.println("10 - 5 = " + calculate(10, 5, '-')); // 5
    System.out.println("10 * 5 = " + calculate(10, 5, '*')); // 50
    System.out.println("10 / 5 = " + calculate(10, 5, '/')); // 2

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Overload the method you created to make it accept two double parameters and a char parameter
    //         It should do the same calculation but return type should be different
    System.out.println("10.5 + 5.5 = " + calculate(10.5, 5.5, '+')); // 16.0
    System.out.println("10.5 - 5.5 = " + calculate(10.5, 5.5, '-')); // 5.0
    System.out.println("10.5 * 5.5 = " + calculate(10.5, 5.5, '*')); // 57.75
    System.out.println("10.5 / 5.5 = " + calculate(10.5, 5.5, '/')); // 1.9090909090909092

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Overload the method you created to make it accept two long parameters and a char parameter
    //         It should do the same calculation but return type should be different
    System.out.println("10000000000 + 5000000000 = " + calculate(10000000000L, 5000000000L, '+')); // 15000000000
    System.out.println("10000000000 - 5000000000 = " + calculate(10000000000L, 5000000000L, '-')); // 5000000000
    System.out.println("10000000000 * 5000000000 = " + calculate(10000000000L, 5000000000L, '*')); // 50000000000000000000
    System.out.println("10000000000 / 5000000000 = " + calculate(10000000000L, 5000000000L, '/')); // 2

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

  // Method to perform arithmetic operations with int parameters
  public static int calculate(int num1, int num2, char operator) {
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        if (num2 != 0) {
          return num1 / num2;
        } else {
          throw new ArithmeticException("Division by zero");
        }
      default:
        throw new IllegalArgumentException("Invalid operator");
    }
  }

  // Method to perform arithmetic operations with double parameters
  public static double calculate(double num1, double num2, char operator) {
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        if (num2 != 0) {
          return num1 / num2;
        } else {
          throw new ArithmeticException("Division by zero");
        }
      default:
        throw new IllegalArgumentException("Invalid operator");
    }
  }

  // Method to perform arithmetic operations with long parameters
  public static long calculate(long num1, long num2, char operator) {
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        if (num2 != 0) {
          return num1 / num2;
        } else {
          throw new ArithmeticException("Division by zero");
        }
      default:
        throw new IllegalArgumentException("Invalid operator");
    }
  }

}
