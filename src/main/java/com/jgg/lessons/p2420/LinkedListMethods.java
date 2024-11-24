package com.jgg.lessons.p2420;

import java.util.LinkedList;

public class LinkedListMethods {

  public static void main(String[] args){

    LinkedList<String> list = new LinkedList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Lemon");
    System.out.println(list); // [Apple, Banana, Lemon]

    list.addFirst("First");
    System.out.println(list); // [First, Apple, Banana, Lemon]

    // removeLast() removes the last element and returns
    System.out.println(list.removeLast()); // Lemon
    System.out.println(list); // [First, Apple, Banana]

    // poll() removes the first element and returns
    System.out.println(list.poll()); // First
    System.out.println(list); // [Apple, Banana]

    // get() gets element by index
    System.out.println(list.get(1)); // Banana


  }
}
