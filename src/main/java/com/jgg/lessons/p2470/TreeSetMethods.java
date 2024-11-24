package com.jgg.lessons.p2470;

import java.util.TreeSet;

public class TreeSetMethods {

  public static void main(String[] args){

    // Create an Integer TreeSet and add items
    TreeSet<Integer> set = new TreeSet<>();
    set.add(4);
    set.add(2);
    set.add(5);
    System.out.println("set = " + set);

    System.out.println("set.pollFirst() = " + set.pollFirst());
    System.out.println("set = " + set);

    System.out.println("set.pollLast() = " + set.pollLast());
    System.out.println("set = " + set);

    set.add(4);
    System.out.println("set = " + set);

  }
}
