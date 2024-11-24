package com.jgg.lessons.p2790;

  public class InstanceMethodReference {

    public static void main(String[] args) {

      // The printHi() method of an object created from the MyClass class
      // is called with a method reference via the Greeting interface.
      Greeting greeting = new MyClass()::printHi;
      greeting.printGreeting();
    }
  }

  interface Greeting {
    void printGreeting();
  }

  class MyClass {
    public void printHi() {
      System.out.println("Hi!");
    }
  }