package com.jgg.homework.p4510;

import java.util.ArrayList;
import java.util.Scanner;

public class Scanner2Solution {

  public static void main(String[] args){

    // TASK: Creating a List of the User’s Favorite Books:
    //       Ask the user how many book titles they will enter.
    //       Get the name of each book from the user one by one.
    //       Finally, print the list of favorite books.

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> books = new ArrayList<>();

    System.out.println("How many books will you enter?");
    int n = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter the " + i + ".th book:");
      String book = scanner.nextLine();
      books.add(book);
    }

    System.out.println("Your Favorite Books:");
    for (String b : books) {
      System.out.println("- " + b);
    }

    scanner.close();

  }

}
