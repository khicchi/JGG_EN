package com.jgg.lessons.p2390;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListInterface {

  public static void main(String[] args){

    // ArrayList object
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("ArrayList");
    System.out.println(arrayList); // [ArrayList]

    // Polymorphic ArrayList object
    List<String> list = new ArrayList<>();
    list.add("List");
    list.add("apple");
    list.add("List");
    System.out.println(list); // [List, apple, List]

    // Polymorphic LinkedList object
    List<String> linkedList = new LinkedList<>();
    linkedList.add("LinkedList");
    System.out.println(linkedList); // [LinkedList]

    // Polymorphic Stack object
    List<String> stack = new Stack<>();
    stack.add("Stack");
    System.out.println(stack); // [Stack]

  }

}
