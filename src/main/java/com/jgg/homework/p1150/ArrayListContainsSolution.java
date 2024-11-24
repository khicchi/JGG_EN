package com.jgg.homework.p1150;

import java.util.ArrayList;

public class ArrayListContainsSolution {

  public static void main(String[] args){

    // TASK-1: Create an ArrayList of String with those values;
    //         null, null, "C", "1", "Key"
    ArrayList<String> list = new ArrayList<>();
    list.add(null);
    list.add(null);
    list.add("C");
    list.add("1");
    list.add("Key");

    // TASK-2: Print the list
    System.out.println("List: " + list);

    // TASK-3: Check if your list contains null
    System.out.println("Contains null: " + list.contains(null));

    // TASK-4: Check if your list contains "1"
    System.out.println("Contains '1': " + list.contains("1"));

    // TASK-5: Check if your list contains "key"
    System.out.println("Contains 'key': " + list.contains("key"));

    // TASK-6: Check if your list contains "Key"
    System.out.println("Contains 'Key': " + list.contains("Key"));

  }

}
