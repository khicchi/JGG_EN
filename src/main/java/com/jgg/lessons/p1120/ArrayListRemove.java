package com.jgg.lessons.p1120;

import java.util.ArrayList;

public class ArrayListRemove {

  public static void main(String[] args){

    // Create an ArrayList object with values: 3, 4, 5
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(3); integers.add(4); integers.add(5);
    System.out.println(integers); // [3, 4, 5]

    // Remove 4 from <integers>
    //integers.remove(4);
    // throws IndexOutOfBoundsException
    // Detail: Index 4 out of bounds for length 3

    // Remove 4 from <integers> correctly
    integers.remove(Integer.valueOf(4));
    System.out.println(integers); // [3, 5]

    // Remove element at index 0
    integers.remove(0);
    System.out.println(integers); // [5]

    ArrayList<Character> characters = new ArrayList<>();
    characters.add('B'); characters.add('B');

    // Remove 'B' from <characters>
    // characters.remove('B');
    // throws IndexOutOfBoundsException
    // Index 66 out of bounds for length 2

    // Remove 'B' from <characters> correctly
    characters.remove(Character.valueOf('B'));
    System.out.println(characters); // [B]


  }
}
