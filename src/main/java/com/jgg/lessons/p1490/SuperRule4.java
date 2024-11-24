package com.jgg.lessons.p1490;

  public class SuperRule4 {
    public static void main(String[] args) {
      Dog dog = new Dog("Buddy");
    }
  }

  class Animal {
    Animal(String name) {
      System.out.println("Animal constructor called with name: " + name);
    }
    Animal(int age) {
      System.out.println("Animal constructor called with age: " + age);
    }
  }

  class Dog extends Animal {
    Dog(String name) {
      super(name); // If commented, code will not compile
      System.out.println("Dog constructor called");
    }
  }
