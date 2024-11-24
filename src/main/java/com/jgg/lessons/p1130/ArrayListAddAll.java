package com.jgg.lessons.p1130;

import java.util.ArrayList;

public class ArrayListAddAll {

  public static void main(String[] args){

    ArrayList<String> colors1 = new ArrayList<>();
    colors1.add("Blue");
    colors1.add("Red");

    ArrayList<String> colors2 = new ArrayList<>();
    colors2.add("White");
    colors2.add("Red");

    // Add all <colors2> to <colors1>
    colors1.addAll(colors2);
    System.out.println(colors1); // [Blue, Red, White, Red]
    System.out.println(colors2); // [White, Red]

    // Add all <colors2> to <colors1> one more time
    colors1.addAll(colors2);
    System.out.println(colors1); // [Blue, Red, White, Red, White, Red]
    System.out.println(colors2); // [White, Red]


  }

}
