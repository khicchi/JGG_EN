package com.jgg.lessons.p1460;

  public class SuperRule1 {
    public static void main(String[] args) {
      Dog dog = new Dog();
      // Prints;
      // Animal constructor called
      // Dog constructor called
    }
  }

  class Animal {
    Animal() {
      System.out.println("Animal constructor called");
    }
  }

  class Dog extends Animal {
    Dog() {
      // There is no explicit call to the superclass constructor
      System.out.println("Dog constructor called");
    }
  }