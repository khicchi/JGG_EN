package com.jgg.lessons.p0490;

public class LabelWithLoops {

  public static void main(String[] args){

    // continue keyword usage with inner loop
    // Print
    // * * * * *
    // * * * * *
    // * *   * *
    // * * * * *
    // * * * * *
    for (int row = 1; row <= 5; row++) {
      for (int col = 1; col <= 5; col++) {
        System.out.print(" ");
        if (row == 3 && col == 3) {
          System.out.print(" ");
          continue; // skip printing * for cell
        }
        System.out.print("*");
      }
      System.out.println();
    }

    // continue keyword usage with inner loop with label
    // Print
    // * * * * *
    // * * * * *
    // * *
    // * * * * *
    // * * * * *

    myLabel:
    for (int row = 1; row <= 5; row++) {
      System.out.println();
      for (int col = 1; col <= 5; col++) {
        System.out.print(" ");
        if (row == 3 && col == 3) {
          System.out.print(" ");
          continue myLabel;
          // skip printing * for rest of the row
        }
        System.out.print("*");
      }
    }

    // Print
    // * * * *
    // * * *
    // * *
    // *
    for (int row = 5; row > 0; row--) {
      System.out.println();
      for (int col = 1; col <= 5; col++) {
        System.out.print(" ");
        // Check condition
        if (row - col < 1) {
          System.out.print(" ");
          break;
          // finish the inner loop only
          // for current outer iteration
        }
        System.out.print("*");
      }
    }

    // Print
    // * * * * *
    // * * * * *
    // * *
    myLabel:
    for (int row = 1; row <= 3; row++) {
      System.out.println();
      for (int col = 1; col <= 5; col++) {
        System.out.print(" ");
        if (row == 3 && col == 3) {
          System.out.print(" ");
          break myLabel;
          // finish the inner and outer loop together
        }
        System.out.print("*");
      }
    }
  }

}
