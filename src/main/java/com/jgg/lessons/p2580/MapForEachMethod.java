package com.jgg.lessons.p2580;

import java.util.HashMap;
import java.util.Map;

public class MapForEachMethod {

  public static void main(String[] args){

    // Create an <Integer, Integer> map
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 1);
    map.put(2, 2);
    map.put(3, 2);
    map.put(4, 1);
    System.out.println(map); // {1=1, 2=2, 3=2, 4=1}

    // Print all key-value pairs in new lines
    map.forEach((k, v) -> System.out.println(k + " => " + v));

    // Update all values by increasing 1
    map.forEach((k, v) -> map.put(k, v + 1));
    System.out.println(map);

  }
}
