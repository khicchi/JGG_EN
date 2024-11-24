package com.jgg.lessons.p1710;

  public class FinalStaticVariable {
    static final int a = 1; // init immediately
    static final int b; // init in static block

    static {
      b = 2;
    }
  }
