package com.jgg.lessons.p0360;

public class SwitchStatement {

  public static void main(String[] args) {

    // Write a calculator to perform +, -, /, * operations over two int
    // operator should also be a variable
    // print the results in this format:
    // <num1> <operator> <num2> = <result>
    double num1 = 12, num2 = 6, result;
    char operator = '+';

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        result = 0;
        break;
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}



