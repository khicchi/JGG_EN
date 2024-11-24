package com.jgg.lessons.p0270;

public class IfStatement {

  public static void main(String[] args){
    // Print "Hello" before a true evaluated if statement,
    // Print "If block is being executed" inside the if statement and
    // Print "Bye" when the if block is left
    System.out.println("Hello"); // executed
    if (true) {
      System.out.println("If block is being executed"); // executed
    }
    System.out.println("Bye"); // executed

    // Define <a> as int. Print "<a> is greater than 5" if it is - DEBUG
    int a = 22;
    if (a > 5) {
      System.out.println(a + " is greater than 5"); // executed
    }

    // Define <b> as int. Print "<b> is smaller than 15 and greater than 10" if so
    int max = 15, min = 10; // DEBUG
    int target = 6;
    if (target > 10 && target < 15) {//not executed
      System.out.println(target + " is smaller than 15 and greater than 10");
    }

    // I can swim if the sea temp is between 22 and 33 (including 22 and 33)
    // Define temp1 as 22 and print if I can swim, temp2 as 21 and print if I can
    int minTemp = 22, maxTemp = 33;
    int temp1 = 22, temp2 = 21; // DEBUG

    if (temp1 >= minTemp && temp1 <= maxTemp) {
      System.out.println("I can swim since the temp is " + temp1);// executed
    }

    if (temp2 >= minTemp && temp2 <= maxTemp) {
      System.out.println("I can swim since the temp is " + temp2);//not executed
    }
  }

}
