package com.jgg.homework.p0440;

public class WhileLoop1Solution {

  public static void main(String[] args){

    // TASK: Print even numbers between [3-13] using while loop
    int number = 3;
    while (number < 14) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
      number++;
    }

  }

}
