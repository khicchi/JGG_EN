package com.jgg.lessons.p0560;

public class MethodOverloading2 {

  public static void main(String[] args){
    int resultInt = sum(2, 3);
    double resultDouble = sum(2.1, 3.1);
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static double sum(double a, double b) {
    return a + b;
    // alternative: return sum(a, b) + c;
  }

}
