package com.jgg.lessons.p2130;

  public class MethodOverloadingInSubclass {

    public static void main(String[] args) {
      Subclass obj = new Subclass();
      obj.display(10);    // Calls Superclass's display method
      obj.display("Hello"); // Calls Subclass's overloaded display method
    }

  }

  class Superclass {
    void display(int a) {
      System.out.println("Superclass: " + a);
    }
  }

  class Subclass extends Superclass {
    // Overloading the display method inherited from Superclass
    void display(String s) {
      System.out.println("Subclass: " + s);
    }
  }