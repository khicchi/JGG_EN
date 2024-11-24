package com.jgg.homework.p1200;

import java.util.ArrayList;

public class ArrayListExamples2Solution {

  public static void main(String[] args){

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1); numbers.add(2); numbers.add(1); numbers.add(1); numbers.add(3); numbers.add(2);

    // TASK: Create a method which accepts an ArrayList of Integers and returns a new
    //       ArrayList with unique values of the provided list parameter.
    //       Use <numbers> as the argument.
    //       Expected result: [1, 2, 3]
    System.out.println(getUniqueValues(numbers));
    
  }

  public static ArrayList<Integer> getUniqueValues(ArrayList<Integer> list) {
    ArrayList<Integer> uniqueList = new ArrayList<>();

    // Iterate through the list
    for (Integer num : list) {
      // If the number is not already in uniqueList, add it
      if (!uniqueList.contains(num)) {
        uniqueList.add(num);
      }
    }

    return uniqueList;
  }

}
