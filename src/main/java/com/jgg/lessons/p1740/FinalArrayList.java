package com.jgg.lessons.p1740;

import java.util.ArrayList;

public class FinalArrayList {

  public static void main(String[] args){

    final ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(2);
    list1.add(0, 3);
    list1.remove(Integer.valueOf(3));

    // list1 = new ArrayList<>(); // not doable

    ArrayList<Integer> list2 = new ArrayList<>();
    // list1 = list2; // not doable
    list2 = list1; // doable

  }

}
