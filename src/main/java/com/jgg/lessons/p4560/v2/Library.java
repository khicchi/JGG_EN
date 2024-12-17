package com.jgg.lessons.p4560.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.Getter;

public class Library {
  @Getter private ArrayList<Book> books;

  public Library() {
    books = new ArrayList<>();
  }

  // Book addition method
  public boolean addBook(int id, String title, String author) {
    return books.add(new Book(id, title, author));
  }

  // Book check by id (book number)
  public boolean bookExists(int id) {
    for (Book book : books) {
      if (book.getId() == id) {
        return true;
      }
    }

    return false;
  }

  // Book borrow method
  public boolean borrowBook(int id) {
    Book bookToBorrow = getBookByChecking(id);

    if (bookToBorrow.isAvailable()) {
      bookToBorrow.setAvailable(false);
      return true;
    }

    throw new LibraryException("This book was already borrowed.");
  }

  // Book return method
  public boolean returnBook(int id) {
    Book bookToReturn = getBookByChecking(id);

    if (!bookToReturn.isAvailable()) {
      bookToReturn.setAvailable(true);
      return true;
    }

    throw new LibraryException("This book was already available (not borrowed).");
  }

  // Book Search method
  public List<Book> searchBook(String keyword) {
    return books.stream()
        .filter(
            b ->
                b.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || b.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
        .collect(Collectors.toList());
  }

  // Search book by ID
  private Optional<Book> getBook(int id) {
    return books.stream().filter(b -> b.getId() == id).findFirst();
  }

  // Search book by ID, if not exist throw exception
  private Book getBookByChecking(int id) {
    Optional<Book> bookOptional = getBook(id);

    if (bookOptional.isEmpty())
      throw new LibraryException("Enter a valid book number.");

    return bookOptional.get();
  }
}
