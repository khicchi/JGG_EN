package com.jgg.lessons.p2740;

  public class LambdaExpressionExamples3 {

    public static void main(String[] args) {
      // Functional Interface implementation with anonymous class
      MyCalculator myCalculator1 = new MyCalculator() {
        @Override
        public int add(int a, int b) {
          return a + b;
        }
      };

      System.out.println(myCalculator1.add(2,3));;

      // Functional Interface implementation with Lambda expression
      MyCalculator myCalculator2 = (a, b) -> a + b;
      System.out.println(myCalculator2.add(2,3));;
    }

  }

  interface MyCalculator {
    int add(int a, int b);
  }
