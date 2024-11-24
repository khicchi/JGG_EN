package com.jgg.lessons.p2820;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExamples1 {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 8, 4, 10);

    // Filter out numbers greater than 5
    List<Integer> filtered = numbers.stream()
        .filter(n -> n > 5)  // Keep numbers > 5 => intermediate operation
        .collect(Collectors.toList());  // => terminal operation

    System.out.println(filtered);  // Output: [6, 8, 10]

    /////////////////////////////////////////////////////////

    List<String> names = Arrays.asList("java", "stream", "api");
    // Convert a list of strings to uppercase

    List<String> uppercased = names.stream()
        .map(String::toUpperCase)  // Convert to uppercase => intermediate operation
        .collect(Collectors.toList()); // => terminal operation

    System.out.println(uppercased);  // Output: [JAVA, STREAM, API]

  }

}
