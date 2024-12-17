package com.jgg.lessons.p4500;

import java.util.Scanner;

public class ScannerMethods1 {

  public static void main(String[] args){

    // Define a Scanner object
    Scanner scanner = new Scanner(System.in);

    // Take an entire line from user
    System.out.println("Enter your address:");
    String address = scanner.nextLine();
    System.out.println("Your address: " + address);

    // Take a boolean value from user
    System.out.println("Do you want to continue? (true/false):");
    boolean devam = scanner.nextBoolean();
    System.out.println("Your answer: " + devam);

    // Take the text until the first space from the user
    System.out.println("Enter your address:");
    address = scanner.next();
    System.out.println("Your address: " + address);

  }

}
