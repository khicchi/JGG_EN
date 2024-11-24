package com.jgg.lessons.p2840;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    // print even numbers
    numbers.stream()
        .filter(n -> n % 2 == 0)  // Predicate<T>: n -> n % 2 == 0
        .forEach(System.out::println);  // Output: 2 4 6

    // lambda expression is used for Predicate interface above
    // the same with anonymous class below;
    numbers.stream()
        .filter(new Predicate<Integer>() {
          @Override
          public boolean test(Integer integer) {
            return integer % 2 == 0;
          }
        })
        .forEach(System.out::println);  // Output: 2 4 6

  }

}
