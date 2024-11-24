package com.jgg.lessons.p1150;

import java.util.ArrayList;

public class ArrayListContains {

  public static void main(String[] args){

    ArrayList<Long> longs = new ArrayList<>();
    longs.add(3L);
    longs.add(2L);
    longs.add(30000L);
    longs.add(3L);

    // Check if <longs> contains '3'
    System.out.println(longs.contains(3)); // false
    // this is wrong. Use 3L or Long object

    // Check if <longs> contains '3' correctly
    System.out.println(longs.contains(3L)); // true
    System.out.println(longs.contains(Long.valueOf(3))); // true
    // both above way is the same

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(1);

    // Check if <integers> contains 1
    System.out.println(integers.contains(1)); // true

  }
}
