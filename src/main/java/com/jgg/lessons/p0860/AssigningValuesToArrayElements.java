package com.jgg.lessons.p0860;

import java.util.Arrays;

public class AssigningValuesToArrayElements {

  public static void main(String[] args){

    // Declare an array of 'C', 'E', 'c', 'D' and print elements
    char[] charArr = { 'C', 'E', 'c', 'D' };
    System.out.println("charArr = " + Arrays.toString(charArr));
    // [C, E, c, D]

    // Assign 'Q' to the second element and print all elements
    charArr[1] = 'Q';
    System.out.println("charArr = " + Arrays.toString(charArr));
    // [C, Q, c, D]

    // Assign second element value to first element and print
    charArr[0] = charArr[1];
    System.out.println("charArr = " + Arrays.toString(charArr));
    // [Q, Q, c, D]

    // Declare an int array of size 3 and print
    int[] intArr = new int[3];
    System.out.println("Arrays.toString(intArr) = " +
        Arrays.toString(intArr)); // [0, 0, 0]

    // Assign 3, 4, 9 to the array elements above and print
    intArr[0] = 3; intArr[1] = 4; intArr[2] = 9;
    System.out.println("Arrays.toString(intArr) = " +
        Arrays.toString(intArr)); // [3, 4, 9]


  }

}
