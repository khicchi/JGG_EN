package com.jgg.homework.p0850;

public class AccessItemsInArraySolution {

  public static void main(String[] args){

    // TASK-1: Initialize a boolean array with values; true, false, true
    boolean[] booleanArray = {true, false, true};

    // TASK-2: Print the first and the last elements of the array above
    System.out.println("First element: " + booleanArray[0]);
    System.out.println("Last element: " + booleanArray[booleanArray.length - 1]);

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Initialize a double array with values; 3.4, 4.5, 5.6, 6.7
    double[] doubleArray = {3.4, 4.5, 5.6, 6.7};

    // TASK-4: Print each value of the double array above
    for (double value : doubleArray) {
      System.out.println(value);
    }

    System.out.println("************************** TASK 4 FINISHED **************************");

  }

}
