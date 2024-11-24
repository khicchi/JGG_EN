package com.jgg.lessons.p1500;

  public class SuperRule5 {
    public static void main(String[] args) {
      Dog dog1 = new Dog("Buddy");
      Dog dog2 = new Dog(3);
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
      super(name);
      System.out.println("Dog constructor called");
    }

    Dog(int age) {
      super(age);
      System.out.println("Dog constructor called");
    }
  }