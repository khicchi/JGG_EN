package com.jgg.lessons.p1530;

public class MethodOverridingRules {

  public static void main(String[] args){

  }

}

  class A {
    protected A getObject() {
      return new A();
    }
  }

  class B extends A {
    // doable bec of covariant type
    @Override
    public B getObject() {
      return new B();
    }
  }

  class C extends A {
    // not allowed due to weaker access modifier
    /*@Override
    C getObject() {
      return new C();
    }*/
  }
