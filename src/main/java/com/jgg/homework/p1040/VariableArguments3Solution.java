package com.jgg.homework.p1040;

public class VariableArguments3Solution {

  public static void main(String[] args){

    // TASK-3: Create a method which accepts variable int arguments
    //         and returns the average of them.

    double average1 = calculateAverage(1, 2, 3, 4, 5);
    System.out.println("Average: " + average1); // 3.0

    double average2 = calculateAverage(10, 20, 30);
    System.out.println("Average: " + average2); // 20.0

    double average3 = calculateAverage(7, 14, 21, 28);
    System.out.println("Average: " + average3); // 17.5
  }

  // Method that accepts variable number of int arguments and returns their average
  public static double calculateAverage(int... numbers) {
    // Calculate the sum of all provided numbers
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }

    // Return the average
    return (double) sum / numbers.length;
  }

}
