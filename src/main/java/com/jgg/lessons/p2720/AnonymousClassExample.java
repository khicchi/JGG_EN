package com.jgg.lessons.p2720;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

  public class AnonymousClassExample {

    public static void main(String[] args) {
      // Create a list of Person objects
      List<Person> people = new ArrayList<>();
      people.add(new Person("Alice", 30));
      people.add(new Person("Bob", 25));
      people.add(new Person("Charlie", 35));

      // Sort the list using an anonymous class for Comparator
      Collections.sort(people, new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
          // Sort by age in ascending order
          return Integer.compare(p1.getAge(), p2.getAge());
        }
      });

      // Display the sorted list
      System.out.println("People sorted by age:");
      for (Person person : people) {
        System.out.println(person);
      }
    }

  }

  @AllArgsConstructor
  @Getter
  @ToString
  class Person {
    private String name;
    private int age;
  }
