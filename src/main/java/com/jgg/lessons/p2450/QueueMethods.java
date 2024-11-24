package com.jgg.lessons.p2450;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {

  public static void main(String[] args){

    // Create Queue and add items
    Queue<Integer> queue = new PriorityQueue<>();
    queue.add(1);
    queue.add(2);
    System.out.println("queue = " + queue);

    // Use peek() to get first item without removing
    System.out.println("queue.peek() = " + queue.peek());
    System.out.println("queue = " + queue);

    // Use poll() to get and remove first item
    System.out.println("queue.poll() = " + queue.poll());
    System.out.println("queue = " + queue);

    // Use add() to add item to the end
    queue.add(3);
    System.out.println("queue = " + queue);

    // Remove all items
    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }
    System.out.println("queue = " + queue);


  }
}
