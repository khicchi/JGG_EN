package com.jgg.lessons.p1750;

  public class MyParentClass {

    void overridableMethod() {
      // do something
    }

    final void nonOverridableMethod() {
      // do something
    }

  }

  class MySubClass extends MyParentClass {

    @Override
    void overridableMethod() {
      // do something different
    }

    /*@Override
    void nonOverridableMethod() {
      // not doable
    }*/

  }