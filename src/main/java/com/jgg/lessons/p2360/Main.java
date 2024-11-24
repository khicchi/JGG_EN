package com.jgg.lessons.p2360;

public class Main {

  public static void main(String[] args) throws RestrictedAgeException {
    checkAge(10);
  }

  static void checkAge(int age) throws RestrictedAgeException {
    if (age < 18) {
      throw new RestrictedAgeException();
    }
  }
}
