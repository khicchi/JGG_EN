package com.jgg.lessons.p2320;

public class TryCatchBlock2 {

  public static void main(String[] args){
    divide(10,0);
  }

  static int divide(int a, int b) {
    int result = 0;
    try{
      result = a / b;
    } catch (ArithmeticException ex) {
      System.out.println("Divider can not be 0");
    }
    return result;
  }

}
