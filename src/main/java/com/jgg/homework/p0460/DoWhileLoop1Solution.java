package com.jgg.homework.p0460;

public class DoWhileLoop1Solution {

  public static void main(String[] args){

    // TASK: Print even numbers between 3 and 27 (inclusive)
    // using do-while loop

    int num = 3; // Start from the first number in the range

    do {
      if (num % 2 == 0) {
        System.out.println(num);
      }
      num++; // Increment the number
    } while (num <= 27); // Continue until the number exceeds 27
  }

}
