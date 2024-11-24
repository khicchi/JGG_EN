package com.jgg.homework.p0970;

public class TwoDimensionalArraySolution {

  public static void main(String[] args){

    String[][] colors = {
        {"black", "white"},
        {"red", "yellow"},
        {"green", "blue"}
    };

    // TASK: Create a method which accepts a two-dimensional String array.
    //       This method should calculate the sum of the decimal representations of
    //       all characters of each String elements of the provided parameter
    //       And creates a single-dimensional int array with those values and returns.
    //       Each element of the int array represents the sum of the decimal
    //       representations of all characters of each String in the same row
    //       Example: first element of the returned int array represents the sum of the
    //       'b' + 'l' + 'a' + 'c' + 'k' + 'w' + 'h' + 'i' + 't' + 'e' characters decimal values

    int[] result = calculateSumOfDecimalValues(colors);

    // Print the result
    for (int sum : result) {
      System.out.println(sum);
    }

  }

  public static int[] calculateSumOfDecimalValues(String[][] array) {
    // Initialize the result array with the same number of rows as the input array
    int[] sumArray = new int[array.length];

    // Iterate through each row of the 2D array
    for (int i = 0; i < array.length; i++) {
      int rowSum = 0;
      // Iterate through each string in the current row
      for (String str : array[i]) {
        // Iterate through each character of the string
        for (char c : str.toCharArray()) {
          // Add the decimal value of the character to rowSum
          rowSum += (int) c;
        }
      }
      // Store the sum for the current row
      sumArray[i] = rowSum;
    }

    return sumArray;
  }

}
