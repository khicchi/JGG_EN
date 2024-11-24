package com.jgg.lessons.p1780;

  public class MethodHiding {
    public static void main(String[] args){
      SuperClass.method1(); // SuperClass
      SubClass.method1(); // SubClass
      System.out.println(SuperClass.method2()); //1
      System.out.println(SubClass.method2()); //0
    }
  }

  class SuperClass {
    static void method1() {
      System.out.println("SuperClass");
    }

    static long method2() {
      return 1;
    }
  }

  class SubClass {
    static void method1() { // hides super.method1()
      System.out.println("SubClass");
    }

    public static int method2() { // hides super.method2()
      return 0;
    }
  }
