package com.jgg.lessons.p2320;

import java.util.InputMismatchException;

public class TryCatchBlock3 {

  public static void main(String[] args){
    multiply(Integer.MAX_VALUE, 2);
  }

  static int multiply(int a, int b) {
    int result = 0;
    try{
      result = Math.multiplyExact(a, b);
    } catch (InputMismatchException ex) {
      System.out.println("InputMismatchException occurred");
    }
    return result;
  }

}
