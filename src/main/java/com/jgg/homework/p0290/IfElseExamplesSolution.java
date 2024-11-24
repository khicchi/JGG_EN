package com.jgg.homework.p0290;

public class IfElseExamplesSolution {

  public static void main(String[] args){

    // TASK-1: Print <Yes> if 21 is divisible by 7 and 3 without remainder,
    //         otherwise print <No>
    int num = 21;
    if (num % 7 == 0 && num % 3 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Initialize <isHungry> as false, print <Hungry> if <isHungry> is true,
    //         otherwise print false
    boolean isHungry = false;
    if (isHungry) {
      System.out.println("Hungry");
    } else {
      System.out.println(false);
    }

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Initialize <c> as 'F', print <GREATER> if <c> is greater than 45,
    //         otherwise print false
    char c = 'F';
    if (c > 45) {
      System.out.println("GREATER");
    } else {
      System.out.println(false);
    }

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

}
