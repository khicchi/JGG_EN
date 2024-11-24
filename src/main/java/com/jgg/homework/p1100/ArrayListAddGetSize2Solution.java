package com.jgg.homework.p1100;

import java.util.ArrayList;

public class ArrayListAddGetSize2Solution {

  public static void main(String[] args){

    ArrayList<String> colors1 = new ArrayList<>();
    colors1.add("Blue");
    colors1.add("Red");

    ArrayList<String> colors2 = new ArrayList<>();
    colors2.add("White");
    colors2.add("Red");
    // TASK: Add all <colors2> to <colors1> and print <colors1>

    colors1.addAll(colors2);
    System.out.println("Combined ArrayList: " + colors1);
  }

}
