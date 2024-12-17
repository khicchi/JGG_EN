package com.jgg.homework.p4510;

import java.util.Scanner;

public class Scanner3Solution {

  public static void main(String[] args){

    // TASK: Write a program that continuously takes number inputs from the user,
    //       calculates the average of all entered numbers each time a new number is entered,
    //       and also provides an option to “exit”.

    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    int counter = 0;

    System.out.println("Enter a number for input, or type ‘q’ to exit.");

    while (true) {
      System.out.print("Enter a number (or ‘q’ to exit):");
      String input = scanner.nextLine();

      // Exit check
      if (input.equalsIgnoreCase("q")) {
        System.out.println("Exiting the program...");
        break;
      }

      try {
        // Convert the input to double
        double num = Double.parseDouble(input);
        sum += num;
        counter++;
        double average = sum / counter;

        System.out.println("The average of the entered numbers: " + average);
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number or type ‘q’ to exit.");
      }
    }

    scanner.close();
  }

}
