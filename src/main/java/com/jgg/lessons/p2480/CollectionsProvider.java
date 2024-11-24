package com.jgg.lessons.p2480;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

  public class CollectionsProvider {

    public static ArrayList<String> getArrayList() {
      ArrayList<String> list = new ArrayList<>();
      populate(list);
      return list;
    }

    public static LinkedList<String> getLinkedList() {
      LinkedList<String> list = new LinkedList<>();
      populate(list);
      return list;
    }

    public static Queue<String> getQueue() {
      LinkedList<String> queue = new LinkedList<>();
      populate(queue);
      return queue;
    }

    public static Set<String> getSet() {
      Set<String> queue = new TreeSet<>();
      populate(queue);
      return queue;
    }

    private static void populate(Collection<String> collection) {
      collection.add("Apple"); collection.add("Banana"); collection.add("Cherry");
    }
  }
