package com.jgg.lessons.p2275;

public class StackOverflowErrorExample {

  public static void main(String[] args) {
    recursiveMethod(1);
  }

  public static void recursiveMethod(int i) {
    System.out.println("Recursive call: " + i);
    recursiveMethod(i + 1); // Recursive call that leads to StackOverflowError
  }

}
