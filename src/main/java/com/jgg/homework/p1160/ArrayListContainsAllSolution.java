package com.jgg.homework.p1160;

import java.util.ArrayList;

public class ArrayListContainsAllSolution {

  public static void main(String[] args){

    // TASK-1: Create an ArrayList of Integer with those values:
    //         null, 2, null, 1, 0, null : <list1>
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(null);
    list1.add(2);
    list1.add(null);
    list1.add(1);
    list1.add(0);
    list1.add(null);

    // TASK-2: Create an ArrayList of Integer with those values:
    //         null, null, null : <list2>
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(null);
    list2.add(null);
    list2.add(null);

    // TASK-3: Create an ArrayList of Integer with those values: 0 : <list3>
    ArrayList<Integer> list3 = new ArrayList<>();
    list3.add(0);

    // TASK-4: Check if <list1> contains all elements of <list2>
    boolean containsAllList2 = list1.containsAll(list2);
    System.out.println("List1 contains all elements of List2: " + containsAllList2);

    // TASK-5: Check if <list1> contains all elements of <list3>
    boolean containsAllList3 = list1.containsAll(list3);
    System.out.println("List1 contains all elements of List3: " + containsAllList3);

    // TASK-6: Check if <list2> contains all elements of <list3>
    boolean containsAllList3InList2 = list2.containsAll(list3);
    System.out.println("List2 contains all elements of List3: " + containsAllList3InList2);

  }

}
