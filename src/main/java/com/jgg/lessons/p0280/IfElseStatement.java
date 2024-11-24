package com.jgg.lessons.p0280;

public class IfElseStatement {

  public static void main(String[] args){

    // Define <a> as int. Print "<a> is greater than 5" if it is,
    // else print "<a> is not greater than 5" - DEBUG
    int a = 4;
    if (a > 5) {
      System.out.println(a + " is greater than 5"); // not executed
    }
    else {
      System.out.println(a + " is not greater than 5"); // executed
    }

    // I can swim if the sea temp is between 22 and 33 (including 22 and 33)
    // Define temp1 as 22 and print if I can swim,
    // temp2 as 21 and print if I can swim or not // DEBUG
    int minTemp = 22, maxTemp = 33;
    int temp1 = 22, temp2 = 21;

    if (temp1 >= minTemp && temp1 <= maxTemp) {
      System.out.println("I can swim since the temp is " + temp1); // executed
    }
    else {// not executed
      System.out.println("I can not swim since the temp is " + temp1);
    }

    if (temp2 >= minTemp && temp2 <= maxTemp) {// not executed
      System.out.println("I can swim since the temp is " + temp2);
    }
    else  {// executed
      System.out.println("I can not swim since the temp is " + temp2);
    }

  }

}
