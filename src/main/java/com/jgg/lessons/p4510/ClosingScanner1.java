package com.jgg.lessons.p4510;

import java.util.Scanner;

public class ClosingScanner1 {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    // Read user input
    System.out.println("Enter your name:");
    String name = scanner.nextLine();
    System.out.println("Hi " + name);

    // close the Scanner object
    scanner.close();

    // user the closed Scanner object
    scanner.nextLine(); // throws IllegalStateException

  }

}
