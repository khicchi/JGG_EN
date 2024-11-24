package com.jgg.homework.p1040;

import java.util.Arrays;

public class VariableArguments2Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts variable char arguments
    //       and returns a char array of those args.

    char[] result1 = charsToArray('a', 'b', 'c', 'd');
    System.out.println(Arrays.toString(result1)); // [a, b, c, d]

    char[] result2 = charsToArray('1', '2', '3');
    System.out.println(Arrays.toString(result2)); // [1, 2, 3]

    char[] result3 = charsToArray('x', 'y');
    System.out.println(Arrays.toString(result3)); // [x, y]
  }

  // Method that accepts variable number of char arguments and returns a char array
  public static char[] charsToArray(char... chars) {
    // Return the provided char arguments as a char array
    return chars;
  }

}
