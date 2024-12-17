package com.jgg.lessons.p4510;

import java.util.Scanner;

public class ClosingScanner2 {

  public static void main(String[] args){

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter your age:");
      int age = scanner.nextInt();
      System.out.println("Your age: " + age);
    } // Scanner is closed at this line automatically

  }

}
