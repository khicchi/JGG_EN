package com.jgg.lessons.p2840;

import java.util.function.BiFunction;

public class BiFunctionExample {

  public static void main(String[] args) {

    // add 4 numbers
    BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

    int result = add.apply(5, 3);  // Output: 8
    System.out.println(result);

    // concat two strings, return the length
    BiFunction<String, String, Integer> concat = new BiFunction<String, String, Integer>() {
      @Override
      public Integer apply(String s, String s2) {
        return s.concat(s2).length();
      }
    };

    System.out.println(concat.apply("Jane", "Doe"));

  }
}
