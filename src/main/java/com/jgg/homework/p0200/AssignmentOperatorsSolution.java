package com.jgg.homework.p0200;

public class AssignmentOperatorsSolution {

  public static void main(String[] args){

    // TASK-1: Initialize <a> as double with the value of <20>.
    //         Re-assign it by adding 3 to itself using the assignment operator,
    //         and print the result
    double a = 20;
    a += 3;
    System.out.println(a); // 23.0

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Re-assign <a> by subtracting 13 from itself using the assignment operator,
    //         and print the result
    a -= 13;
    System.out.println(a); // 10.0

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Re-assign <a> by multiplying it by 20 using the assignment operator,
    //         and print the result
    a *= 20;
    System.out.println(a); // 200.0

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Re-assign <a> by dividing it by 3 using the assignment operator,
    //         and print the result
    a /= 3;
    System.out.println(a); // 66.66666666666667

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Re-assign <a> with the remainder of division by 4 using the assignment operator,
    //         and print the result
    a %= 4;
    System.out.println(a); // 2.666666666666671

    System.out.println("************************** TASK 5 FINISHED **************************");

  }

}
