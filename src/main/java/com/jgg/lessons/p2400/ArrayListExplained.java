package com.jgg.lessons.p2400;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExplained {

  public static void main(String[] args){

    List<String> list1 = new ArrayList<>();
    list1.add("apple");
    list1.add("lemon");

    List<String> list2 = new ArrayList<>();
    list2.add("apple");

    // addAll() method of List interface
    list1.addAll(1, list2);

    System.out.println(list1);
    // [apple, apple, lemon]

  }

}
