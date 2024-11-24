package com.jgg.homework.p0430;

public class NestedForLoop2Solution {

  public static void main(String[] args){
    
    // TASK: Print this pattern
    // 2
    // 2 4
    // 2 4 6
    // 2 4 6 8

    int rows = 4; // Number of rows in the pattern
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((2 * j) + " ");
      }
      System.out.println();
    }
  }

}
