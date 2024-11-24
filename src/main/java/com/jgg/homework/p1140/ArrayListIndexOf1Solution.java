package com.jgg.homework.p1140;

import java.util.ArrayList;

public class ArrayListIndexOf1Solution {

  public static void main(String[] args){

    ArrayList<Integer> base1 = new ArrayList<>();
    base1.add(3);
    base1.add(4);
    base1.add(6);
    base1.add(3);
    ArrayList<Integer> base2 = null;
    ArrayList<Integer> base3 = new ArrayList<>();

    int[] target1 = { 1,2,3,4,5,6 };
    int[] target2 = { 2,2,2 };
    int[] target3 = null;
    int[] target4 = new int[0];


    // TASK: Create a method which accepts an Integer ArrayList and an int array.
    //       Method should check the index of each array elements in the provided ArrayList parameter.
    //       Return the indexes of checked elements as Integer ArrayList and print.
    //       If one of the provided parameters is null, return null.
    //       If the ArrayList object parameter is empty return empty ArrayList.
    //       If the array parameter has no element return empty ArrayList.

    // Try your solution with those inputs
    // Sample Inputs            Expected Output
    // base1, target3           // null
    // base2, target1           // null
    // base1, target4           // []
    // base3, target2           // []
    // base1, target1           // [-1, -1, 0, 1, -1, 2]
    // base1, target2           // [-1, -1, -1]

    System.out.println(findIndexes(base1, target3)); // null
    System.out.println(findIndexes(base2, target1)); // null
    System.out.println(findIndexes(base1, target4)); // []
    System.out.println(findIndexes(base3, target2)); // []
    System.out.println(findIndexes(base1, target1)); // [-1, -1, 0, 1, -1, 2]
    System.out.println(findIndexes(base1, target2)); // [-1, -1, -1]
    
  }

  public static ArrayList<Integer> findIndexes(ArrayList<Integer> base, int[] target) {
    // Check if either base or target is null
    if (base == null || target == null) {
      return null;
    }

    // Check if either base or target is empty
    if (base.isEmpty() || target.length == 0) {
      return new ArrayList<>();
    }

    ArrayList<Integer> indexes = new ArrayList<>();

    // Iterate over the target array
    for (int num : target) {
      int index = base.indexOf(num);
      indexes.add(index);
    }

    return indexes;
  }

}
