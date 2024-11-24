package com.jgg.lessons.p2750.pack1;

  public class RunnerClass {

    public static void main(String[] args) {
      Greeter greeter = new Greeter();
      // Behaviour Parameterization
      greeter.greet(new HelloGreeting());
    }
  }

  interface Greeting {
    void perform();
  }

  class HelloGreeting implements Greeting {
    @Override
    public void perform() {
      System.out.println("Hello world!");
    }
  }

  class Greeter {
    public void greet(Greeting greeting) {
      greeting.perform();
    }
  }
