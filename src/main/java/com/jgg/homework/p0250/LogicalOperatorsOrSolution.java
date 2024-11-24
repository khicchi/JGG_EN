package com.jgg.homework.p0250;

public class LogicalOperatorsOrSolution {

  public static void main(String[] args){

    // TASK-1: If a number is either divisible by 2 or 5 then it is called WEIRD NUMBER
    //         Check if 542 is a WEIRD NUMBER
    int number = 542;
    boolean isWeirdNumber = (number % 2 == 0) || (number % 5 == 0);
    System.out.println("542 is a WEIRD NUMBER: " + isWeirdNumber); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: My gym offers a discount for ages smaller than 16 or greater than or equal to 61
    //         There is also a discount for all members regardless of age
    //         Check if my uncle John (age: 61) who is also a member deserves a discount
    int johnAge = 61;
    boolean isMember = true;
    boolean deservesDiscount = (johnAge < 16 || johnAge >= 61) || isMember;
    System.out.println("John deserves a discount: " + deservesDiscount); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3:
    boolean areWipersManuallyEnabled = false;
    boolean isWeatherRainy = false;
    // My smart car turns car wipers on if I manually enable them, or if the weather is rainy
    // Check if the car needs to turn the wipers on
    boolean needsWipersOn = areWipersManuallyEnabled || isWeatherRainy;
    System.out.println("Car needs to turn the wipers on: " + needsWipersOn); // false

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4:
    double attendancePercentage = 0.90;
    double examsAverage = 40;
    // John can pass the class if his attendance is above 85% or his exams average is above 60
    // Check if John can pass the class
    boolean canPassClass = attendancePercentage > 0.85 || examsAverage > 60;
    System.out.println("John can pass the class: " + canPassClass); // true

    System.out.println("************************** TASK 4 FINISHED **************************");

  }

}
