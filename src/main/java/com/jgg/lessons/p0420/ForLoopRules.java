package com.jgg.lessons.p0420;

public class ForLoopRules {

  public static void main(String[] args){
    // loop through 10 to 5 (inclusive)
    // and loop through 15 to 20 (inclusive) in the same for-loop
    // print the summation of each values while looping
    for (int i = 10, j = 15; i >= 5 && j <= 20; i--, j++) {
      System.out.println("i: " + i + " j: " + j + " sum: " + (i + j));
    }

    int a = 10;
    // Re-assign <a> in the for loop as 5 and loop through 10;
    for(a = 5; a < 10; a++) {
      System.out.println(a);
    }

    // Init <long> and <int> counters in the same for-loop
    /*for(int i = 0, long b =0 ; i < 10 ; i++) {
      // compiler error - not doable
    }*/

    // Use the loop variables outside the loop
    for(int k = 0; k < 10; k++) {

    }
    //System.out.println(k); // not doable - k is accessible only inside the loop
  }


}
