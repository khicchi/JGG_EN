package com.jgg.lessons.p1900;

  public abstract class SuperAbsClass {
    abstract String getName();

    abstract void printName();
  }

  abstract class SubAbsClass extends SuperAbsClass {
    @Override // does not have to, but implements
    String getName() { return null; }

    abstract void doSomething();
  }

  // Concrete class should implement all abs methods
  class ChildClass extends SubAbsClass {

    @Override
    void printName() { }

    @Override
    void doSomething() { }
  }
