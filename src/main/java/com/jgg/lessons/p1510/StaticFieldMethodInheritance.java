package com.jgg.lessons.p1510;

  public class StaticFieldMethodInheritance {
    public static void main(String[] args) {
      // Accessing static field using the subclass
      System.out.println(Child1.staticField); // 10

      // Modifying static field using the subclass
      Child1.staticField = 20;
      System.out.println(Parent.staticField); // 20

      // Modifying static field using another subclass
      Child2.staticField = 40;
      System.out.println(Child1.staticField); // 40

      Child2.staticMethod(); // Static method in Parent
    }
  }

  class Parent {
    static int staticField = 10;

    static void staticMethod() {
      System.out.println("Static method in Parent");
    }
  }

  class Child1 extends Parent { }

  class Child2 extends Parent { }