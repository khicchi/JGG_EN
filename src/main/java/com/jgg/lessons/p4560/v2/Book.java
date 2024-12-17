package com.jgg.lessons.p4560.v2;

import lombok.Getter;
import lombok.Setter;

public class Book {
  @Getter private int id;
  @Getter private String title;
  @Getter private String author;
  @Getter @Setter private boolean isAvailable = true;

  public Book(int id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    String status = isAvailable ? "Available" : "Borrowed";
    return "Book number: " + id + " - Title: \"" + title + "\" - Author: " + author + " - Status: " + status;
  }
}
