package com.jgg.lessons.p0080;

public class ValueAssignment {

  public static void main(String[] args){

    // Declare and initialize an int and String variables
    int age = 20;
    String name = "John";

    // Declare an int variable and then initialize in a separate expression
    int year;
    year = 2033;

    // Declare two int variables in the same expression and then initialize them;
    int cost, payment;
    cost = 300; payment = 200;

    // Declare and initialize two String variables in the same expression
    String firstName = "John", lastName = "Doe";

    // Assign a multiplication result of a variable and value
    int partial = 200;
    int total = partial * 3;

    // Assign a variables value to another variable
    String middleName = "Jane";
    String otherName = middleName;
  }

}
