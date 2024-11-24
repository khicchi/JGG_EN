package com.jgg.lessons.p0550;

public class ReturnValueOfMethod {

  public static void main(String[] args){
    // Create a method which returns the multiplication of two int
    int result = multiply(2, 3);
    System.out.println(result);

    // Create a method which returns the subtraction of two int
    int sub1 = 22, sub2 = 2;
    System.out.println(subtract(sub1, sub2));

    // Create a method which concats three strings
    String concat = concat("I am ", "a ", "hero.");
    System.out.println(concat);

    // using the multiply method, multiply 10, 2, and 3
    int midResult = multiply(10, 2);
    int finalResult = multiply(midResult, 3);
    System.out.println(finalResult);

    // try another way for the last example
    System.out.println(multiply(multiply(10, 2), 3));
  }

  public static int multiply(int a, int b) {
    int result = a * b;
    return result;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static String concat(String a, String b, String c) {
    return a + b + c;
  }

}
