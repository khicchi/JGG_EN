package com.jgg.lessons.p0450;

public class WhileLoopVsForLoop {

  public static void main(String[] args){

    // Calculate the sum of the first
    // n positive integers
    // While-loop solution
    int n = 5, sum = 0, counter = 1;
    while (counter <= n) {
      sum += counter;
      counter++;
    }
    System.out.println(sum);

    // For-loop solution
    n = 5; sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);

  }

}
