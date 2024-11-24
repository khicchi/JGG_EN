package com.jgg.lessons.p1770;

  public class HidingVariables {
    private static int b = 4;

    public static void main(String[] args){
      System.out.println(b); // 4

      // hides b above
      int b = 3;
      System.out.println(b); // 3

      System.out.println(new SuperClass().a); // 2
      System.out.println(new SubClass().a); // 1
    }
  }

  class SuperClass {
    public int a = 2;
  }

  class SubClass extends SuperClass {
    // hides super.a
    public int a = 1;
  }
