package com.jgg.lessons.p4560.v1;

import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books;

  public Library() {
    books = new ArrayList<>();
  }

  // Book addition method
  public void addBook(int id, String title, String author) {
    books.add(new Book(id, title, author));
    System.out.println("Book was added successfully!");
  }

  // Books list display method
  public void displayBooks() {
    if (books.isEmpty()) {
      System.out.println("No book in the library.");
      return;
    }
    System.out.println("=== All Books ===");
    for (Book book : books) {
      String status = book.isAvailable() ? "Available" : "Borrowed";
      System.out.println(book.getId() + " - \"" + book.getTitle() + "\" - Author: " + book.getAuthor() + " - Status: " + status);
    }
  }

  // Borrow book method
  public void borrowBook(int id) {
    for (Book book : books) {
      if (book.getId() == id) {
        if (book.isAvailable()) {
          book.setAvailable(false);
          System.out.println("\"" + book.getTitle() + "\" was borrowed successfully.");
        } else {
          System.out.println("This book was already borrowed.");
        }
        return;
      }
    }
    System.out.println("Enter a valid book number.");
  }

  // Return book method
  public void returnBook(int id) {
    for (Book book : books) {
      if (book.getId() == id) {
        if (!book.isAvailable()) {
          book.setAvailable(true);
          System.out.println("\"" + book.getTitle() + "\" was returned successfully.");
        } else {
          System.out.println("This book was already available (not borrowed).");
        }
        return;
      }
    }
    System.out.println("Enter a valid book number.");
  }

  // Search book method
  public void searchBook(String keyword) {
    System.out.println("=== Search Results ===");
    boolean found = false;
    for (Book book : books) {
      if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
        found = true;
        String status = book.isAvailable() ? "Available" : "Borrowed";
        System.out.println(book.getId() + " - \"" + book.getTitle() + "\" - Author: " + book.getAuthor() + " - Status: " + status);
      }
    }
    if (!found) {
      System.out.println("No results for your search.");
    }
  }
}
