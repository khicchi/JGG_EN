package com.jgg.lessons.p2340;

public class ThrowClause {

  public static void main(String[] args){

    checkAge(15);

    checkName("");
  }

  static boolean checkAge(int age) {
    if (age < 18) {
      throw new IllegalArgumentException("Age can not be smaller than 18");
    }

    return true;
  }

  static boolean checkName(String name) {
    if (name == null || name.isBlank()) {
      throw new RuntimeException("Provided name is not permitted.");
    }

    return true;
  }

}
