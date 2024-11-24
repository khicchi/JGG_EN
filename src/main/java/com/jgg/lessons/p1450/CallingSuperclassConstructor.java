package com.jgg.lessons.p1450;

  public class CallingSuperclassConstructor {
    public static void main(String[] args) {
      Dog dog = new Dog("Buddy", 5);
      dog.display();
    }
  }

  class Animal {
    String name;

    // Constructor of parent class
    Animal(String name) {
      this.name = name;
    }
  }

  class Dog extends Animal {
    int age;

    // Constructor of child class
    Dog(String name, int age) {
      super(name); // Calling parent class constructor
      this.age = age;
    }

    void display() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    }
  }