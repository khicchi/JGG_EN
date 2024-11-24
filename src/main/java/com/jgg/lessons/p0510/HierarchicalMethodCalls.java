package com.jgg.lessons.p0510;

public class HierarchicalMethodCalls {

  public static void main(String[] args){
    printLettersUppercaseAndLowercase(); // method call
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
