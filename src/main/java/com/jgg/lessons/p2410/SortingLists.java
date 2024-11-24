package com.jgg.lessons.p2410;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingLists {

  public static void main(String[] args){

    List<String> arrayList = new ArrayList<>();
    arrayList.add("Lemon");
    arrayList.add("Banana");
    arrayList.add("Apple");
    System.out.println(arrayList); // [Lemon, Banana, Apple]

    // Sorting String List
    Collections.sort(arrayList);
    System.out.println(arrayList); // [Apple, Banana, Lemon]

    List<Integer> linkedList = new LinkedList<>();
    linkedList.add(9);
    linkedList.add(5);
    System.out.println(linkedList); // [9, 5]

    // Sorting Integer List
    Collections.sort(linkedList);
    System.out.println(linkedList); // [5, 9]

  }
}
