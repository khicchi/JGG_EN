package com.jgg.homework.p0680;

public class StringCharAt1Solution {

  public static void main(String[] args){

    // TASK-1: Sum the decimal value of the characters in "Jane"
    String name = "Jane";
    int sum = 0;

    // Iterate over each character and sum their ASCII values
    for (char ch : name.toCharArray()) {
      sum += (int) ch;
    }

    System.out.println("Sum of decimal values of characters in \"" + name + "\": " + sum);
    // For "Jane": J=74, a=97, n=110, e=101 -> Total: 382

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Try to write a code that throws StringIndexOutOfBoundsException
    String text = "Hello";
    // char charAtInvalidIndex = text.charAt(10); // Index 10 is out of bounds for a string of length 5

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

}
