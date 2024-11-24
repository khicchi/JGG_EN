package com.jgg.lessons.p2740;

  public class LambdaExpressionExamples2 {

    public static void main(String[] args) {
      // No need for return statement in single line implementations
      // No need for {} in single line implementations
      MyMath myMath1 = text -> text.length();
      System.out.println(myMath1.getLength("hi"));

      // The same as above but no need for ()
      MyMath myMath2 = (text -> text.length());
      System.out.println(myMath2.getLength("hi"));

    }

  }

  @FunctionalInterface
  interface MyMath {
    int getLength(String text);
  }
