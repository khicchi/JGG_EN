package com.jgg.lessons.p2800;

  public class ConstructorReference {

    public static void main(String[] args) {

      Greeting greeting = MyClass::new; // Constructor Reference
      greeting.printGreeting(); // invokes MyClass constructor

    }
  }

  interface Greeting {
    void printGreeting();
  }

  class MyClass {
    public MyClass() {
      System.out.println("Hi!");
    }
  }