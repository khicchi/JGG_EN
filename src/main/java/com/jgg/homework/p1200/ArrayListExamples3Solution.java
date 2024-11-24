package com.jgg.homework.p1200;

import java.util.ArrayList;

public class ArrayListExamples3Solution {

  public static void main(String[] args){

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1); numbers.add(2); numbers.add(1); numbers.add(1); numbers.add(3); numbers.add(2);

    // TASK:   Create a method which accepts an ArrayList of Integers and returns a new ArrayList.
    //         This method should have null element for the repeated elements.
    //         Use <numbers> as the argument.
    //         Expected result: [1, 2, null, null, 3, null]
    System.out.println(updateRepeatedElements(numbers));

  }

  public static ArrayList<Integer> updateRepeatedElements(ArrayList<Integer> list) {
    ArrayList<Integer> updatedList = new ArrayList<>();

    // Iterate through the list
    for (Integer num : list) {
      // If the number is already in updatedList, add null
      if (updatedList.contains(num)) {
        updatedList.add(null);
      } else {
        updatedList.add(num);
      }
    }

    return updatedList;
  }

}
