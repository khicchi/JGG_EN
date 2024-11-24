package com.jgg.homework.p0440;

public class WhileLoop2Solution {

  public static void main(String[] args){

    // TASK: Print using nested while loops
    // *
    // **
    // ***
    // ****
    int row = 1; // row counter

    // Outer loop for rows
    while (row <= 4) {
      int col = 1; // column counter

      // Inner loop for columns
      while (col <= row) {
        System.out.print("*");
        col++; // Increment column counter
      }

      System.out.println(); // Move to the next line after printing each row
      row++; // Move to the next row
    }

  }

}
