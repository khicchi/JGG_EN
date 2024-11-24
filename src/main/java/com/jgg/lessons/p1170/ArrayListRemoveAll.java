package com.jgg.lessons.p1170;

import java.util.ArrayList;

public class ArrayListRemoveAll {

  public static void main(String[] args){

    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1); list1.add(1); list1.add(2); list1.add(3);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1);

    ArrayList<Integer> list3 = new ArrayList<>();
    list3.add(2); list3.add(3);

    // Remove all <list2> elements from <list1>
    list1.removeAll(list2);
    System.out.println("list1 = " + list1); // list1 = [2, 3]

    // Remove all <list3> elements from <list1>
    list1.removeAll(list3);
    System.out.println("list1 = " + list1); // []

    // Remove all <list3> elements from <list1>
    // Check if <list1> is changed
    System.out.println("list1.removeAll(list3) = " + list1.removeAll(list3));
    //false

  }

}
