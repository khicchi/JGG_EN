package com.jgg.homework.p1050;

public class MathClassSolution {

  public static void main(String[] args) {

    // TASK-1: Calculate 5 raised to the power of 3
    System.out.println("Math.pow(5, 3) = " + Math.pow(5, 3)); // 125.0

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Calculate the square root of 100
    System.out.println("Math.sqrt(100) = " + Math.sqrt(100)); // 10.0

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Area of a circle is calculated like that: π × radius × radius
    // Calculate the area of a circle with radius 5
    // Use pow() method and PI constant from Math class
    int radius = 5;
    double area = Math.PI * Math.pow(radius, 2);
    System.out.println("area = " + area); // 78.53981633974483

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Calculate the closest integer to 4.7
    System.out.println("Math.round(4.7) = " + Math.round(4.7)); // 5

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Round 3.6 downward to the nearest number
    System.out.println("Math.floor(3.6) = " + Math.floor(3.6)); // 3.0

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Round 3.2 upward to the nearest number
    System.out.println("Math.ceil(3.2) = " + Math.ceil(3.2)); // 4.0

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Get the absolute value of -100
    System.out.println("Math.abs(-100) = " + Math.abs(-100)); // 100

    System.out.println("************************** TASK 7 FINISHED **************************");

    // TASK-8: Get the max of 3.4 and 5.1
    System.out.println("Math.max(3.4, 5.1) = " + Math.max(3.4, 5.1)); // 5.1

    System.out.println("************************** TASK 8 FINISHED **************************");
  }
}
