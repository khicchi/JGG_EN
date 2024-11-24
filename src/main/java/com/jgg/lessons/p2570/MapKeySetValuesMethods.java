package com.jgg.lessons.p2570;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetValuesMethods {

  public static void main(String[] args){

    // Create an <Integer, Integer> map
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 1);
    map.put(2, 2);
    map.put(3, 2);
    map.put(4, 1);
    System.out.println(map); // {1=1, 2=2, 3=2, 4=1}

    // Print the keys
    Set<Integer> keys = map.keySet();
    System.out.println(keys); // [1, 2, 3, 4]

    // Print the values
    Collection<Integer> values = map.values();
    System.out.println(values); // [1, 2, 2, 1]

    // Update all values to 0
    for (Integer key: map.keySet())  {
      map.replace(key, 0);
    }
    System.out.println(map); // {1=0, 2=0, 3=0, 4=0}

  }
}
