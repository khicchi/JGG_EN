package com.jgg.lessons.p2670;

  public class OuterClass {
    private String strInstance;
    private static String strStatic;

    // Inner Class (Non-Static)
    class InnerClass {

      public void display() {
        // can access outer class instance fields
        System.out.println(strInstance);

        // can access outer class static fields
        System.out.println(strStatic);

        System.out.println("This is a non-static inner class.");
      }
    }

    public static void main(String[] args) {
      // not doable. needs an instance of the outer class
      //OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

      // inner class instance through outer class instance
      OuterClass outerClass = new OuterClass();
      OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }
  }
