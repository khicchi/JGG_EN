package com.jgg.lessons.p2830;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExercises {

  public static void main(String[] args) {

    //empty() - isPresent()
    Optional<String> empty = Optional.empty();
    System.out.println(empty.isPresent()); // false

    //ifPresent()
    List<Integer> numbers = List.of(2, 4, 2, 10, 23);
    Optional<Integer> bigNumber = numbers.stream().filter(x -> x > 6).findFirst();
    bigNumber.ifPresent(System.out::println); // 10

    //get()
    System.out.println(bigNumber.get()); // 10

    //orElse()
    System.out.println(bigNumber.orElse(0)); // 10

    //orElseThrow()
    Integer getOrThrow =
        bigNumber.orElseThrow(()->new NoSuchElementException("element is not found"));
    System.out.println(getOrThrow); // 10

    //of()
    Optional<Integer> intOptional = Optional.of(34);

    //filter() over Optional
    Optional<Integer> evenIntOptional = intOptional.filter(i -> i % 2 == 0);
    System.out.println(evenIntOptional.orElse(0)); // 34

  }

}
