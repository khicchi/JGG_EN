package com.jgg.homework.p0270;

public class IfStatement3Solution {

  public static void main(String[] args){

    // TASK: A person is eligible for a driver's license based on the following criteria:
    // The person must be at least 18 years old.
    // Alternatively, if the person is at least 16 years old but has completed a driver's education course,
    // they are also eligible for a license.
    // Given, John is 17 years old, and he has a driver education,
    // Print <John is eligible for a driver's license!> if he is

    int age = 17;
    boolean hasDriverEducation = true;

    if ((age >= 18) || (age >= 16 && hasDriverEducation)) {
      System.out.println("Congratulations! You are eligible for a driver's license.");
    }

  }

}
