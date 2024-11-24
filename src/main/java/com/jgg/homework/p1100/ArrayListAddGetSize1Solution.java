package com.jgg.homework.p1100;

import java.util.ArrayList;

public class ArrayListAddGetSize1Solution {

  public static void main(String[] args){

    // TASK-1: Create a String ArrayList and add elements
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Gray");
    colors.add("Dark");
    colors.add("White");

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Print the ArrayList
    System.out.println("ArrayList: " + colors);

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Print the size
    System.out.println("Size: " + colors.size());

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Print the element at index 1
    System.out.println("Element at index 1: " + colors.get(1));

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Print the last element by providing the index
    System.out.println("Last element: " + colors.get(colors.size() - 1));

    System.out.println("************************** TASK 5 FINISHED **************************");

  }

}
