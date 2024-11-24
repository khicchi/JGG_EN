package com.jgg.lessons.p0160;

public class PlusOperator {

  public static void main(String[] args){

    // Use + operator to sum two variables (Arithmetic Addition)
    int operand1 = 20;
    int operand2 = 10;
    int sum = operand1 + operand2;
    System.out.println("sum = " + sum); // sum = 30

    // User + operator to concatenate two variables (String Concatenation)
    String greeting = "Hello";
    String name = "Jane";
    String message = greeting + ", " + name + "!";
    System.out.println("message = " + message); // message = Hello, Jane!

    // Mixing Numeric and String Operands
    System.out.println("Some string " + 15); // Some string 15
    System.out.println("Some string " + 15 + 5); // Some string 155
    System.out.println("Some string " + (15 + 5)); // Some string 20
    System.out.println("Some string " + (15 + 5) + " some other"); // Some string 20 some other
    System.out.println("Some string " + 15 + 5 + " some other"); // Some string 155 some other

  }

}
