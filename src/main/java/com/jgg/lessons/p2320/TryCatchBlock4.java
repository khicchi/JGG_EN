package com.jgg.lessons.p2320;

public class TryCatchBlock4 {

  public static void main(String[] args){
    multiply(Integer.MAX_VALUE, 2);
  }

  static int multiply(int a, int b) {
    int result = 0;
    try{
      result = Math.multiplyExact(a, b);
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
    return result;
  }

}
