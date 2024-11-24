package com.jgg.lessons.p1920;

  interface Flyable {
    // abstract method
    // no need for abstract keyword
    void fly();
  }

  class Animal { }

  class Bird extends Animal implements Flyable {

    @Override
    public void fly() {
      System.out.println("Bird flies");
    }
  }

  class Plane implements Flyable {

    @Override
    public void fly() {
      System.out.println("Plane flies");
    }
  }