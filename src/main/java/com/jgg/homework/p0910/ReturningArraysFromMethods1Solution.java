package com.jgg.homework.p0910;

public class ReturningArraysFromMethods1Solution {

  public static void main(String[] args){

    // TASK: Create a method which returns an int array.
    //       int array will contain the decimal values
    //       of each char of the accepted char array

    char[] charArray = {'A', 'b', '3', '!', '?'}; // decimal values: 'A': 65, 'b': 98, '3': 51, '!': 33, '?': 63
    int[] decimalValues = getDecimalValues(charArray);

    // Print the decimal values
    for(int i = 0; i < decimalValues.length; i++) {
      System.out.println(decimalValues[i]);
    }
  }

  // Method to convert char array to int array of decimal values
  public static int[] getDecimalValues(char[] chars) {
    int[] decimals = new int[chars.length]; // Initialize int array with the same length as char array

    for (int i = 0; i < chars.length; i++) {
      decimals[i] = (int) chars[i]; // Convert char to its decimal (ASCII) value
    }

    return decimals; // Return the int array
  }

}