package com.jgg.lessons.p0470;

public class BreakKeyword {

  public static void main(String[] args){

    // Given <speed> is int, increase <speed> by 1 in an infinite for-loop
    // If the speed is above 140, finish the loop
    int speed = 20;
    for( ; true ; speed++) {
      speed++;
      System.out.println("speed = " + speed);
      if (speed > 140) {
        break;
      }
    }

    // Given <temp> as int, decrease the <temp> by 1 in an infinite while loop
    // when the temp is below -20, print "Freezing" and exit the loop
    int temp = 3;
    while (true) {
      temp--;
      System.out.println("temp = " + temp);
      if (temp < -20) {
        System.out.println("Freezing");
        break;
      }
    }

  }

}
