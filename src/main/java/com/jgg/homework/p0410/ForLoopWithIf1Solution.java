package com.jgg.homework.p0410;

public class ForLoopWithIf1Solution {

  public static void main(String[] args){

    // TASK: Sum all weird numbers between 3-125 (inclusive)
    // Weird number is a number that is divisible by 2, 3 and 7
    // without reminder
    // Print the result if any weird number is found in the given range,
    // Otherwise print "There is no weird number in the range"
    // Try with this range as well: 3-11 (inclusive)

    int start = 3, end = 125;
    int sum = 0;
    boolean found = false;

    for (int i = start; i <= end; i++) {
      if (i % 2 == 0 && i % 3 == 0 && i % 7 == 0) {
        sum += i;
        found = true;
      }
    }

    System.out.println(found ? sum : "There is no weird number in the range");

    // for the range [3-125] it should print 126
    // for the range [3-11] it should print "There is no weird number in the range"
  }

}
