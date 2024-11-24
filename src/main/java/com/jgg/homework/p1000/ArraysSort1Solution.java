package com.jgg.homework.p1000;

import java.util.Arrays;

public class ArraysSort1Solution {

  public static void main(String[] args){

    char[] chars1 = { 'c', 'v', 'D' };
    char[] chars2 = { 'c', 'v', 'D' };

    // TASK-1: Check if char arrays equal without using Arrays.equals() method
    boolean areEqual = true;

    // Check if lengths are the same
    if (chars1.length != chars2.length) {
      areEqual = false;
    } else {
      // Check each element
      for (int i = 0; i < chars1.length; i++) {
        if (chars1[i] != chars2[i]) {
          areEqual = false;
          break;
        }
      }
    }

    System.out.println(areEqual); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Check if char arrays equal using Arrays.equals() method
    boolean areEqualUsingArrays = Arrays.equals(chars1, chars2);
    System.out.println(areEqualUsingArrays); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

}
