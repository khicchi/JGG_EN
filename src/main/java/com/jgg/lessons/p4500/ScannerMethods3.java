package com.jgg.lessons.p4500;

import java.util.Scanner;

public class ScannerMethods3 {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    // Read an int value
    System.out.println("Enter your age:");
    int age = scanner.nextInt();
    System.out.println("Your age: " + age);

    // Read a double value
    System.out.println("Enter a double:");
    double num1 = scanner.nextDouble();
    System.out.println("Double value: " + num1);

    // Read a long value
    System.out.println("Enter a long:");
    long num2 = scanner.nextLong();
    System.out.println("Long value: " + num2);

  }

}
