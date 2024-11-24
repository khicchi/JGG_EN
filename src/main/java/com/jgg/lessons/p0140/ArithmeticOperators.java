package com.jgg.lessons.p0140;

public class ArithmeticOperators {

  public static void main(String[] args){

    // Use Addition operator to get the sum of 22 and 13
    int sum = 22 + 13;
    System.out.println("sum = " + sum);

    // Use Subtraction operator to subtract 15 from the previous result
    int difference = sum - 15;
    System.out.println("sum after used as operand = " + sum);
    System.out.println("difference = " + difference);

    // Use Multiplication operator to multiply 5 with the previous result
    int product = difference * 5;
    System.out.println("difference after used as operand = " + difference);
    System.out.println("product: " + product);

    // Use Division operator to divide the previous result with 3
    int division = product / 3;
    System.out.println("division: " + division);

    // Use Modulus operator to remainder of the division of 100 by 3
    int remainder = 100 % 3;
    System.out.println("remainder = " + remainder);
  }

}
