package com.jgg.lessons.p1690.pack2;

import com.jgg.lessons.p1690.pack1.Planet;

  public class Mars extends Planet {
    void simpleMethod() {
      // privateInstanceField => not accessible
      // defaultInstanceField => not accessible
      System.out.println(protectedInstanceField);
    }
  }
