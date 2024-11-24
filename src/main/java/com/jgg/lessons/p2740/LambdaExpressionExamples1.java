package com.jgg.lessons.p2740;

  public class LambdaExpressionExamples1 {

    public static void main(String[] args) {
      // Using a lambda expression to implement the sayHello method
      Greeting greeting = name -> System.out.println("Hello, " + name + "!");

      greeting.sayHello("Alice");  // Output: Hello, Alice!
    }

  }

  @FunctionalInterface
  interface Greeting {
    void sayHello(String name);
  }
