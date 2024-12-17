package com.jgg.lessons.p4560.v1;

import java.util.Scanner;

public class LibraryAutomation {

  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\n=== Smart Library Management System ===");
      System.out.println("1. Add Book");
      System.out.println("2. List All Books");
      System.out.println("3. Borrow a Book");
      System.out.println("4. Return a Book");
      System.out.println("5. Search Books");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Clean the empty line

      switch (choice) {
        case 1:
          System.out.print("Enter book number: ");
          int id = scanner.nextInt();
          scanner.nextLine(); // Clean the empty line
          System.out.print("Enter book name: ");
          String title = scanner.nextLine();
          System.out.print("Enter Author name: ");
          String author = scanner.nextLine();
          library.addBook(id, title, author);
          break;
        case 2:
          library.displayBooks();
          break;
        case 3:
          System.out.print("Enter the book number you want to borrow: ");
          int borrowId = scanner.nextInt();
          library.borrowBook(borrowId);
          break;
        case 4:
          System.out.print("Enter the book number you want to return: ");
          int returnId = scanner.nextInt();
          library.returnBook(returnId);
          break;
        case 5:
          System.out.print("Enter the keyword you want to search for: ");
          String keyword = scanner.nextLine();
          library.searchBook(keyword);
          break;
        case 6:
          System.out.println("Exiting the system. Have a good day!");
          return;
        default:
          System.out.println("Invalid selection. Please try again.");
      }
    }
  }
}
