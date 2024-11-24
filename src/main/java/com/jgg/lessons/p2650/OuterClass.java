package com.jgg.lessons.p2650;

  public class OuterClass {
    public String strInstance;
    public static String strStatic;

    // Static Nested Class
    public static class StaticNestedClass {
      public String someFieldInstance;
      public static String someFieldStatic;

      public void display() {
        // strInstance // can not access outer class instance members
        // can access outer class static members
        System.out.println(strStatic);

        System.out.println("This is a static nested class.");
      }

    }

    public static void main(String[] args) {
      // Creating an instance of the static nested class
      OuterClass.StaticNestedClass nestedObject =
                                  new OuterClass.StaticNestedClass();
      nestedObject.display();
    }

  }
