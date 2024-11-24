package com.jgg.lessons.p1440;

  public class AccessingParentClassFields {

    public static void main(String[] args) {
      Dog dog = new Dog();
      dog.display();
    }

  }

  class Animal {
    String name = "Animal";

    void display() {
      System.out.println("This is an animal.");
    }
  }

  class Dog extends Animal {
    String name = "Dog";

    void display() {
      System.out.println("Name: " + name);
      System.out.println("Parent Name: " + super.name);
      super.display(); // Calling parent class method
      System.out.println("This is a dog.");
    }
  }
