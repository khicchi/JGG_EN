package com.jgg.lessons.p2840;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

  public static void main(String[] args) {

    List<String> words = Arrays.asList("Java", "Stream", "API");

    // print length of the items
    List<Integer> lengths = words.stream()
        .map(String::length)  // Function<T, R>: String -> Integer
        .collect(Collectors.toList());
    System.out.println(lengths);  // Output: [4, 6, 3]

    // lambda expression is used for Function interface above
    // the same with anonymous class below;
    lengths = words.stream()
        .map(new Function<String, Integer>() {
          @Override
          public Integer apply(String s) {
            return s.length();
          }
        })
        .collect(Collectors.toList());
    System.out.println(lengths);  // Output: [4, 6, 3]

  }

}
