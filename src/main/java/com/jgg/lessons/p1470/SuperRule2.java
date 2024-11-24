package com.jgg.lessons.p1470;

  public class SuperRule2 {
    public static void main(String[] args) {
      Dog dog = new Dog();
      // Prints;
      // Animal constructor called
      // Dog constructor called
    }
  }

  class Animal {
    Animal() {
      super(); // Must be the first statement
      System.out.println("Animal constructor called");
      //super(); // Must be the first statement
    }
  }

  class Dog extends Animal {
    Dog() {
      // There is no explicit call to the superclass constructor
      System.out.println("Dog constructor called");
    }
  }