package com.jgg.lessons.p0480;

public class ContinueKeyword {

  public static void main(String[] args){

    // Print all odd numbers between [13-21]
    for(int i = 13; i <= 21; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // Print all numbers between [1-20]
    // Skip numbers divisible by both 2 and 3
    for (int i = 1; i <= 20; i++) {
      // Skip numbers divisible by both 2 and 3
      if (i % 2 == 0 && i % 3 == 0) {
        continue;
      }
      System.out.println(i);
    }
  }

}
