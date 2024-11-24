package com.jgg.lessons.p2840;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

  public static void main(String[] args) {

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    // Print each element of a list

    // method reference is used
    names.forEach(System.out::println);  // Consumer<T>: Print each element

    // the same with above;
    names.forEach(item -> System.out.println(item));

    // the same with above with anonymous class
    names.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

  }

}
