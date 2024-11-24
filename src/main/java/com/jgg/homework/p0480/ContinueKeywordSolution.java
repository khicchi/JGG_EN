package com.jgg.homework.p0480;

public class ContinueKeywordSolution {

  public static void main(String[] args){

    int start = 100;
    int end = 60;

    // TASK: Print all numbers which is divisible by 7 from <start> to <end> (exclusive)
    // using continue keyword

    for (int num = start - 1; num > end; num--) { // Loop from start-1 down to end+1
      if (num % 7 != 0) {
        continue; // Skip the rest of the loop body if num is not divisible by 7
      }
      System.out.println(num);
    }
  }

}
