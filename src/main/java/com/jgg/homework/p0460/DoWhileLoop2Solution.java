package com.jgg.homework.p0460;

public class DoWhileLoop2Solution {

  public static void main(String[] args){

    int subtractFromMe = 1000;

    // TASK: subtract numbers 3 to 121 (inclusive) from <subtractFromMe>
    // using do-while loop
    // Print <subtractFromMe> after each subtraction

    int num = 3; // Start from 3

    do {
      subtractFromMe -= num; // Subtract num from subtractFromMe
      System.out.println("After subtracting " + num + ", the value is: " + subtractFromMe);
      num++; // Move to the next number
    } while (num <= 121); // Continue until num exceeds 121
  }

}
