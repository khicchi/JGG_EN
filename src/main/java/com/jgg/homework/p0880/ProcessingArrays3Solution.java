package com.jgg.homework.p0880;

import java.util.Arrays;

public class ProcessingArrays3Solution {

  public static void main(String[] args){

    // TASK:   Declare a char array of size 6
    //         Assign 'c' to all elements in a loop
    char[] charArray = new char[6];
    for(int i = 0; i < charArray.length; i++) {
      charArray[i] = 'c';
    }
    System.out.println(Arrays.toString(charArray));
  }

}
