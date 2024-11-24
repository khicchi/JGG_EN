package com.jgg.homework.p0410;

public class ForLoopWithIf2Solution {

  public static void main(String[] args){

    // TASK: Print the reminder of all numbers between 4 and 91 (inclusive)
    // when divided by 7.
    // Print "even" if the reminder is even, otherwise print "odd" in the same line
    // Example: 5 odd

    for (int num = 4; num <= 91; num++) {
      int remainder = num % 7;
      String evenOrOdd = (remainder % 2 == 0) ? "even" : "odd";
      System.out.println(remainder + " " + evenOrOdd);
    }
  }

}
