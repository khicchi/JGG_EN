package com.jgg.homework.p0140;

public class ArithmeticOperatorsSolution {

  public static void main(String[] args){

    // TASK-1: Directly print the result of <15 + 5>
    System.out.println(15 + 5); // 20

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Directly print the result of <10 * 5>
    System.out.println(10 * 5); // 50

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Directly print the result of <10 / 5>
    System.out.println(10 / 5); // 2

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Directly print the result of <10 - 5>
    System.out.println(10 - 5); // 5

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Initialize int <a> as <100>
    //         Initialize int <b> as <50>
    //         Initialize int <c> as <a / b>. Print <c: <c>>
    int a = 100;
    int b = 50;
    int c = a / b;
    System.out.println("c: " + c); // c: 2

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Initialize int <d> as <a + b>. Print <d: <d>>
    int d = a + b;
    System.out.println("d: " + d); // d: 150

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Initialize int <e> as <a - b>. Print <e: <e>>
    int e = a - b;
    System.out.println("e: " + e); // e: 50

    System.out.println("************************** TASK 7 FINISHED **************************");

    // TASK-8: Initialize int <f> as <100>
    //         Re-assign <f> by multiplying it by 5, then print
    int f = 100;
    f = f * 5;
    System.out.println(f); // 500

    System.out.println("************************** TASK 8 FINISHED **************************");

    // TASK-9: Re-assign <f> by dividing it by 20, then print
    f = f / 20;
    System.out.println(f); // 25

    System.out.println("************************** TASK 9 FINISHED **************************");

    // TASK-10: Re-assign <f> with the remainder of division by 3, then print
    f = f % 3;
    System.out.println(f); // 1

    System.out.println("************************** TASK 10 FINISHED **************************");

    // TASK-11: Re-assign <f> by subtracting 300, then print
    f = f - 300;
    System.out.println(f); // -299

    System.out.println("************************** TASK 11 FINISHED **************************");

  }

}
