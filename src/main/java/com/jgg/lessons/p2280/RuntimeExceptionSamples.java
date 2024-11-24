package com.jgg.lessons.p2280;

public class RuntimeExceptionSamples {

  public static void main(String[] args){
    // nullPointerExceptionSample();
    // arrayIndexOutOfBoundsExceptionSample();
    // arithmeticExceptionSample();
  }

  static void nullPointerExceptionSample() {
    String str = "something";
    str = null;
    str = str.toUpperCase(); // throws NullPointerException
  }

  static void arrayIndexOutOfBoundsExceptionSample() {
    int[] intArr = new int[2];
    System.out.println(intArr[2]); // throws ArrayIndexOutOfBoundsException
  }

  static void arithmeticExceptionSample() {
    int a = 10/ 0; // throws ArithmeticException
  }

}
