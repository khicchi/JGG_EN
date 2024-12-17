package com.jgg.homework.p4510;

import java.util.Scanner;

public class Scanner1Solution {

  public static void main(String[] args){

    // TASK: Calculating the Average of the Numbers Entered by the User:
    //       First, ask the user how many numbers they want to enter.
    //       Then, ask them to enter each number one by one.
    //       Print the average of the numbers entered.

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many number you will enter?");
    int count = scanner.nextInt();

    double sum = 0;
    for (int i = 1; i <= count; i++) {
      System.out.println("Enter the " + i + ".th number:");
      double num = scanner.nextDouble();
      sum += num;
    }

    double average = sum / count;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

    scanner.close();
  }

}
