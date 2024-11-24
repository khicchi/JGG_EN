package com.jgg.lessons.p2760;

  public class RunnerClass {
    public static void main(String[] args) {

      Greeter greeter = new Greeter();

      greeter.greet(new Greeting() {
        // anonymous class implementation
        @Override
        public void perform() {
          System.out.println("Hello world!");
        }
      });

    }
  }

  interface Greeting {
    void perform();
  }

  class Greeter {

    public void greet(Greeting greeting) {
      greeting.perform();
    }
  }
