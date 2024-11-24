package com.jgg.homework.p0260;

public class LogicalOperatorsNotSolution {

  public static void main(String[] args){

    // TASK-1:
    final int MAX_LIMIT = 129;
    final int MIN_LIMIT = 118;
    int value = 123;
    boolean isGreaterThanMaxLimit = value > MAX_LIMIT;

    // Initialize <isSmallerThanMaxLimit> by using <isGreaterThanMaxLimit> and print
    boolean isSmallerThanMaxLimit = !isGreaterThanMaxLimit; // Since isSmallerThanMaxLimit is the opposite of isGreaterThanMaxLimit
    System.out.println("isSmallerThanMaxLimit: " + isSmallerThanMaxLimit);

    System.out.println("***************************** TASK-1 FINISHED ********************");

    // TASK-2:
    boolean isSmallerThanMinLimit = value < MIN_LIMIT;

    // Initialize <isGreaterThanMinLimit> by using <isSmallerThanMinLimit>, and print
    boolean isGreaterThanMinLimit = !isSmallerThanMinLimit; // Since isGreaterThanMinLimit is the opposite of isSmallerThanMinLimit
    System.out.println("isGreaterThanMinLimit: " + isGreaterThanMinLimit);

    System.out.println("***************************** TASK-2 FINISHED ********************");

    // TASK-3: Check if the value is inside the given limits by
    // using <isGreaterThanMaxLimit> and <isSmallerThanMinLimit>, and print
    boolean isInsideLimits = !isGreaterThanMaxLimit && !isSmallerThanMinLimit;
    System.out.println("isInsideLimits: " + isInsideLimits);

    System.out.println("***************************** TASK-3 FINISHED ********************");

    // TASK-4:
    boolean isCloudy = true;
    boolean isRainy = false;

    // John wears a jacket if the weather is rainy or if it is not cloudy
    // Check if John needs to wear his jacket by using <isCloudy> and <isRainy>
    boolean needsJacket = isRainy || !isCloudy;
    System.out.println("needsJacket: " + needsJacket);

    System.out.println("***************************** TASK-4 FINISHED ********************");

  }

}
