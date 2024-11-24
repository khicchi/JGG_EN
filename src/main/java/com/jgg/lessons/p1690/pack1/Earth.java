package com.jgg.lessons.p1690.pack1;

  public class Earth extends Planet {
    void simpleMethod() {
      // privateInstanceField => not accessible
      System.out.println(defaultInstanceField);
      System.out.println(protectedInstanceField);
    }
  }
