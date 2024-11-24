package com.jgg.lessons.p1280;

  public class StaticMethod2 {

    public static void main(String[] args){

      Calculations.sum(1,2);
      Calculations.sum(1.2,2.1);
    }

  }

  class Calculations {

    public static int sum(int a, int b) {
      return a + b;
    }

    // overloads sum method
    public static double sum(double a, double b) {
      return a + b;
    }

  }



