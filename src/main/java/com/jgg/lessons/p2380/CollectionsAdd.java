package com.jgg.lessons.p2380;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class CollectionsAdd {

  public static void main(String[] args){

    Collection<String> arrayList = new ArrayList<>();
    arrayList.add("apple"); arrayList.add("lime");
    System.out.println(arrayList); // [apple, lime]

    Collection<String> linkedList = new LinkedList<>();
    linkedList.add("apple"); linkedList.add("lime");
    System.out.println(linkedList); // [apple, lime]

    Collection<String> hashSet = new HashSet<>();
    hashSet.add("apple"); hashSet.add("lime");
    System.out.println(hashSet); // [apple, lime]

    Collection<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("apple"); linkedHashSet.add("lime");
    System.out.println(linkedHashSet); // [apple, lime]

    Collection<String> treeSet = new TreeSet<>();
    treeSet.add("apple"); treeSet.add("lime");
    System.out.println(treeSet); // [apple, lime]

    Collection<String> priorityQueue = new PriorityQueue<>();
    priorityQueue.add("apple"); priorityQueue.add("lime");
    System.out.println(priorityQueue); // [apple, lime]

    Collection<String> arrayDeque = new ArrayDeque<>();
    arrayDeque.add("apple"); arrayDeque.add("lime");
    System.out.println(arrayDeque); // [apple, lime]

  }

}
