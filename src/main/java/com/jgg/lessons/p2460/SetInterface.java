package com.jgg.lessons.p2460;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

  public static void main(String[] args){

    // Create a Set and add items
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(1); // duplicate
    set.add(3);
    set.add(4);
    System.out.println(set);

    // no get() method, bec no index
    //set.get(0);

    // Print all items
    for (Integer element : set) {
      System.out.println(element);
    }


  }

}
