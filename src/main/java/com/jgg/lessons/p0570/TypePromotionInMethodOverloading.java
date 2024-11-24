package com.jgg.lessons.p0570;

public class TypePromotionInMethodOverloading {

  public static void main(String[] args){

    // Ex1
    int sum1 = sum(1,2); // Calls sum(int, int)

    // Ex2
    double sum2 = sum(5.5, 3.5); // Calls sum(double, double)

    // Ex3
    double sum3 = sum(5, 3.5); // Calls sum(double, double)
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static double sum(double a, double b) {
    return a + b;
  }

}
