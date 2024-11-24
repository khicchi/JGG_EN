package com.jgg.lessons.p2110;

public class PassByValueProofForPrimitives {

  public static void main(String[] args) {
    int x = 10;
    modify(x);
    System.out.println(x); // 10
  }

  public static void modify(int value) {
    value = 20;
  }

}
