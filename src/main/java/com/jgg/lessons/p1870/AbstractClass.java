package com.jgg.lessons.p1870;

  public class AbstractClass {

    public static void main(String[] args){
      //MyAbsClass myAbsClass = new MyAbsClass();
      // 'MyAbsClass' is abstract; cannot be instantiated

      MySubClass mySubClass = new MySubClass(); // doable

      MyOtherClass myOtherClass = new MyOtherClass(); // doable
    }

  }

  abstract class MyAbsClass {
    // This class may contain abstract methods
    // This class can live without any abstract methods as well
    // This class can live without being inherited as well
  }

  class MySubClass extends MyAbsClass {
    // This class can not contain abstract methods
  }

  class MyOtherClass {
    // This class can not contain abstract methods
  }