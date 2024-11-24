package com.jgg.homework.p0190;

public class UnaryOperatorsSolution {

  public static void main(String[] args){

    // TASK-1: Initialize <a> as int, print its value.
    //         Use the (++) unary operator to increase its value and print the new value
    int a = 10;
    System.out.println(a); // 10
    a++;
    System.out.println(a); // 11

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Initialize <b> as short, print its value.
    //         Use the (--) unary operator to decrease its value and print the new value
    short b = 20;
    System.out.println(b); // 20
    b--;
    System.out.println(b); // 19

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Print the value of <a++>
    System.out.println(a++); // 11
    System.out.println(a); // 12

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Print the value of <b-->
    System.out.println(b--); // 19
    System.out.println(b); // 18

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Initialize <c> as int, print the value of <++a>
    int c = ++a;
    System.out.println(c); // 13

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Initialize <d> as int, print the value of <a++>
    int d = a++;
    System.out.println(d); // 13
    System.out.println(a); // 14

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Initialize <e> as int, print the value of <--a>
    int e = --a;
    System.out.println(e); // 13

    System.out.println("************************** TASK 7 FINISHED **************************");

    // TASK-8: Initialize <f> as int, print the value of <a-->
    int f = a--;
    System.out.println(f); // 13
    System.out.println(a); // 12

    System.out.println("************************** TASK 8 FINISHED **************************");

    // TASK-9: Initialize <g> as int, and <h> as int
    //         with the value of <g + 1>, and print <h>
    int g = 5;
    int h = g + 1;
    System.out.println(h); // 6

    System.out.println("************************** TASK 9 FINISHED **************************");

    // TASK-10: Negate a true boolean variable and print the result
    boolean boolVar = true;
    System.out.println(!boolVar); // false

    System.out.println("************************** TASK 10 FINISHED **************************");

  }

}
