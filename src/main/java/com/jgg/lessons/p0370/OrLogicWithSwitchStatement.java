package com.jgg.lessons.p0370;

public class OrLogicWithSwitchStatement {

  public static void main(String[] args){

    // Define <grade> as char (can be A, B, C, D, E)
    // Print PASSED for A or B or C, FAILED for D and E
    // Print INVALID if <grade> is invalid. Use switch block
    String grade = "B";

    switch (grade) {
      case "A": case "B": case "C":
        System.out.println("PASSED");
        break;
      case "D": case "E":
        System.out.println("FAILED");
        break;
      default:
        System.out.println("INVALID");
    }

    // Define <discount> as double and <age> as int.
    // Set discount to 0.5 if age is 70 or 71
    // Set discount to 0.05 if age is 17
    // Set discount to 0 for all other cases
    // Print <Your discount is <discount> for age <age>>
    int age = 17;
    double discount = 0;

    switch (age) {
      case 70: case 71:
        discount = 0.5;
        break;
      case 17:
        discount = 0.05;
        break;
    }

    System.out.println("Your discount is " + discount + " for age " + age);

  }

}
