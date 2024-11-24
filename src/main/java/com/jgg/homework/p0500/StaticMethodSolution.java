package com.jgg.homework.p0500;

public class StaticMethodSolution {

  public static void main(String[] args){

    // TASK-1: Create a method which prints your name.
    //         Call the method

    printName();
    System.out.println("***************************** TASK-1 FINISHED *****************************");

    // TASK-2: Create a method which calculates and prints the result of 22 + 5.
    //         Call the method

    printSum();
    System.out.println("***************************** TASK-2 FINISHED *****************************");

    // TASK-3: Create a method which prints odd numbers between [2-13] using for loop.
    //         Call the method

    printOddNumbers();
    System.out.println("***************************** TASK-3 FINISHED *****************************");

  }

  public static void printName() {
    System.out.println("John Doe");
  }

  public static void printSum() {
    int sum = 22 + 5;
    System.out.println("The result of 22 + 5 is: " + sum);
  }

  public static void printOddNumbers() {
    for (int i = 3; i <= 13; i += 2) { // Start at 3 and increment by 2 to get odd numbers
      System.out.println(i);
    }
  }

}
