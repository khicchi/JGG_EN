package com.jgg.lessons.p2540;

import java.util.HashMap;

public class MapPutMethod {

  public static void main(String[] args){

    // Create an <Integer, String> HashMap and add one item
    HashMap<Integer, String> colors = new HashMap<>();
    colors.put(1, "Red");
    System.out.println(colors); // {1=Red}

    // Add another key-value pair
    colors.put(2, "Blue");
    System.out.println(colors); // {1=Red, 2=Blue}

    // Add an existing key
    String oldValue = colors.put(2, "Black");
    System.out.println(oldValue); // Blue
    System.out.println(colors); // {1=Red, 2=Black}

    // Create an <Integer, Character> HashMap
    // add some chars with their ascii value as key
    HashMap<Integer, Character> chars = new HashMap<>();
    chars.put((int)'a', 'a');
    chars.put((int)'b', 'b');
    chars.put((int)'c', 'c');
    System.out.println(chars); // {97=a, 98=b, 99=c}

  }
}
