package com.jgg.lessons.p1110;

import java.util.ArrayList;

public class ArrayListAddToIndexClearIsEmpty {

  public static void main(String[] args){

    // Create an Integer list
    ArrayList<Integer> integers = new ArrayList<>();

    // Check if <integers> is empty
    System.out.println(integers.isEmpty()); // true

    // Add 3 to <integers>
    integers.add(3);
    System.out.println(integers); // [3]

    // Add 5 to <integers> at index 0
    integers.add(0, 5);
    System.out.println(integers); // [5, 3]

    // Check if <integers> is empty
    System.out.println(integers.isEmpty()); // false

    // Clear <integers>
    integers.clear();
    System.out.println(integers); // []

    // Check if <integers> is empty
    System.out.println(integers.isEmpty()); // true

  }

}
