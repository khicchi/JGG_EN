package com.jgg.lessons.p0740;

public class StringEquals {

  public static void main(String[] args){

    String helloLiteral1 = "Hello";
    String helloLiteral2 = "Hello";

    // Check if <helloLiteral1> and <helloLiteral2> have the same values
    System.out.println(helloLiteral1.equals(helloLiteral2)); // true

    // Check if <helloLiteral1> and "Hello" have the same values
    System.out.println(helloLiteral1.equals("Hello")); // true

    // Check if <helloLiteral1> and "hello" have the same values
    System.out.println(helloLiteral1.equals("hello")); // false

    // Check if <helloLiteral1> and <helloLiteral2>
    // points to the same memory location // Explain
    System.out.println(helloLiteral1 == helloLiteral2); // true

    // Assign "hi" to <helloLiteral2>, print <helloLiteral1>
    // Explain
    helloLiteral2 = "hi";
    System.out.println("helloLiteral1 = " + helloLiteral1); // Hello

  }
}
