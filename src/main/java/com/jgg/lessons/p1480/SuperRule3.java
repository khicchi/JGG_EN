package com.jgg.lessons.p1480;

  public class SuperRule3 {
    public static void main(String[] args) {
      Dog dog = new Dog("Buddy");
    }
  }

  class Animal {
    Animal(String name) {
      System.out.println("Animal constructor called with name: " + name);
    }
  }

  class Dog extends Animal {
    Dog(String name) {
      super(name); // Explicit call to parent constructor
      System.out.println("Dog constructor called");
    }
  }
