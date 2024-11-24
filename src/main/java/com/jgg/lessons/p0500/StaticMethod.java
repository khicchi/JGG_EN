package com.jgg.lessons.p0500;

public class StaticMethod {

  public static void main(String[] args){
    printGreetings(); // method call
    printLettersUppercase(); // method call
  }

  // Method declaration
  public static void printGreetings() {
    System.out.println("Hi there.");
  }

  // Method declaration
  public static void printLettersUppercase() {
    for(int i = 65; i <= 90; i++) {
      System.out.print((char) i);
    }
    System.out.println();
  }

  // Method declaration
  public static void printLettersUppercaseAndLowercase() {
    printLettersUppercase();
    printLettersLowercase();
  }

  // Method declaration
  public static void printLettersLowercase() {
    for(int i = 97; i <= 122; i++) {
      System.out.print((char) i);
    }
    System.out.println();
  }
}
