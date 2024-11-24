package com.jgg.lessons.p1280;

import java.util.Arrays;

public class StaticMethod1 {

  public static void main(String[] args){

    int[] sampleArr = new int[1];

    // some static methods of Arrays class
    Arrays.toString(sampleArr);
    Arrays.sort(sampleArr);

    // valueOf static method of Integer class
    int i = Integer.valueOf("1");

    // valueOf static method of String class
    String s = String.valueOf(i);

    // max method of Math class
    Math.max(i, i);

  }

}


