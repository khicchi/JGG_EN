package com.jgg.lessons.p0560;

public class MethodOverloading1 {

  public static void main(String[] args){
    int resultTwo = sum(2, 3);
    int resultThree = sum(2, 3, 5);
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
    // alternative: return sum(a, b) + c;
  }

}
