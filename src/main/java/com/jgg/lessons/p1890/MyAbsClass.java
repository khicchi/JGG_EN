package com.jgg.lessons.p1890;

  public abstract class MyAbsClass {
      abstract String getName();

      abstract void printName();
  }

  class Child extends MyAbsClass {

    @Override
    String getName() { return null; }

    @Override
    void printName() { }
  }

  class GrandChild extends Child {

  }
