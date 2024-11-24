package com.jgg.lessons.p0920;

public class ArrayExamples1 {

  public static void main(String[] args){

    // Create a method which returns the max
    // of the accepted int array parameter
    int[] numbers = {10, 20, 30, 40, 50};
    int maxNumber = findMax(numbers);
    System.out.println("Maximum number in the array: " + maxNumber);

  }

  public static int findMax(int[] array) {
    // Initialize max to the first element
    int max = array[0];

    // Iterate through the array to find the maximum element
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    // Return the maximum element found
    return max;
  }

}
