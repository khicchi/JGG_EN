package com.jgg.lessons.p1040;

public class VariableArguments {

  public static void main(String[] args){
    // Create a method which accepts variable
    // int arguments and returns their sum
    System.out.println(sum(1)); // 1
    System.out.println(sum(1, 2)); // 3
    System.out.println(sum(1, 2, 3)); // 6

    // Call sum method by passing array of ints
    System.out.println(sum(new int[] { 3, 5 })); // 8

    // Create a method which accepts variable int args
    // and a String parameter,
    // and returns <key + (sum of int args)>
    System.out.println(concatSum("Sum", 1, 3));
    // Sum: 4
    System.out.println(concatSum("Total", 2, 3, 5));
    // Total: 10
  }

  public static int sum(int... numbers) {
    int sum = 0;
    for (int number: numbers) {
      sum += number;
    }
    return sum;
  }

  public static String concatSum(String key, int... numbers) {
    return String.format("%s: %s", key, sum(numbers));
  }

}
