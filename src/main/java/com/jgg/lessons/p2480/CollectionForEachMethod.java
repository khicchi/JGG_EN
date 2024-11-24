package com.jgg.lessons.p2480;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionForEachMethod {

  public static void main(String[] args){
    // Print all ArrayList items
    ArrayList<String> arrayList = CollectionsProvider.getArrayList();
    print(arrayList);

    // Print all LinkedList items
    LinkedList<String> linkedList = CollectionsProvider.getLinkedList();
    print(linkedList);

    // Print all Queue items
    Queue<String> queue = CollectionsProvider.getQueue();
    print(queue);

    // Print all TreeSet items
    Set<String> set = CollectionsProvider.getSet();
    print(set);
  }

  private static void print(Collection<String> collection) {
    collection.forEach(item -> System.out.println(item));
  }

}
