package com.jgg.lessons.p1100;

import java.util.ArrayList;

public class ArrayListAddGetSize {

  public static void main(String[] args){

    // Create an ArrayList of Integers
    ArrayList<Integer> numbers = new ArrayList<>();

    // Print <numbers>
    System.out.println(numbers); // []

    // Print the size of the <numbers>
    System.out.println(numbers.size()); // 0

    // Add 3 to <numbers>
    numbers.add(3); // Autoboxing happens here bec 3 is primitive
    System.out.println("numbers = " + numbers); // [3]
    System.out.println("numbers.size() = " + numbers.size()); // 1

    // Get the element at index 0 from <numbers>
    int elem0 = numbers.get(0);
    System.out.println("elem0 = " + elem0); // 3

    // Add 5 to <numbers>
    numbers.add(5);
    System.out.println("numbers = " + numbers); // [3, 5]
    System.out.println("numbers.size() = " + numbers.size()); // 2

    // Get the element at index 0 from <numbers>
    elem0 = numbers.get(0);
    System.out.println("elem0 = " + elem0); // 3


  }
}
