package com.jgg.homework.p0310;

public class IfElseIfElseExamples2Solution {

  public static void main(String[] args){

    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    // TASK: Given side1, side2, side3 as int for a triangle
    //       If all sides are equal, then print "Equilateral triangle"
    //       If only two sides are equal, then print "Isosceles triangle"
    //       Otherwise print "Scalene triangle"

    if (side1 == side2 && side2 == side3) {
      System.out.println("Equilateral triangle");
    } else if (side1 == side2 || side1 == side3 || side2 == side3) {
      System.out.println("Isosceles triangle");
    } else {
      System.out.println("Scalene triangle");
    }

  }

}
