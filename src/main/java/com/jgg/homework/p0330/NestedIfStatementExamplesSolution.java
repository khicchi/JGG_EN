package com.jgg.homework.p0330;

public class NestedIfStatementExamplesSolution {

  public static void main(String[] args){

    int number = 6;

    // TASK: Determine if a given number is positive, negative, or zero, and if it's positive,
    //       determine if it's odd or even, then print

    if (number > 0) {
      System.out.println("positive");
      if (number % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    } else if (number < 0) {
      System.out.println("negative");
    } else {
      System.out.println("zero");
    }

  }

}
