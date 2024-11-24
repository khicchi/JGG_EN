package com.jgg.homework.p0360;

public class SwitchStatement2Solution {

  public static void main(String[] args){

    int dayNumber = 4;

    // TASK: check the <dayNumber> in a switch statement
    // to print the day name and number in this format:
    // Day 3 is Tuesday
    // Print "Invalid day" if <dayNumber> is invalid

    String dayName;

    switch (dayNumber) {
      case 1:
        dayName = "Sunday";
        break;
      case 2:
        dayName = "Monday";
        break;
      case 3:
        dayName = "Tuesday";
        break;
      case 4:
        dayName = "Wednesday";
        break;
      case 5:
        dayName = "Thursday";
        break;
      case 6:
        dayName = "Friday";
        break;
      case 7:
        dayName = "Saturday";
        break;
      default:
        dayName = "Invalid day";
        break;
    }

    System.out.println("Day " + dayNumber + " is " + dayName);
  }

}
