package com.jgg.homework.p0520;

public class PassingArgumentsToMethod3Solution {

  public static void main(String[] args){

    // TASK: Create a method which takes 3 double parameters
    //       This method should sum those parameters and print the result
    //       Call the method

    sumAndPrint(10.5, 20.3, 30.2);

  }

  // Method to sum and print three double parameters
  public static void sumAndPrint(double num1, double num2, double num3) {
    // Sum the parameters
    double result = num1 + num2 + num3;

    // Print the result
    System.out.println(result);
  }

}
