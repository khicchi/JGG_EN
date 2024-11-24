package com.jgg.lessons.p1300;

import java.util.ArrayList;
import java.util.List;

  public class StaticBlock {

    public static void main(String[] args){
      Book book1 = new Book("Mosquito 1");
      Book book2 = new Book("Mosquito 2");
    }

  }

  class Book {
    public static List<String> booksInLibrary;
    private String title;

    static { // static block
      booksInLibrary = new ArrayList<>();
      booksInLibrary.add("Harry Potter");
      booksInLibrary.add("Rec");
      System.out.println("Static block executed!");
    }

    Book(String title) {
      this.title = title;
      System.out.println("Constructor executed");
    }
  }
