package com.jgg.homework.p1110;

import java.util.ArrayList;

public class ArrayListAddToIndexClearIsEmptySolution {

  public static void main(String[] args){

    // TASK-1: Create an ArrayList of Characters with those values:
    //         'C', 'j', '2', '*', '.'
    ArrayList<Character> charList = new ArrayList<>();
    charList.add('C');
    charList.add('j');
    charList.add('2');
    charList.add('*');
    charList.add('.');

    // TASK-2: Print the elements
    System.out.println("Elements: " + charList);

    // TASK-3: Print the elements in separate lines
    System.out.println("Elements in separate lines:");
    for (Character ch : charList) {
      System.out.println(ch);
    }

    // TASK-4: Print whether your list is empty or not
    System.out.println("Is the list empty? " + charList.isEmpty());

    // TASK-5: Insert 'k' to the end of the list
    charList.add('k');

    // TASK-6: Print the elements
    System.out.println("Elements after adding 'k': " + charList);

    // TASK-7: Insert 'z' at index 1
    charList.add(1, 'z');

    // TASK-8: Print the elements
    System.out.println("Elements after inserting 'z' at index 1: " + charList);

    // TASK-9: Clear the list
    charList.clear();

    // TASK-10: Print the elements
    System.out.println("Elements after clearing: " + charList);

    // TASK-11: Print whether your list is empty or not
    System.out.println("Is the list empty after clearing? " + charList.isEmpty());

  }

}
