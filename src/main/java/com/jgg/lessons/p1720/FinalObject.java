package com.jgg.lessons.p1720;

  public class FinalObject {

    public static void main(String[] args){
      final Person person1 = new Person("John");
      person1.name = "Elizabeth"; // doable, name is mutable
      // person1.species = ""; // not doable, species is immutable (final)

      Person person2 = new Person("Joe");
      // person1 = person2; // not doable, person1 is final (immutable)
      person2 = person1; // doable, person2 is not final
    }

  }

  class Person {
    final String species = "Homo sapiens";
    String name;

    Person(String name) {
      this.name = name;
    }
  }
