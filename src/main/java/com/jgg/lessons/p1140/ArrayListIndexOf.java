package com.jgg.lessons.p1140;

import java.util.ArrayList;

public class ArrayListIndexOf {

  public static void main(String[] args){

    ArrayList<Character> characters = new ArrayList<>();
    characters.add('A');
    characters.add('B');
    characters.add('C');
    characters.add('B');

    // Print the index of 'B'
    System.out.println(characters.indexOf('B')); // 1
    // Autoboxing performed implicitly while passing 'B' as argument
    // Because 'B' actually is a primitive char
    // But indexOf() method accepts object

    // Print the index of 'B' without Autoboxing
    System.out.println(characters.indexOf(Character.valueOf('B'))); // 1

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(3);

    // Print the index of 3
    System.out.println(nums.indexOf(3)); // 1

    // Print the index of 4
    System.out.println(nums.indexOf(4)); // -1

  }

}
