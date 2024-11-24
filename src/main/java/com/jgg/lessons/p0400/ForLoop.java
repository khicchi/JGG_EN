package com.jgg.lessons.p0400;

public class ForLoop {

  public static void main(String[] args){
    // Loop numbers 1 to 10 (inclusive) and print each
    for(int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // loop numbers 0 to 9 (inclusive) and print the <counter * 10> for each iteration
    for(int i = 0; i < 10; i++) {
      System.out.println(i * 10);
    }

    // create an infinite for loop
    /*for(int i = 0; i < 1; i++) {
      System.out.println("is this infinite?");
      i--;
    }*/

    // print number 5 to 1 (inclusive) within a for loop
    for(int i = 5; i >= 1 ; i--) {
      System.out.println(i);
    }

    // Given that decimal value of A is 65, and decimal value of Z is 90
    // print all capital letters A to Z in one line
    for(int i = 65; i <= 90; i++) {
      System.out.print((char) i);
    }

    // Print all even numbers 2 to 29 (inclusive) using for loop
    System.out.println();
    for(int even = 2; even < 30; even = even + 2) {
      System.out.println(even);
    }
  }

}
