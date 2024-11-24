package com.jgg.homework.p0240;

public class LogicalOperatorsAndSolution {

  public static void main(String[] args){

    // TASK-1:
    int examScore = 70; // John's exam score
    double attendancePercentage = 0.85; // John's attendance percentage
    // Given those above, check whether John passed the course
    // based on his exam score (must be 60 or higher)
    // and attendance (must be at least 80%)
    // Print the result
    boolean hasPassed = examScore >= 60 && attendancePercentage >= 0.80;
    System.out.println("John passed the course: " + hasPassed); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2:
    int age = 20; // John's age
    boolean isCitizen = true; // John's citizenship status
    // Given those above, check whether John can vote
    // (age should be greater than 17, and should be a citizen)
    // Print the result
    boolean canVote = age > 17 && isCitizen;
    System.out.println("John can vote: " + canVote); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3:
    int number = 12;
    // Check if <number> is both even and divisible by 3
    // Print the result
    boolean isEvenAndDivisibleBy3 = number % 2 == 0 && number % 3 == 0;
    System.out.println("Number is even and divisible by 3: " + isEvenAndDivisibleBy3); // true

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4:
    int num1 = 3, num2 = 3, num3 = 3;
    // Check if num1, num2, num3 are all equal to each other
    // Print the result
    boolean areAllEqual = num1 == num2 && num2 == num3;
    System.out.println("All numbers are equal: " + areAllEqual); // true

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5:
    double poolVolume = 200.25;
    double tapVolumePerHour = 23.22;
    // Given the above, check if the pool is full of water
    // after 6 hours of the tap being opened
    // (i.e., check if poolVolume is less than or equal to 6 * tapVolumePerHour)
    // Print the result
    boolean isPoolFull = poolVolume <= 6 * tapVolumePerHour;
    System.out.println("Pool is full after 6 hours: " + isPoolFull); // true

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6:
    // An automatic gear vehicle needs to accelerate the gear
    // when the speed is at least 70, and the gear is 3
    // Given the current gear is 3, and the speed is 70,
    // check if the vehicle needs to accelerate the gear
    // Print the result
    int gear = 3;
    int speed = 70;
    boolean needsToAccelerateGear = gear == 3 && speed >= 70;
    System.out.println("Vehicle needs to accelerate gear: " + needsToAccelerateGear); // true

    System.out.println("************************** TASK 6 FINISHED **************************");

  }

}
