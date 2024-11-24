package com.jgg.lessons.p2730;

public class CustomFunctionalInterfaceExample2 {

  public static void main(String[] args) {
    // Anonymous class usage for interface method
    // We can assign the anonymous class reference
    MyCustomInterface myCustomInterface = new MyCustomInterface() {

      @Override
      public void execute(String message) {
        System.out.println("Anonymous class 2 executes message: " + message);
      }
    };

    myCustomInterface.execute("message to anonymous class 2");
  }

}
