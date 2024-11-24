package com.jgg.lessons.p1180;

import java.util.ArrayList;

public class ArrayListEquals {

  public static void main(String[] args){

    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1); list1.add(2);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1); list2.add(2);

    ArrayList<Integer> list3 = new ArrayList<>();
    list3.add(2); list3.add(1);

    // Check if elements of <list1> equals to <list2>
    System.out.println("list1.equals(list2) = " + list1.equals(list2));
    // true

    // Check if <list1> and <list2> have the same references
    System.out.println("list1 == list2 = " + (list1 == list2));
    // false

    // Check if elements of <list2> equals to <list3>
    System.out.println("list2.equals(list3) = " + list2.equals(list3));
    // false => order is different



  }

}
