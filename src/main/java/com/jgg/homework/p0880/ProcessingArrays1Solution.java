package com.jgg.homework.p0880;

public class ProcessingArrays1Solution {

  public static void main(String[] args){

    // TASK:   Initialize an int array with values: 10, 20, 30, 40, 50
    //         find the sum of all elements
    int[] numbers = {10, 20, 30, 40, 50};
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println("Sum of array elements: " + sum);

  }

}
