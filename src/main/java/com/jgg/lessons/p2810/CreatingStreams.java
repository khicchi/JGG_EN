package com.jgg.lessons.p2810;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

  public static void main(String[] args) {

    // Stream of Collection
    List<String> collection = Arrays.asList("John", "Barry", "Chris");
    Stream<String> streamOfCollection = collection.stream();

    // Stream of Array
    String [] names = {"John", "Barry", "Chris"};
    Stream<String> streamOfArray = Arrays.stream(names);
    //OR
    Stream<String> streamOfArrayWithSpecifiedIndex = Arrays.stream(names, 0, 2);
    //This stream will just have John and Barry as elements.

    // Stream of String Values
    Stream<String> streamOfStringValues = Stream.of("John", "Barry", "Chris");

    // Stream of Integer Values
    Stream<Integer> streamOfIntegerValues = Stream.of(3, 5, 7);

  }
}
