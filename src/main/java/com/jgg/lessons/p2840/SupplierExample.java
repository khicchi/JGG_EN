package com.jgg.lessons.p2840;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

  public static void main(String[] args) {

    // Generate 5 random numbers
    Stream.generate(() -> new Random().nextInt(100))
        // Supplier<T>: No input, produces an Integer
        .limit(5)  // Limit to 5 random numbers
        .forEach(System.out::println);
    // Output: Random 5 numbers, e.g., 34, 78, 12, 5, 99

    // below code does the same thing with anonymous class
    Stream.generate(new Supplier<Integer>() {
      @Override
      public Integer get() {
        return new Random().nextInt(100);
      }
    }).limit(5).forEach(num -> System.out.println(num));
    // Output: Random 5 numbers, e.g., 34, 78, 12, 5, 99

  }
}
