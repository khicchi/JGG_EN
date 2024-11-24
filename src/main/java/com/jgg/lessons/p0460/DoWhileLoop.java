package com.jgg.lessons.p0460;

public class DoWhileLoop {

  public static void main(String[] args) {

    // Print numbers from 1 to 5 using a do-while loop
    int i = 1;
    do {
      System.out.println(i);
      i++;
    } while (i <= 5);
    System.out.println("Loop ends");

    // Calculate the sum of the numbers from 21 to 18 (inclusive)
    int x = 21, minNumber= 18, sum = 0;
    do {
      sum += x;
      x--;
    } while (x >= minNumber);

    System.out.println("Summation: " + sum);
  }

}
