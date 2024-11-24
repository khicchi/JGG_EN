package com.jgg.homework.p1220;

public class ConstructorExamples4Solution {

  public static void main(String[] args){

    // TASK-1: Create a class Book with <title> and <author> instance fields.
    //         Book class should have two constructors.
    //         One constructor accepts <title> and <author> parameters 
    //         to init <title> and <author> instance fields.
    //         Other constructor (aka. copy constructor) should accept a Book object as parameter,
    //         and create a NEW Book object with the same attributes as the provided Book object parameter

    // TASK-2: Create an instance method <displayInfo> which returns a String 
    //         of the <title> and <author> in a good format like => "Title: <title>, Author: <author>"

    // TASK-3: Create a book object with values;
    // title                                  author
    // Cracking the Coding Interview          Gayle Laakmann McDowell
    Book book1 = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell");

    // TASK-4: Create another book object via the copy constructor by using the previously created book object
    Book book2 = new Book(book1);

    // TASK-5: Call <displayInfo> method for each object
    System.out.println(book1.displayInfo()); // Title: Cracking the Coding Interview, Author: Gayle Laakmann McDowell
    System.out.println(book2.displayInfo()); // Title: Cracking the Coding Interview, Author: Gayle Laakmann McDowell
  }

}

class Book {
  private String title;
  private String author;

  // Parameterized constructor to initialize title and author
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  // Copy constructor to initialize with another Book object
  public Book(Book another) {
    this.title = another.title;
    this.author = another.author;
  }

  // Method to display book information
  public String displayInfo() {
    return String.format("Title: %s, Author: %s",title, author);
  }

}