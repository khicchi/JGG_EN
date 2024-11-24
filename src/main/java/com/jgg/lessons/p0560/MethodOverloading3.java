package com.jgg.lessons.p0560;

public class MethodOverloading3 {

  public static void main(String[] args){
    String concat1 = concat("Concat me", 3);
    String resultDouble = concat(3, "Concat me");
  }

  public static String concat(String a, int b) {
    return a + b;
  }

  public static String concat(int a, String b) {
    return a + b;
  }

}
