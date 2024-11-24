package com.jgg.homework.p1170;

import java.util.ArrayList;

public class ArrayListRemoveAllSolution {

  public static void main(String[] args){

    ArrayList<Double> doubles1 = null;
    ArrayList<Double> doubles2 = new ArrayList<>();
    doubles2.add(2.1); doubles2.add(2.2); doubles2.add(2.1);

    // TASK: Create a method which accepts an ArrayList of Double parameter
    //       and a primitive double parameter.
    //       This method should remove all occurrences of the provided double parameter
    //       And returns true if there is a removal happened, otherwise false.
    //       Return null if ArrayList parameter is null.
    //       Hint: use removeAll() method of ArrayList class in your method
    
    // Try your solution with those inputs
    // Sample Inputs            Expected Output
    // doubles1, 2.1            null
    // doubles2, 2.1            true
    // doubles2, 2              false

    System.out.println(removeAllOccurrences(doubles1, 2.1)); // null
    System.out.println(removeAllOccurrences(doubles2, 2.1)); // true
    System.out.println("doubles2 = " + doubles2); // doubles2 = [2.2]
    System.out.println(removeAllOccurrences(doubles2, 2));   // false
    System.out.println("doubles2 = " + doubles2); // doubles2 = [2.2]

  }

  public static Boolean removeAllOccurrences(ArrayList<Double> list, double value) {
    // Check if the ArrayList parameter is null
    if (list == null) {
      return null;
    }

    // Convert the double value to Double object
    ArrayList<Double> toBeRemoved = new ArrayList<>();
    toBeRemoved.add(value);

    // Remove all occurrences of the provided double parameter
    // Using the removeAll() method of ArrayList class
    return list.removeAll(toBeRemoved);
  }

}
