package com.jgg.homework.p1170;

import java.util.ArrayList;

public class ArrayListRemoveAll {

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

  }

}
