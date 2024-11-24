package com.jgg.homework.p0270;

public class IfStatement4Solution {

  public static void main(String[] args){

    // TASK-4: A person is eligible for a discount at a store based on the following criteria:
    //         The person must be a student. AND The person must be aged between 18 and 24 (inclusive).
    //         Alternatively, if the person is a senior citizen (aged 65 or older) or a military veteran,
    //         they are also eligible for the discount.
    //         Given that Jane is a student, and he is 20 years old, not a veteran though :)
    //         Print <Jane is eligible for the discount> if she is

    boolean isStudent = true;
    int age = 20;
    boolean isSeniorCitizen = false;
    boolean isMilitaryVeteran = true;

    if ((isStudent && age >= 18 && age <= 24) || isSeniorCitizen || isMilitaryVeteran) {
      System.out.println("Congratulations! You are eligible for a discount.");
    } else {
      System.out.println("Sorry, you are not eligible for a discount.");
    }

  }

}
