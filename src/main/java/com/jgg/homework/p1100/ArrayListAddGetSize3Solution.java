package com.jgg.homework.p1100;

import java.util.ArrayList;

public class ArrayListAddGetSize3Solution {

  public static void main(String[] args){

    int[] intArr = { 3, 6, 8 };
    // TASK: Create a method which accepts an int array
    //       and returns an Integer ArrayList with the same elements
    //       of the provided int array parameter.
    //       Use <intArr> as argument to pass your method.
    //       Print the returned Integer ArrayList.

    ArrayList<Integer> integerList = convertToIntegerArrayList(intArr);
    System.out.println(integerList);

  }

  // Method to convert int array to ArrayList<Integer>
  public static ArrayList<Integer> convertToIntegerArrayList(int[] intArray) {
    ArrayList<Integer> integerList = new ArrayList<>();

    if (intArray != null) {
      for (int num : intArray) {
        integerList.add(num); // Autoboxing occurs here
      }
    }

    return integerList;
  }

}
