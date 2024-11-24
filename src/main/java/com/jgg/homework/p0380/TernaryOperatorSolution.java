package com.jgg.homework.p0380;

public class TernaryOperatorSolution {

  public static void main(String[] args){

    // TASK-1: Print "I grew up" if age is >= 18, otherwise print "I am still a child".
    //         Use ternary operator
    int age = 17;
    String result = (age >= 18) ? "I grew up" : "I am still a child";
    System.out.println(result);

    // TASK-2: Initialize <gear>
    //         as <5> if speed is greater than 80,
    //         as <4> if speed is greater than 60,
    //         as <3> if speed is greater than 40,
    //         as <2> if speed is greater than 20,
    //         as <1> if speed is smaller or equal to 20, and print <gear>
    //         Use ONLY ternary operator
    int speed = 75;
    int gear = (speed > 80) ? 5 :
        (speed > 60) ? 4 :
            (speed > 40) ? 3 :
                (speed > 20) ? 2 : 1;
    System.out.println("Gear: " + gear);

  }

}
