package com.jgg.lessons.p2820;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamPipelineExamples2 {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    // Find the first element greater than 3

    Optional<Integer> first = numbers.stream()
        .filter(n -> n > 3)  // Find numbers > 3 => intermediate operation
        .findFirst();  // Get the first match => terminal operation

    first.ifPresent(System.out::println);  // Output: 4

    ////////////////////
    // Count the number of even numbers.
    long count = numbers.stream()
        .filter(n -> n % 2 == 0)  // Keep even numbers => intermediate operation
        .count(); // => terminal operation

    System.out.println("Even numbers count: " + count);  // Output: 3

    /////////////////////
    String[] languages = { "Java", "Python", "C++" };
    // Create a stream from an array and print each element.
    Stream.of(languages)
        .forEach(System.out::println); // => terminal operation
    // Output: Java Python C++

  }
}
