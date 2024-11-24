package com.jgg.lessons.p1010;

import java.util.Arrays;

public class ArraysBinarySearch {

  public static void main(String[] args){

    int[] numbers = {1, 3, 5, 7, 9, 11, 13};

    // Search for the value 7 in the <numbers> array
    int index = Arrays.binarySearch(numbers, 7);
    System.out.println(index); // 3

    // Search for the value 4 in the <numbers> array
    index = Arrays.binarySearch(numbers, 4);
    System.out.println(index); // -3

    String[] colors = { "Red", "Blue", "Cyan", "Green", "Gray" };
    // Search for the value "Red" in <colors> array
    index = Arrays.binarySearch(colors, "Red");
    System.out.println(index); // -6

    // Sort the <colors> and then search
    Arrays.sort(colors);
    index = Arrays.binarySearch(colors, "Red");
    System.out.println(Arrays.toString(colors));
    // [Blue, Cyan, Gray, Green, Red]
    System.out.println(index); // 4

  }

}
