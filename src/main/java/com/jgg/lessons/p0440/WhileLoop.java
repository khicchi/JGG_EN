package com.jgg.lessons.p0440;

public class WhileLoop {

  public static void main(String[] args){

    int i = 1; // Initialization of the loop counter

    // While loop to print numbers from 1 to 5
    while (i <= 5) { // Condition
      System.out.println(i);
      i++; // Increment
    }
    System.out.println("Loop ends");

    // Print numbers 10 to 0 by while-loop
    int number = 10; // Start with 10
    while (number >= 0) {
      System.out.println(number);
      number--;
    }

    // Calculate the factorial of a non-negative integer n
    int n = 5; // Number for which factorial is to be calculated
    int factorial = 1; // Initialize factorial to 1

    while (n > 0) {
      factorial *= n; // Multiply factorial by current number
      n--; // Decrement number for next iteration
    }
    System.out.println("Factorial of 5 is: " + factorial);

    // Given <gear> 3 and <speed> 50, increase the speed by one
    // if the gear is 3 and the speed is under 60,
    // when the speed = 60 update gear as 4
    // print speed and gear always,
    int gear = 3, speed = 50;
    while (gear == 3) {
      speed++;
      if (speed == 60) {
        gear = 4;
      }
      System.out.println("gear: " + gear + ", speed: " + speed);
    }

  }

}
