package com.jgg.lessons.p0390;

public class ConditionalStatementsExamples {
  public static void main(String[] args){

    // Given <side1>, <side2>, <side3>, <side4> as int which
    // represents each side of a shape
    // Print SQUARE or RECTANGLE by comparing the sides
    int side1 = 5, side2 = 5, side3 = 7, side4 = 7;

    if (side1 == side2 && side2 == side3 && side3 == side4) {
      System.out.println("SQUARE");
    }
    else if ((side1 == side3 && side2 == side4) ||
                (side1 == side2 && side3 == side4) ||
                  (side1 == side4 && side2 == side3)) {
      System.out.println("RECTANGLE");
    }

    // A student's passing the class depends on the 3 grades.
    // Conditions:
    // If any two grades are C, he/she cannot pass the class.
    // If any two grades are A, he/she passes the class.
    // In all other cases; Those who don't get C pass the class
    char grade1 = 'A', grade2 = 'B', grade3 = 'C';
    int aCount = 0, cCount = 0;

    if (grade1 == 'A') aCount++; if (grade1 == 'C') cCount++;
    if (grade2 == 'A') aCount++; if (grade2 == 'C') cCount++;
    if (grade3 == 'A') aCount++; if (grade3 == 'C') cCount++;

    if (aCount >= 2) {
      System.out.println("PASSED");
    }
    else if (cCount >=2) {
      System.out.println("FAILED");
    }
    else if (cCount != 0) {
      System.out.println("FAILED");
    }
    else {
      System.out.println("PASSED");
    }

  }
}
