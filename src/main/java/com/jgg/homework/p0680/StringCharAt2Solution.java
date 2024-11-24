package com.jgg.homework.p0680;

public class StringCharAt2Solution {

  public static void main(String[] args){

    // TASK:   Create a static method which accepts a String parameter
    //         and returns the sum of the decimal
    //         values of the characters in String parameter.
    //         Call this method two times with different arguments.

    // Call the method with the first argument
    String firstString = "Hello";
    int sum1 = sumOfCharValues(firstString);
    System.out.println("Sum of decimal values of characters in \"" + firstString + "\": " + sum1);
    // Example output for "Hello": H=72, e=101, l=108, l=108, o=111 -> Total: 500

    // Call the method with the second argument
    String secondString = "World";
    int sum2 = sumOfCharValues(secondString);
    System.out.println("Sum of decimal values of characters in \"" + secondString + "\": " + sum2);
    // Example output for "World": W=87, o=111, r=114, l=108, d=100 -> Total: 520
  }

  // Static method to calculate the sum of the decimal values of characters in a string
  public static int sumOfCharValues(String str) {
    int sum = 0;
    for (char ch : str.toCharArray()) {
      sum += (int) ch;
    }
    return sum;
  }

}
