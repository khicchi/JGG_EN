package com.jgg.homework.p1130;

import java.util.ArrayList;

public class ArrayListAddAllSolution {

  public static void main(String[] args){

    // TASK-1: Create an ArrayList of Integers with 3 elements : <list1>
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);

    // TASK-2: Create another ArrayList of Integers with 5 elements : <list2>
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(4);
    list2.add(5);
    list2.add(6);
    list2.add(7);
    list2.add(8);

    // TASK-3: Create a method which accepts two Integer ArrayList objects.
    //         This method should add the second parameters elements to the first parameter.
    //         Method should be void.
    //         Call the method with arguments: <list1> and <list2>.
    //         Print both lists.
    //         Explain why the <list1> is changed.
    mergeLists(list1, list2);
    System.out.println("list1: " + list1);
    System.out.println("list2: " + list2);

    // Explanation
    System.out.println("Explanation: list1 is changed because the method mergeLists modifies the original list1 by adding all elements of list2 to it.");

  }

  public static void mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    list1.addAll(list2);
  }

}
