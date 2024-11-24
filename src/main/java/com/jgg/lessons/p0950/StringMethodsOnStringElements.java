package com.jgg.lessons.p0950;

import java.util.Arrays;

public class StringMethodsOnStringElements {

  public static void main(String[] args){

    String[] names = { "Jane", "Robert", "Michael" };

    // Print the first characters of each name
    for (String name: names) {
      System.out.println(name.charAt(0));
    }

    // Print the last characters of each name
    for(int i = 0; i < names.length; i++) {
      int nameLength = names[i].length();
      String lastChar = names[i].substring(nameLength - 1);
      System.out.println(lastChar);
    }

    // Update all elements with their uppercase
    for(int i = 0; i < names.length; i++) {
      names[i] = names[i].toUpperCase();
    }
    System.out.println(Arrays.toString(names));

  }

}
