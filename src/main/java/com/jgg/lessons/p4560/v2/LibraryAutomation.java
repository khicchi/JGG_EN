package com.jgg.lessons.p4560.v2;

import java.util.List;
import java.util.Scanner;

public class LibraryAutomation {

  private static Scanner scanner;
  private static Library library;
  private static int lastChoice = 0;

  public static void main(String[] args) {

    library = new Library();
    int userChoice = 0, choice = 0;

    while (true) {
      try {
        scanner = new Scanner(System.in);

        if (lastChoice == 0) {
          printMainMenu();
          print("Enter your choice: ");
          userChoice = readInteger();
        }

        // if there is a last choice we go with that, otherwise we process user input
        choice = lastChoice != 0 ? lastChoice : userChoice;

        if (lastChoice == 0) clearBuffer();

        switch (choice) {
          case 1:
            addBook();
            break;
          case 2:
            displayBooks();
            break;
          case 3:
            borrowBook();
            break;
          case 4:
            returnBook();
            break;
          case 5:
            searchBook();
            break;
          case 6:
            println("Closing the app. Have a nice day!");
            return;
          default:
            println("Invalid selection. Please try again.");
        }
        resetLastChoice();

      } catch (LibraryException e) {
        println(e.getMessage());
      } catch (ExitToMainMenuException e) {
        println("Returning to main menu...");
        resetLastChoice();
      }
      catch (Exception e) {
        println(e.getMessage());
        resetLastChoice();
      } finally {
        if (choice == 6) {
          scanner.close();
        }
      }
    }
  }

  private static void searchBook() {
    print("Enter the keyword you want to search for: ");
    String keyword = readString();
    List<Book> books = library.searchBook(keyword);

    println("=== Search Results ===");
    if (books.isEmpty()) println("No results found.");
    else books.forEach(System.out::println);
  }

  private static void returnBook() {
    lastChoice = 4;

    println("You are returning a book.");
    print("Enter the book number you want to return: ");
    int returnId = readInteger();

    if (library.returnBook(returnId)) println("Book was returned successfully.");
  }

  private static void printMainMenu() {
    println("\n=== Smart Library Management System ===");
    System.out.println("1. Add Book");
    System.out.println("2. List All Books");
    System.out.println("3. Borrow a Book");
    System.out.println("4. Return a Book");
    System.out.println("5. Search Books");
    System.out.println("6. Exit");
    System.out.println("q for returning main menu");
  }

  private static void borrowBook() {
    lastChoice = 3;

    println("You are borrowing a book.");
    print("Enter the book number you want to borrow: ");
    int borrowId = readInteger();

    if (library.borrowBook(borrowId)) println("Book was borrowed successfully.");
  }

  private static void displayBooks() {
    if (library.getBooks().isEmpty()) {
      println("There is not any book in the library.");
    } else {
      println("=== All Books ===");
      library.getBooks().forEach(System.out::println);
    }
  }

  private static void clearBuffer() {
    scanner.nextLine(); // Clear the empty line
  }

  private static void addBook() {
    lastChoice = 1;

    println("You are adding a book");
    print("Enter the book number: ");
    int id = readInteger();
    clearBuffer();

    if (library.bookExists(id)) {
      throw new LibraryException("The book number you entered belongs to another book.");
    }

    print("Enter Title: ");
    String title = readString();

    print("Enter Author: ");
    String author = readString();

    if (library.addBook(id, title, author)) println("Book was added successfully!");
    else println("The book was not added. Try again!");
  }

  private static void resetLastChoice() {
    lastChoice = 0;
  }

  private static int readInteger() {
    String input = scanner.next();
    checkInputForMainMenu(input);

    try {
      return Integer.parseInt(input);
    } catch (Exception e) {
      throw new LibraryException("Enter numeric value!");
    }
  }

  private static void checkInputForMainMenu(String input) {
    if (input.equals("q")) {
      lastChoice = 6;
      throw new ExitToMainMenuException();
    }
  }

  private static String readString() {
    String input = scanner.nextLine();
    checkInputForMainMenu(input);

    if (input.isBlank()) throw new LibraryException("Empty characters are not allowed!");

    return input;
  }

  private static void print(String text) {
    System.out.print(text);
  }

  private static void println(String text) {
    System.out.println(text);
  }
}
