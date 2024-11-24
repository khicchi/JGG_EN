package com.jgg.lessons.p2870;

import java.util.Objects;

public class RecordExample {

}

  record Person(String name, int age) {}

  // below class is the same with above
  /* class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String name() {
      return name;
    }

    public int age() {
      return age;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o;
      return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, age);
    }

    @Override
    public String toString() {
      return "Person[name=" + name + ", age=" + age + "]";
    }
  }*/