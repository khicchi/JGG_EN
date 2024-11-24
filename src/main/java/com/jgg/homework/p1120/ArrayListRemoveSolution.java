package com.jgg.homework.p1120;

import java.util.ArrayList;

public class ArrayListRemoveSolution {

  public static void main(String[] args){

    // TASK-1: Create a method which accepts a String parameter
    //         and returns a Character ArrayList object which contains
    //         all the characters of the provided String parameter as elements

    // TASK-2: Call your method with this String => "hello"
    ArrayList<Character> charList = stringToCharacterArrayList("hello");

    // TASK-3: Print the returned list
    System.out.println("Original list: " + charList);

    // TASK-4: Remove the character 'l'
    charList.remove((Character) 'l');

    // TASK-5: Print the returned list
    System.out.println("List after removing 'l': " + charList);

    // TASK-6: Remove the character 'l'
    charList.remove((Character) 'l');

    // TASK-7: Print the list
    System.out.println("List after removing 'l' again: " + charList);

    // TASK-8: Remove the element at index 1
    if (charList.size() > 1) {
      charList.remove(1);
    }

    // TASK-9: Remove the element at index 0
    if (!charList.isEmpty()) {
      charList.remove(0);
    }

    // TASK-10: Print the list
    System.out.println("List after removing elements at index 1 and 0: " + charList);

  }

  public static ArrayList<Character> stringToCharacterArrayList(String str) {
    ArrayList<Character> charList = new ArrayList<>();
    if (str != null) {
      for (char c : str.toCharArray()) {
        charList.add(c);
      }
    }
    return charList;
  }

}
