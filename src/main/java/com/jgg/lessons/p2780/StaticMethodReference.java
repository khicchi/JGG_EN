package com.jgg.lessons.p2780;

  public class StaticMethodReference {

    public static void main(String[] args) {
      // printHi() method called via lambda expression
      Thread thread1 = new Thread(() -> MyClass.printHi());
      thread1.start();

      // MyClass.printHi() method called via static method referencing
      Thread thread2 = new Thread(MyClass::printHi);
      thread2.start();
    }

  }

  class MyClass{

    public static void printHi() {
      System.out.println("Hi");
    }
  }