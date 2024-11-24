package com.jgg.lessons.p2060;

public class PolymorphismViaSuperClass1 {

  public static void main(String[] args){
    // Regular object creation
    A a = new A();
    B b = new B();
    C c = new C();

    a.methodX(); // a object can access A class methods
    b.methodX(); // b object can access B class methods
    c.methodX(); // c object can access C class methods

    // Polymorphic object creation
    A bPolymorphic = new B();
    A cPolymorphic = new C();

    bPolymorphic.methodX(); // Method X from Class B
    cPolymorphic.methodX(); // Method X from Class C
  }

}

  class A {
    void methodX() {
      System.out.println("Method X from Class A");
    }
  }

  class B extends A {
    void methodX() {
      System.out.println("Method X from Class B");
    }
  }

  class C extends A {
    void methodX() {
      System.out.println("Method X from Class C");
    }
  }
