package com.jgg.homework.p0270;

public class IfStatement2Solution {

  public static void main(String[] args){

    // TASK: A student is eligible for a scholarship based on the following criteria
    //       The student's GPA must be 3.5 or higher. AND The student must have completed at least 12 credit hours.
    //       Alternatively, if the student's GPA is 3.0 or higher, and they have completed at least 24 credit hours,
    //       they are also eligible for the scholarship.
    //       Print <Congrats!> if John is eligible for the scholarship
    double gpa = 3.6; // John's GPA
    int creditHours = 18; // John's credit hours

    if ((gpa >= 3.5 && creditHours >= 12) || (gpa >= 3.0 && creditHours >= 24)) {
      System.out.println("Congratulations! You are eligible for the scholarship.");
    }

  }

}
