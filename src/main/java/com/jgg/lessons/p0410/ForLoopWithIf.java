package com.jgg.lessons.p0410;

public class ForLoopWithIf {

  public static void main(String[] args){
    // Write all numbers 6 to 45 (inclusive), which can be divisible by 3 and 4
    // without reminder, in a single line separated by space
    for(int i = 6; i < 46; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    // Print the sum of even numbers and the sum of odd numbers from 0 to 100 (inclusive)
    int evenSum = 0, oddSum = 0;
    for(int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        evenSum = evenSum + i; // alternatively => evenSum += i;
      }
      else {
        oddSum = oddSum + i; // alternatively => oddSum += i;
      }
    }
    System.out.println("evenSum = " + evenSum);
    System.out.println("oddSum = " + oddSum);
  }

}
