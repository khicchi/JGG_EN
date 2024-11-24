package com.jgg.lessons.p2480;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionForLoop {

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
    List<String> list = new ArrayList<>(collection);

    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

}
