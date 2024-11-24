package com.jgg.lessons.p2440;

import java.util.Stack;

public class StackMethods {

  public static void main(String[] args) {

    // Create Stack and add two elements
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    System.out.println("stack = " + stack);

    // Use pop() method to get and
    // remove the last added element
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack = " + stack);

    // Use push() to add new elements
    stack.push(3);
    System.out.println("stack = " + stack);

    // Use peek() method to get the last
    // added element without removing
    System.out.println("stack.peek() = " + stack.peek());
    System.out.println("stack = " + stack);

    // pop until stack is empty
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }

    System.out.println("stack = " + stack);

  }
}
