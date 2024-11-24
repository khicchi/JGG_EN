package com.jgg.lessons.p1070;

public class AutoboxingUnboxing {

  public static void main(String[] args){

    // autoboxing: int to Integer
    Integer num = 10;

    // autoboxing: char to Character
    Character character = 'v';

    // unboxing: Integer to int
    int i = num;

    // unboxing: Character to char
    char c = character;

    // autoboxing: double to Double
    Double doubleObj = 2.5;

    // unboxing: Double to double
    double d = Double.valueOf("2.3");

  }

}
