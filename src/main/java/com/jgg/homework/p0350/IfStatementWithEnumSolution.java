package com.jgg.homework.p0350;

public class IfStatementWithEnumSolution {

  public static void main(String[] args){
    // TASK-1: Define an enum for months

    // TASK-2: Create a month enum variable as NOVEMBER
    Month month = Month.NOVEMBER;

    // TASK-3: Print <It is not January!> by checking the enum variable if it is not JANUARY
    if (month != Month.JANUARY) {
      System.out.println("It is not January!");
    }
  }

}

// TASK-1: Define an enum for months
enum Month {
  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}