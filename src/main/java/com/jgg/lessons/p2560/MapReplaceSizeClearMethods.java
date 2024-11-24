package com.jgg.lessons.p2560;

import java.util.HashMap;
import java.util.Map;

public class MapReplaceSizeClearMethods {

  public static void main(String[] args){

    // Create an exam map with grades as key and
    // the student counts as values
    Map<Character, Integer> grades = new HashMap<>();
    grades.put('A',  3);
    grades.put('B',  13);
    grades.put('C',  23);
    grades.put('D',  33);
    System.out.println(grades); // {A=3, B=13, C=23, D=33}

    // Update 'D' value as 43
    grades.replace('D',  43);
    System.out.println(grades); // {A=3, B=13, C=23, D=43}

    // Update 'E' value as 53
    System.out.println(grades.replace('E', 2)); // null

    // Get the size of the map
    System.out.println(grades.size()); // 4

    // Clear the map
    grades.clear();
    System.out.println(grades); // {}

  }
}
