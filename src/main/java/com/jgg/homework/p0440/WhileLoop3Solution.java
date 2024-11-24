package com.jgg.homework.p0440;

public class WhileLoop3Solution {

  public static void main(String[] args){

    int counter1 = 100;
    int counter2 = 60;

    // TASK: in a loop, <counter1> is decreased by 1 for each iteration until 40 (inclusive),
    // at the same time, <counter2> is increased by 2 for each iteration until 80 (inclusive).
    // Calculate the sum of both counters for each iteration,
    // and print if sum is divisible by 7 without reminder.
    // Solve with while loop and for-loop separately

    // way 1 - while loop solution
    while (counter1 >= 40 && counter2 <= 80) {
      int sum = counter1 + counter2;
      if (sum % 7 == 0) { // Check if the sum is divisible by 7
        System.out.println("Counter1: " + counter1 + ", Counter2: " + counter2 + ", Sum: " + sum + " is divisible by 7");
      }

      // Update counters
      counter1--; // Decrease counter1 by 1
      counter2 += 2; // Increase counter2 by 2
    }

    // way 2 - for loop solution
    for (counter1 = 100, counter2 = 60; counter1 >= 40 && counter2 <= 80; counter1--, counter2 += 2) {
      int sum = counter1 + counter2;
      if (sum % 7 == 0) { // Check if the sum is divisible by 7
        System.out.println("Counter1: " + counter1 + ", Counter2: " + counter2 + ", Sum: " + sum + " is divisible by 7");
      }
    }
  }
  
}
