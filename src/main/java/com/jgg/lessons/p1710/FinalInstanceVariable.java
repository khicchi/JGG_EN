package com.jgg.lessons.p1710;

  public class FinalInstanceVariable {
    final int a = 1; // init directly
    final int b; // init in constructor
    final int c; // init in instance block

    {
      c = 2;
    }

    FinalInstanceVariable() {
      b = 3;
    }
  }
