package com.jgg.lessons.p4500;

import java.util.Scanner;

public class ScannerMethods2 {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a word:");
    String word = scanner.next();  // Retrieves only first word

    System.out.println("Enter a sentence:");
    String sentence = scanner.nextLine(); // Gets empty. Because \n remains from the preceding next()

    System.out.println("Word: " + word);
    System.out.println("Sentence: " + sentence);

    // try the same code with multiple words
  }

}
