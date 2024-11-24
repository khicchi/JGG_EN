package com.jgg.lessons.p0530;

public class TypePromotion {

  public static void main(String[] args){

    byte b1 = 1, b2 = 2;
    short s1 = 1, s2 = 2;
    int i1 = 1, i2 = 2;
    long l1 = 1, l2 = 2;

    sumAll(b1, b2); // Type Promotion
    sumAll(s1, s2); // Type Promotion
    sumAll(i1, i2); // Type Promotion

    sumShort(b1, b2); // Type Promotion
    sumShort(s1, s2); // Type Promotion
    //sumShort(i1, i2); // implicit casting is not possible

  }

  public static void sumAll(float a, float b) {
    System.out.println(a + b);
  }

  public static void sumShort(short a, short b) {
    System.out.println(a + b);
  }

}
