package com.jgg.homework.p0600;

public class CreatingObject3Solution {

  public static void main(String[] args){

    // TASK: Create MyMath class
    //       Create a calculateAverage() instance method which takes 3 int parameters
    //       and returns the average of thm as int
    //       Create a MyMath object as <myMath>
    //       Call calculateAverage() method and pass 3 positive int values,
    //       then print the return value
    MyMath myMath = new MyMath();
    System.out.println(
        "myMath.calculateAverage(40, 70, 50) = " + myMath.calculateAverage(40, 70, 50));

  }

}

class MyMath {

  int calculateAverage(int a, int b, int c) {
    return (a + b + c) / 3;
  }
}

