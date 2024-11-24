package com.jgg.lessons.p2730;

  public class CustomFunctionalInterfaceExample1 {

    public static void main(String[] args) {
      // Concrete class usage for interface method
      new MyClass().execute("message to my class");

      // Anonymous class usage for interface method
      new MyCustomInterface() {

        @Override
        public void execute(String message) {
          System.out.println("Anonymous class 1 executes message: " + message);
        }
      }.execute("message to anonymous class 1");

    }

  }