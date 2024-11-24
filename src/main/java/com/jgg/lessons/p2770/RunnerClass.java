package com.jgg.lessons.p2770;

  public class RunnerClass {

    public static void main(String[] args) {
      // defining the Greeting interface
      // implementation with lambda expression
      Greeting greeting = () -> System.out.println("Hello!");
      greeting.perform();
    }

  }

  interface Greeting {
    void perform();
  }