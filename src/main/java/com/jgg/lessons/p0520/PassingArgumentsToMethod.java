package com.jgg.lessons.p0520;

public class PassingArgumentsToMethod {

  public static void main(String[] args){

    sum(2, 3); // 2 and 3 are arguments
    sum(5, 6); // 5 and 6 are arguments

    int num1 = 7, num2 = 6;
    sum(num1, num2); // num1 and num2 are arguments

    concat("Hi ", "there!");
    String str1 = "New ", str2 = "Jersey";
    concat(str1, str2);

  }

  // Method with parameter declaration. a and b are parameters
  public static void sum(int a, int b) {
    System.out.println(a + " + " + b + " = " + (a + b));
  }

  public static void concat(String a, String b) {
    System.out.println("\"" + a + "\" concat \"" + b + "\" : " + a + b);
  }

}



