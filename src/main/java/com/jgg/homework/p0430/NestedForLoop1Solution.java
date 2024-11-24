package com.jgg.homework.p0430;

public class NestedForLoop1Solution {

  public static void main(String[] args){

    // TASK: Print
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    for (int i = 1; i <= 5; i++) {
      // Print spaces
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      // Print stars
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      // Move to the next line
      System.out.println();
    }

  }

}
