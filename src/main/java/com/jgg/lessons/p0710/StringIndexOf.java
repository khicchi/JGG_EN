package com.jgg.lessons.p0710;

public class StringIndexOf {

  public static void main(String[] args){

    String source = "Consequence";

    // Find the index of "c"
    System.out.println(source.indexOf("c")); // 9

    // Find the index of "C"
    System.out.println(source.indexOf("C")); // 0

    // Print decimal value of "e"
    int decimalE = 'e';
    System.out.println(decimalE); // 101

    // Print the first index of "e"
    int firstIndexOfE = source.indexOf(decimalE);
    System.out.println("firstIndexOfE = " + firstIndexOfE); // 4

    // Print the second index of "e"
    int secondIndexOfE = source.indexOf("e", firstIndexOfE + 1);
    System.out.println("secondIndexOfE = " + secondIndexOfE); // 7

    // Print the index of "Q"
    System.out.println("source.indexOf('Q') = " + source.indexOf('Q')); // -1
  }
}
