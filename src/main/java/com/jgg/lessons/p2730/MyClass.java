package com.jgg.lessons.p2730;

  // Concrete class implementing MyCustomInterface
  class MyClass implements MyCustomInterface {
    @Override
    public void execute(String message) {
      System.out.println("MyClass executes message: " + message);
    }
  }
